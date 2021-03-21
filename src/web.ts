import { WebPlugin } from '@capacitor/core';

import type { FirebaseAuthPlugin } from './definitions';

export class FirebaseAuthWeb extends WebPlugin implements FirebaseAuthPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
