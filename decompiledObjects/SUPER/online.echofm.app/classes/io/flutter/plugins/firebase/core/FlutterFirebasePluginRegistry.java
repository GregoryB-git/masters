package io.flutter.plugins.firebase.core;

import androidx.annotation.Keep;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import s3.e;

@Keep
public class FlutterFirebasePluginRegistry
{
  private static final Map<String, FlutterFirebasePlugin> registeredPlugins = new WeakHashMap();
  
  public static V2.j didReinitializeFirebaseCore()
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new J5.j(localk));
    return localk.a();
  }
  
  public static V2.j getPluginConstantsForFirebaseApp(e parame)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new J5.k(parame, localk));
    return localk.a();
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