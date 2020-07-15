package com.lyhourchhen.blogApi.model.dto

abstract class BaseDto<E, ID> {
    abstract fun toNewEntity(): E
}
