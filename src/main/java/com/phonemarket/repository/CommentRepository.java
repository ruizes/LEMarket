package com.phonemarket.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phonemarket.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
    // 根据帖子ID查询评论
    List<Comment> findByCommentPostPostId(Integer postId);
    
    // 根据用户ID查询评论
    List<Comment> findByCommentUserUserId(Integer userId);
    
    // 根据评论状态查询评论
    List<Comment> findByCommentState(Integer commentState);
    
    // 重写findOne方法
    @Override
    Comment findOne(Integer id);
    
    // 重写delete方法
    @Override
    void delete(Integer id);
}
