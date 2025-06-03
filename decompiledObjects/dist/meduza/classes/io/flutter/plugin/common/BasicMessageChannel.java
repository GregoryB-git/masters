package io.flutter.plugin.common;

import f;
import io.flutter.Log;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class BasicMessageChannel<T>
{
  public static final String CHANNEL_BUFFERS_CHANNEL = "dev.flutter/channel-buffers";
  private static final String TAG = "BasicMessageChannel#";
  private final MessageCodec<T> codec;
  private final BinaryMessenger messenger;
  private final String name;
  private final BinaryMessenger.TaskQueue taskQueue;
  
  public BasicMessageChannel(BinaryMessenger paramBinaryMessenger, String paramString, MessageCodec<T> paramMessageCodec)
  {
    this(paramBinaryMessenger, paramString, paramMessageCodec, null);
  }
  
  public BasicMessageChannel(BinaryMessenger paramBinaryMessenger, String paramString, MessageCodec<T> paramMessageCodec, BinaryMessenger.TaskQueue paramTaskQueue)
  {
    messenger = paramBinaryMessenger;
    name = paramString;
    codec = paramMessageCodec;
    taskQueue = paramTaskQueue;
  }
  
  private static ByteBuffer packetFromEncodedMessage(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.flip();
    int i = paramByteBuffer.remaining();
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    paramByteBuffer = ByteBuffer.allocateDirect(i);
    paramByteBuffer.put(arrayOfByte);
    return paramByteBuffer;
  }
  
  public static void resizeChannelBuffer(BinaryMessenger paramBinaryMessenger, String paramString, int paramInt)
  {
    paramBinaryMessenger.send("dev.flutter/channel-buffers", packetFromEncodedMessage(StandardMethodCodec.INSTANCE.encodeMethodCall(new MethodCall("resize", Arrays.asList(new Object[] { paramString, Integer.valueOf(paramInt) })))));
  }
  
  public static void setWarnsOnChannelOverflow(BinaryMessenger paramBinaryMessenger, String paramString, boolean paramBoolean)
  {
    paramBinaryMessenger.send("dev.flutter/channel-buffers", packetFromEncodedMessage(StandardMethodCodec.INSTANCE.encodeMethodCall(new MethodCall("overflow", Arrays.asList(new Object[] { paramString, Boolean.valueOf(paramBoolean ^ true) })))));
  }
  
  public void resizeChannelBuffer(int paramInt)
  {
    resizeChannelBuffer(messenger, name, paramInt);
  }
  
  public void send(T paramT)
  {
    send(paramT, null);
  }
  
  public void send(T paramT, Reply<T> paramReply)
  {
    BinaryMessenger localBinaryMessenger = messenger;
    String str = name;
    ByteBuffer localByteBuffer = codec.encodeMessage(paramT);
    paramT = null;
    if (paramReply != null) {
      paramT = new IncomingReplyHandler(paramReply, null);
    }
    localBinaryMessenger.send(str, localByteBuffer, paramT);
  }
  
  public void setMessageHandler(MessageHandler<T> paramMessageHandler)
  {
    Object localObject = taskQueue;
    BinaryMessenger localBinaryMessenger1 = null;
    BinaryMessenger localBinaryMessenger2 = null;
    if (localObject != null)
    {
      localBinaryMessenger1 = messenger;
      localObject = name;
      if (paramMessageHandler == null) {
        paramMessageHandler = localBinaryMessenger2;
      } else {
        paramMessageHandler = new IncomingMessageHandler(paramMessageHandler, null);
      }
      localBinaryMessenger1.setMessageHandler((String)localObject, paramMessageHandler, taskQueue);
    }
    else
    {
      localBinaryMessenger2 = messenger;
      localObject = name;
      if (paramMessageHandler == null) {
        paramMessageHandler = localBinaryMessenger1;
      } else {
        paramMessageHandler = new IncomingMessageHandler(paramMessageHandler, null);
      }
      localBinaryMessenger2.setMessageHandler((String)localObject, paramMessageHandler);
    }
  }
  
  public void setWarnsOnChannelOverflow(boolean paramBoolean)
  {
    setWarnsOnChannelOverflow(messenger, name, paramBoolean);
  }
  
  public final class IncomingMessageHandler
    implements BinaryMessenger.BinaryMessageHandler
  {
    private final BasicMessageChannel.MessageHandler<T> handler;
    
    private IncomingMessageHandler()
    {
      BasicMessageChannel.MessageHandler localMessageHandler;
      handler = localMessageHandler;
    }
    
    public void onMessage(ByteBuffer paramByteBuffer, BinaryMessenger.BinaryReply paramBinaryReply)
    {
      try
      {
        localObject1 = handler;
        Object localObject2 = BasicMessageChannel.access$200(BasicMessageChannel.this).decodeMessage(paramByteBuffer);
        paramByteBuffer = new io/flutter/plugin/common/BasicMessageChannel$IncomingMessageHandler$1;
        paramByteBuffer.<init>(this, paramBinaryReply);
        ((BasicMessageChannel.MessageHandler)localObject1).onMessage(localObject2, paramByteBuffer);
      }
      catch (RuntimeException paramByteBuffer)
      {
        Object localObject1 = f.l("BasicMessageChannel#");
        ((StringBuilder)localObject1).append(BasicMessageChannel.access$300(BasicMessageChannel.this));
        Log.e(((StringBuilder)localObject1).toString(), "Failed to handle message", paramByteBuffer);
        paramBinaryReply.reply(null);
      }
    }
  }
  
  public final class IncomingReplyHandler
    implements BinaryMessenger.BinaryReply
  {
    private final BasicMessageChannel.Reply<T> callback;
    
    private IncomingReplyHandler()
    {
      BasicMessageChannel.Reply localReply;
      callback = localReply;
    }
    
    public void reply(ByteBuffer paramByteBuffer)
    {
      try
      {
        callback.reply(BasicMessageChannel.access$200(BasicMessageChannel.this).decodeMessage(paramByteBuffer));
      }
      catch (RuntimeException localRuntimeException)
      {
        paramByteBuffer = f.l("BasicMessageChannel#");
        paramByteBuffer.append(BasicMessageChannel.access$300(BasicMessageChannel.this));
        Log.e(paramByteBuffer.toString(), "Failed to handle message reply", localRuntimeException);
      }
    }
  }
  
  public static abstract interface MessageHandler<T>
  {
    public abstract void onMessage(T paramT, BasicMessageChannel.Reply<T> paramReply);
  }
  
  public static abstract interface Reply<T>
  {
    public abstract void reply(T paramT);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.common.BasicMessageChannel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */