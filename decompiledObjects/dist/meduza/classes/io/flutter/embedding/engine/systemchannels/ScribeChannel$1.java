package io.flutter.embedding.engine.systemchannels;

import io.flutter.Log;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;

class ScribeChannel$1
  implements MethodChannel.MethodCallHandler
{
  public ScribeChannel$1(ScribeChannel paramScribeChannel) {}
  
  public void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    if (ScribeChannel.access$000(this$0) == null)
    {
      Log.v("ScribeChannel", "No ScribeMethodHandler registered. Scribe call not handled.");
      return;
    }
    String str = method;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Received '");
    localStringBuilder.append(str);
    localStringBuilder.append("' message.");
    Log.v("ScribeChannel", localStringBuilder.toString());
    str.getClass();
    int i = -1;
    switch (str.hashCode())
    {
    default: 
      break;
    case 2119738044: 
      if (str.equals("Scribe.isStylusHandwritingAvailable")) {
        i = 2;
      }
      break;
    case 1759284829: 
      if (str.equals("Scribe.startStylusHandwriting")) {
        i = 1;
      }
      break;
    case -705821951: 
      if (str.equals("Scribe.isFeatureAvailable")) {
        i = 0;
      }
      break;
    }
    switch (i)
    {
    default: 
      paramResult.notImplemented();
      break;
    case 2: 
      ScribeChannel.access$200(this$0, paramMethodCall, paramResult);
      break;
    case 1: 
      ScribeChannel.access$300(this$0, paramMethodCall, paramResult);
      break;
    case 0: 
      ScribeChannel.access$100(this$0, paramMethodCall, paramResult);
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.ScribeChannel.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */