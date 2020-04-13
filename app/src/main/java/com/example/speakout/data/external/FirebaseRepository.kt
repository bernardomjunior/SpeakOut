package com.example.speakout.data.external

import com.example.speakout.contract.LoginContract
import com.example.speakout.contract.SignupContract
import com.google.firebase.auth.FirebaseAuth

class FirebaseRepository(
    private val loginCallback: LoginContract.Callback?,
    private val signupCallback: SignupContract.Callback?
): LoginContract.Repository, SignupContract.Repository {

    private val auth = FirebaseAuth.getInstance()

    override fun login(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener {
                if (it.isSuccessful){
                    loginCallback?.onSucess()
                }else{
                    loginCallback?.onInvalidCredentialsError()
                }
            }
    }

    override fun signup() {
//        auth.createUserWithEmailAndPassword()
    }
}