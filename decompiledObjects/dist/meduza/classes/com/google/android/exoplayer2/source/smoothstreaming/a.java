package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import b5.d;
import b5.f;
import b5.g;
import b5.m;
import java.util.Collections;
import java.util.List;
import t5.c0;
import t5.c0.a;
import t5.c0.b;
import t5.c0.c;
import t5.k.a;
import t5.l0;
import t5.u;
import v3.i0;
import v3.n1;
import v5.d0;

public final class a
  implements b
{
  public final t5.e0 a;
  public final int b;
  public final f[] c;
  public final t5.k d;
  public r5.h e;
  public g5.a f;
  public int g;
  public z4.b h;
  
  public a(t5.e0 parame0, g5.a parama, int paramInt, r5.h paramh, t5.k paramk)
  {
    a = parame0;
    f = parama;
    b = paramInt;
    e = paramh;
    d = paramk;
    g5.a.b localb = f[paramInt];
    c = new f[paramh.length()];
    for (paramInt = 0; paramInt < c.length; paramInt++)
    {
      int i = paramh.c(paramInt);
      paramk = j[i];
      if (w != null)
      {
        parame0 = e;
        parame0.getClass();
        parame0 = c;
      }
      else
      {
        parame0 = null;
      }
      int j = a;
      int k;
      if (j == 2) {
        k = 4;
      } else {
        k = 0;
      }
      parame0 = new k4.e(3, null, new k4.j(i, j, c, -9223372036854775807L, g, paramk, 0, parame0, k, null, null), Collections.emptyList());
      c[paramInt] = new d(parame0, a, paramk);
    }
  }
  
  public final void a()
  {
    z4.b localb = h;
    if (localb == null)
    {
      a.a();
      return;
    }
    throw localb;
  }
  
  public final void b(r5.h paramh)
  {
    e = paramh;
  }
  
  public final void c(g5.a parama)
  {
    Object localObject = f.f;
    int i = b;
    localObject = localObject[i];
    int j = k;
    g5.a.b localb = f[i];
    if ((j != 0) && (k != 0))
    {
      i = j - 1;
      long l1 = o[i];
      long l2 = ((g5.a.b)localObject).b(i);
      long l3 = o[0];
      if (l2 + l1 > l3)
      {
        j = g;
        j = v5.e0.f(o, l3, true) + j;
        break label123;
      }
    }
    j = g + j;
    label123:
    g = j;
    f = parama;
  }
  
  public final long e(long paramLong, n1 paramn1)
  {
    g5.a.b localb = f.f[b];
    int i = v5.e0.f(o, paramLong, true);
    long[] arrayOfLong = o;
    long l1 = arrayOfLong[i];
    long l2;
    if ((l1 < paramLong) && (i < k - 1)) {
      l2 = arrayOfLong[(i + 1)];
    } else {
      l2 = l1;
    }
    return paramn1.a(paramLong, l1, l2);
  }
  
  public final boolean f(long paramLong, b5.e parame, List<? extends m> paramList)
  {
    if (h != null) {
      return false;
    }
    e.h();
    return false;
  }
  
  public final boolean g(b5.e parame, boolean paramBoolean, c0.c paramc, c0 paramc0)
  {
    c0.a locala = r5.n.a(e);
    paramc = ((u)paramc0).a(locala, paramc);
    if ((paramBoolean) && (paramc != null) && (a == 2))
    {
      paramc0 = e;
      if (paramc0.k(paramc0.d(d), b)) {
        return true;
      }
    }
    paramBoolean = false;
    return paramBoolean;
  }
  
  public final int h(long paramLong, List<? extends m> paramList)
  {
    if ((h == null) && (e.length() >= 2)) {
      return e.n(paramLong, paramList);
    }
    return paramList.size();
  }
  
  public final void i(long paramLong1, long paramLong2, List<? extends m> paramList, g paramg)
  {
    if (h != null) {
      return;
    }
    Object localObject1 = f;
    Object localObject2 = f[b];
    if (k == 0)
    {
      a = (d ^ true);
      return;
    }
    int i;
    if (paramList.isEmpty())
    {
      i = v5.e0.f(o, paramLong2, true);
    }
    else
    {
      j = (int)(((m)paramList.get(paramList.size() - 1)).c() - g);
      i = j;
      if (j < 0)
      {
        h = new z4.b();
        return;
      }
    }
    if (i >= k)
    {
      a = (f.d ^ true);
      return;
    }
    localObject1 = f;
    if (!d)
    {
      l = -9223372036854775807L;
    }
    else
    {
      localObject1 = f[b];
      j = k - 1;
      l = o[j];
      l = ((g5.a.b)localObject1).b(j) + l - paramLong1;
    }
    int k = e.length();
    localObject1 = new b5.n[k];
    for (int j = 0; j < k; j++)
    {
      e.c(j);
      localObject1[j] = new b((g5.a.b)localObject2, i);
    }
    e.j(paramLong2 - paramLong1, l, paramList, (b5.n[])localObject1);
    paramLong1 = o[i];
    long l = ((g5.a.b)localObject2).b(i);
    if (!paramList.isEmpty()) {
      paramLong2 = -9223372036854775807L;
    }
    j = g;
    k = e.i();
    paramList = c[k];
    k = e.c(k);
    boolean bool;
    if (j != null) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.H(bool);
    if (n != null) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.H(bool);
    if (i < n.size()) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.H(bool);
    Object localObject3 = Integer.toString(j[k].p);
    localObject1 = ((Long)n.get(i)).toString();
    localObject1 = m.replace("{bitrate}", (CharSequence)localObject3).replace("{Bitrate}", (CharSequence)localObject3).replace("{start time}", (CharSequence)localObject1).replace("{start_time}", (CharSequence)localObject1);
    localObject2 = d0.d(l, (String)localObject1);
    localObject1 = e.p();
    localObject3 = d;
    k = e.q();
    Object localObject4 = e.s();
    b = new b5.j((t5.k)localObject3, new t5.n((Uri)localObject2, 0L, -1L), (i0)localObject1, k, localObject4, paramLong1, l + paramLong1, paramLong2, -9223372036854775807L, j + i, 1, paramLong1, paramList);
  }
  
  public final void j(b5.e parame) {}
  
  public final void release()
  {
    f[] arrayOff = c;
    int i = arrayOff.length;
    for (int j = 0; j < i; j++) {
      a.release();
    }
  }
  
  public static final class a
    implements b.a
  {
    public final k.a a;
    
    public a(k.a parama)
    {
      a = parama;
    }
    
    public final a a(t5.e0 parame0, g5.a parama, int paramInt, r5.h paramh, l0 paraml0)
    {
      t5.k localk = a.a();
      if (paraml0 != null) {
        localk.f(paraml0);
      }
      return new a(parame0, parama, paramInt, paramh, localk);
    }
  }
  
  public static final class b
    extends b5.b
  {
    public final g5.a.b e;
    
    public b(g5.a.b paramb, int paramInt)
    {
      super(k - 1);
      e = paramb;
    }
    
    public final long a()
    {
      c();
      g5.a.b localb = e;
      int i = (int)d;
      return o[i];
    }
    
    public final long b()
    {
      long l = a();
      return e.b((int)d) + l;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.smoothstreaming.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */