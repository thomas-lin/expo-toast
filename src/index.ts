import { NativeModulesProxy } from '@unimodules/core';

const { ExpoToast } = NativeModulesProxy;

export async function toastAsync(options: any) {
  return await ExpoToast.toastAsync(options);
}
