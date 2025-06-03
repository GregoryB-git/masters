package io.flutter.embedding.engine.systemchannels;

import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.StandardMethodCodec;
import java.util.HashMap;
import java.util.Map;

public class KeyboardChannel
{
  public final MethodChannel channel;
  private KeyboardMethodHandler keyboardMethodHandler;
  public final MethodChannel.MethodCallHandler parsingMethodHandler;
  
  public KeyboardChannel(BinaryMessenger paramBinaryMessenger)
  {
    MethodChannel.MethodCallHandler local1 = new MethodChannel.MethodCallHandler()
    {
      public Map<Long, Long> pressedState = new HashMap();
      
      public void onMethodCall(MethodCall paramAnonymousMethodCall, MethodChannel.Result paramAnonymousResult)
      {
        if (KeyboardChannel.access$000(KeyboardChannel.this) == null) {}
        for (;;)
        {
          paramAnonymousResult.success(pressedState);
          break;
          paramAnonymousMethodCall = method;
          paramAnonymousMethodCall.getClass();
          if (!paramAnonymousMethodCall.equals("getKeyboardState"))
          {
            paramAnonymousResult.notImplemented();
            break;
          }
          try
          {
            pressedState = KeyboardChannel.access$000(KeyboardChannel.this).getKeyboardState();
          }
          catch (IllegalStateException paramAnonymousMethodCall)
          {
            paramAnonymousResult.error("error", paramAnonymousMethodCall.getMessage(), null);
          }
        }
      }
    };
    parsingMethodHandler = local1;
    paramBinaryMessenger = new MethodChannel(paramBinaryMessenger, "flutter/keyboard", StandardMethodCodec.INSTANCE);
    channel = paramBinaryMessenger;
    paramBinaryMessenger.setMethodCallHandler(local1);
  }
  
  public void setKeyboardMethodHandler(KeyboardMethodHandler paramKeyboardMethodHandler)
  {
    keyboardMethodHandler = paramKeyboardMethodHandler;
  }
  
  public static abstract interface KeyboardMethodHandler
  {
    public abstract Map<Long, Long> getKeyboardState();
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.KeyboardChannel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */