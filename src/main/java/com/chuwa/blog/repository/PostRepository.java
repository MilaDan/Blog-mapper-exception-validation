package com.chuwa.blog.repository;

import com.chuwa.blog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @description no need use @Repository
 * @author b1go
 * @date 6/16/22 11:21 PM
 */
public interface PostRepository extends JpaRepository<Post, Long> {
    // No need to write code
}
