package io.flutter.embedding.android;

import android.content.Context;
import android.content.Intent;

public class FlutterFragmentActivity$CachedEngineIntentBuilder
{
  private final Class<? extends FlutterFragmentActivity> activityClass;
  private String backgroundMode = FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;
  private final String cachedEngineId;
  private boolean destroyEngineWithActivity = false;
  
  public FlutterFragmentActivity$CachedEngineIntentBuilder(Class<? extends FlutterFragmentActivity> paramClass, String paramString)
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

/* Location:
 * Qualified Name:     io.flutter.embedding.android.FlutterFragmentActivity.CachedEngineIntentBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */