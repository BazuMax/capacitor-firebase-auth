import { WebPlugin } from '@capacitor/core';

import type { FirebaseAuthPlugin } from './definitions';

export class FirebaseAuthWeb extends WebPlugin implements FirebaseAuthPlugin {
  async getClaims(): Promise<{ claims: Record<string, boolean> }> {
    return { claims: {} };
  }
}
