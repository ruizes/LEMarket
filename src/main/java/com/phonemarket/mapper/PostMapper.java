package com.phonemarket.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.phonemarket.entity.Post;

@Repository
public interface PostMapper {
    Post findPostById(Integer id);
    Integer addPost(Post post);
    Integer deletePost(Integer id);
    Integer updatePost(Post post);
    List<Post> findAllPost();
    List<Post> findPostByUserId(Integer userId);
    List<Post> findPostByType(Integer postType);
    List<Post> findPostLikeTitleOrContent(String keyword);
    Integer updatePostLikeCount(Integer postId, Integer likeCount);
}
