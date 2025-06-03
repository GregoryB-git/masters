package io.flutter.embedding.android;

import android.os.BaseBundle;
import android.os.Bundle;
import f;
import io.flutter.embedding.engine.FlutterShellArgs;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import x0.i;

public class FlutterFragment$NewEngineFragmentBuilder
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
  
  public FlutterFragment$NewEngineFragmentBuilder()
  {
    fragmentClass = FlutterFragment.class;
  }
  
  public FlutterFragment$NewEngineFragmentBuilder(Class<? extends FlutterFragment> paramClass)
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

/* Location:
 * Qualified Name:     io.flutter.embedding.android.FlutterFragment.NewEngineFragmentBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */