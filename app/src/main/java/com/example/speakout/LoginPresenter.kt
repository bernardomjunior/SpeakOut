package com.example.speakout

import android.util.Patterns

class LoginPresenter(
    private val loginView: LoginContract.View
): LoginContract.Presenter, LoginContract.Callback {

    private val repository = LoginRepository(this)


    override fun login(email: String, password: String) {
        if (!isEmailValid(email)){
            loginView.notifyUser(R.string.invalid_email_format, R.id.edittext_email_activity_login)
            return
        }
        repository.login(email, password)
    }


    fun isEmailValid(email: CharSequence): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    override fun onSucess() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onConnectionError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onInvalidCredentialsError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}