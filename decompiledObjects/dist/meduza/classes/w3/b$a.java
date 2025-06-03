package w3;

import java.util.Arrays;
import v3.r1;
import x6.b;
import z4.t.b;

public final class b$a
{
  public final long a;
  public final r1 b;
  public final int c;
  public final t.b d;
  public final long e;
  public final r1 f;
  public final int g;
  public final t.b h;
  public final long i;
  public final long j;
  
  public b$a(long paramLong1, r1 paramr11, int paramInt1, t.b paramb1, long paramLong2, r1 paramr12, int paramInt2, t.b paramb2, long paramLong3, long paramLong4)
  {
    a = paramLong1;
    b = paramr11;
    c = paramInt1;
    d = paramb1;
    e = paramLong2;
    f = paramr12;
    g = paramInt2;
    h = paramb2;
    i = paramLong3;
    j = paramLong4;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (a.class == paramObject.getClass()))
    {
      paramObject = (a)paramObject;
      if ((a != a) || (c != c) || (e != e) || (g != g) || (i != i) || (j != j) || (!b.Q(b, b)) || (!b.Q(d, d)) || (!b.Q(f, f)) || (!b.Q(h, h))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Long.valueOf(a), b, Integer.valueOf(c), d, Long.valueOf(e), f, Integer.valueOf(g), h, Long.valueOf(i), Long.valueOf(j) });
  }
}

/* Location:
 * Qualified Name:     w3.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */