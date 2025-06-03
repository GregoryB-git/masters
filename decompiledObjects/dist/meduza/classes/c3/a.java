package c3;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import b.e;
import ec.i;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.PluginRegistry.ActivityResultListener;
import p.o;
import p.o.d;

public final class a
  implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware, PluginRegistry.ActivityResultListener
{
  public static MethodChannel.Result d;
  public static e e;
  public final int a = 1001;
  public MethodChannel b;
  public ActivityPluginBinding c;
  
  public final boolean onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == a)
    {
      paramIntent = d;
      if (paramIntent != null)
      {
        paramIntent.error("authorization-error/canceled", "The user closed the Custom Tab", null);
        d = null;
        e = null;
      }
    }
    return false;
  }
  
  public final void onAttachedToActivity(ActivityPluginBinding paramActivityPluginBinding)
  {
    i.e(paramActivityPluginBinding, "binding");
    c = paramActivityPluginBinding;
    paramActivityPluginBinding.addActivityResultListener(this);
  }
  
  public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    i.e(paramFlutterPluginBinding, "flutterPluginBinding");
    paramFlutterPluginBinding = new MethodChannel(paramFlutterPluginBinding.getBinaryMessenger(), "com.aboutyou.dart_packages.sign_in_with_apple");
    b = paramFlutterPluginBinding;
    paramFlutterPluginBinding.setMethodCallHandler(this);
  }
  
  public final void onDetachedFromActivity()
  {
    ActivityPluginBinding localActivityPluginBinding = c;
    if (localActivityPluginBinding != null) {
      localActivityPluginBinding.removeActivityResultListener(this);
    }
    c = null;
  }
  
  public final void onDetachedFromActivityForConfigChanges()
  {
    onDetachedFromActivity();
  }
  
  public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    i.e(paramFlutterPluginBinding, "binding");
    paramFlutterPluginBinding = b;
    if (paramFlutterPluginBinding != null) {
      paramFlutterPluginBinding.setMethodCallHandler(null);
    }
    b = null;
  }
  
  public final void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    i.e(paramMethodCall, "call");
    i.e(paramResult, "result");
    Object localObject = method;
    if (i.a(localObject, "isAvailable"))
    {
      paramResult.success(Boolean.TRUE);
    }
    else if (i.a(localObject, "performAuthorizationRequest"))
    {
      localObject = c;
      if (localObject != null) {
        localObject = ((ActivityPluginBinding)localObject).getActivity();
      } else {
        localObject = null;
      }
      String str;
      if (localObject == null)
      {
        paramMethodCall = arguments;
        localObject = "MISSING_ACTIVITY";
        str = "Plugin is not attached to an activity";
      }
      else
      {
        str = (String)paramMethodCall.argument("url");
        if (str != null) {
          break label126;
        }
        paramMethodCall = arguments;
        localObject = "MISSING_ARG";
        str = "Missing 'url' argument";
      }
      paramResult.error((String)localObject, str, paramMethodCall);
      return;
      label126:
      paramMethodCall = d;
      if (paramMethodCall != null) {
        paramMethodCall.error("NEW_REQUEST", "A new request came in while this was still pending. The previous request (this one) was then cancelled.", null);
      }
      paramMethodCall = e;
      if (paramMethodCall != null) {
        paramMethodCall.invoke();
      }
      d = paramResult;
      e = new e((Activity)localObject, 1);
      paramMethodCall = new o.d().a();
      a.setData(Uri.parse(str));
      ((Activity)localObject).startActivityForResult(a, a, b);
    }
    else
    {
      paramResult.notImplemented();
    }
  }
  
  public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding paramActivityPluginBinding)
  {
    i.e(paramActivityPluginBinding, "binding");
    onAttachedToActivity(paramActivityPluginBinding);
  }
}

/* Location:
 * Qualified Name:     c3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */