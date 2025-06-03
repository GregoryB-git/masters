package q0;

import A0.B;
import B0.b;
import B0.m.c;
import X2.E;
import android.net.Uri;
import android.text.TextUtils;
import d0.J;
import d0.q;
import d0.q.b;
import d0.z;
import g0.M;
import g0.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import k0.d1;
import k0.y0;
import l0.y1;
import r0.g.a;
import r0.g.b;
import r0.k;
import r0.k.b;
import x0.E.a;
import x0.Q;
import x0.S;
import x0.S.a;
import x0.Z;
import x0.j;

public final class m
  implements x0.v, k.b
{
  public final boolean A;
  public final int B;
  public final boolean C;
  public final y1 D;
  public final s.b E;
  public final long F;
  public x0.v.a G;
  public int H;
  public Z I;
  public s[] J;
  public s[] K;
  public int[][] L;
  public int M;
  public S N;
  public final h o;
  public final k p;
  public final g q;
  public final i0.y r;
  public final p0.x s;
  public final p0.v.a t;
  public final B0.m u;
  public final E.a v;
  public final b w;
  public final IdentityHashMap x;
  public final v y;
  public final j z;
  
  public m(h paramh, k paramk, g paramg, i0.y paramy, B0.f paramf, p0.x paramx, p0.v.a parama, B0.m paramm, E.a parama1, b paramb, j paramj, boolean paramBoolean1, int paramInt, boolean paramBoolean2, y1 paramy1, long paramLong)
  {
    o = paramh;
    p = paramk;
    q = paramg;
    r = paramy;
    s = paramx;
    t = parama;
    u = paramm;
    v = parama1;
    w = paramb;
    z = paramj;
    A = paramBoolean1;
    B = paramInt;
    C = paramBoolean2;
    D = paramy1;
    F = paramLong;
    E = new b(null);
    N = paramj.a();
    x = new IdentityHashMap();
    y = new v();
    J = new s[0];
    K = new s[0];
    L = new int[0][];
  }
  
  public static Map A(List paramList)
  {
    ArrayList localArrayList = new ArrayList(paramList);
    HashMap localHashMap = new HashMap();
    int i = 0;
    while (i < localArrayList.size())
    {
      d0.m localm1 = (d0.m)paramList.get(i);
      String str = q;
      i++;
      int j = i;
      while (j < localArrayList.size())
      {
        d0.m localm2 = (d0.m)localArrayList.get(j);
        if (TextUtils.equals(q, str))
        {
          localm1 = localm1.f(localm2);
          localArrayList.remove(j);
        }
        else
        {
          j++;
        }
      }
      localHashMap.put(str, localm1);
    }
    return localHashMap;
  }
  
  public static q B(q paramq)
  {
    String str1 = M.Q(j, 2);
    String str2 = z.g(str1);
    return new q.b().a0(a).c0(b).d0(c).Q(m).o0(str2).O(str1).h0(k).M(g).j0(h).v0(t).Y(u).X(v).q0(e).m0(f).K();
  }
  
  public static q z(q paramq1, q paramq2, boolean paramBoolean)
  {
    Object localObject1 = X2.v.Y();
    int i = -1;
    Object localObject2;
    int j;
    int k;
    int m;
    String str;
    Object localObject4;
    if (paramq2 != null)
    {
      localObject1 = j;
      localObject2 = k;
      j = B;
      k = e;
      m = f;
      str = d;
      localObject3 = b;
      localObject4 = c;
      paramq2 = (q)localObject3;
    }
    else
    {
      localObject2 = M.Q(paramq1.j, 1);
      localObject3 = paramq1.k;
      if (paramBoolean)
      {
        j = B;
        k = e;
        m = f;
        str = d;
        paramq2 = b;
        localObject1 = c;
      }
      for (;;)
      {
        localObject4 = localObject1;
        localObject1 = localObject2;
        localObject2 = localObject3;
        break;
        k = 0;
        str = null;
        j = -1;
        m = 0;
        paramq2 = null;
      }
    }
    Object localObject3 = z.g((String)localObject1);
    int n;
    if (paramBoolean) {
      n = g;
    } else {
      n = -1;
    }
    if (paramBoolean) {
      i = h;
    }
    return new q.b().a0(a).c0(paramq2).d0((List)localObject4).Q(paramq1.m).o0((String)localObject3).O((String)localObject1).h0((d0.x)localObject2).M(n).j0(i).N(j).q0(k).m0(m).e0(str).K();
  }
  
  public void D()
  {
    p.l(this);
    s[] arrayOfs = J;
    int i = arrayOfs.length;
    for (int j = 0; j < i; j++) {
      arrayOfs[j].h0();
    }
    G = null;
  }
  
  public void a()
  {
    s[] arrayOfs = J;
    int i = arrayOfs.length;
    for (int j = 0; j < i; j++) {
      arrayOfs[j].d0();
    }
    G.e(this);
  }
  
  public boolean b()
  {
    return N.b();
  }
  
  public long c()
  {
    return N.c();
  }
  
  public long d(long paramLong, d1 paramd1)
  {
    s[] arrayOfs = K;
    int i = arrayOfs.length;
    long l;
    for (int j = 0;; j++)
    {
      l = paramLong;
      if (j >= i) {
        break;
      }
      s locals = arrayOfs[j];
      if (locals.S())
      {
        l = locals.d(paramLong, paramd1);
        break;
      }
    }
    return l;
  }
  
  public boolean e(Uri paramUri, m.c paramc, boolean paramBoolean)
  {
    s[] arrayOfs = J;
    int i = arrayOfs.length;
    boolean bool = true;
    for (int j = 0; j < i; j++) {
      bool &= arrayOfs[j].c0(paramUri, paramc, paramBoolean);
    }
    G.e(this);
    return bool;
  }
  
  public long f()
  {
    return N.f();
  }
  
  public boolean g(y0 paramy0)
  {
    if (I == null)
    {
      paramy0 = J;
      int i = paramy0.length;
      for (int j = 0; j < i; j++) {
        paramy0[j].C();
      }
      return false;
    }
    return N.g(paramy0);
  }
  
  public void h(long paramLong)
  {
    N.h(paramLong);
  }
  
  public long i(A0.y[] paramArrayOfy, boolean[] paramArrayOfBoolean1, Q[] paramArrayOfQ, boolean[] paramArrayOfBoolean2, long paramLong)
  {
    int[] arrayOfInt1 = new int[paramArrayOfy.length];
    int[] arrayOfInt2 = new int[paramArrayOfy.length];
    for (int i = 0; i < paramArrayOfy.length; i++)
    {
      localObject1 = paramArrayOfQ[i];
      if (localObject1 == null) {
        j = -1;
      } else {
        j = ((Integer)x.get(localObject1)).intValue();
      }
      arrayOfInt1[i] = j;
      arrayOfInt2[i] = -1;
      localObject1 = paramArrayOfy[i];
      if (localObject1 != null)
      {
        localObject2 = ((B)localObject1).d();
        for (j = 0;; j++)
        {
          localObject1 = J;
          if (j >= localObject1.length) {
            break;
          }
          if (localObject1[j].n().d((J)localObject2) != -1)
          {
            arrayOfInt2[i] = j;
            break;
          }
        }
      }
    }
    x.clear();
    int k = paramArrayOfy.length;
    Q[] arrayOfQ1 = new Q[k];
    Q[] arrayOfQ2 = new Q[paramArrayOfy.length];
    Object localObject2 = new A0.y[paramArrayOfy.length];
    Object localObject1 = new s[J.length];
    i = 0;
    int j = 0;
    boolean bool1 = false;
    Object localObject3;
    for (;;)
    {
      localObject3 = paramArrayOfQ;
      if (j >= J.length) {
        break;
      }
      for (int m = 0; m < paramArrayOfy.length; m++)
      {
        n = arrayOfInt1[m];
        Object localObject4 = null;
        if (n == j) {
          localObject5 = localObject3[m];
        } else {
          localObject5 = null;
        }
        arrayOfQ2[m] = localObject5;
        localObject5 = localObject4;
        if (arrayOfInt2[m] == j) {
          localObject5 = paramArrayOfy[m];
        }
        localObject2[m] = localObject5;
      }
      Object localObject5 = J[j];
      boolean bool2 = ((s)localObject5).l0((A0.y[])localObject2, paramArrayOfBoolean1, arrayOfQ2, paramArrayOfBoolean2, paramLong, bool1);
      int n = 0;
      int i1;
      boolean bool3;
      boolean bool4;
      for (m = 0;; m = i1)
      {
        i1 = paramArrayOfy.length;
        bool3 = true;
        bool4 = true;
        if (n >= i1) {
          break;
        }
        localObject3 = arrayOfQ2[n];
        if (arrayOfInt2[n] == j)
        {
          a.e(localObject3);
          arrayOfQ1[n] = localObject3;
          x.put(localObject3, Integer.valueOf(j));
          i1 = 1;
        }
        else
        {
          i1 = m;
          if (arrayOfInt1[n] == j)
          {
            if (localObject3 != null) {
              bool4 = false;
            }
            a.f(bool4);
            i1 = m;
          }
        }
        n++;
      }
      if (m != 0)
      {
        localObject1[i] = localObject5;
        m = i + 1;
        if (i == 0)
        {
          ((s)localObject5).o0(true);
          if (!bool2)
          {
            localObject3 = K;
            if (localObject3.length != 0)
            {
              i = m;
              if (localObject5 == localObject3[0]) {
                break label543;
              }
            }
          }
          y.b();
          bool1 = true;
          i = m;
        }
        else
        {
          if (j < M) {
            bool4 = bool3;
          } else {
            bool4 = false;
          }
          ((s)localObject5).o0(bool4);
          i = m;
        }
      }
      label543:
      j++;
    }
    System.arraycopy(arrayOfQ1, 0, localObject3, 0, k);
    paramArrayOfy = (s[])M.O0((Object[])localObject1, i);
    K = paramArrayOfy;
    paramArrayOfy = X2.v.V(paramArrayOfy);
    N = z.b(paramArrayOfy, E.k(paramArrayOfy, new l()));
    return paramLong;
  }
  
  public long l()
  {
    return -9223372036854775807L;
  }
  
  public Z n()
  {
    return (Z)a.e(I);
  }
  
  public void p()
  {
    s[] arrayOfs = J;
    int i = arrayOfs.length;
    for (int j = 0; j < i; j++) {
      arrayOfs[j].p();
    }
  }
  
  public void q(long paramLong, boolean paramBoolean)
  {
    s[] arrayOfs = K;
    int i = arrayOfs.length;
    for (int j = 0; j < i; j++) {
      arrayOfs[j].q(paramLong, paramBoolean);
    }
  }
  
  public long s(long paramLong)
  {
    s[] arrayOfs = K;
    if (arrayOfs.length > 0)
    {
      boolean bool = arrayOfs[0].k0(paramLong, false);
      for (int i = 1;; i++)
      {
        arrayOfs = K;
        if (i >= arrayOfs.length) {
          break;
        }
        arrayOfs[i].k0(paramLong, bool);
      }
      if (bool) {
        y.b();
      }
    }
    return paramLong;
  }
  
  public void u(x0.v.a parama, long paramLong)
  {
    G = parama;
    p.j(this);
    x(paramLong);
  }
  
  public final void v(long paramLong, List paramList1, List paramList2, List paramList3, Map paramMap)
  {
    ArrayList localArrayList1 = new ArrayList(paramList1.size());
    ArrayList localArrayList2 = new ArrayList(paramList1.size());
    ArrayList localArrayList3 = new ArrayList(paramList1.size());
    HashSet localHashSet = new HashSet();
    for (int i = 0; i < paramList1.size(); i++)
    {
      Object localObject1 = getd;
      if (localHashSet.add(localObject1))
      {
        localArrayList1.clear();
        localArrayList2.clear();
        localArrayList3.clear();
        int j = 1;
        int k = 0;
        while (k < paramList1.size())
        {
          int m = j;
          if (M.c(localObject1, getd))
          {
            localObject2 = (g.a)paramList1.get(k);
            localArrayList3.add(Integer.valueOf(k));
            localArrayList1.add(a);
            localArrayList2.add(b);
            if (M.P(b.j, 1) == 1) {
              m = 1;
            } else {
              m = 0;
            }
            m = j & m;
          }
          k++;
          j = m;
        }
        Object localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("audio:");
        ((StringBuilder)localObject2).append((String)localObject1);
        localObject2 = ((StringBuilder)localObject2).toString();
        localObject1 = y((String)localObject2, 1, (Uri[])localArrayList1.toArray((Uri[])M.j(new Uri[0])), (q[])localArrayList2.toArray(new q[0]), null, Collections.emptyList(), paramMap, paramLong);
        paramList3.add(a3.f.n(localArrayList3));
        paramList2.add(localObject1);
        if ((A) && (j != 0)) {
          ((s)localObject1).f0(new J[] { new J((String)localObject2, (q[])localArrayList2.toArray(new q[0])) }, 0, new int[0]);
        }
      }
    }
  }
  
  public final void w(r0.g paramg, long paramLong, List paramList1, List paramList2, Map paramMap)
  {
    int i = e.size();
    Object localObject1 = new int[i];
    int j = 0;
    int k = j;
    int m = k;
    while (j < e.size())
    {
      localObject2 = e.get(j)).b;
      if ((u <= 0) && (M.Q(j, 2) == null))
      {
        if (M.Q(j, 1) != null)
        {
          localObject1[j] = 1;
          m++;
        }
        else
        {
          localObject1[j] = -1;
        }
      }
      else
      {
        localObject1[j] = 2;
        k++;
      }
      j++;
    }
    if (k > 0)
    {
      j = 1;
      m = 0;
    }
    else if (m < i)
    {
      k = i - m;
      m = 1;
      j = 0;
    }
    else
    {
      k = i;
      j = 0;
      m = j;
    }
    Uri[] arrayOfUri = new Uri[k];
    Object localObject2 = new q[k];
    int[] arrayOfInt = new int[k];
    int n = 0;
    for (i = n; n < e.size(); i = i1)
    {
      if (j != 0)
      {
        i1 = i;
        if (localObject1[n] != 2) {}
      }
      else if (m != 0)
      {
        i1 = i;
        if (localObject1[n] == 1) {}
      }
      else
      {
        g.b localb = (g.b)e.get(n);
        arrayOfUri[i] = a;
        localObject2[i] = b;
        arrayOfInt[i] = n;
        i1 = i + 1;
      }
      n++;
    }
    localObject1 = 0j;
    int i1 = M.P((String)localObject1, 2);
    i = M.P((String)localObject1, 1);
    if (((i == 1) || ((i == 0) && (g.isEmpty()))) && (i1 <= 1) && (i + i1 > 0)) {
      m = 1;
    } else {
      m = 0;
    }
    if ((j == 0) && (i > 0)) {
      j = 1;
    } else {
      j = 0;
    }
    paramMap = y("main", j, arrayOfUri, (q[])localObject2, j, k, paramMap, paramLong);
    paramList1.add(paramMap);
    paramList2.add(arrayOfInt);
    if ((A) && (m != 0))
    {
      paramList1 = new ArrayList();
      if (i1 > 0)
      {
        paramList2 = new q[k];
        for (j = 0; j < k; j++) {
          paramList2[j] = B(localObject2[j]);
        }
        paramList1.add(new J("main", paramList2));
        if ((i > 0) && ((j != null) || (g.isEmpty())))
        {
          paramList2 = new StringBuilder();
          paramList2.append("main");
          paramList2.append(":audio");
          paramList1.add(new J(paramList2.toString(), new q[] { z(localObject2[0], j, false) }));
        }
        paramg = k;
        if (paramg != null) {
          for (k = 0; k < paramg.size(); k++)
          {
            paramList2 = new StringBuilder();
            paramList2.append("main");
            paramList2.append(":cc:");
            paramList2.append(k);
            paramList1.add(new J(paramList2.toString(), new q[] { o.b((q)paramg.get(k)) }));
          }
        }
      }
      else
      {
        paramList2 = new q[k];
        for (j = 0; j < k; j++) {
          paramList2[j] = z(localObject2[j], j, true);
        }
        paramList1.add(new J("main", paramList2));
      }
      paramg = new StringBuilder();
      paramg.append("main");
      paramg.append(":id3");
      paramg = new J(paramg.toString(), new q[] { new q.b().a0("ID3").o0("application/id3").K() });
      paramList1.add(paramg);
      paramMap.f0((J[])paramList1.toArray(new J[0]), 0, new int[] { paramList1.indexOf(paramg) });
    }
  }
  
  public final void x(long paramLong)
  {
    Object localObject1 = (r0.g)a.e(p.b());
    if (C) {}
    for (Object localObject2 = A(m);; localObject2 = Collections.emptyMap()) {
      break;
    }
    boolean bool = e.isEmpty();
    Object localObject3 = g;
    List localList = h;
    H = 0;
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    if ((bool ^ true)) {
      w((r0.g)localObject1, paramLong, localArrayList1, localArrayList2, (Map)localObject2);
    }
    v(paramLong, (List)localObject3, localArrayList1, localArrayList2, (Map)localObject2);
    M = localArrayList1.size();
    for (int i = 0; i < localList.size(); i++)
    {
      Object localObject4 = (g.a)localList.get(i);
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("subtitle:");
      ((StringBuilder)localObject1).append(i);
      ((StringBuilder)localObject1).append(":");
      ((StringBuilder)localObject1).append(d);
      localObject1 = ((StringBuilder)localObject1).toString();
      localObject3 = b;
      Uri localUri = a;
      localObject4 = Collections.emptyList();
      localObject4 = y((String)localObject1, 3, new Uri[] { localUri }, new q[] { localObject3 }, null, (List)localObject4, (Map)localObject2, paramLong);
      localArrayList2.add(new int[] { i });
      localArrayList1.add(localObject4);
      ((s)localObject4).f0(new J[] { new J((String)localObject1, new q[] { o.b((q)localObject3) }) }, 0, new int[0]);
    }
    J = ((s[])localArrayList1.toArray(new s[0]));
    L = ((int[][])localArrayList2.toArray(new int[0][]));
    H = J.length;
    for (i = 0; i < M; i++) {
      J[i].o0(true);
    }
    localObject2 = J;
    int j = localObject2.length;
    for (i = 0; i < j; i++) {
      localObject2[i].C();
    }
    K = J;
  }
  
  public final s y(String paramString, int paramInt, Uri[] paramArrayOfUri, q[] paramArrayOfq, q paramq, List paramList, Map paramMap, long paramLong)
  {
    paramArrayOfUri = new f(o, p, paramArrayOfUri, paramArrayOfq, q, r, y, F, paramList, D, null);
    return new s(paramString, paramInt, E, paramArrayOfUri, paramMap, w, paramLong, paramq, s, t, u, v, B);
  }
  
  public class b
    implements s.b
  {
    public b() {}
    
    public void a(s params)
    {
      m.r(m.this).e(m.this);
    }
    
    public void m(Uri paramUri)
    {
      m.t(m.this).i(paramUri);
    }
    
    public void o()
    {
      if (m.k(m.this) > 0) {
        return;
      }
      Object localObject = m.m(m.this);
      int i = localObject.length;
      int j = 0;
      int k = j;
      while (j < i)
      {
        k += na;
        j++;
      }
      localObject = new J[k];
      s[] arrayOfs = m.m(m.this);
      int m = arrayOfs.length;
      k = 0;
      j = k;
      while (k < m)
      {
        s locals = arrayOfs[k];
        int n = na;
        i = 0;
        while (i < n)
        {
          localObject[j] = locals.n().b(i);
          i++;
          j++;
        }
        k++;
      }
      m.o(m.this, new Z((J[])localObject));
      m.r(m.this).k(m.this);
    }
  }
}

/* Location:
 * Qualified Name:     q0.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */