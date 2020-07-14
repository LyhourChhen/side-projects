package com.lyhourchhen.blogApi.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef

class User(
        @Id
        val id: String? = null,
        val name: String? = null,
        val phoneNumber: String? = null,
        val email: String? = null,
        @DBRef
        val Blogs: List<Blog>? = null

)
