package com.lyhourchhen.blogApi.model.view

import com.lyhourchhen.blogApi.model.dto.UserDto
import java.io.Serializable

data class BlogView(
        var id: String? = null,
        var title: String? = null,
        var body: String? = null,
        var author: UserDto? = null
) : Serializable
