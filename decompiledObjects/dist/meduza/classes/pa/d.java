package pa;

import ec.i;
import io.flutter.plugin.common.EventChannel.EventSink;
import io.flutter.plugin.common.EventChannel.StreamHandler;

public final class d
  implements EventChannel.StreamHandler
{
  public d(b paramb) {}
  
  public final void onCancel(Object paramObject)
  {
    paramObject = a.d;
    a = null;
    ((k)paramObject).a();
  }
  
  public final void onListen(Object paramObject, EventChannel.EventSink paramEventSink)
  {
    i.e(paramEventSink, "sink");
    paramObject = a.d;
    a = paramEventSink;
    ((k)paramObject).a();
  }
}

/* Location:
 * Qualified Name:     pa.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */