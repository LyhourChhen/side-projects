package com.lyhourchhen.blogApi.repository

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.repository.NoRepositoryBean
import java.io.Serializable


@NoRepositoryBean
interface BaseRepository<T,ID: Serializable> : MongoRepository<T,ID>
