package com.lyhourchhen.blogApi.service

import com.lyhourchhen.blogApi.repository.BaseRepository
import java.io.Serializable

interface BaseService<T, ID : Serializable> {
    fun getRepository(): BaseRepository<T, ID>
    fun getAll(): List<T>
    fun getOne(id: ID): T?
    fun create(entity: T): T?
    fun update(id: ID, entity: T): T?
    fun delete(id: ID)
}

