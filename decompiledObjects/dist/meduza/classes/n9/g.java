package n9;

import java.util.Date;
import p2.m0;
import x0.f;

public final class g
{
  public final a a;
  public final a.c b;
  public final long c;
  public final long d;
  public long e;
  public long f;
  public long g;
  public a.a h;
  
  public g(a parama, a.c paramc, long paramLong1, long paramLong2)
  {
    a = parama;
    b = paramc;
    c = paramLong1;
    d = paramLong2;
    e = paramLong2;
    g = new Date().getTime();
    f = 0L;
  }
  
  public final void a(Runnable paramRunnable)
  {
    a.a locala = h;
    if (locala != null)
    {
      locala.a();
      h = null;
    }
    long l1 = f + ((Math.random() - 0.5D) * f);
    long l2 = Math.max(0L, new Date().getTime() - g);
    long l3 = Math.max(0L, l1 - l2);
    if (f > 0L) {
      m0.y(1, g.class.getSimpleName(), "Backing off for %d ms (base delay: %d ms, delay with jitter: %d ms, last attempt: %d ms ago)", new Object[] { Long.valueOf(l3), Long.valueOf(f), Long.valueOf(l1), Long.valueOf(l2) });
    }
    h = a.b(b, l3, new f(21, this, paramRunnable));
    l3 = (f * 1.5D);
    f = l3;
    l1 = c;
    if (l3 >= l1)
    {
      l1 = e;
      if (l3 <= l1) {}
    }
    else
    {
      f = l1;
    }
    e = d;
  }
}

/* Location:
 * Qualified Name:     n9.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */