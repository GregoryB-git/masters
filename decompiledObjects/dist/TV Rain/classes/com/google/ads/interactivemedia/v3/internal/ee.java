package com.google.ads.interactivemedia.v3.internal;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

final class ee
{
  private final ed a;
  private final long[] b;
  private AudioTrack c;
  private int d;
  private int e;
  private ec f;
  private int g;
  private boolean h;
  private long i;
  private long j;
  private long k;
  private Method l;
  private long m;
  private boolean n;
  private boolean o;
  private long p;
  private long q;
  private long r;
  private long s;
  private int t;
  private int u;
  private long v;
  private long w;
  private long x;
  private long y;
  
  public ee(ed paramed)
  {
    a = ((ed)rp.a(paramed));
    if (wl.a >= 18) {}
    try
    {
      l = AudioTrack.class.getMethod("getLatency", null);
      b = new long[10];
      return;
    }
    catch (NoSuchMethodException paramed)
    {
      for (;;) {}
    }
  }
  
  private final void e()
  {
    j = 0L;
    u = 0;
    t = 0;
    k = 0L;
  }
  
  private final long f()
  {
    return g(g());
  }
  
  private final void f(long paramLong)
  {
    if (o)
    {
      Method localMethod = l;
      if ((localMethod != null) && (paramLong - p >= 500000L))
      {
        try
        {
          long l1 = ((Integer)wl.a((Integer)localMethod.invoke(rp.a(c), new Object[0]))).intValue() * 1000L - i;
          m = l1;
          l1 = Math.max(l1, 0L);
          m = l1;
          if (l1 > 5000000L)
          {
            a.a(l1);
            m = 0L;
          }
        }
        catch (Exception localException)
        {
          l = null;
        }
        p = paramLong;
      }
    }
  }
  
  private final long g()
  {
    AudioTrack localAudioTrack = (AudioTrack)rp.a(c);
    if (v != -9223372036854775807L)
    {
      l1 = (SystemClock.elapsedRealtime() * 1000L - v) * g / 1000000L;
      return Math.min(y, x + l1);
    }
    int i1 = localAudioTrack.getPlayState();
    if (i1 == 1) {
      return 0L;
    }
    long l2 = 0xFFFFFFFF & localAudioTrack.getPlaybackHeadPosition();
    long l1 = l2;
    if (h)
    {
      if ((i1 == 2) && (l2 == 0L)) {
        s = q;
      }
      l1 = l2 + s;
    }
    if (wl.a <= 29)
    {
      if ((l1 == 0L) && (q > 0L) && (i1 == 3))
      {
        if (w == -9223372036854775807L) {
          w = SystemClock.elapsedRealtime();
        }
        return q;
      }
      w = -9223372036854775807L;
    }
    if (q > l1) {
      r += 1L;
    }
    q = l1;
    return l1 + (r << 32);
  }
  
  private final long g(long paramLong)
  {
    return paramLong * 1000000L / g;
  }
  
  public final long a(boolean paramBoolean)
  {
    long l1;
    if (((AudioTrack)rp.a(c)).getPlayState() == 3)
    {
      l1 = f();
      if (l1 != 0L)
      {
        l2 = System.nanoTime() / 1000L;
        long l3;
        if (l2 - k >= 30000L)
        {
          localObject = b;
          int i1 = t;
          localObject[i1] = (l1 - l2);
          t = ((i1 + 1) % 10);
          i1 = u;
          if (i1 < 10) {
            u = (i1 + 1);
          }
          k = l2;
          j = 0L;
          for (i1 = 0;; i1++)
          {
            int i2 = u;
            if (i1 >= i2) {
              break;
            }
            l3 = j;
            j = (b[i1] / i2 + l3);
          }
        }
        if (!h)
        {
          localObject = (ec)rp.a(f);
          if (((ec)localObject).a(l2))
          {
            l3 = ((ec)localObject).f();
            long l4 = ((ec)localObject).g();
            if (Math.abs(l3 - l2) > 5000000L)
            {
              a.b(l4, l3, l2, l1);
              ((ec)localObject).a();
            }
            else if (Math.abs(g(l4) - l1) > 5000000L)
            {
              a.a(l4, l3, l2, l1);
              ((ec)localObject).a();
            }
            else
            {
              ((ec)localObject).b();
            }
          }
          f(l2);
        }
      }
    }
    long l2 = System.nanoTime() / 1000L;
    Object localObject = (ec)rp.a(f);
    if (((ec)localObject).c())
    {
      l1 = g(((ec)localObject).g());
      if (!((ec)localObject).d()) {
        return l1;
      }
      return l2 - ((ec)localObject).f() + l1;
    }
    if (u == 0) {
      l1 = f();
    } else {
      l1 = j + l2;
    }
    l2 = l1;
    if (!paramBoolean) {
      l2 = l1 - m;
    }
    return l2;
  }
  
  public final void a()
  {
    ((ec)rp.a(f)).e();
  }
  
  public final void a(AudioTrack paramAudioTrack, int paramInt1, int paramInt2, int paramInt3)
  {
    c = paramAudioTrack;
    d = paramInt2;
    e = paramInt3;
    f = new ec(paramAudioTrack);
    g = paramAudioTrack.getSampleRate();
    if ((wl.a < 23) && ((paramInt1 == 5) || (paramInt1 == 6))) {
      bool = true;
    } else {
      bool = false;
    }
    h = bool;
    boolean bool = wl.c(paramInt1);
    o = bool;
    long l1;
    if (bool) {
      l1 = g(paramInt3 / paramInt2);
    } else {
      l1 = -9223372036854775807L;
    }
    i = l1;
    q = 0L;
    r = 0L;
    s = 0L;
    n = false;
    v = -9223372036854775807L;
    w = -9223372036854775807L;
    m = 0L;
  }
  
  public final boolean a(long paramLong)
  {
    int i1 = ((AudioTrack)rp.a(c)).getPlayState();
    if (h)
    {
      if (i1 == 2)
      {
        n = false;
        return false;
      }
      if ((i1 == 1) && (g() == 0L)) {
        return false;
      }
    }
    boolean bool1 = n;
    boolean bool2 = e(paramLong);
    n = bool2;
    if ((bool1) && (!bool2) && (i1 != 1))
    {
      ed localed = a;
      if (localed != null) {
        localed.a(e, av.a(i));
      }
    }
    return true;
  }
  
  public final int b(long paramLong)
  {
    int i1 = (int)(paramLong - g() * d);
    return e - i1;
  }
  
  public final boolean b()
  {
    return ((AudioTrack)rp.a(c)).getPlayState() == 3;
  }
  
  public final boolean c()
  {
    e();
    if (v == -9223372036854775807L)
    {
      ((ec)rp.a(f)).e();
      return true;
    }
    return false;
  }
  
  public final boolean c(long paramLong)
  {
    return (w != -9223372036854775807L) && (paramLong > 0L) && (SystemClock.elapsedRealtime() - w >= 200L);
  }
  
  public final void d()
  {
    e();
    c = null;
    f = null;
  }
  
  public final void d(long paramLong)
  {
    x = g();
    v = (SystemClock.elapsedRealtime() * 1000L);
    y = paramLong;
  }
  
  public final boolean e(long paramLong)
  {
    if (paramLong <= g())
    {
      int i1;
      if ((h) && (((AudioTrack)rp.a(c)).getPlayState() == 2) && (g() == 0L)) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      if (i1 == 0) {
        return false;
      }
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ee
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */