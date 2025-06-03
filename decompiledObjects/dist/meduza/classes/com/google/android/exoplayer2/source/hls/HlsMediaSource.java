package com.google.android.exoplayer2.source.hls;

import a4.g.a;
import android.os.Handler;
import android.os.Looper;
import e5.d;
import e5.l;
import e5.n;
import f5.e.a;
import f5.e.c;
import f5.e.d;
import f5.e.e;
import f5.f;
import f5.j;
import f5.j.d;
import java.util.ArrayList;
import java.util.List;
import o7.t;
import t5.c0;
import t5.d0;
import t5.k.a;
import t5.l0;
import t5.u;
import v3.h0;
import v3.o0;
import v3.o0.e;
import v3.o0.f;
import v3.o0.g;
import v5.e0;
import w3.a0;
import w3.v;
import z4.b0;
import z4.g0;
import z4.r;
import z4.t.a;
import z4.t.b;
import z4.w.a;

public final class HlsMediaSource
  extends z4.a
  implements j.d
{
  public final o0 A;
  public o0.e B;
  public l0 C;
  public final e5.i p;
  public final o0.g q;
  public final e5.h r;
  public final z4.i s;
  public final a4.h t;
  public final c0 u;
  public final boolean v;
  public final int w;
  public final boolean x;
  public final j y;
  public final long z;
  
  static
  {
    h0.a("goog.exo.hls");
  }
  
  public HlsMediaSource(o0 paramo0, e5.h paramh, d paramd, z4.i parami, a4.h paramh1, u paramu, f5.b paramb, long paramLong, boolean paramBoolean, int paramInt)
  {
    o0.g localg = b;
    localg.getClass();
    q = localg;
    A = paramo0;
    B = c;
    r = paramh;
    p = paramd;
    s = parami;
    t = paramh1;
    u = paramu;
    y = paramb;
    z = paramLong;
    v = paramBoolean;
    w = paramInt;
    x = false;
  }
  
  public static e.a x(long paramLong, t paramt)
  {
    Object localObject1 = null;
    int i = 0;
    while (i < paramt.size())
    {
      Object localObject2 = (e.a)paramt.get(i);
      boolean bool = e < paramLong;
      if ((bool) || (!t))
      {
        localObject2 = localObject1;
        if (bool) {
          break;
        }
      }
      i++;
      localObject1 = localObject2;
    }
    return (e.a)localObject1;
  }
  
  public final o0 f()
  {
    return A;
  }
  
  public final void g(r paramr)
  {
    l locall = (l)paramr;
    b.c(locall);
    for (n localn : C)
    {
      if (L) {
        for (paramr : D)
        {
          paramr.h();
          a4.e locale = h;
          if (locale != null)
          {
            locale.f(e);
            h = null;
            g = null;
          }
        }
      }
      r.e(localn);
      z.removeCallbacksAndMessages(null);
      P = true;
      A.clear();
    }
    z = null;
  }
  
  public final void h()
  {
    y.j();
  }
  
  public final r o(t.b paramb, t5.b paramb1, long paramLong)
  {
    w.a locala = q(paramb);
    g.a locala1 = new g.a(d.c, 0, paramb);
    e5.i locali = p;
    j localj = y;
    e5.h localh = r;
    paramb = C;
    a4.h localh1 = t;
    c0 localc0 = u;
    z4.i locali1 = s;
    boolean bool1 = v;
    int i = w;
    boolean bool2 = x;
    a0 locala0 = o;
    x6.b.K(locala0);
    return new l(locali, localj, localh, paramb, localh1, locala1, localc0, locala, paramb1, locali1, bool1, i, bool2, locala0);
  }
  
  public final void t(l0 paraml0)
  {
    C = paraml0;
    a4.h localh = t;
    Looper localLooper = Looper.myLooper();
    localLooper.getClass();
    paraml0 = o;
    x6.b.K(paraml0);
    localh.c(localLooper, paraml0);
    t.a();
    paraml0 = q(null);
    y.f(q.a, paraml0, this);
  }
  
  public final void w()
  {
    y.stop();
    t.release();
  }
  
  public final void y(f5.e parame)
  {
    long l1;
    if (p) {
      l1 = e0.R(h);
    } else {
      l1 = -9223372036854775807L;
    }
    int i = d;
    long l2;
    if ((i != 2) && (i != 1)) {
      l2 = -9223372036854775807L;
    } else {
      l2 = l1;
    }
    Object localObject = y.h();
    localObject.getClass();
    x6.b localb = new x6.b((f)localObject);
    long l4;
    long l6;
    if (y.g())
    {
      long l3 = h - y.e();
      if (o) {
        l4 = l3 + u;
      } else {
        l4 = -9223372036854775807L;
      }
      long l5;
      if (p) {
        l5 = e0.I(e0.u(z)) - (h + u);
      } else {
        l5 = 0L;
      }
      l6 = B.a;
      if (l6 != -9223372036854775807L)
      {
        l6 = e0.I(l6);
      }
      else
      {
        localObject = v;
        l6 = e;
        if (l6 != -9223372036854775807L)
        {
          l6 = u - l6;
        }
        else
        {
          l6 = d;
          if ((l6 == -9223372036854775807L) || (n == -9223372036854775807L))
          {
            l6 = c;
            if (l6 == -9223372036854775807L) {
              l6 = 3L * m;
            }
          }
        }
        l6 += l5;
      }
      l6 = e0.j(l6, l5, u + l5);
      localObject = A.c;
      if ((d == -3.4028235E38F) && (e == -3.4028235E38F))
      {
        localObject = v;
        if ((c == -9223372036854775807L) && (d == -9223372036854775807L))
        {
          i = 1;
          break label384;
        }
      }
      i = 0;
      label384:
      long l7 = e0.R(l6);
      float f1;
      if (i != 0) {
        f1 = 1.0F;
      } else {
        f1 = B.d;
      }
      float f2;
      if (i != 0) {
        f2 = 1.0F;
      } else {
        f2 = B.e;
      }
      B = new o0.e(l7, -9223372036854775807L, -9223372036854775807L, f1, f2);
      l6 = e;
      if (l6 == -9223372036854775807L) {
        l6 = u + l5 - e0.I(l7);
      }
      if (!g)
      {
        localObject = x(l6, s);
        if (localObject == null)
        {
          if (r.isEmpty())
          {
            l6 = 0L;
            break label597;
          }
          localObject = r;
          localObject = (e.c)((List)localObject).get(e0.c((List)localObject, Long.valueOf(l6), true));
          e.a locala = x(l6, u);
          if (locala != null)
          {
            l6 = e;
            break label597;
          }
        }
        l6 = e;
      }
      label597:
      boolean bool;
      if ((d == 2) && (f)) {
        bool = true;
      } else {
        bool = false;
      }
      parame = new g0(l2, l1, l4, u, l3, l6, true, o ^ true, bool, localb, A, B);
    }
    else
    {
      if ((e != -9223372036854775807L) && (!r.isEmpty()))
      {
        if (!g)
        {
          l6 = e;
          if (l6 != u)
          {
            localObject = r;
            l6 = getcvalueOfe;
            break label757;
          }
        }
        l6 = e;
      }
      else
      {
        label757:
        l6 = 0L;
      }
      l4 = u;
      parame = new g0(l2, l1, l4, l4, 0L, l6, true, false, true, localb, A, null);
    }
    v(parame);
  }
  
  public static final class Factory
    implements t.a
  {
    public final e5.h a;
    public d b;
    public f5.a c;
    public v d;
    public z4.i e;
    public a4.i f;
    public u g;
    public boolean h;
    public int i;
    public long j;
    
    public Factory(k.a parama)
    {
      a = parama;
      f = new a4.c();
      c = new f5.a();
      d = f5.b.w;
      b = e5.i.a;
      g = new u();
      e = new z4.i(0);
      i = 1;
      j = -9223372036854775807L;
      h = true;
    }
    
    public final HlsMediaSource a(o0 paramo0)
    {
      b.getClass();
      Object localObject1 = c;
      Object localObject2 = b.d;
      Object localObject3 = localObject1;
      if (!((List)localObject2).isEmpty()) {
        localObject3 = new f5.c((f5.a)localObject1, (List)localObject2);
      }
      e5.h localh1 = a;
      localObject1 = b;
      localObject2 = e;
      a4.h localh = f.a(paramo0);
      u localu = g;
      v localv = d;
      e5.h localh2 = a;
      localv.getClass();
      return new HlsMediaSource(paramo0, localh1, (d)localObject1, (z4.i)localObject2, localh, localu, new f5.b(localh2, localu, (f5.i)localObject3), j, h, i);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.HlsMediaSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */