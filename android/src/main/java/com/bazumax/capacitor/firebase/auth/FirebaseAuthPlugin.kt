package com.bazumax.capacitor.firebase.auth

import com.getcapacitor.JSObject
import com.getcapacitor.Plugin
import com.getcapacitor.PluginCall
import com.getcapacitor.PluginMethod
import com.getcapacitor.annotation.CapacitorPlugin


@CapacitorPlugin(name = "FirebaseAuthPlugin")
class FirebaseAuthPlugin : Plugin() {
    private val implementation = FirebaseAuth()

    @PluginMethod
    public fun getClaims(call: PluginCall) {
        implementation.getClaims(call) { claimsSet ->
            val claims = JSObject()

            claimsSet.forEach {
                claims.put(it, true)
            }

            val result = JSObject()
            result.put("claims", claims)

            call.resolve(result)
        }
    }
}