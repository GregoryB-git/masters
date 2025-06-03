package ua;

import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.EventChannel.EventSink;
import io.flutter.plugin.common.EventChannel.StreamHandler;

public final class b
  implements EventChannel.EventSink
{
  public EventChannel.EventSink a;
  
  public b(BinaryMessenger paramBinaryMessenger, String paramString)
  {
    new EventChannel(paramBinaryMessenger, paramString).setStreamHandler(new a());
  }
  
  public final void endOfStream()
  {
    EventChannel.EventSink localEventSink = a;
    if (localEventSink != null) {
      localEventSink.endOfStream();
    }
  }
  
  public final void error(String paramString1, String paramString2, Object paramObject)
  {
    EventChannel.EventSink localEventSink = a;
    if (localEventSink != null) {
      localEventSink.error(paramString1, paramString2, paramObject);
    }
  }
  
  public final void success(Object paramObject)
  {
    EventChannel.EventSink localEventSink = a;
    if (localEventSink != null) {
      localEventSink.success(paramObject);
    }
  }
  
  public final class a
    implements EventChannel.StreamHandler
  {
    public a() {}
    
    public final void onCancel(Object paramObject)
    {
      a = null;
    }
    
    public final void onListen(Object paramObject, EventChannel.EventSink paramEventSink)
    {
      a = paramEventSink;
    }
  }
}

/* Location:
 * Qualified Name:     ua.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */