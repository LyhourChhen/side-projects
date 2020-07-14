package com.lyhourchhen.blogApi.rest

import com.lyhourchhen.blogApi.model.Comment
import com.lyhourchhen.blogApi.service.CommentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(path = ["api/comment"])
class CommentRest @Autowired constructor(
        private val commentService: CommentService
) : BaseRest {
    @GetMapping
    fun getAllComment(): ResponseEntity<Any?> {
        val data = commentService.getAll()
        return base(data, HttpStatus.OK)
    }

    @GetMapping("/{id}")
    fun getCommentById(@RequestBody id: String): ResponseEntity<Any?> {
        val data = commentService.getOne(id)
        return base(data, HttpStatus.OK)
    }

    @PostMapping("/create/{id}")
    fun createComment(@RequestBody comment: Comment): ResponseEntity<Any?> {
        val data = commentService.create(comment)
        return base(data, HttpStatus.CREATED)
    }

    @PutMapping("/update/{id}")
    fun updateComment(@RequestBody id: String, comment: Comment): ResponseEntity<Any?> {
        val data = commentService.update(id, comment)
        return base(data, HttpStatus.OK)
    }

    @DeleteMapping("/delete/{id}")
    fun deleteComment(@RequestBody id: String): ResponseEntity<Any?> {
        commentService.delete(id)
        return base("Comment Delete Successfully")
    }
}
