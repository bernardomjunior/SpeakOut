package com.example.speakout

class LoginRepository(
    private val loginCallback: LoginContract.Callback): LoginContract.Repository {

    private val loginService = LoginService()

    override fun login(email: String, password: String) {
        loginService.login(email, password)
    }

}