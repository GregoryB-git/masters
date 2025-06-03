package io.flutter.plugin.common;

import f;
import io.flutter.Log;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

final class EventChannel$IncomingStreamRequestHandler
  implements BinaryMessenger.BinaryMessageHandler
{
  private final AtomicReference<EventChannel.EventSink> activeSink = new AtomicReference(null);
  private final EventChannel.StreamHandler handler;
  
  public EventChannel$IncomingStreamRequestHandler(EventChannel paramEventChannel, EventChannel.StreamHandler paramStreamHandler)
  {
    handler = paramStreamHandler;
  }
  
  private void onCancel(Object paramObject, BinaryMessenger.BinaryReply paramBinaryReply)
  {
    if ((EventChannel.EventSink)activeSink.getAndSet(null) != null) {
      try
      {
        handler.onCancel(paramObject);
        paramBinaryReply.reply(EventChannel.access$000(this$0).encodeSuccessEnvelope(null));
      }
      catch (RuntimeException localRuntimeException)
      {
        paramObject = f.l("EventChannel#");
        ((StringBuilder)paramObject).append(EventChannel.access$200(this$0));
        Log.e(((StringBuilder)paramObject).toString(), "Failed to close event stream", localRuntimeException);
        paramObject = EventChannel.access$000(this$0).encodeErrorEnvelope("error", localRuntimeException.getMessage(), null);
        break label116;
      }
    } else {
      paramObject = EventChannel.access$000(this$0).encodeErrorEnvelope("error", "No active stream to cancel", null);
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
        localStringBuilder.append(EventChannel.access$200(this$0));
        Log.e(localStringBuilder.toString(), "Failed to close existing event stream", localRuntimeException1);
      }
    }
    try
    {
      handler.onListen(paramObject, localEventSinkImplementation);
      paramBinaryReply.reply(EventChannel.access$000(this$0).encodeSuccessEnvelope(null));
    }
    catch (RuntimeException localRuntimeException2)
    {
      activeSink.set(null);
      paramObject = new StringBuilder();
      ((StringBuilder)paramObject).append("EventChannel#");
      ((StringBuilder)paramObject).append(EventChannel.access$200(this$0));
      Log.e(((StringBuilder)paramObject).toString(), "Failed to open event stream", localRuntimeException2);
      paramBinaryReply.reply(EventChannel.access$000(this$0).encodeErrorEnvelope("error", localRuntimeException2.getMessage(), null));
    }
  }
  
  public void onMessage(ByteBuffer paramByteBuffer, BinaryMessenger.BinaryReply paramBinaryReply)
  {
    paramByteBuffer = EventChannel.access$000(this$0).decodeMethodCall(paramByteBuffer);
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
        EventChannel.access$400(this$0).send(EventChannel.access$200(this$0), null);
      }
    }
    
    public void error(String paramString1, String paramString2, Object paramObject)
    {
      if ((!hasEnded.get()) && (EventChannel.IncomingStreamRequestHandler.access$300(EventChannel.IncomingStreamRequestHandler.this).get() == this)) {
        EventChannel.access$400(this$0).send(EventChannel.access$200(this$0), EventChannel.access$000(this$0).encodeErrorEnvelope(paramString1, paramString2, paramObject));
      }
    }
    
    public void success(Object paramObject)
    {
      if ((!hasEnded.get()) && (EventChannel.IncomingStreamRequestHandler.access$300(EventChannel.IncomingStreamRequestHandler.this).get() == this)) {
        EventChannel.access$400(this$0).send(EventChannel.access$200(this$0), EventChannel.access$000(this$0).encodeSuccessEnvelope(paramObject));
      }
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.common.EventChannel.IncomingStreamRequestHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */