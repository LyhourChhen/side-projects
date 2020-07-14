package com.lyhourchhen.blogApi.rest

import com.lyhourchhen.blogApi.service.BlogService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping(path = ["api/blog"])
class BlogRest @Autowired constructor(
        private val blogService: BlogService
) : BaseRest {
    @GetMapping
    fun getAllBlog(): ResponseEntity<Any?> {
        val data = blogService.getAll()
        return base(data)
    }
}
