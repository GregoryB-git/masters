package io.flutter.embedding.android;

import android.os.BaseBundle;
import android.os.Bundle;
import f;
import java.lang.reflect.Constructor;
import x0.i;

public class FlutterFragment$NewEngineInGroupFragmentBuilder
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
  
  public FlutterFragment$NewEngineInGroupFragmentBuilder(Class<? extends FlutterFragment> paramClass, String paramString)
  {
    fragmentClass = paramClass;
    cachedEngineGroupId = paramString;
  }
  
  public FlutterFragment$NewEngineInGroupFragmentBuilder(String paramString)
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

/* Location:
 * Qualified Name:     io.flutter.embedding.android.FlutterFragment.NewEngineInGroupFragmentBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */