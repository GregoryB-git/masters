package v3;

import a5.a;
import a5.a.a;
import android.net.Uri;
import android.util.Pair;
import r3.j;
import v5.e0;
import w3.v;
import x6.b;

public abstract class r1
  implements g
{
  public static final a a = new a();
  
  static
  {
    e0.E(0);
    e0.E(1);
    e0.E(2);
  }
  
  public int a(boolean paramBoolean)
  {
    int i;
    if (p()) {
      i = -1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public abstract int b(Object paramObject);
  
  public int c(boolean paramBoolean)
  {
    int i;
    if (p()) {
      i = -1;
    } else {
      i = o() - 1;
    }
    return i;
  }
  
  public final int d(int paramInt1, b paramb, c paramc, int paramInt2, boolean paramBoolean)
  {
    int i = fc;
    if (mx == paramInt1)
    {
      paramInt1 = e(i, paramInt2, paramBoolean);
      if (paramInt1 == -1) {
        return -1;
      }
      return mw;
    }
    return paramInt1 + 1;
  }
  
  public int e(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramInt2 != 0)
    {
      if (paramInt2 != 1)
      {
        if (paramInt2 == 2)
        {
          if (paramInt1 == c(paramBoolean)) {
            paramInt1 = a(paramBoolean);
          } else {
            paramInt1++;
          }
          return paramInt1;
        }
        throw new IllegalStateException();
      }
      return paramInt1;
    }
    if (paramInt1 == c(paramBoolean)) {
      paramInt1 = -1;
    } else {
      paramInt1++;
    }
    return paramInt1;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof r1)) {
      return false;
    }
    paramObject = (r1)paramObject;
    if ((((r1)paramObject).o() == o()) && (((r1)paramObject).h() == h()))
    {
      c localc1 = new c();
      b localb1 = new b();
      c localc2 = new c();
      b localb2 = new b();
      for (int i = 0; i < o(); i++) {
        if (!m(i, localc1).equals(((r1)paramObject).m(i, localc2))) {
          return false;
        }
      }
      for (i = 0; i < h(); i++) {
        if (!f(i, localb1, true).equals(((r1)paramObject).f(i, localb2, true))) {
          return false;
        }
      }
      i = a(true);
      if (i != ((r1)paramObject).a(true)) {
        return false;
      }
      int j = c(true);
      if (j != ((r1)paramObject).c(true)) {
        return false;
      }
      while (i != j)
      {
        int k = e(i, 0, true);
        if (k != ((r1)paramObject).e(i, 0, true)) {
          return false;
        }
        i = k;
      }
      return true;
    }
    return false;
  }
  
  public abstract b f(int paramInt, b paramb, boolean paramBoolean);
  
  public b g(Object paramObject, b paramb)
  {
    return f(b(paramObject), paramb, true);
  }
  
  public abstract int h();
  
  public final int hashCode()
  {
    c localc = new c();
    b localb = new b();
    int i = o() + 217;
    for (int j = 0;; j++)
    {
      int k = o();
      i *= 31;
      if (j >= k) {
        break;
      }
      i += m(j, localc).hashCode();
    }
    j = h() + i;
    for (i = 0; i < h(); i++) {
      j = j * 31 + f(i, localb, true).hashCode();
    }
    for (i = a(true); i != -1; i = e(i, 0, true)) {
      j = j * 31 + i;
    }
    return j;
  }
  
  public final Pair<Object, Long> i(c paramc, b paramb, int paramInt, long paramLong)
  {
    paramc = j(paramc, paramb, paramInt, paramLong, 0L);
    paramc.getClass();
    return paramc;
  }
  
  public final Pair<Object, Long> j(c paramc, b paramb, int paramInt, long paramLong1, long paramLong2)
  {
    b.x(paramInt, o());
    n(paramInt, paramc, paramLong2);
    paramLong2 = paramLong1;
    if (paramLong1 == -9223372036854775807L)
    {
      paramLong1 = u;
      paramLong2 = paramLong1;
      if (paramLong1 == -9223372036854775807L) {
        return null;
      }
    }
    paramInt = w;
    f(paramInt, paramb, false);
    while ((paramInt < x) && (e != paramLong2))
    {
      int i = paramInt + 1;
      if (fe > paramLong2) {
        break;
      }
      paramInt = i;
    }
    f(paramInt, paramb, true);
    paramLong2 -= e;
    long l = d;
    paramLong1 = paramLong2;
    if (l != -9223372036854775807L) {
      paramLong1 = Math.min(paramLong2, l - 1L);
    }
    paramLong1 = Math.max(0L, paramLong1);
    paramc = b;
    paramc.getClass();
    return Pair.create(paramc, Long.valueOf(paramLong1));
  }
  
  public int k(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramInt2 != 0)
    {
      if (paramInt2 != 1)
      {
        if (paramInt2 == 2)
        {
          if (paramInt1 == a(paramBoolean)) {
            paramInt1 = c(paramBoolean);
          } else {
            paramInt1--;
          }
          return paramInt1;
        }
        throw new IllegalStateException();
      }
      return paramInt1;
    }
    if (paramInt1 == a(paramBoolean)) {
      paramInt1 = -1;
    } else {
      paramInt1--;
    }
    return paramInt1;
  }
  
  public abstract Object l(int paramInt);
  
  public final c m(int paramInt, c paramc)
  {
    return n(paramInt, paramc, 0L);
  }
  
  public abstract c n(int paramInt, c paramc, long paramLong);
  
  public abstract int o();
  
  public final boolean p()
  {
    boolean bool;
    if (o() == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final class a
    extends r1
  {
    public final int b(Object paramObject)
    {
      return -1;
    }
    
    public final r1.b f(int paramInt, r1.b paramb, boolean paramBoolean)
    {
      throw new IndexOutOfBoundsException();
    }
    
    public final int h()
    {
      return 0;
    }
    
    public final Object l(int paramInt)
    {
      throw new IndexOutOfBoundsException();
    }
    
    public final r1.c n(int paramInt, r1.c paramc, long paramLong)
    {
      throw new IndexOutOfBoundsException();
    }
    
    public final int o()
    {
      return 0;
    }
  }
  
  public static final class b
    implements g
  {
    public static final String p = e0.E(0);
    public static final String q = e0.E(1);
    public static final String r = e0.E(2);
    public static final String s = e0.E(3);
    public static final String t = e0.E(4);
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public a o = a.o;
    
    static
    {
      new v(7);
    }
    
    public final long a(int paramInt1, int paramInt2)
    {
      a.a locala = o.a(paramInt1);
      long l;
      if (b != -1) {
        l = f[paramInt2];
      } else {
        l = -9223372036854775807L;
      }
      return l;
    }
    
    public final int b(long paramLong)
    {
      a locala = o;
      long l = d;
      locala.getClass();
      int i = -1;
      int j = i;
      if (paramLong != Long.MIN_VALUE) {
        if ((l != -9223372036854775807L) && (paramLong >= l))
        {
          j = i;
        }
        else
        {
          for (int k = e; k < b; k++) {
            if ((aa == Long.MIN_VALUE) || (aa > paramLong))
            {
              a.a locala1 = locala.a(k);
              if ((b != -1) && (locala1.a(-1) >= b)) {
                j = 0;
              } else {
                j = 1;
              }
              if (j != 0) {
                break;
              }
            }
          }
          j = i;
          if (k < b) {
            j = k;
          }
        }
      }
      return j;
    }
    
    public final int c(long paramLong)
    {
      Object localObject = o;
      long l1 = d;
      int i = b;
      int j = 1;
      i--;
      int k;
      while (i >= 0)
      {
        if (paramLong != Long.MIN_VALUE)
        {
          long l2 = aa;
          if (l2 == Long.MIN_VALUE ? (l1 == -9223372036854775807L) || (paramLong < l1) : paramLong < l2)
          {
            k = 1;
            break label94;
          }
        }
        k = 0;
        label94:
        if (k == 0) {
          break;
        }
        i--;
      }
      if (i >= 0)
      {
        localObject = ((a)localObject).a(i);
        int m;
        if (b == -1)
        {
          m = j;
        }
        else
        {
          for (k = 0; k < b; k++)
          {
            int n = e[k];
            m = j;
            if (n == 0) {
              break label184;
            }
            if (n == 1)
            {
              m = j;
              break label184;
            }
          }
          m = 0;
        }
        label184:
        if (m != 0) {}
      }
      else
      {
        i = -1;
      }
      return i;
    }
    
    public final long d(int paramInt)
    {
      return o.a(paramInt).a;
    }
    
    public final int e(int paramInt1, int paramInt2)
    {
      a.a locala = o.a(paramInt1);
      if (b != -1) {
        paramInt1 = e[paramInt2];
      } else {
        paramInt1 = 0;
      }
      return paramInt1;
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (b.class.equals(paramObject.getClass())))
      {
        paramObject = (b)paramObject;
        if ((!e0.a(a, a)) || (!e0.a(b, b)) || (c != c) || (d != d) || (e != e) || (f != f) || (!e0.a(o, o))) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public final int f(int paramInt)
    {
      return o.a(paramInt).a(-1);
    }
    
    public final boolean g(int paramInt)
    {
      return o.a(paramInt).p;
    }
    
    public final void h(Object paramObject1, Object paramObject2, int paramInt, long paramLong1, long paramLong2, a parama, boolean paramBoolean)
    {
      a = paramObject1;
      b = paramObject2;
      c = paramInt;
      d = paramLong1;
      e = paramLong2;
      o = parama;
      f = paramBoolean;
    }
    
    public final int hashCode()
    {
      Object localObject = a;
      int i = 0;
      int j;
      if (localObject == null) {
        j = 0;
      } else {
        j = localObject.hashCode();
      }
      localObject = b;
      if (localObject != null) {
        i = localObject.hashCode();
      }
      int k = c;
      long l = d;
      int m = (int)(l ^ l >>> 32);
      l = e;
      int n = (int)(l ^ l >>> 32);
      int i1 = f;
      return o.hashCode() + ((((((217 + j) * 31 + i) * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31;
    }
  }
  
  public static final class c
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
}

/* Location:
 * Qualified Name:     v3.r1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */