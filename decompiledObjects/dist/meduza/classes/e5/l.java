package e5;

import a4.d;
import a4.d.b;
import a4.g.a;
import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseArray;
import b1.v;
import d2.h0;
import f5.e.c;
import f5.e.d;
import f5.f;
import f5.f.a;
import f5.f.b;
import f5.j.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import p2.m0;
import r5.k;
import t5.c0.a;
import t5.c0.b;
import t5.c0.c;
import t5.l0;
import t5.u;
import v3.a1;
import v3.i0.a;
import v3.n1;
import v5.e0;
import v5.p;
import w3.a0;
import z4.b0;
import z4.d0.a;
import z4.j0;
import z4.r;
import z4.r.a;
import z4.w.a;

public final class l
  implements r, j.a
{
  public int A;
  public j0 B;
  public n[] C;
  public n[] D;
  public int E;
  public v F;
  public final i a;
  public final f5.j b;
  public final h c;
  public final l0 d;
  public final a4.h e;
  public final g.a f;
  public final t5.c0 o;
  public final w.a p;
  public final t5.b q;
  public final IdentityHashMap<z4.c0, Integer> r;
  public final h0 s;
  public final z4.i t;
  public final boolean u;
  public final int v;
  public final boolean w;
  public final a0 x;
  public final a y;
  public r.a z;
  
  public l(i parami, f5.j paramj, h paramh, l0 paraml0, a4.h paramh1, g.a parama, t5.c0 paramc0, w.a parama1, t5.b paramb, z4.i parami1, boolean paramBoolean1, int paramInt, boolean paramBoolean2, a0 parama0)
  {
    a = parami;
    b = paramj;
    c = paramh;
    d = paraml0;
    e = paramh1;
    f = parama;
    o = paramc0;
    p = parama1;
    q = paramb;
    t = parami1;
    u = paramBoolean1;
    v = paramInt;
    w = paramBoolean2;
    x = parama0;
    y = new a();
    parami1.getClass();
    F = new v(new z4.d0[0]);
    r = new IdentityHashMap();
    s = new h0(3);
    C = new n[0];
    D = new n[0];
  }
  
  public static v3.i0 k(v3.i0 parami01, v3.i0 parami02, boolean paramBoolean)
  {
    int i = -1;
    Object localObject2;
    int j;
    int k;
    int m;
    Object localObject3;
    Object localObject4;
    if (parami02 != null)
    {
      localObject1 = q;
      localObject2 = r;
      j = G;
      k = d;
      m = e;
      localObject3 = c;
      localObject4 = b;
      parami02 = (v3.i0)localObject1;
    }
    else
    {
      localObject2 = e0.q(1, q);
      parami02 = r;
      if (paramBoolean)
      {
        j = G;
        k = d;
        m = e;
        localObject1 = c;
        localObject4 = b;
        localObject3 = parami02;
        parami02 = (v3.i0)localObject2;
        localObject2 = localObject3;
        localObject3 = localObject1;
      }
      else
      {
        localObject3 = null;
        k = 0;
        j = -1;
        localObject1 = localObject2;
        localObject4 = localObject3;
        m = k;
        localObject2 = parami02;
        parami02 = (v3.i0)localObject1;
      }
    }
    String str = p.e(parami02);
    int n;
    if (paramBoolean) {
      n = f;
    } else {
      n = -1;
    }
    if (paramBoolean) {
      i = o;
    }
    Object localObject1 = new i0.a();
    a = a;
    b = ((String)localObject4);
    j = s;
    k = str;
    h = parami02;
    i = ((p4.a)localObject2);
    f = n;
    g = i;
    x = j;
    d = k;
    e = m;
    c = ((String)localObject3);
    return ((i0.a)localObject1).a();
  }
  
  public final boolean a(Uri paramUri, c0.c paramc, boolean paramBoolean)
  {
    n[] arrayOfn = C;
    int i = arrayOfn.length;
    int j = 0;
    int k = 1;
    while (j < i)
    {
      Object localObject1 = arrayOfn[j];
      if (e0.k(paramUri, d.e))
      {
        if (!paramBoolean)
        {
          localObject2 = q;
          c0.a locala = r5.n.a(d.q);
          localObject2 = ((u)localObject2).a(locala, paramc);
          if ((localObject2 != null) && (a == 2))
          {
            l = b;
            break label115;
          }
        }
        long l = -9223372036854775807L;
        label115:
        Object localObject2 = d;
        for (m = 0;; m++)
        {
          localObject1 = e;
          if (m >= localObject1.length) {
            break;
          }
          if (localObject1[m].equals(paramUri)) {
            break label164;
          }
        }
        m = -1;
        label164:
        if (m != -1)
        {
          m = q.f(m);
          if (m != -1)
          {
            s |= paramUri.equals(o);
            if ((l != -9223372036854775807L) && ((!q.k(m, l)) || (!g.i(paramUri, l))))
            {
              m = 0;
              break label270;
            }
          }
        }
        m = 1;
        label270:
        if ((m == 0) || (l == -9223372036854775807L)) {}
      }
      else
      {
        m = 1;
        break label293;
      }
      int m = 0;
      label293:
      k &= m;
      j++;
    }
    z.a(this);
    return k;
  }
  
  public final n b(String paramString, int paramInt, Uri[] paramArrayOfUri, v3.i0[] paramArrayOfi0, v3.i0 parami0, List<v3.i0> paramList, Map<String, d> paramMap, long paramLong)
  {
    paramArrayOfUri = new g(a, b, paramArrayOfUri, paramArrayOfi0, c, d, s, paramList, x);
    return new n(paramString, paramInt, y, paramArrayOfUri, paramMap, q, paramLong, parami0, e, f, o, p, v);
  }
  
  public final long c()
  {
    return F.c();
  }
  
  public final boolean d(long paramLong)
  {
    if (B == null)
    {
      for (n localn : C) {
        if (!L) {
          localn.d(X);
        }
      }
      return false;
    }
    return F.d(paramLong);
  }
  
  public final long e(long paramLong, n1 paramn1)
  {
    for (Object localObject2 : D)
    {
      int k;
      if (I == 2) {
        k = 1;
      } else {
        k = 0;
      }
      if (k != 0)
      {
        ??? = d;
        ??? = q.i();
        localObject2 = e;
        if ((??? < localObject2.length) && (??? != -1)) {
          localObject2 = g.m(true, localObject2[q.o()]);
        } else {
          localObject2 = null;
        }
        if ((localObject2 == null) || (r.isEmpty()) || (!c)) {
          break;
        }
        long l1 = h - g.e();
        long l2 = paramLong - l1;
        ??? = e0.c(r, Long.valueOf(l2), true);
        long l3 = r.get(???)).e;
        if (??? != r.size() - 1) {
          paramLong = r.get(??? + 1)).e;
        } else {
          paramLong = l3;
        }
        paramLong = paramn1.a(l2, l3, paramLong) + l1;
        break;
      }
    }
    return paramLong;
  }
  
  public final void f()
  {
    for (n localn : C) {
      if (!v.isEmpty())
      {
        j localj = (j)m0.K(v);
        int k = d.b(localj);
        if (k == 1) {
          K = true;
        } else if ((k == 2) && (!b0) && (r.d())) {
          r.b();
        }
      }
    }
    z.a(this);
  }
  
  public final long g()
  {
    return F.g();
  }
  
  public final void h(long paramLong)
  {
    F.h(paramLong);
  }
  
  public final long i(r5.h[] paramArrayOfh, boolean[] paramArrayOfBoolean1, z4.c0[] paramArrayOfc0, boolean[] paramArrayOfBoolean2, long paramLong)
  {
    Object localObject1 = this;
    Object localObject2 = paramArrayOfh;
    int[] arrayOfInt1 = new int[localObject2.length];
    int[] arrayOfInt2 = new int[localObject2.length];
    int j;
    Object localObject4;
    for (int i = 0; i < localObject2.length; i++)
    {
      localObject3 = paramArrayOfc0[i];
      if (localObject3 == null) {
        j = -1;
      } else {
        j = ((Integer)r.get(localObject3)).intValue();
      }
      arrayOfInt1[i] = j;
      arrayOfInt2[i] = -1;
      localObject3 = localObject2[i];
      if (localObject3 != null)
      {
        localObject3 = ((k)localObject3).a();
        for (j = 0;; j++)
        {
          localObject4 = C;
          if (j >= localObject4.length) {
            break;
          }
          localObject4 = localObject4[j];
          ((n)localObject4).b();
          if (Q.b((z4.i0)localObject3) != -1)
          {
            arrayOfInt2[i] = j;
            break;
          }
        }
      }
    }
    r.clear();
    int k = localObject2.length;
    Object localObject3 = new z4.c0[k];
    int m = localObject2.length;
    z4.c0[] arrayOfc0 = new z4.c0[m];
    int n = localObject2.length;
    r5.h[] arrayOfh = new r5.h[n];
    localObject1 = new n[C.length];
    int i1 = 0;
    int i2 = 0;
    boolean bool1 = false;
    localObject2 = localObject3;
    Object localObject5;
    for (;;)
    {
      localObject5 = paramArrayOfc0;
      Object localObject6 = paramArrayOfh;
      localObject4 = this;
      if (i1 >= C.length) {
        break;
      }
      for (i = 0; i < localObject6.length; i++)
      {
        if (arrayOfInt1[i] == i1) {
          localObject3 = localObject5[i];
        } else {
          localObject3 = null;
        }
        arrayOfc0[i] = localObject3;
        if (arrayOfInt2[i] == i1) {
          localObject3 = localObject6[i];
        } else {
          localObject3 = null;
        }
        arrayOfh[i] = localObject3;
      }
      localObject6 = C[i1];
      ((n)localObject6).b();
      j = M;
      for (i = 0; i < n; i++)
      {
        localObject3 = (m)arrayOfc0[i];
        if ((localObject3 != null) && ((arrayOfh[i] == null) || (paramArrayOfBoolean1[i] == 0)))
        {
          M -= 1;
          if (c != -1)
          {
            localObject4 = b;
            i3 = a;
            ((n)localObject4).b();
            S.getClass();
            i3 = S[i3];
            x6.b.H(V[i3]);
            V[i3] = false;
            c = -1;
          }
          arrayOfc0[i] = null;
        }
      }
      if ((!bool1) && (a0 ? j != 0 : paramLong == X)) {
        i = 0;
      } else {
        i = 1;
      }
      localObject5 = d.q;
      localObject3 = localObject5;
      int i3 = 0;
      while (i3 < n)
      {
        localObject4 = arrayOfh[i3];
        if (localObject4 == null)
        {
          j = i;
          localObject4 = localObject3;
        }
        else
        {
          i4 = Q.b(((k)localObject4).a());
          if (i4 == T)
          {
            d.q = ((r5.h)localObject4);
            localObject3 = localObject4;
          }
          j = i;
          localObject4 = localObject3;
          if (arrayOfc0[i3] == null)
          {
            M += 1;
            m localm = new m((n)localObject6, i4);
            arrayOfc0[i3] = localm;
            paramArrayOfBoolean2[i3] = true;
            j = i;
            localObject4 = localObject3;
            if (S != null)
            {
              localm.c();
              j = i;
              localObject4 = localObject3;
              if (i == 0)
              {
                localObject4 = D[S[i4]];
                if ((!((b0)localObject4).x(paramLong, true)) && (q + s != 0))
                {
                  j = 1;
                  localObject4 = localObject3;
                }
                else
                {
                  j = 0;
                  localObject4 = localObject3;
                }
              }
            }
          }
        }
        i3++;
        i = j;
        localObject3 = localObject4;
      }
      label1033:
      boolean bool2;
      if (M == 0)
      {
        d.n = null;
        O = null;
        Z = true;
        v.clear();
        if (r.d())
        {
          if (K)
          {
            localObject3 = D;
            i3 = localObject3.length;
            for (j = 0; j < i3; j++) {
              localObject3[j].h();
            }
          }
          r.b();
          j = i;
        }
        else
        {
          ((n)localObject6).F();
          j = i;
        }
      }
      else
      {
        if ((!v.isEmpty()) && (!e0.a(localObject3, localObject5)))
        {
          if (!a0)
          {
            long l = 0L;
            if (paramLong < 0L) {
              l = -paramLong;
            }
            localObject5 = ((n)localObject6).z();
            localObject4 = d.a((j)localObject5, paramLong);
            ((r5.h)localObject3).j(l, -9223372036854775807L, w, (b5.n[])localObject4);
            j = d.h.a(d);
            if (((r5.h)localObject3).o() == j)
            {
              j = 0;
              break label1033;
            }
          }
          j = 1;
          if (j != 0)
          {
            Z = true;
            i = 1;
            bool2 = true;
            break label1057;
          }
        }
        bool2 = bool1;
        label1057:
        j = i;
        if (i != 0)
        {
          ((n)localObject6).G(paramLong, bool2);
          for (i3 = 0;; i3++)
          {
            j = i;
            if (i3 >= m) {
              break;
            }
            if (arrayOfc0[i3] != null) {
              paramArrayOfBoolean2[i3] = true;
            }
          }
        }
      }
      A.clear();
      for (i = 0; i < m; i++)
      {
        localObject3 = arrayOfc0[i];
        if (localObject3 != null) {
          A.add((m)localObject3);
        }
      }
      a0 = true;
      i3 = 0;
      for (int i4 = 0; i3 < paramArrayOfh.length; i4 = i)
      {
        localObject3 = arrayOfc0[i3];
        if (arrayOfInt2[i3] == i1)
        {
          localObject3.getClass();
          localObject2[i3] = localObject3;
          r.put(localObject3, Integer.valueOf(i1));
          i = 1;
        }
        else
        {
          i = i4;
          if (arrayOfInt1[i3] == i1)
          {
            if (localObject3 == null) {
              bool2 = true;
            } else {
              bool2 = false;
            }
            x6.b.H(bool2);
            i = i4;
          }
        }
        i3++;
      }
      if (i4 != 0)
      {
        localObject1[i2] = localObject6;
        i = i2 + 1;
        if (i2 == 0)
        {
          d.l = true;
          if (j == 0)
          {
            localObject3 = D;
            if (localObject3.length != 0)
            {
              i2 = i;
              if (localObject6 == localObject3[0]) {
                break label1397;
              }
            }
          }
          ((SparseArray)s.b).clear();
          bool1 = true;
          i2 = i;
        }
        else
        {
          if (i1 < E) {
            bool2 = true;
          } else {
            bool2 = false;
          }
          d.l = bool2;
          i2 = i;
        }
      }
      label1397:
      i1++;
    }
    System.arraycopy(localObject2, 0, localObject5, 0, k);
    paramArrayOfh = (n[])e0.K(i2, (Object[])localObject1);
    D = paramArrayOfh;
    t.getClass();
    F = new v(paramArrayOfh);
    return paramLong;
  }
  
  public final boolean isLoading()
  {
    return F.isLoading();
  }
  
  public final void j()
  {
    for (n localn : C)
    {
      localn.D();
      if ((b0) && (!L)) {
        throw a1.a("Loading finished before preparation is complete.", null);
      }
    }
  }
  
  public final long l(long paramLong)
  {
    n[] arrayOfn = D;
    if (arrayOfn.length > 0)
    {
      boolean bool = arrayOfn[0].G(paramLong, false);
      for (int i = 1;; i++)
      {
        arrayOfn = D;
        if (i >= arrayOfn.length) {
          break;
        }
        arrayOfn[i].G(paramLong, bool);
      }
      if (bool) {
        ((SparseArray)s.b).clear();
      }
    }
    return paramLong;
  }
  
  public final void n(r.a parama, long paramLong)
  {
    z = parama;
    b.d(this);
    Object localObject1 = b.h();
    localObject1.getClass();
    boolean bool = w;
    int i = 0;
    int j = 1;
    int k = 1;
    label201:
    int i1;
    if (bool)
    {
      localObject2 = m;
      localObject3 = new ArrayList((Collection)localObject2);
      localObject4 = new HashMap();
      m = 0;
      for (;;)
      {
        parama = (r.a)localObject4;
        if (m >= ((ArrayList)localObject3).size()) {
          break;
        }
        parama = (d)((List)localObject2).get(m);
        localObject5 = c;
        m++;
        n = m;
        while (n < ((ArrayList)localObject3).size())
        {
          localObject6 = (d)((ArrayList)localObject3).get(n);
          if (TextUtils.equals(c, (CharSequence)localObject5))
          {
            localObject7 = c;
            if (localObject7 != null)
            {
              localObject8 = c;
              if ((localObject8 != null) && (!TextUtils.equals((CharSequence)localObject7, (CharSequence)localObject8)))
              {
                bool = false;
                break label201;
              }
            }
            bool = true;
            x6.b.H(bool);
            localObject7 = c;
            if (localObject7 == null) {
              localObject7 = c;
            }
            parama = a;
            localObject6 = a;
            i1 = e0.a;
            localObject8 = Arrays.copyOf(parama, parama.length + localObject6.length);
            System.arraycopy(localObject6, 0, localObject8, parama.length, localObject6.length);
            parama = new d((String)localObject7, true, (d.b[])localObject8);
            ((ArrayList)localObject3).remove(n);
          }
          else
          {
            n++;
          }
        }
        ((HashMap)localObject4).put(localObject5, parama);
      }
    }
    parama = Collections.emptyMap();
    bool = e.isEmpty();
    Object localObject4 = g;
    Object localObject3 = h;
    A = 0;
    Object localObject2 = new ArrayList();
    Object localObject7 = new ArrayList();
    Object localObject9;
    label575:
    Object localObject10;
    if ((bool ^ true))
    {
      i1 = e.size();
      localObject9 = new int[i1];
      m = 0;
      n = m;
      while (i < e.size())
      {
        localObject5 = e.get(i)).b;
        if ((z <= 0) && (e0.q(2, q) == null))
        {
          if (e0.q(1, q) != null)
          {
            localObject9[i] = 1;
            n++;
          }
          else
          {
            localObject9[i] = -1;
          }
        }
        else
        {
          localObject9[i] = 2;
          m++;
        }
        i++;
      }
      if (m > 0)
      {
        n = m;
        m = k;
      }
      else
      {
        if (n < i1)
        {
          i = 0;
          m = i1 - n;
          n = i;
          i = j;
          break label575;
        }
        m = 0;
        n = i1;
      }
      i = n;
      j = 0;
      n = m;
      m = i;
      i = j;
      localObject6 = new Uri[m];
      localObject5 = new v3.i0[m];
      localObject8 = new int[m];
      j = 0;
      for (i1 = 0; j < e.size(); i1 = k)
      {
        if (n != 0)
        {
          k = i1;
          if (localObject9[j] != 2) {
            break label705;
          }
        }
        if (i != 0)
        {
          k = i1;
          if (localObject9[j] == 1) {}
        }
        else
        {
          localObject10 = (f.b)e.get(j);
          localObject6[i1] = a;
          localObject5[i1] = b;
          localObject8[i1] = j;
          k = i1 + 1;
        }
        label705:
        j++;
      }
      localObject9 = 0q;
      k = e0.p(2, (String)localObject9);
      j = e0.p(1, (String)localObject9);
      if (((j == 1) || ((j == 0) && (g.isEmpty()))) && (k <= 1) && (j + k > 0)) {
        i = 1;
      } else {
        i = 0;
      }
      if ((n == 0) && (j > 0)) {
        n = 1;
      } else {
        n = 0;
      }
      localObject6 = b("main", n, (Uri[])localObject6, (v3.i0[])localObject5, j, k, parama, paramLong);
      ((ArrayList)localObject2).add(localObject6);
      ((ArrayList)localObject7).add(localObject8);
      if ((u) && (i != 0))
      {
        localObject8 = new ArrayList();
        if (k > 0)
        {
          localObject9 = new v3.i0[m];
          for (n = 0; n < m; n++)
          {
            Object localObject11 = localObject5[n];
            String str = e0.q(2, q);
            localObject10 = p.e(str);
            i0.a locala = new i0.a();
            a = a;
            b = b;
            j = s;
            k = ((String)localObject10);
            h = str;
            i = r;
            f = f;
            g = o;
            p = y;
            q = z;
            r = A;
            d = d;
            e = e;
            localObject9[n] = new v3.i0(locala);
          }
          ((ArrayList)localObject8).add(new z4.i0("main", (v3.i0[])localObject9));
          if ((j > 0) && ((j != null) || (g.isEmpty()))) {
            ((ArrayList)localObject8).add(new z4.i0("main:audio", new v3.i0[] { k(localObject5[0], j, false) }));
          }
          localObject5 = k;
          if (localObject5 != null) {
            for (m = 0; m < ((List)localObject5).size(); m++)
            {
              localObject1 = new StringBuilder();
              ((StringBuilder)localObject1).append("main");
              ((StringBuilder)localObject1).append(":cc:");
              ((StringBuilder)localObject1).append(m);
              ((ArrayList)localObject8).add(new z4.i0(((StringBuilder)localObject1).toString(), new v3.i0[] { (v3.i0)((List)localObject5).get(m) }));
            }
          }
        }
        else
        {
          localObject9 = new v3.i0[m];
          for (n = 0; n < m; n++) {
            localObject9[n] = k(localObject5[n], j, true);
          }
          ((ArrayList)localObject8).add(new z4.i0("main", (v3.i0[])localObject9));
        }
        localObject1 = new i0.a();
        a = "ID3";
        k = "application/id3";
        localObject1 = new z4.i0("main:id3", new v3.i0[] { new v3.i0((i0.a)localObject1) });
        ((ArrayList)localObject8).add(localObject1);
        ((n)localObject6).E((z4.i0[])((ArrayList)localObject8).toArray(new z4.i0[0]), new int[] { ((ArrayList)localObject8).indexOf(localObject1) });
      }
    }
    localObject1 = parama;
    parama = (r.a)localObject4;
    localObject4 = localObject7;
    Object localObject8 = new ArrayList(parama.size());
    Object localObject6 = new ArrayList(parama.size());
    Object localObject5 = new ArrayList(parama.size());
    localObject7 = new HashSet();
    for (int m = 0; m < parama.size(); m++)
    {
      localObject10 = getc;
      if (((HashSet)localObject7).add(localObject10))
      {
        ((ArrayList)localObject8).clear();
        ((ArrayList)localObject6).clear();
        ((ArrayList)localObject5).clear();
        i = 0;
        for (n = 1; i < parama.size(); n = j)
        {
          j = n;
          if (e0.a(localObject10, getc))
          {
            localObject9 = (f.a)parama.get(i);
            ((ArrayList)localObject5).add(Integer.valueOf(i));
            ((ArrayList)localObject8).add(a);
            ((ArrayList)localObject6).add(b);
            if (e0.p(1, b.q) == 1) {
              j = 1;
            } else {
              j = 0;
            }
            j = n & j;
          }
          i++;
        }
        localObject10 = g.d("audio:", (String)localObject10);
        i = e0.a;
        localObject9 = b((String)localObject10, 1, (Uri[])((ArrayList)localObject8).toArray(new Uri[0]), (v3.i0[])((ArrayList)localObject6).toArray(new v3.i0[0]), null, Collections.emptyList(), (Map)localObject1, paramLong);
        ((ArrayList)localObject4).add(r7.a.F((Collection)localObject5));
        ((ArrayList)localObject2).add(localObject9);
        if ((u) && (n != 0)) {
          ((n)localObject9).E(new z4.i0[] { new z4.i0((String)localObject10, (v3.i0[])((ArrayList)localObject6).toArray(new v3.i0[0])) }, new int[0]);
        }
      }
    }
    E = ((ArrayList)localObject2).size();
    for (m = 0; m < ((List)localObject3).size(); m++)
    {
      parama = (f.a)((List)localObject3).get(m);
      localObject7 = a0.j.n("subtitle:", m, ":");
      ((StringBuilder)localObject7).append(c);
      localObject7 = ((StringBuilder)localObject7).toString();
      localObject8 = a;
      localObject5 = b;
      localObject6 = Collections.emptyList();
      localObject5 = b((String)localObject7, 3, new Uri[] { localObject8 }, new v3.i0[] { localObject5 }, null, (List)localObject6, (Map)localObject1, paramLong);
      ((ArrayList)localObject4).add(new int[] { m });
      ((ArrayList)localObject2).add(localObject5);
      ((n)localObject5).E(new z4.i0[] { new z4.i0((String)localObject7, new v3.i0[] { b }) }, new int[0]);
    }
    int n = 0;
    C = ((n[])((ArrayList)localObject2).toArray(new n[0]));
    parama = (int[][])((ArrayList)localObject4).toArray(new int[0][]);
    A = C.length;
    for (m = 0; m < E; m++) {
      C[m].d.l = true;
    }
    parama = C;
    i = parama.length;
    for (m = n; m < i; m++)
    {
      localObject7 = parama[m];
      if (!L) {
        ((n)localObject7).d(X);
      }
    }
    D = C;
  }
  
  public final long o()
  {
    return -9223372036854775807L;
  }
  
  public final j0 q()
  {
    j0 localj0 = B;
    localj0.getClass();
    return localj0;
  }
  
  public final void s(long paramLong, boolean paramBoolean)
  {
    for (n localn : D) {
      if ((K) && (!localn.B()))
      {
        int k = D.length;
        for (int m = 0; m < k; m++) {
          D[m].g(paramLong, paramBoolean, V[m]);
        }
      }
    }
  }
  
  public final class a
    implements n.a
  {
    public a() {}
    
    public final void a(z4.d0 paramd0)
    {
      paramd0 = (n)paramd0;
      paramd0 = l.this;
      z.a(paramd0);
    }
    
    public final void c()
    {
      Object localObject = l.this;
      int i = A - 1;
      A = i;
      if (i > 0) {
        return;
      }
      n[] arrayOfn1 = C;
      int j = arrayOfn1.length;
      i = 0;
      int k = i;
      while (i < j)
      {
        localObject = arrayOfn1[i];
        ((n)localObject).b();
        k += Q.a;
        i++;
      }
      localObject = new z4.i0[k];
      n[] arrayOfn2 = C;
      int m = arrayOfn2.length;
      i = 0;
      k = i;
      while (i < m)
      {
        arrayOfn1 = arrayOfn2[i];
        arrayOfn1.b();
        int n = Q.a;
        j = 0;
        while (j < n)
        {
          arrayOfn1.b();
          localObject[k] = Q.a(j);
          j++;
          k++;
        }
        i++;
      }
      B = new j0((z4.i0[])localObject);
      localObject = l.this;
      z.b((r)localObject);
    }
  }
}

/* Location:
 * Qualified Name:     e5.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */