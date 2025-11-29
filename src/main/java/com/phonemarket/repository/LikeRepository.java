package com.phonemarket.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.phonemarket.entity.Like;

@Repository
public interface LikeRepository extends JpaRepository<Like, Integer> {
    // 根据帖子ID和用户ID查询点赞
    Like findByLikePostPostIdAndLikeUserUserId(Integer postId, Integer userId);
    
    // 根据帖子ID查询点赞
    List<Like> findByLikePostPostId(Integer postId);
    
    // 根据用户ID查询点赞
    List<Like> findByLikeUserUserId(Integer userId);
    
    // 根据点赞状态查询点赞
    List<Like> findByLikeState(Integer likeState);
    
    // 统计帖子点赞数
    @Query("SELECT COUNT(l) FROM Like l WHERE l.likePost.postId = :postId AND l.likeState = 1")
    Integer countByPostId(@Param("postId") Integer postId);
    
    // 重写findOne方法
    @Override
    Like findOne(Integer id);
    
    // 重写delete方法
    @Override
    void delete(Integer id);
}
