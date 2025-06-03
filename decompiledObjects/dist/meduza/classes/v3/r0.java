package v3;

import v5.e0;
import x6.b;
import z4.s;
import z4.t.b;

public final class r0
{
  public final t.b a;
  public final long b;
  public final long c;
  public final long d;
  public final long e;
  public final boolean f;
  public final boolean g;
  public final boolean h;
  public final boolean i;
  
  public r0(t.b paramb, long paramLong1, long paramLong2, long paramLong3, long paramLong4, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    boolean bool1 = false;
    boolean bool2;
    if ((paramBoolean4) && (!paramBoolean2)) {
      bool2 = false;
    } else {
      bool2 = true;
    }
    b.q(bool2);
    if ((paramBoolean3) && (!paramBoolean2)) {
      bool2 = false;
    } else {
      bool2 = true;
    }
    b.q(bool2);
    if (paramBoolean1)
    {
      bool2 = bool1;
      if (!paramBoolean2)
      {
        bool2 = bool1;
        if (!paramBoolean3)
        {
          bool2 = bool1;
          if (paramBoolean4) {}
        }
      }
    }
    else
    {
      bool2 = true;
    }
    b.q(bool2);
    a = paramb;
    b = paramLong1;
    c = paramLong2;
    d = paramLong3;
    e = paramLong4;
    f = paramBoolean1;
    g = paramBoolean2;
    h = paramBoolean3;
    i = paramBoolean4;
  }
  
  public final r0 a(long paramLong)
  {
    r0 localr0;
    if (paramLong == c) {
      localr0 = this;
    } else {
      localr0 = new r0(a, b, paramLong, d, e, f, g, h, i);
    }
    return localr0;
  }
  
  public final r0 b(long paramLong)
  {
    r0 localr0;
    if (paramLong == b) {
      localr0 = this;
    } else {
      localr0 = new r0(a, paramLong, c, d, e, f, g, h, i);
    }
    return localr0;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (r0.class == paramObject.getClass()))
    {
      paramObject = (r0)paramObject;
      if ((b != b) || (c != c) || (d != d) || (e != e) || (f != f) || (g != g) || (h != h) || (i != i) || (!e0.a(a, a))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return ((((((((a.hashCode() + 527) * 31 + (int)b) * 31 + (int)c) * 31 + (int)d) * 31 + (int)e) * 31 + f) * 31 + g) * 31 + h) * 31 + i;
  }
}

/* Location:
 * Qualified Name:     v3.r0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */