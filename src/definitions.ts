export interface FirebaseAuthPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
