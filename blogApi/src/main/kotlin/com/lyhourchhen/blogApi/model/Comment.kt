package com.lyhourchhen.blogApi.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef

class Comment(
        @Id
        val id: String? = null,
        val commentBody: String? = null,
        @DBRef
        val user: User? = null
)
