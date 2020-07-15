package com.lyhourchhen.blogApi.model.view

import java.io.Serializable

data class UserView(
        var id: String? = null,
        var name : String? = null,
        var blogs : List<BlogView>
) : Serializable
