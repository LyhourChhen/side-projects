package com.lyhourchhen.blogApi.repository

import com.lyhourchhen.blogApi.model.User
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : BaseRepository<User,String>
