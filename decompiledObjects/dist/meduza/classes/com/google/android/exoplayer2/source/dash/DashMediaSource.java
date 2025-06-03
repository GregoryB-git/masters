package com.google.android.exoplayer2.source.dash;

import a4.g.a;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import d5.g;
import d5.j;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t5.c0;
import t5.d0.b;
import t5.d0.d;
import t5.d0.g;
import t5.f0;
import t5.f0.a;
import t5.j0;
import t5.k;
import t5.k.a;
import t5.l0;
import t5.u;
import t5.w;
import v3.a1;
import v3.h0;
import v3.o0;
import v3.o0.e;
import v3.o0.f;
import v3.o0.g;
import v3.r1;
import v3.r1.b;
import v3.r1.c;
import v5.x;
import v5.x.a;
import v5.x.b;
import v5.x.c;
import w3.a0;
import z4.r;
import z4.s;
import z4.t.a;
import z4.t.b;
import z4.w.a;

public final class DashMediaSource
  extends z4.a
{
  public final e A;
  public final Object B;
  public final SparseArray<b> C;
  public final b.m D;
  public final u.a E;
  public final c F;
  public final t5.e0 G;
  public k H;
  public t5.d0 I;
  public l0 J;
  public c5.b K;
  public Handler L;
  public o0.e M;
  public Uri N;
  public Uri O;
  public d5.c P;
  public boolean Q;
  public long R;
  public long S;
  public long T;
  public int U;
  public long V;
  public int W;
  public final o0 p;
  public final boolean q;
  public final k.a r;
  public final a.a s;
  public final z4.i t;
  public final a4.h u;
  public final c0 v;
  public final c5.a w;
  public final long x;
  public final w.a y;
  public final f0.a<? extends d5.c> z;
  
  static
  {
    h0.a("goog.exo.dash");
  }
  
  public DashMediaSource(o0 paramo0, k.a parama, f0.a parama1, a.a parama2, z4.i parami, a4.h paramh, u paramu, long paramLong)
  {
    p = paramo0;
    M = c;
    o0.g localg = b;
    localg.getClass();
    N = a;
    O = b.a;
    P = null;
    r = parama;
    z = parama1;
    s = parama2;
    u = paramh;
    v = paramu;
    x = paramLong;
    t = parami;
    w = new c5.a();
    q = false;
    y = q(null);
    B = new Object();
    C = new SparseArray();
    F = new c();
    V = -9223372036854775807L;
    T = -9223372036854775807L;
    A = new e();
    G = new f();
    D = new b.m(this, 11);
    E = new u.a(this, 10);
  }
  
  public static boolean x(g paramg)
  {
    int i = 0;
    while (i < c.size())
    {
      int j = c.get(i)).b;
      if ((j != 1) && (j != 2)) {
        i++;
      } else {
        return true;
      }
    }
    return false;
  }
  
  public final void A(boolean paramBoolean)
  {
    int k;
    Object localObject4;
    int n;
    for (int i = 0; i < C.size(); i++)
    {
      j = C.keyAt(i);
      if (j >= W)
      {
        localObject1 = (b)C.valueAt(i);
        localObject2 = P;
        k = j - W;
        D = ((d5.c)localObject2);
        E = k;
        localObject3 = u;
        p = false;
        f = ((d5.c)localObject2);
        localObject4 = e.entrySet().iterator();
        while (((Iterator)localObject4).hasNext()) {
          if (((Long)((Map.Entry)((Iterator)localObject4).next()).getKey()).longValue() < f.h) {
            ((Iterator)localObject4).remove();
          }
        }
        localObject3 = A;
        if (localObject3 != null)
        {
          n = localObject3.length;
          for (j = 0; j < n; j++) {
            ((a)e).d((d5.c)localObject2, k);
          }
          z.a((z4.d0)localObject1);
        }
        F = bd;
        for (c5.f localf : B)
        {
          localObject4 = F.iterator();
          while (((Iterator)localObject4).hasNext())
          {
            localObject3 = (d5.f)((Iterator)localObject4).next();
            if (((d5.f)localObject3).a().equals(e.a()))
            {
              int i1 = ((d5.c)localObject2).c();
              if ((d) && (k == i1 - 1)) {
                bool2 = true;
              } else {
                bool2 = false;
              }
              localf.d((d5.f)localObject3, bool2);
            }
          }
        }
      }
    }
    Object localObject2 = P.b(0);
    i = P.c() - 1;
    Object localObject1 = P.b(i);
    long l1 = P.e(i);
    long l2 = v5.e0.I(v5.e0.u(T));
    long l3 = P.e(0);
    long l4 = v5.e0.I(b);
    boolean bool2 = x((g)localObject2);
    i = 0;
    long l5 = l4;
    while (i < c.size())
    {
      localObject3 = (d5.a)c.get(i);
      localObject4 = c;
      j = b;
      if ((j != 1) && (j != 2)) {
        j = 1;
      } else {
        j = 0;
      }
      if (((bool2) && (j != 0)) || (!((List)localObject4).isEmpty()))
      {
        localObject3 = ((j)((List)localObject4).get(0)).l();
        if ((localObject3 == null) || (((c5.c)localObject3).k(l3, l2) == 0L))
        {
          l5 = l4;
          break;
        }
        l5 = Math.max(l5, ((c5.c)localObject3).a(((c5.c)localObject3).d(l3, l2)) + l4);
      }
      i++;
    }
    long l6 = v5.e0.I(b);
    bool2 = x((g)localObject1);
    l4 = Long.MAX_VALUE;
    i = 0;
    while (i < c.size())
    {
      localObject4 = (d5.a)c.get(i);
      localObject3 = c;
      j = b;
      if ((j != 1) && (j != 2)) {
        j = 1;
      } else {
        j = 0;
      }
      if (bool2)
      {
        l3 = l4;
        if (j != 0) {}
      }
      else if (((List)localObject3).isEmpty())
      {
        l3 = l4;
      }
      else
      {
        localObject3 = ((j)((List)localObject3).get(0)).l();
        if (localObject3 == null)
        {
          l4 = l6 + l1;
          break;
        }
        l3 = ((c5.c)localObject3).k(l1, l2);
        if (l3 == 0L)
        {
          l4 = l6;
          break;
        }
        l3 = ((c5.c)localObject3).d(l1, l2) + l3 - 1L;
        l7 = ((c5.c)localObject3).a(l3);
        l3 = Math.min(l4, ((c5.c)localObject3).b(l3, l1) + (l7 + l6));
      }
      i++;
      l4 = l3;
    }
    if (P.d)
    {
      i = 0;
      while (i < c.size())
      {
        localObject3 = ((j)c.get(i)).c.get(0)).l();
        if ((localObject3 != null) && (!((c5.c)localObject3).h()))
        {
          i++;
        }
        else
        {
          i = 1;
          break label940;
        }
      }
      i = 0;
      label940:
      if (i == 0)
      {
        i = 1;
        break label951;
      }
    }
    i = 0;
    label951:
    if (i != 0)
    {
      l3 = P.f;
      if (l3 != -9223372036854775807L)
      {
        l6 = Math.max(l5, l4 - v5.e0.I(l3));
        break label995;
      }
    }
    l6 = l5;
    label995:
    long l7 = l4 - l6;
    localObject1 = P;
    if (d)
    {
      if (a != -9223372036854775807L) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      x6.b.H(bool2);
      long l8 = l2 - v5.e0.I(P.a) - l6;
      l2 = v5.e0.R(l8);
      l5 = p.c.c;
      if (l5 == -9223372036854775807L)
      {
        localObject1 = P.j;
        if (localObject1 != null)
        {
          l5 = c;
          if (l5 == -9223372036854775807L) {}
        }
      }
      else
      {
        l5 = Math.min(l2, l5);
        break label1137;
      }
      l5 = l2;
      label1137:
      l3 = v5.e0.R(l8 - l7);
      l4 = l3;
      if (l3 < 0L)
      {
        l4 = l3;
        if (l5 > 0L) {
          l4 = 0L;
        }
      }
      l3 = P.c;
      if (l3 != -9223372036854775807L) {
        l3 = Math.min(l4 + l3, l2);
      } else {
        l3 = l4;
      }
      l4 = p.c.b;
      if (l4 == -9223372036854775807L) {
        for (;;)
        {
          localObject1 = P.j;
          l4 = l3;
          if (localObject1 == null) {
            break;
          }
          l1 = b;
          l4 = l3;
          if (l1 == -9223372036854775807L) {
            break;
          }
          l4 = l1;
        }
      }
      l4 = v5.e0.j(l4, l3, l2);
      if (l4 > l5) {
        l2 = l4;
      } else {
        l2 = l5;
      }
      l5 = M.a;
      if (l5 == -9223372036854775807L)
      {
        localObject1 = P;
        localObject3 = j;
        if (localObject3 != null)
        {
          l5 = a;
          if (l5 != -9223372036854775807L) {}
        }
        else
        {
          l5 = g;
          if (l5 == -9223372036854775807L) {
            l5 = x;
          }
        }
      }
      l3 = l5;
      if (l5 < l4) {
        l3 = l4;
      }
      l5 = l3;
      if (l3 > l2) {
        l5 = v5.e0.j(v5.e0.R(l8 - Math.min(5000000L, l7 / 2L)), l4, l2);
      }
      localObject3 = p.c;
      float f1 = d;
      if (f1 == -3.4028235E38F)
      {
        localObject1 = P.j;
        if (localObject1 != null) {
          f1 = d;
        } else {
          f1 = -3.4028235E38F;
        }
      }
      float f2 = e;
      if (f2 == -3.4028235E38F)
      {
        localObject1 = P.j;
        if (localObject1 != null) {
          f2 = e;
        } else {
          f2 = -3.4028235E38F;
        }
      }
      if ((f1 == -3.4028235E38F) && (f2 == -3.4028235E38F))
      {
        localObject1 = P.j;
        if ((localObject1 == null) || (a == -9223372036854775807L))
        {
          f1 = 1.0F;
          f2 = 1.0F;
        }
      }
      M = new o0.e(l5, l4, l2, f1, f2);
      l3 = P.a;
      l2 = v5.e0.R(l6);
      l4 = l8 - v5.e0.I(M.a);
      l5 = Math.min(5000000L, l7 / 2L);
      if (l4 >= l5) {
        l5 = l4;
      }
      l4 = l5;
      l5 = l2 + l3;
    }
    else
    {
      l5 = -9223372036854775807L;
      l4 = 0L;
    }
    l2 = v5.e0.I(b);
    Object localObject3 = P;
    l3 = a;
    l1 = T;
    int j = W;
    localObject1 = p;
    if (d) {
      localObject2 = M;
    } else {
      localObject2 = null;
    }
    v(new b(l3, l5, l1, j, l6 - l2, l7, l4, (d5.c)localObject3, (o0)localObject1, (o0.e)localObject2));
    if (!q)
    {
      L.removeCallbacks(E);
      if (i != 0)
      {
        localObject1 = L;
        localObject2 = E;
        localObject4 = P;
        l5 = v5.e0.u(T);
        i = ((d5.c)localObject4).c() - 1;
        localObject3 = ((d5.c)localObject4).b(i);
        l6 = v5.e0.I(b);
        l2 = ((d5.c)localObject4).e(i);
        l1 = v5.e0.I(l5);
        l7 = v5.e0.I(a);
        l5 = v5.e0.I(5000L);
        i = 0;
        while (i < c.size())
        {
          localObject4 = c.get(i)).c;
          if (((List)localObject4).isEmpty())
          {
            l4 = l5;
          }
          else
          {
            localObject4 = ((j)((List)localObject4).get(0)).l();
            l4 = l5;
            if (localObject4 != null)
            {
              l3 = ((c5.c)localObject4).e(l2, l1) + (l7 + l6) - l1;
              if (l3 >= l5 - 100000L)
              {
                l4 = l5;
                if (l3 > l5)
                {
                  l4 = l5;
                  if (l3 >= l5 + 100000L) {}
                }
              }
              else
              {
                l4 = l3;
              }
            }
          }
          i++;
          l5 = l4;
        }
        j = 0;
        localObject3 = RoundingMode.CEILING;
        localObject3.getClass();
        l4 = l5 / 1000L;
        l3 = l5 - l4 * 1000L;
        boolean bool1 = l3 < 0L;
        if (!bool1)
        {
          l5 = l4;
        }
        else
        {
          i = (int)((l5 ^ 0x3E8) >> 63);
          k = 1;
          n = i | 0x1;
          i = j;
          int m;
          switch (q7.c.a[localObject3.ordinal()])
          {
          default: 
            throw new AssertionError();
          case 6: 
          case 7: 
          case 8: 
            l5 = Math.abs(l3);
            m = l5 - (Math.abs(1000L) - l5) < 0L;
            if (m == 0)
            {
              if (localObject3 != RoundingMode.HALF_UP)
              {
                i = j;
                if (localObject3 != RoundingMode.HALF_EVEN) {
                  break label2307;
                }
                i = j;
                if ((l4 & 1L) == 0L) {
                  break label2307;
                }
              }
            }
            else
            {
              i = j;
              if (m <= 0) {
                break label2307;
              }
            }
            break;
          case 5: 
            i = j;
            if (n <= 0) {}
            break;
          case 3: 
            i = j;
            if (n >= 0) {}
            break;
          case 4: 
            i = 1;
            break;
          case 1: 
            if (!bool1) {
              i = m;
            } else {
              i = 0;
            }
            if (i == 0) {
              break label2336;
            }
            i = j;
          }
          label2307:
          l5 = l4;
          if (i != 0) {
            l5 = l4 + n;
          }
        }
        ((Handler)localObject1).postDelayed((Runnable)localObject2, l5);
        break label2347;
        label2336:
        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
      }
      label2347:
      if (Q)
      {
        B();
      }
      else if (paramBoolean)
      {
        localObject2 = P;
        if (d)
        {
          l4 = e;
          if (l4 != -9223372036854775807L)
          {
            l5 = l4;
            if (l4 == 0L) {
              l5 = 5000L;
            }
            l5 = Math.max(0L, R + l5 - SystemClock.elapsedRealtime());
            L.postDelayed(D, l5);
          }
        }
      }
    }
  }
  
  public final void B()
  {
    L.removeCallbacks(D);
    if (I.c()) {
      return;
    }
    if (I.d())
    {
      Q = true;
      return;
    }
    synchronized (B)
    {
      Object localObject2 = N;
      Q = false;
      ??? = new f0(H, (Uri)localObject2, 4, z);
      localObject2 = A;
      int i = ((u)v).b(4);
      long l = I.f((d0.d)???, (t5.d0.a)localObject2, i);
      y.m(new z4.n(a, b, l), c);
      return;
    }
  }
  
  public final o0 f()
  {
    return p;
  }
  
  public final void g(r paramr)
  {
    paramr = (b)paramr;
    Object localObject = u;
    q = true;
    d.removeCallbacksAndMessages(null);
    localObject = A;
    int i = localObject.length;
    for (int j = 0; j < i; j++) {
      localObject[j].A(paramr);
    }
    z = null;
    C.remove(a);
  }
  
  public final void h()
  {
    G.a();
  }
  
  public final r o(t.b paramb, t5.b paramb1, long paramLong)
  {
    int i = ((Integer)a).intValue() - W;
    paramLong = P.b(i).b;
    w.a locala = new w.a(c.c, 0, paramb, paramLong);
    g.a locala1 = new g.a(d.c, 0, paramb);
    int j = W + i;
    d5.c localc = P;
    c5.a locala2 = w;
    a.a locala3 = s;
    paramb = J;
    a4.h localh = u;
    c0 localc0 = v;
    paramLong = T;
    t5.e0 locale0 = G;
    z4.i locali = t;
    c localc1 = F;
    a0 locala0 = o;
    x6.b.K(locala0);
    paramb = new b(j, localc, locala2, i, locala3, paramb, localh, locala1, localc0, locala, paramLong, locale0, paramb1, locali, localc1, locala0);
    C.put(j, paramb);
    return paramb;
  }
  
  public final void t(l0 paraml0)
  {
    J = paraml0;
    paraml0 = u;
    Looper localLooper = Looper.myLooper();
    a0 locala0 = o;
    x6.b.K(locala0);
    paraml0.c(localLooper, locala0);
    u.a();
    if (q)
    {
      A(false);
    }
    else
    {
      H = r.a();
      I = new t5.d0("DashMediaSource");
      L = v5.e0.l(null);
      B();
    }
  }
  
  public final void w()
  {
    Q = false;
    H = null;
    Object localObject = I;
    if (localObject != null)
    {
      ((t5.d0)localObject).e(null);
      I = null;
    }
    R = 0L;
    S = 0L;
    if (q) {
      localObject = P;
    } else {
      localObject = null;
    }
    P = ((d5.c)localObject);
    N = O;
    K = null;
    localObject = L;
    if (localObject != null)
    {
      ((Handler)localObject).removeCallbacksAndMessages(null);
      L = null;
    }
    T = -9223372036854775807L;
    U = 0;
    V = -9223372036854775807L;
    W = 0;
    C.clear();
    localObject = w;
    a.clear();
    b.clear();
    c.clear();
    u.release();
  }
  
  public final void y()
  {
    t5.d0 locald0 = I;
    a locala = new a();
    synchronized (x.b)
    {
      boolean bool = x.c;
      if (bool) {
        try
        {
          long l;
          if (x.c) {
            l = x.d;
          } else {
            l = -9223372036854775807L;
          }
          T = l;
          A(true);
        }
        finally {}
      }
      ??? = localObject1;
      if (localObject1 == null) {
        ??? = new t5.d0("SntpClient");
      }
      ((t5.d0)???).f(new x.c(), new x.b(locala), 1);
      return;
    }
  }
  
  public final void z(f0<?> paramf0, long paramLong1, long paramLong2)
  {
    paramLong1 = a;
    Object localObject = d;
    Uri localUri = c;
    localObject = new z4.n(d);
    v.getClass();
    y.d((z4.n)localObject, c);
  }
  
  public static final class Factory
    implements t.a
  {
    public final a.a a;
    public final k.a b;
    public a4.i c;
    public z4.i d;
    public u e;
    public long f;
    
    public Factory(c.a parama, k.a parama1)
    {
      a = parama;
      b = parama1;
      c = new a4.c();
      e = new u();
      f = 30000L;
      d = new z4.i(0);
    }
    
    public Factory(k.a parama)
    {
      this(new c.a(parama), parama);
    }
    
    public final DashMediaSource a(o0 paramo0)
    {
      b.getClass();
      Object localObject = new d5.d();
      List localList = b.d;
      if (!localList.isEmpty()) {
        localObject = new y4.b((f0.a)localObject, localList);
      }
      return new DashMediaSource(paramo0, b, (f0.a)localObject, a, d, c.a(paramo0), e, f);
    }
  }
  
  public final class a
    implements x.a
  {
    public a() {}
  }
  
  public static final class b
    extends r1
  {
    public final long b;
    public final long c;
    public final long d;
    public final int e;
    public final long f;
    public final long o;
    public final long p;
    public final d5.c q;
    public final o0 r;
    public final o0.e s;
    
    public b(long paramLong1, long paramLong2, long paramLong3, int paramInt, long paramLong4, long paramLong5, long paramLong6, d5.c paramc, o0 paramo0, o0.e parame)
    {
      boolean bool1 = d;
      boolean bool2 = true;
      boolean bool3;
      if (parame != null) {
        bool3 = true;
      } else {
        bool3 = false;
      }
      if (bool1 == bool3) {
        bool3 = bool2;
      } else {
        bool3 = false;
      }
      x6.b.H(bool3);
      b = paramLong1;
      c = paramLong2;
      d = paramLong3;
      e = paramInt;
      f = paramLong4;
      o = paramLong5;
      p = paramLong6;
      q = paramc;
      r = paramo0;
      s = parame;
    }
    
    public final int b(Object paramObject)
    {
      boolean bool = paramObject instanceof Integer;
      int i = -1;
      if (!bool) {
        return -1;
      }
      int j = ((Integer)paramObject).intValue() - e;
      int k = i;
      if (j >= 0) {
        if (j >= h()) {
          k = i;
        } else {
          k = j;
        }
      }
      return k;
    }
    
    public final r1.b f(int paramInt, r1.b paramb, boolean paramBoolean)
    {
      x6.b.x(paramInt, h());
      Integer localInteger = null;
      String str;
      if (paramBoolean) {
        str = q.b(paramInt).a;
      } else {
        str = null;
      }
      if (paramBoolean) {
        localInteger = Integer.valueOf(e + paramInt);
      }
      long l1 = q.e(paramInt);
      long l2 = v5.e0.I(q.b(paramInt).b - q.b(0).b);
      long l3 = f;
      paramb.getClass();
      paramb.h(str, localInteger, 0, l1, l2 - l3, a5.a.o, false);
      return paramb;
    }
    
    public final int h()
    {
      return q.c();
    }
    
    public final Object l(int paramInt)
    {
      x6.b.x(paramInt, h());
      return Integer.valueOf(e + paramInt);
    }
    
    public final r1.c n(int paramInt, r1.c paramc, long paramLong)
    {
      x6.b.x(paramInt, 1);
      long l1 = p;
      Object localObject1 = q;
      if ((d) && (e != -9223372036854775807L) && (b == -9223372036854775807L)) {
        paramInt = 1;
      } else {
        paramInt = 0;
      }
      if (paramInt == 0) {
        paramLong = l1;
      }
      for (;;)
      {
        break;
        l2 = l1;
        if (paramLong > 0L)
        {
          paramLong = l1 + paramLong;
          l2 = paramLong;
          if (paramLong > o)
          {
            paramLong = -9223372036854775807L;
            break;
          }
        }
        l1 = f + l2;
        l3 = ((d5.c)localObject1).e(0);
        paramInt = 0;
        while ((paramInt < q.c() - 1) && (l1 >= l3))
        {
          l1 -= l3;
          paramInt++;
          l3 = q.e(paramInt);
        }
        localObject1 = q.b(paramInt);
        int i = c.size();
        for (paramInt = 0; paramInt < i; paramInt++) {
          if (c.get(paramInt)).b == 2) {
            break label225;
          }
        }
        paramInt = -1;
        label225:
        if (paramInt == -1)
        {
          paramLong = l2;
        }
        else
        {
          localObject1 = ((j)c.get(paramInt)).c.get(0)).l();
          paramLong = l2;
          if (localObject1 != null) {
            if (((c5.c)localObject1).j(l3) == 0L) {
              paramLong = l2;
            } else {
              paramLong = ((c5.c)localObject1).a(((c5.c)localObject1).g(l1, l3)) + l2 - l1;
            }
          }
        }
      }
      Object localObject2 = r1.c.z;
      localObject1 = r;
      d5.c localc = q;
      long l2 = b;
      long l3 = c;
      l1 = d;
      boolean bool;
      if ((d) && (e != -9223372036854775807L) && (b == -9223372036854775807L)) {
        bool = true;
      } else {
        bool = false;
      }
      paramc.b(localObject2, (o0)localObject1, localc, l2, l3, l1, true, bool, s, paramLong, o, 0, h() - 1, f);
      return paramc;
    }
    
    public final int o()
    {
      return 1;
    }
  }
  
  public final class c
    implements d.b
  {
    public c() {}
  }
  
  public static final class d
    implements f0.a<Long>
  {
    public static final Pattern a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");
    
    public final Object a(Uri paramUri, t5.m paramm)
    {
      paramm = new BufferedReader(new InputStreamReader(paramm, n7.d.c)).readLine();
      try
      {
        paramUri = a.matcher(paramm);
        if (paramUri.matches())
        {
          String str = paramUri.group(1);
          paramm = new java/text/SimpleDateFormat;
          paramm.<init>("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
          paramm.setTimeZone(TimeZone.getTimeZone("UTC"));
          long l1 = paramm.parse(str).getTime();
          long l2;
          if ("Z".equals(paramUri.group(2)))
          {
            l2 = l1;
          }
          else
          {
            if ("+".equals(paramUri.group(4))) {
              l2 = 1L;
            } else {
              l2 = -1L;
            }
            long l3 = Long.parseLong(paramUri.group(5));
            paramUri = paramUri.group(7);
            long l4;
            if (TextUtils.isEmpty(paramUri)) {
              l4 = 0L;
            } else {
              l4 = Long.parseLong(paramUri);
            }
            l2 = l1 - (l3 * 60L + l4) * 60L * 1000L * l2;
          }
          return Long.valueOf(l2);
        }
        paramUri = new java/lang/StringBuilder;
        paramUri.<init>();
        paramUri.append("Couldn't parse timestamp: ");
        paramUri.append(paramm);
        throw a1.b(paramUri.toString(), null);
      }
      catch (ParseException paramUri)
      {
        throw a1.b(null, paramUri);
      }
    }
  }
  
  public final class e
    implements t5.d0.a<f0<d5.c>>
  {
    public e() {}
    
    public final void k(d0.d paramd, long paramLong1, long paramLong2, boolean paramBoolean)
    {
      paramd = (f0)paramd;
      z(paramd, paramLong1, paramLong2);
    }
    
    public final void p(d0.d paramd, long paramLong1, long paramLong2)
    {
      Object localObject1 = (f0)paramd;
      DashMediaSource localDashMediaSource = DashMediaSource.this;
      localDashMediaSource.getClass();
      long l = a;
      paramd = d;
      Object localObject2 = c;
      paramd = new z4.n(d);
      v.getClass();
      y.g(paramd, c);
      localObject2 = (d5.c)f;
      paramd = P;
      int i = 0;
      int j;
      if (paramd == null) {
        j = 0;
      } else {
        j = paramd.c();
      }
      l = b0b;
      for (int k = 0; (k < j) && (P.b(k).b < l); k++) {}
      int m;
      if (d)
      {
        if (j - k > ((d5.c)localObject2).c())
        {
          paramd = "Loaded out of sync manifest";
        }
        else
        {
          l = V;
          if ((l == -9223372036854775807L) || (h * 1000L > l)) {
            break label261;
          }
          paramd = f.l("Loaded stale dynamic manifest: ");
          paramd.append(h);
          paramd.append(", ");
          paramd.append(V);
          paramd = paramd.toString();
        }
        v5.m.f("DashMediaSource", paramd);
        m = 1;
        break label264;
        label261:
        m = 0;
        label264:
        if (m != 0)
        {
          j = U;
          U = (j + 1);
          paramd = v;
          k = c;
          if (j < ((u)paramd).b(k))
          {
            paramLong1 = Math.min((U - 1) * 1000, 5000);
            L.postDelayed(D, paramLong1);
          }
          else
          {
            K = new c5.b();
          }
        }
        else
        {
          U = 0;
        }
      }
      else
      {
        P = ((d5.c)localObject2);
        boolean bool = Q;
        Q = (d & bool);
        R = (paramLong1 - paramLong2);
        S = paramLong1;
        localObject2 = B;
        m = i;
      }
      try
      {
        if (b.a == N) {
          m = 1;
        }
        if (m != 0)
        {
          paramd = P.k;
          if (paramd == null) {
            paramd = d.c;
          }
          N = paramd;
        }
        if (j == 0)
        {
          paramd = P;
          if (d)
          {
            localObject1 = i;
            if (localObject1 != null)
            {
              paramd = (String)b;
              if ((!v5.e0.a(paramd, "urn:mpeg:dash:utc:direct:2014")) && (!v5.e0.a(paramd, "urn:mpeg:dash:utc:direct:2012")))
              {
                if ((!v5.e0.a(paramd, "urn:mpeg:dash:utc:http-iso:2014")) && (!v5.e0.a(paramd, "urn:mpeg:dash:utc:http-iso:2012")))
                {
                  if ((!v5.e0.a(paramd, "urn:mpeg:dash:utc:http-xsdate:2014")) && (!v5.e0.a(paramd, "urn:mpeg:dash:utc:http-xsdate:2012")))
                  {
                    if ((!v5.e0.a(paramd, "urn:mpeg:dash:utc:ntp:2014")) && (!v5.e0.a(paramd, "urn:mpeg:dash:utc:ntp:2012")))
                    {
                      v5.m.d("DashMediaSource", "Failed to resolve time offset.", new IOException("Unsupported UTC timing scheme"));
                      localDashMediaSource.A(true);
                      break label818;
                    }
                    localDashMediaSource.y();
                    break label818;
                  }
                  paramd = new DashMediaSource.h();
                }
                else
                {
                  paramd = new DashMediaSource.d();
                }
                localObject1 = new f0(H, Uri.parse((String)c), 5, paramd);
                paramd = new DashMediaSource.g(localDashMediaSource);
                paramLong1 = I.f((d0.d)localObject1, paramd, 1);
                y.m(new z4.n(a, b, paramLong1), c);
                break label818;
              }
              try
              {
                T = (v5.e0.L((String)c) - S);
                localDashMediaSource.A(true);
              }
              catch (a1 paramd)
              {
                v5.m.d("DashMediaSource", "Failed to resolve time offset.", paramd);
                localDashMediaSource.A(true);
              }
            }
            localDashMediaSource.y();
            break label818;
          }
        }
        else
        {
          W += k;
        }
        localDashMediaSource.A(true);
        label818:
        return;
      }
      finally {}
    }
    
    public final d0.b u(d0.d paramd, long paramLong1, long paramLong2, IOException paramIOException, int paramInt)
    {
      f0 localf0 = (f0)paramd;
      DashMediaSource localDashMediaSource = DashMediaSource.this;
      localDashMediaSource.getClass();
      paramLong1 = a;
      Object localObject = d;
      paramd = c;
      localObject = new z4.n(d);
      ((u)v).getClass();
      if ((!(paramIOException instanceof a1)) && (!(paramIOException instanceof FileNotFoundException)) && (!(paramIOException instanceof w)) && (!(paramIOException instanceof d0.g)))
      {
        int i = t5.l.b;
        for (paramd = paramIOException; paramd != null; paramd = paramd.getCause()) {
          if (((paramd instanceof t5.l)) && (a == 2008))
          {
            i = 1;
            break label144;
          }
        }
        i = 0;
        label144:
        if (i == 0)
        {
          paramLong1 = Math.min((paramInt - 1) * 1000, 5000);
          break label175;
        }
      }
      paramLong1 = -9223372036854775807L;
      label175:
      if (paramLong1 == -9223372036854775807L) {
        paramd = t5.d0.f;
      } else {
        paramd = new d0.b(0, paramLong1);
      }
      boolean bool = true ^ paramd.a();
      y.k((z4.n)localObject, c, paramIOException, bool);
      if (bool) {
        v.getClass();
      }
      return paramd;
    }
  }
  
  public final class f
    implements t5.e0
  {
    public f() {}
    
    public final void a()
    {
      I.a();
      c5.b localb = K;
      if (localb == null) {
        return;
      }
      throw localb;
    }
  }
  
  public final class g
    implements t5.d0.a<f0<Long>>
  {
    public g() {}
    
    public final void k(d0.d paramd, long paramLong1, long paramLong2, boolean paramBoolean)
    {
      paramd = (f0)paramd;
      z(paramd, paramLong1, paramLong2);
    }
    
    public final void p(d0.d paramd, long paramLong1, long paramLong2)
    {
      paramd = (f0)paramd;
      DashMediaSource localDashMediaSource = DashMediaSource.this;
      localDashMediaSource.getClass();
      paramLong2 = a;
      Object localObject = d;
      Uri localUri = c;
      localObject = new z4.n(d);
      v.getClass();
      y.g((z4.n)localObject, c);
      T = (((Long)f).longValue() - paramLong1);
      localDashMediaSource.A(true);
    }
    
    public final d0.b u(d0.d paramd, long paramLong1, long paramLong2, IOException paramIOException, int paramInt)
    {
      paramd = (f0)paramd;
      DashMediaSource localDashMediaSource = DashMediaSource.this;
      w.a locala = y;
      paramLong1 = a;
      j0 localj0 = d;
      Uri localUri = c;
      locala.k(new z4.n(d), c, paramIOException, true);
      v.getClass();
      v5.m.d("DashMediaSource", "Failed to resolve time offset.", paramIOException);
      localDashMediaSource.A(true);
      return t5.d0.e;
    }
  }
  
  public static final class h
    implements f0.a<Long>
  {
    public final Object a(Uri paramUri, t5.m paramm)
    {
      return Long.valueOf(v5.e0.L(new BufferedReader(new InputStreamReader(paramm)).readLine()));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.DashMediaSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */