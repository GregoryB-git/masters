package z4;

import a4.e;
import a4.g.a;
import android.net.Uri;
import android.os.Handler;
import b.d;
import c4.j;
import c4.s;
import c4.t;
import c4.t.a;
import c4.v;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import p4.a.b;
import r3.a0;
import t5.d0;
import t5.d0.b;
import t5.d0.c;
import t5.d0.d;
import t5.d0.e;
import t5.d0.g;
import t5.w;
import v3.a1;
import v3.i0.a;
import v3.n1;
import v5.e0;
import v5.p;

public final class y
  implements r, j, t5.d0.a<a>, d0.e, b0.c
{
  public static final Map<String, String> U;
  public static final v3.i0 V;
  public b0[] A;
  public d[] B;
  public boolean C;
  public boolean D;
  public boolean E;
  public e F;
  public t G;
  public long H;
  public boolean I;
  public int J;
  public boolean K;
  public boolean L;
  public int M;
  public boolean N;
  public long O;
  public long P;
  public boolean Q;
  public int R;
  public boolean S;
  public boolean T;
  public final Uri a;
  public final t5.k b;
  public final a4.h c;
  public final t5.c0 d;
  public final w.a e;
  public final g.a f;
  public final b o;
  public final t5.b p;
  public final String q;
  public final long r;
  public final d0 s;
  public final x t;
  public final b5.g u;
  public final u.a v;
  public final d w;
  public final Handler x;
  public r.a y;
  public t4.b z;
  
  static
  {
    Object localObject = new HashMap();
    ((HashMap)localObject).put("Icy-MetaData", "1");
    U = Collections.unmodifiableMap((Map)localObject);
    localObject = new i0.a();
    a = "icy";
    k = "application/x-icy";
    V = ((i0.a)localObject).a();
  }
  
  public y(Uri paramUri, t5.k paramk, a0 parama0, a4.h paramh, g.a parama, t5.c0 paramc0, w.a parama1, b paramb, t5.b paramb1, String paramString, int paramInt)
  {
    a = paramUri;
    b = paramk;
    c = paramh;
    f = parama;
    d = paramc0;
    e = parama1;
    o = paramb;
    p = paramb1;
    q = paramString;
    r = paramInt;
    s = new d0("ProgressiveMediaPeriod");
    t = parama0;
    u = new b5.g(1);
    v = new u.a(this, 9);
    w = new d(this, 10);
    x = e0.l(null);
    B = new d[0];
    A = new b0[0];
    P = -9223372036854775807L;
    H = -9223372036854775807L;
    J = 1;
  }
  
  public final void A(int paramInt)
  {
    b();
    Object localObject = F.b;
    if ((Q) && (localObject[paramInt] != 0) && (!A[paramInt].q(false)))
    {
      P = 0L;
      Q = false;
      L = true;
      O = 0L;
      R = 0;
      localObject = A;
      int i = localObject.length;
      for (paramInt = 0; paramInt < i; paramInt++) {
        localObject[paramInt].v(false);
      }
      localObject = y;
      localObject.getClass();
      ((d0.a)localObject).a(this);
    }
  }
  
  public final b0 B(d paramd)
  {
    int i = A.length;
    for (int j = 0; j < i; j++) {
      if (paramd.equals(B[j])) {
        return A[j];
      }
    }
    t5.b localb = p;
    Object localObject1 = c;
    Object localObject2 = f;
    localObject1.getClass();
    localObject2.getClass();
    localObject1 = new b0(localb, (a4.h)localObject1, (g.a)localObject2);
    f = this;
    localObject2 = B;
    j = i + 1;
    localObject2 = (d[])Arrays.copyOf((Object[])localObject2, j);
    localObject2[i] = paramd;
    B = ((d[])localObject2);
    paramd = (b0[])Arrays.copyOf(A, j);
    paramd[i] = localObject1;
    A = paramd;
    return (b0)localObject1;
  }
  
  public final void C()
  {
    a locala = new a(a, b, t, this, u);
    if (D)
    {
      x6.b.H(x());
      l1 = H;
      if ((l1 != -9223372036854775807L) && (P > l1))
      {
        S = true;
        P = -9223372036854775807L;
        return;
      }
      localObject = G;
      localObject.getClass();
      long l2 = gP).a.b;
      l1 = P;
      g.a = l2;
      j = l1;
      i = true;
      i = 0;
      m = false;
      localObject = A;
      int j = localObject.length;
      while (i < j)
      {
        t = P;
        i++;
      }
      P = -9223372036854775807L;
    }
    R = v();
    Object localObject = s;
    t5.c0 localc0 = d;
    int i = J;
    long l1 = ((d0)localObject).f(locala, this, ((t5.u)localc0).b(i));
    localObject = k;
    e.n(new n(a, (t5.n)localObject, l1), 1, -1, null, 0, null, j, H);
  }
  
  public final boolean D()
  {
    boolean bool;
    if ((!L) && (!x())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final void a()
  {
    x.post(v);
  }
  
  public final void b()
  {
    x6.b.H(D);
    F.getClass();
    G.getClass();
  }
  
  public final long c()
  {
    return g();
  }
  
  public final boolean d(long paramLong)
  {
    if ((!S) && (!s.c()) && (!Q) && ((!D) || (M != 0)))
    {
      boolean bool = u.a();
      if (!s.d())
      {
        C();
        bool = true;
      }
      return bool;
    }
    return false;
  }
  
  public final long e(long paramLong, n1 paramn1)
  {
    b();
    if (!G.e()) {
      return 0L;
    }
    t.a locala = G.g(paramLong);
    return paramn1.a(paramLong, a.a, b.a);
  }
  
  public final void f()
  {
    for (Object localObject2 : A)
    {
      ((b0)localObject2).v(true);
      localObject3 = h;
      if (localObject3 != null)
      {
        ((e)localObject3).f(e);
        h = null;
        g = null;
      }
    }
    ??? = (a0)t;
    Object localObject3 = (c4.h)b;
    if (localObject3 != null)
    {
      ((c4.h)localObject3).release();
      b = null;
    }
    c = null;
  }
  
  public final long g()
  {
    b();
    if ((!S) && (M != 0))
    {
      if (x()) {
        return P;
      }
      if (E)
      {
        int i = A.length;
        int j = 0;
        for (l1 = Long.MAX_VALUE;; l1 = l2)
        {
          l2 = l1;
          if (j >= i) {
            break;
          }
          ??? = F;
          l2 = l1;
          if (b[j] != 0)
          {
            l2 = l1;
            if (c[j] != 0) {
              synchronized (A[j])
              {
                boolean bool = w;
                l2 = l1;
                if (bool) {}
              }
            }
          }
          j++;
        }
      }
      long l2 = Long.MAX_VALUE;
      long l1 = l2;
      if (l2 == Long.MAX_VALUE) {
        l1 = w(false);
      }
      l2 = l1;
      if (l1 == Long.MIN_VALUE) {
        l2 = O;
      }
      return l2;
    }
    return Long.MIN_VALUE;
  }
  
  public final void h(long paramLong) {}
  
  public final long i(r5.h[] paramArrayOfh, boolean[] paramArrayOfBoolean1, c0[] paramArrayOfc0, boolean[] paramArrayOfBoolean2, long paramLong)
  {
    b();
    Object localObject = F;
    j0 localj0 = a;
    localObject = c;
    int i = M;
    int j = 0;
    int k = 0;
    for (int m = 0; m < paramArrayOfh.length; m++)
    {
      c0 localc0 = paramArrayOfc0[m];
      if ((localc0 != null) && ((paramArrayOfh[m] == null) || (paramArrayOfBoolean1[m] == 0)))
      {
        n = a;
        x6.b.H(localObject[n]);
        M -= 1;
        localObject[n] = 0;
        paramArrayOfc0[m] = null;
      }
    }
    if (K ? i == 0 : paramLong != 0L) {
      m = 1;
    } else {
      m = 0;
    }
    i = 0;
    for (int n = m; i < paramArrayOfh.length; n = m)
    {
      m = n;
      if (paramArrayOfc0[i] == null)
      {
        paramArrayOfBoolean1 = paramArrayOfh[i];
        m = n;
        if (paramArrayOfBoolean1 != null)
        {
          boolean bool;
          if (paramArrayOfBoolean1.length() == 1) {
            bool = true;
          } else {
            bool = false;
          }
          x6.b.H(bool);
          if (paramArrayOfBoolean1.c(0) == 0) {
            bool = true;
          } else {
            bool = false;
          }
          x6.b.H(bool);
          int i1 = localj0.b(paramArrayOfBoolean1.a());
          x6.b.H(localObject[i1] ^ 0x1);
          M += 1;
          localObject[i1] = 1;
          paramArrayOfc0[i] = new c(i1);
          paramArrayOfBoolean2[i] = true;
          m = n;
          if (n == 0)
          {
            paramArrayOfBoolean1 = A[i1];
            if ((!paramArrayOfBoolean1.x(paramLong, true)) && (q + s != 0)) {
              m = 1;
            } else {
              m = 0;
            }
          }
        }
      }
      i++;
    }
    long l;
    if (M == 0)
    {
      Q = false;
      L = false;
      if (s.d())
      {
        paramArrayOfh = A;
        i = paramArrayOfh.length;
        for (m = k; m < i; m++) {
          paramArrayOfh[m].h();
        }
        s.b();
        l = paramLong;
      }
      else
      {
        paramArrayOfh = A;
        i = paramArrayOfh.length;
        for (m = 0;; m++)
        {
          l = paramLong;
          if (m >= i) {
            break;
          }
          paramArrayOfh[m].v(false);
        }
      }
    }
    else
    {
      l = paramLong;
      if (n != 0)
      {
        paramLong = l(paramLong);
        for (m = j;; m++)
        {
          l = paramLong;
          if (m >= paramArrayOfc0.length) {
            break;
          }
          if (paramArrayOfc0[m] != null) {
            paramArrayOfBoolean2[m] = true;
          }
        }
      }
    }
    K = true;
    return l;
  }
  
  public final boolean isLoading()
  {
    if (s.d()) {}
    boolean bool;
    synchronized (u)
    {
      bool = a;
      if (bool) {
        bool = true;
      }
    }
    return bool;
  }
  
  public final void j()
  {
    Object localObject1 = s;
    Object localObject2 = d;
    int i = J;
    int j = ((t5.u)localObject2).b(i);
    localObject2 = c;
    if (localObject2 == null)
    {
      localObject2 = b;
      if (localObject2 != null)
      {
        i = j;
        if (j == Integer.MIN_VALUE) {
          i = a;
        }
        localObject1 = e;
        if ((localObject1 != null) && (f > i)) {
          throw ((Throwable)localObject1);
        }
      }
      if ((S) && (!D)) {
        throw a1.a("Loading finished before preparation is complete.", null);
      }
      return;
    }
    throw ((Throwable)localObject2);
  }
  
  public final void k(d0.d paramd, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    paramd = (a)paramd;
    Object localObject = c;
    Uri localUri = c;
    localObject = new n(d);
    d.getClass();
    e.e((n)localObject, 1, -1, null, 0, null, j, H);
    if (!paramBoolean)
    {
      paramd = A;
      int i = paramd.length;
      for (int j = 0; j < i; j++) {
        paramd[j].v(false);
      }
      if (M > 0)
      {
        paramd = y;
        paramd.getClass();
        paramd.a(this);
      }
    }
  }
  
  public final long l(long paramLong)
  {
    b();
    Object localObject = F.b;
    if (!G.e()) {
      paramLong = 0L;
    }
    int i = 0;
    L = false;
    O = paramLong;
    if (x())
    {
      P = paramLong;
      return paramLong;
    }
    int j;
    int k;
    if (J != 7)
    {
      j = A.length;
      for (k = 0; k < j; k++) {
        if ((!A[k].x(paramLong, false)) && ((localObject[k] != 0) || (!E)))
        {
          k = 0;
          break label126;
        }
      }
      k = 1;
      label126:
      if (k != 0) {
        return paramLong;
      }
    }
    Q = false;
    P = paramLong;
    S = false;
    if (s.d())
    {
      localObject = A;
      j = localObject.length;
      for (k = i; k < j; k++) {
        localObject[k].h();
      }
      s.b();
    }
    else
    {
      s.c = null;
      localObject = A;
      i = localObject.length;
      for (k = 0; k < i; k++) {
        localObject[k].v(false);
      }
    }
    return paramLong;
  }
  
  public final void m()
  {
    C = true;
    x.post(v);
  }
  
  public final void n(r.a parama, long paramLong)
  {
    y = parama;
    u.a();
    C();
  }
  
  public final long o()
  {
    if ((L) && ((S) || (v() > R)))
    {
      L = false;
      return O;
    }
    return -9223372036854775807L;
  }
  
  public final void p(d0.d paramd, long paramLong1, long paramLong2)
  {
    paramd = (a)paramd;
    if (H == -9223372036854775807L)
    {
      localObject = G;
      if (localObject != null)
      {
        boolean bool1 = ((t)localObject).e();
        paramLong1 = w(true);
        if (paramLong1 == Long.MIN_VALUE) {
          paramLong1 = 0L;
        } else {
          paramLong1 += 10000L;
        }
        H = paramLong1;
        localObject = o;
        boolean bool2 = I;
        ((z)localObject).y(paramLong1, bool1, bool2);
      }
    }
    Object localObject = c;
    Uri localUri = c;
    localObject = new n(d);
    d.getClass();
    e.h((n)localObject, 1, -1, null, 0, null, j, H);
    S = true;
    paramd = y;
    paramd.getClass();
    paramd.a(this);
  }
  
  public final j0 q()
  {
    b();
    return F.a;
  }
  
  public final v r(int paramInt1, int paramInt2)
  {
    return B(new d(paramInt1, false));
  }
  
  public final void s(long paramLong, boolean paramBoolean)
  {
    b();
    if (x()) {
      return;
    }
    boolean[] arrayOfBoolean = F.c;
    int i = A.length;
    for (int j = 0; j < i; j++) {
      A[j].g(paramLong, paramBoolean, arrayOfBoolean[j]);
    }
  }
  
  public final void t(t paramt)
  {
    x.post(new w.g(11, this, paramt));
  }
  
  public final d0.b u(d0.d paramd, long paramLong1, long paramLong2, IOException paramIOException, int paramInt)
  {
    a locala = (a)paramd;
    paramd = c;
    Object localObject = c;
    localObject = new n(d);
    e0.R(j);
    e0.R(H);
    ((t5.u)d).getClass();
    boolean bool = paramIOException instanceof a1;
    int i = 0;
    int j;
    if ((!bool) && (!(paramIOException instanceof FileNotFoundException)) && (!(paramIOException instanceof w)) && (!(paramIOException instanceof d0.g)))
    {
      j = t5.l.b;
      for (paramd = paramIOException; paramd != null; paramd = paramd.getCause()) {
        if (((paramd instanceof t5.l)) && (a == 2008))
        {
          j = 1;
          break label147;
        }
      }
      j = 0;
      label147:
      if (j == 0)
      {
        paramLong1 = Math.min((paramInt - 1) * 1000, 5000);
        break label178;
      }
    }
    paramLong1 = -9223372036854775807L;
    label178:
    if (paramLong1 == -9223372036854775807L) {
      paramd = d0.f;
    }
    for (;;)
    {
      break;
      j = v();
      if (j > R) {
        paramInt = 1;
      } else {
        paramInt = 0;
      }
      if (!N)
      {
        paramd = G;
        if ((paramd == null) || (paramd.h() == -9223372036854775807L))
        {
          if ((D) && (!D()))
          {
            Q = true;
            j = i;
            break label365;
          }
          L = D;
          O = 0L;
          R = 0;
          paramd = A;
          i = paramd.length;
          for (j = 0; j < i; j++) {
            paramd[j].v(false);
          }
          g.a = 0L;
          j = 0L;
          i = true;
          m = false;
          break label362;
        }
      }
      R = j;
      label362:
      j = 1;
      label365:
      if (j != 0) {
        paramd = new d0.b(paramInt, paramLong1);
      } else {
        paramd = d0.e;
      }
    }
    bool = paramd.a() ^ true;
    e.j((n)localObject, 1, -1, null, 0, null, j, H, paramIOException, bool);
    if (bool) {
      d.getClass();
    }
    return paramd;
  }
  
  public final int v()
  {
    b0[] arrayOfb0 = A;
    int i = arrayOfb0.length;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      b0 localb0 = arrayOfb0[j];
      k += q + p;
      j++;
    }
    return k;
  }
  
  public final long w(boolean paramBoolean)
  {
    long l1 = Long.MIN_VALUE;
    int i = 0;
    while (i < A.length)
    {
      long l2;
      if (!paramBoolean)
      {
        ??? = F;
        ???.getClass();
        l2 = l1;
        if (c[i] == 0) {
          break label77;
        }
      }
      synchronized (A[i])
      {
        l2 = v;
        l2 = Math.max(l1, l2);
        label77:
        i++;
        l1 = l2;
      }
    }
    return l1;
  }
  
  public final boolean x()
  {
    boolean bool;
    if (P != -9223372036854775807L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void y()
  {
    if ((!T) && (!D) && (C) && (G != null))
    {
      Object localObject1 = A;
      int i = localObject1.length;
      for (int j = 0; j < i; j++) {
        if (localObject1[j].p() == null) {
          return;
        }
      }
      synchronized (u)
      {
        a = false;
        i = A.length;
        i0[] arrayOfi0 = new i0[i];
        boolean[] arrayOfBoolean = new boolean[i];
        for (j = 0; j < i; j++)
        {
          v3.i0 locali0 = A[j].p();
          locali0.getClass();
          localObject1 = t;
          boolean bool = p.k((String)localObject1);
          int k;
          if ((!bool) && (!p.m((String)localObject1))) {
            k = 0;
          } else {
            k = 1;
          }
          arrayOfBoolean[j] = k;
          E = (k | E);
          t4.b localb = z;
          ??? = locali0;
          if (localb != null)
          {
            if (!bool)
            {
              localObject1 = locali0;
              if (!B[j].b) {}
            }
            else
            {
              localObject1 = r;
              if (localObject1 == null)
              {
                localObject1 = new p4.a(new a.b[] { localb });
              }
              else
              {
                long l = b;
                localObject1 = a;
                int m = e0.a;
                ??? = Arrays.copyOf((Object[])localObject1, localObject1.length + 1);
                m = localObject1.length;
                System.arraycopy(new a.b[] { localb }, 0, ???, m, 1);
                localObject1 = new p4.a(l, (a.b[])???);
              }
              ??? = new i0.a(locali0);
              i = ((p4.a)localObject1);
              localObject1 = new v3.i0((i0.a)???);
            }
            ??? = localObject1;
            if (bool)
            {
              ??? = localObject1;
              if (f == -1)
              {
                ??? = localObject1;
                if (o == -1)
                {
                  ??? = localObject1;
                  if (a != -1)
                  {
                    localObject1 = new i0.a((v3.i0)localObject1);
                    f = a;
                    ??? = new v3.i0((i0.a)localObject1);
                  }
                }
              }
            }
          }
          localObject1 = ((v3.i0)???).b(c.e((v3.i0)???));
          arrayOfi0[j] = new i0(Integer.toString(j), new v3.i0[] { localObject1 });
        }
        F = new e(new j0(arrayOfi0), arrayOfBoolean);
        D = true;
        localObject1 = y;
        localObject1.getClass();
        ((r.a)localObject1).b(this);
      }
    }
  }
  
  public final void z(int paramInt)
  {
    b();
    Object localObject = F;
    boolean[] arrayOfBoolean = d;
    if (arrayOfBoolean[paramInt] == 0)
    {
      localObject = a.a(paramInt).d[0];
      e.b(p.i(t), (v3.i0)localObject, 0, null, O);
      arrayOfBoolean[paramInt] = true;
    }
  }
  
  public final class a
    implements d0.d, m.a
  {
    public final long a;
    public final Uri b;
    public final t5.j0 c;
    public final x d;
    public final j e;
    public final b5.g f;
    public final s g;
    public volatile boolean h;
    public boolean i;
    public long j;
    public t5.n k;
    public b0 l;
    public boolean m;
    
    public a(Uri paramUri, t5.k paramk, x paramx, j paramj, b5.g paramg)
    {
      b = paramUri;
      c = new t5.j0(paramk);
      d = paramx;
      e = paramj;
      f = paramg;
      g = new s();
      i = true;
      a = n.b.getAndIncrement();
      k = c(0L);
    }
    
    /* Error */
    public final void a()
    {
      // Byte code:
      //   0: iconst_0
      //   1: istore_1
      //   2: iload_1
      //   3: ifne +848 -> 851
      //   6: aload_0
      //   7: getfield 87	z4/y$a:h	Z
      //   10: ifne +841 -> 851
      //   13: iload_1
      //   14: istore_2
      //   15: aload_0
      //   16: getfield 62	z4/y$a:g	Lc4/s;
      //   19: getfield 88	c4/s:a	J
      //   22: lstore_3
      //   23: iload_1
      //   24: istore_2
      //   25: aload_0
      //   26: lload_3
      //   27: invokevirtual 80	z4/y$a:c	(J)Lt5/n;
      //   30: astore 5
      //   32: iload_1
      //   33: istore_2
      //   34: aload_0
      //   35: aload 5
      //   37: putfield 82	z4/y$a:k	Lt5/n;
      //   40: iload_1
      //   41: istore_2
      //   42: aload_0
      //   43: getfield 51	z4/y$a:c	Lt5/j0;
      //   46: aload 5
      //   48: invokevirtual 91	t5/j0:a	(Lt5/n;)J
      //   51: lstore 6
      //   53: lload 6
      //   55: lstore 8
      //   57: lload 6
      //   59: ldc2_w 92
      //   62: lcmp
      //   63: ifeq +54 -> 117
      //   66: lload 6
      //   68: lload_3
      //   69: ladd
      //   70: lstore 8
      //   72: iload_1
      //   73: istore_2
      //   74: aload_0
      //   75: getfield 39	z4/y$a:n	Lz4/y;
      //   78: astore 10
      //   80: iload_1
      //   81: istore_2
      //   82: aload 10
      //   84: getfield 97	z4/y:x	Landroid/os/Handler;
      //   87: astore 5
      //   89: iload_1
      //   90: istore_2
      //   91: new 99	b/k
      //   94: astore 11
      //   96: iload_1
      //   97: istore_2
      //   98: aload 11
      //   100: aload 10
      //   102: bipush 9
      //   104: invokespecial 102	b/k:<init>	(Ljava/lang/Object;I)V
      //   107: iload_1
      //   108: istore_2
      //   109: aload 5
      //   111: aload 11
      //   113: invokevirtual 108	android/os/Handler:post	(Ljava/lang/Runnable;)Z
      //   116: pop
      //   117: iload_1
      //   118: istore_2
      //   119: aload_0
      //   120: getfield 39	z4/y$a:n	Lz4/y;
      //   123: aload_0
      //   124: getfield 51	z4/y$a:c	Lt5/j0;
      //   127: invokevirtual 111	t5/j0:h	()Ljava/util/Map;
      //   130: invokestatic 116	t4/b:a	(Ljava/util/Map;)Lt4/b;
      //   133: putfield 120	z4/y:z	Lt4/b;
      //   136: iload_1
      //   137: istore_2
      //   138: aload_0
      //   139: getfield 51	z4/y$a:c	Lt5/j0;
      //   142: astore 10
      //   144: iload_1
      //   145: istore_2
      //   146: aload_0
      //   147: getfield 39	z4/y$a:n	Lz4/y;
      //   150: getfield 120	z4/y:z	Lt4/b;
      //   153: astore 5
      //   155: aload 5
      //   157: ifnull +101 -> 258
      //   160: iload_1
      //   161: istore_2
      //   162: aload 5
      //   164: getfield 123	t4/b:f	I
      //   167: istore 12
      //   169: iload 12
      //   171: iconst_m1
      //   172: if_icmpeq +86 -> 258
      //   175: iload_1
      //   176: istore_2
      //   177: new 125	z4/m
      //   180: astore 5
      //   182: iload_1
      //   183: istore_2
      //   184: aload 5
      //   186: aload 10
      //   188: iload 12
      //   190: aload_0
      //   191: invokespecial 128	z4/m:<init>	(Lt5/j0;ILz4/m$a;)V
      //   194: iload_1
      //   195: istore_2
      //   196: aload_0
      //   197: getfield 39	z4/y$a:n	Lz4/y;
      //   200: astore 11
      //   202: iload_1
      //   203: istore_2
      //   204: aload 11
      //   206: invokevirtual 132	java/lang/Object:getClass	()Ljava/lang/Class;
      //   209: pop
      //   210: iload_1
      //   211: istore_2
      //   212: new 134	z4/y$d
      //   215: astore 10
      //   217: iload_1
      //   218: istore_2
      //   219: aload 10
      //   221: iconst_0
      //   222: iconst_1
      //   223: invokespecial 137	z4/y$d:<init>	(IZ)V
      //   226: iload_1
      //   227: istore_2
      //   228: aload 11
      //   230: aload 10
      //   232: invokevirtual 141	z4/y:B	(Lz4/y$d;)Lz4/b0;
      //   235: astore 10
      //   237: iload_1
      //   238: istore_2
      //   239: aload_0
      //   240: aload 10
      //   242: putfield 143	z4/y$a:l	Lz4/b0;
      //   245: iload_1
      //   246: istore_2
      //   247: aload 10
      //   249: getstatic 147	z4/y:V	Lv3/i0;
      //   252: invokevirtual 152	z4/b0:d	(Lv3/i0;)V
      //   255: goto +7 -> 262
      //   258: aload 10
      //   260: astore 5
      //   262: iload_1
      //   263: istore_2
      //   264: aload_0
      //   265: getfield 53	z4/y$a:d	Lz4/x;
      //   268: astore 13
      //   270: iload_1
      //   271: istore_2
      //   272: aload_0
      //   273: getfield 44	z4/y$a:b	Landroid/net/Uri;
      //   276: astore 14
      //   278: iload_1
      //   279: istore_2
      //   280: aload_0
      //   281: getfield 51	z4/y$a:c	Lt5/j0;
      //   284: invokevirtual 111	t5/j0:h	()Ljava/util/Map;
      //   287: astore 11
      //   289: iload_1
      //   290: istore_2
      //   291: aload_0
      //   292: getfield 55	z4/y$a:e	Lc4/j;
      //   295: astore 10
      //   297: iload_1
      //   298: istore_2
      //   299: aload 13
      //   301: checkcast 154	r3/a0
      //   304: astore 13
      //   306: lload_3
      //   307: lstore 6
      //   309: iload_1
      //   310: istore_2
      //   311: aload 13
      //   313: aload 5
      //   315: aload 14
      //   317: aload 11
      //   319: lload_3
      //   320: lload 8
      //   322: aload 10
      //   324: invokevirtual 157	r3/a0:i	(Lt5/k;Landroid/net/Uri;Ljava/util/Map;JJLc4/j;)V
      //   327: iload_1
      //   328: istore_2
      //   329: aload_0
      //   330: getfield 39	z4/y$a:n	Lz4/y;
      //   333: getfield 120	z4/y:z	Lt4/b;
      //   336: ifnull +44 -> 380
      //   339: iload_1
      //   340: istore_2
      //   341: aload_0
      //   342: getfield 53	z4/y$a:d	Lz4/x;
      //   345: checkcast 154	r3/a0
      //   348: getfield 160	r3/a0:b	Ljava/lang/Object;
      //   351: astore 5
      //   353: iload_1
      //   354: istore_2
      //   355: aload 5
      //   357: checkcast 162	c4/h
      //   360: instanceof 164
      //   363: ifeq +17 -> 380
      //   366: iload_1
      //   367: istore_2
      //   368: aload 5
      //   370: checkcast 162	c4/h
      //   373: checkcast 164	j4/d
      //   376: iconst_1
      //   377: putfield 167	j4/d:r	Z
      //   380: iload_1
      //   381: istore 12
      //   383: lload 6
      //   385: lstore 8
      //   387: iload_1
      //   388: istore_2
      //   389: aload_0
      //   390: getfield 64	z4/y$a:i	Z
      //   393: ifeq +69 -> 462
      //   396: iload_1
      //   397: istore_2
      //   398: aload_0
      //   399: getfield 53	z4/y$a:d	Lz4/x;
      //   402: astore 5
      //   404: iload_1
      //   405: istore_2
      //   406: aload_0
      //   407: getfield 169	z4/y$a:j	J
      //   410: lstore 8
      //   412: iload_1
      //   413: istore_2
      //   414: aload 5
      //   416: checkcast 154	r3/a0
      //   419: getfield 160	r3/a0:b	Ljava/lang/Object;
      //   422: checkcast 162	c4/h
      //   425: astore 5
      //   427: iload_1
      //   428: istore_2
      //   429: aload 5
      //   431: invokevirtual 132	java/lang/Object:getClass	()Ljava/lang/Class;
      //   434: pop
      //   435: iload_1
      //   436: istore_2
      //   437: aload 5
      //   439: lload 6
      //   441: lload 8
      //   443: invokeinterface 172 5 0
      //   448: iload_1
      //   449: istore_2
      //   450: aload_0
      //   451: iconst_0
      //   452: putfield 64	z4/y$a:i	Z
      //   455: lload 6
      //   457: lstore 8
      //   459: iload_1
      //   460: istore 12
      //   462: iload 12
      //   464: istore_1
      //   465: iload_1
      //   466: ifne +274 -> 740
      //   469: iload_1
      //   470: istore_2
      //   471: aload_0
      //   472: getfield 87	z4/y$a:h	Z
      //   475: istore 15
      //   477: iload 15
      //   479: ifne +261 -> 740
      //   482: iload_1
      //   483: istore_2
      //   484: aload_0
      //   485: getfield 57	z4/y$a:f	Lb5/g;
      //   488: astore 5
      //   490: iload_1
      //   491: istore_2
      //   492: aload 5
      //   494: monitorenter
      //   495: aload 5
      //   497: getfield 176	b5/g:a	Z
      //   500: ifne +11 -> 511
      //   503: aload 5
      //   505: invokevirtual 179	java/lang/Object:wait	()V
      //   508: goto -13 -> 495
      //   511: iload_1
      //   512: istore_2
      //   513: aload 5
      //   515: monitorexit
      //   516: iload_1
      //   517: istore_2
      //   518: aload_0
      //   519: getfield 53	z4/y$a:d	Lz4/x;
      //   522: astore 10
      //   524: iload_1
      //   525: istore_2
      //   526: aload_0
      //   527: getfield 62	z4/y$a:g	Lc4/s;
      //   530: astore 5
      //   532: iload_1
      //   533: istore_2
      //   534: aload 10
      //   536: checkcast 154	r3/a0
      //   539: astore 11
      //   541: iload_1
      //   542: istore_2
      //   543: aload 11
      //   545: getfield 160	r3/a0:b	Ljava/lang/Object;
      //   548: checkcast 162	c4/h
      //   551: astore 10
      //   553: iload_1
      //   554: istore_2
      //   555: aload 10
      //   557: invokevirtual 132	java/lang/Object:getClass	()Ljava/lang/Class;
      //   560: pop
      //   561: iload_1
      //   562: istore_2
      //   563: aload 11
      //   565: getfield 181	r3/a0:c	Ljava/lang/Object;
      //   568: checkcast 183	c4/i
      //   571: astore 11
      //   573: iload_1
      //   574: istore_2
      //   575: aload 11
      //   577: invokevirtual 132	java/lang/Object:getClass	()Ljava/lang/Class;
      //   580: pop
      //   581: iload_1
      //   582: istore_2
      //   583: aload 10
      //   585: aload 11
      //   587: aload 5
      //   589: invokeinterface 186 3 0
      //   594: istore 12
      //   596: iload 12
      //   598: istore_2
      //   599: aload_0
      //   600: getfield 53	z4/y$a:d	Lz4/x;
      //   603: checkcast 154	r3/a0
      //   606: invokevirtual 188	r3/a0:a	()J
      //   609: lstore 6
      //   611: iload 12
      //   613: istore_1
      //   614: iload 12
      //   616: istore_2
      //   617: lload 6
      //   619: aload_0
      //   620: getfield 39	z4/y$a:n	Lz4/y;
      //   623: getfield 190	z4/y:r	J
      //   626: lload 8
      //   628: ladd
      //   629: lcmp
      //   630: ifle -165 -> 465
      //   633: iload 12
      //   635: istore_2
      //   636: aload_0
      //   637: getfield 57	z4/y$a:f	Lb5/g;
      //   640: astore 5
      //   642: iload 12
      //   644: istore_2
      //   645: aload 5
      //   647: monitorenter
      //   648: aload 5
      //   650: iconst_0
      //   651: putfield 176	b5/g:a	Z
      //   654: iload 12
      //   656: istore_2
      //   657: aload 5
      //   659: monitorexit
      //   660: iload 12
      //   662: istore_2
      //   663: aload_0
      //   664: getfield 39	z4/y$a:n	Lz4/y;
      //   667: astore 5
      //   669: iload 12
      //   671: istore_2
      //   672: aload 5
      //   674: getfield 97	z4/y:x	Landroid/os/Handler;
      //   677: aload 5
      //   679: getfield 194	z4/y:w	Lb/d;
      //   682: invokevirtual 108	android/os/Handler:post	(Ljava/lang/Runnable;)Z
      //   685: pop
      //   686: lload 6
      //   688: lstore 8
      //   690: goto -228 -> 462
      //   693: astore 10
      //   695: iload 12
      //   697: istore_2
      //   698: aload 5
      //   700: monitorexit
      //   701: iload 12
      //   703: istore_2
      //   704: aload 10
      //   706: athrow
      //   707: astore 10
      //   709: iload_1
      //   710: istore_2
      //   711: aload 5
      //   713: monitorexit
      //   714: iload_1
      //   715: istore_2
      //   716: aload 10
      //   718: athrow
      //   719: astore 5
      //   721: iload_1
      //   722: istore_2
      //   723: new 196	java/io/InterruptedIOException
      //   726: astore 5
      //   728: iload_1
      //   729: istore_2
      //   730: aload 5
      //   732: invokespecial 197	java/io/InterruptedIOException:<init>	()V
      //   735: iload_1
      //   736: istore_2
      //   737: aload 5
      //   739: athrow
      //   740: iload_1
      //   741: iconst_1
      //   742: if_icmpne +8 -> 750
      //   745: iconst_0
      //   746: istore_2
      //   747: goto +41 -> 788
      //   750: iload_1
      //   751: istore_2
      //   752: aload_0
      //   753: getfield 53	z4/y$a:d	Lz4/x;
      //   756: checkcast 154	r3/a0
      //   759: invokevirtual 188	r3/a0:a	()J
      //   762: ldc2_w 92
      //   765: lcmp
      //   766: ifeq +22 -> 788
      //   769: aload_0
      //   770: getfield 62	z4/y$a:g	Lc4/s;
      //   773: aload_0
      //   774: getfield 53	z4/y$a:d	Lz4/x;
      //   777: checkcast 154	r3/a0
      //   780: invokevirtual 188	r3/a0:a	()J
      //   783: putfield 88	c4/s:a	J
      //   786: iload_1
      //   787: istore_2
      //   788: aload_0
      //   789: getfield 51	z4/y$a:c	Lt5/j0;
      //   792: invokestatic 201	b/z:d	(Lt5/k;)V
      //   795: iload_2
      //   796: istore_1
      //   797: goto -795 -> 2
      //   800: astore 5
      //   802: iload_2
      //   803: iconst_1
      //   804: if_icmpeq +37 -> 841
      //   807: aload_0
      //   808: getfield 53	z4/y$a:d	Lz4/x;
      //   811: checkcast 154	r3/a0
      //   814: invokevirtual 188	r3/a0:a	()J
      //   817: ldc2_w 92
      //   820: lcmp
      //   821: ifeq +20 -> 841
      //   824: aload_0
      //   825: getfield 62	z4/y$a:g	Lc4/s;
      //   828: aload_0
      //   829: getfield 53	z4/y$a:d	Lz4/x;
      //   832: checkcast 154	r3/a0
      //   835: invokevirtual 188	r3/a0:a	()J
      //   838: putfield 88	c4/s:a	J
      //   841: aload_0
      //   842: getfield 51	z4/y$a:c	Lt5/j0;
      //   845: invokestatic 201	b/z:d	(Lt5/k;)V
      //   848: aload 5
      //   850: athrow
      //   851: return
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	852	0	this	a
      //   1	796	1	i1	int
      //   14	791	2	i2	int
      //   22	298	3	l1	long
      //   30	682	5	localObject1	Object
      //   719	1	5	localInterruptedException	InterruptedException
      //   726	12	5	localInterruptedIOException	java.io.InterruptedIOException
      //   800	49	5	localObject2	Object
      //   51	636	6	l2	long
      //   55	634	8	l3	long
      //   78	506	10	localObject3	Object
      //   693	12	10	localObject4	Object
      //   707	10	10	localObject5	Object
      //   94	492	11	localObject6	Object
      //   167	535	12	i3	int
      //   268	44	13	localObject7	Object
      //   276	40	14	localUri	Uri
      //   475	3	15	bool	boolean
      // Exception table:
      //   from	to	target	type
      //   648	654	693	finally
      //   495	508	707	finally
      //   484	490	719	java/lang/InterruptedException
      //   492	495	719	java/lang/InterruptedException
      //   513	516	719	java/lang/InterruptedException
      //   711	714	719	java/lang/InterruptedException
      //   716	719	719	java/lang/InterruptedException
      //   15	23	800	finally
      //   25	32	800	finally
      //   34	40	800	finally
      //   42	53	800	finally
      //   74	80	800	finally
      //   82	89	800	finally
      //   91	96	800	finally
      //   98	107	800	finally
      //   109	117	800	finally
      //   119	136	800	finally
      //   138	144	800	finally
      //   146	155	800	finally
      //   162	169	800	finally
      //   177	182	800	finally
      //   184	194	800	finally
      //   196	202	800	finally
      //   204	210	800	finally
      //   212	217	800	finally
      //   219	226	800	finally
      //   228	237	800	finally
      //   239	245	800	finally
      //   247	255	800	finally
      //   264	270	800	finally
      //   272	278	800	finally
      //   280	289	800	finally
      //   291	297	800	finally
      //   299	306	800	finally
      //   311	327	800	finally
      //   329	339	800	finally
      //   341	353	800	finally
      //   355	366	800	finally
      //   368	380	800	finally
      //   389	396	800	finally
      //   398	404	800	finally
      //   406	412	800	finally
      //   414	427	800	finally
      //   429	435	800	finally
      //   437	448	800	finally
      //   450	455	800	finally
      //   471	477	800	finally
      //   484	490	800	finally
      //   492	495	800	finally
      //   513	516	800	finally
      //   518	524	800	finally
      //   526	532	800	finally
      //   534	541	800	finally
      //   543	553	800	finally
      //   555	561	800	finally
      //   563	573	800	finally
      //   575	581	800	finally
      //   583	596	800	finally
      //   599	611	800	finally
      //   617	633	800	finally
      //   636	642	800	finally
      //   645	648	800	finally
      //   657	660	800	finally
      //   663	669	800	finally
      //   672	686	800	finally
      //   698	701	800	finally
      //   704	707	800	finally
      //   711	714	800	finally
      //   716	719	800	finally
      //   723	728	800	finally
      //   730	735	800	finally
      //   737	740	800	finally
    }
    
    public final void b()
    {
      h = true;
    }
    
    public final t5.n c(long paramLong)
    {
      Collections.emptyMap();
      Uri localUri = b;
      String str = q;
      Map localMap = y.U;
      if (localUri != null) {
        return new t5.n(localUri, 0L, 1, null, localMap, paramLong, -1L, str, 6, null);
      }
      throw new IllegalStateException("The uri must be set.");
    }
  }
  
  public static abstract interface b {}
  
  public final class c
    implements c0
  {
    public final int a;
    
    public c(int paramInt)
    {
      a = paramInt;
    }
    
    public final void a()
    {
      y localy = y.this;
      int i = a;
      A[i].s();
      Object localObject1 = s;
      Object localObject2 = d;
      i = J;
      int j = ((t5.u)localObject2).b(i);
      localObject2 = c;
      if (localObject2 == null)
      {
        localObject2 = b;
        if (localObject2 != null)
        {
          i = j;
          if (j == Integer.MIN_VALUE) {
            i = a;
          }
          localObject1 = e;
          if ((localObject1 != null) && (f > i)) {
            throw ((Throwable)localObject1);
          }
        }
        return;
      }
      throw ((Throwable)localObject2);
    }
    
    public final boolean b()
    {
      y localy = y.this;
      int i = a;
      boolean bool;
      if ((!localy.D()) && (A[i].q(S))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final int m(long paramLong)
    {
      y localy = y.this;
      int i = a;
      int j;
      if (localy.D())
      {
        j = 0;
      }
      else
      {
        localy.z(i);
        b0 localb0 = A[i];
        int k = localb0.o(paramLong, S);
        localb0.y(k);
        j = k;
        if (k == 0)
        {
          localy.A(i);
          j = k;
        }
      }
      return j;
    }
    
    public final int r(l3.l paraml, z3.g paramg, int paramInt)
    {
      y localy = y.this;
      int i = a;
      boolean bool = localy.D();
      int j = -3;
      if (bool)
      {
        paramInt = j;
      }
      else
      {
        localy.z(i);
        paramInt = A[i].u(paraml, paramg, paramInt, S);
        if (paramInt == -3) {
          localy.A(i);
        }
      }
      return paramInt;
    }
  }
  
  public static final class d
  {
    public final int a;
    public final boolean b;
    
    public d(int paramInt, boolean paramBoolean)
    {
      a = paramInt;
      b = paramBoolean;
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (d.class == paramObject.getClass()))
      {
        paramObject = (d)paramObject;
        if ((a != a) || (b != b)) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public final int hashCode()
    {
      return a * 31 + b;
    }
  }
  
  public static final class e
  {
    public final j0 a;
    public final boolean[] b;
    public final boolean[] c;
    public final boolean[] d;
    
    public e(j0 paramj0, boolean[] paramArrayOfBoolean)
    {
      a = paramj0;
      b = paramArrayOfBoolean;
      int i = a;
      c = new boolean[i];
      d = new boolean[i];
    }
  }
}

/* Location:
 * Qualified Name:     z4.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */