package v3;

import java.util.Arrays;
import v5.e0;
import x6.b;

public final class f1$d
  implements g
{
  public final Object a;
  public final int b;
  public final o0 c;
  public final Object d;
  public final int e;
  public final long f;
  public final long o;
  public final int p;
  public final int q;
  
  static
  {
    e0.E(0);
    e0.E(1);
    e0.E(2);
    e0.E(3);
    e0.E(4);
    e0.E(5);
    e0.E(6);
  }
  
  public f1$d(Object paramObject1, int paramInt1, o0 paramo0, Object paramObject2, int paramInt2, long paramLong1, long paramLong2, int paramInt3, int paramInt4)
  {
    a = paramObject1;
    b = paramInt1;
    c = paramo0;
    d = paramObject2;
    e = paramInt2;
    f = paramLong1;
    o = paramLong2;
    p = paramInt3;
    q = paramInt4;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (d.class == paramObject.getClass()))
    {
      paramObject = (d)paramObject;
      if ((b != b) || (e != e) || (f != f) || (o != o) || (p != p) || (q != q) || (!b.Q(a, a)) || (!b.Q(d, d)) || (!b.Q(c, c))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, Integer.valueOf(b), c, d, Integer.valueOf(e), Long.valueOf(f), Long.valueOf(o), Integer.valueOf(p), Integer.valueOf(q) });
  }
}

/* Location:
 * Qualified Name:     v3.f1.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */