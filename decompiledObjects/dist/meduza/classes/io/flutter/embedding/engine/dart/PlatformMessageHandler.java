package io.flutter.embedding.engine.dart;

import java.nio.ByteBuffer;

public abstract interface PlatformMessageHandler
{
  public abstract void handleMessageFromDart(String paramString, ByteBuffer paramByteBuffer, int paramInt, long paramLong);
  
  public abstract void handlePlatformMessageResponse(int paramInt, ByteBuffer paramByteBuffer);
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.dart.PlatformMessageHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */