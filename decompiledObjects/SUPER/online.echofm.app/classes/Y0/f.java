package Y0;

import F0.E;
import F0.G;
import F0.I;
import F0.I.a;
import F0.L;
import F0.T;
import F0.r;
import F0.s;
import F0.t;
import T0.h.a;
import T0.l;
import d0.A;
import d0.q.b;
import d0.x.b;
import g0.o;
import g0.z;
import java.io.EOFException;
import java.math.RoundingMode;
import java.util.List;

public final class f
  implements r
{
  public static final F0.x u = new d();
  public static final h.a v = new e();
  public final int a;
  public final long b;
  public final z c;
  public final I.a d;
  public final E e;
  public final G f;
  public final T g;
  public t h;
  public T i;
  public T j;
  public int k;
  public d0.x l;
  public long m;
  public long n;
  public long o;
  public int p;
  public g q;
  public boolean r;
  public boolean s;
  public long t;
  
  public f()
  {
    this(0);
  }
  
  public f(int paramInt)
  {
    this(paramInt, -9223372036854775807L);
  }
  
  public f(int paramInt, long paramLong)
  {
    int i1 = paramInt;
    if ((paramInt & 0x2) != 0) {
      i1 = paramInt | 0x1;
    }
    a = i1;
    b = paramLong;
    c = new z(10);
    d = new I.a();
    e = new E();
    m = -9223372036854775807L;
    f = new G();
    F0.n localn = new F0.n();
    g = localn;
    j = localn;
  }
  
  private void h()
  {
    g0.a.h(i);
    g0.M.i(h);
  }
  
  public static long o(d0.x paramx)
  {
    if (paramx != null)
    {
      int i1 = paramx.e();
      for (int i2 = 0; i2 < i1; i2++)
      {
        Object localObject = paramx.d(i2);
        if ((localObject instanceof T0.n))
        {
          localObject = (T0.n)localObject;
          if (o.equals("TLEN")) {
            return g0.M.J0(Long.parseLong((String)r.get(0)));
          }
        }
      }
    }
    return -9223372036854775807L;
  }
  
  public static int p(z paramz, int paramInt)
  {
    if (paramz.g() >= paramInt + 4)
    {
      paramz.T(paramInt);
      paramInt = paramz.p();
      if ((paramInt == 1483304551) || (paramInt == 1231971951)) {
        return paramInt;
      }
    }
    if (paramz.g() >= 40)
    {
      paramz.T(36);
      if (paramz.p() == 1447187017) {
        return 1447187017;
      }
    }
    return 0;
  }
  
  public static boolean q(int paramInt, long paramLong)
  {
    boolean bool;
    if ((paramInt & 0xFFFE0C00) == (paramLong & 0xFFFFFFFFFFFE0C00)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static c t(d0.x paramx, long paramLong)
  {
    if (paramx != null)
    {
      int i1 = paramx.e();
      for (int i2 = 0; i2 < i1; i2++)
      {
        x.b localb = paramx.d(i2);
        if ((localb instanceof l)) {
          return c.a(paramLong, (l)localb, o(paramx));
        }
      }
    }
    return null;
  }
  
  private int x(s params)
  {
    if (p == 0)
    {
      params.h();
      if (v(params)) {
        return -1;
      }
      c.T(0);
      i1 = c.p();
      if ((q(i1, k)) && (I.j(i1) != -1))
      {
        d.a(i1);
        if (m == -9223372036854775807L)
        {
          m = q.c(params.p());
          if (b != -9223372036854775807L)
          {
            long l1 = q.c(0L);
            m += b - l1;
          }
        }
        I.a locala = d;
        p = c;
        Object localObject = q;
        if ((localObject instanceof b))
        {
          localObject = (b)localObject;
          ((b)localObject).b(k(n + g), params.p() + d.c);
          if ((s) && (((b)localObject).a(t)))
          {
            s = false;
            j = i;
          }
        }
      }
      else
      {
        params.i(1);
        k = 0;
        return 0;
      }
    }
    int i1 = j.f(params, p, true);
    if (i1 == -1) {
      return -1;
    }
    i1 = p - i1;
    p = i1;
    if (i1 > 0) {
      return 0;
    }
    j.b(k(n), 1, d.c, 0, null);
    n += d.g;
    p = 0;
    return 0;
  }
  
  public void a(long paramLong1, long paramLong2)
  {
    k = 0;
    m = -9223372036854775807L;
    n = 0L;
    p = 0;
    t = paramLong2;
    g localg = q;
    if (((localg instanceof b)) && (!((b)localg).a(paramLong2)))
    {
      s = true;
      j = g;
    }
  }
  
  public void b(t paramt)
  {
    h = paramt;
    paramt = paramt.a(0, 1);
    i = paramt;
    j = paramt;
    h.j();
  }
  
  public boolean e(s params)
  {
    return y(params, true);
  }
  
  public int i(s params, L paramL)
  {
    h();
    int i1 = w(params);
    if ((i1 == -1) && ((q instanceof b)))
    {
      long l1 = k(n);
      if (q.l() != l1)
      {
        ((b)q).d(l1);
        h.e(q);
      }
    }
    return i1;
  }
  
  public final g j(s params)
  {
    Object localObject1 = u(params);
    Object localObject2 = t(l, params.p());
    if (r) {
      return new g.a();
    }
    if ((a & 0x4) != 0)
    {
      long l1;
      long l2;
      if (localObject2 != null)
      {
        l1 = ((F0.M)localObject2).l();
        l2 = ((g)localObject2).f();
      }
      for (;;)
      {
        break;
        if (localObject1 != null)
        {
          l1 = ((F0.M)localObject1).l();
          l2 = ((g)localObject1).f();
        }
        else
        {
          l1 = o(l);
          l2 = -1L;
        }
      }
      localObject1 = new b(l1, params.p(), l2);
    }
    else if (localObject2 != null)
    {
      localObject1 = localObject2;
    }
    else if (localObject1 == null)
    {
      localObject1 = null;
    }
    boolean bool = true;
    if (localObject1 != null)
    {
      localObject2 = localObject1;
      if (!((F0.M)localObject1).h())
      {
        localObject2 = localObject1;
        if ((a & 0x1) == 0) {}
      }
    }
    else
    {
      if ((a & 0x2) == 0) {
        bool = false;
      }
      localObject2 = n(params, bool);
    }
    return (g)localObject2;
  }
  
  public final long k(long paramLong)
  {
    return m + paramLong * 1000000L / d.d;
  }
  
  public void l()
  {
    r = true;
  }
  
  public final g m(long paramLong1, i parami, long paramLong2)
  {
    long l1 = parami.a();
    Object localObject = null;
    if (l1 == -9223372036854775807L) {
      return null;
    }
    long l2 = c;
    if (l2 != -1L)
    {
      paramLong2 = l2 - a.c;
      l2 = paramLong1 + l2;
    }
    for (;;)
    {
      break;
      if (paramLong2 == -1L) {
        break label156;
      }
      long l3 = paramLong2 - paramLong1 - a.c;
      l2 = paramLong2;
      paramLong2 = l3;
    }
    localObject = RoundingMode.HALF_UP;
    int i1 = a3.f.d(g0.M.Y0(paramLong2, 8000000L, l1, (RoundingMode)localObject));
    int i2 = a3.f.d(Z2.e.b(paramLong2, b, (RoundingMode)localObject));
    localObject = new a(l2, paramLong1 + a.c, i1, i2, false);
    label156:
    return (g)localObject;
  }
  
  public final g n(s params, boolean paramBoolean)
  {
    params.n(c.e(), 0, 4);
    c.T(0);
    d.a(c.p());
    return new a(params.a(), params.p(), d, paramBoolean);
  }
  
  public void release() {}
  
  public final g u(s params)
  {
    Object localObject1 = new z(d.c);
    params.n(((z)localObject1).e(), 0, d.c);
    Object localObject2 = d;
    int i1 = a;
    int i2 = 21;
    int i3 = e;
    if ((i1 & 0x1) != 0)
    {
      if (i3 != 1) {
        i2 = 36;
      }
    }
    else if (i3 == 1) {
      i2 = 13;
    }
    i1 = p((z)localObject1, i2);
    if (i1 != 1231971951) {
      if (i1 != 1447187017)
      {
        if (i1 != 1483304551)
        {
          params.h();
          return null;
        }
      }
      else
      {
        localObject2 = h.a(params.a(), params.p(), d, (z)localObject1);
        params.i(d.c);
        return (s)localObject2;
      }
    }
    localObject2 = i.b(d, (z)localObject1);
    if (!e.a())
    {
      i3 = d;
      if (i3 != -1)
      {
        i2 = e;
        if (i2 != -1)
        {
          localObject1 = e;
          a = i3;
          b = i2;
        }
      }
    }
    long l1 = params.p();
    if ((params.a() != -1L) && (c != -1L) && (params.a() != c + l1))
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Data size mismatch between stream (");
      ((StringBuilder)localObject1).append(params.a());
      ((StringBuilder)localObject1).append(") and Xing frame (");
      ((StringBuilder)localObject1).append(c + l1);
      ((StringBuilder)localObject1).append("), using Xing value.");
      o.f("Mp3Extractor", ((StringBuilder)localObject1).toString());
    }
    params.i(d.c);
    if (i1 == 1483304551) {
      params = j.a((i)localObject2, l1);
    } else {
      params = m(l1, (i)localObject2, params.a());
    }
    return params;
  }
  
  public final boolean v(s params)
  {
    g localg = q;
    if (localg != null)
    {
      long l1 = localg.f();
      if ((l1 != -1L) && (params.m() > l1 - 4L)) {
        return true;
      }
    }
    try
    {
      boolean bool = params.l(c.e(), 0, 4, true);
      return bool ^ true;
    }
    catch (EOFException params) {}
    return true;
  }
  
  public final int w(s params)
  {
    if (k == 0) {
      try
      {
        y(params, false);
      }
      catch (EOFException params)
      {
        return -1;
      }
    }
    if (q == null)
    {
      Object localObject = j(params);
      q = ((g)localObject);
      h.e((F0.M)localObject);
      q.b localb = new q.b().o0(d.b).f0(4096).N(d.e).p0(d.d).V(e.a).W(e.b);
      if ((a & 0x8) != 0) {
        localObject = null;
      } else {
        localObject = l;
      }
      localObject = localb.h0((d0.x)localObject);
      if (q.k() != -2147483647) {
        ((q.b)localObject).M(q.k());
      }
      j.d(((q.b)localObject).K());
      o = params.p();
    }
    else if (o != 0L)
    {
      long l1 = params.p();
      long l2 = o;
      if (l1 < l2) {
        params.i((int)(l2 - l1));
      }
    }
    return x(params);
  }
  
  public final boolean y(s params, boolean paramBoolean)
  {
    int i1;
    if (paramBoolean) {
      i1 = 32768;
    } else {
      i1 = 131072;
    }
    params.h();
    int i2;
    if (params.p() == 0L)
    {
      if ((a & 0x8) == 0) {
        localObject = null;
      } else {
        localObject = v;
      }
      Object localObject = f.a(params, (h.a)localObject);
      l = ((d0.x)localObject);
      if (localObject != null) {
        e.c((d0.x)localObject);
      }
      i2 = (int)params.m();
      if (!paramBoolean) {
        params.i(i2);
      }
    }
    int i3;
    int i4;
    int i5;
    for (;;)
    {
      i3 = 0;
      i4 = 0;
      i5 = i4;
      break;
      i2 = 0;
    }
    for (;;)
    {
      int i7;
      int i8;
      if (v(params))
      {
        if (i4 <= 0) {
          throw new EOFException();
        }
      }
      else
      {
        c.T(0);
        int i6 = c.p();
        if ((i3 == 0) || (q(i6, i3)))
        {
          i7 = I.j(i6);
          if (i7 != -1) {}
        }
        else
        {
          i3 = i5 + 1;
          if (i5 == i1)
          {
            if (paramBoolean) {
              return false;
            }
            throw A.a("Searched too many bytes.", null);
          }
          if (paramBoolean)
          {
            params.h();
            params.o(i2 + i3);
          }
          else
          {
            params.i(1);
          }
          i4 = 0;
          i5 = i3;
          i3 = i4;
          continue;
        }
        i8 = i4 + 1;
        if (i8 == 1)
        {
          d.a(i6);
          i4 = i6;
          break label338;
        }
        i4 = i3;
        if (i8 != 4) {
          break label338;
        }
      }
      if (paramBoolean) {
        params.i(i2 + i5);
      } else {
        params.h();
      }
      k = i3;
      return true;
      label338:
      params.o(i7 - 4);
      i3 = i4;
      i4 = i8;
    }
  }
}

/* Location:
 * Qualified Name:     Y0.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */