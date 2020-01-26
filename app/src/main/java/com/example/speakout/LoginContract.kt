package com.example.speakout

import android.view.View

interface LoginContract {

    interface View{
        fun loginSucess()
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
        fun onConnectionError()
        fun onInvalidCredentialsError()
    }

}