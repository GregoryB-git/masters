package d0;

import W2.k;
import g0.M;

public final class D$e
{
  public static final String k = M.w0(0);
  public static final String l = M.w0(1);
  public static final String m = M.w0(2);
  public static final String n = M.w0(3);
  public static final String o = M.w0(4);
  public static final String p = M.w0(5);
  public static final String q = M.w0(6);
  public final Object a;
  public final int b;
  public final int c;
  public final u d;
  public final Object e;
  public final int f;
  public final long g;
  public final long h;
  public final int i;
  public final int j;
  
  public D$e(Object paramObject1, int paramInt1, u paramu, Object paramObject2, int paramInt2, long paramLong1, long paramLong2, int paramInt3, int paramInt4)
  {
    a = paramObject1;
    b = paramInt1;
    c = paramInt1;
    d = paramu;
    e = paramObject2;
    f = paramInt2;
    g = paramLong1;
    h = paramLong2;
    i = paramInt3;
    j = paramInt4;
  }
  
  public boolean a(e parame)
  {
    boolean bool;
    if ((c == c) && (f == f) && (g == g) && (h == h) && (i == i) && (j == j) && (k.a(d, d))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (e.class == paramObject.getClass()))
    {
      paramObject = (e)paramObject;
      if ((!a((e)paramObject)) || (!k.a(a, a)) || (!k.a(e, e))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return k.b(new Object[] { a, Integer.valueOf(c), d, e, Integer.valueOf(f), Long.valueOf(g), Long.valueOf(h), Integer.valueOf(i), Integer.valueOf(j) });
  }
}

/* Location:
 * Qualified Name:     d0.D.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */