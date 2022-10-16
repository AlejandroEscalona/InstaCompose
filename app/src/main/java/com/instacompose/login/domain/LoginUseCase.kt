package com.instacompose.login.domain

import com.instacompose.login.data.LoginRespository

class LoginUseCase {
    val repository = LoginRespository()

    suspend operator fun invoke(): Boolean {
        return repository.doLogin()
    }
}