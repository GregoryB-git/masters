package d0;

import android.net.Uri;
import g0.M;

public final class I$c
{
  public static final String A = M.w0(8);
  public static final String B = M.w0(9);
  public static final String C = M.w0(10);
  public static final String D = M.w0(11);
  public static final String E = M.w0(12);
  public static final String F = M.w0(13);
  public static final Object q = new Object();
  public static final Object r = new Object();
  public static final u s = new u.c().b("androidx.media3.common.Timeline").e(Uri.EMPTY).a();
  public static final String t = M.w0(1);
  public static final String u = M.w0(2);
  public static final String v = M.w0(3);
  public static final String w = M.w0(4);
  public static final String x = M.w0(5);
  public static final String y = M.w0(6);
  public static final String z = M.w0(7);
  public Object a = q;
  public Object b;
  public u c = s;
  public Object d;
  public long e;
  public long f;
  public long g;
  public boolean h;
  public boolean i;
  public u.g j;
  public boolean k;
  public long l;
  public long m;
  public int n;
  public int o;
  public long p;
  
  public long a()
  {
    return M.d0(g);
  }
  
  public long b()
  {
    return M.i1(l);
  }
  
  public long c()
  {
    return l;
  }
  
  public long d()
  {
    return M.i1(m);
  }
  
  public long e()
  {
    return p;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (c.class.equals(paramObject.getClass())))
    {
      paramObject = (c)paramObject;
      if ((!M.c(a, a)) || (!M.c(c, c)) || (!M.c(d, d)) || (!M.c(j, j)) || (e != e) || (f != f) || (g != g) || (h != h) || (i != i) || (k != k) || (l != l) || (m != m) || (n != n) || (o != o) || (p != p)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public boolean f()
  {
    boolean bool;
    if (j != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public c g(Object paramObject1, u paramu, Object paramObject2, long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean1, boolean paramBoolean2, u.g paramg, long paramLong4, long paramLong5, int paramInt1, int paramInt2, long paramLong6)
  {
    a = paramObject1;
    if (paramu != null) {
      paramObject1 = paramu;
    } else {
      paramObject1 = s;
    }
    c = ((u)paramObject1);
    if (paramu != null)
    {
      paramObject1 = b;
      if (paramObject1 != null)
      {
        paramObject1 = h;
        break label46;
      }
    }
    paramObject1 = null;
    label46:
    b = paramObject1;
    d = paramObject2;
    e = paramLong1;
    f = paramLong2;
    g = paramLong3;
    h = paramBoolean1;
    i = paramBoolean2;
    j = paramg;
    l = paramLong4;
    m = paramLong5;
    n = paramInt1;
    o = paramInt2;
    p = paramLong6;
    k = false;
    return this;
  }
  
  public int hashCode()
  {
    int i1 = a.hashCode();
    int i2 = c.hashCode();
    Object localObject = d;
    int i3 = 0;
    int i4;
    if (localObject == null) {
      i4 = 0;
    } else {
      i4 = localObject.hashCode();
    }
    localObject = j;
    if (localObject != null) {
      i3 = ((u.g)localObject).hashCode();
    }
    long l1 = e;
    int i5 = (int)(l1 ^ l1 >>> 32);
    l1 = f;
    int i6 = (int)(l1 ^ l1 >>> 32);
    l1 = g;
    int i7 = (int)(l1 ^ l1 >>> 32);
    int i8 = h;
    int i9 = i;
    int i10 = k;
    l1 = l;
    int i11 = (int)(l1 ^ l1 >>> 32);
    l1 = m;
    int i12 = (int)(l1 ^ l1 >>> 32);
    int i13 = n;
    int i14 = o;
    l1 = p;
    return ((((((((((((((217 + i1) * 31 + i2) * 31 + i4) * 31 + i3) * 31 + i5) * 31 + i6) * 31 + i7) * 31 + i8) * 31 + i9) * 31 + i10) * 31 + i11) * 31 + i12) * 31 + i13) * 31 + i14) * 31 + (int)(l1 ^ l1 >>> 32);
  }
}

/* Location:
 * Qualified Name:     d0.I.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */