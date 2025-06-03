package v3;

import r5.h;
import t5.o;
import v5.e0;
import v5.m;
import x6.b;

public final class j
  implements n0
{
  public final o a;
  public final long b;
  public final long c;
  public final long d;
  public final long e;
  public final int f;
  public final boolean g;
  public final long h;
  public final boolean i;
  public int j;
  public boolean k;
  
  public j(o paramo, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean1, int paramInt6, boolean paramBoolean2)
  {
    j("bufferForPlaybackMs", paramInt3, 0, "0");
    j("bufferForPlaybackAfterRebufferMs", paramInt4, 0, "0");
    j("minBufferMs", paramInt1, paramInt3, "bufferForPlaybackMs");
    j("minBufferMs", paramInt1, paramInt4, "bufferForPlaybackAfterRebufferMs");
    j("maxBufferMs", paramInt2, paramInt1, "minBufferMs");
    j("backBufferDurationMs", paramInt6, 0, "0");
    a = paramo;
    b = e0.I(paramInt1);
    c = e0.I(paramInt2);
    d = e0.I(paramInt3);
    e = e0.I(paramInt4);
    f = paramInt5;
    if (paramInt5 == -1) {
      paramInt5 = 13107200;
    }
    j = paramInt5;
    g = paramBoolean1;
    h = e0.I(paramInt6);
    i = paramBoolean2;
  }
  
  public static void j(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    boolean bool;
    if (paramInt1 >= paramInt2) {
      bool = true;
    } else {
      bool = false;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    localStringBuilder.append(" cannot be less than ");
    localStringBuilder.append(paramString2);
    b.o(localStringBuilder.toString(), bool);
  }
  
  public final void a(j1[] paramArrayOfj1, h[] paramArrayOfh)
  {
    int m = f;
    int n = 0;
    int i1 = m;
    if (m == -1)
    {
      int i2 = 0;
      for (m = i2;; m = i1)
      {
        i1 = paramArrayOfj1.length;
        int i3 = 13107200;
        if (i2 >= i1) {
          break;
        }
        i1 = m;
        if (paramArrayOfh[i2] != null)
        {
          i1 = i3;
          switch (paramArrayOfj1[i2].x())
          {
          case -1: 
          default: 
            throw new IllegalArgumentException();
          case 3: 
          case 4: 
          case 5: 
          case 6: 
            i1 = 131072;
            break;
          case 2: 
            i1 = 131072000;
            break;
          case 0: 
            i1 = 144310272;
            break;
          case -2: 
            i1 = 0;
          }
          i1 = m + i1;
        }
        i2++;
      }
      i1 = Math.max(13107200, m);
    }
    j = i1;
    paramArrayOfj1 = a;
    m = n;
    try
    {
      if (i1 < c) {
        m = 1;
      }
      c = i1;
      if (m != 0) {
        paramArrayOfj1.a();
      }
      return;
    }
    finally {}
  }
  
  public final boolean b()
  {
    return i;
  }
  
  public final long c()
  {
    return h;
  }
  
  public final void d()
  {
    k(false);
  }
  
  public final boolean e(long paramLong, float paramFloat)
  {
    synchronized (a)
    {
      int m = d;
      int n = b;
      int i1 = j;
      boolean bool1 = true;
      if (m * n >= i1) {
        n = 1;
      } else {
        n = 0;
      }
      long l1 = b;
      long l2 = l1;
      if (paramFloat > 1.0F) {
        l2 = Math.min(e0.t(l1, paramFloat), c);
      }
      if (paramLong < Math.max(l2, 500000L))
      {
        boolean bool2 = bool1;
        if (!g) {
          if (n == 0) {
            bool2 = bool1;
          } else {
            bool2 = false;
          }
        }
        k = bool2;
        if ((!bool2) && (paramLong < 500000L)) {
          m.f("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
        }
      }
      else if ((paramLong >= c) || (n != 0))
      {
        k = false;
      }
      return k;
    }
  }
  
  public final void f()
  {
    k(true);
  }
  
  public final boolean g(long paramLong1, float paramFloat, boolean paramBoolean, long paramLong2)
  {
    long l1 = e0.x(paramLong1, paramFloat);
    if (paramBoolean) {
      paramLong1 = e;
    } else {
      paramLong1 = d;
    }
    long l2 = paramLong1;
    if (paramLong2 != -9223372036854775807L) {
      l2 = Math.min(paramLong2 / 2L, paramLong1);
    }
    if ((l2 > 0L) && (l1 < l2))
    {
      if (!g) {}
      synchronized (a)
      {
        int m = d;
        int n = b;
        if (m * n < j) {}
      }
    }
    paramBoolean = true;
    return paramBoolean;
  }
  
  public final o h()
  {
    return a;
  }
  
  public final void i()
  {
    k(true);
  }
  
  public final void k(boolean paramBoolean)
  {
    int m = f;
    int n = m;
    if (m == -1) {
      n = 13107200;
    }
    j = n;
    k = false;
    if (paramBoolean) {
      synchronized (a)
      {
        if (a) {
          try
          {
            if (c > 0) {
              n = 1;
            } else {
              n = 0;
            }
            c = 0;
            if (n != 0) {
              ???.a();
            }
          }
          finally {}
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     v3.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */