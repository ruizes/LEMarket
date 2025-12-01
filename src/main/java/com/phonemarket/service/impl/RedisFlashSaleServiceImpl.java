package com.phonemarket.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phonemarket.entity.Goods;
import com.phonemarket.service.IRedisFlashSaleService;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Service
public class RedisFlashSaleServiceImpl implements IRedisFlashSaleService {

    @Autowired
    private JedisPool jedisPool;
    
    private static final String FLASH_SALE_KEY_PREFIX = "flash_sale:";
    private static final String USER_SECKILL_KEY_PREFIX = "user_seckill:";

    @Override
    public void initFlashSaleGoods(Goods goods) {
        try (Jedis jedis = jedisPool.getResource()) {
            String key = FLASH_SALE_KEY_PREFIX + goods.getGoodsId();
            jedis.set(key, String.valueOf(goods.getFlashSaleStock()));
            jedis.expireAt(key, goods.getFlashSaleEndTime().getTime() / 1000);
        }
    }

    @Override
    public boolean canSeckill(Integer goodsId, Integer userId) {
        try (Jedis jedis = jedisPool.getResource()) {
            String userKey = USER_SECKILL_KEY_PREFIX + userId + ":" + goodsId;
            return jedis.exists(userKey) ? false : true;
        }
    }

    @Override
    public boolean seckill(Integer goodsId, Integer userId) {
        try (Jedis jedis = jedisPool.getResource()) {
            String key = FLASH_SALE_KEY_PREFIX + goodsId;
            // 检查库存
            String stockStr = jedis.get(key);
            if (stockStr == null) {
                // 秒杀未开始或已结束
                return false;
            }
            int stock = Integer.parseInt(stockStr);
            if (stock <= 0) {
                // 库存不足
                return false;
            }
            
            // 减库存
            jedis.decr(key);
            
            // 记录用户秒杀成功
            String userKey = USER_SECKILL_KEY_PREFIX + userId + ":" + goodsId;
            jedis.setex(userKey, 3600, "1"); // 1小时过期
            
            return true;
        }
    }

    @Override
    public Integer getFlashSaleStock(Integer goodsId) {
        try (Jedis jedis = jedisPool.getResource()) {
            String key = FLASH_SALE_KEY_PREFIX + goodsId;
            String stockStr = jedis.get(key);
            return stockStr != null ? Integer.parseInt(stockStr) : 0;
        }
    }

    @Override
    public void endFlashSale(Integer goodsId) {
        try (Jedis jedis = jedisPool.getResource()) {
            String key = FLASH_SALE_KEY_PREFIX + goodsId;
            jedis.del(key);
        }
    }
}
