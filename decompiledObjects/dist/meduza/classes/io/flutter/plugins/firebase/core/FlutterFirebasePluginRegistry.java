package io.flutter.plugins.firebase.core;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

public class FlutterFirebasePluginRegistry
{
  private static final Map<String, FlutterFirebasePlugin> registeredPlugins = new WeakHashMap();
  
  public static Task<Void> didReinitializeFirebaseCore()
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new a(0, localTaskCompletionSource));
    return localTaskCompletionSource.getTask();
  }
  
  public static Task<Map<String, Object>> getPluginConstantsForFirebaseApp(u7.f paramf)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new io.flutter.plugins.firebase.auth.f(paramf, localTaskCompletionSource, 1));
    return localTaskCompletionSource.getTask();
  }
  
  public static void registerPlugin(String paramString, FlutterFirebasePlugin paramFlutterFirebasePlugin)
  {
    registeredPlugins.put(paramString, paramFlutterFirebasePlugin);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */