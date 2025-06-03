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
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import b.j;
import f;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.embedding.engine.plugins.util.GeneratedPluginRegister;
import java.util.ArrayList;
import java.util.List;
import x0.a;
import x0.m;
import x0.y;

public class FlutterFragmentActivity
  extends m
  implements FlutterEngineProvider, FlutterEngineConfigurator
{
  public static final int FRAGMENT_CONTAINER_ID = ;
  private static final String TAG = "FlutterFragmentActivity";
  private static final String TAG_FLUTTER_FRAGMENT = "flutter_fragment";
  private FlutterFragment flutterFragment;
  
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
  
  private View createFragmentContainer()
  {
    FrameLayout localFrameLayout = provideRootLayout(this);
    localFrameLayout.setId(FRAGMENT_CONTAINER_ID);
    localFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    return localFrameLayout;
  }
  
  private void ensureFlutterFragmentCreated()
  {
    if (flutterFragment == null) {
      flutterFragment = retrieveExistingFlutterFragmentIfPossible();
    }
    if (flutterFragment == null)
    {
      flutterFragment = createFlutterFragment();
      Object localObject = getSupportFragmentManager();
      localObject.getClass();
      localObject = new a((y)localObject);
      ((a)localObject).e(FRAGMENT_CONTAINER_ID, flutterFragment, "flutter_fragment");
      ((a)localObject).d(false);
    }
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
        Log.v("FlutterFragmentActivity", "Using the launch theme as normal theme.");
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      Log.e("FlutterFragmentActivity", "Could not read meta-data for FlutterFragmentActivity. Using the launch theme as normal theme.");
    }
  }
  
  public static CachedEngineIntentBuilder withCachedEngine(String paramString)
  {
    return new CachedEngineIntentBuilder(FlutterFragmentActivity.class, paramString);
  }
  
  public static NewEngineIntentBuilder withNewEngine()
  {
    return new NewEngineIntentBuilder(FlutterFragmentActivity.class);
  }
  
  public static NewEngineInGroupIntentBuilder withNewEngineInGroup(String paramString)
  {
    return new NewEngineInGroupIntentBuilder(FlutterFragmentActivity.class, paramString);
  }
  
  public void cleanUpFlutterEngine(FlutterEngine paramFlutterEngine) {}
  
  public void configureFlutterEngine(FlutterEngine paramFlutterEngine)
  {
    FlutterFragment localFlutterFragment = flutterFragment;
    if ((localFlutterFragment != null) && (localFlutterFragment.isFlutterEngineInjected())) {
      return;
    }
    GeneratedPluginRegister.registerGeneratedPlugins(paramFlutterEngine);
  }
  
  public FlutterFragment createFlutterFragment()
  {
    Object localObject = getBackgroundMode();
    RenderMode localRenderMode = getRenderMode();
    TransparencyMode localTransparencyMode;
    if (localObject == FlutterActivityLaunchConfigs.BackgroundMode.opaque) {
      localTransparencyMode = TransparencyMode.opaque;
    } else {
      localTransparencyMode = TransparencyMode.transparent;
    }
    boolean bool;
    if (localRenderMode == RenderMode.surface) {
      bool = true;
    } else {
      bool = false;
    }
    if (getCachedEngineId() != null)
    {
      localStringBuilder = f.l("Creating FlutterFragment with cached engine:\nCached engine ID: ");
      localStringBuilder.append(getCachedEngineId());
      localStringBuilder.append("\nWill destroy engine when Activity is destroyed: ");
      localStringBuilder.append(shouldDestroyEngineWithHost());
      localStringBuilder.append("\nBackground transparency mode: ");
      localStringBuilder.append(localObject);
      localStringBuilder.append("\nWill attach FlutterEngine to Activity: ");
      localStringBuilder.append(shouldAttachEngineToActivity());
      Log.v("FlutterFragmentActivity", localStringBuilder.toString());
      return FlutterFragment.withCachedEngine(getCachedEngineId()).renderMode(localRenderMode).transparencyMode(localTransparencyMode).handleDeeplinking(Boolean.valueOf(shouldHandleDeeplinking())).shouldAttachEngineToActivity(shouldAttachEngineToActivity()).destroyEngineWithFragment(shouldDestroyEngineWithHost()).shouldDelayFirstAndroidViewDraw(bool).shouldAutomaticallyHandleOnBackPressed(true).build();
    }
    StringBuilder localStringBuilder = f.l("Creating FlutterFragment with new engine:\nCached engine group ID: ");
    localStringBuilder.append(getCachedEngineGroupId());
    localStringBuilder.append("\nBackground transparency mode: ");
    localStringBuilder.append(localObject);
    localStringBuilder.append("\nDart entrypoint: ");
    localStringBuilder.append(getDartEntrypointFunctionName());
    localStringBuilder.append("\nDart entrypoint library uri: ");
    if (getDartEntrypointLibraryUri() != null) {
      localObject = getDartEntrypointLibraryUri();
    } else {
      localObject = "\"\"";
    }
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("\nInitial route: ");
    localStringBuilder.append(getInitialRoute());
    localStringBuilder.append("\nApp bundle path: ");
    localStringBuilder.append(getAppBundlePath());
    localStringBuilder.append("\nWill attach FlutterEngine to Activity: ");
    localStringBuilder.append(shouldAttachEngineToActivity());
    Log.v("FlutterFragmentActivity", localStringBuilder.toString());
    if (getCachedEngineGroupId() != null) {
      return FlutterFragment.withNewEngineInGroup(getCachedEngineGroupId()).dartEntrypoint(getDartEntrypointFunctionName()).initialRoute(getInitialRoute()).handleDeeplinking(shouldHandleDeeplinking()).renderMode(localRenderMode).transparencyMode(localTransparencyMode).shouldAttachEngineToActivity(shouldAttachEngineToActivity()).shouldDelayFirstAndroidViewDraw(bool).shouldAutomaticallyHandleOnBackPressed(true).build();
    }
    return FlutterFragment.withNewEngine().dartEntrypoint(getDartEntrypointFunctionName()).dartLibraryUri(getDartEntrypointLibraryUri()).dartEntrypointArgs(getDartEntrypointArgs()).initialRoute(getInitialRoute()).appBundlePath(getAppBundlePath()).flutterShellArgs(FlutterShellArgs.fromIntent(getIntent())).handleDeeplinking(Boolean.valueOf(shouldHandleDeeplinking())).renderMode(localRenderMode).transparencyMode(localTransparencyMode).shouldAttachEngineToActivity(shouldAttachEngineToActivity()).shouldDelayFirstAndroidViewDraw(bool).shouldAutomaticallyHandleOnBackPressed(true).build();
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
  
  public List<String> getDartEntrypointArgs()
  {
    return (List)getIntent().getSerializableExtra("dart_entrypoint_args");
  }
  
  public String getDartEntrypointFunctionName()
  {
    Object localObject1 = "main";
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
  
  public FlutterEngine getFlutterEngine()
  {
    return flutterFragment.getFlutterEngine();
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
  
  public Bundle getMetaData()
  {
    return getPackageManagergetActivityInfogetComponentName128metaData;
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
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    flutterFragment.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    switchLaunchThemeForNormalTheme();
    flutterFragment = retrieveExistingFlutterFragmentIfPossible();
    super.onCreate(paramBundle);
    configureWindowForTransparency();
    setContentView(createFragmentContainer());
    configureStatusBarForFullscreenFlutterExperience();
    ensureFlutterFragmentCreated();
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    flutterFragment.onNewIntent(paramIntent);
    super.onNewIntent(paramIntent);
  }
  
  public void onPostResume()
  {
    super.onPostResume();
    flutterFragment.onPostResume();
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
    flutterFragment.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
  }
  
  public void onTrimMemory(int paramInt)
  {
    super.onTrimMemory(paramInt);
    flutterFragment.onTrimMemory(paramInt);
  }
  
  public void onUserLeaveHint()
  {
    flutterFragment.onUserLeaveHint();
  }
  
  public FlutterEngine provideFlutterEngine(Context paramContext)
  {
    return null;
  }
  
  public FrameLayout provideRootLayout(Context paramContext)
  {
    return new FrameLayout(paramContext);
  }
  
  public FlutterFragment retrieveExistingFlutterFragmentIfPossible()
  {
    return (FlutterFragment)getSupportFragmentManager().E("flutter_fragment");
  }
  
  public boolean shouldAttachEngineToActivity()
  {
    return true;
  }
  
  public boolean shouldDestroyEngineWithHost()
  {
    return getIntent().getBooleanExtra("destroy_engine_with_activity", false);
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
  
  public static class CachedEngineIntentBuilder
  {
    private final Class<? extends FlutterFragmentActivity> activityClass;
    private String backgroundMode = FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;
    private final String cachedEngineId;
    private boolean destroyEngineWithActivity = false;
    
    public CachedEngineIntentBuilder(Class<? extends FlutterFragmentActivity> paramClass, String paramString)
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
    private final Class<? extends FlutterFragmentActivity> activityClass;
    private String backgroundMode = FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;
    private final String cachedEngineGroupId;
    private String dartEntrypoint = "main";
    private String initialRoute = "/";
    
    public NewEngineInGroupIntentBuilder(Class<? extends FlutterFragmentActivity> paramClass, String paramString)
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
    private final Class<? extends FlutterFragmentActivity> activityClass;
    private String backgroundMode = FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;
    private List<String> dartEntrypointArgs;
    private String initialRoute = "/";
    
    public NewEngineIntentBuilder(Class<? extends FlutterFragmentActivity> paramClass)
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
 * Qualified Name:     io.flutter.embedding.android.FlutterFragmentActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */