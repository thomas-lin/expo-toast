import { NativeModulesProxy } from '@unimodules/core';

const { UnimoduleToast } = NativeModulesProxy;

export async function toastAsync(options: any) {
  return await UnimoduleToast.toast(options);
}
