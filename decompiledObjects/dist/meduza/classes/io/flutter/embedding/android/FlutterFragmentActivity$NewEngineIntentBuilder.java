package io.flutter.embedding.android;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

public class FlutterFragmentActivity$NewEngineIntentBuilder
{
  private final Class<? extends FlutterFragmentActivity> activityClass;
  private String backgroundMode = FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;
  private List<String> dartEntrypointArgs;
  private String initialRoute = "/";
  
  public FlutterFragmentActivity$NewEngineIntentBuilder(Class<? extends FlutterFragmentActivity> paramClass)
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

/* Location:
 * Qualified Name:     io.flutter.embedding.android.FlutterFragmentActivity.NewEngineIntentBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */