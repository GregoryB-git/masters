package x0;

import android.net.Uri;
import d0.I;
import d0.I.b;
import d0.I.c;
import d0.u;
import d0.u.c;
import d0.u.g;
import g0.a;

public final class V
  extends I
{
  public static final Object r = new Object();
  public static final u s = new u.c().b("SinglePeriodTimeline").e(Uri.EMPTY).a();
  public final long e;
  public final long f;
  public final long g;
  public final long h;
  public final long i;
  public final long j;
  public final long k;
  public final boolean l;
  public final boolean m;
  public final boolean n;
  public final Object o;
  public final u p;
  public final u.g q;
  
  public V(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, Object paramObject, u paramu, u.g paramg)
  {
    e = paramLong1;
    f = paramLong2;
    g = paramLong3;
    h = paramLong4;
    i = paramLong5;
    j = paramLong6;
    k = paramLong7;
    l = paramBoolean1;
    m = paramBoolean2;
    n = paramBoolean3;
    o = paramObject;
    p = ((u)a.e(paramu));
    q = paramg;
  }
  
  public V(long paramLong1, long paramLong2, long paramLong3, long paramLong4, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, Object paramObject, u paramu)
  {
    this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, paramLong1, paramLong2, paramLong3, paramLong4, paramBoolean1, paramBoolean2, false, paramObject, paramu, localg);
  }
  
  public V(long paramLong, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, Object paramObject, u paramu)
  {
    this(paramLong, paramLong, 0L, 0L, paramBoolean1, paramBoolean2, paramBoolean3, paramObject, paramu);
  }
  
  public int b(Object paramObject)
  {
    int i1;
    if (r.equals(paramObject)) {
      i1 = 0;
    } else {
      i1 = -1;
    }
    return i1;
  }
  
  public I.b g(int paramInt, I.b paramb, boolean paramBoolean)
  {
    a.c(paramInt, 0, 1);
    if (paramBoolean) {}
    for (Object localObject = r;; localObject = null) {
      break;
    }
    return paramb.s(null, localObject, 0, h, -j);
  }
  
  public int i()
  {
    return 1;
  }
  
  public Object m(int paramInt)
  {
    a.c(paramInt, 0, 1);
    return r;
  }
  
  public I.c o(int paramInt, I.c paramc, long paramLong)
  {
    a.c(paramInt, 0, 1);
    long l1 = k;
    boolean bool = m;
    long l2 = l1;
    if (bool)
    {
      l2 = l1;
      if (!n)
      {
        l2 = l1;
        if (paramLong != 0L)
        {
          long l3 = i;
          if (l3 == -9223372036854775807L) {}
          do
          {
            paramLong = -9223372036854775807L;
            break;
            paramLong = l1 + paramLong;
            l2 = paramLong;
          } while (paramLong > l3);
        }
      }
    }
    paramLong = l2;
    return paramc.g(I.c.q, p, o, e, f, g, l, bool, q, paramLong, i, 0, 0, j);
  }
  
  public int p()
  {
    return 1;
  }
}

/* Location:
 * Qualified Name:     x0.V
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */