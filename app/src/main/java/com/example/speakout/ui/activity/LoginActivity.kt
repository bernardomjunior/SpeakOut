package com.example.speakout.ui.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.speakout.LoginContract
import com.example.speakout.LoginPresenter
import com.example.speakout.R
import kotlinx.android.synthetic.main.activity_login.edittext_email_activity_login
import kotlinx.android.synthetic.main.activity_login.button_login_activity_login
import kotlinx.android.synthetic.main.activity_login.edittext_password_activity_login
import kotlinx.android.synthetic.main.activity_login.textview_signup_activity_login


class LoginActivity : AppCompatActivity(), LoginContract.View {

    private val presenter = LoginPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setClickListeners()
    }

    private fun setClickListeners() {
        button_login_activity_login.setOnClickListener {
            val email = edittext_email_activity_login.editText?.text.toString()
            val pwd = edittext_password_activity_login.editText?.text.toString()
            presenter.login(email, pwd)
        }
        textview_signup_activity_login.setOnClickListener {
            startActivity(Intent(this, SignupActivity::class.java))
        }
    }

    override fun loginSuccess() {
    }

    override fun notifyUser(resourceMessage: Int, viewId: Int?) {
        val message = resources.getString(resourceMessage)
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        viewId?.let {
            val view = findViewById<View>(it)
            view.requestFocus()
        }
    }


}