package io.flutter.embedding.engine.systemchannels;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.HashMap;
import java.util.Map;

class KeyboardChannel$1
  implements MethodChannel.MethodCallHandler
{
  public Map<Long, Long> pressedState = new HashMap();
  
  public KeyboardChannel$1(KeyboardChannel paramKeyboardChannel) {}
  
  public void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    if (KeyboardChannel.access$000(this$0) == null) {}
    for (;;)
    {
      paramResult.success(pressedState);
      break;
      paramMethodCall = method;
      paramMethodCall.getClass();
      if (!paramMethodCall.equals("getKeyboardState"))
      {
        paramResult.notImplemented();
        break;
      }
      try
      {
        pressedState = KeyboardChannel.access$000(this$0).getKeyboardState();
      }
      catch (IllegalStateException paramMethodCall)
      {
        paramResult.error("error", paramMethodCall.getMessage(), null);
      }
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.KeyboardChannel.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */