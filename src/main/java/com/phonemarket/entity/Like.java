package com.phonemarket.entity;

import java.io.Serializable;

public class Like implements Serializable {
    private Integer likeId;
    private Post likePost;
    private Users likeUser;
    private Integer likeState;

    public Like() {
        super();
    }

    public Like(Integer likeId, Post likePost, Users likeUser, Integer likeState) {
        super();
        this.likeId = likeId;
        this.likePost = likePost;
        this.likeUser = likeUser;
        this.likeState = likeState;
    }

    public Integer getLikeId() {
        return likeId;
    }

    public void setLikeId(Integer likeId) {
        this.likeId = likeId;
    }

    public Post getLikePost() {
        return likePost;
    }

    public void setLikePost(Post likePost) {
        this.likePost = likePost;
    }

    public Users getLikeUser() {
        return likeUser;
    }

    public void setLikeUser(Users likeUser) {
        this.likeUser = likeUser;
    }

    public Integer getLikeState() {
        return likeState;
    }

    public void setLikeState(Integer likeState) {
        this.likeState = likeState;
    }
}
