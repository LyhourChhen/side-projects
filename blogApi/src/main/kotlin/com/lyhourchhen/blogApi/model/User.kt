package com.lyhourchhen.blogApi.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document
import java.io.Serializable


@Document(collection = "user")
class User(
        @field:Id
        var id: String? = null,
        var name: String? = null,
        var phoneNumber: String? = null,
        var email: String? = null,
        @field:DBRef
        var Blogs: MutableList<Blog>? = null
): Serializable {

}
