package com.instacompose.login.data

import com.instacompose.login.data.network.LoginService
import javax.inject.Inject

class LoginRespository @Inject constructor(
    private val api: LoginService
) {

    suspend fun doLogin(): Boolean{
        return api.doLogin()
    }
}