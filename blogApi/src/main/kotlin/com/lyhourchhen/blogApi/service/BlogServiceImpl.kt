package com.lyhourchhen.blogApi.service

import com.lyhourchhen.blogApi.model.Blog
import com.lyhourchhen.blogApi.repository.BaseRepository
import com.lyhourchhen.blogApi.repository.BlogRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class BlogServiceImpl @Autowired constructor(
        private val blogRepository: BlogRepository
) : BaseServiceImpl<Blog, String>(), BlogService {
    override fun getRepository(): BaseRepository<Blog, String> {
        return blogRepository
    }
}
