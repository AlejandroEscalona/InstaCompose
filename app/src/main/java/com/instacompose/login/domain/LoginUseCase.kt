package com.instacompose.login.domain

import com.instacompose.login.data.LoginRespository
import javax.inject.Inject

class LoginUseCase  @Inject constructor(
    private val repository: LoginRespository
){

    suspend operator fun invoke(): Boolean {
        return repository.doLogin()
    }
}