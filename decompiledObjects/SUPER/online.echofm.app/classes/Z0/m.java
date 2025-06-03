package Z0;

import F0.E;
import F0.L;
import F0.M;
import F0.M.a;
import F0.M.b;
import F0.N;
import F0.Q;
import F0.T;
import F0.U;
import F0.c;
import F0.t;
import c1.t.a;
import d0.A;
import d0.q;
import d0.q.b;
import d0.x.b;
import g0.z;
import h0.d;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public final class m
  implements F0.r, M
{
  public static final F0.x B = new l();
  public U0.a A;
  public final t.a a;
  public final int b;
  public final z c;
  public final z d;
  public final z e;
  public final z f;
  public final ArrayDeque g;
  public final p h;
  public final List i;
  public X2.v j;
  public int k;
  public int l;
  public long m;
  public int n;
  public z o;
  public int p;
  public int q;
  public int r;
  public int s;
  public boolean t;
  public t u;
  public a[] v;
  public long[][] w;
  public int x;
  public long y;
  public int z;
  
  public m(t.a parama, int paramInt)
  {
    a = parama;
    b = paramInt;
    j = X2.v.Y();
    if ((paramInt & 0x4) != 0) {
      paramInt = 3;
    } else {
      paramInt = 0;
    }
    k = paramInt;
    h = new p();
    i = new ArrayList();
    f = new z(16);
    g = new ArrayDeque();
    c = new z(d.a);
    d = new z(4);
    e = new z();
    p = -1;
    u = t.a;
    v = new a[0];
  }
  
  public static int B(z paramz)
  {
    paramz.T(8);
    int i1 = o(paramz.p());
    if (i1 != 0) {
      return i1;
    }
    paramz.U(4);
    while (paramz.a() > 0)
    {
      i1 = o(paramz.p());
      if (i1 != 0) {
        return i1;
      }
    }
    return 0;
  }
  
  public static boolean I(int paramInt)
  {
    boolean bool;
    if ((paramInt != 1836019574) && (paramInt != 1953653099) && (paramInt != 1835297121) && (paramInt != 1835626086) && (paramInt != 1937007212) && (paramInt != 1701082227) && (paramInt != 1835365473)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static boolean J(int paramInt)
  {
    boolean bool;
    if ((paramInt != 1835296868) && (paramInt != 1836476516) && (paramInt != 1751411826) && (paramInt != 1937011556) && (paramInt != 1937011827) && (paramInt != 1937011571) && (paramInt != 1668576371) && (paramInt != 1701606260) && (paramInt != 1937011555) && (paramInt != 1937011578) && (paramInt != 1937013298) && (paramInt != 1937007471) && (paramInt != 1668232756) && (paramInt != 1953196132) && (paramInt != 1718909296) && (paramInt != 1969517665) && (paramInt != 1801812339) && (paramInt != 1768715124)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static int o(int paramInt)
  {
    if (paramInt != 1751476579)
    {
      if (paramInt != 1903435808) {
        return 0;
      }
      return 1;
    }
    return 2;
  }
  
  public static long[][] p(a[] paramArrayOfa)
  {
    long[][] arrayOfLong = new long[paramArrayOfa.length][];
    int[] arrayOfInt = new int[paramArrayOfa.length];
    long[] arrayOfLong1 = new long[paramArrayOfa.length];
    boolean[] arrayOfBoolean = new boolean[paramArrayOfa.length];
    for (int i1 = 0; i1 < paramArrayOfa.length; i1++)
    {
      arrayOfLong[i1] = new long[b.b];
      arrayOfLong1[i1] = b.f[0];
    }
    long l1 = 0L;
    int i2 = 0;
    while (i2 < paramArrayOfa.length)
    {
      long l2 = Long.MAX_VALUE;
      int i3 = -1;
      i1 = 0;
      while (i1 < paramArrayOfa.length)
      {
        long l3 = l2;
        int i4 = i3;
        if (arrayOfBoolean[i1] == 0)
        {
          long l4 = arrayOfLong1[i1];
          l3 = l2;
          i4 = i3;
          if (l4 <= l2)
          {
            i4 = i1;
            l3 = l4;
          }
        }
        i1++;
        l2 = l3;
        i3 = i4;
      }
      i1 = arrayOfInt[i3];
      long[] arrayOfLong2 = arrayOfLong[i3];
      arrayOfLong2[i1] = l1;
      v localv = b;
      l1 += d[i1];
      i1++;
      arrayOfInt[i3] = i1;
      if (i1 < arrayOfLong2.length)
      {
        arrayOfLong1[i3] = f[i1];
      }
      else
      {
        arrayOfBoolean[i3] = true;
        i2++;
      }
    }
    return arrayOfLong;
  }
  
  public static int t(v paramv, long paramLong)
  {
    int i1 = paramv.a(paramLong);
    int i2 = i1;
    if (i1 == -1) {
      i2 = paramv.b(paramLong);
    }
    return i2;
  }
  
  public static long x(v paramv, long paramLong1, long paramLong2)
  {
    int i1 = t(paramv, paramLong1);
    if (i1 == -1) {
      return paramLong2;
    }
    return Math.min(c[i1], paramLong2);
  }
  
  public final void A()
  {
    if ((z == 2) && ((b & 0x2) != 0))
    {
      T localT = u.a(0, 4);
      d0.x localx;
      if (A == null) {
        localx = null;
      } else {
        localx = new d0.x(new x.b[] { A });
      }
      localT.d(new q.b().h0(localx).K());
      u.j();
      u.e(new M.b(-9223372036854775807L));
    }
  }
  
  public final void C(a.a parama)
  {
    ArrayList localArrayList = new ArrayList();
    int i1 = z;
    int i2 = 1;
    boolean bool1;
    if (i1 == 1) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    Object localObject1 = new E();
    Object localObject2 = parama.g(1969517665);
    if (localObject2 != null)
    {
      localObject2 = b.C((a.b)localObject2);
      ((E)localObject1).c((d0.x)localObject2);
    }
    else
    {
      localObject2 = null;
    }
    Object localObject3 = parama.f(1835365473);
    if (localObject3 != null) {
      localObject3 = b.p((a.a)localObject3);
    } else {
      localObject3 = null;
    }
    d0.x localx = new d0.x(new x.b[] { b.r(eg1836476516b) });
    boolean bool2;
    if ((b & 0x1) != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Object localObject4 = b.B(parama, (E)localObject1, -9223372036854775807L, null, bool2, bool1, new k());
    long l1 = -9223372036854775807L;
    int i3 = 0;
    int i4 = i3;
    i1 = -1;
    parama = (a.a)localObject1;
    localObject1 = localObject4;
    while (i3 < ((List)localObject1).size())
    {
      localObject4 = (v)((List)localObject1).get(i3);
      if (b != 0)
      {
        s locals = a;
        long l2 = e;
        if (l2 == -9223372036854775807L) {
          l2 = h;
        }
        l1 = Math.max(l1, l2);
        a locala = new a(locals, (v)localObject4, u.a(i4, b));
        if ("audio/true-hd".equals(f.n)) {
          i2 = e * 16;
        } else {
          i2 = e + 30;
        }
        q.b localb = f.a();
        localb.f0(i2);
        if (b == 2)
        {
          if ((b & 0x8) != 0)
          {
            i5 = f.f;
            if (i1 == -1) {
              i2 = 1;
            } else {
              i2 = 2;
            }
            localb.m0(i5 | i2);
          }
          if (l2 > 0L)
          {
            i2 = b;
            if (i2 > 0) {
              localb.X(i2 / ((float)l2 / 1000000.0F));
            }
          }
        }
        j.k(b, parama, localb);
        i2 = b;
        if (i.isEmpty()) {}
        for (localObject4 = null;; localObject4 = new d0.x(i)) {
          break;
        }
        j.l(i2, (d0.x)localObject3, localb, new d0.x[] { localObject4, localObject2, localx });
        c.d(localb.K());
        if (b == 2)
        {
          i2 = i1;
          if (i1 == -1) {
            i2 = localArrayList.size();
          }
        }
        else
        {
          i2 = i1;
        }
        localArrayList.add(locala);
        i4++;
        int i5 = 1;
        i1 = i2;
        i2 = i5;
      }
      i3 += i2;
    }
    x = i1;
    y = l1;
    parama = (a[])localArrayList.toArray(new a[0]);
    v = parama;
    w = p(parama);
    u.j();
    u.e(this);
  }
  
  public final void D(long paramLong)
  {
    if (l == 1836086884)
    {
      int i1 = n;
      A = new U0.a(0L, paramLong, -9223372036854775807L, paramLong + i1, m - i1);
    }
  }
  
  public final boolean E(F0.s params)
  {
    if (n == 0)
    {
      if (!params.d(f.e(), 0, 8, true))
      {
        A();
        return false;
      }
      n = 8;
      f.T(0);
      m = f.I();
      l = f.p();
    }
    long l1 = m;
    if (l1 == 1L)
    {
      params.readFully(f.e(), 8, 8);
      n += 8;
    }
    long l2;
    for (l1 = f.L();; l1 = l1 - params.p() + n)
    {
      m = l1;
      break;
      if (l1 != 0L) {
        break;
      }
      l2 = params.a();
      l1 = l2;
      if (l2 == -1L)
      {
        a.a locala = (a.a)g.peek();
        l1 = l2;
        if (locala != null) {
          l1 = b;
        }
      }
      if (l1 == -1L) {
        break;
      }
    }
    if (m >= n)
    {
      if (I(l))
      {
        l2 = params.p();
        l1 = m;
        int i1 = n;
        l2 = l2 + l1 - i1;
        if ((l1 != i1) && (l == 1835365473)) {
          y(params);
        }
        g.push(new a.a(l, l2));
        if (m == n) {
          z(l2);
        } else {
          q();
        }
      }
      else
      {
        if (J(l))
        {
          boolean bool;
          if (n == 8) {
            bool = true;
          } else {
            bool = false;
          }
          g0.a.f(bool);
          if (m <= 2147483647L) {
            bool = true;
          } else {
            bool = false;
          }
          g0.a.f(bool);
          params = new z((int)m);
          System.arraycopy(f.e(), 0, params.e(), 0, 8);
        }
        for (;;)
        {
          o = params;
          k = 1;
          break;
          D(params.p() - n);
          params = null;
        }
      }
      return true;
    }
    throw A.d("Atom size less than header length (unsupported).");
  }
  
  public final boolean F(F0.s params, L paramL)
  {
    long l1 = m - n;
    long l2 = params.p();
    z localz = o;
    boolean bool = true;
    if (localz != null)
    {
      params.readFully(localz.e(), n, (int)l1);
      if (l == 1718909296)
      {
        t = true;
        z = B(localz);
      }
      else if (!g.isEmpty())
      {
        ((a.a)g.peek()).e(new a.b(l, localz));
      }
    }
    else
    {
      if ((!t) && (l == 1835295092)) {
        z = 1;
      }
      if (l1 >= 262144L) {
        break label159;
      }
      params.i((int)l1);
    }
    int i1 = 0;
    break label174;
    label159:
    a = (params.p() + l1);
    i1 = 1;
    label174:
    z(l2 + l1);
    if ((i1 == 0) || (k == 2)) {
      bool = false;
    }
    return bool;
  }
  
  public final int G(F0.s params, L paramL)
  {
    long l1 = params.p();
    int i1;
    if (p == -1)
    {
      i1 = u(l1);
      p = i1;
      if (i1 == -1) {
        return -1;
      }
    }
    a locala = v[p];
    T localT = c;
    int i2 = e;
    Object localObject = b;
    long l2 = c[i2];
    int i3 = d[i2];
    localObject = d;
    l1 = l2 - l1 + q;
    if ((l1 >= 0L) && (l1 < 262144L))
    {
      l2 = l1;
      i1 = i3;
      if (a.g == 1)
      {
        l2 = l1 + 8L;
        i1 = i3 - 8;
      }
      params.i((int)l2);
      paramL = a;
      int i5;
      if (j != 0)
      {
        paramL = d.e();
        paramL[0] = ((byte)0);
        paramL[1] = ((byte)0);
        paramL[2] = ((byte)0);
        i3 = a.j;
        int i4 = 4 - i3;
        for (;;)
        {
          i5 = i1;
          if (r >= i1) {
            break;
          }
          i5 = s;
          if (i5 == 0)
          {
            params.readFully(paramL, i4, i3);
            q += i3;
            d.T(0);
            i5 = d.p();
            if (i5 >= 0)
            {
              s = i5;
              c.T(0);
              localT.e(c, 4);
              r += 4;
              i1 += i4;
            }
            else
            {
              throw A.a("Invalid NAL length", null);
            }
          }
          else
          {
            i5 = localT.f(params, i5, false);
            q += i5;
            r += i5;
            s -= i5;
          }
        }
      }
      else
      {
        if ("audio/ac4".equals(f.n))
        {
          if (r == 0)
          {
            c.a(i1, e);
            localT.e(e, 7);
            r += 7;
          }
          i3 = i1 + 7;
        }
        else
        {
          i3 = i1;
          if (localObject != null)
          {
            ((U)localObject).d(params);
            i3 = i1;
          }
        }
        for (;;)
        {
          i1 = r;
          i5 = i3;
          if (i1 >= i3) {
            break;
          }
          i1 = localT.f(params, i3 - i1, false);
          q += i1;
          r += i1;
          s -= i1;
        }
      }
      params = b;
      l2 = f[i2];
      i1 = g[i2];
      if (localObject != null)
      {
        ((U)localObject).c(localT, l2, i1, i5, 0, null);
        if (i2 + 1 == b.b) {
          ((U)localObject).a(localT, null);
        }
      }
      else
      {
        localT.b(l2, i1, i5, 0, null);
      }
      e += 1;
      p = -1;
      q = 0;
      r = 0;
      s = 0;
      return 0;
    }
    a = l2;
    return 1;
  }
  
  public final int H(F0.s params, L paramL)
  {
    int i1 = h.c(params, paramL, i);
    if ((i1 == 1) && (a == 0L)) {
      q();
    }
    return i1;
  }
  
  public final void K(a parama, long paramLong)
  {
    v localv = b;
    int i1 = localv.a(paramLong);
    int i2 = i1;
    if (i1 == -1) {
      i2 = localv.b(paramLong);
    }
    e = i2;
  }
  
  public void a(long paramLong1, long paramLong2)
  {
    g.clear();
    int i1 = 0;
    n = 0;
    p = -1;
    q = 0;
    r = 0;
    s = 0;
    if (paramLong1 == 0L)
    {
      if (k != 3)
      {
        q();
      }
      else
      {
        h.g();
        i.clear();
      }
    }
    else
    {
      a[] arrayOfa = v;
      int i2 = arrayOfa.length;
      while (i1 < i2)
      {
        Object localObject = arrayOfa[i1];
        K((a)localObject, paramLong2);
        localObject = d;
        if (localObject != null) {
          ((U)localObject).b();
        }
        i1++;
      }
    }
  }
  
  public void b(t paramt)
  {
    Object localObject = paramt;
    if ((b & 0x10) == 0) {
      localObject = new c1.v(paramt, a);
    }
    u = ((t)localObject);
  }
  
  public boolean e(F0.s params)
  {
    int i1 = b;
    boolean bool1 = false;
    if ((i1 & 0x2) != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Q localQ = r.d(params, bool2);
    if (localQ != null) {
      params = X2.v.Z(localQ);
    } else {
      params = X2.v.Y();
    }
    j = params;
    boolean bool2 = bool1;
    if (localQ == null) {
      bool2 = true;
    }
    return bool2;
  }
  
  public boolean h()
  {
    return true;
  }
  
  public int i(F0.s params, L paramL)
  {
    do
    {
      do
      {
        int i1 = k;
        if (i1 == 0) {
          break;
        }
        if (i1 != 1)
        {
          if (i1 != 2)
          {
            if (i1 == 3) {
              return H(params, paramL);
            }
            throw new IllegalStateException();
          }
          return G(params, paramL);
        }
      } while (!F(params, paramL));
      return 1;
    } while (E(params));
    return -1;
  }
  
  public M.a j(long paramLong)
  {
    return r(paramLong, -1);
  }
  
  public long l()
  {
    return y;
  }
  
  public final void q()
  {
    k = 0;
    n = 0;
  }
  
  public M.a r(long paramLong, int paramInt)
  {
    Object localObject = v;
    if (localObject.length == 0) {
      return new M.a(N.c);
    }
    int i1;
    if (paramInt != -1) {
      i1 = paramInt;
    } else {
      i1 = x;
    }
    long l4;
    if (i1 != -1)
    {
      localObject = b;
      int i2 = t((v)localObject, paramLong);
      if (i2 == -1) {
        return new M.a(N.c);
      }
      l1 = f[i2];
      l2 = c[i2];
      l3 = l1;
      l4 = l2;
      if (l1 < paramLong)
      {
        l3 = l1;
        l4 = l2;
        if (i2 < b - 1)
        {
          i1 = ((v)localObject).b(paramLong);
          l3 = l1;
          l4 = l2;
          if (i1 != -1)
          {
            l3 = l1;
            l4 = l2;
            if (i1 != i2)
            {
              l3 = f[i1];
              paramLong = c[i1];
              l4 = l2;
              break label224;
            }
          }
        }
      }
    }
    else
    {
      l4 = Long.MAX_VALUE;
      l3 = paramLong;
    }
    paramLong = -1L;
    long l2 = -9223372036854775807L;
    long l1 = l3;
    long l3 = l2;
    label224:
    long l5 = paramLong;
    l2 = l4;
    if (paramInt == -1)
    {
      paramInt = 0;
      for (;;)
      {
        localObject = v;
        l5 = paramLong;
        l2 = l4;
        if (paramInt >= localObject.length) {
          break;
        }
        l5 = paramLong;
        l2 = l4;
        if (paramInt != x)
        {
          localObject = b;
          l2 = x((v)localObject, l1, l4);
          l4 = paramLong;
          if (l3 != -9223372036854775807L) {
            l4 = x((v)localObject, l3, paramLong);
          }
          l5 = l4;
        }
        paramInt++;
        paramLong = l5;
        l4 = l2;
      }
    }
    localObject = new N(l1, l2);
    if (l3 == -9223372036854775807L) {
      return new M.a((N)localObject);
    }
    return new M.a((N)localObject, new N(l3, l5));
  }
  
  public void release() {}
  
  public X2.v s()
  {
    return j;
  }
  
  public final int u(long paramLong)
  {
    int i1 = -1;
    int i2 = -1;
    int i3 = 0;
    long l1 = Long.MAX_VALUE;
    int i4 = 1;
    long l2 = Long.MAX_VALUE;
    int i5 = 1;
    long l3 = Long.MAX_VALUE;
    for (;;)
    {
      Object localObject = v;
      if (i3 >= localObject.length) {
        break;
      }
      localObject = localObject[i3];
      int i6 = e;
      localObject = b;
      long l4;
      if (i6 == b)
      {
        l4 = l1;
      }
      else
      {
        long l5 = c[i6];
        long l6 = ((long[][])g0.M.i(w))[i3][i6];
        l4 = l5 - paramLong;
        if ((l4 >= 0L) && (l4 < 262144L)) {
          i6 = 0;
        } else {
          i6 = 1;
        }
        int i7;
        long l7;
        int i8;
        if ((i6 != 0) || (i5 == 0))
        {
          i7 = i2;
          l7 = l2;
          i8 = i5;
          l5 = l3;
          if (i6 == i5)
          {
            i7 = i2;
            l7 = l2;
            i8 = i5;
            l5 = l3;
            if (l4 >= l3) {}
          }
        }
        else
        {
          i8 = i6;
          l5 = l4;
          i7 = i3;
          l7 = l6;
        }
        i2 = i7;
        l4 = l1;
        l2 = l7;
        i5 = i8;
        l3 = l5;
        if (l6 < l1)
        {
          i1 = i3;
          l3 = l5;
          i5 = i8;
          l2 = l7;
          i4 = i6;
          l4 = l6;
          i2 = i7;
        }
      }
      i3++;
      l1 = l4;
    }
    if ((l1 == Long.MAX_VALUE) || (i4 == 0) || (l2 < l1 + 10485760L)) {
      i1 = i2;
    }
    return i1;
  }
  
  public final void y(F0.s params)
  {
    e.P(8);
    params.n(e.e(), 0, 8);
    b.f(e);
    params.i(e.f());
    params.h();
  }
  
  public final void z(long paramLong)
  {
    while ((!g.isEmpty()) && (g.peek()).b == paramLong))
    {
      a.a locala = (a.a)g.pop();
      if (a == 1836019574)
      {
        C(locala);
        g.clear();
        k = 2;
      }
      else if (!g.isEmpty())
      {
        ((a.a)g.peek()).d(locala);
      }
    }
    if (k != 2) {
      q();
    }
  }
  
  public static final class a
  {
    public final s a;
    public final v b;
    public final T c;
    public final U d;
    public int e;
    
    public a(s params, v paramv, T paramT)
    {
      a = params;
      b = paramv;
      c = paramT;
      if ("audio/true-hd".equals(f.n)) {
        params = new U();
      } else {
        params = null;
      }
      d = params;
    }
  }
}

/* Location:
 * Qualified Name:     Z0.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */