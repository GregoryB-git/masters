package com.pichillilorenzo.flutter_inappwebview_android.types;

import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;

public abstract interface IChannelDelegate
  extends MethodChannel.MethodCallHandler, Disposable
{
  public abstract MethodChannel getChannel();
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */