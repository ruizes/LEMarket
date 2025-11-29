package com.phonemarket.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Post implements Serializable {
    private Integer postId;
    private Users postUser;
    private String postTitle;
    private String postContent;
    private Date postDate;
    private Integer postType;
    private Integer postState;
    private Integer postLikeCount;
    private List<Comment> commentList;
    private List<Like> likeList;

    public Post() {
        super();
    }

    public Post(Integer postId, Users postUser, String postTitle, String postContent, Date postDate, Integer postType, Integer postState, Integer postLikeCount, List<Comment> commentList, List<Like> likeList) {
        super();
        this.postId = postId;
        this.postUser = postUser;
        this.postTitle = postTitle;
        this.postContent = postContent;
        this.postDate = postDate;
        this.postType = postType;
        this.postState = postState;
        this.postLikeCount = postLikeCount;
        this.commentList = commentList;
        this.likeList = likeList;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Users getPostUser() {
        return postUser;
    }

    public void setPostUser(Users postUser) {
        this.postUser = postUser;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public Integer getPostType() {
        return postType;
    }

    public void setPostType(Integer postType) {
        this.postType = postType;
    }

    public Integer getPostState() {
        return postState;
    }

    public void setPostState(Integer postState) {
        this.postState = postState;
    }

    public Integer getPostLikeCount() {
        return postLikeCount;
    }

    public void setPostLikeCount(Integer postLikeCount) {
        this.postLikeCount = postLikeCount;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public List<Like> getLikeList() {
        return likeList;
    }

    public void setLikeList(List<Like> likeList) {
        this.likeList = likeList;
    }
}
