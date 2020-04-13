package com.example.speakout.contract

interface SignupContract {

    interface View{
        fun signupSuccess()
        fun notifyUser(resourceMessage: Int, viewId: Int? = null)
    }

    interface Presenter{
        fun signup()
    }

    interface Repository{
        fun signup()
    }

    interface Callback{
        fun onSucess()
        fun onInvalidCredentialsError()
    }

}