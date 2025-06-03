package sa;

import android.media.AudioManager;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class f
  implements FlutterPlugin, MethodChannel.MethodCallHandler
{
  public static Map<?, ?> c;
  public static ArrayList d = new ArrayList();
  public MethodChannel a;
  public e b;
  
  public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    BinaryMessenger localBinaryMessenger = paramFlutterPluginBinding.getBinaryMessenger();
    MethodChannel localMethodChannel = new MethodChannel(localBinaryMessenger, "com.ryanheise.audio_session");
    a = localMethodChannel;
    localMethodChannel.setMethodCallHandler(this);
    b = new e(localBinaryMessenger, paramFlutterPluginBinding.getApplicationContext());
    d.add(this);
  }
  
  public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    a.setMethodCallHandler(null);
    a = null;
    paramFlutterPluginBinding = b;
    b.setMethodCallHandler(null);
    ca.remove(paramFlutterPluginBinding);
    int i;
    if (ca.size() == 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      e.a locala = e.c;
      locala.a();
      f.unregisterAudioDeviceCallback(g);
      e = null;
      f = null;
      e.c = null;
    }
    b = null;
    b = null;
    d.remove(this);
  }
  
  public final void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    Object localObject = (List)arguments;
    paramMethodCall = method;
    paramMethodCall.getClass();
    if (!paramMethodCall.equals("setConfiguration"))
    {
      if (!paramMethodCall.equals("getConfiguration")) {
        paramResult.notImplemented();
      } else {
        paramResult.success(c);
      }
    }
    else
    {
      c = (Map)((List)localObject).get(0);
      paramResult.success(null);
      paramMethodCall = c;
      localObject = d.iterator();
      while (((Iterator)localObject).hasNext())
      {
        f localf = (f)((Iterator)localObject).next();
        paramResult = new ArrayList(Arrays.asList(new Object[] { paramMethodCall }));
        a.invokeMethod("onConfigurationChanged", paramResult);
      }
    }
  }
}

/* Location:
 * Qualified Name:     sa.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */