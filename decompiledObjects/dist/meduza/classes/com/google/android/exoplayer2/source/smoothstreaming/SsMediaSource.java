package com.google.android.exoplayer2.source.smoothstreaming;

import a4.g.a;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import g5.a.b;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t5.c0;
import t5.d0.b;
import t5.d0.d;
import t5.d0.g;
import t5.e0.a;
import t5.f0;
import t5.f0.a;
import t5.j0;
import t5.k.a;
import t5.l;
import t5.l0;
import t5.u;
import t5.w;
import v3.a1;
import v3.h0;
import v3.o0;
import v3.o0.f;
import v3.r1;
import z4.g0;
import z4.n;
import z4.r;
import z4.t.a;
import z4.t.b;
import z4.w.a;

public final class SsMediaSource
  extends z4.a
  implements t5.d0.a<f0<g5.a>>
{
  public final ArrayList<c> A;
  public t5.k B;
  public t5.d0 C;
  public t5.e0 D;
  public l0 E;
  public long F;
  public g5.a G;
  public Handler H;
  public final boolean p;
  public final Uri q;
  public final o0 r;
  public final k.a s;
  public final b.a t;
  public final z4.i u;
  public final a4.h v;
  public final c0 w;
  public final long x;
  public final w.a y;
  public final f0.a<? extends g5.a> z;
  
  static
  {
    h0.a("goog.exo.smoothstreaming");
  }
  
  public SsMediaSource(o0 paramo0, k.a parama, f0.a parama1, b.a parama2, z4.i parami, a4.h paramh, u paramu, long paramLong)
  {
    r = paramo0;
    paramo0 = b;
    paramo0.getClass();
    G = null;
    if (a.equals(Uri.EMPTY))
    {
      paramo0 = null;
    }
    else
    {
      Uri localUri = a;
      int i = v5.e0.a;
      paramo0 = localUri.getPath();
      if (paramo0 == null)
      {
        paramo0 = localUri;
      }
      else
      {
        Matcher localMatcher = v5.e0.j.matcher(paramo0);
        paramo0 = localUri;
        if (localMatcher.matches())
        {
          paramo0 = localUri;
          if (localMatcher.group(1) == null) {
            paramo0 = Uri.withAppendedPath(localUri, "Manifest");
          }
        }
      }
    }
    q = paramo0;
    s = parama;
    z = parama1;
    t = parama2;
    u = parami;
    v = paramh;
    w = paramu;
    x = paramLong;
    y = q(null);
    p = false;
    A = new ArrayList();
  }
  
  public final o0 f()
  {
    return r;
  }
  
  public final void g(r paramr)
  {
    c localc = (c)paramr;
    b5.h[] arrayOfh = u;
    int i = arrayOfh.length;
    for (int j = 0; j < i; j++) {
      arrayOfh[j].A(null);
    }
    s = null;
    A.remove(paramr);
  }
  
  public final void h()
  {
    D.a();
  }
  
  public final void k(d0.d paramd, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    paramd = (f0)paramd;
    paramLong1 = a;
    Object localObject = d;
    Uri localUri = c;
    localObject = new n(d);
    w.getClass();
    y.d((n)localObject, c);
  }
  
  public final r o(t.b paramb, t5.b paramb1, long paramLong)
  {
    w.a locala = q(paramb);
    paramb = new g.a(d.c, 0, paramb);
    paramb = new c(G, t, E, u, v, paramb, w, locala, D, paramb1);
    A.add(paramb);
    return paramb;
  }
  
  public final void p(d0.d paramd, long paramLong1, long paramLong2)
  {
    paramd = (f0)paramd;
    long l = a;
    j0 localj0 = d;
    Object localObject = c;
    localObject = new n(d);
    w.getClass();
    y.g((n)localObject, c);
    G = ((g5.a)f);
    F = (paramLong1 - paramLong2);
    x();
    if (G.d)
    {
      paramLong1 = Math.max(0L, F + 5000L - SystemClock.elapsedRealtime());
      H.postDelayed(new b.k(this, 10), paramLong1);
    }
  }
  
  public final void t(l0 paraml0)
  {
    E = paraml0;
    a4.h localh = v;
    Looper localLooper = Looper.myLooper();
    paraml0 = o;
    x6.b.K(paraml0);
    localh.c(localLooper, paraml0);
    v.a();
    if (p)
    {
      D = new e0.a();
      x();
    }
    else
    {
      B = s.a();
      paraml0 = new t5.d0("SsMediaSource");
      C = paraml0;
      D = paraml0;
      H = v5.e0.l(null);
      y();
    }
  }
  
  public final d0.b u(d0.d paramd, long paramLong1, long paramLong2, IOException paramIOException, int paramInt)
  {
    f0 localf0 = (f0)paramd;
    paramLong1 = a;
    paramd = d;
    Object localObject = c;
    localObject = new n(d);
    ((u)w).getClass();
    if ((!(paramIOException instanceof a1)) && (!(paramIOException instanceof FileNotFoundException)) && (!(paramIOException instanceof w)) && (!(paramIOException instanceof d0.g)))
    {
      int i = l.b;
      for (paramd = paramIOException; paramd != null; paramd = paramd.getCause()) {
        if (((paramd instanceof l)) && (a == 2008))
        {
          i = 1;
          break label129;
        }
      }
      i = 0;
      label129:
      if (i == 0)
      {
        paramLong1 = Math.min((paramInt - 1) * 1000, 5000);
        break label160;
      }
    }
    paramLong1 = -9223372036854775807L;
    label160:
    if (paramLong1 == -9223372036854775807L) {
      paramd = t5.d0.f;
    } else {
      paramd = new d0.b(0, paramLong1);
    }
    boolean bool = true ^ paramd.a();
    y.k((n)localObject, c, paramIOException, bool);
    if (bool) {
      w.getClass();
    }
    return paramd;
  }
  
  public final void w()
  {
    if (p) {
      localObject = G;
    } else {
      localObject = null;
    }
    G = ((g5.a)localObject);
    B = null;
    F = 0L;
    Object localObject = C;
    if (localObject != null)
    {
      ((t5.d0)localObject).e(null);
      C = null;
    }
    localObject = H;
    if (localObject != null)
    {
      ((Handler)localObject).removeCallbacksAndMessages(null);
      H = null;
    }
    v.release();
  }
  
  public final void x()
  {
    b5.h[] arrayOfh;
    int j;
    for (int i = 0; i < A.size(); i++)
    {
      localObject = (c)A.get(i);
      g5.a locala = G;
      t = locala;
      arrayOfh = u;
      j = arrayOfh.length;
      for (k = 0; k < j; k++) {
        ((b)e).c(locala);
      }
      s.a((z4.d0)localObject);
    }
    long l1 = Long.MIN_VALUE;
    Object localObject = G.f;
    int k = localObject.length;
    i = 0;
    long l3;
    long l4;
    for (long l2 = Long.MAX_VALUE; i < k; l2 = l4)
    {
      arrayOfh = localObject[i];
      l3 = l1;
      l4 = l2;
      if (k > 0)
      {
        l4 = Math.min(l2, o[0]);
        j = k - 1;
        l2 = o[j];
        l3 = Math.max(l1, arrayOfh.b(j) + l2);
      }
      i++;
      l1 = l3;
    }
    if (l2 == Long.MAX_VALUE)
    {
      if (G.d) {
        l2 = -9223372036854775807L;
      } else {
        l2 = 0L;
      }
      localObject = G;
      boolean bool = d;
      localObject = new g0(l2, 0L, 0L, 0L, true, bool, bool, (g5.a)localObject, r);
    }
    else
    {
      localObject = G;
      if (d)
      {
        l3 = h;
        l4 = l2;
        if (l3 != -9223372036854775807L)
        {
          l4 = l2;
          if (l3 > 0L) {
            l4 = Math.max(l2, l1 - l3);
          }
        }
        l3 = l1 - l4;
        l1 = l3 - v5.e0.I(x);
        l2 = l1;
        if (l1 < 5000000L) {
          l2 = Math.min(5000000L, l3 / 2L);
        }
        localObject = new g0(-9223372036854775807L, l3, l4, l2, true, true, true, G, r);
      }
      else
      {
        l4 = g;
        if (l4 != -9223372036854775807L) {
          l1 = l4;
        } else {
          l1 -= l2;
        }
        localObject = new g0(l2 + l1, l1, l2, 0L, true, false, false, G, r);
      }
    }
    v((r1)localObject);
  }
  
  public final void y()
  {
    if (C.c()) {
      return;
    }
    f0 localf0 = new f0(B, q, 4, z);
    t5.d0 locald0 = C;
    c0 localc0 = w;
    int i = c;
    long l = locald0.f(localf0, this, ((u)localc0).b(i));
    y.m(new n(a, b, l), c);
  }
  
  public static final class Factory
    implements t.a
  {
    public z4.i a = new z4.i(0);
    public a4.i b = new a4.c();
    public u c = new u();
    public long d = 30000L;
    
    public Factory(a.a parama, k.a parama1) {}
    
    public Factory(k.a parama)
    {
      this(new a.a(parama), parama);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */