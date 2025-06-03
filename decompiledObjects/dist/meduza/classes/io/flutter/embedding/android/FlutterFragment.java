package io.flutter.embedding.android;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnWindowFocusChangeListener;
import b.j;
import b.p;
import b.w;
import f;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import io.flutter.plugin.platform.PlatformPlugin;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import x0.i;
import x0.m;

public class FlutterFragment
  extends i
  implements FlutterActivityAndFragmentDelegate.Host, ComponentCallbacks2, FlutterActivityAndFragmentDelegate.DelegateFactory
{
  public static final String ARG_APP_BUNDLE_PATH = "app_bundle_path";
  public static final String ARG_CACHED_ENGINE_GROUP_ID = "cached_engine_group_id";
  public static final String ARG_CACHED_ENGINE_ID = "cached_engine_id";
  public static final String ARG_DART_ENTRYPOINT = "dart_entrypoint";
  public static final String ARG_DART_ENTRYPOINT_ARGS = "dart_entrypoint_args";
  public static final String ARG_DART_ENTRYPOINT_URI = "dart_entrypoint_uri";
  public static final String ARG_DESTROY_ENGINE_WITH_FRAGMENT = "destroy_engine_with_fragment";
  public static final String ARG_ENABLE_STATE_RESTORATION = "enable_state_restoration";
  public static final String ARG_FLUTTERVIEW_RENDER_MODE = "flutterview_render_mode";
  public static final String ARG_FLUTTERVIEW_TRANSPARENCY_MODE = "flutterview_transparency_mode";
  public static final String ARG_FLUTTER_INITIALIZATION_ARGS = "initialization_args";
  public static final String ARG_HANDLE_DEEPLINKING = "handle_deeplinking";
  public static final String ARG_INITIAL_ROUTE = "initial_route";
  public static final String ARG_SHOULD_ATTACH_ENGINE_TO_ACTIVITY = "should_attach_engine_to_activity";
  public static final String ARG_SHOULD_AUTOMATICALLY_HANDLE_ON_BACK_PRESSED = "should_automatically_handle_on_back_pressed";
  public static final String ARG_SHOULD_DELAY_FIRST_ANDROID_VIEW_DRAW = "should_delay_first_android_view_draw";
  public static final int FLUTTER_VIEW_ID = ;
  private static final String TAG = "FlutterFragment";
  public FlutterActivityAndFragmentDelegate delegate;
  private FlutterActivityAndFragmentDelegate.DelegateFactory delegateFactory = this;
  public final p onBackPressedCallback = new p(true)
  {
    public void handleOnBackPressed()
    {
      onBackPressed();
    }
  };
  private final ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = new ViewTreeObserver.OnWindowFocusChangeListener()
  {
    public void onWindowFocusChanged(boolean paramAnonymousBoolean)
    {
      if (FlutterFragment.access$000(FlutterFragment.this, "onWindowFocusChanged")) {
        delegate.onWindowFocusChanged(paramAnonymousBoolean);
      }
    }
  };
  
  public FlutterFragment()
  {
    setArguments(new Bundle());
  }
  
  public static FlutterFragment createDefault()
  {
    return new NewEngineFragmentBuilder().build();
  }
  
  private boolean stillAttachedForEvent(String paramString)
  {
    Object localObject = delegate;
    if (localObject == null)
    {
      localObject = f.l("FlutterFragment ");
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
      localObject = f.l("FlutterFragment ");
      ((StringBuilder)localObject).append(hashCode());
      ((StringBuilder)localObject).append(" ");
      ((StringBuilder)localObject).append(paramString);
      paramString = " called after detach.";
    }
    ((StringBuilder)localObject).append(paramString);
    Log.w("FlutterFragment", ((StringBuilder)localObject).toString());
    return false;
    label98:
    return true;
  }
  
  public static CachedEngineFragmentBuilder withCachedEngine(String paramString)
  {
    return new CachedEngineFragmentBuilder(paramString, null);
  }
  
  public static NewEngineFragmentBuilder withNewEngine()
  {
    return new NewEngineFragmentBuilder();
  }
  
  public static NewEngineInGroupFragmentBuilder withNewEngineInGroup(String paramString)
  {
    return new NewEngineInGroupFragmentBuilder(paramString);
  }
  
  public boolean attachToEngineAutomatically()
  {
    return true;
  }
  
  public void cleanUpFlutterEngine(FlutterEngine paramFlutterEngine)
  {
    m localm = getActivity();
    if ((localm instanceof FlutterEngineConfigurator)) {
      ((FlutterEngineConfigurator)localm).cleanUpFlutterEngine(paramFlutterEngine);
    }
  }
  
  public void configureFlutterEngine(FlutterEngine paramFlutterEngine)
  {
    m localm = getActivity();
    if ((localm instanceof FlutterEngineConfigurator)) {
      ((FlutterEngineConfigurator)localm).configureFlutterEngine(paramFlutterEngine);
    }
  }
  
  public FlutterActivityAndFragmentDelegate createDelegate(FlutterActivityAndFragmentDelegate.Host paramHost)
  {
    return new FlutterActivityAndFragmentDelegate(paramHost);
  }
  
  public void detachFromFlutterEngine()
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("FlutterFragment ");
    ((StringBuilder)localObject).append(this);
    ((StringBuilder)localObject).append(" connection to the engine ");
    ((StringBuilder)localObject).append(getFlutterEngine());
    ((StringBuilder)localObject).append(" evicted by another attaching activity");
    Log.w("FlutterFragment", ((StringBuilder)localObject).toString());
    localObject = delegate;
    if (localObject != null)
    {
      ((FlutterActivityAndFragmentDelegate)localObject).onDestroyView();
      delegate.onDetach();
    }
  }
  
  public String getAppBundlePath()
  {
    return getArguments().getString("app_bundle_path");
  }
  
  public boolean getBackCallbackState()
  {
    return onBackPressedCallback.isEnabled();
  }
  
  public String getCachedEngineGroupId()
  {
    return getArguments().getString("cached_engine_group_id", null);
  }
  
  public String getCachedEngineId()
  {
    return getArguments().getString("cached_engine_id", null);
  }
  
  public List<String> getDartEntrypointArgs()
  {
    return getArguments().getStringArrayList("dart_entrypoint_args");
  }
  
  public String getDartEntrypointFunctionName()
  {
    return getArguments().getString("dart_entrypoint", "main");
  }
  
  public String getDartEntrypointLibraryUri()
  {
    return getArguments().getString("dart_entrypoint_uri");
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
    String[] arrayOfString = getArguments().getStringArray("initialization_args");
    if (arrayOfString == null) {
      arrayOfString = new String[0];
    }
    return new FlutterShellArgs(arrayOfString);
  }
  
  public String getInitialRoute()
  {
    return getArguments().getString("initial_route");
  }
  
  public RenderMode getRenderMode()
  {
    return RenderMode.valueOf(getArguments().getString("flutterview_render_mode", RenderMode.surface.name()));
  }
  
  public TransparencyMode getTransparencyMode()
  {
    return TransparencyMode.valueOf(getArguments().getString("flutterview_transparency_mode", TransparencyMode.transparent.name()));
  }
  
  public boolean isFlutterEngineInjected()
  {
    return delegate.isFlutterEngineFromHost();
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (stillAttachedForEvent("onActivityResult")) {
      delegate.onActivityResult(paramInt1, paramInt2, paramIntent);
    }
  }
  
  public void onAttach(Context paramContext)
  {
    super.onAttach(paramContext);
    FlutterActivityAndFragmentDelegate localFlutterActivityAndFragmentDelegate = delegateFactory.createDelegate(this);
    delegate = localFlutterActivityAndFragmentDelegate;
    localFlutterActivityAndFragmentDelegate.onAttach(paramContext);
    if (getArguments().getBoolean("should_automatically_handle_on_back_pressed", false))
    {
      requireActivity().getOnBackPressedDispatcher().a(this, onBackPressedCallback);
      onBackPressedCallback.setEnabled(false);
    }
    paramContext.registerComponentCallbacks(this);
  }
  
  public void onBackPressed()
  {
    if (stillAttachedForEvent("onBackPressed")) {
      delegate.onBackPressed();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle != null)
    {
      boolean bool = paramBundle.getBoolean("enableOnBackInvokedCallbackState");
      onBackPressedCallback.setEnabled(bool);
    }
    delegate.onRestoreInstanceState(paramBundle);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return delegate.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle, FLUTTER_VIEW_ID, shouldDelayFirstAndroidViewDraw());
  }
  
  public void onDestroyView()
  {
    super.onDestroyView();
    requireView().getViewTreeObserver().removeOnWindowFocusChangeListener(onWindowFocusChangeListener);
    if (stillAttachedForEvent("onDestroyView")) {
      delegate.onDestroyView();
    }
  }
  
  public void onDetach()
  {
    getContext().unregisterComponentCallbacks(this);
    super.onDetach();
    Object localObject = delegate;
    if (localObject != null)
    {
      ((FlutterActivityAndFragmentDelegate)localObject).onDetach();
      delegate.release();
      delegate = null;
    }
    else
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("FlutterFragment ");
      ((StringBuilder)localObject).append(this);
      ((StringBuilder)localObject).append(" onDetach called after release.");
      Log.v("FlutterFragment", ((StringBuilder)localObject).toString());
    }
  }
  
  public void onFlutterSurfaceViewCreated(FlutterSurfaceView paramFlutterSurfaceView) {}
  
  public void onFlutterTextureViewCreated(FlutterTextureView paramFlutterTextureView) {}
  
  public void onFlutterUiDisplayed()
  {
    m localm = getActivity();
    if ((localm instanceof FlutterUiDisplayListener)) {
      ((FlutterUiDisplayListener)localm).onFlutterUiDisplayed();
    }
  }
  
  public void onFlutterUiNoLongerDisplayed()
  {
    m localm = getActivity();
    if ((localm instanceof FlutterUiDisplayListener)) {
      ((FlutterUiDisplayListener)localm).onFlutterUiNoLongerDisplayed();
    }
  }
  
  public void onNewIntent(Intent paramIntent)
  {
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
  }
  
  public void onPostResume()
  {
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
  }
  
  public void onTrimMemory(int paramInt)
  {
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
  
  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    paramView.getViewTreeObserver().addOnWindowFocusChangeListener(onWindowFocusChangeListener);
  }
  
  public boolean popSystemNavigator()
  {
    if (getArguments().getBoolean("should_automatically_handle_on_back_pressed", false))
    {
      m localm = getActivity();
      if (localm != null)
      {
        boolean bool = onBackPressedCallback.isEnabled();
        if (bool) {
          onBackPressedCallback.setEnabled(false);
        }
        localm.getOnBackPressedDispatcher().b();
        if (bool) {
          onBackPressedCallback.setEnabled(true);
        }
        return true;
      }
    }
    return false;
  }
  
  public FlutterEngine provideFlutterEngine(Context paramContext)
  {
    paramContext = getActivity();
    if ((paramContext instanceof FlutterEngineProvider))
    {
      Log.v("FlutterFragment", "Deferring to attached Activity to provide a FlutterEngine.");
      paramContext = ((FlutterEngineProvider)paramContext).provideFlutterEngine(getContext());
    }
    else
    {
      paramContext = null;
    }
    return paramContext;
  }
  
  public PlatformPlugin providePlatformPlugin(Activity paramActivity, FlutterEngine paramFlutterEngine)
  {
    if (paramActivity != null) {
      return new PlatformPlugin(getActivity(), paramFlutterEngine.getPlatformChannel(), this);
    }
    return null;
  }
  
  public void setDelegateFactory(FlutterActivityAndFragmentDelegate.DelegateFactory paramDelegateFactory)
  {
    delegateFactory = paramDelegateFactory;
    delegate = paramDelegateFactory.createDelegate(this);
  }
  
  public void setFrameworkHandlesBack(boolean paramBoolean)
  {
    if (!getArguments().getBoolean("should_automatically_handle_on_back_pressed", false)) {
      return;
    }
    onBackPressedCallback.setEnabled(paramBoolean);
  }
  
  public boolean shouldAttachEngineToActivity()
  {
    return getArguments().getBoolean("should_attach_engine_to_activity");
  }
  
  public boolean shouldDelayFirstAndroidViewDraw()
  {
    return getArguments().getBoolean("should_delay_first_android_view_draw");
  }
  
  public boolean shouldDestroyEngineWithHost()
  {
    boolean bool1 = getArguments().getBoolean("destroy_engine_with_fragment", false);
    boolean bool2 = bool1;
    if (getCachedEngineId() == null) {
      if (delegate.isFlutterEngineFromHost()) {
        bool2 = bool1;
      } else {
        bool2 = getArguments().getBoolean("destroy_engine_with_fragment", true);
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
    return getArguments().getBoolean("handle_deeplinking");
  }
  
  public boolean shouldRestoreAndSaveState()
  {
    if (getArguments().containsKey("enable_state_restoration")) {
      return getArguments().getBoolean("enable_state_restoration");
    }
    return getCachedEngineId() == null;
  }
  
  public void updateSystemUiOverlays()
  {
    FlutterActivityAndFragmentDelegate localFlutterActivityAndFragmentDelegate = delegate;
    if (localFlutterActivityAndFragmentDelegate != null) {
      localFlutterActivityAndFragmentDelegate.updateSystemUiOverlays();
    }
  }
  
  public static @interface ActivityCallThrough {}
  
  public static class CachedEngineFragmentBuilder
  {
    private boolean destroyEngineWithFragment = false;
    private final String engineId;
    private final Class<? extends FlutterFragment> fragmentClass;
    private boolean handleDeeplinking = false;
    private RenderMode renderMode = RenderMode.surface;
    private boolean shouldAttachEngineToActivity = true;
    private boolean shouldAutomaticallyHandleOnBackPressed = false;
    private boolean shouldDelayFirstAndroidViewDraw = false;
    private TransparencyMode transparencyMode = TransparencyMode.transparent;
    
    public CachedEngineFragmentBuilder(Class<? extends FlutterFragment> paramClass, String paramString)
    {
      fragmentClass = paramClass;
      engineId = paramString;
    }
    
    private CachedEngineFragmentBuilder(String paramString)
    {
      this(FlutterFragment.class, paramString);
    }
    
    public <T extends FlutterFragment> T build()
    {
      try
      {
        localObject = (FlutterFragment)fragmentClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        if (localObject != null)
        {
          ((i)localObject).setArguments(createArgs());
          return (T)localObject;
        }
        RuntimeException localRuntimeException = new java/lang/RuntimeException;
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        ((StringBuilder)localObject).append("The FlutterFragment subclass sent in the constructor (");
        ((StringBuilder)localObject).append(fragmentClass.getCanonicalName());
        ((StringBuilder)localObject).append(") does not match the expected return type.");
        localRuntimeException.<init>(((StringBuilder)localObject).toString());
        throw localRuntimeException;
      }
      catch (Exception localException)
      {
        Object localObject = f.l("Could not instantiate FlutterFragment subclass (");
        ((StringBuilder)localObject).append(fragmentClass.getName());
        ((StringBuilder)localObject).append(")");
        throw new RuntimeException(((StringBuilder)localObject).toString(), localException);
      }
    }
    
    public Bundle createArgs()
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("cached_engine_id", engineId);
      localBundle.putBoolean("destroy_engine_with_fragment", destroyEngineWithFragment);
      localBundle.putBoolean("handle_deeplinking", handleDeeplinking);
      Object localObject = renderMode;
      if (localObject == null) {
        localObject = RenderMode.surface;
      }
      localBundle.putString("flutterview_render_mode", ((Enum)localObject).name());
      localObject = transparencyMode;
      if (localObject == null) {
        localObject = TransparencyMode.transparent;
      }
      localBundle.putString("flutterview_transparency_mode", ((Enum)localObject).name());
      localBundle.putBoolean("should_attach_engine_to_activity", shouldAttachEngineToActivity);
      localBundle.putBoolean("should_automatically_handle_on_back_pressed", shouldAutomaticallyHandleOnBackPressed);
      localBundle.putBoolean("should_delay_first_android_view_draw", shouldDelayFirstAndroidViewDraw);
      return localBundle;
    }
    
    public CachedEngineFragmentBuilder destroyEngineWithFragment(boolean paramBoolean)
    {
      destroyEngineWithFragment = paramBoolean;
      return this;
    }
    
    public CachedEngineFragmentBuilder handleDeeplinking(Boolean paramBoolean)
    {
      handleDeeplinking = paramBoolean.booleanValue();
      return this;
    }
    
    public CachedEngineFragmentBuilder renderMode(RenderMode paramRenderMode)
    {
      renderMode = paramRenderMode;
      return this;
    }
    
    public CachedEngineFragmentBuilder shouldAttachEngineToActivity(boolean paramBoolean)
    {
      shouldAttachEngineToActivity = paramBoolean;
      return this;
    }
    
    public CachedEngineFragmentBuilder shouldAutomaticallyHandleOnBackPressed(boolean paramBoolean)
    {
      shouldAutomaticallyHandleOnBackPressed = paramBoolean;
      return this;
    }
    
    public CachedEngineFragmentBuilder shouldDelayFirstAndroidViewDraw(boolean paramBoolean)
    {
      shouldDelayFirstAndroidViewDraw = paramBoolean;
      return this;
    }
    
    public CachedEngineFragmentBuilder transparencyMode(TransparencyMode paramTransparencyMode)
    {
      transparencyMode = paramTransparencyMode;
      return this;
    }
  }
  
  public static class NewEngineFragmentBuilder
  {
    private String appBundlePath = null;
    private String dartEntrypoint = "main";
    private List<String> dartEntrypointArgs;
    private String dartLibraryUri = null;
    private final Class<? extends FlutterFragment> fragmentClass;
    private boolean handleDeeplinking = false;
    private String initialRoute = "/";
    private RenderMode renderMode = RenderMode.surface;
    private FlutterShellArgs shellArgs = null;
    private boolean shouldAttachEngineToActivity = true;
    private boolean shouldAutomaticallyHandleOnBackPressed = false;
    private boolean shouldDelayFirstAndroidViewDraw = false;
    private TransparencyMode transparencyMode = TransparencyMode.transparent;
    
    public NewEngineFragmentBuilder()
    {
      fragmentClass = FlutterFragment.class;
    }
    
    public NewEngineFragmentBuilder(Class<? extends FlutterFragment> paramClass)
    {
      fragmentClass = paramClass;
    }
    
    public NewEngineFragmentBuilder appBundlePath(String paramString)
    {
      appBundlePath = paramString;
      return this;
    }
    
    public <T extends FlutterFragment> T build()
    {
      try
      {
        Object localObject1 = (FlutterFragment)fragmentClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        if (localObject1 != null)
        {
          ((i)localObject1).setArguments(createArgs());
          return (T)localObject1;
        }
        localObject2 = new java/lang/RuntimeException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append("The FlutterFragment subclass sent in the constructor (");
        ((StringBuilder)localObject1).append(fragmentClass.getCanonicalName());
        ((StringBuilder)localObject1).append(") does not match the expected return type.");
        ((RuntimeException)localObject2).<init>(((StringBuilder)localObject1).toString());
        throw ((Throwable)localObject2);
      }
      catch (Exception localException)
      {
        Object localObject2 = f.l("Could not instantiate FlutterFragment subclass (");
        ((StringBuilder)localObject2).append(fragmentClass.getName());
        ((StringBuilder)localObject2).append(")");
        throw new RuntimeException(((StringBuilder)localObject2).toString(), localException);
      }
    }
    
    public Bundle createArgs()
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("initial_route", initialRoute);
      localBundle.putBoolean("handle_deeplinking", handleDeeplinking);
      localBundle.putString("app_bundle_path", appBundlePath);
      localBundle.putString("dart_entrypoint", dartEntrypoint);
      localBundle.putString("dart_entrypoint_uri", dartLibraryUri);
      if (dartEntrypointArgs != null) {
        localObject = new ArrayList(dartEntrypointArgs);
      } else {
        localObject = null;
      }
      localBundle.putStringArrayList("dart_entrypoint_args", (ArrayList)localObject);
      Object localObject = shellArgs;
      if (localObject != null) {
        localBundle.putStringArray("initialization_args", ((FlutterShellArgs)localObject).toArray());
      }
      localObject = renderMode;
      if (localObject == null) {
        localObject = RenderMode.surface;
      }
      localBundle.putString("flutterview_render_mode", ((Enum)localObject).name());
      localObject = transparencyMode;
      if (localObject == null) {
        localObject = TransparencyMode.transparent;
      }
      localBundle.putString("flutterview_transparency_mode", ((Enum)localObject).name());
      localBundle.putBoolean("should_attach_engine_to_activity", shouldAttachEngineToActivity);
      localBundle.putBoolean("destroy_engine_with_fragment", true);
      localBundle.putBoolean("should_automatically_handle_on_back_pressed", shouldAutomaticallyHandleOnBackPressed);
      localBundle.putBoolean("should_delay_first_android_view_draw", shouldDelayFirstAndroidViewDraw);
      return localBundle;
    }
    
    public NewEngineFragmentBuilder dartEntrypoint(String paramString)
    {
      dartEntrypoint = paramString;
      return this;
    }
    
    public NewEngineFragmentBuilder dartEntrypointArgs(List<String> paramList)
    {
      dartEntrypointArgs = paramList;
      return this;
    }
    
    public NewEngineFragmentBuilder dartLibraryUri(String paramString)
    {
      dartLibraryUri = paramString;
      return this;
    }
    
    public NewEngineFragmentBuilder flutterShellArgs(FlutterShellArgs paramFlutterShellArgs)
    {
      shellArgs = paramFlutterShellArgs;
      return this;
    }
    
    public NewEngineFragmentBuilder handleDeeplinking(Boolean paramBoolean)
    {
      handleDeeplinking = paramBoolean.booleanValue();
      return this;
    }
    
    public NewEngineFragmentBuilder initialRoute(String paramString)
    {
      initialRoute = paramString;
      return this;
    }
    
    public NewEngineFragmentBuilder renderMode(RenderMode paramRenderMode)
    {
      renderMode = paramRenderMode;
      return this;
    }
    
    public NewEngineFragmentBuilder shouldAttachEngineToActivity(boolean paramBoolean)
    {
      shouldAttachEngineToActivity = paramBoolean;
      return this;
    }
    
    public NewEngineFragmentBuilder shouldAutomaticallyHandleOnBackPressed(boolean paramBoolean)
    {
      shouldAutomaticallyHandleOnBackPressed = paramBoolean;
      return this;
    }
    
    public NewEngineFragmentBuilder shouldDelayFirstAndroidViewDraw(boolean paramBoolean)
    {
      shouldDelayFirstAndroidViewDraw = paramBoolean;
      return this;
    }
    
    public NewEngineFragmentBuilder transparencyMode(TransparencyMode paramTransparencyMode)
    {
      transparencyMode = paramTransparencyMode;
      return this;
    }
  }
  
  public static class NewEngineInGroupFragmentBuilder
  {
    private final String cachedEngineGroupId;
    private String dartEntrypoint = "main";
    private final Class<? extends FlutterFragment> fragmentClass;
    private boolean handleDeeplinking = false;
    private String initialRoute = "/";
    private RenderMode renderMode = RenderMode.surface;
    private boolean shouldAttachEngineToActivity = true;
    private boolean shouldAutomaticallyHandleOnBackPressed = false;
    private boolean shouldDelayFirstAndroidViewDraw = false;
    private TransparencyMode transparencyMode = TransparencyMode.transparent;
    
    public NewEngineInGroupFragmentBuilder(Class<? extends FlutterFragment> paramClass, String paramString)
    {
      fragmentClass = paramClass;
      cachedEngineGroupId = paramString;
    }
    
    public NewEngineInGroupFragmentBuilder(String paramString)
    {
      this(FlutterFragment.class, paramString);
    }
    
    public <T extends FlutterFragment> T build()
    {
      try
      {
        localObject = (FlutterFragment)fragmentClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        if (localObject != null)
        {
          ((i)localObject).setArguments(createArgs());
          return (T)localObject;
        }
        localObject = new java/lang/RuntimeException;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("The FlutterFragment subclass sent in the constructor (");
        localStringBuilder.append(fragmentClass.getCanonicalName());
        localStringBuilder.append(") does not match the expected return type.");
        ((RuntimeException)localObject).<init>(localStringBuilder.toString());
        throw ((Throwable)localObject);
      }
      catch (Exception localException)
      {
        Object localObject = f.l("Could not instantiate FlutterFragment subclass (");
        ((StringBuilder)localObject).append(fragmentClass.getName());
        ((StringBuilder)localObject).append(")");
        throw new RuntimeException(((StringBuilder)localObject).toString(), localException);
      }
    }
    
    public Bundle createArgs()
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("cached_engine_group_id", cachedEngineGroupId);
      localBundle.putString("dart_entrypoint", dartEntrypoint);
      localBundle.putString("initial_route", initialRoute);
      localBundle.putBoolean("handle_deeplinking", handleDeeplinking);
      Object localObject = renderMode;
      if (localObject == null) {
        localObject = RenderMode.surface;
      }
      localBundle.putString("flutterview_render_mode", ((Enum)localObject).name());
      localObject = transparencyMode;
      if (localObject == null) {
        localObject = TransparencyMode.transparent;
      }
      localBundle.putString("flutterview_transparency_mode", ((Enum)localObject).name());
      localBundle.putBoolean("should_attach_engine_to_activity", shouldAttachEngineToActivity);
      localBundle.putBoolean("destroy_engine_with_fragment", true);
      localBundle.putBoolean("should_automatically_handle_on_back_pressed", shouldAutomaticallyHandleOnBackPressed);
      localBundle.putBoolean("should_delay_first_android_view_draw", shouldDelayFirstAndroidViewDraw);
      return localBundle;
    }
    
    public NewEngineInGroupFragmentBuilder dartEntrypoint(String paramString)
    {
      dartEntrypoint = paramString;
      return this;
    }
    
    public NewEngineInGroupFragmentBuilder handleDeeplinking(boolean paramBoolean)
    {
      handleDeeplinking = paramBoolean;
      return this;
    }
    
    public NewEngineInGroupFragmentBuilder initialRoute(String paramString)
    {
      initialRoute = paramString;
      return this;
    }
    
    public NewEngineInGroupFragmentBuilder renderMode(RenderMode paramRenderMode)
    {
      renderMode = paramRenderMode;
      return this;
    }
    
    public NewEngineInGroupFragmentBuilder shouldAttachEngineToActivity(boolean paramBoolean)
    {
      shouldAttachEngineToActivity = paramBoolean;
      return this;
    }
    
    public NewEngineInGroupFragmentBuilder shouldAutomaticallyHandleOnBackPressed(boolean paramBoolean)
    {
      shouldAutomaticallyHandleOnBackPressed = paramBoolean;
      return this;
    }
    
    public NewEngineInGroupFragmentBuilder shouldDelayFirstAndroidViewDraw(boolean paramBoolean)
    {
      shouldDelayFirstAndroidViewDraw = paramBoolean;
      return this;
    }
    
    public NewEngineInGroupFragmentBuilder transparencyMode(TransparencyMode paramTransparencyMode)
    {
      transparencyMode = paramTransparencyMode;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.FlutterFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */