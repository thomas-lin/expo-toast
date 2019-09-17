import { NativeModulesProxy } from '@unimodules/core';

const { UnimoduleToast } = NativeModulesProxy;

export { default as UnimoduleToastView } from './UnimoduleToastView';

export async function someGreatMethodAsync(options: any) {
  return await UnimoduleToast.someGreatMethodAsync(options);
}
