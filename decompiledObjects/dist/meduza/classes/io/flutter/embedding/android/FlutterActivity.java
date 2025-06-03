package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.drawable.ColorDrawable;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import b1.k;
import b1.k.a;
import b1.o;
import b1.p;
import f;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.embedding.engine.plugins.util.GeneratedPluginRegister;
import io.flutter.plugin.platform.PlatformPlugin;
import java.util.ArrayList;
import java.util.List;

public class FlutterActivity
  extends Activity
  implements FlutterActivityAndFragmentDelegate.Host, o
{
  public static final int FLUTTER_VIEW_ID = ;
  private static final String TAG = "FlutterActivity";
  public FlutterActivityAndFragmentDelegate delegate;
  public boolean hasRegisteredBackCallback = false;
  private p lifecycle;
  private final OnBackInvokedCallback onBackInvokedCallback;
  
  public FlutterActivity()
  {
    OnBackInvokedCallback localOnBackInvokedCallback;
    if (Build.VERSION.SDK_INT < 33) {
      localOnBackInvokedCallback = null;
    } else {
      localOnBackInvokedCallback = createOnBackInvokedCallback();
    }
    onBackInvokedCallback = localOnBackInvokedCallback;
    lifecycle = new p(this);
  }
  
  private void configureStatusBarForFullscreenFlutterExperience()
  {
    Window localWindow = getWindow();
    localWindow.addFlags(Integer.MIN_VALUE);
    localWindow.setStatusBarColor(1073741824);
    localWindow.getDecorView().setSystemUiVisibility(1280);
  }
  
  private void configureWindowForTransparency()
  {
    if (getBackgroundMode() == FlutterActivityLaunchConfigs.BackgroundMode.transparent) {
      getWindow().setBackgroundDrawable(new ColorDrawable(0));
    }
  }
  
  public static Intent createDefaultIntent(Context paramContext)
  {
    return withNewEngine().build(paramContext);
  }
  
  private View createFlutterView()
  {
    FlutterActivityAndFragmentDelegate localFlutterActivityAndFragmentDelegate = delegate;
    int i = FLUTTER_VIEW_ID;
    boolean bool;
    if (getRenderMode() == RenderMode.surface) {
      bool = true;
    } else {
      bool = false;
    }
    return localFlutterActivityAndFragmentDelegate.onCreateView(null, null, null, i, bool);
  }
  
  private OnBackInvokedCallback createOnBackInvokedCallback()
  {
    if (Build.VERSION.SDK_INT >= 34) {
      new OnBackAnimationCallback()
      {
        public void onBackCancelled()
        {
          cancelBackGesture();
        }
        
        public void onBackInvoked()
        {
          commitBackGesture();
        }
        
        public void onBackProgressed(BackEvent paramAnonymousBackEvent)
        {
          updateBackGestureProgress(paramAnonymousBackEvent);
        }
        
        public void onBackStarted(BackEvent paramAnonymousBackEvent)
        {
          startBackGesture(paramAnonymousBackEvent);
        }
      };
    }
    return new a(this);
  }
  
  private boolean isDebuggable()
  {
    boolean bool;
    if ((getApplicationInfoflags & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private boolean stillAttachedForEvent(String paramString)
  {
    Object localObject = delegate;
    if (localObject == null)
    {
      localObject = f.l("FlutterActivity ");
      ((StringBuilder)localObject).append(hashCode());
      ((StringBuilder)localObject).append(" ");
      ((StringBuilder)localObject).append(paramString);
      paramString = " called after release.";
    }
    else
    {
      if (((FlutterActivityAndFragmentDelegate)localObject).isAttached()) {
        break label98;
      }
      localObject = f.l("FlutterActivity ");
      ((StringBuilder)localObject).append(hashCode());
      ((StringBuilder)localObject).append(" ");
      ((StringBuilder)localObject).append(paramString);
      paramString = " called after detach.";
    }
    ((StringBuilder)localObject).append(paramString);
    Log.w("FlutterActivity", ((StringBuilder)localObject).toString());
    return false;
    label98:
    return true;
  }
  
  private void switchLaunchThemeForNormalTheme()
  {
    try
    {
      Bundle localBundle = getMetaData();
      if (localBundle != null)
      {
        int i = localBundle.getInt("io.flutter.embedding.android.NormalTheme", -1);
        if (i != -1) {
          setTheme(i);
        }
      }
      else
      {
        Log.v("FlutterActivity", "Using the launch theme as normal theme.");
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      Log.e("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
    }
  }
  
  public static CachedEngineIntentBuilder withCachedEngine(String paramString)
  {
    return new CachedEngineIntentBuilder(FlutterActivity.class, paramString);
  }
  
  public static NewEngineIntentBuilder withNewEngine()
  {
    return new NewEngineIntentBuilder(FlutterActivity.class);
  }
  
  public static NewEngineInGroupIntentBuilder withNewEngineInGroup(String paramString)
  {
    return new NewEngineInGroupIntentBuilder(FlutterActivity.class, paramString);
  }
  
  public boolean attachToEngineAutomatically()
  {
    return true;
  }
  
  public void cancelBackGesture()
  {
    if (stillAttachedForEvent("cancelBackGesture")) {
      delegate.cancelBackGesture();
    }
  }
  
  public void cleanUpFlutterEngine(FlutterEngine paramFlutterEngine) {}
  
  public void commitBackGesture()
  {
    if (stillAttachedForEvent("commitBackGesture")) {
      delegate.commitBackGesture();
    }
  }
  
  public void configureFlutterEngine(FlutterEngine paramFlutterEngine)
  {
    if (delegate.isFlutterEngineFromHost()) {
      return;
    }
    GeneratedPluginRegister.registerGeneratedPlugins(paramFlutterEngine);
  }
  
  public void detachFromFlutterEngine()
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("FlutterActivity ");
    ((StringBuilder)localObject).append(this);
    ((StringBuilder)localObject).append(" connection to the engine ");
    ((StringBuilder)localObject).append(getFlutterEngine());
    ((StringBuilder)localObject).append(" evicted by another attaching activity");
    Log.w("FlutterActivity", ((StringBuilder)localObject).toString());
    localObject = delegate;
    if (localObject != null)
    {
      ((FlutterActivityAndFragmentDelegate)localObject).onDestroyView();
      delegate.onDetach();
    }
  }
  
  public Activity getActivity()
  {
    return this;
  }
  
  public String getAppBundlePath()
  {
    if ((isDebuggable()) && ("android.intent.action.RUN".equals(getIntent().getAction())))
    {
      String str = getIntent().getDataString();
      if (str != null) {
        return str;
      }
    }
    return null;
  }
  
  public boolean getBackCallbackState()
  {
    return hasRegisteredBackCallback;
  }
  
  public FlutterActivityLaunchConfigs.BackgroundMode getBackgroundMode()
  {
    if (getIntent().hasExtra("background_mode")) {
      return FlutterActivityLaunchConfigs.BackgroundMode.valueOf(getIntent().getStringExtra("background_mode"));
    }
    return FlutterActivityLaunchConfigs.BackgroundMode.opaque;
  }
  
  public String getCachedEngineGroupId()
  {
    return getIntent().getStringExtra("cached_engine_group_id");
  }
  
  public String getCachedEngineId()
  {
    return getIntent().getStringExtra("cached_engine_id");
  }
  
  public Context getContext()
  {
    return this;
  }
  
  public List<String> getDartEntrypointArgs()
  {
    return (List)getIntent().getSerializableExtra("dart_entrypoint_args");
  }
  
  public String getDartEntrypointFunctionName()
  {
    Object localObject1 = "main";
    if (getIntent().hasExtra("dart_entrypoint")) {
      return getIntent().getStringExtra("dart_entrypoint");
    }
    try
    {
      Object localObject2 = getMetaData();
      if (localObject2 != null) {
        localObject2 = ((BaseBundle)localObject2).getString("io.flutter.Entrypoint");
      } else {
        localObject2 = null;
      }
      if (localObject2 != null) {
        localObject1 = localObject2;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;) {}
    }
    return (String)localObject1;
  }
  
  public String getDartEntrypointLibraryUri()
  {
    localObject1 = null;
    try
    {
      Bundle localBundle = getMetaData();
      localObject2 = localObject1;
      if (localBundle != null) {
        localObject2 = localBundle.getString("io.flutter.EntrypointUri");
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        Object localObject2;
        Object localObject3 = localObject1;
      }
    }
    return (String)localObject2;
  }
  
  public ExclusiveAppComponent<Activity> getExclusiveAppComponent()
  {
    return delegate;
  }
  
  public FlutterEngine getFlutterEngine()
  {
    return delegate.getFlutterEngine();
  }
  
  public FlutterShellArgs getFlutterShellArgs()
  {
    return FlutterShellArgs.fromIntent(getIntent());
  }
  
  public String getInitialRoute()
  {
    if (getIntent().hasExtra("route")) {
      return getIntent().getStringExtra("route");
    }
    localObject1 = null;
    try
    {
      Bundle localBundle = getMetaData();
      localObject2 = localObject1;
      if (localBundle != null) {
        localObject2 = localBundle.getString("io.flutter.InitialRoute");
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        Object localObject2;
        Object localObject3 = localObject1;
      }
    }
    return (String)localObject2;
  }
  
  public k getLifecycle()
  {
    return lifecycle;
  }
  
  public Bundle getMetaData()
  {
    return getPackageManagergetActivityInfogetComponentName128metaData;
  }
  
  public OnBackInvokedCallback getOnBackInvokedCallback()
  {
    return onBackInvokedCallback;
  }
  
  public RenderMode getRenderMode()
  {
    RenderMode localRenderMode;
    if (getBackgroundMode() == FlutterActivityLaunchConfigs.BackgroundMode.opaque) {
      localRenderMode = RenderMode.surface;
    } else {
      localRenderMode = RenderMode.texture;
    }
    return localRenderMode;
  }
  
  public TransparencyMode getTransparencyMode()
  {
    TransparencyMode localTransparencyMode;
    if (getBackgroundMode() == FlutterActivityLaunchConfigs.BackgroundMode.opaque) {
      localTransparencyMode = TransparencyMode.opaque;
    } else {
      localTransparencyMode = TransparencyMode.transparent;
    }
    return localTransparencyMode;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (stillAttachedForEvent("onActivityResult")) {
      delegate.onActivityResult(paramInt1, paramInt2, paramIntent);
    }
  }
  
  public void onBackPressed()
  {
    if (stillAttachedForEvent("onBackPressed")) {
      delegate.onBackPressed();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    switchLaunchThemeForNormalTheme();
    super.onCreate(paramBundle);
    if (paramBundle != null) {
      setFrameworkHandlesBack(paramBundle.getBoolean("enableOnBackInvokedCallbackState"));
    }
    FlutterActivityAndFragmentDelegate localFlutterActivityAndFragmentDelegate = new FlutterActivityAndFragmentDelegate(this);
    delegate = localFlutterActivityAndFragmentDelegate;
    localFlutterActivityAndFragmentDelegate.onAttach(this);
    delegate.onRestoreInstanceState(paramBundle);
    lifecycle.f(k.a.ON_CREATE);
    configureWindowForTransparency();
    setContentView(createFlutterView());
    configureStatusBarForFullscreenFlutterExperience();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    if (stillAttachedForEvent("onDestroy"))
    {
      delegate.onDestroyView();
      delegate.onDetach();
    }
    release();
    lifecycle.f(k.a.ON_DESTROY);
  }
  
  public void onFlutterSurfaceViewCreated(FlutterSurfaceView paramFlutterSurfaceView) {}
  
  public void onFlutterTextureViewCreated(FlutterTextureView paramFlutterTextureView) {}
  
  public void onFlutterUiDisplayed()
  {
    if (Build.VERSION.SDK_INT >= 29) {
      reportFullyDrawn();
    }
  }
  
  public void onFlutterUiNoLongerDisplayed() {}
  
  public void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    if (stillAttachedForEvent("onNewIntent")) {
      delegate.onNewIntent(paramIntent);
    }
  }
  
  public void onPause()
  {
    super.onPause();
    if (stillAttachedForEvent("onPause")) {
      delegate.onPause();
    }
    lifecycle.f(k.a.ON_PAUSE);
  }
  
  public void onPostResume()
  {
    super.onPostResume();
    if (stillAttachedForEvent("onPostResume")) {
      delegate.onPostResume();
    }
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    if (stillAttachedForEvent("onRequestPermissionsResult")) {
      delegate.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
    }
  }
  
  public void onResume()
  {
    super.onResume();
    lifecycle.f(k.a.ON_RESUME);
    if (stillAttachedForEvent("onResume")) {
      delegate.onResume();
    }
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    if (stillAttachedForEvent("onSaveInstanceState")) {
      delegate.onSaveInstanceState(paramBundle);
    }
  }
  
  public void onStart()
  {
    super.onStart();
    lifecycle.f(k.a.ON_START);
    if (stillAttachedForEvent("onStart")) {
      delegate.onStart();
    }
  }
  
  public void onStop()
  {
    super.onStop();
    if (stillAttachedForEvent("onStop")) {
      delegate.onStop();
    }
    lifecycle.f(k.a.ON_STOP);
  }
  
  public void onTrimMemory(int paramInt)
  {
    super.onTrimMemory(paramInt);
    if (stillAttachedForEvent("onTrimMemory")) {
      delegate.onTrimMemory(paramInt);
    }
  }
  
  public void onUserLeaveHint()
  {
    if (stillAttachedForEvent("onUserLeaveHint")) {
      delegate.onUserLeaveHint();
    }
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    if (stillAttachedForEvent("onWindowFocusChanged")) {
      delegate.onWindowFocusChanged(paramBoolean);
    }
  }
  
  public boolean popSystemNavigator()
  {
    return false;
  }
  
  public FlutterEngine provideFlutterEngine(Context paramContext)
  {
    return null;
  }
  
  public PlatformPlugin providePlatformPlugin(Activity paramActivity, FlutterEngine paramFlutterEngine)
  {
    return new PlatformPlugin(getActivity(), paramFlutterEngine.getPlatformChannel(), this);
  }
  
  public void registerOnBackInvokedCallback()
  {
    if (Build.VERSION.SDK_INT >= 33)
    {
      getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, onBackInvokedCallback);
      hasRegisteredBackCallback = true;
    }
  }
  
  public void release()
  {
    unregisterOnBackInvokedCallback();
    FlutterActivityAndFragmentDelegate localFlutterActivityAndFragmentDelegate = delegate;
    if (localFlutterActivityAndFragmentDelegate != null)
    {
      localFlutterActivityAndFragmentDelegate.release();
      delegate = null;
    }
  }
  
  public void setDelegate(FlutterActivityAndFragmentDelegate paramFlutterActivityAndFragmentDelegate)
  {
    delegate = paramFlutterActivityAndFragmentDelegate;
  }
  
  public void setFrameworkHandlesBack(boolean paramBoolean)
  {
    if ((paramBoolean) && (!hasRegisteredBackCallback)) {
      registerOnBackInvokedCallback();
    } else if ((!paramBoolean) && (hasRegisteredBackCallback)) {
      unregisterOnBackInvokedCallback();
    }
  }
  
  public boolean shouldAttachEngineToActivity()
  {
    return true;
  }
  
  public boolean shouldDestroyEngineWithHost()
  {
    boolean bool1 = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
    boolean bool2 = bool1;
    if (getCachedEngineId() == null) {
      if (delegate.isFlutterEngineFromHost()) {
        bool2 = bool1;
      } else {
        bool2 = getIntent().getBooleanExtra("destroy_engine_with_activity", true);
      }
    }
    return bool2;
  }
  
  public boolean shouldDispatchAppLifecycleState()
  {
    return true;
  }
  
  public boolean shouldHandleDeeplinking()
  {
    try
    {
      boolean bool = FlutterActivityLaunchConfigs.deepLinkEnabled(getMetaData());
      return bool;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return false;
  }
  
  public boolean shouldRestoreAndSaveState()
  {
    if (getIntent().hasExtra("enable_state_restoration")) {
      return getIntent().getBooleanExtra("enable_state_restoration", false);
    }
    return getCachedEngineId() == null;
  }
  
  public void startBackGesture(BackEvent paramBackEvent)
  {
    if (stillAttachedForEvent("startBackGesture")) {
      delegate.startBackGesture(paramBackEvent);
    }
  }
  
  public void unregisterOnBackInvokedCallback()
  {
    if (Build.VERSION.SDK_INT >= 33)
    {
      getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(onBackInvokedCallback);
      hasRegisteredBackCallback = false;
    }
  }
  
  public void updateBackGestureProgress(BackEvent paramBackEvent)
  {
    if (stillAttachedForEvent("updateBackGestureProgress")) {
      delegate.updateBackGestureProgress(paramBackEvent);
    }
  }
  
  public void updateSystemUiOverlays()
  {
    FlutterActivityAndFragmentDelegate localFlutterActivityAndFragmentDelegate = delegate;
    if (localFlutterActivityAndFragmentDelegate != null) {
      localFlutterActivityAndFragmentDelegate.updateSystemUiOverlays();
    }
  }
  
  public static class CachedEngineIntentBuilder
  {
    private final Class<? extends FlutterActivity> activityClass;
    private String backgroundMode = FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;
    private final String cachedEngineId;
    private boolean destroyEngineWithActivity = false;
    
    public CachedEngineIntentBuilder(Class<? extends FlutterActivity> paramClass, String paramString)
    {
      activityClass = paramClass;
      cachedEngineId = paramString;
    }
    
    public CachedEngineIntentBuilder backgroundMode(FlutterActivityLaunchConfigs.BackgroundMode paramBackgroundMode)
    {
      backgroundMode = paramBackgroundMode.name();
      return this;
    }
    
    public Intent build(Context paramContext)
    {
      return new Intent(paramContext, activityClass).putExtra("cached_engine_id", cachedEngineId).putExtra("destroy_engine_with_activity", destroyEngineWithActivity).putExtra("background_mode", backgroundMode);
    }
    
    public CachedEngineIntentBuilder destroyEngineWithActivity(boolean paramBoolean)
    {
      destroyEngineWithActivity = paramBoolean;
      return this;
    }
  }
  
  public static class NewEngineInGroupIntentBuilder
  {
    private final Class<? extends FlutterActivity> activityClass;
    private String backgroundMode = FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;
    private final String cachedEngineGroupId;
    private String dartEntrypoint = "main";
    private String initialRoute = "/";
    
    public NewEngineInGroupIntentBuilder(Class<? extends FlutterActivity> paramClass, String paramString)
    {
      activityClass = paramClass;
      cachedEngineGroupId = paramString;
    }
    
    public NewEngineInGroupIntentBuilder backgroundMode(FlutterActivityLaunchConfigs.BackgroundMode paramBackgroundMode)
    {
      backgroundMode = paramBackgroundMode.name();
      return this;
    }
    
    public Intent build(Context paramContext)
    {
      return new Intent(paramContext, activityClass).putExtra("dart_entrypoint", dartEntrypoint).putExtra("route", initialRoute).putExtra("cached_engine_group_id", cachedEngineGroupId).putExtra("background_mode", backgroundMode).putExtra("destroy_engine_with_activity", true);
    }
    
    public NewEngineInGroupIntentBuilder dartEntrypoint(String paramString)
    {
      dartEntrypoint = paramString;
      return this;
    }
    
    public NewEngineInGroupIntentBuilder initialRoute(String paramString)
    {
      initialRoute = paramString;
      return this;
    }
  }
  
  public static class NewEngineIntentBuilder
  {
    private final Class<? extends FlutterActivity> activityClass;
    private String backgroundMode = FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;
    private List<String> dartEntrypointArgs;
    private String initialRoute = "/";
    
    public NewEngineIntentBuilder(Class<? extends FlutterActivity> paramClass)
    {
      activityClass = paramClass;
    }
    
    public NewEngineIntentBuilder backgroundMode(FlutterActivityLaunchConfigs.BackgroundMode paramBackgroundMode)
    {
      backgroundMode = paramBackgroundMode.name();
      return this;
    }
    
    public Intent build(Context paramContext)
    {
      paramContext = new Intent(paramContext, activityClass).putExtra("route", initialRoute).putExtra("background_mode", backgroundMode).putExtra("destroy_engine_with_activity", true);
      if (dartEntrypointArgs != null) {
        paramContext.putExtra("dart_entrypoint_args", new ArrayList(dartEntrypointArgs));
      }
      return paramContext;
    }
    
    public NewEngineIntentBuilder dartEntrypointArgs(List<String> paramList)
    {
      dartEntrypointArgs = paramList;
      return this;
    }
    
    public NewEngineIntentBuilder initialRoute(String paramString)
    {
      initialRoute = paramString;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.FlutterActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */