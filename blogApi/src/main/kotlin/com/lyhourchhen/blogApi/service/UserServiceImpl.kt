package com.lyhourchhen.blogApi.service

import com.lyhourchhen.blogApi.model.User
import com.lyhourchhen.blogApi.repository.BaseRepository
import com.lyhourchhen.blogApi.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl @Autowired constructor(
        private val userRepository: UserRepository
): BaseServiceImpl<User,String>(), UserServices{
    override fun getRepository(): BaseRepository<User, String> {
        return userRepository
    }
}
