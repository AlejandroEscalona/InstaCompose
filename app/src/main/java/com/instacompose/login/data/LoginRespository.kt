package com.instacompose.login.data

import com.instacompose.login.data.network.LoginService

class LoginRespository {
    private val api = LoginService()

    suspend fun doLogin(): Boolean{
        return api.doLogin()
    }
}