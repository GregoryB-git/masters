package bb;

import android.content.Context;
import ec.i;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.PluginRegistry.ActivityResultListener;

public final class e
  implements FlutterPlugin, ActivityAware
{
  public d a;
  public f b;
  public MethodChannel c;
  
  public final void onAttachedToActivity(ActivityPluginBinding paramActivityPluginBinding)
  {
    i.e(paramActivityPluginBinding, "binding");
    Object localObject = b;
    if (localObject != null)
    {
      paramActivityPluginBinding.addActivityResultListener((PluginRegistry.ActivityResultListener)localObject);
      localObject = a;
      if (localObject != null)
      {
        b = paramActivityPluginBinding.getActivity();
        return;
      }
      i.i("share");
      throw null;
    }
    i.i("manager");
    throw null;
  }
  
  public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    i.e(paramFlutterPluginBinding, "binding");
    c = new MethodChannel(paramFlutterPluginBinding.getBinaryMessenger(), "dev.fluttercommunity.plus/share");
    Object localObject = paramFlutterPluginBinding.getApplicationContext();
    i.d(localObject, "getApplicationContext(...)");
    b = new f((Context)localObject);
    paramFlutterPluginBinding = paramFlutterPluginBinding.getApplicationContext();
    i.d(paramFlutterPluginBinding, "getApplicationContext(...)");
    localObject = b;
    if (localObject != null)
    {
      localObject = new d(paramFlutterPluginBinding, (f)localObject);
      a = ((d)localObject);
      paramFlutterPluginBinding = b;
      if (paramFlutterPluginBinding != null)
      {
        localObject = new a((d)localObject, paramFlutterPluginBinding);
        paramFlutterPluginBinding = c;
        if (paramFlutterPluginBinding != null)
        {
          paramFlutterPluginBinding.setMethodCallHandler((MethodChannel.MethodCallHandler)localObject);
          return;
        }
        i.i("methodChannel");
        throw null;
      }
      i.i("manager");
      throw null;
    }
    i.i("manager");
    throw null;
  }
  
  public final void onDetachedFromActivity()
  {
    d locald = a;
    if (locald != null)
    {
      b = null;
      return;
    }
    i.i("share");
    throw null;
  }
  
  public final void onDetachedFromActivityForConfigChanges()
  {
    onDetachedFromActivity();
  }
  
  public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    i.e(paramFlutterPluginBinding, "binding");
    paramFlutterPluginBinding = c;
    if (paramFlutterPluginBinding != null)
    {
      paramFlutterPluginBinding.setMethodCallHandler(null);
      return;
    }
    i.i("methodChannel");
    throw null;
  }
  
  public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding paramActivityPluginBinding)
  {
    i.e(paramActivityPluginBinding, "binding");
    onAttachedToActivity(paramActivityPluginBinding);
  }
}

/* Location:
 * Qualified Name:     bb.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */