package com.lyhourchhen.blogApi.rest

import com.lyhourchhen.blogApi.model.Blog
import com.lyhourchhen.blogApi.model.dto.BlogDto
import com.lyhourchhen.blogApi.service.BlogService
import com.lyhourchhen.blogApi.service.UserServices
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping(path = ["api/blog"])
class BlogRest @Autowired constructor(
        private val blogService: BlogService,
        private val userServices: UserServices
) : BaseRest {
    @GetMapping
    fun getAllBlog(): ResponseEntity<Any?> {
        val data = blogService.getAll()
        return base(data)
    }

    @GetMapping("/{id}")
    fun getBlogById(@RequestBody id:String): ResponseEntity<Any?>{
        val data = blogService.getOne(id)
        return base(data,HttpStatus.OK)
    }
    @PostMapping
    fun createBlog(@RequestBody body: BlogDto): ResponseEntity<Any?> {
        val author = userServices.getOne(body.user?.id ?:"")?: throw Exception("author or user not Found!")
        val data = body.toData()
        data.author = author
        return base(blogService.create(data), HttpStatus.CREATED)
    }

    @DeleteMapping("delete/{id}")
    fun deleteBlog(@PathVariable id: String): ResponseEntity<Any?>{
        blogService.delete(id)
        return base("Delete Successfully")
    }

    @PutMapping("update/{id}")
    fun editBlog(@PathVariable id: String, @RequestBody body: Blog): ResponseEntity<Any?>{
        val data = blogService.update(id,body)
        return base(data, HttpStatus.CREATED)
    }
}
