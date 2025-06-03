package io.flutter.embedding.android;

import android.content.Context;
import android.content.Intent;

public class FlutterFragmentActivity$NewEngineInGroupIntentBuilder
{
  private final Class<? extends FlutterFragmentActivity> activityClass;
  private String backgroundMode = FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;
  private final String cachedEngineGroupId;
  private String dartEntrypoint = "main";
  private String initialRoute = "/";
  
  public FlutterFragmentActivity$NewEngineInGroupIntentBuilder(Class<? extends FlutterFragmentActivity> paramClass, String paramString)
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

/* Location:
 * Qualified Name:     io.flutter.embedding.android.FlutterFragmentActivity.NewEngineInGroupIntentBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */