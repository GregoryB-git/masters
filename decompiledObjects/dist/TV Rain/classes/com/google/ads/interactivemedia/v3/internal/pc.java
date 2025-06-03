package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import java.io.IOException;

public final class pc
  extends mq
{
  private boolean A;
  private long B;
  private long C;
  private long D;
  private int E;
  private long F;
  private int G;
  private final boolean a;
  private final ts b;
  private final rt c;
  private final ly d;
  private final fj<?> e;
  private final un f;
  private final long g;
  private final boolean h;
  private final mu i;
  private final uy<? extends aaa> j;
  private final pi k;
  private final Object l;
  private final SparseArray<pa> m;
  private final Runnable n;
  private final Runnable o;
  private final pu p;
  private final ux q;
  private final Object r;
  private tt s;
  private um t;
  private vc u;
  private IOException v;
  private Handler w;
  private Uri x;
  private Uri y;
  private aaa z;
  
  static
  {
    bt.a("goog.exo.dash");
  }
  
  private pc(aaa paramaaa, Uri paramUri, ts paramts, uy<? extends aaa> paramuy, rt paramrt, ly paramly, fj<?> paramfj, un paramun, long paramLong, boolean paramBoolean, Object paramObject)
  {
    x = paramUri;
    z = paramaaa;
    y = paramUri;
    b = paramts;
    j = paramuy;
    c = paramrt;
    e = paramfj;
    f = paramun;
    g = paramLong;
    h = paramBoolean;
    d = paramly;
    r = paramObject;
    if (paramaaa != null) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    a = paramBoolean;
    i = b(null);
    l = new Object();
    m = new SparseArray();
    p = new pu(this, (byte)0);
    F = -9223372036854775807L;
    if (paramBoolean)
    {
      rp.c(d ^ true);
      k = null;
      n = null;
      o = null;
      q = new uw();
      return;
    }
    k = new pi(this, (byte)0);
    q = new pl(this);
    n = new pf(this);
    o = new pe(this);
  }
  
  private final void a(qp paramqp)
  {
    try
    {
      b(wl.g(b) - C);
      return;
    }
    catch (ce paramqp)
    {
      a(paramqp);
    }
  }
  
  private final void a(qp paramqp, uy<Long> paramuy)
  {
    a(new uz(s, Uri.parse(b), 5, paramuy), new pn(this, (byte)0), 1);
  }
  
  private final <T> void a(uz<T> paramuz, uo<uz<T>> paramuo, int paramInt)
  {
    long l1 = t.a(paramuz, paramuo, paramInt);
    i.a(a, b, l1);
  }
  
  private final void a(IOException paramIOException)
  {
    vr.b("DashMediaSource", "Failed to resolve UtcTiming element.", paramIOException);
    a(true);
  }
  
  private final void a(boolean paramBoolean)
  {
    for (int i1 = 0; i1 < m.size(); i1++)
    {
      i2 = m.keyAt(i1);
      if (i2 >= G) {
        ((pa)m.valueAt(i1)).a(z, i2 - G);
      }
    }
    i1 = z.a() - 1;
    pk localpk = pk.a(z.a(0), z.c(0));
    Object localObject = pk.a(z.a(i1), z.c(i1));
    long l1 = b;
    long l2 = c;
    long l3;
    if ((z.d) && (!a))
    {
      if (D != 0L) {
        l3 = av.b(SystemClock.elapsedRealtime() + D);
      } else {
        l3 = av.b(System.currentTimeMillis());
      }
      l2 = Math.min(l3 - av.b(z.a) - av.b(z.a(i1).b), l2);
      l4 = z.f;
      l3 = l1;
      if (l4 != -9223372036854775807L)
      {
        for (l3 = l2 - av.b(l4); (l3 < 0L) && (i1 > 0); l3 += ((aaa)localObject).c(i1))
        {
          localObject = z;
          i1--;
        }
        if (i1 == 0) {
          l3 = Math.max(l1, l3);
        } else {
          l3 = z.c(0);
        }
      }
      i1 = 1;
      l1 = l3;
      l3 = l2;
    }
    else
    {
      i1 = 0;
      l3 = l2;
    }
    int i2 = 0;
    l2 = l3 - l1;
    while (i2 < z.a() - 1)
    {
      l2 = z.c(i2) + l2;
      i2++;
    }
    localObject = z;
    if (d)
    {
      l4 = g;
      l3 = l4;
      if (!h)
      {
        l5 = g;
        l3 = l4;
        if (l5 != -9223372036854775807L) {
          l3 = l5;
        }
      }
      l4 = l2 - av.b(l3);
      l3 = l4;
      if (l4 < 5000000L) {
        l3 = Math.min(5000000L, l2 / 2L);
      }
    }
    else
    {
      l3 = 0L;
    }
    localObject = z;
    long l4 = a;
    long l6 = a0b;
    long l5 = av.a(l1);
    localObject = z;
    a(new ph(a, l5 + (l4 + l6), G, l1, l2, l3, (aaa)localObject, r));
    if (!a)
    {
      w.removeCallbacks(o);
      l3 = 5000L;
      if (i1 != 0) {
        w.postDelayed(o, 5000L);
      }
      if (A)
      {
        j();
        return;
      }
      if (paramBoolean)
      {
        localObject = z;
        if (d)
        {
          l1 = e;
          if (l1 != -9223372036854775807L)
          {
            if (l1 != 0L) {
              l3 = l1;
            }
            c(Math.max(0L, B + l3 - SystemClock.elapsedRealtime()));
          }
        }
      }
    }
  }
  
  private final void b(long paramLong)
  {
    D = paramLong;
    a(true);
  }
  
  private final void c(long paramLong)
  {
    w.postDelayed(n, paramLong);
  }
  
  private final void j()
  {
    w.removeCallbacks(n);
    if (t.b())
    {
      A = true;
      return;
    }
    synchronized (l)
    {
      Uri localUri = y;
      A = false;
      a(new uz(s, localUri, 4, j), k, f.a(4));
      return;
    }
  }
  
  public final mo a(mt parammt, tk paramtk, long paramLong)
  {
    int i1 = ((Integer)a).intValue() - G;
    parammt = a(parammt, z.a(i1).b);
    parammt = new pa(G + i1, z, i1, c, u, e, f, parammt, D, q, paramtk, d, p);
    m.put(a, parammt);
    return parammt;
  }
  
  public final ur a(uz<Long> paramuz, long paramLong1, long paramLong2, IOException paramIOException)
  {
    i.a(a, paramuz.e(), paramuz.f(), b, paramLong1, paramLong2, paramuz.d(), paramIOException, true);
    a(paramIOException);
    return um.a;
  }
  
  public final ur a(uz<aaa> paramuz, long paramLong1, long paramLong2, IOException paramIOException, int paramInt)
  {
    long l1 = f.a(paramIOException, paramInt);
    ur localur;
    if (l1 == -9223372036854775807L) {
      localur = um.b;
    } else {
      localur = um.a(false, l1);
    }
    i.a(a, paramuz.e(), paramuz.f(), b, paramLong1, paramLong2, paramuz.d(), paramIOException, localur.a() ^ true);
    return localur;
  }
  
  public final void a()
    throws IOException
  {
    q.a();
  }
  
  public final void a(long paramLong)
  {
    long l1 = F;
    if ((l1 == -9223372036854775807L) || (l1 < paramLong)) {
      F = paramLong;
    }
  }
  
  public final void a(mo parammo)
  {
    parammo = (pa)parammo;
    parammo.f();
    m.remove(a);
  }
  
  public final void a(uz<aaa> paramuz, long paramLong1, long paramLong2)
  {
    i.a(a, paramuz.e(), paramuz.f(), b, paramLong1, paramLong2, paramuz.d());
    ??? = (aaa)paramuz.c();
    Object localObject2 = z;
    int i1;
    if (localObject2 == null) {
      i1 = 0;
    } else {
      i1 = ((aaa)localObject2).a();
    }
    long l1 = a0b;
    for (int i2 = 0; (i2 < i1) && (z.a(i2).b < l1); i2++) {}
    int i3;
    if (d)
    {
      if (i1 - i2 > ((aaa)???).a()) {
        Log.w("DashMediaSource", "Loaded out of sync manifest");
      }
      for (;;)
      {
        i3 = 1;
        break label240;
        long l2 = F;
        if (l2 == -9223372036854775807L) {
          break;
        }
        l1 = h;
        if (1000L * l1 > l2) {
          break;
        }
        localObject2 = new StringBuilder(73);
        ((StringBuilder)localObject2).append("Loaded stale dynamic manifest: ");
        ((StringBuilder)localObject2).append(l1);
        ((StringBuilder)localObject2).append(", ");
        ((StringBuilder)localObject2).append(l2);
        Log.w("DashMediaSource", ((StringBuilder)localObject2).toString());
      }
      i3 = 0;
      label240:
      if (i3 != 0)
      {
        i1 = E;
        E = (i1 + 1);
        if (i1 < f.a(b))
        {
          c(Math.min((E - 1) * 1000, 5000));
          return;
        }
        v = new aix();
        return;
      }
      E = 0;
    }
    z = ((aaa)???);
    A &= d;
    B = (paramLong1 - paramLong2);
    C = paramLong1;
    if (j != null) {
      synchronized (l)
      {
        if (a.a == y) {
          i3 = 1;
        } else {
          i3 = 0;
        }
        if (i3 != 0) {
          y = z.j;
        }
      }
    }
    if (i1 == 0)
    {
      paramuz = z;
      if (d)
      {
        paramuz = i;
        if (paramuz != null)
        {
          ??? = a;
          if ((!wl.a(???, "urn:mpeg:dash:utc:direct:2014")) && (!wl.a(???, "urn:mpeg:dash:utc:direct:2012")))
          {
            if ((!wl.a(???, "urn:mpeg:dash:utc:http-iso:2014")) && (!wl.a(???, "urn:mpeg:dash:utc:http-iso:2012")))
            {
              if ((!wl.a(???, "urn:mpeg:dash:utc:http-xsdate:2014")) && (!wl.a(???, "urn:mpeg:dash:utc:http-xsdate:2012")))
              {
                a(new IOException("Unsupported UTC timing scheme"));
                return;
              }
              a(paramuz, new pm((byte)0));
              return;
            }
            a(paramuz, new pj());
            return;
          }
          a(paramuz);
          return;
        }
      }
      a(true);
    }
    else
    {
      G += i2;
      a(true);
    }
  }
  
  public final void a(vc paramvc)
  {
    u = paramvc;
    if (a)
    {
      a(false);
      return;
    }
    s = b.a();
    t = new um("Loader:DashMediaSource");
    w = new Handler();
    j();
  }
  
  public final void b(uz<Long> paramuz, long paramLong1, long paramLong2)
  {
    i.a(a, paramuz.e(), paramuz.f(), b, paramLong1, paramLong2, paramuz.d());
    b(((Long)paramuz.c()).longValue() - paramLong1);
  }
  
  public final void c(uz<?> paramuz, long paramLong1, long paramLong2)
  {
    i.b(a, paramuz.e(), paramuz.f(), b, paramLong1, paramLong2, paramuz.d());
  }
  
  public final void d()
  {
    A = false;
    s = null;
    Object localObject = t;
    if (localObject != null)
    {
      ((um)localObject).a(null);
      t = null;
    }
    B = 0L;
    C = 0L;
    if (a) {
      localObject = z;
    } else {
      localObject = null;
    }
    z = ((aaa)localObject);
    y = x;
    v = null;
    localObject = w;
    if (localObject != null)
    {
      ((Handler)localObject).removeCallbacksAndMessages(null);
      w = null;
    }
    D = 0L;
    E = 0;
    F = -9223372036854775807L;
    G = 0;
    m.clear();
  }
  
  public final Object e()
  {
    return r;
  }
  
  public final void f()
  {
    w.removeCallbacks(o);
    j();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.pc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */