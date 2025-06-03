package ya;

import android.content.Context;
import android.net.ConnectivityManager;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;

public class d
  implements FlutterPlugin
{
  public MethodChannel a;
  public EventChannel b;
  public b c;
  
  public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    Object localObject = paramFlutterPluginBinding.getBinaryMessenger();
    paramFlutterPluginBinding = paramFlutterPluginBinding.getApplicationContext();
    a = new MethodChannel((BinaryMessenger)localObject, "dev.fluttercommunity.plus/connectivity");
    b = new EventChannel((BinaryMessenger)localObject, "dev.fluttercommunity.plus/connectivity_status");
    a locala = new a((ConnectivityManager)paramFlutterPluginBinding.getSystemService("connectivity"));
    localObject = new c(locala);
    c = new b(paramFlutterPluginBinding, locala);
    a.setMethodCallHandler((MethodChannel.MethodCallHandler)localObject);
    b.setStreamHandler(c);
  }
  
  public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    a.setMethodCallHandler(null);
    b.setStreamHandler(null);
    c.onCancel(null);
    a = null;
    b = null;
    c = null;
  }
}

/* Location:
 * Qualified Name:     ya.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */