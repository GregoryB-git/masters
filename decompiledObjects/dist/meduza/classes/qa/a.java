package qa;

import android.content.Context;
import io.flutter.FlutterInjector;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineGroup;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.EventChannel.EventSink;
import io.flutter.plugin.common.EventChannel.StreamHandler;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.view.FlutterCallbackInformation;
import java.util.HashMap;
import java.util.LinkedList;

public class a
  implements FlutterPlugin, MethodChannel.MethodCallHandler, EventChannel.StreamHandler
{
  public LinkedList a;
  public HashMap b;
  public Context c;
  public FlutterEngineGroup d;
  
  public final void a()
  {
    b localb = (b)a.peek();
    FlutterInjector.instance().flutterLoader().ensureInitializationComplete(c, null);
    Object localObject = FlutterCallbackInformation.lookupCallbackInformation(d.longValue());
    localObject = d.createAndRunEngine(c, new DartExecutor.DartEntrypoint(FlutterInjector.instance().flutterLoader().findAppBundlePath(), callbackLibraryPath, callbackName));
    a = ((FlutterEngine)localObject);
    c = new MethodChannel(((FlutterEngine)localObject).getDartExecutor().getBinaryMessenger(), "com.lib.dart_ui_isolate/control");
    new EventChannel(a.getDartExecutor().getBinaryMessenger(), "com.lib.dart_ui_isolate/event").setStreamHandler(this);
    c.setMethodCallHandler(this);
  }
  
  public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    d = new FlutterEngineGroup(paramFlutterPluginBinding.getApplicationContext());
    BinaryMessenger localBinaryMessenger = paramFlutterPluginBinding.getBinaryMessenger();
    c = paramFlutterPluginBinding.getApplicationContext();
    paramFlutterPluginBinding = new MethodChannel(localBinaryMessenger, "com.lib.dart_ui_isolate/control");
    a = new LinkedList();
    b = new HashMap();
    paramFlutterPluginBinding.setMethodCallHandler(this);
  }
  
  public final void onCancel(Object paramObject) {}
  
  public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding) {}
  
  public final void onListen(Object paramObject, EventChannel.EventSink paramEventSink)
  {
    if (a.size() != 0)
    {
      paramObject = (b)a.remove();
      paramEventSink.success(b);
      paramEventSink.endOfStream();
      b.put(b, paramObject);
      e.success(null);
      e = null;
    }
    if (a.size() != 0) {
      a();
    }
  }
  
  public final void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    Object localObject1;
    if (method.equals("spawn_isolate"))
    {
      localObject1 = new b();
      Object localObject2 = paramMethodCall.argument("entry_point");
      if ((localObject2 instanceof Long)) {
        d = ((Long)localObject2);
      }
      if ((localObject2 instanceof Integer)) {
        d = Long.valueOf(((Integer)localObject2).intValue());
      }
      b = ((String)paramMethodCall.argument("isolate_id"));
      e = paramResult;
      a.add(localObject1);
      if (a.size() == 1) {
        a();
      }
    }
    else if (method.equals("kill_isolate"))
    {
      localObject1 = (String)paramMethodCall.argument("isolate_id");
      try
      {
        b.get(localObject1)).a.destroy();
      }
      catch (Exception paramMethodCall)
      {
        paramMethodCall.printStackTrace();
      }
      b.remove(localObject1);
      paramResult.success(Boolean.TRUE);
    }
    else
    {
      paramResult.notImplemented();
    }
  }
}

/* Location:
 * Qualified Name:     qa.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */