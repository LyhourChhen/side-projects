package com.lyhourchhen.blogApi.rest

import com.lyhourchhen.blogApi.model.Blog
import com.lyhourchhen.blogApi.service.BlogService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


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

    @GetMapping("/{id}")
    fun getBlogById(@RequestBody id:String): ResponseEntity<Any?>{
        val data = blogService.getOne(id)
        return base(data,HttpStatus.OK)
    }
    @PostMapping
    fun createBlog(@RequestBody body: Blog): ResponseEntity<Any?> {
        val data = blogService.create(body)
        return base(data, HttpStatus.CREATED)
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
