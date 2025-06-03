package io.flutter.plugin.common;

import f;
import io.flutter.Log;
import java.nio.ByteBuffer;

final class BasicMessageChannel$IncomingMessageHandler
  implements BinaryMessenger.BinaryMessageHandler
{
  private final BasicMessageChannel.MessageHandler<T> handler;
  
  private BasicMessageChannel$IncomingMessageHandler(BasicMessageChannel.MessageHandler<T> paramMessageHandler)
  {
    BasicMessageChannel.MessageHandler localMessageHandler;
    handler = localMessageHandler;
  }
  
  public void onMessage(ByteBuffer paramByteBuffer, BinaryMessenger.BinaryReply paramBinaryReply)
  {
    try
    {
      localObject1 = handler;
      Object localObject2 = BasicMessageChannel.access$200(this$0).decodeMessage(paramByteBuffer);
      paramByteBuffer = new io/flutter/plugin/common/BasicMessageChannel$IncomingMessageHandler$1;
      paramByteBuffer.<init>(this, paramBinaryReply);
      ((BasicMessageChannel.MessageHandler)localObject1).onMessage(localObject2, paramByteBuffer);
    }
    catch (RuntimeException paramByteBuffer)
    {
      Object localObject1 = f.l("BasicMessageChannel#");
      ((StringBuilder)localObject1).append(BasicMessageChannel.access$300(this$0));
      Log.e(((StringBuilder)localObject1).toString(), "Failed to handle message", paramByteBuffer);
      paramBinaryReply.reply(null);
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.common.BasicMessageChannel.IncomingMessageHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */