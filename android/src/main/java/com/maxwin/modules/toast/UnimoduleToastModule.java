package com.maxwin.modules.toast;

import java.util.Map;

import android.content.Context;

import java.util.Map;

import org.unimodules.core.ExportedModule;
import org.unimodules.core.ModuleRegistry;
import org.unimodules.core.Promise;
import org.unimodules.core.interfaces.ExpoMethod;

public class UnimoduleToastModule extends ExportedModule {
  private static final String NAME = "ExpoUnimoduleToast";
  private static final String TAG = UnimoduleToastModule.class.getSimpleName();

  private ModuleRegistry mModuleRegistry;

  public UnimoduleToastModule(Context context) {
    super(context);
  }

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public void onCreate(ModuleRegistry moduleRegistry) {
    mModuleRegistry = moduleRegistry;
  }

  @ExpoMethod
  public void someGreatMethodAsync(Map<String, Object> options, final Promise promise) {
  }
}
