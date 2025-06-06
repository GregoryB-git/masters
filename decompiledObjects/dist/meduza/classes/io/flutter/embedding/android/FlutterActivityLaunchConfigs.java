package io.flutter.embedding.android;

import android.os.BaseBundle;
import android.os.Bundle;

public class FlutterActivityLaunchConfigs
{
  public static final String DART_ENTRYPOINT_META_DATA_KEY = "io.flutter.Entrypoint";
  public static final String DART_ENTRYPOINT_URI_META_DATA_KEY = "io.flutter.EntrypointUri";
  public static final String DEFAULT_BACKGROUND_MODE = BackgroundMode.opaque.name();
  public static final String DEFAULT_DART_ENTRYPOINT = "main";
  public static final String DEFAULT_INITIAL_ROUTE = "/";
  public static final String EXTRA_BACKGROUND_MODE = "background_mode";
  public static final String EXTRA_CACHED_ENGINE_GROUP_ID = "cached_engine_group_id";
  public static final String EXTRA_CACHED_ENGINE_ID = "cached_engine_id";
  public static final String EXTRA_DART_ENTRYPOINT = "dart_entrypoint";
  public static final String EXTRA_DART_ENTRYPOINT_ARGS = "dart_entrypoint_args";
  public static final String EXTRA_DESTROY_ENGINE_WITH_ACTIVITY = "destroy_engine_with_activity";
  public static final String EXTRA_ENABLE_STATE_RESTORATION = "enable_state_restoration";
  public static final String EXTRA_INITIAL_ROUTE = "route";
  public static final String HANDLE_DEEPLINKING_META_DATA_KEY = "flutter_deeplinking_enabled";
  public static final String INITIAL_ROUTE_META_DATA_KEY = "io.flutter.InitialRoute";
  public static final String NORMAL_THEME_META_DATA_KEY = "io.flutter.embedding.android.NormalTheme";
  
  public static boolean deepLinkEnabled(Bundle paramBundle)
  {
    if ((paramBundle != null) && (paramBundle.containsKey("flutter_deeplinking_enabled"))) {
      return paramBundle.getBoolean("flutter_deeplinking_enabled");
    }
    return true;
  }
  
  public static enum BackgroundMode
  {
    private BackgroundMode() {}
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.FlutterActivityLaunchConfigs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */