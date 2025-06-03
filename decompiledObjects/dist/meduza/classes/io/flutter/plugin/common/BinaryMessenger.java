package io.flutter.plugin.common;

import java.nio.ByteBuffer;

public abstract interface BinaryMessenger
{
  public abstract void disableBufferingIncomingMessages();
  
  public abstract void enableBufferingIncomingMessages();
  
  public abstract TaskQueue makeBackgroundTaskQueue();
  
  public abstract TaskQueue makeBackgroundTaskQueue(TaskQueueOptions paramTaskQueueOptions);
  
  public abstract void send(String paramString, ByteBuffer paramByteBuffer);
  
  public abstract void send(String paramString, ByteBuffer paramByteBuffer, BinaryReply paramBinaryReply);
  
  public abstract void setMessageHandler(String paramString, BinaryMessageHandler paramBinaryMessageHandler);
  
  public abstract void setMessageHandler(String paramString, BinaryMessageHandler paramBinaryMessageHandler, TaskQueue paramTaskQueue);
  
  public static abstract interface BinaryMessageHandler
  {
    public abstract void onMessage(ByteBuffer paramByteBuffer, BinaryMessenger.BinaryReply paramBinaryReply);
  }
  
  public static abstract interface BinaryReply
  {
    public abstract void reply(ByteBuffer paramByteBuffer);
  }
  
  public static abstract interface TaskQueue {}
  
  public static class TaskQueueOptions
  {
    private boolean isSerial = true;
    
    public boolean getIsSerial()
    {
      return isSerial;
    }
    
    public TaskQueueOptions setIsSerial(boolean paramBoolean)
    {
      isSerial = paramBoolean;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.common.BinaryMessenger
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */