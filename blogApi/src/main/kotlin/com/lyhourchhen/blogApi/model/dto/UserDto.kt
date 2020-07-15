package com.lyhourchhen.blogApi.model.dto

import java.io.Serializable

data class UserDto(
        var id: String? = null,
        var name: String? = null
) : Serializable
