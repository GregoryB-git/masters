package io.flutter.plugins.urllauncher;

import android.util.Log;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;

public final class UrlLauncherPlugin
  implements FlutterPlugin, ActivityAware
{
  private static final String TAG = "UrlLauncherPlugin";
  private UrlLauncher urlLauncher;
  
  public void onAttachedToActivity(ActivityPluginBinding paramActivityPluginBinding)
  {
    UrlLauncher localUrlLauncher = urlLauncher;
    if (localUrlLauncher == null)
    {
      Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
      return;
    }
    localUrlLauncher.setActivity(paramActivityPluginBinding.getActivity());
  }
  
  public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    urlLauncher = new UrlLauncher(paramFlutterPluginBinding.getApplicationContext());
    b.g(paramFlutterPluginBinding.getBinaryMessenger(), urlLauncher);
  }
  
  public void onDetachedFromActivity()
  {
    UrlLauncher localUrlLauncher = urlLauncher;
    if (localUrlLauncher == null)
    {
      Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
      return;
    }
    localUrlLauncher.setActivity(null);
  }
  
  public void onDetachedFromActivityForConfigChanges()
  {
    onDetachedFromActivity();
  }
  
  public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    if (urlLauncher == null)
    {
      Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
      return;
    }
    b.g(paramFlutterPluginBinding.getBinaryMessenger(), null);
    urlLauncher = null;
  }
  
  public void onReattachedToActivityForConfigChanges(ActivityPluginBinding paramActivityPluginBinding)
  {
    onAttachedToActivity(paramActivityPluginBinding);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.urllauncher.UrlLauncherPlugin
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */