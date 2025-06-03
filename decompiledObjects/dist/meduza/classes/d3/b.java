package d3;

import android.app.Activity;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.Display.Mode;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.ArrayList;
import java.util.HashMap;

public class b
  implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware
{
  public Activity a;
  
  public final Display a()
  {
    if (Build.VERSION.SDK_INT >= 30) {
      return a.a(a);
    }
    return ((WindowManager)a.getSystemService("window")).getDefaultDisplay();
  }
  
  public final void onAttachedToActivity(ActivityPluginBinding paramActivityPluginBinding)
  {
    a = paramActivityPluginBinding.getActivity();
  }
  
  public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    new MethodChannel(paramFlutterPluginBinding.getBinaryMessenger(), "flutter_display_mode").setMethodCallHandler(this);
  }
  
  public final void onDetachedFromActivity()
  {
    a = null;
  }
  
  public final void onDetachedFromActivityForConfigChanges()
  {
    onDetachedFromActivity();
  }
  
  public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding) {}
  
  public final void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    if (a == null)
    {
      paramResult.error("noActivity", "Activity not attached to plugin. App is probably in background.", null);
      return;
    }
    Object localObject1 = method;
    localObject1.getClass();
    int i = -1;
    int j = ((String)localObject1).hashCode();
    int k = 0;
    int m = 0;
    switch (j)
    {
    default: 
      break;
    case 2066137112: 
      if (((String)localObject1).equals("getSupportedModes")) {
        i = 3;
      }
      break;
    case 1746006463: 
      if (((String)localObject1).equals("getActiveMode")) {
        i = 2;
      }
      break;
    case 736998530: 
      if (((String)localObject1).equals("setPreferredMode")) {
        i = 1;
      }
      break;
    case -1726525938: 
      if (((String)localObject1).equals("getPreferredMode")) {
        i = 0;
      }
      break;
    }
    Object localObject2;
    Display.Mode[] arrayOfMode;
    switch (i)
    {
    default: 
      paramResult.notImplemented();
      break;
    case 3: 
      localObject2 = new ArrayList();
      arrayOfMode = a().getSupportedModes();
      k = arrayOfMode.length;
      for (i = m; i < k; i++)
      {
        paramMethodCall = arrayOfMode[i];
        localObject1 = new HashMap();
        ((HashMap)localObject1).put("id", Integer.valueOf(paramMethodCall.getModeId()));
        ((HashMap)localObject1).put("width", Integer.valueOf(paramMethodCall.getPhysicalWidth()));
        ((HashMap)localObject1).put("height", Integer.valueOf(paramMethodCall.getPhysicalHeight()));
        ((HashMap)localObject1).put("refreshRate", Float.valueOf(paramMethodCall.getRefreshRate()));
        ((ArrayList)localObject2).add(localObject1);
      }
      paramResult.success(localObject2);
      break;
    case 2: 
      paramMethodCall = a().getMode();
      localObject1 = new HashMap();
      ((HashMap)localObject1).put("id", Integer.valueOf(paramMethodCall.getModeId()));
      ((HashMap)localObject1).put("width", Integer.valueOf(paramMethodCall.getPhysicalWidth()));
      ((HashMap)localObject1).put("height", Integer.valueOf(paramMethodCall.getPhysicalHeight()));
      ((HashMap)localObject1).put("refreshRate", Float.valueOf(paramMethodCall.getRefreshRate()));
      paramResult.success(localObject1);
      break;
    case 1: 
      i = ((Integer)paramMethodCall.argument("mode")).intValue();
      localObject1 = a.getWindow();
      paramMethodCall = ((Window)localObject1).getAttributes();
      preferredDisplayModeId = i;
      ((Window)localObject1).setAttributes(paramMethodCall);
      paramResult.success(null);
      break;
    case 0: 
      localObject1 = a.getWindow().getAttributes();
      localObject2 = a().getSupportedModes();
      m = localObject2.length;
      paramMethodCall = Integer.valueOf(0);
      for (i = k; i < m; i++)
      {
        arrayOfMode = localObject2[i];
        if (preferredDisplayModeId == arrayOfMode.getModeId())
        {
          localObject1 = new HashMap();
          ((HashMap)localObject1).put("id", Integer.valueOf(arrayOfMode.getModeId()));
          ((HashMap)localObject1).put("width", Integer.valueOf(arrayOfMode.getPhysicalWidth()));
          ((HashMap)localObject1).put("height", Integer.valueOf(arrayOfMode.getPhysicalHeight()));
          paramMethodCall = Float.valueOf(arrayOfMode.getRefreshRate());
          break label627;
        }
      }
      localObject1 = new HashMap();
      ((HashMap)localObject1).put("id", paramMethodCall);
      ((HashMap)localObject1).put("width", paramMethodCall);
      ((HashMap)localObject1).put("height", paramMethodCall);
      paramMethodCall = Double.valueOf(0.0D);
      label627:
      ((HashMap)localObject1).put("refreshRate", paramMethodCall);
      paramResult.success(localObject1);
    }
  }
  
  public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding paramActivityPluginBinding)
  {
    onAttachedToActivity(paramActivityPluginBinding);
  }
}

/* Location:
 * Qualified Name:     d3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */