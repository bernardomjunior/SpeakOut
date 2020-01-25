package com.example.speakout

interface LoginContract {

    interface View{
        fun loginSucess()
        fun notifyUser(resourceMessage: Int)
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