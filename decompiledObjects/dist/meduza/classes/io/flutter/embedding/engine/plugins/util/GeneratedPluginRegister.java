package io.flutter.embedding.engine.plugins.util;

import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.GeneratedPluginRegistrant;
import java.lang.reflect.Method;

public class GeneratedPluginRegister
{
  private static final String TAG = "GeneratedPluginsRegister";
  
  public static void registerGeneratedPlugins(FlutterEngine paramFlutterEngine)
  {
    try
    {
      GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", new Class[] { FlutterEngine.class }).invoke(null, new Object[] { paramFlutterEngine });
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Tried to automatically register plugins with FlutterEngine (");
      localStringBuilder.append(paramFlutterEngine);
      localStringBuilder.append(") but could not find or invoke the GeneratedPluginRegistrant.");
      Log.e("GeneratedPluginsRegister", localStringBuilder.toString());
      Log.e("GeneratedPluginsRegister", "Received exception while registering", localException);
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.plugins.util.GeneratedPluginRegister
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */