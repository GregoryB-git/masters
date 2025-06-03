package io.flutter.embedding.engine.dart;

import java.nio.ByteBuffer;

class DartMessenger$BufferedMessageInfo
{
  public final ByteBuffer message;
  public long messageData;
  public int replyId;
  
  public DartMessenger$BufferedMessageInfo(ByteBuffer paramByteBuffer, int paramInt, long paramLong)
  {
    message = paramByteBuffer;
    replyId = paramInt;
    messageData = paramLong;
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.dart.DartMessenger.BufferedMessageInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */