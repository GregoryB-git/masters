package io.flutter.plugin.common;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

final class EventChannel$IncomingStreamRequestHandler$EventSinkImplementation
  implements EventChannel.EventSink
{
  public final AtomicBoolean hasEnded = new AtomicBoolean(false);
  
  private EventChannel$IncomingStreamRequestHandler$EventSinkImplementation(EventChannel.IncomingStreamRequestHandler paramIncomingStreamRequestHandler) {}
  
  public void endOfStream()
  {
    if ((!hasEnded.getAndSet(true)) && (EventChannel.IncomingStreamRequestHandler.access$300(this$1).get() == this)) {
      EventChannel.access$400(this$1.this$0).send(EventChannel.access$200(this$1.this$0), null);
    }
  }
  
  public void error(String paramString1, String paramString2, Object paramObject)
  {
    if ((!hasEnded.get()) && (EventChannel.IncomingStreamRequestHandler.access$300(this$1).get() == this)) {
      EventChannel.access$400(this$1.this$0).send(EventChannel.access$200(this$1.this$0), EventChannel.access$000(this$1.this$0).encodeErrorEnvelope(paramString1, paramString2, paramObject));
    }
  }
  
  public void success(Object paramObject)
  {
    if ((!hasEnded.get()) && (EventChannel.IncomingStreamRequestHandler.access$300(this$1).get() == this)) {
      EventChannel.access$400(this$1.this$0).send(EventChannel.access$200(this$1.this$0), EventChannel.access$000(this$1.this$0).encodeSuccessEnvelope(paramObject));
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.common.EventChannel.IncomingStreamRequestHandler.EventSinkImplementation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */