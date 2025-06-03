package q0;

import A0.C;
import A0.y;
import B0.m.b;
import B0.m.c;
import B0.n.b;
import B0.n.c;
import B0.n.f;
import F0.T;
import F0.T.a;
import X2.v;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import d0.A;
import d0.J;
import d0.q.b;
import d0.x.b;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k0.d1;
import k0.v0;
import k0.y0;
import k0.y0.b;
import x0.E.a;
import x0.P;
import x0.P.d;
import x0.Q;
import x0.S;
import x0.S.a;
import x0.Z;
import x0.u;
import y0.e;

public final class s
  implements n.b, n.f, S, F0.t, P.d
{
  public static final Set m0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[] { Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(5) })));
  public final f.b A;
  public final ArrayList B;
  public final List C;
  public final Runnable D;
  public final Runnable E;
  public final Handler F;
  public final ArrayList G;
  public final Map H;
  public e I;
  public d[] J;
  public int[] K;
  public Set L;
  public SparseIntArray M;
  public T N;
  public int O;
  public int P;
  public boolean Q;
  public boolean R;
  public int S;
  public d0.q T;
  public d0.q U;
  public boolean V;
  public Z W;
  public Set X;
  public int[] Y;
  public int Z;
  public boolean a0;
  public boolean[] b0;
  public boolean[] c0;
  public long d0;
  public long e0;
  public boolean f0;
  public boolean g0;
  public boolean h0;
  public boolean i0;
  public long j0;
  public d0.m k0;
  public j l0;
  public final String o;
  public final int p;
  public final b q;
  public final f r;
  public final B0.b s;
  public final d0.q t;
  public final p0.x u;
  public final p0.v.a v;
  public final B0.m w;
  public final B0.n x;
  public final E.a y;
  public final int z;
  
  public s(String paramString, int paramInt1, b paramb, f paramf, Map paramMap, B0.b paramb1, long paramLong, d0.q paramq, p0.x paramx, p0.v.a parama, B0.m paramm, E.a parama1, int paramInt2)
  {
    o = paramString;
    p = paramInt1;
    q = paramb;
    r = paramf;
    H = paramMap;
    s = paramb1;
    t = paramq;
    u = paramx;
    v = parama;
    w = paramm;
    y = parama1;
    z = paramInt2;
    x = new B0.n("Loader:HlsSampleStreamWrapper");
    A = new f.b();
    K = new int[0];
    paramString = m0;
    L = new HashSet(paramString.size());
    M = new SparseIntArray(paramString.size());
    J = new d[0];
    c0 = new boolean[0];
    b0 = new boolean[0];
    paramString = new ArrayList();
    B = paramString;
    C = Collections.unmodifiableList(paramString);
    G = new ArrayList();
    D = new o(this);
    E = new p(this);
    F = g0.M.A();
    d0 = paramLong;
    e0 = paramLong;
  }
  
  public static F0.n D(int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Unmapped track with id ");
    localStringBuilder.append(paramInt1);
    localStringBuilder.append(" of type ");
    localStringBuilder.append(paramInt2);
    g0.o.h("HlsSampleStreamWrapper", localStringBuilder.toString());
    return new F0.n();
  }
  
  public static d0.q G(d0.q paramq1, d0.q paramq2, boolean paramBoolean)
  {
    if (paramq1 == null) {
      return paramq2;
    }
    int i = d0.z.k(n);
    if (g0.M.P(paramq1.j, i) == 1)
    {
      localObject1 = g0.M.Q(paramq1.j, i);
      localObject2 = d0.z.g((String)localObject1);
    }
    else
    {
      localObject1 = d0.z.d(paramq1.j, n);
      localObject2 = n;
    }
    q.b localb = paramq2.a().a0(a).c0(b).d0(c).e0(d).q0(e).m0(f);
    if (paramBoolean) {
      j = g;
    } else {
      j = -1;
    }
    localb = localb.M(j);
    if (paramBoolean) {
      j = h;
    } else {
      j = -1;
    }
    Object localObject1 = localb.j0(j).O((String)localObject1);
    if (i == 2) {
      ((q.b)localObject1).v0(t).Y(u).X(v);
    }
    if (localObject2 != null) {
      ((q.b)localObject1).o0((String)localObject2);
    }
    int j = B;
    if ((j != -1) && (i == 1)) {
      ((q.b)localObject1).N(j);
    }
    Object localObject2 = k;
    if (localObject2 != null)
    {
      paramq2 = k;
      paramq1 = (d0.q)localObject2;
      if (paramq2 != null) {
        paramq1 = paramq2.b((d0.x)localObject2);
      }
      ((q.b)localObject1).h0(paramq1);
    }
    return ((q.b)localObject1).K();
  }
  
  public static boolean K(d0.q paramq1, d0.q paramq2)
  {
    String str1 = n;
    String str2 = n;
    int i = d0.z.k(str1);
    boolean bool1 = false;
    boolean bool2 = false;
    if (i != 3)
    {
      if (i == d0.z.k(str2)) {
        bool2 = true;
      }
      return bool2;
    }
    if (!g0.M.c(str1, str2)) {
      return false;
    }
    if ((!"application/cea-608".equals(str1)) && (!"application/cea-708".equals(str1))) {
      return true;
    }
    bool2 = bool1;
    if (G == G) {
      bool2 = true;
    }
    return bool2;
  }
  
  public static int N(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt != 3) {
          return 0;
        }
        return 1;
      }
      return 3;
    }
    return 2;
  }
  
  public static boolean P(e parame)
  {
    return parame instanceof j;
  }
  
  private boolean Q()
  {
    boolean bool;
    if (e0 != -9223372036854775807L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void A()
  {
    boolean bool = true;
    int i = J.length;
    int j = -2;
    int k = -1;
    int m = 0;
    Object localObject1;
    for (;;)
    {
      n = 2;
      if (m >= i) {
        break;
      }
      localObject1 = hJ[m].G())).n;
      if (!d0.z.s((String)localObject1)) {
        if (d0.z.o((String)localObject1)) {
          n = 1;
        } else if (d0.z.r((String)localObject1)) {
          n = 3;
        } else {
          n = -2;
        }
      }
      int i2;
      if (N(n) > N(j))
      {
        i1 = m;
        i2 = n;
      }
      else
      {
        i2 = j;
        i1 = k;
        if (n == j)
        {
          i2 = j;
          i1 = k;
          if (k != -1)
          {
            i1 = -1;
            i2 = j;
          }
        }
      }
      m++;
      j = i2;
      k = i1;
    }
    J localJ = r.k();
    int i1 = a;
    Z = -1;
    Y = new int[i];
    for (int n = 0; n < i; n++) {
      Y[n] = n;
    }
    J[] arrayOfJ = new J[i];
    for (n = 0; n < i; n++)
    {
      d0.q localq1 = (d0.q)g0.a.h(J[n].G());
      Object localObject2;
      if (n == k)
      {
        d0.q[] arrayOfq = new d0.q[i1];
        for (m = 0; m < i1; m++)
        {
          localObject2 = localJ.a(m);
          localObject1 = localObject2;
          if (j == 1)
          {
            d0.q localq2 = t;
            localObject1 = localObject2;
            if (localq2 != null) {
              localObject1 = ((d0.q)localObject2).h(localq2);
            }
          }
          if (i1 == 1) {
            localObject1 = localq1.h((d0.q)localObject1);
          } else {
            localObject1 = G((d0.q)localObject1, localq1, true);
          }
          arrayOfq[m] = localObject1;
        }
        arrayOfJ[n] = new J(o, arrayOfq);
        Z = n;
      }
      else
      {
        if ((j == 2) && (d0.z.o(n))) {
          localObject1 = t;
        } else {
          localObject1 = null;
        }
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append(o);
        ((StringBuilder)localObject2).append(":muxed:");
        if (n < k) {
          m = n;
        } else {
          m = n - 1;
        }
        ((StringBuilder)localObject2).append(m);
        arrayOfJ[n] = new J(((StringBuilder)localObject2).toString(), new d0.q[] { G((d0.q)localObject1, localq1, false) });
      }
    }
    W = F(arrayOfJ);
    if (X != null) {
      bool = false;
    }
    g0.a.f(bool);
    X = Collections.emptySet();
  }
  
  public final boolean B(int paramInt)
  {
    for (int i = paramInt; i < B.size(); i++) {
      if (B.get(i)).n) {
        return false;
      }
    }
    j localj = (j)B.get(paramInt);
    for (paramInt = 0; paramInt < J.length; paramInt++)
    {
      i = localj.m(paramInt);
      if (J[paramInt].D() > i) {
        return false;
      }
    }
    return true;
  }
  
  public void C()
  {
    if (!R) {
      g(new y0.b().f(d0).d());
    }
  }
  
  public final P E(int paramInt1, int paramInt2)
  {
    int i = J.length;
    int j = 1;
    int k = j;
    if (paramInt2 != 1) {
      if (paramInt2 == 2) {
        k = j;
      } else {
        k = 0;
      }
    }
    d locald = new d(s, u, v, H, null);
    locald.c0(d0);
    if (k != 0) {
      locald.j0(k0);
    }
    locald.b0(j0);
    Object localObject = l0;
    if (localObject != null) {
      locald.k0((j)localObject);
    }
    locald.e0(this);
    localObject = K;
    int m = i + 1;
    localObject = Arrays.copyOf((int[])localObject, m);
    K = ((int[])localObject);
    localObject[i] = paramInt1;
    J = ((d[])g0.M.M0(J, locald));
    localObject = Arrays.copyOf(c0, m);
    c0 = ((boolean[])localObject);
    localObject[i] = k;
    a0 |= k;
    L.add(Integer.valueOf(paramInt2));
    M.append(paramInt2, i);
    if (N(paramInt2) > N(O))
    {
      P = i;
      O = paramInt2;
    }
    b0 = Arrays.copyOf(b0, m);
    return locald;
  }
  
  public final Z F(J[] paramArrayOfJ)
  {
    for (int i = 0; i < paramArrayOfJ.length; i++)
    {
      J localJ = paramArrayOfJ[i];
      d0.q[] arrayOfq = new d0.q[a];
      for (int j = 0; j < a; j++)
      {
        d0.q localq = localJ.a(j);
        arrayOfq[j] = localq.b(u.b(localq));
      }
      paramArrayOfJ[i] = new J(b, arrayOfq);
    }
    return new Z(paramArrayOfJ);
  }
  
  public final void H(int paramInt)
  {
    g0.a.f(x.j() ^ true);
    while (paramInt < B.size())
    {
      if (B(paramInt)) {
        break label42;
      }
      paramInt++;
    }
    paramInt = -1;
    label42:
    if (paramInt == -1) {
      return;
    }
    long l = Lh;
    j localj = I(paramInt);
    if (B.isEmpty()) {
      e0 = d0;
    } else {
      ((j)X2.B.d(B)).o();
    }
    h0 = false;
    y.C(O, g, l);
  }
  
  public final j I(int paramInt)
  {
    j localj = (j)B.get(paramInt);
    ArrayList localArrayList = B;
    g0.M.U0(localArrayList, paramInt, localArrayList.size());
    for (paramInt = 0; paramInt < J.length; paramInt++)
    {
      int i = localj.m(paramInt);
      J[paramInt].u(i);
    }
    return localj;
  }
  
  public final boolean J(j paramj)
  {
    int i = k;
    int j = J.length;
    for (int k = 0; k < j; k++) {
      if ((b0[k] != 0) && (J[k].R() == i)) {
        return false;
      }
    }
    return true;
  }
  
  public final j L()
  {
    ArrayList localArrayList = B;
    return (j)localArrayList.get(localArrayList.size() - 1);
  }
  
  public final T M(int paramInt1, int paramInt2)
  {
    g0.a.a(m0.contains(Integer.valueOf(paramInt2)));
    int i = M.get(paramInt2, -1);
    if (i == -1) {
      return null;
    }
    if (L.add(Integer.valueOf(paramInt2))) {
      K[i] = paramInt1;
    }
    Object localObject;
    if (K[i] == paramInt1) {
      localObject = J[i];
    } else {
      localObject = D(paramInt1, paramInt2);
    }
    return (T)localObject;
  }
  
  public final void O(j paramj)
  {
    l0 = paramj;
    T = d;
    e0 = -9223372036854775807L;
    B.add(paramj);
    Object localObject = v.M();
    d[] arrayOfd = J;
    int i = arrayOfd.length;
    int j = 0;
    for (int k = 0; k < i; k++) {
      ((X2.v.a)localObject).h(Integer.valueOf(arrayOfd[k].H()));
    }
    paramj.n(this, ((X2.v.a)localObject).k());
    localObject = J;
    i = localObject.length;
    for (k = j; k < i; k++)
    {
      arrayOfd = localObject[k];
      arrayOfd.k0(paramj);
      if (n) {
        arrayOfd.h0();
      }
    }
  }
  
  public boolean R(int paramInt)
  {
    boolean bool;
    if ((!Q()) && (J[paramInt].L(h0))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean S()
  {
    boolean bool;
    if (O == 2) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void U()
  {
    int i = W.a;
    Object localObject = new int[i];
    Y = ((int[])localObject);
    Arrays.fill((int[])localObject, -1);
    for (int j = 0; j < i; j++) {
      for (int k = 0;; k++)
      {
        localObject = J;
        if (k >= localObject.length) {
          break;
        }
        if (K((d0.q)g0.a.h(localObject[k].G()), W.b(j).a(0)))
        {
          Y[j] = k;
          break;
        }
      }
    }
    localObject = G.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((n)((Iterator)localObject).next()).b();
    }
  }
  
  public final void V()
  {
    if ((!V) && (Y == null) && (Q))
    {
      d[] arrayOfd = J;
      int i = arrayOfd.length;
      for (int j = 0; j < i; j++) {
        if (arrayOfd[j].G() == null) {
          return;
        }
      }
      if (W != null)
      {
        U();
      }
      else
      {
        A();
        n0();
        q.o();
      }
    }
  }
  
  public void W()
  {
    x.a();
    r.p();
  }
  
  public void X(int paramInt)
  {
    W();
    J[paramInt].O();
  }
  
  public void Y(e parame, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    I = null;
    x0.r localr = new x0.r(a, b, parame.f(), parame.e(), paramLong1, paramLong2, parame.a());
    w.a(a);
    y.q(localr, c, p, d, e, f, g, h);
    if (!paramBoolean)
    {
      if ((Q()) || (S == 0)) {
        i0();
      }
      if (S > 0) {
        q.e(this);
      }
    }
  }
  
  public void Z(e parame, long paramLong1, long paramLong2)
  {
    I = null;
    r.r(parame);
    x0.r localr = new x0.r(a, b, parame.f(), parame.e(), paramLong1, paramLong2, parame.a());
    w.a(a);
    y.t(localr, c, p, d, e, f, g, h);
    if (!R) {
      g(new y0.b().f(d0).d());
    } else {
      q.e(this);
    }
  }
  
  public T a(int paramInt1, int paramInt2)
  {
    Object localObject1;
    if (m0.contains(Integer.valueOf(paramInt2)))
    {
      localObject1 = M(paramInt1, paramInt2);
    }
    else
    {
      for (int i = 0;; i++)
      {
        localObject1 = J;
        if (i >= localObject1.length) {
          break;
        }
        if (K[i] == paramInt1)
        {
          localObject1 = localObject1[i];
          break label67;
        }
      }
      localObject1 = null;
    }
    label67:
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      if (i0) {
        return D(paramInt1, paramInt2);
      }
      localObject2 = E(paramInt1, paramInt2);
    }
    if (paramInt2 == 5)
    {
      if (N == null) {
        N = new c((T)localObject2, z);
      }
      return N;
    }
    return (T)localObject2;
  }
  
  public n.c a0(e parame, long paramLong1, long paramLong2, IOException paramIOException, int paramInt)
  {
    boolean bool1 = P(parame);
    if ((bool1) && (!((j)parame).q()) && ((paramIOException instanceof i0.t)))
    {
      int i = r;
      if ((i == 410) || (i == 404)) {
        return B0.n.d;
      }
    }
    long l = parame.a();
    x0.r localr = new x0.r(a, b, parame.f(), parame.e(), paramLong1, paramLong2, l);
    Object localObject = new m.c(localr, new u(c, p, d, e, f, g0.M.i1(g), g0.M.i1(h)), paramIOException, paramInt);
    m.b localb = w.b(C.c(r.l()), (m.c)localObject);
    boolean bool2 = false;
    boolean bool3;
    if ((localb != null) && (a == 2)) {
      bool3 = r.o(parame, b);
    } else {
      bool3 = false;
    }
    if (bool3)
    {
      if ((bool1) && (l == 0L))
      {
        localObject = B;
        if ((j)((ArrayList)localObject).remove(((ArrayList)localObject).size() - 1) == parame) {
          bool2 = true;
        }
        g0.a.f(bool2);
        if (B.isEmpty()) {
          e0 = d0;
        } else {
          ((j)X2.B.d(B)).o();
        }
      }
      localObject = B0.n.f;
    }
    for (;;)
    {
      break;
      paramLong1 = w.c((m.c)localObject);
      if (paramLong1 != -9223372036854775807L) {
        localObject = B0.n.h(false, paramLong1);
      } else {
        localObject = B0.n.g;
      }
    }
    bool2 = ((n.c)localObject).c() ^ true;
    y.v(localr, c, p, d, e, f, g, h, paramIOException, bool2);
    if (bool2)
    {
      I = null;
      w.a(a);
    }
    if (bool3) {
      if (!R) {
        g(new y0.b().f(d0).d());
      } else {
        q.e(this);
      }
    }
    return (n.c)localObject;
  }
  
  public boolean b()
  {
    return x.j();
  }
  
  public void b0()
  {
    L.clear();
  }
  
  public long c()
  {
    if (Q()) {
      return e0;
    }
    long l;
    if (h0) {
      l = Long.MIN_VALUE;
    } else {
      l = Lh;
    }
    return l;
  }
  
  public boolean c0(Uri paramUri, m.c paramc, boolean paramBoolean)
  {
    boolean bool1 = r.q(paramUri);
    boolean bool2 = true;
    if (!bool1) {
      return true;
    }
    if (!paramBoolean)
    {
      paramc = w.b(C.c(r.l()), paramc);
      if ((paramc != null) && (a == 2))
      {
        l = b;
        break label71;
      }
    }
    long l = -9223372036854775807L;
    label71:
    if ((r.s(paramUri, l)) && (l != -9223372036854775807L)) {
      paramBoolean = bool2;
    } else {
      paramBoolean = false;
    }
    return paramBoolean;
  }
  
  public long d(long paramLong, d1 paramd1)
  {
    return r.c(paramLong, paramd1);
  }
  
  public void d0()
  {
    if (B.isEmpty()) {
      return;
    }
    j localj = (j)X2.B.d(B);
    int i = r.d(localj);
    if (i == 1) {
      localj.v();
    } else if (i == 0) {
      F.post(new r(this, localj));
    } else if ((i == 2) && (!h0) && (x.j())) {
      x.f();
    }
  }
  
  public void e(F0.M paramM) {}
  
  public final void e0()
  {
    Q = true;
    V();
  }
  
  public long f()
  {
    if (h0) {
      return Long.MIN_VALUE;
    }
    if (Q()) {
      return e0;
    }
    long l1 = d0;
    Object localObject = L();
    if (!((j)localObject).h()) {
      if (B.size() > 1)
      {
        localObject = B;
        localObject = (j)((ArrayList)localObject).get(((ArrayList)localObject).size() - 2);
      }
      else
      {
        localObject = null;
      }
    }
    long l2 = l1;
    if (localObject != null) {
      l2 = Math.max(l1, h);
    }
    l1 = l2;
    if (Q)
    {
      localObject = J;
      int i = localObject.length;
      for (int j = 0;; j++)
      {
        l1 = l2;
        if (j >= i) {
          break;
        }
        l2 = Math.max(l2, localObject[j].A());
      }
    }
    return l1;
  }
  
  public void f0(J[] paramArrayOfJ, int paramInt, int... paramVarArgs)
  {
    W = F(paramArrayOfJ);
    X = new HashSet();
    int i = paramVarArgs.length;
    for (int j = 0; j < i; j++)
    {
      int k = paramVarArgs[j];
      X.add(W.b(k));
    }
    Z = paramInt;
    paramVarArgs = F;
    paramArrayOfJ = q;
    Objects.requireNonNull(paramArrayOfJ);
    paramVarArgs.post(new q(paramArrayOfJ));
    n0();
  }
  
  public boolean g(y0 paramy0)
  {
    if ((!h0) && (!x.j()) && (!x.i()))
    {
      if (Q())
      {
        localObject1 = Collections.emptyList();
        long l1 = e0;
        d[] arrayOfd = J;
        int i = arrayOfd.length;
        for (int j = 0;; j++)
        {
          localObject2 = localObject1;
          l2 = l1;
          if (j >= i) {
            break;
          }
          arrayOfd[j].c0(e0);
        }
      }
      for (;;)
      {
        break;
        localObject2 = C;
        localObject1 = L();
        if (((j)localObject1).h()) {
          l2 = h;
        } else {
          l2 = Math.max(d0, g);
        }
      }
      A.a();
      Object localObject1 = r;
      if ((!R) && (((List)localObject2).isEmpty())) {
        bool = false;
      } else {
        bool = true;
      }
      ((f)localObject1).f(paramy0, l2, (List)localObject2, bool, A);
      Object localObject2 = A;
      boolean bool = b;
      paramy0 = a;
      localObject2 = c;
      if (bool)
      {
        e0 = -9223372036854775807L;
        h0 = true;
        return true;
      }
      if (paramy0 == null)
      {
        if (localObject2 != null) {
          q.m((Uri)localObject2);
        }
        return false;
      }
      if (P(paramy0)) {
        O((j)paramy0);
      }
      I = paramy0;
      long l2 = x.n(paramy0, this, w.d(c));
      y.z(new x0.r(a, b, l2), c, p, d, e, f, g, h);
      return true;
    }
    return false;
  }
  
  public int g0(int paramInt1, v0 paramv0, j0.i parami, int paramInt2)
  {
    if (Q()) {
      return -3;
    }
    boolean bool = B.isEmpty();
    int i = 0;
    int j;
    d0.q localq;
    if (!bool)
    {
      for (j = 0; (j < B.size() - 1) && (J((j)B.get(j))); j++) {}
      g0.M.U0(B, 0, j);
      j localj = (j)B.get(0);
      localq = d;
      if (!localq.equals(U)) {
        y.h(p, localq, e, f, g);
      }
      U = localq;
    }
    if ((!B.isEmpty()) && (!((j)B.get(0)).q())) {
      return -3;
    }
    paramInt2 = J[paramInt1].T(paramv0, parami, paramInt2, h0);
    if (paramInt2 == -5)
    {
      localq = (d0.q)g0.a.e(b);
      parami = localq;
      if (paramInt1 == P)
      {
        j = a3.f.d(J[paramInt1].R());
        for (paramInt1 = i; (paramInt1 < B.size()) && (B.get(paramInt1)).k != j); paramInt1++) {}
        if (paramInt1 < B.size()) {
          parami = B.get(paramInt1)).d;
        } else {
          parami = (d0.q)g0.a.e(T);
        }
        parami = localq.h(parami);
      }
      b = parami;
    }
    return paramInt2;
  }
  
  public void h(long paramLong)
  {
    if ((!x.i()) && (!Q()))
    {
      if (x.j())
      {
        g0.a.e(I);
        if (r.x(paramLong, I, C)) {
          x.f();
        }
        return;
      }
      for (int i = C.size(); (i > 0) && (r.d((j)C.get(i - 1)) == 2); i--) {}
      if (i < C.size()) {
        H(i);
      }
      i = r.i(paramLong, C);
      if (i < B.size()) {
        H(i);
      }
    }
  }
  
  public void h0()
  {
    if (R)
    {
      d[] arrayOfd = J;
      int i = arrayOfd.length;
      for (int j = 0; j < i; j++) {
        arrayOfd[j].S();
      }
    }
    r.t();
    x.m(this);
    F.removeCallbacksAndMessages(null);
    V = true;
    G.clear();
  }
  
  public final void i0()
  {
    d[] arrayOfd = J;
    int i = arrayOfd.length;
    for (int j = 0; j < i; j++) {
      arrayOfd[j].X(f0);
    }
    f0 = false;
  }
  
  public void j()
  {
    i0 = true;
    F.post(E);
  }
  
  public final boolean j0(long paramLong, j paramj)
  {
    int i = J.length;
    for (int j = 0; j < i; j++)
    {
      d locald = J[j];
      boolean bool;
      if (paramj != null) {
        bool = locald.Z(paramj.m(j));
      } else {
        bool = locald.a0(paramLong, false);
      }
      if ((!bool) && ((c0[j] != 0) || (!a0))) {
        return false;
      }
    }
    return true;
  }
  
  public void k()
  {
    d[] arrayOfd = J;
    int i = arrayOfd.length;
    for (int j = 0; j < i; j++) {
      arrayOfd[j].U();
    }
  }
  
  public boolean k0(long paramLong, boolean paramBoolean)
  {
    d0 = paramLong;
    if (Q())
    {
      e0 = paramLong;
      return true;
    }
    boolean bool = r.m();
    int i = 0;
    int j;
    if (bool) {
      for (j = 0; j < B.size(); j++)
      {
        localObject = (j)B.get(j);
        if (g == paramLong) {
          break label87;
        }
      }
    }
    Object localObject = null;
    label87:
    if ((Q) && (!paramBoolean) && (j0(paramLong, (j)localObject))) {
      return false;
    }
    e0 = paramLong;
    h0 = false;
    B.clear();
    if (x.j())
    {
      if (Q)
      {
        localObject = J;
        int k = localObject.length;
        for (j = i; j < k; j++) {
          localObject[j].r();
        }
      }
      x.f();
    }
    else
    {
      x.g();
      i0();
    }
    return true;
  }
  
  public boolean l0(y[] paramArrayOfy, boolean[] paramArrayOfBoolean1, Q[] paramArrayOfQ, boolean[] paramArrayOfBoolean2, long paramLong, boolean paramBoolean)
  {
    y();
    int i = S;
    int j = 0;
    int k = 0;
    Object localObject;
    for (int m = 0; m < paramArrayOfy.length; m++)
    {
      localObject = (n)paramArrayOfQ[m];
      if ((localObject != null) && ((paramArrayOfy[m] == null) || (paramArrayOfBoolean1[m] == 0)))
      {
        S -= 1;
        ((n)localObject).d();
        paramArrayOfQ[m] = null;
      }
    }
    boolean bool1;
    if ((!paramBoolean) && (g0 ? i != 0 : paramLong == d0)) {
      bool1 = false;
    } else {
      bool1 = true;
    }
    y localy = r.l();
    paramArrayOfBoolean1 = localy;
    m = 0;
    boolean bool2;
    while (m < paramArrayOfy.length)
    {
      localObject = paramArrayOfy[m];
      if (localObject == null)
      {
        localObject = paramArrayOfBoolean1;
        bool2 = bool1;
      }
      else
      {
        i = W.d(((A0.B)localObject).d());
        if (i == Z)
        {
          r.w((y)localObject);
          paramArrayOfBoolean1 = (boolean[])localObject;
        }
        localObject = paramArrayOfBoolean1;
        bool2 = bool1;
        if (paramArrayOfQ[m] == null)
        {
          S += 1;
          n localn = new n(this, i);
          paramArrayOfQ[m] = localn;
          paramArrayOfBoolean2[m] = true;
          localObject = paramArrayOfBoolean1;
          bool2 = bool1;
          if (Y != null)
          {
            localn.b();
            localObject = paramArrayOfBoolean1;
            bool2 = bool1;
            if (!bool1)
            {
              localObject = J[Y[i]];
              if ((((P)localObject).D() != 0) && (!((P)localObject).a0(paramLong, true))) {
                bool1 = true;
              } else {
                bool1 = false;
              }
              bool2 = bool1;
              localObject = paramArrayOfBoolean1;
            }
          }
        }
      }
      m++;
      paramArrayOfBoolean1 = (boolean[])localObject;
      bool1 = bool2;
    }
    if (S == 0)
    {
      r.t();
      U = null;
      f0 = true;
      B.clear();
      if (x.j())
      {
        if (Q)
        {
          paramArrayOfy = J;
          j = paramArrayOfy.length;
          for (m = k; m < j; m++) {
            paramArrayOfy[m].r();
          }
        }
        x.f();
        bool2 = bool1;
      }
      else
      {
        i0();
        bool2 = bool1;
      }
    }
    else
    {
      if ((!B.isEmpty()) && (!g0.M.c(paramArrayOfBoolean1, localy))) {
        if (!g0)
        {
          long l = 0L;
          if (paramLong < 0L) {
            l = -paramLong;
          }
          localObject = L();
          paramArrayOfy = r.a((j)localObject, paramLong);
          paramArrayOfBoolean1.v(paramLong, l, -9223372036854775807L, C, paramArrayOfy);
          m = r.k().b(d);
          if (paramArrayOfBoolean1.l() == m) {}
        }
        else
        {
          f0 = true;
          paramBoolean = true;
          bool1 = paramBoolean;
        }
      }
      bool2 = bool1;
      if (bool1)
      {
        k0(paramLong, paramBoolean);
        for (m = j;; m++)
        {
          bool2 = bool1;
          if (m >= paramArrayOfQ.length) {
            break;
          }
          if (paramArrayOfQ[m] != null) {
            paramArrayOfBoolean2[m] = true;
          }
        }
      }
    }
    s0(paramArrayOfQ);
    g0 = true;
    return bool2;
  }
  
  public void m(d0.q paramq)
  {
    F.post(D);
  }
  
  public void m0(d0.m paramm)
  {
    if (!g0.M.c(k0, paramm))
    {
      k0 = paramm;
      for (int i = 0;; i++)
      {
        d[] arrayOfd = J;
        if (i >= arrayOfd.length) {
          break;
        }
        if (c0[i] != 0) {
          arrayOfd[i].j0(paramm);
        }
      }
    }
  }
  
  public Z n()
  {
    y();
    return W;
  }
  
  public final void n0()
  {
    R = true;
  }
  
  public void o0(boolean paramBoolean)
  {
    r.v(paramBoolean);
  }
  
  public void p()
  {
    W();
    if ((h0) && (!R)) {
      throw A.a("Loading finished before preparation is complete.", null);
    }
  }
  
  public void p0(long paramLong)
  {
    if (j0 != paramLong)
    {
      j0 = paramLong;
      d[] arrayOfd = J;
      int i = arrayOfd.length;
      for (int j = 0; j < i; j++) {
        arrayOfd[j].b0(paramLong);
      }
    }
  }
  
  public void q(long paramLong, boolean paramBoolean)
  {
    if ((Q) && (!Q()))
    {
      int i = J.length;
      for (int j = 0; j < i; j++) {
        J[j].q(paramLong, paramBoolean, b0[j]);
      }
    }
  }
  
  public int q0(int paramInt, long paramLong)
  {
    if (Q()) {
      return 0;
    }
    d locald = J[paramInt];
    int i = locald.F(paramLong, h0);
    j localj = (j)X2.B.e(B, null);
    int j = i;
    if (localj != null)
    {
      j = i;
      if (!localj.q())
      {
        j = locald.D();
        j = Math.min(i, localj.m(paramInt) - j);
      }
    }
    locald.f0(j);
    return j;
  }
  
  public void r0(int paramInt)
  {
    y();
    g0.a.e(Y);
    paramInt = Y[paramInt];
    g0.a.f(b0[paramInt]);
    b0[paramInt] = false;
  }
  
  public final void s0(Q[] paramArrayOfQ)
  {
    G.clear();
    int i = paramArrayOfQ.length;
    for (int j = 0; j < i; j++)
    {
      Q localQ = paramArrayOfQ[j];
      if (localQ != null) {
        G.add((n)localQ);
      }
    }
  }
  
  public final void y()
  {
    g0.a.f(R);
    g0.a.e(W);
    g0.a.e(X);
  }
  
  public int z(int paramInt)
  {
    y();
    g0.a.e(Y);
    int i = Y[paramInt];
    int j = -2;
    if (i == -1)
    {
      if (X.contains(W.b(paramInt))) {
        j = -3;
      }
      return j;
    }
    boolean[] arrayOfBoolean = b0;
    if (arrayOfBoolean[i] != 0) {
      return -2;
    }
    arrayOfBoolean[i] = true;
    return i;
  }
  
  public static abstract interface b
    extends S.a
  {
    public abstract void m(Uri paramUri);
    
    public abstract void o();
  }
  
  public static class c
    implements T
  {
    public static final d0.q g = new q.b().o0("application/id3").K();
    public static final d0.q h = new q.b().o0("application/x-emsg").K();
    public final Q0.b a = new Q0.b();
    public final T b;
    public final d0.q c;
    public d0.q d;
    public byte[] e;
    public int f;
    
    public c(T paramT, int paramInt)
    {
      b = paramT;
      if (paramInt != 1) {
        if (paramInt != 3) {}
      }
      for (paramT = h;; paramT = g)
      {
        c = paramT;
        break;
        paramT = new StringBuilder();
        paramT.append("Unknown metadataType: ");
        paramT.append(paramInt);
        throw new IllegalArgumentException(paramT.toString());
      }
      e = new byte[0];
      f = 0;
    }
    
    public void a(g0.z paramz, int paramInt1, int paramInt2)
    {
      h(f + paramInt1);
      paramz.l(e, f, paramInt1);
      f += paramInt1;
    }
    
    public void b(long paramLong, int paramInt1, int paramInt2, int paramInt3, T.a parama)
    {
      g0.a.e(d);
      Object localObject = i(paramInt2, paramInt3);
      if (!g0.M.c(d.n, c.n))
      {
        if ("application/x-emsg".equals(d.n))
        {
          localObject = a.c((g0.z)localObject);
          if (!g((Q0.a)localObject))
          {
            g0.o.h("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", new Object[] { c.n, ((Q0.a)localObject).s() }));
            return;
          }
          localObject = new g0.z((byte[])g0.a.e(((Q0.a)localObject).M()));
        }
      }
      else
      {
        paramInt2 = ((g0.z)localObject).a();
        b.e((g0.z)localObject, paramInt2);
        b.b(paramLong, paramInt1, paramInt2, 0, parama);
        return;
      }
      parama = new StringBuilder();
      parama.append("Ignoring sample for unsupported format: ");
      parama.append(d.n);
      g0.o.h("HlsSampleStreamWrapper", parama.toString());
    }
    
    public int c(d0.i parami, int paramInt1, boolean paramBoolean, int paramInt2)
    {
      h(f + paramInt1);
      paramInt1 = parami.read(e, f, paramInt1);
      if (paramInt1 == -1)
      {
        if (paramBoolean) {
          return -1;
        }
        throw new EOFException();
      }
      f += paramInt1;
      return paramInt1;
    }
    
    public void d(d0.q paramq)
    {
      d = paramq;
      b.d(c);
    }
    
    public final boolean g(Q0.a parama)
    {
      parama = parama.s();
      boolean bool;
      if ((parama != null) && (g0.M.c(c.n, n))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final void h(int paramInt)
    {
      byte[] arrayOfByte = e;
      if (arrayOfByte.length < paramInt) {
        e = Arrays.copyOf(arrayOfByte, paramInt + paramInt / 2);
      }
    }
    
    public final g0.z i(int paramInt1, int paramInt2)
    {
      int i = f - paramInt2;
      g0.z localz = new g0.z(Arrays.copyOfRange(e, i - paramInt1, i));
      byte[] arrayOfByte = e;
      System.arraycopy(arrayOfByte, i, arrayOfByte, 0, paramInt2);
      f = paramInt2;
      return localz;
    }
  }
  
  public static final class d
    extends P
  {
    public final Map H;
    public d0.m I;
    
    public d(B0.b paramb, p0.x paramx, p0.v.a parama, Map paramMap)
    {
      super(paramx, parama);
      H = paramMap;
    }
    
    public void b(long paramLong, int paramInt1, int paramInt2, int paramInt3, T.a parama)
    {
      super.b(paramLong, paramInt1, paramInt2, paramInt3, parama);
    }
    
    public final d0.x i0(d0.x paramx)
    {
      if (paramx == null) {
        return null;
      }
      int i = paramx.e();
      int j = 0;
      for (int k = 0; k < i; k++)
      {
        localObject = paramx.d(k);
        if (((localObject instanceof T0.m)) && ("com.apple.streaming.transportStreamTimestamp".equals(p)))
        {
          m = k;
          break label70;
        }
      }
      int m = -1;
      label70:
      if (m == -1) {
        return paramx;
      }
      if (i == 1) {
        return null;
      }
      Object localObject = new x.b[i - 1];
      for (k = j; k < i; k++) {
        if (k != m)
        {
          if (k < m) {
            j = k;
          } else {
            j = k - 1;
          }
          localObject[j] = paramx.d(k);
        }
      }
      return new d0.x((x.b[])localObject);
    }
    
    public void j0(d0.m paramm)
    {
      I = paramm;
      J();
    }
    
    public void k0(j paramj)
    {
      g0(k);
    }
    
    public d0.q x(d0.q paramq)
    {
      Object localObject1 = I;
      if (localObject1 == null) {
        localObject1 = r;
      }
      Object localObject2 = localObject1;
      if (localObject1 != null)
      {
        localObject3 = (d0.m)H.get(q);
        localObject2 = localObject1;
        if (localObject3 != null) {
          localObject2 = localObject3;
        }
      }
      Object localObject3 = i0(k);
      if (localObject2 == r)
      {
        localObject1 = paramq;
        if (localObject3 == k) {}
      }
      else
      {
        localObject1 = paramq.a().U((d0.m)localObject2).h0((d0.x)localObject3).K();
      }
      return super.x((d0.q)localObject1);
    }
  }
}

/* Location:
 * Qualified Name:     q0.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */