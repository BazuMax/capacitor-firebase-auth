package com.bazumax.capacitor.firebase.auth

import com.getcapacitor.PluginCall
import com.google.firebase.auth.GetTokenResult
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class FirebaseAuth {

    fun getClaims(call: PluginCall, success: (MutableSet<String>) -> Unit) {
        val user = Firebase.auth.currentUser
        if (user != null) {
            call.reject("User is not authenticated")
            return
        }

        user?.getIdToken(false)?.addOnSuccessListener {
            @Override
            fun onSuccess(result: GetTokenResult) {
                success(result.claims.keys)
            }
        }
    }

}