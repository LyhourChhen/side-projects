package com.lyhourchhen.blogApi.service

import com.lyhourchhen.blogApi.model.User
import com.lyhourchhen.blogApi.repository.BaseRepository
import com.lyhourchhen.blogApi.repository.BlogRepository
import com.lyhourchhen.blogApi.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl @Autowired constructor(
        private val userRepository: UserRepository,
        private val blogRepository: BlogRepository
): BaseServiceImpl<User,String>(), UserServices{
    override fun getRepository(): BaseRepository<User, String> {
        return userRepository
    }

    override fun getOne(id: String): User? {
        val blogs = blogRepository.findAllByAuthorId(id)
        val author = userRepository.findById(id)
        if (author.isPresent) {
            author.get().Blogs = blogs.toMutableList()
            return author.get()
        }
        return null
    }
}
