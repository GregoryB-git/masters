package com.google.android.exoplayer2.source.dash;

import a4.g.a;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import b1.v;
import b5.h.a;
import b5.h.b;
import d5.c;
import d5.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t5.l0;
import v3.i0.a;
import v3.n1;
import w3.a0;
import z4.b0;
import z4.d0;
import z4.d0.a;
import z4.j0;
import z4.r;
import z4.r.a;
import z4.w.a;

public final class b
  implements r, d0.a<b5.h<a>>, h.b<a>
{
  public static final Pattern G = Pattern.compile("CC([1-4])=(.+)");
  public static final Pattern H = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
  public b5.h<a>[] A;
  public c5.f[] B;
  public v C;
  public c D;
  public int E;
  public List<d5.f> F;
  public final int a;
  public final a.a b;
  public final l0 c;
  public final a4.h d;
  public final t5.c0 e;
  public final c5.a f;
  public final long o;
  public final t5.e0 p;
  public final t5.b q;
  public final j0 r;
  public final a[] s;
  public final z4.i t;
  public final d u;
  public final IdentityHashMap<b5.h<a>, d.c> v;
  public final w.a w;
  public final g.a x;
  public final a0 y;
  public r.a z;
  
  public b(int paramInt1, c paramc, c5.a parama, int paramInt2, a.a parama1, l0 paraml0, a4.h paramh, g.a parama2, t5.c0 paramc0, w.a parama3, long paramLong, t5.e0 parame0, t5.b paramb, z4.i parami, DashMediaSource.c paramc1, a0 parama0)
  {
    a = paramInt1;
    D = paramc;
    f = parama;
    E = paramInt2;
    b = parama1;
    c = paraml0;
    d = paramh;
    x = parama2;
    e = paramc0;
    w = parama3;
    o = paramLong;
    p = parame0;
    q = paramb;
    t = parami;
    y = parama0;
    u = new d(paramc, paramc1, paramb);
    int i = 0;
    A = new b5.h[0];
    B = new c5.f[0];
    v = new IdentityHashMap();
    parama = A;
    parami.getClass();
    C = new v(parama);
    paramc = paramc.b(paramInt2);
    parami = d;
    F = parami;
    parama3 = c;
    int j = parama3.size();
    parama2 = new SparseIntArray(j);
    parama1 = new ArrayList(j);
    paraml0 = new SparseArray(j);
    for (paramInt1 = 0; paramInt1 < j; paramInt1++)
    {
      parama2.put(geta, paramInt1);
      paramc = new ArrayList();
      paramc.add(Integer.valueOf(paramInt1));
      parama1.add(paramc);
      paraml0.put(paramInt1, paramc);
    }
    label369:
    label427:
    label520:
    int n;
    for (paramInt2 = i;; paramInt2++)
    {
      paramInt1 = 0;
      if (paramInt2 >= j) {
        break;
      }
      paramc0 = (d5.a)parama3.get(paramInt2);
      parama = e;
      while (paramInt1 < parama.size())
      {
        paramc = (e)parama.get(paramInt1);
        if ("http://dashif.org/guidelines/trickmode".equals(a)) {
          break label369;
        }
        paramInt1++;
      }
      paramc = null;
      parama = paramc;
      if (paramc == null)
      {
        paramc = f;
        for (paramInt1 = 0; paramInt1 < paramc.size(); paramInt1++)
        {
          parama = (e)paramc.get(paramInt1);
          if ("http://dashif.org/guidelines/trickmode".equals(a)) {
            break label427;
          }
        }
        parama = null;
      }
      if (parama != null)
      {
        paramInt1 = parama2.get(Integer.parseInt(b), -1);
        if (paramInt1 != -1) {}
      }
      else
      {
        paramInt1 = paramInt2;
      }
      k = paramInt1;
      if (paramInt1 == paramInt2)
      {
        parama = f;
        for (i = 0; i < parama.size(); i++)
        {
          paramc = (e)parama.get(i);
          if ("urn:mpeg:dash:adaptation-set-switching:2016".equals(a)) {
            break label520;
          }
        }
        paramc = null;
        k = paramInt1;
        if (paramc != null)
        {
          paramc = b;
          i = v5.e0.a;
          paramc = paramc.split(",", -1);
          m = paramc.length;
          i = 0;
          for (;;)
          {
            k = paramInt1;
            if (i >= m) {
              break;
            }
            n = parama2.get(Integer.parseInt(paramc[i]), -1);
            k = paramInt1;
            if (n != -1) {
              k = Math.min(paramInt1, n);
            }
            i++;
            paramInt1 = k;
          }
        }
      }
      if (k != paramInt2)
      {
        paramc = (List)paraml0.get(paramInt2);
        parama = (List)paraml0.get(k);
        parama.addAll(paramc);
        paraml0.put(paramInt2, parama);
        parama1.remove(paramc);
      }
    }
    int m = parama1.size();
    parame0 = new int[m][];
    for (paramInt1 = 0; paramInt1 < m; paramInt1++)
    {
      paramc = r7.a.F((Collection)parama1.get(paramInt1));
      parame0[paramInt1] = paramc;
      Arrays.sort(paramc);
    }
    paramc = new boolean[m];
    paramc1 = new v3.i0[m][];
    i = 0;
    paramInt2 = 0;
    while (i < m)
    {
      parama = parame0[i];
      j = parama.length;
      for (paramInt1 = 0; paramInt1 < j; paramInt1++)
      {
        parama1 = getc;
        for (k = 0; k < parama1.size(); k++) {
          if (!getd.isEmpty())
          {
            k = 1;
            break label831;
          }
        }
      }
      k = 0;
      label831:
      paramInt1 = paramInt2;
      if (k != 0)
      {
        paramc[i] = 1;
        paramInt1 = paramInt2 + 1;
      }
      for (j : parame0[i])
      {
        paraml0 = (d5.a)parama3.get(j);
        parama1 = getd;
        for (j = 0; j < parama1.size(); j++)
        {
          parama2 = (e)parama1.get(j);
          if ("urn:scte:dash:cc:cea-608:2015".equals(a))
          {
            parama = new i0.a();
            k = "application/cea-608";
            a = a0.j.m(new StringBuilder(), a, ":cea608");
            paraml0 = new v3.i0(parama);
            parama = G;
          }
          else
          {
            if (!"urn:scte:dash:cc:cea-708:2015".equals(a)) {
              continue;
            }
            parama = new i0.a();
            k = "application/cea-708";
            a = a0.j.m(new StringBuilder(), a, ":cea708");
            paraml0 = new v3.i0(parama);
            parama = H;
          }
          parama1 = b;
          if (parama1 == null)
          {
            parama = new v3.i0[1];
            parama[0] = paraml0;
          }
          else
          {
            paramInt2 = v5.e0.a;
            parama2 = parama1.split(";", -1);
            paramb = new v3.i0[parama2.length];
            paramInt2 = 0;
            paramc0 = parama;
          }
          for (;;)
          {
            parama1 = paramc;
            parama = paramb;
            if (paramInt2 < parama2.length)
            {
              parama0 = paramc0.matcher(parama2[paramInt2]);
              if (!parama0.matches())
              {
                parama = new v3.i0[1];
                parama[0] = paraml0;
                parama1 = paramc;
              }
            }
            else
            {
              paramc = parama1;
              break;
            }
            k = Integer.parseInt(parama0.group(1));
            parama = new i0.a(paraml0);
            parama1 = new StringBuilder();
            parama1.append(a);
            parama1.append(":");
            parama1.append(k);
            a = parama1.toString();
            C = k;
            c = parama0.group(2);
            paramb[paramInt2] = new v3.i0(parama);
            paramInt2++;
          }
        }
      }
      parama = new v3.i0[0];
      paramc1[i] = parama;
      paramInt2 = paramInt1;
      if (parama.length != 0) {
        paramInt2 = paramInt1 + 1;
      }
      i++;
    }
    paramInt1 = parami.size() + (paramInt2 + m);
    parama2 = new z4.i0[paramInt1];
    paramc0 = new a[paramInt1];
    int k = 0;
    paramInt2 = 0;
    parama = parame0;
    i = m;
    parama1 = parama3;
    while (k < i)
    {
      parama3 = parama[k];
      paraml0 = new ArrayList();
      j = parama3.length;
      for (paramInt1 = 0; paramInt1 < j; paramInt1++) {
        paraml0.addAll(getc);
      }
      j = paraml0.size();
      parame0 = new v3.i0[j];
      for (paramInt1 = 0; paramInt1 < j; paramInt1++)
      {
        paramb = geta;
        parame0[paramInt1] = paramb.b(paramh.e(paramb));
      }
      paramb = (d5.a)parama1.get(parama3[0]);
      paramInt1 = a;
      if (paramInt1 != -1) {
        paraml0 = Integer.toString(paramInt1);
      } else {
        paraml0 = f.h("unset:", k);
      }
      paramInt1 = paramInt2 + 1;
      if (paramc[k] != 0)
      {
        j = paramInt1;
        paramInt1++;
      }
      else
      {
        j = -1;
      }
      if (paramc1[k].length != 0)
      {
        n = paramInt1 + 1;
        m = paramInt1;
        paramInt1 = n;
      }
      else
      {
        m = -1;
      }
      parama2[paramInt2] = new z4.i0(paraml0, parame0);
      paramc0[paramInt2] = new a(b, 0, parama3, paramInt2, j, m, -1);
      if (j != -1)
      {
        paramb = g.d(paraml0, ":emsg");
        parame0 = new i0.a();
        a = paramb;
        k = "application/x-emsg";
        parama2[j] = new z4.i0(paramb, new v3.i0[] { new v3.i0(parame0) });
        paramc0[j] = new a(5, 1, parama3, paramInt2, -1, -1, -1);
      }
      if (m != -1)
      {
        parama2[m] = new z4.i0(g.d(paraml0, ":cc"), paramc1[k]);
        paramc0[m] = new a(3, 1, parama3, paramInt2, -1, -1, -1);
      }
      k++;
      paramInt2 = paramInt1;
    }
    paramInt1 = 0;
    while (paramInt1 < parami.size())
    {
      paramc = (d5.f)parami.get(paramInt1);
      parama = new i0.a();
      a = paramc.a();
      k = "application/x-emsg";
      parama1 = new v3.i0(parama);
      parama = new StringBuilder();
      parama.append(paramc.a());
      parama.append(":");
      parama.append(paramInt1);
      parama2[paramInt2] = new z4.i0(parama.toString(), new v3.i0[] { parama1 });
      paramc0[paramInt2] = new a(5, 2, new int[0], -1, -1, -1, paramInt1);
      paramInt1++;
      paramInt2++;
    }
    paramc = Pair.create(new j0(parama2), paramc0);
    r = ((j0)first);
    s = ((a[])second);
  }
  
  public final void a(d0 paramd0)
  {
    paramd0 = (b5.h)paramd0;
    z.a(this);
  }
  
  public final long c()
  {
    return C.c();
  }
  
  public final boolean d(long paramLong)
  {
    return C.d(paramLong);
  }
  
  public final long e(long paramLong, n1 paramn1)
  {
    for (b5.h localh : A) {
      if (a == 2) {
        return e.e(paramLong, paramn1);
      }
    }
    return paramLong;
  }
  
  public final int f(int[] paramArrayOfInt, int paramInt)
  {
    paramInt = paramArrayOfInt[paramInt];
    if (paramInt == -1) {
      return -1;
    }
    int i = s[paramInt].e;
    for (paramInt = 0; paramInt < paramArrayOfInt.length; paramInt++)
    {
      int j = paramArrayOfInt[paramInt];
      if ((j == i) && (s[j].c == 0)) {
        return paramInt;
      }
    }
    return -1;
  }
  
  public final long g()
  {
    return C.g();
  }
  
  public final void h(long paramLong)
  {
    C.h(paramLong);
  }
  
  public final long i(r5.h[] paramArrayOfh, boolean[] paramArrayOfBoolean1, z4.c0[] paramArrayOfc0, boolean[] paramArrayOfBoolean2, long paramLong)
  {
    Object localObject1 = paramArrayOfh;
    Object localObject2 = new int[localObject1.length];
    Object localObject3;
    for (int i = 0; i < localObject1.length; i++)
    {
      localObject3 = localObject1[i];
      if (localObject3 != null) {
        localObject2[i] = r.b(((r5.k)localObject3).a());
      } else {
        localObject2[i] = -1;
      }
    }
    for (i = 0; i < localObject1.length; i++) {
      if ((localObject1[i] == null) || (paramArrayOfBoolean1[i] == 0))
      {
        localObject3 = paramArrayOfc0[i];
        if ((localObject3 instanceof b5.h))
        {
          ((b5.h)localObject3).A(this);
        }
        else if ((localObject3 instanceof h.a))
        {
          localObject3 = (h.a)localObject3;
          x6.b.H(e.d[c]);
          e.d[c] = false;
        }
        paramArrayOfc0[i] = null;
      }
    }
    boolean bool;
    for (i = 0;; i++)
    {
      j = localObject1.length;
      bool = true;
      if (i >= j) {
        break;
      }
      paramArrayOfBoolean1 = paramArrayOfc0[i];
      if (((paramArrayOfBoolean1 instanceof z4.k)) || ((paramArrayOfBoolean1 instanceof h.a)))
      {
        j = f((int[])localObject2, i);
        if (j == -1)
        {
          bool = paramArrayOfc0[i] instanceof z4.k;
        }
        else
        {
          paramArrayOfBoolean1 = paramArrayOfc0[i];
          if ((!(paramArrayOfBoolean1 instanceof h.a)) || (a != paramArrayOfc0[j])) {
            bool = false;
          }
        }
        if (!bool)
        {
          paramArrayOfBoolean1 = paramArrayOfc0[i];
          if ((paramArrayOfBoolean1 instanceof h.a))
          {
            paramArrayOfBoolean1 = (h.a)paramArrayOfBoolean1;
            x6.b.H(e.d[c]);
            e.d[c] = false;
          }
          paramArrayOfc0[i] = null;
        }
      }
    }
    localObject1 = paramArrayOfc0;
    int j = 0;
    paramArrayOfBoolean1 = (boolean[])localObject2;
    int m;
    for (;;)
    {
      localObject2 = paramArrayOfh;
      if (j >= localObject2.length) {
        break;
      }
      r5.h localh = localObject2[j];
      if (localh == null)
      {
        localObject2 = localObject1;
      }
      else
      {
        localObject3 = localObject1[j];
        if (localObject3 == null)
        {
          paramArrayOfBoolean2[j] = true;
          i = paramArrayOfBoolean1[j];
          localObject3 = s[i];
          i = c;
          if (i == 0)
          {
            i = f;
            if (i != -1) {
              bool = true;
            } else {
              bool = false;
            }
            if (bool)
            {
              localObject2 = r.a(i);
              i = 1;
            }
            else
            {
              i = 0;
              localObject2 = null;
            }
            int k = g;
            if (k != -1) {
              m = 1;
            } else {
              m = 0;
            }
            if (m != 0)
            {
              localObject1 = r.a(k);
              i += a;
            }
            else
            {
              localObject1 = null;
            }
            v3.i0[] arrayOfi0 = new v3.i0[i];
            int[] arrayOfInt = new int[i];
            if (bool)
            {
              arrayOfi0[0] = d[0];
              arrayOfInt[0] = 5;
              i = 1;
            }
            else
            {
              i = 0;
            }
            localObject2 = new ArrayList();
            if (m != 0) {
              for (m = 0; m < a; m++)
              {
                v3.i0 locali0 = d[m];
                arrayOfi0[i] = locali0;
                arrayOfInt[i] = 3;
                ((ArrayList)localObject2).add(locali0);
                i++;
              }
            }
            if ((D.d) && (bool))
            {
              localObject1 = u;
              localObject1 = new d.c((d)localObject1, a);
            }
            else
            {
              localObject1 = null;
            }
            localObject2 = b.a(p, D, f, E, a, localh, b, o, bool, (ArrayList)localObject2, (d.c)localObject1, c, y);
            localObject2 = new b5.h(b, arrayOfInt, arrayOfi0, (b5.i)localObject2, this, q, paramLong, d, x, e, w);
            try
            {
              v.put(localObject2, localObject1);
              paramArrayOfc0[j] = localObject2;
              localObject2 = paramArrayOfc0;
            }
            finally {}
          }
          else
          {
            localObject2 = localObject1;
            if (i == 2)
            {
              localObject1[j] = new c5.f((d5.f)F.get(d), ad[0], D.d);
              localObject2 = localObject1;
            }
          }
        }
        else
        {
          localObject2 = localObject1;
          if ((localObject3 instanceof b5.h))
          {
            ((a)e).b(localh);
            localObject2 = localObject1;
          }
        }
      }
      j++;
      localObject1 = localObject2;
    }
    label1121:
    for (i = 0; i < paramArrayOfh.length; i++) {
      if ((localObject1[i] == null) && (paramArrayOfh[i] != null))
      {
        j = paramArrayOfBoolean1[i];
        paramArrayOfc0 = s[j];
        if (c == 1)
        {
          j = f(paramArrayOfBoolean1, i);
          if (j == -1)
          {
            localObject1[i] = new z4.k();
          }
          else
          {
            paramArrayOfBoolean2 = (b5.h)localObject1[j];
            m = b;
            for (j = 0; j < v.length; j++) {
              if (b[j] == m)
              {
                x6.b.H(d[j] ^ 0x1);
                d[j] = true;
                v[j].x(paramLong, true);
                localObject1[i] = new h.a(paramArrayOfBoolean2, paramArrayOfBoolean2, v[j], j);
                break label1121;
              }
            }
            throw new IllegalStateException();
          }
        }
        else {}
      }
    }
    paramArrayOfBoolean1 = new ArrayList();
    paramArrayOfh = new ArrayList();
    j = localObject1.length;
    for (i = 0; i < j; i++)
    {
      paramArrayOfc0 = localObject1[i];
      if ((paramArrayOfc0 instanceof b5.h)) {
        paramArrayOfBoolean1.add((b5.h)paramArrayOfc0);
      } else if ((paramArrayOfc0 instanceof c5.f)) {
        paramArrayOfh.add((c5.f)paramArrayOfc0);
      }
    }
    paramArrayOfc0 = new b5.h[paramArrayOfBoolean1.size()];
    A = paramArrayOfc0;
    paramArrayOfBoolean1.toArray(paramArrayOfc0);
    paramArrayOfBoolean1 = new c5.f[paramArrayOfh.size()];
    B = paramArrayOfBoolean1;
    paramArrayOfh.toArray(paramArrayOfBoolean1);
    paramArrayOfBoolean1 = t;
    paramArrayOfh = A;
    paramArrayOfBoolean1.getClass();
    C = new v(paramArrayOfh);
    return paramLong;
  }
  
  public final boolean isLoading()
  {
    return C.isLoading();
  }
  
  public final void j()
  {
    p.a();
  }
  
  public final long l(long paramLong)
  {
    Object localObject = A;
    int i = localObject.length;
    int j = 0;
    for (int k = 0; k < i; k++) {
      localObject[k].B(paramLong);
    }
    localObject = B;
    i = localObject.length;
    for (k = j; k < i; k++) {
      localObject[k].c(paramLong);
    }
    return paramLong;
  }
  
  public final void n(r.a parama, long paramLong)
  {
    z = parama;
    parama.b(this);
  }
  
  public final long o()
  {
    return -9223372036854775807L;
  }
  
  public final j0 q()
  {
    return r;
  }
  
  public final void s(long paramLong, boolean paramBoolean)
  {
    b5.h[] arrayOfh = A;
    int i = arrayOfh.length;
    for (int j = 0; j < i; j++) {
      arrayOfh[j].s(paramLong, paramBoolean);
    }
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
    
    public a(int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
    {
      b = paramInt1;
      a = paramArrayOfInt;
      c = paramInt2;
      e = paramInt3;
      f = paramInt4;
      g = paramInt5;
      d = paramInt6;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */