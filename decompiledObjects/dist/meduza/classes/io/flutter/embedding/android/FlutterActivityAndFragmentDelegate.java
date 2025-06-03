package io.flutter.embedding.android;

import a0.j;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.window.BackEvent;
import b1.k;
import f;
import g;
import io.flutter.FlutterInjector;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.FlutterEngineGroup;
import io.flutter.embedding.engine.FlutterEngineGroup.Options;
import io.flutter.embedding.engine.FlutterEngineGroupCache;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.embedding.engine.plugins.activity.ActivityControlSurface;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import io.flutter.embedding.engine.systemchannels.BackGestureChannel;
import io.flutter.embedding.engine.systemchannels.LifecycleChannel;
import io.flutter.embedding.engine.systemchannels.NavigationChannel;
import io.flutter.embedding.engine.systemchannels.RestorationChannel;
import io.flutter.embedding.engine.systemchannels.SystemChannel;
import io.flutter.plugin.platform.PlatformPlugin;
import io.flutter.plugin.platform.PlatformPlugin.PlatformPluginDelegate;
import io.flutter.plugin.platform.PlatformViewsController;
import java.util.Arrays;
import java.util.List;

class FlutterActivityAndFragmentDelegate
  implements ExclusiveAppComponent<Activity>
{
  private static final int FLUTTER_SPLASH_VIEW_FALLBACK_ID = 486947586;
  private static final String FRAMEWORK_RESTORATION_BUNDLE_KEY = "framework";
  public static final String ON_BACK_CALLBACK_ENABLED_KEY = "enableOnBackInvokedCallbackState";
  private static final String PLUGINS_RESTORATION_BUNDLE_KEY = "plugins";
  private static final String TAG = "FlutterActivityAndFragmentDelegate";
  public ViewTreeObserver.OnPreDrawListener activePreDrawListener;
  private FlutterEngineGroup engineGroup;
  private FlutterEngine flutterEngine;
  private final FlutterUiDisplayListener flutterUiDisplayListener = new FlutterUiDisplayListener()
  {
    public void onFlutterUiDisplayed()
    {
      FlutterActivityAndFragmentDelegate.access$000(FlutterActivityAndFragmentDelegate.this).onFlutterUiDisplayed();
      FlutterActivityAndFragmentDelegate.access$102(FlutterActivityAndFragmentDelegate.this, true);
      FlutterActivityAndFragmentDelegate.access$202(FlutterActivityAndFragmentDelegate.this, true);
    }
    
    public void onFlutterUiNoLongerDisplayed()
    {
      FlutterActivityAndFragmentDelegate.access$000(FlutterActivityAndFragmentDelegate.this).onFlutterUiNoLongerDisplayed();
      FlutterActivityAndFragmentDelegate.access$102(FlutterActivityAndFragmentDelegate.this, false);
    }
  };
  public FlutterView flutterView;
  private Host host;
  private boolean isAttached;
  private boolean isFirstFrameRendered;
  private boolean isFlutterEngineFromHost;
  private boolean isFlutterUiDisplayed;
  private PlatformPlugin platformPlugin;
  private Integer previousVisibility;
  
  public FlutterActivityAndFragmentDelegate(Host paramHost)
  {
    this(paramHost, null);
  }
  
  public FlutterActivityAndFragmentDelegate(Host paramHost, FlutterEngineGroup paramFlutterEngineGroup)
  {
    host = paramHost;
    isFirstFrameRendered = false;
    engineGroup = paramFlutterEngineGroup;
  }
  
  private FlutterEngineGroup.Options addEntrypointOptions(FlutterEngineGroup.Options paramOptions)
  {
    String str1 = host.getAppBundlePath();
    if (str1 != null)
    {
      str2 = str1;
      if (!str1.isEmpty()) {}
    }
    else
    {
      str2 = FlutterInjector.instance().flutterLoader().findAppBundlePath();
    }
    DartExecutor.DartEntrypoint localDartEntrypoint = new DartExecutor.DartEntrypoint(str2, host.getDartEntrypointFunctionName());
    str1 = host.getInitialRoute();
    String str2 = str1;
    if (str1 == null)
    {
      str1 = maybeGetInitialRouteFromIntent(host.getActivity().getIntent());
      str2 = str1;
      if (str1 == null) {
        str2 = "/";
      }
    }
    return paramOptions.setDartEntrypoint(localDartEntrypoint).setInitialRoute(str2).setDartEntrypointArgs(host.getDartEntrypointArgs());
  }
  
  private void delayFirstAndroidViewDraw(final FlutterView paramFlutterView)
  {
    if (host.getRenderMode() == RenderMode.surface)
    {
      if (activePreDrawListener != null) {
        paramFlutterView.getViewTreeObserver().removeOnPreDrawListener(activePreDrawListener);
      }
      activePreDrawListener = new ViewTreeObserver.OnPreDrawListener()
      {
        public boolean onPreDraw()
        {
          if ((FlutterActivityAndFragmentDelegate.access$100(this$0)) && (this$0.activePreDrawListener != null))
          {
            paramFlutterView.getViewTreeObserver().removeOnPreDrawListener(this);
            this$0.activePreDrawListener = null;
          }
          return FlutterActivityAndFragmentDelegate.access$100(this$0);
        }
      };
      paramFlutterView.getViewTreeObserver().addOnPreDrawListener(activePreDrawListener);
      return;
    }
    throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
  }
  
  private void doInitialFlutterViewRun()
  {
    if (host.getCachedEngineId() != null) {
      return;
    }
    if (flutterEngine.getDartExecutor().isExecutingDart()) {
      return;
    }
    Object localObject1 = host.getInitialRoute();
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject1 = maybeGetInitialRouteFromIntent(host.getActivity().getIntent());
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = "/";
      }
    }
    String str = host.getDartEntrypointLibraryUri();
    localObject1 = f.l("Executing Dart entrypoint: ");
    ((StringBuilder)localObject1).append(host.getDartEntrypointFunctionName());
    ((StringBuilder)localObject1).append(", library uri: ");
    ((StringBuilder)localObject1).append(str);
    if (((StringBuilder)localObject1).toString() == null) {
      localObject1 = "\"\"";
    } else {
      localObject1 = g.e(str, ", and sending initial route: ", (String)localObject2);
    }
    Log.v("FlutterActivityAndFragmentDelegate", (String)localObject1);
    flutterEngine.getNavigationChannel().setInitialRoute((String)localObject2);
    localObject1 = host.getAppBundlePath();
    if (localObject1 != null)
    {
      localObject2 = localObject1;
      if (!((String)localObject1).isEmpty()) {}
    }
    else
    {
      localObject2 = FlutterInjector.instance().flutterLoader().findAppBundlePath();
    }
    if (str == null) {
      localObject2 = new DartExecutor.DartEntrypoint((String)localObject2, host.getDartEntrypointFunctionName());
    } else {
      localObject2 = new DartExecutor.DartEntrypoint((String)localObject2, str, host.getDartEntrypointFunctionName());
    }
    flutterEngine.getDartExecutor().executeDartEntrypoint((DartExecutor.DartEntrypoint)localObject2, host.getDartEntrypointArgs());
  }
  
  private void ensureAlive()
  {
    if (host != null) {
      return;
    }
    throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
  }
  
  private String maybeGetInitialRouteFromIntent(Intent paramIntent)
  {
    if (host.shouldHandleDeeplinking())
    {
      paramIntent = paramIntent.getData();
      if (paramIntent != null) {
        return paramIntent.toString();
      }
    }
    return null;
  }
  
  public void cancelBackGesture()
  {
    ensureAlive();
    if (flutterEngine != null)
    {
      Log.v("FlutterActivityAndFragmentDelegate", "Forwarding cancelBackGesture() to FlutterEngine.");
      flutterEngine.getBackGestureChannel().cancelBackGesture();
    }
    else
    {
      Log.w("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
    }
  }
  
  public void commitBackGesture()
  {
    ensureAlive();
    if (flutterEngine != null)
    {
      Log.v("FlutterActivityAndFragmentDelegate", "Forwarding commitBackGesture() to FlutterEngine.");
      flutterEngine.getBackGestureChannel().commitBackGesture();
    }
    else
    {
      Log.w("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
    }
  }
  
  public void detachFromFlutterEngine()
  {
    if (!host.shouldDestroyEngineWithHost())
    {
      host.detachFromFlutterEngine();
      return;
    }
    StringBuilder localStringBuilder = f.l("The internal FlutterEngine created by ");
    localStringBuilder.append(host);
    localStringBuilder.append(" has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    throw new AssertionError(localStringBuilder.toString());
  }
  
  public Activity getAppComponent()
  {
    Activity localActivity = host.getActivity();
    if (localActivity != null) {
      return localActivity;
    }
    throw new AssertionError("FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
  }
  
  public FlutterEngine getFlutterEngine()
  {
    return flutterEngine;
  }
  
  public boolean isAttached()
  {
    return isAttached;
  }
  
  public boolean isFlutterEngineFromHost()
  {
    return isFlutterEngineFromHost;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    ensureAlive();
    if (flutterEngine != null)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Forwarding onActivityResult() to FlutterEngine:\nrequestCode: ");
      localStringBuilder.append(paramInt1);
      localStringBuilder.append("\nresultCode: ");
      localStringBuilder.append(paramInt2);
      localStringBuilder.append("\ndata: ");
      localStringBuilder.append(paramIntent);
      Log.v("FlutterActivityAndFragmentDelegate", localStringBuilder.toString());
      flutterEngine.getActivityControlSurface().onActivityResult(paramInt1, paramInt2, paramIntent);
    }
    else
    {
      Log.w("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
    }
  }
  
  public void onAttach(Context paramContext)
  {
    ensureAlive();
    if (flutterEngine == null) {
      setUpFlutterEngine();
    }
    if (host.shouldAttachEngineToActivity())
    {
      Log.v("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to the Activity that owns this delegate.");
      flutterEngine.getActivityControlSurface().attachToActivity(this, host.getLifecycle());
    }
    paramContext = host;
    platformPlugin = paramContext.providePlatformPlugin(paramContext.getActivity(), flutterEngine);
    host.configureFlutterEngine(flutterEngine);
    isAttached = true;
  }
  
  public void onBackPressed()
  {
    ensureAlive();
    if (flutterEngine != null)
    {
      Log.v("FlutterActivityAndFragmentDelegate", "Forwarding onBackPressed() to FlutterEngine.");
      flutterEngine.getNavigationChannel().popRoute();
    }
    else
    {
      Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle, int paramInt, boolean paramBoolean)
  {
    Log.v("FlutterActivityAndFragmentDelegate", "Creating FlutterView.");
    ensureAlive();
    paramLayoutInflater = host.getRenderMode();
    paramViewGroup = RenderMode.surface;
    boolean bool1 = true;
    boolean bool2 = true;
    if (paramLayoutInflater == paramViewGroup)
    {
      paramLayoutInflater = host.getContext();
      if (host.getTransparencyMode() != TransparencyMode.transparent) {
        bool2 = false;
      }
      paramLayoutInflater = new FlutterSurfaceView(paramLayoutInflater, bool2);
      host.onFlutterSurfaceViewCreated(paramLayoutInflater);
      paramLayoutInflater = new FlutterView(host.getContext(), paramLayoutInflater);
    }
    else
    {
      paramLayoutInflater = new FlutterTextureView(host.getContext());
      if (host.getTransparencyMode() == TransparencyMode.opaque) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
      paramLayoutInflater.setOpaque(bool2);
      host.onFlutterTextureViewCreated(paramLayoutInflater);
      paramLayoutInflater = new FlutterView(host.getContext(), paramLayoutInflater);
    }
    flutterView = paramLayoutInflater;
    flutterView.addOnFirstFrameRenderedListener(flutterUiDisplayListener);
    if (host.attachToEngineAutomatically())
    {
      Log.v("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to FlutterView.");
      flutterView.attachToFlutterEngine(flutterEngine);
    }
    flutterView.setId(paramInt);
    if (paramBoolean) {
      delayFirstAndroidViewDraw(flutterView);
    }
    return flutterView;
  }
  
  public void onDestroyView()
  {
    Log.v("FlutterActivityAndFragmentDelegate", "onDestroyView()");
    ensureAlive();
    if (activePreDrawListener != null)
    {
      flutterView.getViewTreeObserver().removeOnPreDrawListener(activePreDrawListener);
      activePreDrawListener = null;
    }
    FlutterView localFlutterView = flutterView;
    if (localFlutterView != null)
    {
      localFlutterView.detachFromFlutterEngine();
      flutterView.removeOnFirstFrameRenderedListener(flutterUiDisplayListener);
    }
  }
  
  public void onDetach()
  {
    if (!isAttached) {
      return;
    }
    Log.v("FlutterActivityAndFragmentDelegate", "onDetach()");
    ensureAlive();
    host.cleanUpFlutterEngine(flutterEngine);
    if (host.shouldAttachEngineToActivity())
    {
      Log.v("FlutterActivityAndFragmentDelegate", "Detaching FlutterEngine from the Activity that owns this Fragment.");
      if (host.getActivity().isChangingConfigurations()) {
        flutterEngine.getActivityControlSurface().detachFromActivityForConfigChanges();
      } else {
        flutterEngine.getActivityControlSurface().detachFromActivity();
      }
    }
    Object localObject = platformPlugin;
    if (localObject != null)
    {
      ((PlatformPlugin)localObject).destroy();
      platformPlugin = null;
    }
    if (host.shouldDispatchAppLifecycleState())
    {
      localObject = flutterEngine;
      if (localObject != null) {
        ((FlutterEngine)localObject).getLifecycleChannel().appIsDetached();
      }
    }
    if (host.shouldDestroyEngineWithHost())
    {
      flutterEngine.destroy();
      if (host.getCachedEngineId() != null) {
        FlutterEngineCache.getInstance().remove(host.getCachedEngineId());
      }
      flutterEngine = null;
    }
    isAttached = false;
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    ensureAlive();
    if (flutterEngine != null)
    {
      Log.v("FlutterActivityAndFragmentDelegate", "Forwarding onNewIntent() to FlutterEngine and sending pushRouteInformation message.");
      flutterEngine.getActivityControlSurface().onNewIntent(paramIntent);
      paramIntent = maybeGetInitialRouteFromIntent(paramIntent);
      if ((paramIntent != null) && (!paramIntent.isEmpty())) {
        flutterEngine.getNavigationChannel().pushRouteInformation(paramIntent);
      }
    }
    else
    {
      Log.w("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
    }
  }
  
  public void onPause()
  {
    Log.v("FlutterActivityAndFragmentDelegate", "onPause()");
    ensureAlive();
    if (host.shouldDispatchAppLifecycleState())
    {
      FlutterEngine localFlutterEngine = flutterEngine;
      if (localFlutterEngine != null) {
        localFlutterEngine.getLifecycleChannel().appIsInactive();
      }
    }
  }
  
  public void onPostResume()
  {
    Log.v("FlutterActivityAndFragmentDelegate", "onPostResume()");
    ensureAlive();
    if (flutterEngine != null)
    {
      updateSystemUiOverlays();
      flutterEngine.getPlatformViewsController().onResume();
    }
    else
    {
      Log.w("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
    }
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    ensureAlive();
    if (flutterEngine != null)
    {
      StringBuilder localStringBuilder = j.n("Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: ", paramInt, "\npermissions: ");
      localStringBuilder.append(Arrays.toString(paramArrayOfString));
      localStringBuilder.append("\ngrantResults: ");
      localStringBuilder.append(Arrays.toString(paramArrayOfInt));
      Log.v("FlutterActivityAndFragmentDelegate", localStringBuilder.toString());
      flutterEngine.getActivityControlSurface().onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
    }
    else
    {
      Log.w("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
    }
  }
  
  public void onRestoreInstanceState(Bundle paramBundle)
  {
    Log.v("FlutterActivityAndFragmentDelegate", "onRestoreInstanceState. Giving framework and plugins an opportunity to restore state.");
    ensureAlive();
    byte[] arrayOfByte = null;
    if (paramBundle != null)
    {
      Bundle localBundle = paramBundle.getBundle("plugins");
      arrayOfByte = paramBundle.getByteArray("framework");
      paramBundle = localBundle;
    }
    else
    {
      paramBundle = null;
    }
    if (host.shouldRestoreAndSaveState()) {
      flutterEngine.getRestorationChannel().setRestorationData(arrayOfByte);
    }
    if (host.shouldAttachEngineToActivity()) {
      flutterEngine.getActivityControlSurface().onRestoreInstanceState(paramBundle);
    }
  }
  
  public void onResume()
  {
    Log.v("FlutterActivityAndFragmentDelegate", "onResume()");
    ensureAlive();
    if (host.shouldDispatchAppLifecycleState())
    {
      FlutterEngine localFlutterEngine = flutterEngine;
      if (localFlutterEngine != null) {
        localFlutterEngine.getLifecycleChannel().appIsResumed();
      }
    }
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    Log.v("FlutterActivityAndFragmentDelegate", "onSaveInstanceState. Giving framework and plugins an opportunity to save state.");
    ensureAlive();
    if (host.shouldRestoreAndSaveState()) {
      paramBundle.putByteArray("framework", flutterEngine.getRestorationChannel().getRestorationData());
    }
    if (host.shouldAttachEngineToActivity())
    {
      Bundle localBundle = new Bundle();
      flutterEngine.getActivityControlSurface().onSaveInstanceState(localBundle);
      paramBundle.putBundle("plugins", localBundle);
    }
    if ((host.getCachedEngineId() != null) && (!host.shouldDestroyEngineWithHost())) {
      paramBundle.putBoolean("enableOnBackInvokedCallbackState", host.getBackCallbackState());
    }
  }
  
  public void onStart()
  {
    Log.v("FlutterActivityAndFragmentDelegate", "onStart()");
    ensureAlive();
    doInitialFlutterViewRun();
    Integer localInteger = previousVisibility;
    if (localInteger != null) {
      flutterView.setVisibility(localInteger.intValue());
    }
  }
  
  public void onStop()
  {
    Log.v("FlutterActivityAndFragmentDelegate", "onStop()");
    ensureAlive();
    if (host.shouldDispatchAppLifecycleState())
    {
      localFlutterEngine = flutterEngine;
      if (localFlutterEngine != null) {
        localFlutterEngine.getLifecycleChannel().appIsPaused();
      }
    }
    previousVisibility = Integer.valueOf(flutterView.getVisibility());
    flutterView.setVisibility(8);
    FlutterEngine localFlutterEngine = flutterEngine;
    if (localFlutterEngine != null) {
      localFlutterEngine.getRenderer().onTrimMemory(40);
    }
  }
  
  public void onTrimMemory(int paramInt)
  {
    ensureAlive();
    FlutterEngine localFlutterEngine = flutterEngine;
    if (localFlutterEngine != null)
    {
      int i;
      if ((isFirstFrameRendered) && (paramInt >= 10)) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0)
      {
        localFlutterEngine.getDartExecutor().notifyLowMemoryWarning();
        flutterEngine.getSystemChannel().sendMemoryPressureWarning();
      }
      flutterEngine.getRenderer().onTrimMemory(paramInt);
      flutterEngine.getPlatformViewsController().onTrimMemory(paramInt);
    }
  }
  
  public void onUserLeaveHint()
  {
    ensureAlive();
    if (flutterEngine != null)
    {
      Log.v("FlutterActivityAndFragmentDelegate", "Forwarding onUserLeaveHint() to FlutterEngine.");
      flutterEngine.getActivityControlSurface().onUserLeaveHint();
    }
    else
    {
      Log.w("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
    }
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    ensureAlive();
    StringBuilder localStringBuilder = f.l("Received onWindowFocusChanged: ");
    Object localObject;
    if (paramBoolean) {
      localObject = "true";
    } else {
      localObject = "false";
    }
    localStringBuilder.append((String)localObject);
    Log.v("FlutterActivityAndFragmentDelegate", localStringBuilder.toString());
    if (host.shouldDispatchAppLifecycleState())
    {
      localObject = flutterEngine;
      if (localObject != null) {
        if (paramBoolean) {
          ((FlutterEngine)localObject).getLifecycleChannel().aWindowIsFocused();
        } else {
          ((FlutterEngine)localObject).getLifecycleChannel().noWindowsAreFocused();
        }
      }
    }
  }
  
  public void release()
  {
    host = null;
    flutterEngine = null;
    flutterView = null;
    platformPlugin = null;
  }
  
  public void setUpFlutterEngine()
  {
    Log.v("FlutterActivityAndFragmentDelegate", "Setting up FlutterEngine.");
    Object localObject1 = host.getCachedEngineId();
    if (localObject1 != null)
    {
      localObject2 = FlutterEngineCache.getInstance().get((String)localObject1);
      flutterEngine = ((FlutterEngine)localObject2);
      isFlutterEngineFromHost = true;
      if (localObject2 != null) {
        return;
      }
      throw new IllegalStateException(g.e("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '", (String)localObject1, "'"));
    }
    Object localObject2 = host;
    localObject2 = ((Host)localObject2).provideFlutterEngine(((Host)localObject2).getContext());
    flutterEngine = ((FlutterEngine)localObject2);
    if (localObject2 != null)
    {
      isFlutterEngineFromHost = true;
      return;
    }
    localObject1 = host.getCachedEngineGroupId();
    if (localObject1 != null)
    {
      localObject2 = FlutterEngineGroupCache.getInstance().get((String)localObject1);
      if (localObject2 != null) {
        localObject1 = new FlutterEngineGroup.Options(host.getContext());
      } else {
        throw new IllegalStateException(g.e("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '", (String)localObject1, "'"));
      }
    }
    else
    {
      Log.v("FlutterActivityAndFragmentDelegate", "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
      localObject1 = engineGroup;
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = new FlutterEngineGroup(host.getContext(), host.getFlutterShellArgs().toArray());
      }
      localObject1 = new FlutterEngineGroup.Options(host.getContext()).setAutomaticallyRegisterPlugins(false).setWaitForRestorationData(host.shouldRestoreAndSaveState());
    }
    flutterEngine = ((FlutterEngineGroup)localObject2).createAndRunEngine(addEntrypointOptions((FlutterEngineGroup.Options)localObject1));
    isFlutterEngineFromHost = false;
  }
  
  public void startBackGesture(BackEvent paramBackEvent)
  {
    ensureAlive();
    if (flutterEngine != null)
    {
      Log.v("FlutterActivityAndFragmentDelegate", "Forwarding startBackGesture() to FlutterEngine.");
      flutterEngine.getBackGestureChannel().startBackGesture(paramBackEvent);
    }
    else
    {
      Log.w("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
    }
  }
  
  public void updateBackGestureProgress(BackEvent paramBackEvent)
  {
    ensureAlive();
    if (flutterEngine != null)
    {
      Log.v("FlutterActivityAndFragmentDelegate", "Forwarding updateBackGestureProgress() to FlutterEngine.");
      flutterEngine.getBackGestureChannel().updateBackGestureProgress(paramBackEvent);
    }
    else
    {
      Log.w("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
    }
  }
  
  public void updateSystemUiOverlays()
  {
    PlatformPlugin localPlatformPlugin = platformPlugin;
    if (localPlatformPlugin != null) {
      localPlatformPlugin.updateSystemUiOverlays();
    }
  }
  
  public static abstract interface DelegateFactory
  {
    public abstract FlutterActivityAndFragmentDelegate createDelegate(FlutterActivityAndFragmentDelegate.Host paramHost);
  }
  
  public static abstract interface Host
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
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.FlutterActivityAndFragmentDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */