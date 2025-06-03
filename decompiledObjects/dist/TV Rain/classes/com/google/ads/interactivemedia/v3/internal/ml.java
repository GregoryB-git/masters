package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;

public class ml
  implements ut
{
  private final Uri b;
  private final vd c;
  private final nk d;
  private final fy e;
  private final vv f;
  private final gf g;
  private volatile boolean h;
  private boolean i;
  private long j;
  private tx k;
  private long l;
  private gi m;
  private boolean n;
  
  public ml(nj paramnj, Uri paramUri, tt paramtt, nk paramnk, fy paramfy, vv paramvv)
  {
    b = paramUri;
    c = new vd(paramtt);
    d = paramnk;
    e = paramfy;
    f = paramvv;
    g = new gf();
    i = true;
    l = -1L;
    k = a(0L);
  }
  
  private tx a(long paramLong)
  {
    return new tx(b, paramLong, -1L, nj.f(a), 22);
  }
  
  private void a(long paramLong1, long paramLong2)
  {
    g.a = paramLong1;
    j = paramLong2;
    i = true;
    n = false;
  }
  
  public void a()
  {
    h = true;
  }
  
  public void a(vy paramvy)
  {
    long l1;
    if (!n) {
      l1 = j;
    } else {
      l1 = Math.max(nj.e(a), j);
    }
    int i1 = paramvy.b();
    gi localgi = (gi)rp.a(m);
    localgi.a(paramvy, i1);
    localgi.a(l1, 1, i1, 0, null);
    n = true;
  }
  
  public void b()
    throws IOException, InterruptedException
  {
    int i1 = 0;
    Object localObject1;
    for (;;)
    {
      if ((i1 != 0) || (h)) {
        return;
      }
      localObject1 = null;
      try
      {
        long l1 = g.a;
        Object localObject2 = a(l1);
        k = ((tx)localObject2);
        long l2 = c.a((tx)localObject2);
        l = l2;
        if (l2 != -1L) {
          l = (l2 + l1);
        }
        Uri localUri = (Uri)rp.a(c.a());
        nj.a(a, kl.a(c.b()));
        Object localObject5 = c;
        localObject2 = localObject5;
        if (nj.a(a) != null)
        {
          localObject2 = localObject5;
          if (aa).b != -1)
          {
            localObject2 = new com/google/ads/interactivemedia/v3/internal/mi;
            ((mi)localObject2).<init>(c, aa).b, this);
            localObject5 = a.h();
            m = ((gi)localObject5);
            ((gi)localObject5).a(nj.k());
          }
        }
        localObject5 = new com/google/ads/interactivemedia/v3/internal/fz;
        ((fz)localObject5).<init>((tt)localObject2, l1, l);
        int i2 = i1;
        try
        {
          localObject2 = d.a((fz)localObject5, e, localUri);
          int i3 = i1;
          l2 = l1;
          i2 = i1;
          if (i)
          {
            i2 = i1;
            ((fw)localObject2).a(l1, j);
            i2 = i1;
            i = false;
            l2 = l1;
            i3 = i1;
          }
          while (i3 == 0)
          {
            i2 = i3;
            if (h) {
              break;
            }
            i2 = i3;
            f.c();
            i2 = i3;
            i1 = ((fw)localObject2).a((fz)localObject5, g);
            i3 = i1;
            i2 = i1;
            if (((fz)localObject5).c() > nj.b(a) + l2)
            {
              i2 = i1;
              l2 = ((fz)localObject5).c();
              i2 = i1;
              f.b();
              i2 = i1;
              nj.d(a).post(nj.c(a));
              i3 = i1;
            }
          }
          if (i3 == 1)
          {
            i1 = 0;
          }
          else
          {
            g.a = ((fz)localObject5).c();
            i1 = i3;
          }
          wl.a(c);
          continue;
        }
        finally
        {
          localObject1 = localObject5;
          i1 = i2;
        }
        if (i1 == 1) {
          break label460;
        }
      }
      finally {}
    }
    if (localObject1 != null) {
      g.a = ((fz)localObject1).c();
    }
    label460:
    wl.a(c);
    throw ((Throwable)localObject4);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ml
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */