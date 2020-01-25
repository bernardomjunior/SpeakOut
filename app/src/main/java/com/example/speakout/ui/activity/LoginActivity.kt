package com.example.speakout.ui.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.speakout.LoginContract
import com.example.speakout.R

class LoginActivity: AppCompatActivity(), LoginContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    override fun loginSucess() {
        notifyUser(R.string.login_success)
    }

    override fun notifyUser(resourceMessage: Int) {
        val message = resources.getString(resourceMessage)
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}