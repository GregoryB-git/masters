package com.google.android.exoplayer2.source.smoothstreaming;

import a4.g.a;
import b1.v;
import g5.a.b;
import java.util.ArrayList;
import r5.k;
import t5.e0;
import t5.l0;
import v3.n1;
import z4.d0;
import z4.d0.a;
import z4.j0;
import z4.r;
import z4.r.a;
import z4.w.a;

public final class c
  implements r, d0.a<b5.h<b>>
{
  public final b.a a;
  public final l0 b;
  public final e0 c;
  public final a4.h d;
  public final g.a e;
  public final t5.c0 f;
  public final w.a o;
  public final t5.b p;
  public final j0 q;
  public final z4.i r;
  public r.a s;
  public g5.a t;
  public b5.h<b>[] u;
  public v v;
  
  public c(g5.a parama, b.a parama1, l0 paraml0, z4.i parami, a4.h paramh, g.a parama2, t5.c0 paramc0, w.a parama3, e0 parame0, t5.b paramb)
  {
    t = parama;
    a = parama1;
    b = paraml0;
    c = parame0;
    d = paramh;
    e = parama2;
    f = paramc0;
    o = parama3;
    p = paramb;
    r = parami;
    parama1 = new z4.i0[f.length];
    for (int i = 0;; i++)
    {
      paraml0 = f;
      if (i >= paraml0.length) {
        break;
      }
      parama2 = j;
      paraml0 = new v3.i0[parama2.length];
      for (int j = 0; j < parama2.length; j++)
      {
        paramc0 = parama2[j];
        paraml0[j] = paramc0.b(paramh.e(paramc0));
      }
      parama1[i] = new z4.i0(Integer.toString(i), paraml0);
    }
    q = new j0(parama1);
    parama = new b5.h[0];
    u = parama;
    parami.getClass();
    v = new v(parama);
  }
  
  public final void a(d0 paramd0)
  {
    paramd0 = (b5.h)paramd0;
    s.a(this);
  }
  
  public final long c()
  {
    return v.c();
  }
  
  public final boolean d(long paramLong)
  {
    return v.d(paramLong);
  }
  
  public final long e(long paramLong, n1 paramn1)
  {
    for (b5.h localh : u) {
      if (a == 2) {
        return e.e(paramLong, paramn1);
      }
    }
    return paramLong;
  }
  
  public final long g()
  {
    return v.g();
  }
  
  public final void h(long paramLong)
  {
    v.h(paramLong);
  }
  
  public final long i(r5.h[] paramArrayOfh, boolean[] paramArrayOfBoolean1, z4.c0[] paramArrayOfc0, boolean[] paramArrayOfBoolean2, long paramLong)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramArrayOfh.length; i++)
    {
      Object localObject1 = paramArrayOfc0[i];
      Object localObject2;
      if (localObject1 != null)
      {
        localObject2 = (b5.h)localObject1;
        localObject1 = paramArrayOfh[i];
        if ((localObject1 != null) && (paramArrayOfBoolean1[i] != 0))
        {
          ((b)e).b((r5.h)localObject1);
          localArrayList.add(localObject2);
        }
        else
        {
          ((b5.h)localObject2).A(null);
          paramArrayOfc0[i] = null;
        }
      }
      if (paramArrayOfc0[i] == null)
      {
        localObject1 = paramArrayOfh[i];
        if (localObject1 != null)
        {
          int j = q.b(((k)localObject1).a());
          a locala = a.a(c, t, j, (r5.h)localObject1, b);
          int k = t.f[j].a;
          localObject1 = p;
          a4.h localh = d;
          localObject2 = e;
          t5.c0 localc0 = f;
          w.a locala1 = o;
          j = i;
          localObject1 = new b5.h(k, null, null, locala, this, (t5.b)localObject1, paramLong, localh, (g.a)localObject2, localc0, locala1);
          localArrayList.add(localObject1);
          paramArrayOfc0[j] = localObject1;
          paramArrayOfBoolean2[j] = true;
        }
      }
    }
    paramArrayOfh = new b5.h[localArrayList.size()];
    u = paramArrayOfh;
    localArrayList.toArray(paramArrayOfh);
    paramArrayOfh = r;
    paramArrayOfBoolean1 = u;
    paramArrayOfh.getClass();
    v = new v(paramArrayOfBoolean1);
    return paramLong;
  }
  
  public final boolean isLoading()
  {
    return v.isLoading();
  }
  
  public final void j()
  {
    c.a();
  }
  
  public final long l(long paramLong)
  {
    b5.h[] arrayOfh = u;
    int i = arrayOfh.length;
    for (int j = 0; j < i; j++) {
      arrayOfh[j].B(paramLong);
    }
    return paramLong;
  }
  
  public final void n(r.a parama, long paramLong)
  {
    s = parama;
    parama.b(this);
  }
  
  public final long o()
  {
    return -9223372036854775807L;
  }
  
  public final j0 q()
  {
    return q;
  }
  
  public final void s(long paramLong, boolean paramBoolean)
  {
    b5.h[] arrayOfh = u;
    int i = arrayOfh.length;
    for (int j = 0; j < i; j++) {
      arrayOfh[j].s(paramLong, paramBoolean);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.smoothstreaming.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */