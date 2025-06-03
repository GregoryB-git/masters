package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.io.IOException;
import java.util.List;

final class ru
  implements uo<uz<rz>>, Runnable
{
  private final Uri a;
  private final um b;
  private final uz<rz> c;
  private rx d;
  private long e;
  private long f;
  private long g;
  private long h;
  private boolean i;
  private IOException j;
  
  public ru(rs paramrs, Uri paramUri)
  {
    a = paramUri;
    b = new um("DefaultHlsPlaylistTracker:MediaPlaylist");
    c = new uz(rs.a(paramrs).a(), paramUri, 4, rs.b(paramrs));
  }
  
  private final void a(rx paramrx, long paramLong)
  {
    rx localrx1 = d;
    long l1 = SystemClock.elapsedRealtime();
    e = l1;
    rx localrx2 = rs.a(k, localrx1, paramrx);
    d = localrx2;
    if (localrx2 != localrx1)
    {
      j = null;
      f = l1;
      rs.a(k, a, localrx2);
    }
    else if (!i)
    {
      paramLong = f;
      long l2 = l.size();
      paramrx = d;
      if (paramLong + l2 < f)
      {
        j = new si(a);
        rs.a(k, a, -9223372036854775807L);
      }
      else
      {
        double d1 = l1 - f;
        double d2 = av.a(h);
        if (d1 > rs.f(k) * d2)
        {
          j = new sh(a);
          paramLong = rs.e(k).a(j);
          rs.a(k, a, paramLong);
          if (paramLong != -9223372036854775807L) {
            a(paramLong);
          }
        }
      }
    }
    paramrx = d;
    if (paramrx != localrx1) {
      paramLong = h;
    } else {
      paramLong = h / 2L;
    }
    g = (av.a(paramLong) + l1);
    if ((a.equals(rs.g(k))) && (!d.i)) {
      d();
    }
  }
  
  private final boolean a(long paramLong)
  {
    h = (SystemClock.elapsedRealtime() + paramLong);
    return (a.equals(rs.g(k))) && (!rs.h(k));
  }
  
  private final void f()
  {
    long l = b.a(c, this, rs.e(k).a(c.b));
    mu localmu = rs.d(k);
    uz localuz = c;
    localmu.a(a, b, l);
  }
  
  public final rx a()
  {
    return d;
  }
  
  public final boolean b()
  {
    if (d == null) {
      return false;
    }
    long l1 = SystemClock.elapsedRealtime();
    long l2 = Math.max(30000L, av.a(d.m));
    rx localrx = d;
    if (!i)
    {
      int m = a;
      if ((m != 2) && (m != 1) && (e + l2 <= l1)) {
        return false;
      }
    }
    return true;
  }
  
  public final void c()
  {
    b.a(null);
  }
  
  public final void d()
  {
    h = 0L;
    if ((!i) && (!b.b()))
    {
      long l = SystemClock.elapsedRealtime();
      if (l < g)
      {
        i = true;
        rs.c(k).postDelayed(this, g - l);
        return;
      }
      f();
    }
  }
  
  public final void e()
    throws IOException
  {
    b.a();
    IOException localIOException = j;
    if (localIOException == null) {
      return;
    }
    throw localIOException;
  }
  
  public final void run()
  {
    i = false;
    f();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ru
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */