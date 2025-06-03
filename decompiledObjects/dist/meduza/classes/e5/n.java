package e5;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import c4.v;
import c4.v.a;
import java.io.EOFException;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o7.t.a;
import p2.m0;
import p4.a.b;
import t5.c0;
import t5.c0.a;
import t5.c0.b;
import t5.c0.c;
import t5.d0.b;
import t5.d0.d;
import t5.d0.e;
import t5.z;
import v3.i0.a;
import v5.e0;
import v5.p;
import z4.b0;
import z4.b0.c;
import z4.q;
import z4.w.a;

public final class n
  implements t5.d0.a<b5.e>, d0.e, z4.d0, c4.j, b0.c
{
  public static final Set<Integer> g0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[] { Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(5) })));
  public final ArrayList<m> A;
  public final Map<String, a4.d> B;
  public b5.e C;
  public c[] D;
  public int[] E;
  public HashSet F;
  public SparseIntArray G;
  public b H;
  public int I;
  public int J;
  public boolean K;
  public boolean L;
  public int M;
  public v3.i0 N;
  public v3.i0 O;
  public boolean P;
  public z4.j0 Q;
  public Set<z4.i0> R;
  public int[] S;
  public int T;
  public boolean U;
  public boolean[] V;
  public boolean[] W;
  public long X;
  public long Y;
  public boolean Z;
  public final String a;
  public boolean a0;
  public final int b;
  public boolean b0;
  public final a c;
  public boolean c0;
  public final g d;
  public long d0;
  public final t5.b e;
  public a4.d e0;
  public final v3.i0 f;
  public j f0;
  public final a4.h o;
  public final a4.g.a p;
  public final c0 q;
  public final t5.d0 r;
  public final w.a s;
  public final int t;
  public final g.b u;
  public final ArrayList<j> v;
  public final List<j> w;
  public final u.a x;
  public final b.d y;
  public final Handler z;
  
  public n(String paramString, int paramInt1, l.a parama, g paramg, Map paramMap, t5.b paramb, long paramLong, v3.i0 parami0, a4.h paramh, a4.g.a parama1, c0 paramc0, w.a parama2, int paramInt2)
  {
    a = paramString;
    b = paramInt1;
    c = parama;
    d = paramg;
    B = paramMap;
    e = paramb;
    f = parami0;
    o = paramh;
    p = parama1;
    q = paramc0;
    s = parama2;
    t = paramInt2;
    r = new t5.d0("Loader:HlsSampleStreamWrapper");
    u = new g.b();
    E = new int[0];
    paramString = g0;
    F = new HashSet(paramString.size());
    G = new SparseIntArray(paramString.size());
    D = new c[0];
    W = new boolean[0];
    V = new boolean[0];
    paramString = new ArrayList();
    v = paramString;
    w = Collections.unmodifiableList(paramString);
    A = new ArrayList();
    x = new u.a(this, 11);
    y = new b.d(this, 11);
    z = e0.l(null);
    X = paramLong;
    Y = paramLong;
  }
  
  public static int A(int paramInt)
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
  
  public static c4.g v(int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Unmapped track with id ");
    localStringBuilder.append(paramInt1);
    localStringBuilder.append(" of type ");
    localStringBuilder.append(paramInt2);
    v5.m.f("HlsSampleStreamWrapper", localStringBuilder.toString());
    return new c4.g();
  }
  
  public static v3.i0 x(v3.i0 parami01, v3.i0 parami02, boolean paramBoolean)
  {
    if (parami01 == null) {
      return parami02;
    }
    int i = p.i(t);
    String str;
    if (e0.p(i, q) == 1)
    {
      str = e0.q(i, q);
      localObject = p.e(str);
    }
    else
    {
      str = p.c(q, t);
      localObject = t;
    }
    i0.a locala = new i0.a(parami02);
    a = a;
    b = b;
    c = c;
    d = d;
    e = e;
    if (paramBoolean) {
      j = f;
    } else {
      j = -1;
    }
    f = j;
    if (paramBoolean) {
      j = o;
    } else {
      j = -1;
    }
    g = j;
    h = str;
    if (i == 2)
    {
      p = y;
      q = z;
      r = A;
    }
    if (localObject != null) {
      k = ((String)localObject);
    }
    int j = G;
    if ((j != -1) && (i == 1)) {
      x = j;
    }
    Object localObject = r;
    if (localObject != null)
    {
      parami02 = r;
      parami01 = (v3.i0)localObject;
      if (parami02 != null)
      {
        parami01 = a;
        if (parami01.length == 0)
        {
          parami01 = parami02;
        }
        else
        {
          long l = b;
          localObject = a;
          parami02 = Arrays.copyOf((Object[])localObject, localObject.length + parami01.length);
          System.arraycopy(parami01, 0, parami02, localObject.length, parami01.length);
          parami01 = new p4.a(l, (a.b[])parami02);
        }
      }
      i = parami01;
    }
    return new v3.i0(locala);
  }
  
  public final boolean B()
  {
    boolean bool;
    if (Y != -9223372036854775807L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void C()
  {
    if ((!P) && (S == null) && (K))
    {
      Object localObject1 = D;
      int i = localObject1.length;
      boolean bool = false;
      for (int j = 0; j < i; j++) {
        if (localObject1[j].p() == null) {
          return;
        }
      }
      localObject1 = Q;
      Object localObject3;
      Object localObject4;
      if (localObject1 != null)
      {
        k = a;
        localObject1 = new int[k];
        S = ((int[])localObject1);
        Arrays.fill((int[])localObject1, -1);
        for (j = 0; j < k; j++) {
          for (i = 0;; i++)
          {
            localObject1 = D;
            if (i >= localObject1.length) {
              break;
            }
            localObject2 = localObject1[i].p();
            x6.b.K(localObject2);
            localObject1 = Q.a(j).d[0];
            localObject3 = t;
            localObject4 = t;
            m = p.i((String)localObject3);
            if (m != 3 ? m != p.i((String)localObject4) : (e0.a(localObject3, localObject4)) && (((!"application/cea-608".equals(localObject3)) && (!"application/cea-708".equals(localObject3))) || (L == L))) {
              m = 1;
            } else {
              m = 0;
            }
            if (m != 0)
            {
              S[j] = i;
              break;
            }
          }
        }
        localObject1 = A.iterator();
        while (((Iterator)localObject1).hasNext()) {
          ((m)((Iterator)localObject1).next()).c();
        }
      }
      int n = D.length;
      i = 0;
      int k = -1;
      int i1 = -2;
      for (;;)
      {
        j = 2;
        if (i >= n) {
          break;
        }
        localObject1 = D[i].p();
        x6.b.K(localObject1);
        localObject1 = t;
        if (!p.m((String)localObject1)) {
          if (p.k((String)localObject1)) {
            j = 1;
          } else if (p.l((String)localObject1)) {
            j = 3;
          } else {
            j = -2;
          }
        }
        int i2;
        if (A(j) > A(i1))
        {
          m = i;
          i2 = j;
        }
        else
        {
          i2 = i1;
          m = k;
          if (j == i1)
          {
            i2 = i1;
            m = k;
            if (k != -1)
            {
              m = -1;
              i2 = i1;
            }
          }
        }
        i++;
        i1 = i2;
        k = m;
      }
      Object localObject2 = d.h;
      int m = a;
      T = -1;
      S = new int[n];
      for (j = 0; j < n; j++) {
        S[j] = j;
      }
      z4.i0[] arrayOfi0 = new z4.i0[n];
      for (j = 0; j < n; j++)
      {
        localObject4 = D[j].p();
        x6.b.K(localObject4);
        if (j == k)
        {
          v3.i0[] arrayOfi01 = new v3.i0[m];
          for (i = 0; i < m; i++)
          {
            localObject3 = d[i];
            localObject1 = localObject3;
            if (i1 == 1)
            {
              v3.i0 locali0 = f;
              localObject1 = localObject3;
              if (locali0 != null) {
                localObject1 = ((v3.i0)localObject3).d(locali0);
              }
            }
            if (m == 1) {
              localObject1 = ((v3.i0)localObject4).d((v3.i0)localObject1);
            } else {
              localObject1 = x((v3.i0)localObject1, (v3.i0)localObject4, true);
            }
            arrayOfi01[i] = localObject1;
          }
          arrayOfi0[j] = new z4.i0(a, arrayOfi01);
          T = j;
        }
        else
        {
          if ((i1 == 2) && (p.k(t))) {
            localObject1 = f;
          } else {
            localObject1 = null;
          }
          localObject3 = new StringBuilder();
          ((StringBuilder)localObject3).append(a);
          ((StringBuilder)localObject3).append(":muxed:");
          if (j < k) {
            i = j;
          } else {
            i = j - 1;
          }
          ((StringBuilder)localObject3).append(i);
          arrayOfi0[j] = new z4.i0(((StringBuilder)localObject3).toString(), new v3.i0[] { x((v3.i0)localObject1, (v3.i0)localObject4, false) });
        }
      }
      Q = w(arrayOfi0);
      if (R == null) {
        bool = true;
      }
      x6.b.H(bool);
      R = Collections.emptySet();
      L = true;
      ((l.a)c).c();
    }
  }
  
  public final void D()
  {
    r.a();
    g localg = d;
    Object localObject = n;
    if (localObject == null)
    {
      localObject = o;
      if ((localObject != null) && (s)) {
        g.b((Uri)localObject);
      }
      return;
    }
    throw ((Throwable)localObject);
  }
  
  public final void E(z4.i0[] paramArrayOfi0, int... paramVarArgs)
  {
    Q = w(paramArrayOfi0);
    R = new HashSet();
    int i = paramVarArgs.length;
    for (int j = 0; j < i; j++)
    {
      int k = paramVarArgs[j];
      R.add(Q.a(k));
    }
    T = 0;
    paramVarArgs = z;
    paramArrayOfi0 = c;
    Objects.requireNonNull(paramArrayOfi0);
    paramVarArgs.post(new b.m(paramArrayOfi0, 12));
    L = true;
  }
  
  public final void F()
  {
    c[] arrayOfc = D;
    int i = arrayOfc.length;
    for (int j = 0; j < i; j++) {
      arrayOfc[j].v(Z);
    }
    Z = false;
  }
  
  public final boolean G(long paramLong, boolean paramBoolean)
  {
    X = paramLong;
    if (B())
    {
      Y = paramLong;
      return true;
    }
    boolean bool = K;
    int i = 0;
    int j;
    int k;
    if ((bool) && (!paramBoolean))
    {
      j = D.length;
      for (k = 0; k < j; k++) {
        if ((!D[k].x(paramLong, false)) && ((W[k] != 0) || (!U)))
        {
          k = 0;
          break label101;
        }
      }
      k = 1;
      label101:
      if (k != 0) {
        return false;
      }
    }
    Y = paramLong;
    b0 = false;
    v.clear();
    if (r.d())
    {
      if (K)
      {
        c[] arrayOfc = D;
        j = arrayOfc.length;
        for (k = i; k < j; k++) {
          arrayOfc[k].h();
        }
      }
      r.b();
    }
    else
    {
      r.c = null;
      F();
    }
    return true;
  }
  
  public final void H(long paramLong)
  {
    if (d0 != paramLong)
    {
      d0 = paramLong;
      for (c localc : D) {
        if (F != paramLong)
        {
          F = paramLong;
          z = true;
        }
      }
    }
  }
  
  public final void a()
  {
    z.post(x);
  }
  
  public final void b()
  {
    x6.b.H(L);
    Q.getClass();
    R.getClass();
  }
  
  public final long c()
  {
    if (B()) {
      return Y;
    }
    long l;
    if (b0) {
      l = Long.MIN_VALUE;
    } else {
      l = zh;
    }
    return l;
  }
  
  public final boolean d(long paramLong)
  {
    boolean bool = b0;
    int i = 0;
    if ((!bool) && (!r.d()) && (!r.c()))
    {
      int j;
      long l2;
      if (B())
      {
        localObject1 = Collections.emptyList();
        long l1 = Y;
        localObject2 = D;
        j = localObject2.length;
        for (k = 0;; k++)
        {
          localObject3 = localObject1;
          l2 = l1;
          if (k >= j) {
            break;
          }
          t = Y;
        }
      }
      Object localObject3 = w;
      Object localObject1 = z();
      if (H) {
        l2 = h;
      } else {
        l2 = Math.max(X, g);
      }
      localObject1 = u;
      a = null;
      b = false;
      c = null;
      localObject1 = d;
      if ((!L) && (((List)localObject3).isEmpty())) {
        bool = false;
      } else {
        bool = true;
      }
      ((g)localObject1).c(paramLong, l2, (List)localObject3, bool, u);
      localObject1 = u;
      bool = b;
      localObject3 = a;
      localObject1 = c;
      if (bool)
      {
        Y = -9223372036854775807L;
        b0 = true;
        return true;
      }
      if (localObject3 == null)
      {
        if (localObject1 != null) {
          c).a.b.l((Uri)localObject1);
        }
        return false;
      }
      if ((localObject3 instanceof j))
      {
        localObject1 = (j)localObject3;
        f0 = ((j)localObject1);
        N = d;
        Y = -9223372036854775807L;
        v.add(localObject1);
        localObject2 = o7.t.b;
        t.a locala = new t.a();
        for (localObject2 : D) {
          locala.c(Integer.valueOf(q + p));
        }
        localObject2 = locala.e();
        D = this;
        I = ((o7.t)localObject2);
        localObject2 = D;
        j = localObject2.length;
        for (k = i; k < j; k++)
        {
          locala = localObject2[k];
          locala.getClass();
          C = k;
          if (n) {
            G = true;
          }
        }
      }
      C = ((b5.e)localObject3);
      localObject1 = r;
      Object localObject2 = q;
      int k = c;
      paramLong = ((t5.d0)localObject1).f((d0.d)localObject3, this, ((t5.u)localObject2).b(k));
      s.n(new z4.n(a, b, paramLong), c, b, d, e, f, g, h);
      return true;
    }
    return false;
  }
  
  public final void f()
  {
    for (c localc : D)
    {
      localc.v(true);
      a4.e locale = h;
      if (locale != null)
      {
        locale.f(e);
        h = null;
        g = null;
      }
    }
  }
  
  public final long g()
  {
    if (b0) {
      return Long.MIN_VALUE;
    }
    if (B()) {
      return Y;
    }
    long l1 = X;
    ??? = z();
    if (!H) {
      if (v.size() > 1)
      {
        ??? = v;
        ??? = (j)((ArrayList)???).get(((ArrayList)???).size() - 2);
      }
      else
      {
        ??? = null;
      }
    }
    long l2 = l1;
    if (??? != null) {
      l2 = Math.max(l1, h);
    }
    l1 = l2;
    if (K)
    {
      c[] arrayOfc = D;
      int i = arrayOfc.length;
      int j = 0;
      for (;;)
      {
        l1 = l2;
        if (j < i) {
          synchronized (arrayOfc[j])
          {
            l1 = v;
            l2 = Math.max(l2, l1);
            j++;
          }
        }
      }
    }
    return l1;
  }
  
  public final void h(long paramLong)
  {
    if ((!r.c()) && (!B()))
    {
      if (r.d())
      {
        C.getClass();
        localObject = d;
        if (n == null) {
          q.h();
        }
        return;
      }
      int j;
      for (int i = w.size(); i > 0; i = j)
      {
        localg = d;
        localObject = w;
        j = i - 1;
        if (localg.b((j)((List)localObject).get(j)) != 2) {
          break;
        }
      }
      if (i < w.size()) {
        y(i);
      }
      g localg = d;
      Object localObject = w;
      if ((n == null) && (q.length() >= 2)) {
        i = q.n(paramLong, (List)localObject);
      } else {
        i = ((List)localObject).size();
      }
      if (i < v.size()) {
        y(i);
      }
    }
  }
  
  public final boolean isLoading()
  {
    return r.d();
  }
  
  public final void k(d0.d paramd, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    paramd = (b5.e)paramd;
    C = null;
    paramLong1 = a;
    t5.j0 localj0 = i;
    Object localObject = c;
    localObject = new z4.n(d);
    q.getClass();
    s.e((z4.n)localObject, c, b, d, e, f, g, h);
    if (!paramBoolean)
    {
      if ((B()) || (M == 0)) {
        F();
      }
      if (M > 0) {
        ((l.a)c).a(this);
      }
    }
  }
  
  public final void m()
  {
    c0 = true;
    z.post(y);
  }
  
  public final void p(d0.d paramd, long paramLong1, long paramLong2)
  {
    paramd = (b5.e)paramd;
    C = null;
    Object localObject1 = d;
    localObject1.getClass();
    if ((paramd instanceof g.a))
    {
      localObject2 = (g.a)paramd;
      m = j;
      Object localObject3 = j;
      localObject1 = b.a;
      localObject2 = l;
      localObject2.getClass();
      localObject3 = a;
      localObject1.getClass();
      localObject1 = (byte[])((AbstractMap)localObject3).put(localObject1, localObject2);
    }
    paramLong1 = a;
    localObject1 = i;
    Object localObject2 = c;
    localObject1 = new z4.n(d);
    q.getClass();
    s.h((z4.n)localObject1, c, b, d, e, f, g, h);
    if (!L) {
      d(X);
    } else {
      ((l.a)c).a(this);
    }
  }
  
  public final v r(int paramInt1, int paramInt2)
  {
    Object localObject1 = g0;
    boolean bool = ((Set)localObject1).contains(Integer.valueOf(paramInt2));
    int i = 0;
    int j;
    if (bool)
    {
      x6.b.q(((Set)localObject1).contains(Integer.valueOf(paramInt2)));
      j = G.get(paramInt2, -1);
      if (j != -1)
      {
        if (F.add(Integer.valueOf(paramInt2))) {
          E[j] = paramInt1;
        }
        if (E[j] == paramInt1)
        {
          localObject1 = D[j];
          break label152;
        }
        localObject1 = v(paramInt1, paramInt2);
        break label152;
      }
    }
    else
    {
      for (j = 0;; j++)
      {
        localObject1 = D;
        if (j >= localObject1.length) {
          break;
        }
        if (E[j] == paramInt1)
        {
          localObject1 = localObject1[j];
          break label152;
        }
      }
    }
    localObject1 = null;
    label152:
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      if (c0) {
        return v(paramInt1, paramInt2);
      }
      j = D.length;
      if ((paramInt2 == 1) || (paramInt2 == 2)) {
        i = 1;
      }
      localObject2 = new c(e, o, p, B);
      t = X;
      if (i != 0)
      {
        I = e0;
        z = true;
      }
      long l = d0;
      if (F != l)
      {
        F = l;
        z = true;
      }
      localObject1 = f0;
      if (localObject1 != null) {
        C = k;
      }
      f = this;
      localObject1 = E;
      int k = j + 1;
      localObject1 = Arrays.copyOf((int[])localObject1, k);
      E = ((int[])localObject1);
      localObject1[j] = paramInt1;
      c[] arrayOfc = D;
      paramInt1 = e0.a;
      localObject1 = Arrays.copyOf(arrayOfc, arrayOfc.length + 1);
      localObject1[arrayOfc.length] = localObject2;
      D = ((c[])localObject1);
      localObject1 = Arrays.copyOf(W, k);
      W = ((boolean[])localObject1);
      localObject1[j] = i;
      U |= i;
      F.add(Integer.valueOf(paramInt2));
      G.append(paramInt2, j);
      if (A(paramInt2) > A(I))
      {
        J = j;
        I = paramInt2;
      }
      V = Arrays.copyOf(V, k);
    }
    if (paramInt2 == 5)
    {
      if (H == null) {
        H = new b((v)localObject2, t);
      }
      return H;
    }
    return (v)localObject2;
  }
  
  public final void t(c4.t paramt) {}
  
  public final d0.b u(d0.d paramd, long paramLong1, long paramLong2, IOException paramIOException, int paramInt)
  {
    b5.e locale = (b5.e)paramd;
    boolean bool1 = locale instanceof j;
    if ((bool1) && (!K) && ((paramIOException instanceof z)))
    {
      int i = d;
      if ((i == 410) || (i == 404)) {
        return t5.d0.d;
      }
    }
    paramLong1 = i.b;
    paramd = i;
    Object localObject1 = c;
    localObject1 = new z4.n(d);
    e0.R(g);
    e0.R(h);
    paramd = new c0.c(paramIOException, paramInt);
    Object localObject2 = q;
    Object localObject3 = r5.n.a(d.q);
    localObject2 = ((t5.u)localObject2).a((c0.a)localObject3, paramd);
    boolean bool2 = false;
    boolean bool3;
    if ((localObject2 != null) && (a == 2))
    {
      localObject3 = d;
      paramLong2 = b;
      localObject2 = q;
      bool3 = ((r5.h)localObject2).k(((r5.k)localObject2).f(h.a(d)), paramLong2);
    }
    else
    {
      bool3 = false;
    }
    if (bool3)
    {
      if ((bool1) && (paramLong1 == 0L))
      {
        paramd = v;
        if ((j)paramd.remove(paramd.size() - 1) == locale) {
          bool2 = true;
        }
        x6.b.H(bool2);
        if (v.isEmpty()) {
          Y = X;
        } else {
          Kv)).J = true;
        }
      }
      paramd = t5.d0.e;
    }
    else
    {
      paramLong1 = ((t5.u)q).c(paramd);
      if (paramLong1 != -9223372036854775807L) {
        paramd = new d0.b(0, paramLong1);
      } else {
        paramd = t5.d0.f;
      }
    }
    bool2 = paramd.a() ^ true;
    s.j((z4.n)localObject1, c, b, d, e, f, g, h, paramIOException, bool2);
    if (bool2)
    {
      C = null;
      q.getClass();
    }
    if (bool3) {
      if (!L) {
        d(X);
      } else {
        ((l.a)c).a(this);
      }
    }
    return paramd;
  }
  
  public final z4.j0 w(z4.i0[] paramArrayOfi0)
  {
    for (int i = 0; i < paramArrayOfi0.length; i++)
    {
      z4.i0 locali0 = paramArrayOfi0[i];
      v3.i0[] arrayOfi0 = new v3.i0[a];
      for (int j = 0; j < a; j++)
      {
        v3.i0 locali01 = d[j];
        arrayOfi0[j] = locali01.b(o.e(locali01));
      }
      paramArrayOfi0[i] = new z4.i0(b, arrayOfi0);
    }
    return new z4.j0(paramArrayOfi0);
  }
  
  public final void y(int paramInt)
  {
    x6.b.H(r.d() ^ true);
    int i;
    while (paramInt < v.size())
    {
      for (i = paramInt; i < v.size(); i++) {
        if (v.get(i)).n) {
          break label116;
        }
      }
      localObject1 = (j)v.get(paramInt);
      for (i = 0; i < D.length; i++)
      {
        int j = ((j)localObject1).g(i);
        localObject2 = D[i];
        if (q + s > j)
        {
          label116:
          i = 0;
          break label129;
        }
      }
      i = 1;
      label129:
      if (i != 0) {
        break label144;
      }
      paramInt++;
    }
    paramInt = -1;
    label144:
    if (paramInt == -1) {
      return;
    }
    long l = zh;
    Object localObject2 = (j)v.get(paramInt);
    Object localObject1 = v;
    e0.N(paramInt, ((ArrayList)localObject1).size(), (ArrayList)localObject1);
    for (paramInt = 0; paramInt < D.length; paramInt++)
    {
      i = ((j)localObject2).g(paramInt);
      D[paramInt].j(i);
    }
    if (v.isEmpty()) {
      Y = X;
    } else {
      Kv)).J = true;
    }
    b0 = false;
    localObject1 = s;
    ((w.a)localObject1).p(new q(1, I, null, 3, null, ((w.a)localObject1).a(g), ((w.a)localObject1).a(l)));
  }
  
  public final j z()
  {
    ArrayList localArrayList = v;
    return (j)localArrayList.get(localArrayList.size() - 1);
  }
  
  public static abstract interface a
    extends z4.d0.a<n>
  {}
  
  public static final class b
    implements v
  {
    public static final v3.i0 g;
    public static final v3.i0 h;
    public final r4.b a = new r4.b();
    public final v b;
    public final v3.i0 c;
    public v3.i0 d;
    public byte[] e;
    public int f;
    
    static
    {
      i0.a locala = new i0.a();
      k = "application/id3";
      g = locala.a();
      locala = new i0.a();
      k = "application/x-emsg";
      h = locala.a();
    }
    
    public b(v paramv, int paramInt)
    {
      b = paramv;
      if (paramInt != 1)
      {
        if (paramInt == 3) {
          paramv = h;
        } else {
          throw new IllegalArgumentException(f.h("Unknown metadataType: ", paramInt));
        }
      }
      else {
        paramv = g;
      }
      c = paramv;
      e = new byte[0];
      f = 0;
    }
    
    public final void a(int paramInt, v5.u paramu)
    {
      int i = f + paramInt;
      byte[] arrayOfByte = e;
      if (arrayOfByte.length < i) {
        e = Arrays.copyOf(arrayOfByte, i / 2 + i);
      }
      paramu.d(e, f, paramInt);
      f += paramInt;
    }
    
    public final void b(int paramInt, v5.u paramu)
    {
      a(paramInt, paramu);
    }
    
    public final void c(long paramLong, int paramInt1, int paramInt2, int paramInt3, v.a parama)
    {
      d.getClass();
      int i = f - paramInt3;
      Object localObject1 = new v5.u(Arrays.copyOfRange(e, i - paramInt2, i));
      Object localObject2 = e;
      System.arraycopy(localObject2, i, localObject2, 0, paramInt3);
      f = paramInt3;
      if (!e0.a(d.t, c.t))
      {
        if ("application/x-emsg".equals(d.t))
        {
          a.getClass();
          localObject1 = r4.b.C((v5.u)localObject1);
          localObject2 = ((r4.a)localObject1).n();
          if ((localObject2 != null) && (e0.a(c.t, t))) {
            paramInt2 = 1;
          } else {
            paramInt2 = 0;
          }
          if (paramInt2 == 0)
          {
            v5.m.f("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", new Object[] { c.t, ((r4.a)localObject1).n() }));
            return;
          }
          localObject1 = ((r4.a)localObject1).B();
          localObject1.getClass();
          localObject1 = new v5.u((byte[])localObject1);
        }
      }
      else
      {
        paramInt2 = c - b;
        b.b(paramInt2, (v5.u)localObject1);
        b.c(paramLong, paramInt1, paramInt2, paramInt3, parama);
        return;
      }
      parama = f.l("Ignoring sample for unsupported format: ");
      parama.append(d.t);
      v5.m.f("HlsSampleStreamWrapper", parama.toString());
    }
    
    public final void d(v3.i0 parami0)
    {
      d = parami0;
      b.d(c);
    }
    
    public final int e(t5.h paramh, int paramInt, boolean paramBoolean)
    {
      return f(paramh, paramInt, paramBoolean);
    }
    
    public final int f(t5.h paramh, int paramInt, boolean paramBoolean)
    {
      int i = f + paramInt;
      byte[] arrayOfByte = e;
      if (arrayOfByte.length < i) {
        e = Arrays.copyOf(arrayOfByte, i / 2 + i);
      }
      paramInt = paramh.read(e, f, paramInt);
      if (paramInt == -1)
      {
        if (paramBoolean) {
          return -1;
        }
        throw new EOFException();
      }
      f += paramInt;
      return paramInt;
    }
  }
  
  public static final class c
    extends b0
  {
    public final Map<String, a4.d> H;
    public a4.d I;
    
    public c() {}
    
    public c(t5.b paramb, a4.h paramh, a4.g.a parama, Map paramMap)
    {
      super(paramh, parama);
      H = paramMap;
    }
    
    public final void c(long paramLong, int paramInt1, int paramInt2, int paramInt3, v.a parama)
    {
      super.c(paramLong, paramInt1, paramInt2, paramInt3, parama);
    }
    
    public final v3.i0 l(v3.i0 parami0)
    {
      Object localObject1 = I;
      if (localObject1 == null) {
        localObject1 = w;
      }
      Object localObject2 = localObject1;
      if (localObject1 != null)
      {
        localObject3 = (a4.d)H.get(c);
        localObject2 = localObject1;
        if (localObject3 != null) {
          localObject2 = localObject3;
        }
      }
      localObject1 = r;
      if (localObject1 == null) {}
      int i;
      int j;
      int m;
      label134:
      do
      {
        localObject1 = null;
        break;
        i = a.length;
        j = 0;
        for (k = 0; k < i; k++)
        {
          localObject3 = a[k];
          if (((localObject3 instanceof u4.k)) && ("com.apple.streaming.transportStreamTimestamp".equals(b)))
          {
            m = k;
            break label134;
          }
        }
        m = -1;
        if (m == -1) {
          break;
        }
      } while (i == 1);
      Object localObject3 = new a.b[i - 1];
      for (int k = j; k < i; k++) {
        if (k != m)
        {
          if (k < m) {
            j = k;
          } else {
            j = k - 1;
          }
          localObject3[j] = a[k];
        }
      }
      localObject1 = new p4.a((a.b[])localObject3);
      if (localObject2 == w)
      {
        localObject3 = parami0;
        if (localObject1 == r) {}
      }
      else
      {
        parami0 = parami0.a();
        n = ((a4.d)localObject2);
        i = ((p4.a)localObject1);
        localObject3 = parami0.a();
      }
      return super.l((v3.i0)localObject3);
    }
  }
}

/* Location:
 * Qualified Name:     e5.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */