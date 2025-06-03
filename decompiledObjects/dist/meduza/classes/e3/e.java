package e3;

import android.app.Activity;
import android.content.Context;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodChannel;
import p2.m0;

public final class e
  implements FlutterPlugin, ActivityAware
{
  public f a;
  public MethodChannel b;
  public ActivityPluginBinding c;
  
  public final void onAttachedToActivity(ActivityPluginBinding paramActivityPluginBinding)
  {
    Activity localActivity = paramActivityPluginBinding.getActivity();
    f localf = a;
    if (localf != null) {
      c = localActivity;
    }
    c = paramActivityPluginBinding;
    paramActivityPluginBinding.addActivityResultListener(localf);
    c.addRequestPermissionsResultListener(a);
  }
  
  public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    a = new f(paramFlutterPluginBinding.getApplicationContext());
    Context localContext = paramFlutterPluginBinding.getApplicationContext();
    paramFlutterPluginBinding = new MethodChannel(paramFlutterPluginBinding.getBinaryMessenger(), "flutter.baseflow.com/permissions/methods");
    b = paramFlutterPluginBinding;
    paramFlutterPluginBinding.setMethodCallHandler(new d(localContext, new m0(), a, new h()));
  }
  
  public final void onDetachedFromActivity()
  {
    f localf = a;
    if (localf != null) {
      c = null;
    }
    ActivityPluginBinding localActivityPluginBinding = c;
    if (localActivityPluginBinding != null)
    {
      localActivityPluginBinding.removeActivityResultListener(localf);
      c.removeRequestPermissionsResultListener(a);
    }
    c = null;
  }
  
  public final void onDetachedFromActivityForConfigChanges()
  {
    onDetachedFromActivity();
  }
  
  public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    b.setMethodCallHandler(null);
    b = null;
  }
  
  public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding paramActivityPluginBinding)
  {
    onAttachedToActivity(paramActivityPluginBinding);
  }
}

/* Location:
 * Qualified Name:     e3.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */