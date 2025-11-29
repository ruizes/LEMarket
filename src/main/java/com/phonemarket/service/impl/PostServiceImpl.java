package com.phonemarket.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phonemarket.entity.Post;
import com.phonemarket.entity.Like;
import com.phonemarket.mapper.PostMapper;
import com.phonemarket.mapper.LikeMapper;
import com.phonemarket.service.PostService;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostMapper postMapper;
    
    @Autowired
    private LikeMapper likeMapper;

    @Override
    public Post findPostById(Integer id) {
        return postMapper.findPostById(id);
    }

    @Override
    public Integer addPost(Post post) {
        return postMapper.addPost(post);
    }

    @Override
    public Integer deletePost(Integer id) {
        return postMapper.deletePost(id);
    }

    @Override
    public Integer updatePost(Post post) {
        return postMapper.updatePost(post);
    }

    @Override
    public List<Post> findAllPost() {
        return postMapper.findAllPost();
    }

    @Override
    public List<Post> findPostByUserId(Integer userId) {
        return postMapper.findPostByUserId(userId);
    }

    @Override
    public List<Post> findPostByType(Integer postType) {
        return postMapper.findPostByType(postType);
    }

    @Override
    public List<Post> findPostLikeTitleOrContent(String keyword) {
        return postMapper.findPostLikeTitleOrContent(keyword);
    }

    @Override
    public Integer updatePostLikeCount(Integer postId, Integer likeCount) {
        return postMapper.updatePostLikeCount(postId, likeCount);
    }

    @Override
    public Integer likePost(Integer postId, Integer userId) {
        // 检查用户是否已经点赞
        Like like = likeMapper.findLikeByPostIdAndUserId(postId, userId);
        if (like != null) {
            // 如果已经点赞，返回0表示不需要重复点赞
            return 0;
        }
        
        // 创建点赞记录
        Like newLike = new Like();
        Post post = new Post();
        post.setPostId(postId);
        newLike.setLikePost(post);
        com.phonemarket.entity.Users user = new com.phonemarket.entity.Users();
        user.setUserId(userId);
        newLike.setLikeUser(user);
        newLike.setLikeState(1);
        
        // 添加点赞记录
        Integer result = likeMapper.addLike(newLike);
        
        // 更新帖子点赞数
        if (result > 0) {
            Integer likeCount = likeMapper.countLikeByPostId(postId);
            postMapper.updatePostLikeCount(postId, likeCount);
        }
        
        return result;
    }

    @Override
    public Integer unlikePost(Integer postId, Integer userId) {
        // 检查用户是否已经点赞
        Like like = likeMapper.findLikeByPostIdAndUserId(postId, userId);
        if (like == null) {
            // 如果没有点赞，返回0表示不需要取消点赞
            return 0;
        }
        
        // 删除点赞记录
        Integer result = likeMapper.deleteLike(like.getLikeId());
        
        // 更新帖子点赞数
        if (result > 0) {
            Integer likeCount = likeMapper.countLikeByPostId(postId);
            postMapper.updatePostLikeCount(postId, likeCount);
        }
        
        return result;
    }

    @Override
    public Boolean isLiked(Integer postId, Integer userId) {
        Like like = likeMapper.findLikeByPostIdAndUserId(postId, userId);
        return like != null;
    }

    @Override
    public Integer getPostLikeCount(Integer postId) {
        return likeMapper.countLikeByPostId(postId);
    }
}
