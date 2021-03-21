import { registerPlugin } from '@capacitor/core';

import type { FirebaseAuthPlugin } from './definitions';

const FirebaseAuth = registerPlugin<FirebaseAuthPlugin>('FirebaseAuth', {
  web: () => import('./web').then(m => new m.FirebaseAuthWeb()),
});

export * from './definitions';
export { FirebaseAuth };
