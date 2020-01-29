package com.example.speakout

import android.util.Patterns

class LoginPresenter(
    private val loginView: LoginContract.View
) : LoginContract.Presenter, LoginContract.Callback {

    private val repository = LoginRepository(this)

    override fun login(email: String, password: String) {
        if (isEmpty(email)) return loginView.notifyUser(
            R.string.empty_email,
            R.id.edittext_email_activity_login
        )
        else if (isEmpty(password)) return loginView.notifyUser(
            R.string.empty_password,
            R.id.edittext_password_activity_login
        )
        else if (!isEmailValid(email)) return loginView.notifyUser(
            R.string.invalid_email_format,
            R.id.edittext_email_activity_login
        )
        repository.login(email, password)
    }

    private fun isEmailValid(email: CharSequence): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    private fun isEmpty(string: CharSequence): Boolean {
        return string.isBlank()
    }

    override fun onSucess() {
        loginView.loginSuccess()
    }

    override fun onInvalidCredentialsError() {
        loginView.notifyUser(R.string.invalid_credentials)
    }

}