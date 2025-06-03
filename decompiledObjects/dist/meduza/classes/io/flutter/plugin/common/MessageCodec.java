package io.flutter.plugin.common;

import java.nio.ByteBuffer;

public abstract interface MessageCodec<T>
{
  public abstract T decodeMessage(ByteBuffer paramByteBuffer);
  
  public abstract ByteBuffer encodeMessage(T paramT);
}

/* Location:
 * Qualified Name:     io.flutter.plugin.common.MessageCodec
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */