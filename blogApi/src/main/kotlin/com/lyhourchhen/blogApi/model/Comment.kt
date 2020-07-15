package com.lyhourchhen.blogApi.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document
import java.io.Serializable


@Document(collection = "comment")
class Comment(
        @field:Id
        var  id: String? = null,
        var commentBody: String? = null,
        @field:DBRef
        var user: User? = null
): Serializable
