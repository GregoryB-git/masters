package u5;

import android.util.LongSparseArray;
import android.view.MotionEvent;
import java.util.AbstractCollection;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

public final class N
{
  public static N c;
  public final LongSparseArray a = new LongSparseArray();
  public final PriorityQueue b = new PriorityQueue();
  
  public static N a()
  {
    if (c == null) {
      c = new N();
    }
    return c;
  }
  
  public MotionEvent b(a parama)
  {
    while ((!b.isEmpty()) && (((Long)b.peek()).longValue() < a.a(parama))) {
      a.remove(((Long)b.poll()).longValue());
    }
    if ((!b.isEmpty()) && (((Long)b.peek()).longValue() == a.a(parama))) {
      b.poll();
    }
    MotionEvent localMotionEvent = (MotionEvent)a.get(a.a(parama));
    a.remove(a.a(parama));
    return localMotionEvent;
  }
  
  public a c(MotionEvent paramMotionEvent)
  {
    a locala = a.b();
    paramMotionEvent = MotionEvent.obtain(paramMotionEvent);
    a.put(a.a(locala), paramMotionEvent);
    b.add(Long.valueOf(a.a(locala)));
    return locala;
  }
  
  public static class a
  {
    public static final AtomicLong b = new AtomicLong(0L);
    public final long a;
    
    public a(long paramLong)
    {
      a = paramLong;
    }
    
    public static a b()
    {
      return c(b.incrementAndGet());
    }
    
    public static a c(long paramLong)
    {
      return new a(paramLong);
    }
    
    public long d()
    {
      return a;
    }
  }
}

/* Location:
 * Qualified Name:     u5.N
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */