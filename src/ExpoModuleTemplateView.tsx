import * as React from 'react';

import { requireNativeViewManager } from '@unimodules/core';

export default class UnimoduleToastView extends React.Component {
  static NativeView = requireNativeViewManager('UnimoduleToastView');

  render() {
    return (
      <UnimoduleToastView.NativeView />
    );
  }
}
