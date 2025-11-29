package com.phonemarket.service;

import java.util.List;

import com.phonemarket.entity.Post;

public interface PostService {
    Post findPostById(Integer id);
    Integer addPost(Post post);
    Integer deletePost(Integer id);
    Integer updatePost(Post post);
    List<Post> findAllPost();
    List<Post> findPostByUserId(Integer userId);
    List<Post> findPostByType(Integer postType);
    List<Post> findPostLikeTitleOrContent(String keyword);
    Integer updatePostLikeCount(Integer postId, Integer likeCount);
    
    // 点赞相关方法
    Integer likePost(Integer postId, Integer userId);
    Integer unlikePost(Integer postId, Integer userId);
    Boolean isLiked(Integer postId, Integer userId);
    Integer getPostLikeCount(Integer postId);
}
