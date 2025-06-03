package za;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import ec.i;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;

public final class a
  implements FlutterPlugin
{
  public MethodChannel a;
  
  public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    i.e(paramFlutterPluginBinding, "binding");
    Object localObject = paramFlutterPluginBinding.getBinaryMessenger();
    i.d(localObject, "getBinaryMessenger(...)");
    paramFlutterPluginBinding = paramFlutterPluginBinding.getApplicationContext();
    i.d(paramFlutterPluginBinding, "getApplicationContext(...)");
    a = new MethodChannel((BinaryMessenger)localObject, "dev.fluttercommunity.plus/device_info");
    localObject = paramFlutterPluginBinding.getPackageManager();
    i.d(localObject, "getPackageManager(...)");
    paramFlutterPluginBinding = paramFlutterPluginBinding.getSystemService("activity");
    i.c(paramFlutterPluginBinding, "null cannot be cast to non-null type android.app.ActivityManager");
    localObject = new b((PackageManager)localObject, (ActivityManager)paramFlutterPluginBinding);
    paramFlutterPluginBinding = a;
    if (paramFlutterPluginBinding != null)
    {
      paramFlutterPluginBinding.setMethodCallHandler((MethodChannel.MethodCallHandler)localObject);
      return;
    }
    i.i("methodChannel");
    throw null;
  }
  
  public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    i.e(paramFlutterPluginBinding, "binding");
    paramFlutterPluginBinding = a;
    if (paramFlutterPluginBinding != null)
    {
      paramFlutterPluginBinding.setMethodCallHandler(null);
      return;
    }
    i.i("methodChannel");
    throw null;
  }
}

/* Location:
 * Qualified Name:     za.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */