package io.flutter.embedding.engine.dart;

import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler;
import io.flutter.plugin.common.BinaryMessenger.BinaryReply;
import io.flutter.plugin.common.BinaryMessenger.TaskQueue;
import io.flutter.plugin.common.BinaryMessenger.TaskQueueOptions;
import java.nio.ByteBuffer;

class DartExecutor$DefaultBinaryMessenger
  implements BinaryMessenger
{
  private final DartMessenger messenger;
  
  private DartExecutor$DefaultBinaryMessenger(DartMessenger paramDartMessenger)
  {
    messenger = paramDartMessenger;
  }
  
  public void disableBufferingIncomingMessages()
  {
    messenger.disableBufferingIncomingMessages();
  }
  
  public void enableBufferingIncomingMessages()
  {
    messenger.enableBufferingIncomingMessages();
  }
  
  public BinaryMessenger.TaskQueue makeBackgroundTaskQueue(BinaryMessenger.TaskQueueOptions paramTaskQueueOptions)
  {
    return messenger.makeBackgroundTaskQueue(paramTaskQueueOptions);
  }
  
  public void send(String paramString, ByteBuffer paramByteBuffer)
  {
    messenger.send(paramString, paramByteBuffer, null);
  }
  
  public void send(String paramString, ByteBuffer paramByteBuffer, BinaryMessenger.BinaryReply paramBinaryReply)
  {
    messenger.send(paramString, paramByteBuffer, paramBinaryReply);
  }
  
  public void setMessageHandler(String paramString, BinaryMessenger.BinaryMessageHandler paramBinaryMessageHandler)
  {
    messenger.setMessageHandler(paramString, paramBinaryMessageHandler);
  }
  
  public void setMessageHandler(String paramString, BinaryMessenger.BinaryMessageHandler paramBinaryMessageHandler, BinaryMessenger.TaskQueue paramTaskQueue)
  {
    messenger.setMessageHandler(paramString, paramBinaryMessageHandler, paramTaskQueue);
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.dart.DartExecutor.DefaultBinaryMessenger
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */