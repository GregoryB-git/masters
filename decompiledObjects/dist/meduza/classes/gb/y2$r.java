package gb;

import eb.h;
import java.util.concurrent.atomic.AtomicLong;

public final class y2$r
  extends h
{
  public final y2.a0 c;
  public long d;
  
  public y2$r(y2 paramy2, y2.a0 parama0)
  {
    c = parama0;
  }
  
  public final void n(long paramLong)
  {
    if (e.o.f != null) {
      return;
    }
    z2 localz2 = null;
    synchronized (e.i)
    {
      if (e.o.f == null)
      {
        Object localObject3 = c;
        if (!b)
        {
          long l = d + paramLong;
          d = l;
          y2 localy2 = e;
          paramLong = t;
          if (l <= paramLong) {
            return;
          }
          if (l > k)
          {
            c = true;
          }
          else
          {
            paramLong = j.a.addAndGet(l - paramLong);
            localObject3 = e;
            t = d;
            if (paramLong > l) {
              c.c = true;
            }
          }
          localObject3 = c;
          if (c) {
            localz2 = e.q((y2.a0)localObject3);
          }
          if (localz2 != null) {
            localz2.run();
          }
          return;
        }
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     gb.y2.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */