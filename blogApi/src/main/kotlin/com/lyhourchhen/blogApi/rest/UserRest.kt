package com.lyhourchhen.blogApi.rest

import com.lyhourchhen.blogApi.model.User
import com.lyhourchhen.blogApi.service.UserServices
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(path = ["api/user"])
class UserRest @Autowired constructor(
        private val userServices: UserServices
): BaseRest {
    @GetMapping
    fun getUser(): ResponseEntity<Any?> {
        val data = userServices.getAll()
        return base(data,HttpStatus.OK)
    }

    @GetMapping("/{id}")
    fun getUserById(@RequestBody id:String): ResponseEntity<Any?>{
        val data = userServices.getOne(id)
        return base(data, HttpStatus.OK)
    }

    @PostMapping
    fun createUser(@RequestBody user: User): ResponseEntity<Any?> {
        val data = userServices.create(user)
        return base(data,HttpStatus.CREATED)
    }

    @DeleteMapping("/delete/{id}")
    fun deleteUser(@RequestBody id: String): ResponseEntity<Any?>{
        userServices.delete(id)
        return base("Delete Successfully")
    }

    @PutMapping("/update/{id}")
    fun editUser(@RequestBody id:String, user: User): ResponseEntity<Any?>{
        val data = userServices.update(id,user)
        return base(data, HttpStatus.CREATED)
    }
}
