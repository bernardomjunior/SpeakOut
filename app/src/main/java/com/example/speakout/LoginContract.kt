package com.example.speakout

import android.view.View

interface LoginContract {

    interface View{
        fun loginSuccess()
        fun notifyUser(resourceMessage: Int, viewId: Int? = null)
    }

    interface Presenter{
        fun login(email: String, password: String)
    }

    interface Repository{
        fun login(email: String, password: String)
    }

    interface Callback{
        fun onSucess()
        fun onInvalidCredentialsError()
    }

}