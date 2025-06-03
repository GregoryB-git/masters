package ua;

import io.flutter.plugin.common.EventChannel.EventSink;
import io.flutter.plugin.common.EventChannel.StreamHandler;

public final class b$a
  implements EventChannel.StreamHandler
{
  public b$a(b paramb) {}
  
  public final void onCancel(Object paramObject)
  {
    a.a = null;
  }
  
  public final void onListen(Object paramObject, EventChannel.EventSink paramEventSink)
  {
    a.a = paramEventSink;
  }
}

/* Location:
 * Qualified Name:     ua.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */