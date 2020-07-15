package com.lyhourchhen.blogApi.service

import org.springframework.data.repository.NoRepositoryBean
import java.io.Serializable

@NoRepositoryBean
abstract class BaseServiceImpl<T, ID : Serializable> : BaseService<T, ID> {
    override fun create(entity: T): T? {
        return getRepository().save(entity)
    }

    override fun delete(id: ID) {
        return getRepository().deleteById(id)
    }

    override fun getAll(): List<T> {
        return getRepository().findAll()
    }

    override fun getOne(id: ID): T? {
        return getRepository().findById(id).orElse(null)
    }

    override fun update(id: ID, entity: T): T? {
        if (getRepository().existsById(id)) {
            return getRepository().save(entity)
        }
        return null
    }
}
