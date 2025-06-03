package androidx.media3.exoplayer.dash;

import A0.B;
import B0.m;
import X2.E;
import X2.G;
import android.util.Pair;
import android.util.SparseArray;
import d0.J;
import d0.q;
import d0.q.b;
import g0.M;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k0.d1;
import k0.y0;
import l0.y1;
import o0.c;
import o0.e;
import o0.g;
import p0.x;
import x0.E.a;
import x0.Q;
import x0.S;
import x0.S.a;
import x0.Z;
import y0.h;
import y0.h.a;
import y0.h.b;

public final class b
  implements x0.v, S.a, h.b
{
  public static final Pattern M = Pattern.compile("CC([1-4])=(.+)");
  public static final Pattern N = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
  public final d A;
  public final IdentityHashMap B;
  public final E.a C;
  public final p0.v.a D;
  public final y1 E;
  public x0.v.a F;
  public h[] G;
  public n0.j[] H;
  public S I;
  public c J;
  public int K;
  public List L;
  public final int o;
  public final a.a p;
  public final i0.y q;
  public final x r;
  public final m s;
  public final n0.b t;
  public final long u;
  public final B0.o v;
  public final B0.b w;
  public final Z x;
  public final a[] y;
  public final x0.j z;
  
  public b(int paramInt1, c paramc, n0.b paramb, int paramInt2, a.a parama, i0.y paramy, B0.f paramf, x paramx, p0.v.a parama1, m paramm, E.a parama2, long paramLong, B0.o paramo, B0.b paramb1, x0.j paramj, d.b paramb2, y1 paramy1)
  {
    o = paramInt1;
    J = paramc;
    t = paramb;
    K = paramInt2;
    p = parama;
    q = paramy;
    r = paramx;
    D = parama1;
    s = paramm;
    C = parama2;
    u = paramLong;
    v = paramo;
    w = paramb1;
    z = paramj;
    E = paramy1;
    A = new d(paramc, paramb2, paramb1);
    G = I(0);
    H = new n0.j[0];
    B = new IdentityHashMap();
    I = paramj.a();
    paramb = paramc.d(paramInt2);
    paramc = d;
    L = paramc;
    paramc = w(paramx, parama, c, paramc);
    x = ((Z)first);
    y = ((a[])second);
  }
  
  public static q[] A(List paramList, int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    for (int j = 0; j < i; j++)
    {
      int k = paramArrayOfInt[j];
      o0.a locala = (o0.a)paramList.get(k);
      List localList = getd;
      for (k = 0; k < localList.size(); k++)
      {
        e locale = (e)localList.get(k);
        if ("urn:scte:dash:cc:cea-608:2015".equals(a))
        {
          paramList = new q.b().o0("application/cea-608");
          paramArrayOfInt = new StringBuilder();
          paramArrayOfInt.append(a);
          paramArrayOfInt.append(":cea608");
          paramList = paramList.a0(paramArrayOfInt.toString()).K();
        }
        for (paramArrayOfInt = M;; paramArrayOfInt = N)
        {
          return K(locale, paramArrayOfInt, paramList);
          if (!"urn:scte:dash:cc:cea-708:2015".equals(a)) {
            break;
          }
          paramArrayOfInt = new q.b().o0("application/cea-708");
          paramList = new StringBuilder();
          paramList.append(a);
          paramList.append(":cea708");
          paramList = paramArrayOfInt.a0(paramList.toString()).K();
        }
      }
    }
    return new q[0];
  }
  
  public static int[][] B(List paramList)
  {
    int i = paramList.size();
    HashMap localHashMap = G.f(i);
    ArrayList localArrayList = new ArrayList(i);
    SparseArray localSparseArray = new SparseArray(i);
    int j = 0;
    for (int k = 0; k < i; k++)
    {
      localHashMap.put(Long.valueOf(geta), Integer.valueOf(k));
      localObject1 = new ArrayList();
      ((List)localObject1).add(Integer.valueOf(k));
      localArrayList.add(localObject1);
      localSparseArray.put(k, localObject1);
    }
    for (int m = 0; m < i; m++)
    {
      o0.a locala = (o0.a)paramList.get(m);
      Object localObject2 = z(e);
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = z(f);
      }
      if (localObject1 != null)
      {
        localObject1 = (Integer)localHashMap.get(Long.valueOf(Long.parseLong(b)));
        if (localObject1 != null)
        {
          k = ((Integer)localObject1).intValue();
          break label211;
        }
      }
      k = m;
      label211:
      int n = k;
      if (k == m)
      {
        localObject1 = x(f);
        n = k;
        if (localObject1 != null)
        {
          localObject1 = M.b1(b, ",");
          int i1 = localObject1.length;
          int i2 = 0;
          for (;;)
          {
            n = k;
            if (i2 >= i1) {
              break;
            }
            localObject2 = (Integer)localHashMap.get(Long.valueOf(Long.parseLong(localObject1[i2])));
            n = k;
            if (localObject2 != null) {
              n = Math.min(k, ((Integer)localObject2).intValue());
            }
            i2++;
            k = n;
          }
        }
      }
      if (n != m)
      {
        localObject1 = (List)localSparseArray.get(m);
        localObject2 = (List)localSparseArray.get(n);
        ((List)localObject2).addAll((Collection)localObject1);
        localSparseArray.put(m, localObject2);
        localArrayList.remove(localObject1);
      }
    }
    m = localArrayList.size();
    Object localObject1 = new int[m][];
    for (k = j; k < m; k++)
    {
      paramList = a3.f.n((Collection)localArrayList.get(k));
      localObject1[k] = paramList;
      Arrays.sort(paramList);
    }
    return (int[][])localObject1;
  }
  
  public static boolean E(List paramList, int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    for (int j = 0; j < i; j++)
    {
      List localList = getc;
      for (int k = 0; k < localList.size(); k++) {
        if (!gete.isEmpty()) {
          return true;
        }
      }
    }
    return false;
  }
  
  public static int F(int paramInt, List paramList, int[][] paramArrayOfInt, boolean[] paramArrayOfBoolean, q[][] paramArrayOfq)
  {
    int i = 0;
    int j = 0;
    while (i < paramInt)
    {
      int k = j;
      if (E(paramList, paramArrayOfInt[i]))
      {
        paramArrayOfBoolean[i] = true;
        k = j + 1;
      }
      q[] arrayOfq = A(paramList, paramArrayOfInt[i]);
      paramArrayOfq[i] = arrayOfq;
      j = k;
      if (arrayOfq.length != 0) {
        j = k + 1;
      }
      i++;
    }
    return j;
  }
  
  public static void H(a.a parama, q[] paramArrayOfq)
  {
    for (int i = 0; i < paramArrayOfq.length; i++) {
      paramArrayOfq[i] = parama.b(paramArrayOfq[i]);
    }
  }
  
  public static h[] I(int paramInt)
  {
    return new h[paramInt];
  }
  
  public static q[] K(e parame, Pattern paramPattern, q paramq)
  {
    parame = b;
    if (parame == null) {
      return new q[] { paramq };
    }
    parame = M.b1(parame, ";");
    q[] arrayOfq = new q[parame.length];
    for (int i = 0; i < parame.length; i++)
    {
      Matcher localMatcher = paramPattern.matcher(parame[i]);
      if (!localMatcher.matches()) {
        return new q[] { paramq };
      }
      int j = Integer.parseInt(localMatcher.group(1));
      q.b localb = paramq.a();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(a);
      localStringBuilder.append(":");
      localStringBuilder.append(j);
      arrayOfq[i] = localb.a0(localStringBuilder.toString()).L(j).e0(localMatcher.group(2)).K();
    }
    return arrayOfq;
  }
  
  public static void r(List paramList, J[] paramArrayOfJ, a[] paramArrayOfa, int paramInt)
  {
    int i = 0;
    while (i < paramList.size())
    {
      o0.f localf = (o0.f)paramList.get(i);
      q localq = new q.b().a0(localf.a()).o0("application/x-emsg").K();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(localf.a());
      localStringBuilder.append(":");
      localStringBuilder.append(i);
      paramArrayOfJ[paramInt] = new J(localStringBuilder.toString(), new q[] { localq });
      paramArrayOfa[paramInt] = a.c(i);
      i++;
      paramInt++;
    }
  }
  
  public static int t(x paramx, a.a parama, List paramList, int[][] paramArrayOfInt, int paramInt, boolean[] paramArrayOfBoolean, q[][] paramArrayOfq, J[] paramArrayOfJ, a[] paramArrayOfa)
  {
    int i = 0;
    int j = 0;
    int k = j;
    while (j < paramInt)
    {
      int[] arrayOfInt = paramArrayOfInt[j];
      Object localObject1 = new ArrayList();
      int m = arrayOfInt.length;
      for (int n = i; n < m; n++) {
        ((List)localObject1).addAll(getc);
      }
      m = ((List)localObject1).size();
      Object localObject2 = new q[m];
      Object localObject3;
      for (n = i; n < m; n++)
      {
        localObject3 = getb;
        localObject2[n] = ((q)localObject3).a().R(paramx.b((q)localObject3)).K();
      }
      localObject1 = (o0.a)paramList.get(arrayOfInt[i]);
      long l = a;
      if (l != -1L)
      {
        localObject3 = Long.toString(l);
      }
      else
      {
        localObject3 = new StringBuilder();
        ((StringBuilder)localObject3).append("unset:");
        ((StringBuilder)localObject3).append(j);
        localObject3 = ((StringBuilder)localObject3).toString();
      }
      n = k + 1;
      if (paramArrayOfBoolean[j] != 0)
      {
        i = k + 2;
      }
      else
      {
        i = n;
        n = -1;
      }
      if (paramArrayOfq[j].length != 0)
      {
        int i1 = i + 1;
        m = i;
        i = i1;
      }
      else
      {
        m = -1;
      }
      H(parama, (q[])localObject2);
      paramArrayOfJ[k] = new J((String)localObject3, (q[])localObject2);
      paramArrayOfa[k] = a.d(b, arrayOfInt, k, n, m);
      if (n != -1)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append((String)localObject3);
        ((StringBuilder)localObject2).append(":emsg");
        localObject2 = ((StringBuilder)localObject2).toString();
        paramArrayOfJ[n] = new J((String)localObject2, new q[] { new q.b().a0((String)localObject2).o0("application/x-emsg").K() });
        paramArrayOfa[n] = a.b(arrayOfInt, k);
      }
      if (m != -1)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append((String)localObject3);
        ((StringBuilder)localObject2).append(":cc");
        localObject3 = ((StringBuilder)localObject2).toString();
        paramArrayOfa[m] = a.a(arrayOfInt, k, X2.v.V(paramArrayOfq[j]));
        H(parama, paramArrayOfq[j]);
        paramArrayOfJ[m] = new J((String)localObject3, paramArrayOfq[j]);
      }
      j++;
      k = i;
      i = 0;
    }
    return k;
  }
  
  public static Pair w(x paramx, a.a parama, List paramList1, List paramList2)
  {
    int[][] arrayOfInt = B(paramList1);
    int i = arrayOfInt.length;
    boolean[] arrayOfBoolean = new boolean[i];
    q[][] arrayOfq = new q[i][];
    int j = F(i, paramList1, arrayOfInt, arrayOfBoolean, arrayOfq) + i + paramList2.size();
    J[] arrayOfJ = new J[j];
    a[] arrayOfa = new a[j];
    r(paramList2, arrayOfJ, arrayOfa, t(paramx, parama, paramList1, arrayOfInt, i, arrayOfBoolean, arrayOfq, arrayOfJ, arrayOfa));
    return Pair.create(new Z(arrayOfJ), arrayOfa);
  }
  
  public static e x(List paramList)
  {
    return y(paramList, "urn:mpeg:dash:adaptation-set-switching:2016");
  }
  
  public static e y(List paramList, String paramString)
  {
    for (int i = 0; i < paramList.size(); i++)
    {
      e locale = (e)paramList.get(i);
      if (paramString.equals(a)) {
        return locale;
      }
    }
    return null;
  }
  
  public static e z(List paramList)
  {
    return y(paramList, "http://dashif.org/guidelines/trickmode");
  }
  
  public final int C(int paramInt, int[] paramArrayOfInt)
  {
    paramInt = paramArrayOfInt[paramInt];
    if (paramInt == -1) {
      return -1;
    }
    int i = y[paramInt].e;
    for (paramInt = 0; paramInt < paramArrayOfInt.length; paramInt++)
    {
      int j = paramArrayOfInt[paramInt];
      if ((j == i) && (y[j].c == 0)) {
        return paramInt;
      }
    }
    return -1;
  }
  
  public final int[] D(A0.y[] paramArrayOfy)
  {
    int[] arrayOfInt = new int[paramArrayOfy.length];
    for (int i = 0; i < paramArrayOfy.length; i++)
    {
      A0.y localy = paramArrayOfy[i];
      if (localy != null) {
        arrayOfInt[i] = x.d(localy.d());
      } else {
        arrayOfInt[i] = -1;
      }
    }
    return arrayOfInt;
  }
  
  public void J(h paramh)
  {
    F.e(this);
  }
  
  public void L()
  {
    A.o();
    h[] arrayOfh = G;
    int i = arrayOfh.length;
    for (int j = 0; j < i; j++) {
      arrayOfh[j].P(this);
    }
    F = null;
  }
  
  public final void M(A0.y[] paramArrayOfy, boolean[] paramArrayOfBoolean, Q[] paramArrayOfQ)
  {
    for (int i = 0; i < paramArrayOfy.length; i++) {
      if ((paramArrayOfy[i] == null) || (paramArrayOfBoolean[i] == 0))
      {
        Q localQ = paramArrayOfQ[i];
        if ((localQ instanceof h)) {
          ((h)localQ).P(this);
        } else if ((localQ instanceof h.a)) {
          ((h.a)localQ).c();
        }
        paramArrayOfQ[i] = null;
      }
    }
  }
  
  public final void N(A0.y[] paramArrayOfy, Q[] paramArrayOfQ, int[] paramArrayOfInt)
  {
    for (int i = 0; i < paramArrayOfy.length; i++)
    {
      Q localQ = paramArrayOfQ[i];
      if (((localQ instanceof x0.o)) || ((localQ instanceof h.a)))
      {
        int j = C(i, paramArrayOfInt);
        if (j == -1)
        {
          if ((paramArrayOfQ[i] instanceof x0.o)) {
            continue;
          }
        }
        else
        {
          localQ = paramArrayOfQ[i];
          if (((localQ instanceof h.a)) && (o == paramArrayOfQ[j])) {
            continue;
          }
        }
        localQ = paramArrayOfQ[i];
        if ((localQ instanceof h.a)) {
          ((h.a)localQ).c();
        }
        paramArrayOfQ[i] = null;
      }
    }
  }
  
  public final void O(A0.y[] paramArrayOfy, Q[] paramArrayOfQ, boolean[] paramArrayOfBoolean, long paramLong, int[] paramArrayOfInt)
  {
    int i = 0;
    int k;
    for (int j = 0;; j++)
    {
      k = i;
      if (j >= paramArrayOfy.length) {
        break;
      }
      A0.y localy = paramArrayOfy[j];
      if (localy != null)
      {
        Object localObject = paramArrayOfQ[j];
        if (localObject == null)
        {
          paramArrayOfBoolean[j] = true;
          k = paramArrayOfInt[j];
          localObject = y[k];
          k = c;
          if (k == 0) {
            paramArrayOfQ[j] = v((a)localObject, localy, paramLong);
          } else if (k == 2) {
            paramArrayOfQ[j] = new n0.j((o0.f)L.get(d), localy.d().a(0), J.d);
          }
        }
        else if ((localObject instanceof h))
        {
          ((a)((h)localObject).E()).i(localy);
        }
      }
    }
    while (k < paramArrayOfy.length)
    {
      if ((paramArrayOfQ[k] == null) && (paramArrayOfy[k] != null))
      {
        j = paramArrayOfInt[k];
        paramArrayOfBoolean = y[j];
        if (c == 1)
        {
          j = C(k, paramArrayOfInt);
          if (j == -1) {
            paramArrayOfQ[k] = new x0.o();
          } else {
            paramArrayOfQ[k] = ((h)paramArrayOfQ[j]).S(paramLong, b);
          }
        }
      }
      k++;
    }
  }
  
  public void P(c paramc, int paramInt)
  {
    J = paramc;
    K = paramInt;
    A.q(paramc);
    h[] arrayOfh = G;
    int i;
    int j;
    if (arrayOfh != null)
    {
      i = arrayOfh.length;
      for (j = 0; j < i; j++) {
        ((a)arrayOfh[j].E()).c(paramc, paramInt);
      }
      F.e(this);
    }
    L = dd;
    for (arrayOfh : H)
    {
      Iterator localIterator = L.iterator();
      while (localIterator.hasNext())
      {
        o0.f localf = (o0.f)localIterator.next();
        if (localf.a().equals(arrayOfh.b()))
        {
          int k = paramc.e();
          boolean bool = true;
          if ((!d) || (paramInt != k - 1)) {
            bool = false;
          }
          arrayOfh.d(localf, bool);
        }
      }
    }
  }
  
  public void a(h paramh)
  {
    try
    {
      paramh = (d.c)B.remove(paramh);
      if (paramh != null) {
        paramh.n();
      }
    }
    finally
    {
      break label32;
    }
    return;
    label32:
    throw paramh;
  }
  
  public boolean b()
  {
    return I.b();
  }
  
  public long c()
  {
    return I.c();
  }
  
  public long d(long paramLong, d1 paramd1)
  {
    for (h localh : G) {
      if (o == 2) {
        return localh.d(paramLong, paramd1);
      }
    }
    return paramLong;
  }
  
  public long f()
  {
    return I.f();
  }
  
  public boolean g(y0 paramy0)
  {
    return I.g(paramy0);
  }
  
  public void h(long paramLong)
  {
    I.h(paramLong);
  }
  
  public long i(A0.y[] paramArrayOfy, boolean[] paramArrayOfBoolean1, Q[] paramArrayOfQ, boolean[] paramArrayOfBoolean2, long paramLong)
  {
    int[] arrayOfInt = D(paramArrayOfy);
    M(paramArrayOfy, paramArrayOfBoolean1, paramArrayOfQ);
    N(paramArrayOfy, paramArrayOfQ, arrayOfInt);
    O(paramArrayOfy, paramArrayOfQ, paramArrayOfBoolean2, paramLong, arrayOfInt);
    paramArrayOfy = new ArrayList();
    paramArrayOfBoolean1 = new ArrayList();
    int i = paramArrayOfQ.length;
    for (int j = 0; j < i; j++)
    {
      paramArrayOfBoolean2 = paramArrayOfQ[j];
      if ((paramArrayOfBoolean2 instanceof h)) {
        paramArrayOfy.add((h)paramArrayOfBoolean2);
      } else if ((paramArrayOfBoolean2 instanceof n0.j)) {
        paramArrayOfBoolean1.add((n0.j)paramArrayOfBoolean2);
      }
    }
    paramArrayOfQ = I(paramArrayOfy.size());
    G = paramArrayOfQ;
    paramArrayOfy.toArray(paramArrayOfQ);
    paramArrayOfQ = new n0.j[paramArrayOfBoolean1.size()];
    H = paramArrayOfQ;
    paramArrayOfBoolean1.toArray(paramArrayOfQ);
    I = z.b(paramArrayOfy, E.k(paramArrayOfy, new n0.d()));
    return paramLong;
  }
  
  public long l()
  {
    return -9223372036854775807L;
  }
  
  public Z n()
  {
    return x;
  }
  
  public void p()
  {
    v.a();
  }
  
  public void q(long paramLong, boolean paramBoolean)
  {
    h[] arrayOfh = G;
    int i = arrayOfh.length;
    for (int j = 0; j < i; j++) {
      arrayOfh[j].q(paramLong, paramBoolean);
    }
  }
  
  public long s(long paramLong)
  {
    Object localObject = G;
    int i = localObject.length;
    int j = 0;
    for (int k = 0; k < i; k++) {
      localObject[k].R(paramLong);
    }
    localObject = H;
    i = localObject.length;
    for (k = j; k < i; k++) {
      localObject[k].c(paramLong);
    }
    return paramLong;
  }
  
  public void u(x0.v.a parama, long paramLong)
  {
    F = parama;
    parama.k(this);
  }
  
  public final h v(a parama, A0.y paramy, long paramLong)
  {
    int i = f;
    int j = 0;
    boolean bool;
    if (i != -1) {
      bool = true;
    } else {
      bool = false;
    }
    Object localObject1 = null;
    if (bool)
    {
      localObject2 = x.b(i);
      i = 1;
    }
    else
    {
      i = 0;
      localObject2 = null;
    }
    int k = g;
    X2.v localv;
    if (k != -1) {
      localv = y[k].h;
    } else {
      localv = X2.v.Y();
    }
    i += localv.size();
    q[] arrayOfq = new q[i];
    int[] arrayOfInt = new int[i];
    if (bool)
    {
      arrayOfq[0] = ((J)localObject2).a(0);
      arrayOfInt[0] = 5;
      i = 1;
    }
    else
    {
      i = 0;
    }
    ArrayList localArrayList = new ArrayList();
    while (j < localv.size())
    {
      localObject2 = (q)localv.get(j);
      arrayOfq[i] = localObject2;
      arrayOfInt[i] = 3;
      localArrayList.add(localObject2);
      i++;
      j++;
    }
    Object localObject2 = localObject1;
    if (J.d)
    {
      localObject2 = localObject1;
      if (bool) {
        localObject2 = A.k();
      }
    }
    paramy = p.c(v, J, t, K, a, paramy, b, u, bool, localArrayList, (d.c)localObject2, q, E, null);
    parama = new h(b, arrayOfInt, arrayOfq, paramy, this, w, paramLong, r, D, s, C);
    try
    {
      B.put(parama, localObject2);
      return parama;
    }
    finally {}
  }
  
  public static final class a
  {
    public final int[] a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final X2.v h;
    
    public a(int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3, int paramInt4, int paramInt5, int paramInt6, X2.v paramv)
    {
      b = paramInt1;
      a = paramArrayOfInt;
      c = paramInt2;
      e = paramInt3;
      f = paramInt4;
      g = paramInt5;
      d = paramInt6;
      h = paramv;
    }
    
    public static a a(int[] paramArrayOfInt, int paramInt, X2.v paramv)
    {
      return new a(3, 1, paramArrayOfInt, paramInt, -1, -1, -1, paramv);
    }
    
    public static a b(int[] paramArrayOfInt, int paramInt)
    {
      return new a(5, 1, paramArrayOfInt, paramInt, -1, -1, -1, X2.v.Y());
    }
    
    public static a c(int paramInt)
    {
      X2.v localv = X2.v.Y();
      return new a(5, 2, new int[0], -1, -1, -1, paramInt, localv);
    }
    
    public static a d(int paramInt1, int[] paramArrayOfInt, int paramInt2, int paramInt3, int paramInt4)
    {
      return new a(paramInt1, 0, paramArrayOfInt, paramInt2, paramInt3, paramInt4, -1, X2.v.Y());
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media3.exoplayer.dash.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */