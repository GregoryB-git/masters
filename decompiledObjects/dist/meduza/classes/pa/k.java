package pa;

import ec.i;
import io.flutter.plugin.common.EventChannel.EventSink;
import java.util.ArrayList;
import java.util.Iterator;

public final class k
  implements EventChannel.EventSink
{
  public EventChannel.EventSink a;
  public final ArrayList<Object> b = new ArrayList();
  public boolean c;
  
  public final void a()
  {
    if (a == null) {
      return;
    }
    Iterator localIterator = b.iterator();
    i.d(localIterator, "iterator(...)");
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      i.d(localObject, "next(...)");
      if ((localObject instanceof a))
      {
        localObject = a;
        i.b(localObject);
        ((EventChannel.EventSink)localObject).endOfStream();
      }
      else
      {
        EventChannel.EventSink localEventSink;
        if ((localObject instanceof b))
        {
          localEventSink = a;
          i.b(localEventSink);
          localObject = (b)localObject;
          localEventSink.error(a, b, c);
        }
        else
        {
          localEventSink = a;
          i.b(localEventSink);
          localEventSink.success(localObject);
        }
      }
    }
    b.clear();
  }
  
  public final void endOfStream()
  {
    a locala = new a();
    if (!c) {
      b.add(locala);
    }
    a();
    c = true;
  }
  
  public final void error(String paramString1, String paramString2, Object paramObject)
  {
    i.e(paramString1, "code");
    i.e(paramString2, "message");
    i.e(paramObject, "details");
    paramString1 = new b(paramString1, paramString2, paramObject);
    if (!c) {
      b.add(paramString1);
    }
    a();
  }
  
  public final void success(Object paramObject)
  {
    i.e(paramObject, "event");
    if (!c) {
      b.add(paramObject);
    }
    a();
  }
  
  public static final class a {}
  
  public static final class b
  {
    public String a;
    public String b;
    public Object c;
    
    public b(String paramString1, String paramString2, Object paramObject)
    {
      a = paramString1;
      b = paramString2;
      c = paramObject;
    }
  }
}

/* Location:
 * Qualified Name:     pa.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */