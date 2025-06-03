package v3;

import android.net.Uri;
import r3.j;
import v5.e0;
import x6.b;

public final class r1$c
  implements g
{
  public static final Object A;
  public static final o0 B;
  public static final String C;
  public static final String D;
  public static final String E;
  public static final String F;
  public static final String G;
  public static final String H;
  public static final String I;
  public static final String J;
  public static final String K;
  public static final String L;
  public static final String M;
  public static final String N;
  public static final String O;
  public static final Object z = new Object();
  public Object a = z;
  @Deprecated
  public Object b;
  public o0 c = B;
  public Object d;
  public long e;
  public long f;
  public long o;
  public boolean p;
  public boolean q;
  @Deprecated
  public boolean r;
  public o0.e s;
  public boolean t;
  public long u;
  public long v;
  public int w;
  public int x;
  public long y;
  
  static
  {
    A = new Object();
    o0.a locala = new o0.a();
    a = "com.google.android.exoplayer2.Timeline";
    b = Uri.EMPTY;
    B = locala.a();
    C = e0.E(1);
    D = e0.E(2);
    E = e0.E(3);
    F = e0.E(4);
    G = e0.E(5);
    H = e0.E(6);
    I = e0.E(7);
    J = e0.E(8);
    K = e0.E(9);
    L = e0.E(10);
    M = e0.E(11);
    N = e0.E(12);
    O = e0.E(13);
    new j(10);
  }
  
  public final boolean a()
  {
    boolean bool1 = r;
    o0.e locale = s;
    boolean bool2 = true;
    boolean bool3;
    if (locale != null) {
      bool3 = true;
    } else {
      bool3 = false;
    }
    if (bool1 == bool3) {
      bool3 = true;
    } else {
      bool3 = false;
    }
    b.H(bool3);
    if (s != null) {
      bool3 = bool2;
    } else {
      bool3 = false;
    }
    return bool3;
  }
  
  public final void b(Object paramObject1, o0 paramo0, Object paramObject2, long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean1, boolean paramBoolean2, o0.e parame, long paramLong4, long paramLong5, int paramInt1, int paramInt2, long paramLong6)
  {
    a = paramObject1;
    if (paramo0 != null) {
      paramObject1 = paramo0;
    } else {
      paramObject1 = B;
    }
    c = ((o0)paramObject1);
    if (paramo0 != null)
    {
      paramObject1 = b;
      if (paramObject1 != null)
      {
        paramObject1 = g;
        break label46;
      }
    }
    paramObject1 = null;
    label46:
    b = paramObject1;
    d = paramObject2;
    e = paramLong1;
    f = paramLong2;
    o = paramLong3;
    p = paramBoolean1;
    q = paramBoolean2;
    if (parame != null) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    r = paramBoolean1;
    s = parame;
    u = paramLong4;
    v = paramLong5;
    w = paramInt1;
    x = paramInt2;
    y = paramLong6;
    t = false;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (c.class.equals(paramObject.getClass())))
    {
      paramObject = (c)paramObject;
      if ((!e0.a(a, a)) || (!e0.a(c, c)) || (!e0.a(d, d)) || (!e0.a(s, s)) || (e != e) || (f != f) || (o != o) || (p != p) || (q != q) || (t != t) || (u != u) || (v != v) || (w != w) || (x != x) || (y != y)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    int j = c.hashCode();
    Object localObject = d;
    int k = 0;
    int m;
    if (localObject == null) {
      m = 0;
    } else {
      m = localObject.hashCode();
    }
    localObject = s;
    if (localObject != null) {
      k = ((o0.e)localObject).hashCode();
    }
    long l = e;
    int n = (int)(l ^ l >>> 32);
    l = f;
    int i1 = (int)(l ^ l >>> 32);
    l = o;
    int i2 = (int)(l ^ l >>> 32);
    int i3 = p;
    int i4 = q;
    int i5 = t;
    l = u;
    int i6 = (int)(l ^ l >>> 32);
    l = v;
    int i7 = (int)(l ^ l >>> 32);
    int i8 = w;
    int i9 = x;
    l = y;
    return (((((((((((((j + (i + 217) * 31) * 31 + m) * 31 + k) * 31 + n) * 31 + i1) * 31 + i2) * 31 + i3) * 31 + i4) * 31 + i5) * 31 + i6) * 31 + i7) * 31 + i8) * 31 + i9) * 31 + (int)(l ^ l >>> 32);
  }
}

/* Location:
 * Qualified Name:     v3.r1.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */