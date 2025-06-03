package io.flutter.plugin.platform;

import android.content.Context;
import io.flutter.plugin.common.MessageCodec;

public abstract class PlatformViewFactory
{
  private final MessageCodec<Object> createArgsCodec;
  
  public PlatformViewFactory(MessageCodec<Object> paramMessageCodec)
  {
    createArgsCodec = paramMessageCodec;
  }
  
  public abstract PlatformView create(Context paramContext, int paramInt, Object paramObject);
  
  public final MessageCodec<Object> getCreateArgsCodec()
  {
    return createArgsCodec;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.PlatformViewFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */