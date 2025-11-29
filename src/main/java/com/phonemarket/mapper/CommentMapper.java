package com.phonemarket.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.phonemarket.entity.Comment;

@Repository
public interface CommentMapper {
    Comment findCommentById(Integer id);
    Integer addComment(Comment comment);
    Integer deleteComment(Integer id);
    Integer updateComment(Comment comment);
    List<Comment> findCommentByPostId(Integer postId);
    List<Comment> findCommentByUserId(Integer userId);
}
