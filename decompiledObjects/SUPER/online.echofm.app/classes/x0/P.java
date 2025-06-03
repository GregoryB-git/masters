package x0;

import B0.b;
import F0.T;
import F0.T.a;
import d0.m;
import d0.q;
import d0.q.b;
import g0.M;
import g0.o;
import k0.v0;
import p0.n;
import p0.n.a;
import p0.v.a;
import p0.x;
import p0.x.b;

public class P
  implements T
{
  public q A;
  public q B;
  public long C;
  public boolean D;
  public boolean E;
  public long F;
  public boolean G;
  public final N a;
  public final b b;
  public final W c;
  public final x d;
  public final v.a e;
  public d f;
  public q g;
  public n h;
  public int i;
  public long[] j;
  public long[] k;
  public int[] l;
  public int[] m;
  public long[] n;
  public T.a[] o;
  public int p;
  public int q;
  public int r;
  public int s;
  public long t;
  public long u;
  public long v;
  public boolean w;
  public boolean x;
  public boolean y;
  public boolean z;
  
  public P(b paramb, x paramx, v.a parama)
  {
    d = paramx;
    e = parama;
    a = new N(paramb);
    b = new b();
    i = 1000;
    j = new long['Ϩ'];
    k = new long['Ϩ'];
    n = new long['Ϩ'];
    m = new int['Ϩ'];
    l = new int['Ϩ'];
    o = new T.a['Ϩ'];
    c = new W(new O());
    t = Long.MIN_VALUE;
    u = Long.MIN_VALUE;
    v = Long.MIN_VALUE;
    y = true;
    x = true;
    D = true;
  }
  
  public static P k(b paramb, x paramx, v.a parama)
  {
    return new P(paramb, (x)g0.a.e(paramx), (v.a)g0.a.e(parama));
  }
  
  public static P l(b paramb)
  {
    return new P(paramb, null, null);
  }
  
  public final long A()
  {
    try
    {
      long l1 = v;
      return l1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final long B()
  {
    try
    {
      long l1 = Math.max(u, C(s));
      return l1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final long C(int paramInt)
  {
    long l1 = Long.MIN_VALUE;
    if (paramInt == 0) {
      return Long.MIN_VALUE;
    }
    int i1 = E(paramInt - 1);
    long l2;
    for (int i2 = 0;; i2++)
    {
      l2 = l1;
      if (i2 >= paramInt) {
        break;
      }
      l1 = Math.max(l1, n[i1]);
      if ((m[i1] & 0x1) != 0)
      {
        l2 = l1;
        break;
      }
      int i3 = i1 - 1;
      i1 = i3;
      if (i3 == -1) {
        i1 = i - 1;
      }
    }
    return l2;
  }
  
  public final int D()
  {
    return q + s;
  }
  
  public final int E(int paramInt)
  {
    paramInt = r + paramInt;
    int i1 = i;
    if (paramInt >= i1) {
      paramInt -= i1;
    }
    return paramInt;
  }
  
  public final int F(long paramLong, boolean paramBoolean)
  {
    label108:
    try
    {
      i1 = E(s);
      if ((I()) && (paramLong >= n[i1])) {
        if ((paramLong > v) && (paramBoolean))
        {
          int i2 = p;
          i1 = s;
          return i2 - i1;
        }
      }
    }
    finally
    {
      break label108;
      int i1 = w(i1, p - s, paramLong, true);
      if (i1 == -1) {
        return 0;
      }
      return i1;
      return 0;
    }
  }
  
  public final q G()
  {
    try
    {
      q localq;
      if (y) {
        localq = null;
      } else {
        localq = B;
      }
      return localq;
    }
    finally {}
  }
  
  public final int H()
  {
    return q + p;
  }
  
  public final boolean I()
  {
    boolean bool;
    if (s != p) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void J()
  {
    z = true;
  }
  
  public final boolean K()
  {
    try
    {
      boolean bool = w;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean L(boolean paramBoolean)
  {
    try
    {
      bool1 = I();
      boolean bool2 = true;
      if (bool1) {
        break label68;
      }
      bool1 = bool2;
      if (paramBoolean) {
        break label64;
      }
      bool1 = bool2;
      if (w) {
        break label64;
      }
      q localq1 = B;
      if (localq1 != null)
      {
        localq3 = g;
        if (localq1 != localq3) {
          bool1 = bool2;
        }
      }
    }
    finally
    {
      break label121;
    }
    boolean bool1 = false;
    label64:
    return bool1;
    label68:
    q localq2 = c.e(D())).a;
    q localq3 = g;
    if (localq2 != localq3) {
      return true;
    }
    paramBoolean = N(E(s));
    return paramBoolean;
    label121:
    throw localq2;
  }
  
  public final boolean N(int paramInt)
  {
    n localn = h;
    boolean bool;
    if ((localn != null) && (localn.getState() != 4) && (((m[paramInt] & 0x40000000) != 0) || (!h.b()))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void O()
  {
    n localn = h;
    if ((localn != null) && (localn.getState() == 1)) {
      throw ((n.a)g0.a.e(h.g()));
    }
  }
  
  public final void P(q paramq, v0 paramv0)
  {
    Object localObject1 = g;
    int i1;
    if (localObject1 == null) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = r;
    }
    g = paramq;
    m localm = r;
    Object localObject2 = d;
    if (localObject2 != null) {
      localObject2 = paramq.b(((x)localObject2).b(paramq));
    } else {
      localObject2 = paramq;
    }
    b = ((q)localObject2);
    a = h;
    if (d == null) {
      return;
    }
    if ((i1 == 0) && (M.c(localObject1, localm))) {
      return;
    }
    localObject1 = h;
    paramq = d.c(e, paramq);
    h = paramq;
    a = paramq;
    if (localObject1 != null) {
      ((n)localObject1).e(e);
    }
  }
  
  public final int Q(v0 paramv0, j0.i parami, boolean paramBoolean1, boolean paramBoolean2, b paramb)
  {
    try
    {
      s = false;
      if (I()) {
        break label96;
      }
      if ((paramBoolean2) || (w)) {
        break label79;
      }
      parami = B;
      if (parami == null) {
        break label74;
      }
      if (!paramBoolean1) {
        if (parami == g) {
          break label74;
        }
      }
    }
    finally
    {
      break label267;
    }
    P((q)g0.a.e(parami), paramv0);
    return -5;
    label74:
    return -3;
    label79:
    parami.w(4);
    t = Long.MIN_VALUE;
    return -4;
    label96:
    q localq = c.e(D())).a;
    if ((!paramBoolean1) && (localq == g))
    {
      int i1 = E(s);
      if (!N(i1))
      {
        s = true;
        return -3;
      }
      parami.w(m[i1]);
      if ((s == p - 1) && ((paramBoolean2) || (w))) {
        parami.l(536870912);
      }
      t = n[i1];
      a = l[i1];
      b = k[i1];
      c = o[i1];
      return -4;
    }
    P(localq, paramv0);
    return -5;
    label267:
    throw paramv0;
  }
  
  public final long R()
  {
    try
    {
      int i1 = E(s);
      if (I()) {
        l1 = j[i1];
      }
    }
    finally
    {
      break label42;
    }
    long l1 = C;
    return l1;
    label42:
    throw ((Throwable)localObject);
  }
  
  public void S()
  {
    r();
    V();
  }
  
  public int T(v0 paramv0, j0.i parami, int paramInt, boolean paramBoolean)
  {
    int i1 = 0;
    boolean bool;
    if ((paramInt & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    int i2 = Q(paramv0, parami, bool, paramBoolean, b);
    if ((i2 == -4) && (!parami.p()))
    {
      if ((paramInt & 0x1) != 0) {
        i1 = 1;
      }
      if ((paramInt & 0x4) == 0)
      {
        N localN = a;
        paramv0 = b;
        if (i1 != 0) {
          localN.f(parami, paramv0);
        } else {
          localN.m(parami, paramv0);
        }
      }
      if (i1 == 0) {
        s += 1;
      }
    }
    return i2;
  }
  
  public void U()
  {
    X(true);
    V();
  }
  
  public final void V()
  {
    n localn = h;
    if (localn != null)
    {
      localn.e(e);
      h = null;
      g = null;
    }
  }
  
  public final void W()
  {
    X(false);
  }
  
  public void X(boolean paramBoolean)
  {
    a.n();
    p = 0;
    q = 0;
    r = 0;
    s = 0;
    x = true;
    t = Long.MIN_VALUE;
    u = Long.MIN_VALUE;
    v = Long.MIN_VALUE;
    w = false;
    c.b();
    if (paramBoolean)
    {
      A = null;
      B = null;
      y = true;
      D = true;
    }
  }
  
  public final void Y()
  {
    try
    {
      s = 0;
      a.o();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean Z(int paramInt)
  {
    label55:
    try
    {
      Y();
      int i1 = q;
      if ((paramInt >= i1) && (paramInt <= p + i1))
      {
        t = Long.MIN_VALUE;
        s = (paramInt - i1);
        return true;
      }
    }
    finally
    {
      break label55;
      return false;
    }
  }
  
  public final void a(g0.z paramz, int paramInt1, int paramInt2)
  {
    a.q(paramz, paramInt1);
  }
  
  public final boolean a0(long paramLong, boolean paramBoolean)
  {
    try
    {
      Y();
      i1 = E(s);
      if ((!I()) || (paramLong < n[i1]) || ((paramLong > v) && (!paramBoolean))) {
        break label134;
      }
      if (D) {
        i1 = v(i1, p - s, paramLong, paramBoolean);
      }
    }
    finally
    {
      break label138;
    }
    int i1 = w(i1, p - s, paramLong, true);
    if (i1 == -1) {
      return false;
    }
    t = paramLong;
    s += i1;
    return true;
    label134:
    return false;
    label138:
    throw ((Throwable)localObject);
  }
  
  public void b(long paramLong, int paramInt1, int paramInt2, int paramInt3, T.a parama)
  {
    if (z) {
      d((q)g0.a.h(A));
    }
    int i1 = paramInt1 & 0x1;
    int i2;
    if (i1 != 0) {
      i2 = 1;
    } else {
      i2 = 0;
    }
    if (x)
    {
      if (i2 == 0) {
        return;
      }
      x = false;
    }
    paramLong = F + paramLong;
    if (D)
    {
      if (paramLong < t) {
        return;
      }
      if (i1 == 0)
      {
        if (!E)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Overriding unexpected non-sync sample for format: ");
          localStringBuilder.append(B);
          o.h("SampleQueue", localStringBuilder.toString());
          E = true;
        }
        paramInt1 |= 0x1;
      }
    }
    if (G) {
      if ((i2 != 0) && (h(paramLong))) {
        G = false;
      } else {
        return;
      }
    }
    i(paramLong, paramInt1, a.e() - paramInt2 - paramInt3, paramInt2, parama);
  }
  
  public final void b0(long paramLong)
  {
    if (F != paramLong)
    {
      F = paramLong;
      J();
    }
  }
  
  public final int c(d0.i parami, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    return a.p(parami, paramInt1, paramBoolean);
  }
  
  public final void c0(long paramLong)
  {
    t = paramLong;
  }
  
  public final void d(q paramq)
  {
    q localq = x(paramq);
    z = false;
    A = paramq;
    boolean bool = d0(localq);
    paramq = f;
    if ((paramq != null) && (bool)) {
      paramq.m(localq);
    }
  }
  
  public final boolean d0(q paramq)
  {
    try
    {
      y = false;
      bool = M.c(paramq, B);
      if (bool) {
        return false;
      }
      q localq = paramq;
      if (!c.g())
      {
        localq = paramq;
        if (c.f()).a.equals(paramq)) {
          localq = c.f()).a;
        }
      }
      B = localq;
    }
    finally
    {
      break label120;
    }
    boolean bool = D;
    paramq = B;
    D = (bool & d0.z.a(n, j));
    E = false;
    return true;
    label120:
    throw paramq;
  }
  
  public final void e0(d paramd)
  {
    f = paramd;
  }
  
  public final void f0(int paramInt)
  {
    if (paramInt >= 0) {
      try
      {
        if (s + paramInt <= p) {
          bool = true;
        }
      }
      finally
      {
        break label47;
      }
    }
    boolean bool = false;
    g0.a.a(bool);
    s += paramInt;
    return;
    label47:
    throw ((Throwable)localObject);
  }
  
  public final void g0(long paramLong)
  {
    C = paramLong;
  }
  
  public final boolean h(long paramLong)
  {
    label78:
    try
    {
      i1 = p;
      boolean bool = false;
      if (i1 == 0)
      {
        l1 = u;
        if (paramLong > l1) {
          bool = true;
        }
        return bool;
      }
    }
    finally
    {
      break label78;
      long l1 = B();
      if (l1 >= paramLong) {
        return false;
      }
      int i1 = j(paramLong);
      t(q + i1);
      return true;
    }
  }
  
  public final void h0()
  {
    G = true;
  }
  
  public final void i(long paramLong1, int paramInt1, long paramLong2, int paramInt2, T.a parama)
  {
    boolean bool;
    try
    {
      i1 = p;
      if (i1 > 0)
      {
        i1 = E(i1 - 1);
        if (k[i1] + l[i1] <= paramLong2) {
          bool = true;
        } else {
          bool = false;
        }
        g0.a.a(bool);
      }
    }
    finally
    {
      break label587;
    }
    if ((0x20000000 & paramInt1) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    w = bool;
    v = Math.max(v, paramLong1);
    int i1 = E(p);
    n[i1] = paramLong1;
    k[i1] = paramLong2;
    l[i1] = paramInt2;
    m[i1] = paramInt1;
    o[i1] = parama;
    j[i1] = C;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if ((c.g()) || (!c.f()).a.equals(B)))
    {
      localObject1 = (q)g0.a.e(B);
      parama = d;
      if (parama != null) {
        parama = parama.d(e, (q)localObject1);
      } else {
        parama = x.b.a;
      }
      localObject2 = c;
      paramInt1 = H();
      localObject3 = new x0/P$c;
      ((c)localObject3).<init>((q)localObject1, parama, null);
      ((W)localObject2).a(paramInt1, localObject3);
    }
    paramInt1 = p + 1;
    p = paramInt1;
    paramInt2 = i;
    if (paramInt1 == paramInt2)
    {
      paramInt1 = paramInt2 + 1000;
      parama = new long[paramInt1];
      long[] arrayOfLong = new long[paramInt1];
      localObject2 = new long[paramInt1];
      localObject1 = new int[paramInt1];
      int[] arrayOfInt = new int[paramInt1];
      localObject3 = new T.a[paramInt1];
      i1 = r;
      paramInt2 -= i1;
      System.arraycopy(k, i1, arrayOfLong, 0, paramInt2);
      System.arraycopy(n, r, localObject2, 0, paramInt2);
      System.arraycopy(m, r, localObject1, 0, paramInt2);
      System.arraycopy(l, r, arrayOfInt, 0, paramInt2);
      System.arraycopy(o, r, localObject3, 0, paramInt2);
      System.arraycopy(j, r, parama, 0, paramInt2);
      i1 = r;
      System.arraycopy(k, 0, arrayOfLong, paramInt2, i1);
      System.arraycopy(n, 0, localObject2, paramInt2, i1);
      System.arraycopy(m, 0, localObject1, paramInt2, i1);
      System.arraycopy(l, 0, arrayOfInt, paramInt2, i1);
      System.arraycopy(o, 0, localObject3, paramInt2, i1);
      System.arraycopy(j, 0, parama, paramInt2, i1);
      k = arrayOfLong;
      n = ((long[])localObject2);
      m = ((int[])localObject1);
      l = arrayOfInt;
      o = ((T.a[])localObject3);
      j = parama;
      r = 0;
      i = paramInt1;
    }
    return;
    label587:
    throw parama;
  }
  
  public final int j(long paramLong)
  {
    int i1 = p;
    int i2 = E(i1 - 1);
    while ((i1 > s) && (n[i2] >= paramLong))
    {
      int i3 = i1 - 1;
      int i4 = i2 - 1;
      i1 = i3;
      i2 = i4;
      if (i4 == -1)
      {
        i2 = i - 1;
        i1 = i3;
      }
    }
    return i1;
  }
  
  public final long m(long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i2;
    try
    {
      int i1 = p;
      if (i1 == 0) {
        break label113;
      }
      long[] arrayOfLong = n;
      i2 = r;
      if (paramLong < arrayOfLong[i2]) {
        break label113;
      }
      i3 = i1;
      if (paramBoolean2)
      {
        int i4 = s;
        i3 = i1;
        if (i4 != i1) {
          i3 = i4 + 1;
        }
      }
    }
    finally
    {
      break label119;
    }
    int i3 = w(i2, i3, paramLong, paramBoolean1);
    if (i3 == -1) {
      return -1L;
    }
    paramLong = p(i3);
    return paramLong;
    label113:
    return -1L;
    label119:
    throw ((Throwable)localObject);
  }
  
  public final long n()
  {
    try
    {
      int i1 = p;
      if (i1 == 0) {
        return -1L;
      }
      long l1 = p(i1);
      return l1;
    }
    finally {}
  }
  
  public long o()
  {
    try
    {
      int i1 = s;
      if (i1 == 0) {
        return -1L;
      }
      long l1 = p(i1);
      return l1;
    }
    finally {}
  }
  
  public final long p(int paramInt)
  {
    u = Math.max(u, C(paramInt));
    p -= paramInt;
    int i1 = q + paramInt;
    q = i1;
    int i2 = r + paramInt;
    r = i2;
    int i3 = i;
    if (i2 >= i3) {
      r = (i2 - i3);
    }
    paramInt = s - paramInt;
    s = paramInt;
    if (paramInt < 0) {
      s = 0;
    }
    c.d(i1);
    if (p == 0)
    {
      i1 = r;
      paramInt = i1;
      if (i1 == 0) {
        paramInt = i;
      }
      paramInt--;
      return k[paramInt] + l[paramInt];
    }
    return k[r];
  }
  
  public final void q(long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    a.b(m(paramLong, paramBoolean1, paramBoolean2));
  }
  
  public final void r()
  {
    a.b(n());
  }
  
  public final void s()
  {
    a.b(o());
  }
  
  public final long t(int paramInt)
  {
    int i1 = H() - paramInt;
    boolean bool1 = false;
    if ((i1 >= 0) && (i1 <= p - s)) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    g0.a.a(bool2);
    int i2 = p - i1;
    p = i2;
    v = Math.max(u, C(i2));
    boolean bool2 = bool1;
    if (i1 == 0)
    {
      bool2 = bool1;
      if (w) {
        bool2 = true;
      }
    }
    w = bool2;
    c.c(paramInt);
    paramInt = p;
    if (paramInt != 0)
    {
      paramInt = E(paramInt - 1);
      return k[paramInt] + l[paramInt];
    }
    return 0L;
  }
  
  public final void u(int paramInt)
  {
    a.c(t(paramInt));
  }
  
  public final int v(int paramInt1, int paramInt2, long paramLong, boolean paramBoolean)
  {
    for (int i1 = 0; i1 < paramInt2; i1++)
    {
      if (n[paramInt1] >= paramLong) {
        return i1;
      }
      int i2 = paramInt1 + 1;
      paramInt1 = i2;
      if (i2 == i) {
        paramInt1 = 0;
      }
    }
    if (!paramBoolean) {
      paramInt2 = -1;
    }
    return paramInt2;
  }
  
  public final int w(int paramInt1, int paramInt2, long paramLong, boolean paramBoolean)
  {
    int i1 = -1;
    int i2 = 0;
    int i3 = paramInt1;
    for (paramInt1 = i2;; paramInt1++)
    {
      i2 = i1;
      if (paramInt1 >= paramInt2) {
        break;
      }
      long l1 = n[i3];
      i2 = i1;
      if (l1 > paramLong) {
        break;
      }
      if ((!paramBoolean) || ((m[i3] & 0x1) != 0))
      {
        if (l1 == paramLong)
        {
          i2 = paramInt1;
          break;
        }
        i1 = paramInt1;
      }
      i2 = i3 + 1;
      i3 = i2;
      if (i2 == i) {
        i3 = 0;
      }
    }
    return i2;
  }
  
  public q x(q paramq)
  {
    q localq = paramq;
    if (F != 0L)
    {
      localq = paramq;
      if (s != Long.MAX_VALUE) {
        localq = paramq.a().s0(s + F).K();
      }
    }
    return localq;
  }
  
  public final int y()
  {
    return q;
  }
  
  public final long z()
  {
    try
    {
      long l1;
      if (p == 0) {
        l1 = Long.MIN_VALUE;
      } else {
        l1 = n[r];
      }
      return l1;
    }
    finally {}
  }
  
  public static final class b
  {
    public int a;
    public long b;
    public T.a c;
  }
  
  public static final class c
  {
    public final q a;
    public final x.b b;
    
    public c(q paramq, x.b paramb)
    {
      a = paramq;
      b = paramb;
    }
  }
  
  public static abstract interface d
  {
    public abstract void m(q paramq);
  }
}

/* Location:
 * Qualified Name:     x0.P
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */