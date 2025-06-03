package io.flutter.embedding.android;

import android.os.BaseBundle;
import android.os.Bundle;
import f;
import java.lang.reflect.Constructor;
import x0.i;

public class FlutterFragment$CachedEngineFragmentBuilder
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
  
  public FlutterFragment$CachedEngineFragmentBuilder(Class<? extends FlutterFragment> paramClass, String paramString)
  {
    fragmentClass = paramClass;
    engineId = paramString;
  }
  
  private FlutterFragment$CachedEngineFragmentBuilder(String paramString)
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

/* Location:
 * Qualified Name:     io.flutter.embedding.android.FlutterFragment.CachedEngineFragmentBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */