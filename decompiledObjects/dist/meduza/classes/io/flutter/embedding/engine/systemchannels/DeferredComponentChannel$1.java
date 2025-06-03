package io.flutter.embedding.engine.systemchannels;

import io.flutter.Log;
import io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class DeferredComponentChannel$1
  implements MethodChannel.MethodCallHandler
{
  public DeferredComponentChannel$1(DeferredComponentChannel paramDeferredComponentChannel) {}
  
  public void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    if (DeferredComponentChannel.access$000(this$0) == null) {
      return;
    }
    String str = method;
    Map localMap = (Map)paramMethodCall.arguments();
    paramMethodCall = new StringBuilder();
    paramMethodCall.append("Received '");
    paramMethodCall.append(str);
    paramMethodCall.append("' message.");
    Log.v("DeferredComponentChannel", paramMethodCall.toString());
    int i = ((Integer)localMap.get("loadingUnitId")).intValue();
    paramMethodCall = (String)localMap.get("componentName");
    str.getClass();
    int j = -1;
    switch (str.hashCode())
    {
    default: 
      break;
    case 520962947: 
      if (str.equals("installDeferredComponent")) {
        j = 2;
      }
      break;
    case 399701758: 
      if (str.equals("getDeferredComponentInstallState")) {
        j = 1;
      }
      break;
    case -1004447972: 
      if (str.equals("uninstallDeferredComponent")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      paramResult.notImplemented();
      break;
    case 2: 
      DeferredComponentChannel.access$000(this$0).installDeferredComponent(i, paramMethodCall);
      if (!DeferredComponentChannel.access$100(this$0).containsKey(paramMethodCall)) {
        DeferredComponentChannel.access$100(this$0).put(paramMethodCall, new ArrayList());
      }
      ((List)DeferredComponentChannel.access$100(this$0).get(paramMethodCall)).add(paramResult);
      break;
    case 1: 
    case 0: 
      for (paramMethodCall = DeferredComponentChannel.access$000(this$0).getDeferredComponentInstallState(i, paramMethodCall);; paramMethodCall = null)
      {
        paramResult.success(paramMethodCall);
        break;
        DeferredComponentChannel.access$000(this$0).uninstallDeferredComponent(i, paramMethodCall);
      }
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.DeferredComponentChannel.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */