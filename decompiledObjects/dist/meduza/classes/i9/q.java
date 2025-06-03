package i9;

import b.m;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import n9.a;
import n9.a.a;
import n9.a.c;
import q5.i;

public final class q
{
  public static final long c;
  public static final long d;
  public final p a;
  public final b b;
  
  static
  {
    TimeUnit localTimeUnit = TimeUnit.MINUTES;
    c = localTimeUnit.toMillis(1L);
    d = localTimeUnit.toMillis(5L);
  }
  
  public q(p paramp, b paramb)
  {
    a = paramp;
    b = paramb;
  }
  
  public final class a
    implements k1
  {
    public final a a;
    public final n b;
    public boolean c = false;
    public a.a d;
    
    public a(a parama, n paramn)
    {
      a = parama;
      b = paramn;
    }
    
    public final void start()
    {
      if (b.a != -1L)
      {
        long l;
        if (c) {
          l = q.d;
        } else {
          l = q.c;
        }
        d = a.b(a.c.o, l, new m(this, 16));
      }
    }
    
    public final void stop()
    {
      a.a locala = d;
      if (locala != null) {
        locala.a();
      }
    }
  }
  
  public static final class b
  {
    public long a;
    
    public b(long paramLong)
    {
      a = paramLong;
    }
  }
  
  public static final class c {}
  
  public static final class d
  {
    public static final i c = new i(4);
    public final PriorityQueue<Long> a;
    public final int b;
    
    public d(int paramInt)
    {
      b = paramInt;
      a = new PriorityQueue(paramInt, c);
    }
    
    public final void a(Long paramLong)
    {
      if (a.size() < b) {}
      for (;;)
      {
        a.add(paramLong);
        break;
        Long localLong = (Long)a.peek();
        if (paramLong.longValue() >= localLong.longValue()) {
          break;
        }
        a.poll();
      }
    }
  }
}

/* Location:
 * Qualified Name:     i9.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */