package l0;

import W2.k;
import d0.I;
import x0.x.b;

public final class c$a
{
  public final long a;
  public final I b;
  public final int c;
  public final x.b d;
  public final long e;
  public final I f;
  public final int g;
  public final x.b h;
  public final long i;
  public final long j;
  
  public c$a(long paramLong1, I paramI1, int paramInt1, x.b paramb1, long paramLong2, I paramI2, int paramInt2, x.b paramb2, long paramLong3, long paramLong4)
  {
    a = paramLong1;
    b = paramI1;
    c = paramInt1;
    d = paramb1;
    e = paramLong2;
    f = paramI2;
    g = paramInt2;
    h = paramb2;
    i = paramLong3;
    j = paramLong4;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (a.class == paramObject.getClass()))
    {
      paramObject = (a)paramObject;
      if ((a != a) || (c != c) || (e != e) || (g != g) || (i != i) || (j != j) || (!k.a(b, b)) || (!k.a(d, d)) || (!k.a(f, f)) || (!k.a(h, h))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return k.b(new Object[] { Long.valueOf(a), b, Integer.valueOf(c), d, Long.valueOf(e), f, Integer.valueOf(g), h, Long.valueOf(i), Long.valueOf(j) });
  }
}

/* Location:
 * Qualified Name:     l0.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */