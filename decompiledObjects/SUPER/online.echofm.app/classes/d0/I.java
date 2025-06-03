package d0;

import android.net.Uri;
import android.util.Pair;
import g0.M;

public abstract class I
{
  public static final I a = new a();
  public static final String b = M.w0(0);
  public static final String c = M.w0(1);
  public static final String d = M.w0(2);
  
  public int a(boolean paramBoolean)
  {
    int i;
    if (q()) {
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
    if (q()) {
      i = -1;
    } else {
      i = p() - 1;
    }
    return i;
  }
  
  public final int d(int paramInt1, b paramb, c paramc, int paramInt2, boolean paramBoolean)
  {
    int i = fc;
    if (no == paramInt1)
    {
      paramInt1 = e(i, paramInt2, paramBoolean);
      if (paramInt1 == -1) {
        return -1;
      }
      return nn;
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
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof I)) {
      return false;
    }
    I localI = (I)paramObject;
    if ((localI.p() == p()) && (localI.i() == i()))
    {
      paramObject = new c();
      b localb1 = new b();
      c localc = new c();
      b localb2 = new b();
      for (int i = 0; i < p(); i++) {
        if (!n(i, (c)paramObject).equals(localI.n(i, localc))) {
          return false;
        }
      }
      for (i = 0; i < i(); i++) {
        if (!g(i, localb1, true).equals(localI.g(i, localb2, true))) {
          return false;
        }
      }
      i = a(true);
      if (i != localI.a(true)) {
        return false;
      }
      int j = c(true);
      if (j != localI.c(true)) {
        return false;
      }
      while (i != j)
      {
        int k = e(i, 0, true);
        if (k != localI.e(i, 0, true)) {
          return false;
        }
        i = k;
      }
      return true;
    }
    return false;
  }
  
  public final b f(int paramInt, b paramb)
  {
    return g(paramInt, paramb, false);
  }
  
  public abstract b g(int paramInt, b paramb, boolean paramBoolean);
  
  public b h(Object paramObject, b paramb)
  {
    return g(b(paramObject), paramb, true);
  }
  
  public int hashCode()
  {
    c localc = new c();
    b localb = new b();
    int i = 217 + p();
    for (int j = 0;; j++)
    {
      int k = p();
      i *= 31;
      if (j >= k) {
        break;
      }
      i += n(j, localc).hashCode();
    }
    j = i + i();
    for (i = 0; i < i(); i++) {
      j = j * 31 + g(i, localb, true).hashCode();
    }
    for (i = a(true); i != -1; i = e(i, 0, true)) {
      j = j * 31 + i;
    }
    return j;
  }
  
  public abstract int i();
  
  public final Pair j(c paramc, b paramb, int paramInt, long paramLong)
  {
    return (Pair)g0.a.e(k(paramc, paramb, paramInt, paramLong, 0L));
  }
  
  public final Pair k(c paramc, b paramb, int paramInt, long paramLong1, long paramLong2)
  {
    g0.a.c(paramInt, 0, p());
    o(paramInt, paramc, paramLong2);
    paramLong2 = paramLong1;
    if (paramLong1 == -9223372036854775807L)
    {
      paramLong1 = paramc.c();
      paramLong2 = paramLong1;
      if (paramLong1 == -9223372036854775807L) {
        return null;
      }
    }
    paramInt = n;
    f(paramInt, paramb);
    while ((paramInt < o) && (e != paramLong2))
    {
      int i = paramInt + 1;
      if (fe > paramLong2) {
        break;
      }
      paramInt = i;
    }
    g(paramInt, paramb, true);
    paramLong2 -= e;
    long l = d;
    paramLong1 = paramLong2;
    if (l != -9223372036854775807L) {
      paramLong1 = Math.min(paramLong2, l - 1L);
    }
    paramLong1 = Math.max(0L, paramLong1);
    return Pair.create(g0.a.e(b), Long.valueOf(paramLong1));
  }
  
  public int l(int paramInt1, int paramInt2, boolean paramBoolean)
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
  
  public abstract Object m(int paramInt);
  
  public final c n(int paramInt, c paramc)
  {
    return o(paramInt, paramc, 0L);
  }
  
  public abstract c o(int paramInt, c paramc, long paramLong);
  
  public abstract int p();
  
