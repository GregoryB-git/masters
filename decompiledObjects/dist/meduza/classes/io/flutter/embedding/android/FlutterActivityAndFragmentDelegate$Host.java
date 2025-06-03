package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import b1.k;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.plugin.platform.PlatformPlugin;
import io.flutter.plugin.platform.PlatformPlugin.PlatformPluginDelegate;
import java.util.List;

abstract interface FlutterActivityAndFragmentDelegate$Host
  extends FlutterEngineProvider, FlutterEngineConfigurator, PlatformPlugin.PlatformPluginDelegate
{
  public abstract boolean attachToEngineAutomatically();
  
  public abstract void cleanUpFlutterEngine(FlutterEngine paramFlutterEngine);
  
  public abstract void configureFlutterEngine(FlutterEngine paramFlutterEngine);
  
  public abstract void detachFromFlutterEngine();
  
  public abstract Activity getActivity();
  
  public abstract String getAppBundlePath();
  
  public abstract boolean getBackCallbackState();
  
  public abstract String getCachedEngineGroupId();
  
  public abstract String getCachedEngineId();
  
  public abstract Context getContext();
  
  public abstract List<String> getDartEntrypointArgs();
  
  public abstract String getDartEntrypointFunctionName();
  
  public abstract String getDartEntrypointLibraryUri();
  
  public abstract ExclusiveAppComponent<Activity> getExclusiveAppComponent();
  
  public abstract FlutterShellArgs getFlutterShellArgs();
  
  public abstract String getInitialRoute();
  
  public abstract k getLifecycle();
  
  public abstract RenderMode getRenderMode();
  
  public abstract TransparencyMode getTransparencyMode();
  
  public abstract void onFlutterSurfaceViewCreated(FlutterSurfaceView paramFlutterSurfaceView);
  
  public abstract void onFlutterTextureViewCreated(FlutterTextureView paramFlutterTextureView);
  
  public abstract void onFlutterUiDisplayed();
  
  public abstract void onFlutterUiNoLongerDisplayed();
  
  public abstract FlutterEngine provideFlutterEngine(Context paramContext);
  
  public abstract PlatformPlugin providePlatformPlugin(Activity paramActivity, FlutterEngine paramFlutterEngine);
  
  public abstract boolean shouldAttachEngineToActivity();
  
  public abstract boolean shouldDestroyEngineWithHost();
  
  public abstract boolean shouldDispatchAppLifecycleState();
  
  public abstract boolean shouldHandleDeeplinking();
  
  public abstract boolean shouldRestoreAndSaveState();
  
  public abstract void updateSystemUiOverlays();
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */