export interface FirebaseAuthPlugin {
  /**
   * Returns the custom claims (set by developer via Admin SDK).
   *
   * @since 3.0.0
   */
  getClaims(): Promise<ClaimsResult>;
}

export interface ClaimsResult {
  claims: Record<string, boolean>;
}