  public final boolean q()
  {
    boolean bool;
    if (p() == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean r(int paramInt1, b paramb, c paramc, int paramInt2, boolean paramBoolean)
  {
    if (d(paramInt1, paramb, paramc, paramInt2, paramBoolean) == -1) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    return paramBoolean;
  }
  
  public class a
    extends I
  {
    public int b(Object paramObject)
    {
      return -1;
    }
    
    public I.b g(int paramInt, I.b paramb, boolean paramBoolean)
    {
      throw new IndexOutOfBoundsException();
    }
    
    public int i()
    {
      return 0;
    }
    
    public Object m(int paramInt)
    {
      throw new IndexOutOfBoundsException();
    }
    
    public I.c o(int paramInt, I.c paramc, long paramLong)
    {
      throw new IndexOutOfBoundsException();
    }
    
    public int p()
    {
      return 0;
    }
  }
  
  public static final class b
  {
    public static final String h = M.w0(0);
    public static final String i = M.w0(1);
    public static final String j = M.w0(2);
    public static final String k = M.w0(3);
    public static final String l = M.w0(4);
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public a g = a.g;
    
    public int a(int paramInt)
    {
      return g.a(paramInt).b;
    }
    
    public long b(int paramInt1, int paramInt2)
    {
      a.a locala = g.a(paramInt1);
      long l1;
      if (b != -1) {
        l1 = g[paramInt2];
      } else {
        l1 = -9223372036854775807L;
      }
      return l1;
    }
    
    public int c()
    {
      return g.b;
    }
    
    public int d(long paramLong)
    {
      return g.b(paramLong, d);
    }
    
    public int e(long paramLong)
    {
      return g.c(paramLong, d);
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (b.class.equals(paramObject.getClass())))
      {
        paramObject = (b)paramObject;
        if ((!M.c(a, a)) || (!M.c(b, b)) || (c != c) || (d != d) || (e != e) || (f != f) || (!M.c(g, g))) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public long f(int paramInt)
    {
      return g.a(paramInt).a;
    }
    
    public long g()
    {
      return g.c;
    }
    
    public int h(int paramInt1, int paramInt2)
    {
      a.a locala = g.a(paramInt1);
      if (b != -1) {
        paramInt1 = f[paramInt2];
      } else {
        paramInt1 = 0;
      }
      return paramInt1;
    }
    
    public int hashCode()
    {
      Object localObject = a;
      int m = 0;
      int n;
      if (localObject == null) {
        n = 0;
      } else {
        n = localObject.hashCode();
      }
      localObject = b;
      if (localObject != null) {
        m = localObject.hashCode();
      }
      int i1 = c;
      long l1 = d;
      int i2 = (int)(l1 ^ l1 >>> 32);
      l1 = e;
      return ((((((217 + n) * 31 + m) * 31 + i1) * 31 + i2) * 31 + (int)(l1 ^ l1 >>> 32)) * 31 + f) * 31 + g.hashCode();
    }
    
    public long i(int paramInt)
    {
      return g.a(paramInt).h;
    }
    
    public long j()
    {
      return d;
    }
    
    public int k(int paramInt)
    {
      return g.a(paramInt).d();
    }
    
    public int l(int paramInt1, int paramInt2)
    {
      return g.a(paramInt1).e(paramInt2);
    }
    
    public long m()
    {
      return M.i1(e);
    }
    
    public long n()
    {
      return e;
    }
    
    public int o()
    {
      return g.e;
    }
    
    public boolean p(int paramInt)
    {
      return g.a(paramInt).f() ^ true;
    }
    
    public boolean q(int paramInt)
    {
      int m = c();
      boolean bool = true;
      if ((paramInt != m - 1) || (!g.d(paramInt))) {
        bool = false;
      }
      return bool;
    }
    
    public boolean r(int paramInt)
    {
      return g.a(paramInt).i;
    }
    
    public b s(Object paramObject1, Object paramObject2, int paramInt, long paramLong1, long paramLong2)
    {
      return t(paramObject1, paramObject2, paramInt, paramLong1, paramLong2, a.g, false);
    }
    
    public b t(Object paramObject1, Object paramObject2, int paramInt, long paramLong1, long paramLong2, a parama, boolean paramBoolean)
    {
      a = paramObject1;
      b = paramObject2;
      c = paramInt;
      d = paramLong1;
      e = paramLong2;
      g = parama;
      f = paramBoolean;
      return this;
    }
  }
  
  public static final class c
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
}

/* Location:
 * Qualified Name:     d0.I
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */