package com.chuwa.blog.service;

import com.chuwa.blog.payload.PostDto;
import com.chuwa.blog.payload.PostResponse;

import java.util.List;

/**
 * @author b1go
 * @date 6/17/22 12:03 AM
 */
public interface PostService {
    PostDto createPost(PostDto postDto);

    List<PostDto> getAllPost();
    PostResponse getAllPost(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);

    void deletePostById(long id);
}
