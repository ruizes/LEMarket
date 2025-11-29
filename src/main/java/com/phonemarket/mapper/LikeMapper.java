package com.phonemarket.mapper;

import org.springframework.stereotype.Repository;

import com.phonemarket.entity.Like;

@Repository
public interface LikeMapper {
    Like findLikeById(Integer id);
    Integer addLike(Like like);
    Integer deleteLike(Integer id);
    Integer updateLike(Like like);
    Like findLikeByPostIdAndUserId(Integer postId, Integer userId);
    Integer countLikeByPostId(Integer postId);
}
