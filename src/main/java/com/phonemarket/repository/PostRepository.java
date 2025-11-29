package com.phonemarket.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.phonemarket.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
    // 根据用户ID查询帖子
    List<Post> findByPostUserUserId(Integer userId);
    
    // 根据帖子类型查询帖子
    List<Post> findByPostType(Integer postType);
    
    // 根据标题或内容模糊查询帖子
    @Query("SELECT p FROM Post p WHERE p.postTitle LIKE %:keyword% OR p.postContent LIKE %:keyword%")
    List<Post> findByPostTitleOrPostContentContaining(@Param("keyword") String keyword);
    
    // 根据帖子状态查询帖子
    List<Post> findByPostState(Integer postState);
    
    // 按点赞数排序查询帖子
    List<Post> findAllByOrderByPostLikeCountDesc();
    
    // 重写findOne方法
    @Override
    Post findOne(Integer id);
    
    // 重写delete方法
    @Override
    void delete(Integer id);
}
