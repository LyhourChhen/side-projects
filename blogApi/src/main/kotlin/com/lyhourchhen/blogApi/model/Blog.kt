package com.lyhourchhen.blogApi.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef

class Blog (
        @Id
        val id: String? = null,
        val title: String? = null,
        val body: String? = null,
        @DBRef
        val author: User? = null
)
