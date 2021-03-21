import Foundation
import Capacitor

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(FirebaseAuthPlugin)
public class FirebaseAuthPlugin: CAPPlugin {
    private let implementation = FirebaseAuth()

    @objc func getClaims(_ call: CAPPluginCall) {
        implementation.getClaims { (claims: [String : Any]) in
            call.resolve([ "claims": claims])
        }
    }
}
