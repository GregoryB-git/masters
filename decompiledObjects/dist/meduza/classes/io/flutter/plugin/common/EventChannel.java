package io.flutter.plugin.common;

import f;
import io.flutter.Log;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class EventChannel
{
  private static final String TAG = "EventChannel#";
  private final MethodCodec codec;
  private final BinaryMessenger messenger;
  private final String name;
  private final BinaryMessenger.TaskQueue taskQueue;
  
  public EventChannel(BinaryMessenger paramBinaryMessenger, String paramString)
  {
    this(paramBinaryMessenger, paramString, StandardMethodCodec.INSTANCE);
  }
  
  public EventChannel(BinaryMessenger paramBinaryMessenger, String paramString, MethodCodec paramMethodCodec)
  {
    this(paramBinaryMessenger, paramString, paramMethodCodec, null);
  }
  
  public EventChannel(BinaryMessenger paramBinaryMessenger, String paramString, MethodCodec paramMethodCodec, BinaryMessenger.TaskQueue paramTaskQueue)
  {
    messenger = paramBinaryMessenger;
    name = paramString;
    codec = paramMethodCodec;
    taskQueue = paramTaskQueue;
  }
  
  public void setStreamHandler(StreamHandler paramStreamHandler)
  {
    Object localObject = taskQueue;
    BinaryMessenger localBinaryMessenger = null;
    String str = null;
    if (localObject != null)
    {
      localBinaryMessenger = messenger;
      localObject = name;
      if (paramStreamHandler == null) {
        paramStreamHandler = str;
      } else {
        paramStreamHandler = new IncomingStreamRequestHandler(paramStreamHandler);
      }
      localBinaryMessenger.setMessageHandler((String)localObject, paramStreamHandler, taskQueue);
    }
    else
    {
      localObject = messenger;
      str = name;
      if (paramStreamHandler == null) {
        paramStreamHandler = localBinaryMessenger;
      } else {
        paramStreamHandler = new IncomingStreamRequestHandler(paramStreamHandler);
      }
      ((BinaryMessenger)localObject).setMessageHandler(str, paramStreamHandler);
    }
  }
  
  public static abstract interface EventSink
  {
    public abstract void endOfStream();
    
    public abstract void error(String paramString1, String paramString2, Object paramObject);
    
    public abstract void success(Object paramObject);
  }
  
  public final class IncomingStreamRequestHandler
    implements BinaryMessenger.BinaryMessageHandler
  {
    private final AtomicReference<EventChannel.EventSink> activeSink = new AtomicReference(null);
    private final EventChannel.StreamHandler handler;
    
    public IncomingStreamRequestHandler(EventChannel.StreamHandler paramStreamHandler)
    {
      handler = paramStreamHandler;
    }
    
    private void onCancel(Object paramObject, BinaryMessenger.BinaryReply paramBinaryReply)
    {
      if ((EventChannel.EventSink)activeSink.getAndSet(null) != null) {
        try
        {
          handler.onCancel(paramObject);
          paramBinaryReply.reply(EventChannel.access$000(EventChannel.this).encodeSuccessEnvelope(null));
        }
        catch (RuntimeException localRuntimeException)
        {
          paramObject = f.l("EventChannel#");
          ((StringBuilder)paramObject).append(EventChannel.access$200(EventChannel.this));
          Log.e(((StringBuilder)paramObject).toString(), "Failed to close event stream", localRuntimeException);
          paramObject = EventChannel.access$000(EventChannel.this).encodeErrorEnvelope("error", localRuntimeException.getMessage(), null);
          break label116;
        }
      } else {
        paramObject = EventChannel.access$000(EventChannel.this).encodeErrorEnvelope("error", "No active stream to cancel", null);
      }
      label116:
      paramBinaryReply.reply((ByteBuffer)paramObject);
    }
    
    private void onListen(Object paramObject, BinaryMessenger.BinaryReply paramBinaryReply)
    {
      EventSinkImplementation localEventSinkImplementation = new EventSinkImplementation(null);
      if ((EventChannel.EventSink)activeSink.getAndSet(localEventSinkImplementation) != null) {
        try
        {
          handler.onCancel(null);
        }
        catch (RuntimeException localRuntimeException1)
        {
          StringBuilder localStringBuilder = f.l("EventChannel#");
          localStringBuilder.append(EventChannel.access$200(EventChannel.this));
          Log.e(localStringBuilder.toString(), "Failed to close existing event stream", localRuntimeException1);
        }
      }
      try
      {
        handler.onListen(paramObject, localEventSinkImplementation);
        paramBinaryReply.reply(EventChannel.access$000(EventChannel.this).encodeSuccessEnvelope(null));
      }
      catch (RuntimeException localRuntimeException2)
      {
        activeSink.set(null);
        paramObject = new StringBuilder();
        ((StringBuilder)paramObject).append("EventChannel#");
        ((StringBuilder)paramObject).append(EventChannel.access$200(EventChannel.this));
        Log.e(((StringBuilder)paramObject).toString(), "Failed to open event stream", localRuntimeException2);
        paramBinaryReply.reply(EventChannel.access$000(EventChannel.this).encodeErrorEnvelope("error", localRuntimeException2.getMessage(), null));
      }
    }
    
    public void onMessage(ByteBuffer paramByteBuffer, BinaryMessenger.BinaryReply paramBinaryReply)
    {
      paramByteBuffer = EventChannel.access$000(EventChannel.this).decodeMethodCall(paramByteBuffer);
      if (method.equals("listen")) {
        onListen(arguments, paramBinaryReply);
      } else if (method.equals("cancel")) {
        onCancel(arguments, paramBinaryReply);
      } else {
        paramBinaryReply.reply(null);
      }
    }
    
    public final class EventSinkImplementation
      implements EventChannel.EventSink
    {
      public final AtomicBoolean hasEnded = new AtomicBoolean(false);
      
      private EventSinkImplementation() {}
      
      public void endOfStream()
      {
        if ((!hasEnded.getAndSet(true)) && (EventChannel.IncomingStreamRequestHandler.access$300(EventChannel.IncomingStreamRequestHandler.this).get() == this)) {
          EventChannel.access$400(EventChannel.this).send(EventChannel.access$200(EventChannel.this), null);
        }
      }
      
      public void error(String paramString1, String paramString2, Object paramObject)
      {
        if ((!hasEnded.get()) && (EventChannel.IncomingStreamRequestHandler.access$300(EventChannel.IncomingStreamRequestHandler.this).get() == this)) {
          EventChannel.access$400(EventChannel.this).send(EventChannel.access$200(EventChannel.this), EventChannel.access$000(EventChannel.this).encodeErrorEnvelope(paramString1, paramString2, paramObject));
        }
      }
      
      public void success(Object paramObject)
      {
        if ((!hasEnded.get()) && (EventChannel.IncomingStreamRequestHandler.access$300(EventChannel.IncomingStreamRequestHandler.this).get() == this)) {
          EventChannel.access$400(EventChannel.this).send(EventChannel.access$200(EventChannel.this), EventChannel.access$000(EventChannel.this).encodeSuccessEnvelope(paramObject));
        }
      }
    }
  }
  
  public static abstract interface StreamHandler
  {
    public abstract void onCancel(Object paramObject);
    
    public abstract void onListen(Object paramObject, EventChannel.EventSink paramEventSink);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.common.EventChannel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */