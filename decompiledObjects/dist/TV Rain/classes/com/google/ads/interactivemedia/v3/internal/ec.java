package com.google.ads.interactivemedia.v3.internal;

import android.media.AudioTrack;

final class ec
{
  private final eb a;
  private int b;
  private long c;
  private long d;
  private long e;
  private long f;
  
  public ec(AudioTrack paramAudioTrack)
  {
    if (wl.a >= 19)
    {
      a = new eb(paramAudioTrack);
      e();
      return;
    }
    a = null;
    a(3);
  }
  
  private final void a(int paramInt)
  {
    b = paramInt;
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if ((paramInt != 2) && (paramInt != 3))
        {
          if (paramInt == 4)
          {
            d = 500000L;
            return;
          }
          throw new IllegalStateException();
        }
        d = 10000000L;
        return;
      }
      d = 5000L;
      return;
    }
    e = 0L;
    f = -1L;
    c = (System.nanoTime() / 1000L);
    d = 5000L;
  }
  
  public final void a()
  {
    a(4);
  }
  
  public final boolean a(long paramLong)
  {
    eb localeb = a;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (localeb != null) {
      if (paramLong - e < d)
      {
        bool2 = bool1;
      }
      else
      {
        e = paramLong;
        boolean bool3 = localeb.a();
        int i = b;
        if (i != 0)
        {
          if (i != 1)
          {
            if (i != 2)
            {
              if (i != 3)
              {
                if (i != 4) {
                  throw new IllegalStateException();
                }
              }
              else if (bool3) {
                e();
              }
            }
            else if (!bool3) {
              e();
            }
          }
          else if (bool3)
          {
            if (a.c() > f) {
              a(2);
            }
          }
          else {
            e();
          }
        }
        else if (bool3)
        {
          bool2 = bool1;
          if (a.b() < c) {
            break label218;
          }
          f = a.c();
          a(1);
        }
        else if (paramLong - c > 500000L)
        {
          a(3);
        }
        bool2 = bool3;
      }
    }
    label218:
    return bool2;
  }
  
  public final void b()
  {
    if (b == 4) {
      e();
    }
  }
  
  public final boolean c()
  {
    int i = b;
    return (i == 1) || (i == 2);
  }
  
  public final boolean d()
  {
    return b == 2;
  }
  
  public final void e()
  {
    if (a != null) {
      a(0);
    }
  }
  
  public final long f()
  {
    eb localeb = a;
    if (localeb != null) {
      return localeb.b();
    }
    return -9223372036854775807L;
  }
  
  public final long g()
  {
    eb localeb = a;
    if (localeb != null) {
      return localeb.c();
    }
    return -1L;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ec
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */