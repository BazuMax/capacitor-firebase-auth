import Foundation
import FirebaseAuth

@objc public class FirebaseAuth: NSObject {
    @objc public func getClaims(completion:@escaping ([String: Any])->Void) {
        Auth.auth().currentUser?.getIDTokenResult(completion: { (result, _) in
            completion(result?.claims ?? [:])
        })
    }
}
