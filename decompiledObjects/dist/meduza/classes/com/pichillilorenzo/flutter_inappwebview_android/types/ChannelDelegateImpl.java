package com.pichillilorenzo.flutter_inappwebview_android.types;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.Result;

public class ChannelDelegateImpl
  implements IChannelDelegate
{
  private MethodChannel channel;
  
  public ChannelDelegateImpl(MethodChannel paramMethodChannel)
  {
    channel = paramMethodChannel;
    paramMethodChannel.setMethodCallHandler(this);
  }
  
  public void dispose()
  {
    MethodChannel localMethodChannel = channel;
    if (localMethodChannel != null)
    {
      localMethodChannel.setMethodCallHandler(null);
      channel = null;
    }
  }
  
  public MethodChannel getChannel()
  {
    return channel;
  }
  
  public void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult) {}
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */