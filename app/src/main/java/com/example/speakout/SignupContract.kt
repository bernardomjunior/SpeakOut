package com.example.speakout

interface SignupContract {

    interface View{
        fun signUpSuccess()
        fun notifyUser(resourceMessage: Int, viewId: Int)
    }

    interface Presenter {
        fun signup(email: String, password: String)
    }

    interface Repository{
        fun signup(email: String, password: String)
    }

    interface Callback{

    }

}