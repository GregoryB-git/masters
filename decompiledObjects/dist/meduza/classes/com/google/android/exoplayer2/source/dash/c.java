package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.SystemClock;
import b5.f;
import b5.l;
import b5.m;
import b5.n;
import b5.o;
import d5.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;
import o7.t;
import t5.c0;
import t5.c0.a;
import t5.c0.b;
import t5.c0.c;
import t5.k.a;
import t5.l0;
import t5.u;
import t5.z;
import v3.i0;
import v3.n1;
import v5.p;
import w3.a0;

public final class c
  implements a
{
  public final t5.e0 a;
  public final c5.a b;
  public final int[] c;
  public final int d;
  public final t5.k e;
  public final long f;
  public final d.c g;
  public final b[] h;
  public r5.h i;
  public d5.c j;
  public int k;
  public z4.b l;
  public boolean m;
  
  public c(t5.e0 parame0, d5.c paramc, c5.a parama, int paramInt1, int[] paramArrayOfInt, r5.h paramh, int paramInt2, t5.k paramk, long paramLong, boolean paramBoolean, ArrayList paramArrayList, d.c paramc1)
  {
    a = parame0;
    j = paramc;
    b = parama;
    c = paramArrayOfInt;
    i = paramh;
    d = paramInt2;
    e = paramk;
    k = paramInt1;
    f = paramLong;
    g = paramc1;
    paramLong = paramc.e(paramInt1);
    paramk = l();
    h = new b[paramh.length()];
    for (paramInt1 = 0; paramInt1 < h.length; paramInt1++)
    {
      d5.j localj = (d5.j)paramk.get(paramh.c(paramInt1));
      parame0 = parama.d(b);
      paramArrayOfInt = h;
      if (parame0 == null) {
        parame0 = (d5.b)b.get(0);
      }
      i0 locali0 = a;
      paramc = s;
      if (p.l(paramc))
      {
        paramc = null;
      }
      else
      {
        int n;
        if ((paramc == null) || ((!paramc.startsWith("video/webm")) && (!paramc.startsWith("audio/webm")) && (!paramc.startsWith("application/webm")) && (!paramc.startsWith("video/x-matroska")) && (!paramc.startsWith("audio/x-matroska")) && (!paramc.startsWith("application/x-matroska")))) {
          n = 0;
        } else {
          n = 1;
        }
        if (n != 0)
        {
          paramc = new i4.d(1);
        }
        else
        {
          if (paramBoolean) {
            n = 4;
          } else {
            n = 0;
          }
          paramc = new k4.e(n, null, null, paramArrayList, paramc1);
        }
        paramc = new b5.d(paramc, paramInt2, locali0);
      }
      paramArrayOfInt[paramInt1] = new b(paramLong, localj, parame0, paramc, 0L, localj.l());
    }
  }
  
  public final void a()
  {
    z4.b localb = l;
    if (localb == null)
    {
      a.a();
      return;
    }
    throw localb;
  }
  
  public final void b(r5.h paramh)
  {
    i = paramh;
  }
  
  public final void d(d5.c paramc, int paramInt)
  {
    try
    {
      j = paramc;
      k = paramInt;
      long l1 = paramc.e(paramInt);
      ArrayList localArrayList = l();
      for (paramInt = 0; paramInt < h.length; paramInt++)
      {
        d5.j localj = (d5.j)localArrayList.get(i.c(paramInt));
        paramc = h;
        paramc[paramInt] = paramc[paramInt].a(l1, localj);
      }
      return;
    }
    catch (z4.b paramc)
    {
      l = paramc;
    }
  }
  
  public final long e(long paramLong, n1 paramn1)
  {
    label157:
    label161:
    for (b localb : h)
    {
      c5.c localc = d;
      if (localc != null)
      {
        long l1 = localc.j(e);
        if (l1 != 0L)
        {
          long l2 = d.g(paramLong, e) + f;
          long l3 = localb.d(l2);
          if (l3 < paramLong)
          {
            if (l1 != -1L) {
              if (l2 >= d.i() + f + l1 - 1L) {
                break label157;
              }
            }
            l1 = localb.d(l2 + 1L);
            break label161;
          }
          l1 = l3;
          return paramn1.a(paramLong, l3, l1);
        }
      }
    }
    return paramLong;
  }
  
  public final boolean f(long paramLong, b5.e parame, List<? extends m> paramList)
  {
    if (l != null) {
      return false;
    }
    i.h();
    return false;
  }
  
  public final boolean g(b5.e parame, boolean paramBoolean, c0.c paramc, c0 paramc0)
  {
    boolean bool = false;
    if (!paramBoolean) {
      return false;
    }
    Object localObject1 = g;
    if (localObject1 != null)
    {
      l1 = d;
      if ((l1 != -9223372036854775807L) && (l1 < g)) {
        n = 1;
      } else {
        n = 0;
      }
      localObject1 = e;
      if (f.d)
      {
        if (!p)
        {
          if (n == 0) {
            break label152;
          }
          if (o)
          {
            p = true;
            o = false;
            localObject1 = b).a;
            L.removeCallbacks(E);
            ((DashMediaSource)localObject1).B();
          }
        }
        n = 1;
        break label155;
      }
      label152:
      n = 0;
      label155:
      if (n != 0) {
        return true;
      }
    }
    if ((!j.d) && ((parame instanceof m)))
    {
      localObject1 = a;
      if (((localObject1 instanceof z)) && (d == 404))
      {
        localObject1 = h[i.d(d)];
        l1 = d.j(e);
        if ((l1 != -1L) && (l1 != 0L))
        {
          long l2 = d.i();
          long l3 = f;
          if (((m)parame).c() > l2 + l3 + l1 - 1L)
          {
            m = true;
            return true;
          }
        }
      }
    }
    int n = i.d(d);
    localObject1 = h[n];
    Object localObject2 = b.d(b.b);
    if ((localObject2 != null) && (!c.equals(localObject2))) {
      return true;
    }
    Object localObject3 = i;
    localObject2 = b.b;
    long l1 = SystemClock.elapsedRealtime();
    int i1 = ((r5.k)localObject3).length();
    int i2 = 0;
    for (n = i2; i2 < i1; n = i3)
    {
      i3 = n;
      if (((r5.h)localObject3).l(i2, l1)) {
        i3 = n + 1;
      }
      i2++;
    }
    localObject3 = new HashSet();
    for (int i3 = 0; i3 < ((List)localObject2).size(); i3++) {
      ((HashSet)localObject3).add(Integer.valueOf(getc));
    }
    i2 = ((HashSet)localObject3).size();
    c5.a locala = b;
    locala.getClass();
    localObject3 = new HashSet();
    localObject2 = locala.b((t)localObject2);
    for (i3 = 0; i3 < ((ArrayList)localObject2).size(); i3++) {
      ((HashSet)localObject3).add(Integer.valueOf(getc));
    }
    localObject2 = new c0.a(i2, i2 - ((HashSet)localObject3).size(), i1, n);
    if ((!((c0.a)localObject2).a(2)) && (!((c0.a)localObject2).a(1))) {
      return false;
    }
    paramc = ((u)paramc0).a((c0.a)localObject2, paramc);
    paramBoolean = bool;
    if (paramc != null) {
      if (!((c0.a)localObject2).a(a))
      {
        paramBoolean = bool;
      }
      else
      {
        n = a;
        if (n == 2)
        {
          paramc0 = i;
          paramBoolean = paramc0.k(paramc0.d(d), b);
        }
        else
        {
          paramBoolean = bool;
          if (n == 1)
          {
            parame = b;
            paramc0 = c;
            l1 = b;
            parame.getClass();
            l1 = SystemClock.elapsedRealtime() + l1;
            c5.a.a(b, l1, a);
            n = c;
            if (n != Integer.MIN_VALUE) {
              c5.a.a(Integer.valueOf(n), l1, b);
            }
            paramBoolean = true;
          }
        }
      }
    }
    return paramBoolean;
  }
  
  public final int h(long paramLong, List<? extends m> paramList)
  {
    if ((l == null) && (i.length() >= 2)) {
      return i.n(paramLong, paramList);
    }
    return paramList.size();
  }
  
  public final void i(long paramLong1, long paramLong2, List<? extends m> paramList, b5.g paramg)
  {
    if (l != null) {
      return;
    }
    long l1 = paramLong2 - paramLong1;
    long l2 = v5.e0.I(j.a);
    long l3 = v5.e0.I(j.b(k).b);
    Object localObject1 = g;
    if (localObject1 != null)
    {
      localObject1 = e;
      localObject2 = f;
      if (!d)
      {
        n = 0;
      }
      else if (p)
      {
        n = 1;
      }
      else
      {
        l4 = h;
        localObject2 = e.ceilingEntry(Long.valueOf(l4));
        if ((localObject2 != null) && (((Long)((Map.Entry)localObject2).getValue()).longValue() < l3 + l2 + paramLong2))
        {
          l3 = ((Long)((Map.Entry)localObject2).getKey()).longValue();
          localObject2 = b).a;
          l4 = V;
          if ((l4 == -9223372036854775807L) || (l4 < l3)) {
            V = l3;
          }
          i2 = 1;
        }
        else
        {
          i2 = 0;
        }
        n = i2;
        if (i2 != 0) {
          if (!o)
          {
            n = i2;
          }
          else
          {
            p = true;
            o = false;
            localObject1 = b).a;
            L.removeCallbacks(E);
            ((DashMediaSource)localObject1).B();
            n = i2;
          }
        }
      }
      if (n != 0) {
        return;
      }
    }
    l2 = v5.e0.I(v5.e0.u(f));
    long l4 = k(l2);
    boolean bool2 = paramList.isEmpty();
    Object localObject2 = null;
    if (bool2) {
      localObject1 = null;
    } else {
      localObject1 = (m)paramList.get(paramList.size() - 1);
    }
    int n = i.length();
    Object localObject3 = new n[n];
    int i2 = 0;
    Object localObject4 = localObject1;
    Object localObject5;
    long l5;
    while (i2 < n)
    {
      localObject5 = h[i2];
      localObject1 = d;
      if (localObject1 == null)
      {
        localObject3[i2] = n.a;
      }
      else
      {
        l5 = ((c5.c)localObject1).d(e, l2) + f;
        long l6 = ((b)localObject5).b(l2);
        if (localObject4 != null) {
          l3 = ((m)localObject4).c();
        } else {
          l3 = v5.e0.j(d.g(paramLong2, e) + f, l5, l6);
        }
        if (l3 < l5) {
          localObject3[i2] = n.a;
        } else {
          localObject3[i2] = new c(m(i2), l3, l6);
        }
      }
      i2++;
    }
    if (j.d)
    {
      localObject1 = h[0];
      if (d.j(e) != 0L)
      {
        l3 = h[0].b(l2);
        l3 = h[0].c(l3);
        paramLong1 = Math.max(0L, Math.min(k(l2), l3) - paramLong1);
        break label637;
      }
    }
    paramLong1 = -9223372036854775807L;
    label637:
    i.j(l1, paramLong1, paramList, (n[])localObject3);
    localObject3 = m(i.i());
    localObject1 = a;
    Object localObject6;
    if (localObject1 != null)
    {
      localObject5 = b;
      if (q == null) {
        localObject1 = o;
      } else {
        localObject1 = null;
      }
      if (d == null) {
        localObject2 = ((d5.j)localObject5).m();
      }
      if ((localObject1 != null) || (localObject2 != null))
      {
        localObject6 = e;
        localObject5 = i.p();
        n = i.q();
        localObject4 = i.s();
        d5.j localj = b;
        if (localObject1 != null)
        {
          paramList = ((i)localObject1).a((i)localObject2, c.a);
          if (paramList != null) {
            localObject1 = paramList;
          }
        }
        else
        {
          localObject1 = localObject2;
        }
        b = new l((t5.k)localObject6, c5.d.a(localj, c.a, (i)localObject1, 0), (i0)localObject5, n, localObject4, a);
        return;
      }
    }
    l3 = e;
    boolean bool3 = l3 < -9223372036854775807L;
    if (bool3) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    if (d.j(l3) == 0L)
    {
      a = bool2;
      return;
    }
    l1 = d.d(e, l2) + f;
    l2 = ((b)localObject3).b(l2);
    if (localObject4 != null) {
      paramLong1 = ((m)localObject4).c();
    } else {
      paramLong1 = v5.e0.j(d.g(paramLong2, e) + f, l1, l2);
    }
    if (paramLong1 < l1)
    {
      l = new z4.b();
      return;
    }
    boolean bool1 = paramLong1 < l2;
    if ((!bool1) && ((!m) || (bool1)))
    {
      if ((bool2) && (((b)localObject3).d(paramLong1) >= l3))
      {
        a = true;
        return;
      }
      int i4 = 1;
      i2 = (int)Math.min(1, l2 - paramLong1 + 1L);
      bool1 = i2;
      if (bool3) {
        for (;;)
        {
          bool1 = i2;
          if (i2 <= 1) {
            break;
          }
          bool1 = i2;
          if (((b)localObject3).d(i2 + paramLong1 - 1L) < l3) {
            break;
          }
          i2--;
        }
      }
      if (!paramList.isEmpty()) {
        paramLong2 = -9223372036854775807L;
      }
      localObject1 = e;
      i2 = d;
      localObject4 = i.p();
      int i3 = i.q();
      localObject5 = i.s();
      localObject6 = b;
      l3 = ((b)localObject3).d(paramLong1);
      paramList = d.f(paramLong1 - f);
      int i1;
      if (a == null)
      {
        paramLong2 = ((b)localObject3).c(paramLong1);
        if (((b)localObject3).e(paramLong1, l4)) {
          bool1 = false;
        } else {
          i1 = 8;
        }
        paramList = new o((t5.k)localObject1, c5.d.a((d5.j)localObject6, c.a, paramList, i1), (i0)localObject4, i3, localObject5, l3, paramLong2, paramLong1, i2, (i0)localObject4);
      }
      else
      {
        i2 = 1;
        while (i4 < i1)
        {
          l1 = i4;
          localObject2 = paramList.a(d.f(l1 + paramLong1 - f), c.a);
          if (localObject2 == null) {
            break;
          }
          i2++;
          i4++;
          paramList = (List<? extends m>)localObject2;
        }
        l5 = i2 + paramLong1 - 1L;
        l2 = ((b)localObject3).c(l5);
        l1 = e;
        if ((l1 == -9223372036854775807L) || (l1 > l2)) {
          l1 = -9223372036854775807L;
        }
        if (((b)localObject3).e(l5, l4)) {
          i1 = 0;
        } else {
          i1 = 8;
        }
        paramList = new b5.j((t5.k)localObject1, c5.d.a((d5.j)localObject6, c.a, paramList, i1), (i0)localObject4, i3, localObject5, l3, l2, paramLong2, l1, paramLong1, i2, -c, a);
      }
      b = paramList;
      return;
    }
    a = bool2;
  }
  
  public final void j(b5.e parame)
  {
    if ((parame instanceof l))
    {
      localObject = (l)parame;
      int n = i.d(d);
      b[] arrayOfb = h;
      b localb = arrayOfb[n];
      if (d == null)
      {
        f localf = a;
        localObject = p;
        if ((localObject instanceof c4.c)) {
          localObject = (c4.c)localObject;
        } else {
          localObject = null;
        }
        if (localObject != null)
        {
          d5.j localj = b;
          localObject = new c5.e(localObject, c);
          arrayOfb[n] = new b(e, localj, c, localf, f, (c5.c)localObject);
        }
      }
    }
    Object localObject = g;
    if (localObject != null)
    {
      long l1 = d;
      if ((l1 == -9223372036854775807L) || (h > l1)) {
        d = h;
      }
      e.o = true;
    }
  }
  
  public final long k(long paramLong)
  {
    d5.c localc = j;
    long l1 = a;
    long l2 = -9223372036854775807L;
    if (l1 == -9223372036854775807L) {
      paramLong = l2;
    } else {
      paramLong -= v5.e0.I(l1 + bk).b);
    }
    return paramLong;
  }
  
  public final ArrayList<d5.j> l()
  {
    List localList = j.b(k).c;
    ArrayList localArrayList = new ArrayList();
    int[] arrayOfInt = c;
    int n = arrayOfInt.length;
    for (int i1 = 0; i1 < n; i1++) {
      localArrayList.addAll(getc);
    }
    return localArrayList;
  }
  
  public final b m(int paramInt)
  {
    b localb1 = h[paramInt];
    d5.b localb = b.d(b.b);
    b localb2 = localb1;
    if (localb != null)
    {
      localb2 = localb1;
      if (!localb.equals(c))
      {
        localb2 = new b(e, b, localb, a, f, d);
        h[paramInt] = localb2;
      }
    }
    return localb2;
  }
  
  public final void release()
  {
    b[] arrayOfb = h;
    int n = arrayOfb.length;
    for (int i1 = 0; i1 < n; i1++)
    {
      f localf = a;
      if (localf != null) {
        a.release();
      }
    }
  }
  
  public static final class a
    implements a.a
  {
    public final k.a a;
    
    public a(k.a parama)
    {
      a = parama;
    }
    
    public final c a(t5.e0 parame0, d5.c paramc, c5.a parama, int paramInt1, int[] paramArrayOfInt, r5.h paramh, int paramInt2, long paramLong, boolean paramBoolean, ArrayList paramArrayList, d.c paramc1, l0 paraml0, a0 parama0)
    {
      parama0 = a.a();
      if (paraml0 != null) {
        parama0.f(paraml0);
      }
      return new c(parame0, paramc, parama, paramInt1, paramArrayOfInt, paramh, paramInt2, parama0, paramLong, paramBoolean, paramArrayList, paramc1);
    }
  }
  
  public static final class b
  {
    public final f a;
    public final d5.j b;
    public final d5.b c;
    public final c5.c d;
    public final long e;
    public final long f;
    
    public b(long paramLong1, d5.j paramj, d5.b paramb, f paramf, long paramLong2, c5.c paramc)
    {
      e = paramLong1;
      b = paramj;
      c = paramb;
      f = paramLong2;
      a = paramf;
      d = paramc;
    }
    
    public final b a(long paramLong, d5.j paramj)
    {
      c5.c localc1 = b.l();
      c5.c localc2 = paramj.l();
      if (localc1 == null) {
        return new b(paramLong, paramj, c, a, f, localc1);
      }
      if (!localc1.h()) {
        return new b(paramLong, paramj, c, a, f, localc2);
      }
      long l1 = localc1.j(paramLong);
      if (l1 == 0L) {
        return new b(paramLong, paramj, c, a, f, localc2);
      }
      long l2 = localc1.i();
      long l3 = localc1.a(l2);
      long l4 = l1 + l2 - 1L;
      long l5 = localc1.a(l4);
      long l6 = localc1.b(l4, paramLong);
      l1 = localc2.i();
      long l7 = localc2.a(l1);
      long l8 = f;
      boolean bool = l6 + l5 < l7;
      if (!bool) {}
      for (l2 = l4 + 1L;; l2 = localc1.g(l7, paramLong))
      {
        l2 = l2 - l1 + l8;
        break;
        if (bool) {
          break label302;
        }
        if (l7 < l3)
        {
          l2 = l8 - (localc2.g(l3, paramLong) - l2);
          break;
        }
      }
      return new b(paramLong, paramj, c, a, l2, localc2);
      label302:
      throw new z4.b();
    }
    
    public final long b(long paramLong)
    {
      long l1 = d.d(e, paramLong);
      long l2 = f;
      return d.k(e, paramLong) + (l1 + l2) - 1L;
    }
    
    public final long c(long paramLong)
    {
      long l = d(paramLong);
      return d.b(paramLong - f, e) + l;
    }
    
    public final long d(long paramLong)
    {
      return d.a(paramLong - f);
    }
    
    public final boolean e(long paramLong1, long paramLong2)
    {
      boolean bool1 = d.h();
      boolean bool2 = true;
      if (bool1) {
        return true;
      }
      bool1 = bool2;
      if (paramLong2 != -9223372036854775807L) {
        if (c(paramLong1) <= paramLong2) {
          bool1 = bool2;
        } else {
          bool1 = false;
        }
      }
      return bool1;
    }
  }
  
  public static final class c
    extends b5.b
  {
    public final c.b e;
    
    public c(c.b paramb, long paramLong1, long paramLong2)
    {
      super(paramLong2);
      e = paramb;
    }
    
    public final long a()
    {
      c();
      return e.d(d);
    }
    
    public final long b()
    {
      c();
      return e.c(d);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */