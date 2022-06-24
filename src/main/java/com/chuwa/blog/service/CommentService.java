package com.chuwa.blog.service;

import com.chuwa.blog.payload.CommentDto;

import java.util.List;

/**
 * @author b1go
 * @date 6/23/22 11:13 PM
 */
public interface CommentService {

    CommentDto createComment(long postId, CommentDto commentDto);

    List<CommentDto> getCommentsByPostId(long postId);

    void deleteComment(Long postId, Long commentId);
}
