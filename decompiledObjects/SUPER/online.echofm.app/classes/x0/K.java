package x0;

import A0.B;
import A0.y;
import B0.m;
import B0.m.c;
import B0.n.b;
import B0.n.c;
import B0.n.e;
import B0.n.f;
import F0.D;
import F0.L;
import F0.M.a;
import F0.M.b;
import F0.N;
import F0.T;
import F0.t;
import android.net.Uri;
import android.os.Handler;
import d0.A;
import d0.q.b;
import d0.x.b;
import g0.a;
import g0.f;
import g0.o;
import i0.g;
import i0.j;
import i0.k;
import i0.k.b;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k0.d1;
import k0.v0;
import k0.y0;

public final class K
  implements v, t, n.b, n.f, P.d
{
  public static final Map c0 = ;
  public static final d0.q d0 = new q.b().a0("icy").o0("application/x-icy").K();
  public final F A;
  public final f B;
  public final Runnable C;
  public final Runnable D;
  public final Handler E;
  public v.a F;
  public S0.b G;
  public P[] H;
  public e[] I;
  public boolean J;
  public boolean K;
  public boolean L;
  public boolean M;
  public f N;
  public F0.M O;
  public long P;
  public boolean Q;
  public int R;
  public boolean S;
  public boolean T;
  public int U;
  public boolean V;
  public long W;
  public long X;
  public boolean Y;
  public int Z;
  public boolean a0;
  public boolean b0;
  public final Uri o;
  public final g p;
  public final p0.x q;
  public final m r;
  public final E.a s;
  public final p0.v.a t;
  public final c u;
  public final B0.b v;
  public final String w;
  public final long x;
  public final long y;
  public final B0.n z;
  
  public K(Uri paramUri, g paramg, F paramF, p0.x paramx, p0.v.a parama, m paramm, E.a parama1, c paramc, B0.b paramb, String paramString, int paramInt, long paramLong)
  {
    o = paramUri;
    p = paramg;
    q = paramx;
    t = parama;
    r = paramm;
    s = parama1;
    u = paramc;
    v = paramb;
    w = paramString;
    x = paramInt;
    z = new B0.n("ProgressiveMediaPeriod");
    A = paramF;
    y = paramLong;
    B = new f();
    C = new G(this);
    D = new H(this);
    E = g0.M.A();
    I = new e[0];
    H = new P[0];
    X = -9223372036854775807L;
    R = 1;
  }
  
  public static Map M()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("Icy-MetaData", "1");
    return Collections.unmodifiableMap(localHashMap);
  }
  
  private boolean Q()
  {
    boolean bool;
    if (X != -9223372036854775807L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void V()
  {
    if ((!b0) && (!K) && (J) && (O != null))
    {
      Object localObject = H;
      int i = localObject.length;
      for (int j = 0; j < i; j++) {
        if (localObject[j].G() == null) {
          return;
        }
      }
      B.c();
      i = H.length;
      d0.J[] arrayOfJ = new d0.J[i];
      boolean[] arrayOfBoolean = new boolean[i];
      for (j = 0; j < i; j++)
      {
        d0.q localq1 = (d0.q)a.e(H[j].G());
        localObject = n;
        boolean bool1 = d0.z.o((String)localObject);
        if ((!bool1) && (!d0.z.s((String)localObject))) {
          bool2 = false;
        } else {
          bool2 = true;
        }
        arrayOfBoolean[j] = bool2;
        L = (bool2 | L);
        boolean bool2 = d0.z.p((String)localObject);
        if ((y != -9223372036854775807L) && (i == 1) && (bool2)) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        M = bool2;
        S0.b localb = G;
        localObject = localq1;
        if (localb != null)
        {
          d0.q localq2;
          if (!bool1)
          {
            localq2 = localq1;
            if (!I[j].b) {}
          }
          else
          {
            localObject = k;
            if (localObject == null) {
              localObject = new d0.x(new x.b[] { localb });
            } else {
              localObject = ((d0.x)localObject).a(new x.b[] { localb });
            }
            localq2 = localq1.a().h0((d0.x)localObject).K();
          }
          localObject = localq2;
          if (bool1)
          {
            localObject = localq2;
            if (g == -1)
            {
              localObject = localq2;
              if (h == -1)
              {
                localObject = localq2;
                if (o != -1) {
                  localObject = localq2.a().M(o).K();
                }
              }
            }
          }
        }
        localObject = ((d0.q)localObject).b(q.b((d0.q)localObject));
        arrayOfJ[j] = new d0.J(Integer.toString(j), new d0.q[] { localObject });
      }
      N = new f(new Z(arrayOfJ), arrayOfBoolean);
      if ((M) && (P == -9223372036854775807L))
      {
        P = y;
        O = new a(O);
      }
      u.q(P, O.h(), Q);
      K = true;
      ((v.a)a.e(F)).k(this);
    }
  }
  
  public final void K()
  {
    a.f(K);
    a.e(N);
    a.e(O);
  }
  
  public final boolean L(b paramb, int paramInt)
  {
    if (!V)
    {
      Object localObject = O;
      if ((localObject == null) || (((F0.M)localObject).l() == -9223372036854775807L))
      {
        boolean bool = K;
        paramInt = 0;
        if ((bool) && (!l0()))
        {
          Y = true;
          return false;
        }
        T = K;
        W = 0L;
        Z = 0;
        localObject = H;
        int i = localObject.length;
        while (paramInt < i)
        {
          localObject[paramInt].W();
          paramInt++;
        }
        b.h(paramb, 0L, 0L);
        return true;
      }
    }
    Z = paramInt;
    return true;
  }
  
  public final int N()
  {
    P[] arrayOfP = H;
    int i = arrayOfP.length;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      k += arrayOfP[j].H();
      j++;
    }
    return k;
  }
  
  public final long O(boolean paramBoolean)
  {
    long l1 = Long.MIN_VALUE;
    int i = 0;
    while (i < H.length)
    {
      long l2;
      if (!paramBoolean)
      {
        l2 = l1;
        if (eN)).c[i] == 0) {}
      }
      else
      {
        l2 = Math.max(l1, H[i].A());
      }
      i++;
      l1 = l2;
    }
    return l1;
  }
  
  public T P()
  {
    return e0(new e(0, true));
  }
  
  public boolean R(int paramInt)
  {
    boolean bool;
    if ((!l0()) && (H[paramInt].L(a0))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void W(int paramInt)
  {
    K();
    Object localObject = N;
    boolean[] arrayOfBoolean = d;
    if (arrayOfBoolean[paramInt] == 0)
    {
      localObject = a.b(paramInt).a(0);
      s.h(d0.z.k(n), (d0.q)localObject, 0, null, W);
      arrayOfBoolean[paramInt] = true;
    }
  }
  
  public final void X(int paramInt)
  {
    K();
    Object localObject = N.b;
    if ((Y) && (localObject[paramInt] != 0))
    {
      localObject = H[paramInt];
      paramInt = 0;
      if (!((P)localObject).L(false))
      {
        X = 0L;
        Y = false;
        T = true;
        W = 0L;
        Z = 0;
        localObject = H;
        int i = localObject.length;
        while (paramInt < i)
        {
          localObject[paramInt].W();
          paramInt++;
        }
        ((v.a)a.e(F)).e(this);
      }
    }
  }
  
  public void Y()
  {
    z.k(r.d(R));
  }
  
  public void Z(int paramInt)
  {
    H[paramInt].O();
    Y();
  }
  
  public T a(int paramInt1, int paramInt2)
  {
    return e0(new e(paramInt1, false));
  }
  
  public final void a0()
  {
    E.post(new I(this));
  }
  
  public boolean b()
  {
    boolean bool;
    if ((z.j()) && (B.d())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void b0(b paramb, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    Object localObject = b.d(paramb);
    localObject = new r(b.e(paramb), b.f(paramb), ((i0.x)localObject).r(), ((i0.x)localObject).s(), paramLong1, paramLong2, ((i0.x)localObject).q());
    r.a(b.e(paramb));
    s.q((r)localObject, 1, -1, null, 0, null, b.g(paramb), P);
    if (!paramBoolean)
    {
      paramb = H;
      int i = paramb.length;
      for (int j = 0; j < i; j++) {
        paramb[j].W();
      }
      if (U > 0) {
        ((v.a)a.e(F)).e(this);
      }
    }
  }
  
  public long c()
  {
    return f();
  }
  
  public void c0(b paramb, long paramLong1, long paramLong2)
  {
    if (P == -9223372036854775807L)
    {
      localObject = O;
      if (localObject != null)
      {
        boolean bool = ((F0.M)localObject).h();
        long l = O(true);
        if (l == Long.MIN_VALUE) {
          l = 0L;
        } else {
          l += 10000L;
        }
        P = l;
        u.q(l, bool, Q);
      }
    }
    Object localObject = b.d(paramb);
    localObject = new r(b.e(paramb), b.f(paramb), ((i0.x)localObject).r(), ((i0.x)localObject).s(), paramLong1, paramLong2, ((i0.x)localObject).q());
    r.a(b.e(paramb));
    s.t((r)localObject, 1, -1, null, 0, null, b.g(paramb), P);
    a0 = true;
    ((v.a)a.e(F)).e(this);
  }
  
  public long d(long paramLong, d1 paramd1)
  {
    K();
    if (!O.h()) {
      return 0L;
    }
    M.a locala = O.j(paramLong);
    return paramd1.a(paramLong, a.a, b.a);
  }
  
  public n.c d0(b paramb, long paramLong1, long paramLong2, IOException paramIOException, int paramInt)
  {
    Object localObject = b.d(paramb);
    r localr = new r(b.e(paramb), b.f(paramb), ((i0.x)localObject).r(), ((i0.x)localObject).s(), paramLong1, paramLong2, ((i0.x)localObject).q());
    localObject = new u(1, -1, null, 0, null, g0.M.i1(b.g(paramb)), g0.M.i1(P));
    paramLong1 = r.c(new m.c(localr, (u)localObject, paramIOException, paramInt));
    if (paramLong1 == -9223372036854775807L)
    {
      localObject = B0.n.g;
    }
    else
    {
      paramInt = N();
      if (paramInt > Z) {
        bool = true;
      } else {
        bool = false;
      }
      if (L(paramb, paramInt)) {
        localObject = B0.n.h(bool, paramLong1);
      } else {
        localObject = B0.n.f;
      }
    }
    boolean bool = ((n.c)localObject).c() ^ true;
    s.v(localr, 1, -1, null, 0, null, b.g(paramb), P, paramIOException, bool);
    if (bool) {
      r.a(b.e(paramb));
    }
    return (n.c)localObject;
  }
  
  public void e(F0.M paramM)
  {
    E.post(new J(this, paramM));
  }
  
  public final T e0(e parame)
  {
    int i = H.length;
    for (int j = 0; j < i; j++) {
      if (parame.equals(I[j])) {
        return H[j];
      }
    }
    if (J)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Extractor added new track (id=");
      ((StringBuilder)localObject).append(a);
      ((StringBuilder)localObject).append(") after finishing tracks.");
      o.h("ProgressiveMediaPeriod", ((StringBuilder)localObject).toString());
      return new F0.n();
    }
    Object localObject = P.k(v, q, t);
    ((P)localObject).e0(this);
    e[] arrayOfe = I;
    j = i + 1;
    arrayOfe = (e[])Arrays.copyOf(arrayOfe, j);
    arrayOfe[i] = parame;
    I = ((e[])g0.M.j(arrayOfe));
    parame = (P[])Arrays.copyOf(H, j);
    parame[i] = localObject;
    H = ((P[])g0.M.j(parame));
    return (T)localObject;
  }
  
  public long f()
  {
    K();
    if ((!a0) && (U != 0))
    {
      if (Q()) {
        return X;
      }
      if (L)
      {
        int i = H.length;
        int j = 0;
        for (l1 = Long.MAX_VALUE;; l1 = l2)
        {
          l2 = l1;
          if (j >= i) {
            break;
          }
          f localf = N;
          l2 = l1;
          if (b[j] != 0)
          {
            l2 = l1;
            if (c[j] != 0)
            {
              l2 = l1;
              if (!H[j].K()) {
                l2 = Math.min(l1, H[j].A());
              }
            }
          }
          j++;
        }
      }
      long l2 = Long.MAX_VALUE;
      long l1 = l2;
      if (l2 == Long.MAX_VALUE) {
        l1 = O(false);
      }
      l2 = l1;
      if (l1 == Long.MIN_VALUE) {
        l2 = W;
      }
      return l2;
    }
    return Long.MIN_VALUE;
  }
  
  public int f0(int paramInt1, v0 paramv0, j0.i parami, int paramInt2)
  {
    if (l0()) {
      return -3;
    }
    W(paramInt1);
    paramInt2 = H[paramInt1].T(paramv0, parami, paramInt2, a0);
    if (paramInt2 == -3) {
      X(paramInt1);
    }
    return paramInt2;
  }
  
  public boolean g(y0 paramy0)
  {
    if ((!a0) && (!z.i()) && (!Y) && ((!K) || (U != 0)))
    {
      boolean bool = B.e();
      if (!z.j())
      {
        k0();
        bool = true;
      }
      return bool;
    }
    return false;
  }
  
  public void g0()
  {
    if (K)
    {
      P[] arrayOfP = H;
      int i = arrayOfP.length;
      for (int j = 0; j < i; j++) {
        arrayOfP[j].S();
      }
    }
    z.m(this);
    E.removeCallbacksAndMessages(null);
    F = null;
    b0 = true;
  }
  
  public void h(long paramLong) {}
  
  public final boolean h0(boolean[] paramArrayOfBoolean, long paramLong)
  {
    int i = H.length;
    for (int j = 0; j < i; j++)
    {
      P localP = H[j];
      boolean bool;
      if (M) {
        bool = localP.Z(localP.y());
      } else {
        bool = localP.a0(paramLong, false);
      }
      if ((!bool) && ((paramArrayOfBoolean[j] != 0) || (!L))) {
        return false;
      }
    }
    return true;
  }
  
  public long i(y[] paramArrayOfy, boolean[] paramArrayOfBoolean1, Q[] paramArrayOfQ, boolean[] paramArrayOfBoolean2, long paramLong)
  {
    K();
    Object localObject = N;
    Z localZ = a;
    localObject = c;
    int i = U;
    int j = 0;
    int k = 0;
    int m = 0;
    for (int n = 0; n < paramArrayOfy.length; n++)
    {
      Q localQ = paramArrayOfQ[n];
      if ((localQ != null) && ((paramArrayOfy[n] == null) || (paramArrayOfBoolean1[n] == 0)))
      {
        i1 = d.b((d)localQ);
        a.f(localObject[i1]);
        U -= 1;
        localObject[i1] = 0;
        paramArrayOfQ[n] = null;
      }
    }
    if (S) {
      if (i != 0) {}
    }
    for (;;)
    {
      n = 1;
      break;
      do
      {
        n = 0;
        break;
      } while ((paramLong == 0L) || (M));
    }
    i = 0;
    for (int i1 = n; i < paramArrayOfy.length; i1 = n)
    {
      n = i1;
      if (paramArrayOfQ[i] == null)
      {
        paramArrayOfBoolean1 = paramArrayOfy[i];
        n = i1;
        if (paramArrayOfBoolean1 != null)
        {
          boolean bool;
          if (paramArrayOfBoolean1.length() == 1) {
            bool = true;
          } else {
            bool = false;
          }
          a.f(bool);
          if (paramArrayOfBoolean1.c(0) == 0) {
            bool = true;
          } else {
            bool = false;
          }
          a.f(bool);
          int i2 = localZ.d(paramArrayOfBoolean1.d());
          a.f(localObject[i2] ^ 0x1);
          U += 1;
          localObject[i2] = 1;
          paramArrayOfQ[i] = new d(i2);
          paramArrayOfBoolean2[i] = true;
          n = i1;
          if (i1 == 0)
          {
            paramArrayOfBoolean1 = H[i2];
            if ((paramArrayOfBoolean1.D() != 0) && (!paramArrayOfBoolean1.a0(paramLong, true))) {
              n = 1;
            } else {
              n = 0;
            }
          }
        }
      }
      i++;
    }
    long l;
    if (U == 0)
    {
      Y = false;
      T = false;
      if (z.j())
      {
        paramArrayOfy = H;
        i = paramArrayOfy.length;
        for (n = m; n < i; n++) {
          paramArrayOfy[n].r();
        }
        z.f();
        l = paramLong;
      }
      else
      {
        a0 = false;
        paramArrayOfy = H;
        i = paramArrayOfy.length;
        for (n = j;; n++)
        {
          l = paramLong;
          if (n >= i) {
            break;
          }
          paramArrayOfy[n].W();
        }
      }
    }
    else
    {
      l = paramLong;
      if (i1 != 0)
      {
        paramLong = s(paramLong);
        for (n = k;; n++)
        {
          l = paramLong;
          if (n >= paramArrayOfQ.length) {
            break;
          }
          if (paramArrayOfQ[n] != null) {
            paramArrayOfBoolean2[n] = true;
          }
        }
      }
    }
    S = true;
    return l;
  }
  
  public final void i0(F0.M paramM)
  {
    Object localObject;
    if (G == null) {
      localObject = paramM;
    } else {
      localObject = new M.b(-9223372036854775807L);
    }
    O = ((F0.M)localObject);
    P = paramM.l();
    boolean bool = V;
    int i = 1;
    if ((!bool) && (paramM.l() == -9223372036854775807L)) {
      bool = true;
    } else {
      bool = false;
    }
    Q = bool;
    if (bool) {
      i = 7;
    }
    R = i;
    if (K) {
      u.q(P, paramM.h(), Q);
    } else {
      V();
    }
  }
  
  public void j()
  {
    J = true;
    E.post(C);
  }
  
  public int j0(int paramInt, long paramLong)
  {
    if (l0()) {
      return 0;
    }
    W(paramInt);
    P localP = H[paramInt];
    int i = localP.F(paramLong, a0);
    localP.f0(i);
    if (i == 0) {
      X(paramInt);
    }
    return i;
  }
  
  public void k()
  {
    P[] arrayOfP = H;
    int i = arrayOfP.length;
    for (int j = 0; j < i; j++) {
      arrayOfP[j].U();
    }
    A.release();
  }
  
  public final void k0()
  {
    b localb = new b(o, p, A, this, B);
    if (K)
    {
      a.f(Q());
      l = P;
      if ((l != -9223372036854775807L) && (X > l))
      {
        a0 = true;
        X = -9223372036854775807L;
        return;
      }
      b.h(localb, eO)).j(X).a.b, X);
      localObject = H;
      int i = localObject.length;
      for (int j = 0; j < i; j++) {
        localObject[j].c0(X);
      }
      X = -9223372036854775807L;
    }
    Z = N();
    long l = z.n(localb, this, r.d(R));
    Object localObject = b.f(localb);
    s.z(new r(b.e(localb), (k)localObject, l), 1, -1, null, 0, null, b.g(localb), P);
  }
  
  public long l()
  {
    if ((T) && ((a0) || (N() > Z)))
    {
      T = false;
      return W;
    }
    return -9223372036854775807L;
  }
  
  public final boolean l0()
  {
    boolean bool;
    if ((!T) && (!Q())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void m(d0.q paramq)
  {
    E.post(C);
  }
  
  public Z n()
  {
    K();
    return N.a;
  }
  
  public void p()
  {
    Y();
    if ((a0) && (!K)) {
      throw A.a("Loading finished before preparation is complete.", null);
    }
  }
  
  public void q(long paramLong, boolean paramBoolean)
  {
    if (M) {
      return;
    }
    K();
    if (Q()) {
      return;
    }
    boolean[] arrayOfBoolean = N.c;
    int i = H.length;
    for (int j = 0; j < i; j++) {
      H[j].q(paramLong, paramBoolean, arrayOfBoolean[j]);
    }
  }
  
  public long s(long paramLong)
  {
    K();
    Object localObject = N.b;
    if (!O.h()) {
      paramLong = 0L;
    }
    int i = 0;
    int j = 0;
    T = false;
    W = paramLong;
    if (Q())
    {
      X = paramLong;
      return paramLong;
    }
    if ((R != 7) && ((a0) || (z.j())) && (h0((boolean[])localObject, paramLong))) {
      return paramLong;
    }
    Y = false;
    X = paramLong;
    a0 = false;
    if (z.j())
    {
      localObject = H;
      i = localObject.length;
      while (j < i)
      {
        localObject[j].r();
        j++;
      }
      z.f();
    }
    else
    {
      z.g();
      localObject = H;
      int k = localObject.length;
      for (j = i; j < k; j++) {
        localObject[j].W();
      }
    }
    return paramLong;
  }
  
  public void u(v.a parama, long paramLong)
  {
    F = parama;
    B.e();
    k0();
  }
  
  public class a
    extends D
  {
    public a(F0.M paramM)
    {
      super();
    }
    
    public long l()
    {
      return K.F(K.this);
    }
  }
  
  public final class b
    implements n.e, q.a
  {
    public final long a;
    public final Uri b;
    public final i0.x c;
    public final F d;
    public final t e;
    public final f f;
    public final L g;
    public volatile boolean h;
    public boolean i;
    public long j;
    public k k;
    public T l;
    public boolean m;
    
    public b(Uri paramUri, g paramg, F paramF, t paramt, f paramf)
    {
      b = paramUri;
      c = new i0.x(paramg);
      d = paramF;
      e = paramt;
      f = paramf;
      g = new L();
      i = true;
      a = r.a();
      k = i(0L);
    }
    
    public void a(g0.z paramz)
    {
      if (!m) {}
      for (long l1 = j;; l1 = Math.max(K.C(K.this, true), j)) {
        break;
      }
      int i1 = paramz.a();
      T localT = (T)a.e(l);
      localT.e(paramz, i1);
      localT.b(l1, 1, i1, 0, null);
      m = true;
    }
    
    public void b()
    {
      int i1 = 0;
      while ((i1 == 0) && (!h))
      {
        int i2 = i1;
        long l1;
        boolean bool;
        try
        {
          l1 = g.a;
          i2 = i1;
          k localk = i(l1);
          i2 = i1;
          k = localk;
          i2 = i1;
          l2 = c.e(localk);
          i2 = i1;
          bool = h;
          if (bool)
          {
            if ((i1 != 1) && (d.d() != -1L)) {
              g.a = d.d();
            }
            j.a(c);
            break;
          }
          l3 = l2;
          if (l2 != -1L)
          {
            l3 = l2 + l1;
            i2 = i1;
            K.G(K.this);
          }
        }
        finally
        {
          break label604;
        }
        i2 = i1;
        K.I(K.this, S0.b.a(c.g()));
        i2 = i1;
        Object localObject3 = c;
        i2 = i1;
        Object localObject2 = localObject3;
        if (K.H(K.this) != null)
        {
          i2 = i1;
          localObject2 = localObject3;
          if (Ht != -1)
          {
            i2 = i1;
            localObject2 = new x0/q;
            i2 = i1;
            ((q)localObject2).<init>(c, Ht, this);
            i2 = i1;
            localObject3 = P();
            i2 = i1;
            l = ((T)localObject3);
            i2 = i1;
            ((T)localObject3).d(K.J());
          }
        }
        i2 = i1;
        F localF = d;
        i2 = i1;
        Uri localUri = b;
        i2 = i1;
        Map localMap = c.g();
        i2 = i1;
        localObject3 = e;
        long l2 = l1;
        i2 = i1;
        localF.b((d0.i)localObject2, localUri, localMap, l1, l3, (t)localObject3);
        i2 = i1;
        if (K.H(K.this) != null)
        {
          i2 = i1;
          d.e();
        }
        i2 = i1;
        int i3 = i1;
        long l3 = l2;
        if (i)
        {
          i2 = i1;
          d.a(l2, j);
          i2 = i1;
          i = false;
          l3 = l2;
          i3 = i1;
        }
        label407:
        InterruptedIOException localInterruptedIOException;
        for (;;)
        {
          i1 = i3;
          if (i1 == 0)
          {
            i2 = i1;
            bool = h;
            if (!bool)
            {
              i2 = i1;
              try
              {
                f.a();
                i2 = i1;
                i3 = d.c(g);
                i2 = i3;
                l2 = d.d();
                i2 = i3;
                i1 = i3;
                if (l2 <= K.z(K.this) + l3) {
                  break label407;
                }
                i2 = i3;
                f.c();
                i2 = i3;
                K.B(K.this).post(K.A(K.this));
                l3 = l2;
              }
              catch (InterruptedException localInterruptedException)
              {
                i2 = i1;
                localInterruptedIOException = new java/io/InterruptedIOException;
                i2 = i1;
                localInterruptedIOException.<init>();
                i2 = i1;
                throw localInterruptedIOException;
              }
            }
          }
        }
        if (i1 == 1)
        {
          i2 = 0;
        }
        else
        {
          i2 = i1;
          if (d.d() != -1L)
          {
            g.a = d.d();
            i2 = i1;
          }
        }
        j.a(c);
        i1 = i2;
        continue;
        label604:
        if ((i2 != 1) && (d.d() != -1L)) {
          g.a = d.d();
        }
        j.a(c);
        throw localInterruptedIOException;
      }
    }
    
    public void c()
    {
      h = true;
    }
    
    public final k i(long paramLong)
    {
      return new k.b().i(b).h(paramLong).f(K.E(K.this)).b(6).e(K.D()).a();
    }
    
    public final void j(long paramLong1, long paramLong2)
    {
      g.a = paramLong1;
      j = paramLong2;
      i = true;
      m = false;
    }
  }
  
  public static abstract interface c
  {
    public abstract void q(long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  }
  
  public final class d
    implements Q
  {
    public final int o;
    
    public d(int paramInt)
    {
      o = paramInt;
    }
    
    public void a()
    {
      Z(o);
    }
    
    public boolean e()
    {
      return R(o);
    }
    
    public int j(v0 paramv0, j0.i parami, int paramInt)
    {
      return f0(o, paramv0, parami, paramInt);
    }
    
    public int m(long paramLong)
    {
      return j0(o, paramLong);
    }
  }
  
  public static final class e
  {
    public final int a;
    public final boolean b;
    
    public e(int paramInt, boolean paramBoolean)
    {
      a = paramInt;
      b = paramBoolean;
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
        if ((a != a) || (b != b)) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public int hashCode()
    {
      return a * 31 + b;
    }
  }
  
  public static final class f
  {
    public final Z a;
    public final boolean[] b;
    public final boolean[] c;
    public final boolean[] d;
    
    public f(Z paramZ, boolean[] paramArrayOfBoolean)
    {
      a = paramZ;
      b = paramArrayOfBoolean;
      int i = a;
      c = new boolean[i];
      d = new boolean[i];
    }
  }
}

/* Location:
 * Qualified Name:     x0.K
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */