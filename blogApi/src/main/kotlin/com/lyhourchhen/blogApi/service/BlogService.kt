package com.lyhourchhen.blogApi.service

import com.lyhourchhen.blogApi.model.Blog
import org.springframework.stereotype.Service

@Service
interface BlogService: BaseService<Blog, String>
