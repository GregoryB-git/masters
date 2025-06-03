package ra;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.util.Log;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.EventChannel.EventSink;
import io.flutter.plugin.common.EventChannel.StreamHandler;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.PluginRegistry.NewIntentListener;

public class a
  implements FlutterPlugin, MethodChannel.MethodCallHandler, EventChannel.StreamHandler, ActivityAware, PluginRegistry.NewIntentListener
{
  public MethodChannel a;
  public EventChannel b;
  public EventChannel.EventSink c;
  public ActivityPluginBinding d;
  public String e;
  public boolean f = false;
  public String o;
  
  public final boolean a(Intent paramIntent)
  {
    if (paramIntent == null) {
      return false;
    }
    Log.d("com.llfbandit.app_links", paramIntent.toString());
    if ((paramIntent.getFlags() & 0x100000) == 1048576) {
      return false;
    }
    Object localObject1 = paramIntent.getByteArrayExtra("com.google.firebase.dynamiclinks.DYNAMIC_LINK_DATA");
    Object localObject2 = null;
    Object localObject3;
    if ((localObject1 != null) && (localObject1.length != 0))
    {
      localObject3 = Parcel.obtain();
      ((Parcel)localObject3).unmarshall((byte[])localObject1, 0, localObject1.length);
      ((Parcel)localObject3).setDataPosition(0);
      int i = ((Parcel)localObject3).readInt();
      if ((i & 0xFFFF0000) != -65536) {
        i = i >> 16 & 0xFFFF;
      } else {
        i = ((Parcel)localObject3).readInt();
      }
      if (i != 0)
      {
        int j = ((Parcel)localObject3).dataPosition();
        localObject1 = ((Parcel)localObject3).readString();
        ((Parcel)localObject3).setDataPosition(j + i);
        break label144;
      }
    }
    localObject1 = null;
    label144:
    if (localObject1 != null)
    {
      paramIntent = new StringBuilder();
      paramIntent.append("handleIntent: (Data) (short deep link)");
      paramIntent.append((String)localObject1);
      Log.d("com.llfbandit.app_links", paramIntent.toString());
    }
    else
    {
      localObject3 = paramIntent.getAction();
      localObject1 = localObject2;
      if (!"android.intent.action.SEND".equals(localObject3))
      {
        localObject1 = localObject2;
        if (!"android.intent.action.SEND_MULTIPLE".equals(localObject3)) {
          if ("android.intent.action.SENDTO".equals(localObject3))
          {
            localObject1 = localObject2;
          }
          else
          {
            paramIntent = paramIntent.getDataString();
            localObject1 = paramIntent;
            if (paramIntent != null)
            {
              localObject1 = new StringBuilder();
              ((StringBuilder)localObject1).append("Handled intent: action: ");
              ((StringBuilder)localObject1).append((String)localObject3);
              ((StringBuilder)localObject1).append(" / data: ");
              ((StringBuilder)localObject1).append(paramIntent);
              Log.d("com.llfbandit.app_links", ((StringBuilder)localObject1).toString());
              localObject1 = paramIntent;
            }
          }
        }
      }
    }
    if (localObject1 == null) {
      return false;
    }
    if (e == null) {
      e = ((String)localObject1);
    }
    o = ((String)localObject1);
    paramIntent = c;
    if (paramIntent != null)
    {
      f = true;
      paramIntent.success(localObject1);
    }
    return true;
  }
  
  public final void onAttachedToActivity(ActivityPluginBinding paramActivityPluginBinding)
  {
    d = paramActivityPluginBinding;
    paramActivityPluginBinding.addOnNewIntentListener(this);
    a(paramActivityPluginBinding.getActivity().getIntent());
  }
  
  public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    MethodChannel localMethodChannel = new MethodChannel(paramFlutterPluginBinding.getBinaryMessenger(), "com.llfbandit.app_links/messages");
    a = localMethodChannel;
    localMethodChannel.setMethodCallHandler(this);
    paramFlutterPluginBinding = new EventChannel(paramFlutterPluginBinding.getBinaryMessenger(), "com.llfbandit.app_links/events");
    b = paramFlutterPluginBinding;
    paramFlutterPluginBinding.setStreamHandler(this);
  }
  
  public final void onCancel(Object paramObject)
  {
    c = null;
  }
  
  public final void onDetachedFromActivity()
  {
    ActivityPluginBinding localActivityPluginBinding = d;
    if (localActivityPluginBinding != null) {
      localActivityPluginBinding.removeOnNewIntentListener(this);
    }
    d = null;
  }
  
  public final void onDetachedFromActivityForConfigChanges()
  {
    onDetachedFromActivity();
  }
  
  public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    a.setMethodCallHandler(null);
    b.setStreamHandler(null);
  }
  
  public final void onListen(Object paramObject, EventChannel.EventSink paramEventSink)
  {
    c = paramEventSink;
    if (!f)
    {
      paramObject = e;
      if (paramObject != null)
      {
        f = true;
        paramEventSink.success(paramObject);
      }
    }
  }
  
  public final void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    if (method.equals("getLatestLink")) {}
    for (paramMethodCall = o;; paramMethodCall = e)
    {
      paramResult.success(paramMethodCall);
      return;
      if (!method.equals("getInitialLink")) {
        break;
      }
    }
    paramResult.notImplemented();
  }
  
  public final boolean onNewIntent(Intent paramIntent)
  {
    return a(paramIntent);
  }
  
  public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding paramActivityPluginBinding)
  {
    d = paramActivityPluginBinding;
    paramActivityPluginBinding.addOnNewIntentListener(this);
  }
}

/* Location:
 * Qualified Name:     ra.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */