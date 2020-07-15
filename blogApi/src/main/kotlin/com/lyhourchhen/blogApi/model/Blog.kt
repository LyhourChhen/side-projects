package com.lyhourchhen.blogApi.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document
import java.io.Serializable


@Document(collection = "blog")
class Blog (
        @field:Id
        var id: String? = null,
        var title: String? = null,
        var body: String? = null,
        @field:DBRef
        var author: User? = null
) : Serializable {

}
