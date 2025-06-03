package io.flutter.plugin.common;

import f;
import io.flutter.Log;
import java.nio.ByteBuffer;

final class BasicMessageChannel$IncomingReplyHandler
  implements BinaryMessenger.BinaryReply
{
  private final BasicMessageChannel.Reply<T> callback;
  
  private BasicMessageChannel$IncomingReplyHandler(BasicMessageChannel.Reply<T> paramReply)
  {
    BasicMessageChannel.Reply localReply;
    callback = localReply;
  }
  
  public void reply(ByteBuffer paramByteBuffer)
  {
    try
    {
      callback.reply(BasicMessageChannel.access$200(this$0).decodeMessage(paramByteBuffer));
    }
    catch (RuntimeException localRuntimeException)
    {
      paramByteBuffer = f.l("BasicMessageChannel#");
      paramByteBuffer.append(BasicMessageChannel.access$300(this$0));
      Log.e(paramByteBuffer.toString(), "Failed to handle message reply", localRuntimeException);
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.common.BasicMessageChannel.IncomingReplyHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */