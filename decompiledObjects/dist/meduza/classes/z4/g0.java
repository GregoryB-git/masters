package z4;

import android.net.Uri;
import v3.o0;
import v3.o0.a;
import v3.o0.e;
import v3.r1;
import v3.r1.b;
import v3.r1.c;
import x6.b;

public final class g0
  extends r1
{
  public static final Object w = new Object();
  public final long b;
  public final long c;
  public final long d;
  public final long e;
  public final long f;
  public final long o;
  public final long p;
  public final boolean q;
  public final boolean r;
  public final boolean s;
  public final Object t;
  public final o0 u;
  public final o0.e v;
  
  static
  {
    o0.a locala = new o0.a();
    a = "SinglePeriodTimeline";
    b = Uri.EMPTY;
    locala.a();
  }
  
  public g0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, Object paramObject, o0 paramo0, o0.e parame)
  {
    b = paramLong1;
    c = paramLong2;
    d = -9223372036854775807L;
    e = paramLong3;
    f = paramLong4;
    o = paramLong5;
    p = paramLong6;
    q = paramBoolean1;
    r = paramBoolean2;
    s = paramBoolean3;
    t = paramObject;
    paramo0.getClass();
    u = paramo0;
    v = parame;
  }
  
  public g0(long paramLong1, long paramLong2, long paramLong3, long paramLong4, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, g5.a parama, o0 paramo0)
  {
    this(-9223372036854775807L, -9223372036854775807L, paramLong1, paramLong2, paramLong3, paramLong4, paramBoolean1, paramBoolean2, false, parama, paramo0, locale);
  }
  
  public g0(long paramLong, boolean paramBoolean1, boolean paramBoolean2, o0 paramo0)
  {
    this(paramLong, paramLong, 0L, 0L, paramBoolean1, false, paramBoolean2, null, paramo0);
  }
  
  public final int b(Object paramObject)
  {
    int i;
    if (w.equals(paramObject)) {
      i = 0;
    } else {
      i = -1;
    }
    return i;
  }
  
  public final r1.b f(int paramInt, r1.b paramb, boolean paramBoolean)
  {
    b.x(paramInt, 1);
    Object localObject;
    if (paramBoolean) {
      localObject = w;
    } else {
      localObject = null;
    }
    long l1 = e;
    long l2 = -o;
    paramb.getClass();
    paramb.h(null, localObject, 0, l1, l2, a5.a.o, false);
    return paramb;
  }
  
  public final int h()
  {
    return 1;
  }
  
  public final Object l(int paramInt)
  {
    b.x(paramInt, 1);
    return w;
  }
  
  public final r1.c n(int paramInt, r1.c paramc, long paramLong)
  {
    b.x(paramInt, 1);
    long l1 = p;
    boolean bool = r;
    long l2 = l1;
    if (bool)
    {
      l2 = l1;
      if (!s)
      {
        l2 = l1;
        if (paramLong != 0L)
        {
          long l3 = f;
          if (l3 != -9223372036854775807L)
          {
            paramLong = l1 + paramLong;
            l2 = paramLong;
            if (paramLong <= l3) {}
          }
          else
          {
            l2 = -9223372036854775807L;
          }
        }
      }
    }
    paramc.b(r1.c.z, u, t, b, c, d, q, bool, v, l2, f, 0, 0, o);
    return paramc;
  }
  
  public final int o()
  {
    return 1;
  }
}

/* Location:
 * Qualified Name:     z4.g0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */