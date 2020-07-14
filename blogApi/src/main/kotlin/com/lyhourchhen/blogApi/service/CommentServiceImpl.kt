package com.lyhourchhen.blogApi.service

import com.lyhourchhen.blogApi.model.Comment

import com.lyhourchhen.blogApi.repository.BaseRepository
import com.lyhourchhen.blogApi.repository.CommentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class CommentServiceImpl @Autowired constructor(
        private val commentRepository: CommentRepository
): BaseServiceImpl<Comment,String>(),CommentService{
    override fun getRepository(): BaseRepository<Comment, String> {
        return commentRepository
    }


}
