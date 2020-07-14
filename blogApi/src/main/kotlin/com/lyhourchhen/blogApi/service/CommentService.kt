package com.lyhourchhen.blogApi.service

import com.lyhourchhen.blogApi.model.Comment
import org.springframework.stereotype.Service

@Service
interface CommentService: BaseService<Comment,String>
