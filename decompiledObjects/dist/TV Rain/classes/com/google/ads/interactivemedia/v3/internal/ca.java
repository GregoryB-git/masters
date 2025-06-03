package com.google.ads.interactivemedia.v3.internal;

import a;

public class ca
{
  private final tk a;
  private final long b;
  private final long c;
  private final long d;
  private final long e;
  private final long f;
  private final int g;
  private final boolean h;
  private final long i;
  private final boolean j;
  private int k;
  private boolean l;
  private boolean m;
  
  public ca()
  {
    this(new tk(true, 65536));
  }
  
  @Deprecated
  public ca(tk paramtk)
  {
    this(paramtk, 15000, 50000, 50000, 2500, 5000, -1, true, 0, false);
  }
  
  public ca(tk paramtk, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean1, int paramInt7, boolean paramBoolean2)
  {
    a(2500, 0, "bufferForPlaybackMs", "0");
    a(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
    a(15000, 2500, "minBufferAudioMs", "bufferForPlaybackMs");
    a(50000, 2500, "minBufferVideoMs", "bufferForPlaybackMs");
    a(15000, 5000, "minBufferAudioMs", "bufferForPlaybackAfterRebufferMs");
    a(50000, 5000, "minBufferVideoMs", "bufferForPlaybackAfterRebufferMs");
    a(50000, 15000, "maxBufferMs", "minBufferAudioMs");
    a(50000, 50000, "maxBufferMs", "minBufferVideoMs");
    a(0, 0, "backBufferDurationMs", "0");
    a = paramtk;
    b = av.b(15000L);
    c = av.b(50000L);
    d = av.b(50000L);
    e = av.b(2500L);
    f = av.b(5000L);
    g = -1;
    h = true;
    i = av.b(0L);
    j = false;
  }
  
  private static int a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException();
    case 6: 
      return 0;
    case 3: 
    case 4: 
    case 5: 
      return 131072;
    case 2: 
      return 32768000;
    case 1: 
      return 3538944;
    }
    return 36438016;
  }
  
  private static void a(int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    boolean bool;
    if (paramInt1 >= paramInt2) {
      bool = true;
    } else {
      bool = false;
    }
    StringBuilder localStringBuilder = new StringBuilder(a.b(paramString2, a.b(paramString1, 21)));
    localStringBuilder.append(paramString1);
    localStringBuilder.append(" cannot be less than ");
    localStringBuilder.append(paramString2);
    rp.a(bool, localStringBuilder.toString());
  }
  
  private void a(boolean paramBoolean)
  {
    k = 0;
    l = false;
    if (paramBoolean) {
      a.d();
    }
  }
  
  public static int b(cj[] paramArrayOfcj, td paramtd)
  {
    int n = 0;
    int i2;
    for (int i1 = 0; n < paramArrayOfcj.length; i1 = i2)
    {
      i2 = i1;
      if (paramtd.a(n) != null) {
        i2 = i1 + a(paramArrayOfcj[n].a());
      }
      n++;
    }
    return i1;
  }
  
  private static boolean c(cj[] paramArrayOfcj, td paramtd)
  {
    for (int n = 0; n < paramArrayOfcj.length; n++) {
      if ((paramArrayOfcj[n].a() == 2) && (paramtd.a(n) != null)) {
        return true;
      }
    }
    return false;
  }
  
  public void a()
  {
    a(false);
  }
  
  public void a(cj[] paramArrayOfcj, td paramtd)
  {
    m = c(paramArrayOfcj, paramtd);
    int n = g;
    int i1 = n;
    if (n == -1) {
      i1 = b(paramArrayOfcj, paramtd);
    }
    k = i1;
    a.a(i1);
  }
  
  public boolean a(long paramLong, float paramFloat)
  {
    int n = a.e();
    int i1 = k;
    boolean bool1 = true;
    if (n >= i1) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    long l1;
    if (m) {
      l1 = c;
    } else {
      l1 = b;
    }
    long l2 = l1;
    if (paramFloat > 1.0F) {
      l2 = Math.min(wl.a(l1, paramFloat), d);
    }
    if (paramLong < l2)
    {
      boolean bool2 = bool1;
      if (!h) {
        if (i1 == 0) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }
      }
      l = bool2;
    }
    else if ((paramLong >= d) || (i1 != 0))
    {
      l = false;
    }
    return l;
  }
  
  public boolean a(long paramLong, float paramFloat, boolean paramBoolean)
  {
    long l1 = wl.b(paramLong, paramFloat);
    if (paramBoolean) {
      paramLong = f;
    } else {
      paramLong = e;
    }
    return (paramLong <= 0L) || (l1 >= paramLong) || ((!h) && (a.e() >= k));
  }
  
  public void b()
  {
    a(true);
  }
  
  public void c()
  {
    a(true);
  }
  
  public tk d()
  {
    return a;
  }
  
  public long e()
  {
    return i;
  }
  
  public boolean f()
  {
    return j;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ca
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */