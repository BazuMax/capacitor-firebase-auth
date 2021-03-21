import Foundation
import FirebaseAuth

@objc public class FirebaseAuth: NSObject {
    @objc public func getClaims(completion:@escaping ([String : Any])->()) {
        Auth.auth().currentUser?.getIDTokenResult(completion: { (result, error) in
            completion(result?.claims ?? [:])
        })
    }
}
