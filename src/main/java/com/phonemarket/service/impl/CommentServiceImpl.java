package com.phonemarket.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phonemarket.entity.Comment;
import com.phonemarket.mapper.CommentMapper;
import com.phonemarket.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public Comment findCommentById(Integer id) {
        return commentMapper.findCommentById(id);
    }

    @Override
    public Integer addComment(Comment comment) {
        return commentMapper.addComment(comment);
    }

    @Override
    public Integer deleteComment(Integer id) {
        return commentMapper.deleteComment(id);
    }

    @Override
    public Integer updateComment(Comment comment) {
        return commentMapper.updateComment(comment);
    }

    @Override
    public List<Comment> findCommentByPostId(Integer postId) {
        return commentMapper.findCommentByPostId(postId);
    }

    @Override
    public List<Comment> findCommentByUserId(Integer userId) {
        return commentMapper.findCommentByUserId(userId);
    }
}
