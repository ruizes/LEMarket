package com.phonemarket.entity;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {
    private Integer commentId;
    private Post commentPost;
    private Users commentUser;
    private String commentContent;
    private Date commentDate;
    private Integer commentState;

    public Comment() {
        super();
    }

    public Comment(Integer commentId, Post commentPost, Users commentUser, String commentContent, Date commentDate, Integer commentState) {
        super();
        this.commentId = commentId;
        this.commentPost = commentPost;
        this.commentUser = commentUser;
        this.commentContent = commentContent;
        this.commentDate = commentDate;
        this.commentState = commentState;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Post getCommentPost() {
        return commentPost;
    }

    public void setCommentPost(Post commentPost) {
        this.commentPost = commentPost;
    }

    public Users getCommentUser() {
        return commentUser;
    }

    public void setCommentUser(Users commentUser) {
        this.commentUser = commentUser;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public Integer getCommentState() {
        return commentState;
    }

    public void setCommentState(Integer commentState) {
        this.commentState = commentState;
    }
}
