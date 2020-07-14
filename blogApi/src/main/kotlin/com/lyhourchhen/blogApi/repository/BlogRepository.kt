package com.lyhourchhen.blogApi.repository

import com.lyhourchhen.blogApi.model.Blog
import org.springframework.stereotype.Repository


@Repository
interface BlogRepository : BaseRepository<Blog,String>
