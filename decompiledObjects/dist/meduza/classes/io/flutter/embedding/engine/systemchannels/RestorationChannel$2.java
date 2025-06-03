package io.flutter.embedding.engine.systemchannels;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;

class RestorationChannel$2
  implements MethodChannel.MethodCallHandler
{
  public RestorationChannel$2(RestorationChannel paramRestorationChannel) {}
  
  public void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    String str = method;
    paramMethodCall = arguments;
    str.getClass();
    if (!str.equals("get"))
    {
      if (!str.equals("put")) {
        paramResult.notImplemented();
      } else {
        RestorationChannel.access$002(this$0, (byte[])paramMethodCall);
      }
    }
    else {
      for (paramMethodCall = null;; paramMethodCall = RestorationChannel.access$300(paramMethodCall, RestorationChannel.access$000(paramMethodCall)))
      {
        paramResult.success(paramMethodCall);
        break;
        RestorationChannel.access$102(this$0, true);
        if (!RestorationChannel.access$200(this$0))
        {
          paramMethodCall = this$0;
          if (waitForRestorationData)
          {
            RestorationChannel.access$402(paramMethodCall, paramResult);
            break;
          }
        }
        paramMethodCall = this$0;
      }
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.RestorationChannel.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */