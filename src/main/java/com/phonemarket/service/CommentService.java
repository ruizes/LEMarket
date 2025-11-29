package com.phonemarket.service;

import java.util.List;

import com.phonemarket.entity.Comment;

public interface CommentService {
    Comment findCommentById(Integer id);
    Integer addComment(Comment comment);
    Integer deleteComment(Integer id);
    Integer updateComment(Comment comment);
    List<Comment> findCommentByPostId(Integer postId);
    List<Comment> findCommentByUserId(Integer userId);
}
