package com.example.speakout.data.external

import com.example.speakout.LoginContract
import com.google.firebase.auth.FirebaseAuth

class LoginRepository(
    private val loginCallback: LoginContract.Callback
): LoginContract.Repository {

    private val auth = FirebaseAuth.getInstance()

    override fun login(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener {
                if (it.isSuccessful){
                    loginCallback.onSucess()
                }else{
                    loginCallback.onInvalidCredentialsError()
                }
            }
    }

}