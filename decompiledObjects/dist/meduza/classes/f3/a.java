package f3;

import android.app.Activity;
import android.content.Context;
import ec.i;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public abstract class a
  implements FlutterPlugin, ActivityAware, MethodChannel.MethodCallHandler
{
  public MethodChannel a;
  public WeakReference<Activity> b = new WeakReference(null);
  public WeakReference<Context> c = new WeakReference(null);
  
  public final Context a()
  {
    Context localContext = (Context)c.get();
    Object localObject = localContext;
    if (localContext == null)
    {
      localObject = (Activity)b.get();
      if (localObject != null) {
        localObject = ((Context)localObject).getApplicationContext();
      } else {
        localObject = null;
      }
    }
    return (Context)localObject;
  }
  
  public final void onAttachedToActivity(ActivityPluginBinding paramActivityPluginBinding)
  {
    i.e(paramActivityPluginBinding, "binding");
    b = new WeakReference(paramActivityPluginBinding.getActivity());
  }
  
  public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    i.e(paramFlutterPluginBinding, "flutterPluginBinding");
    MethodChannel localMethodChannel = new MethodChannel(paramFlutterPluginBinding.getBinaryMessenger(), d);
    a = localMethodChannel;
    localMethodChannel.setMethodCallHandler(this);
    c = new WeakReference(paramFlutterPluginBinding.getApplicationContext());
  }
  
  public final void onDetachedFromActivity()
  {
    b.clear();
  }
  
  public final void onDetachedFromActivityForConfigChanges()
  {
    b.clear();
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
    i.i("channel");
    throw null;
  }
  
  public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding paramActivityPluginBinding)
  {
    i.e(paramActivityPluginBinding, "binding");
    b = new WeakReference(paramActivityPluginBinding.getActivity());
  }
}

/* Location:
 * Qualified Name:     f3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */