package io.flutter.embedding.engine.dart;

import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.common.BinaryMessenger.BinaryReply;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

class DartMessenger$Reply
  implements BinaryMessenger.BinaryReply
{
  private final AtomicBoolean done = new AtomicBoolean(false);
  private final FlutterJNI flutterJNI;
  private final int replyId;
  
  public DartMessenger$Reply(FlutterJNI paramFlutterJNI, int paramInt)
  {
    flutterJNI = paramFlutterJNI;
    replyId = paramInt;
  }
  
  public void reply(ByteBuffer paramByteBuffer)
  {
    if (!done.getAndSet(true))
    {
      if (paramByteBuffer == null) {
        flutterJNI.invokePlatformMessageEmptyResponseCallback(replyId);
      } else {
        flutterJNI.invokePlatformMessageResponseCallback(replyId, paramByteBuffer, paramByteBuffer.position());
      }
      return;
    }
    throw new IllegalStateException("Reply already submitted");
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.dart.DartMessenger.Reply
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */