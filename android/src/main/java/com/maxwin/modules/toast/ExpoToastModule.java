package com.maxwin.modules.toast;

import java.util.Map;

import android.content.Context;
import android.widget.Toast;

import org.unimodules.core.ExportedModule;
import org.unimodules.core.ModuleRegistry;
import org.unimodules.core.Promise;
import org.unimodules.core.interfaces.ExpoMethod;

public class ExpoToastModule extends ExportedModule {
  private static final String NAME = "ExpoToast";
  private static final String TAG = ExpoToastModule.class.getSimpleName();

  private ModuleRegistry mModuleRegistry;
  private Context mContext;

  public ExpoToastModule(Context context) {
    super(context);
    this.mContext = context;
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
  public void toastAsync(Map<String, Object> options, final Promise promise) {
    String message = "Hello Expo Toast";
    if (options.containsKey("message")){
      message = (String) options.get("message");
    }
    Toast.makeText(this.mContext, message, Toast.LENGTH_LONG).show();
  }
}
