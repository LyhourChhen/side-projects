package com.lyhourchhen.blogApi.rest

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity


interface BaseRest {
    fun <T> base(entity: T, status: HttpStatus = HttpStatus.OK): ResponseEntity<T> {
        return ResponseEntity.status(status).body(entity)
    }
}
