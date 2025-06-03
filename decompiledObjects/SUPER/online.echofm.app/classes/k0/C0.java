package k0;

import g0.M;
import g0.a;
import x0.x.b;

public final class C0
{
  public final x.b a;
  public final long b;
  public final long c;
  public final long d;
  public final long e;
  public final boolean f;
  public final boolean g;
  public final boolean h;
  public final boolean i;
  
  public C0(x.b paramb, long paramLong1, long paramLong2, long paramLong3, long paramLong4, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    boolean bool1 = false;
    boolean bool2;
    if ((paramBoolean4) && (!paramBoolean2)) {
      bool2 = false;
    } else {
      bool2 = true;
    }
    a.a(bool2);
    if ((paramBoolean3) && (!paramBoolean2)) {
      bool2 = false;
    } else {
      bool2 = true;
    }
    a.a(bool2);
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
    a.a(bool2);
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
  
  public C0 a(long paramLong)
  {
    C0 localC0;
    if (paramLong == c) {
      localC0 = this;
    } else {
      localC0 = new C0(a, b, paramLong, d, e, f, g, h, i);
    }
    return localC0;
  }
  
  public C0 b(long paramLong)
  {
    C0 localC0;
    if (paramLong == b) {
      localC0 = this;
    } else {
      localC0 = new C0(a, paramLong, c, d, e, f, g, h, i);
    }
    return localC0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (C0.class == paramObject.getClass()))
    {
      paramObject = (C0)paramObject;
      if ((b != b) || (c != c) || (d != d) || (e != e) || (f != f) || (g != g) || (h != h) || (i != i) || (!M.c(a, a))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return ((((((((527 + a.hashCode()) * 31 + (int)b) * 31 + (int)c) * 31 + (int)d) * 31 + (int)e) * 31 + f) * 31 + g) * 31 + h) * 31 + i;
  }
}

/* Location:
 * Qualified Name:     k0.C0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */