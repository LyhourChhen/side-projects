package com.lyhourchhen.blogApi.model.dto

import com.lyhourchhen.blogApi.model.Blog
import java.io.Serializable

data class BlogDto(
        var title: String? = null,
        var body: String? = null,
        var user: UserDto? = null
) : Serializable {
    fun toData(): Blog {
        return Blog(title = title, body = body)
    }
}
