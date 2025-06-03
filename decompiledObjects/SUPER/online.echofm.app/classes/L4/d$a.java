package L4;

import M4.l;
import java.util.concurrent.TimeUnit;

public class d$a
{
  public static final F4.a k = ;
  public static final long l = TimeUnit.SECONDS.toMicros(1L);
  public final M4.a a;
  public final boolean b;
  public l c;
  public M4.i d;
  public long e;
  public double f;
  public M4.i g;
  public M4.i h;
  public long i;
  public long j;
  
  public d$a(M4.i parami, long paramLong, M4.a parama, C4.a parama1, String paramString, boolean paramBoolean)
  {
    a = parama;
    e = paramLong;
    d = parami;
    f = paramLong;
    c = parama.a();
    g(parama1, paramString, paramBoolean);
    b = paramBoolean;
  }
  
  public static long c(C4.a parama, String paramString)
  {
    if (paramString == "Trace") {
      return parama.E();
    }
    return parama.q();
  }
  
  public static long d(C4.a parama, String paramString)
  {
    if (paramString == "Trace") {
      return parama.t();
    }
    return parama.t();
  }
  
  public static long e(C4.a parama, String paramString)
  {
    if (paramString == "Trace") {
      return parama.F();
    }
    return parama.r();
  }
  
  public static long f(C4.a parama, String paramString)
  {
    if (paramString == "Trace") {
      return parama.t();
    }
    return parama.t();
  }
  
  public void a(boolean paramBoolean)
  {
    M4.i locali2;
    if (paramBoolean) {
      try
      {
        M4.i locali1 = g;
      }
      finally
      {
        break label53;
      }
    } else {
      locali2 = h;
    }
    d = locali2;
    long l1;
    if (paramBoolean) {
      l1 = i;
    } else {
      l1 = j;
    }
    e = l1;
    return;
    label53:
    throw locali2;
  }
  
  public boolean b(N4.i parami)
  {
    try
    {
      parami = a.a();
      d1 = c.d(parami) * d.a() / l;
      if (d1 > 0.0D)
      {
        f = Math.min(f + d1, e);
        c = parami;
      }
    }
    finally
    {
      break label110;
    }
    double d1 = f;
    if (d1 >= 1.0D)
    {
      f = (d1 - 1.0D);
      return true;
    }
    if (b) {
      k.j("Exceeded log rate limit, dropping the log.");
    }
    return false;
    label110:
    throw parami;
  }
  
  public final void g(C4.a parama, String paramString, boolean paramBoolean)
  {
    long l1 = f(parama, paramString);
    long l2 = e(parama, paramString);
    TimeUnit localTimeUnit = TimeUnit.SECONDS;
    M4.i locali = new M4.i(l2, l1, localTimeUnit);
    g = locali;
    i = l2;
    if (paramBoolean) {
      k.b("Foreground %s logging rate:%f, burst capacity:%d", new Object[] { paramString, locali, Long.valueOf(l2) });
    }
    l1 = d(parama, paramString);
    l2 = c(parama, paramString);
    parama = new M4.i(l2, l1, localTimeUnit);
    h = parama;
    j = l2;
    if (paramBoolean) {
      k.b("Background %s logging rate:%f, capacity:%d", new Object[] { paramString, parama, Long.valueOf(l2) });
    }
  }
}

/* Location:
 * Qualified Name:     L4.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */