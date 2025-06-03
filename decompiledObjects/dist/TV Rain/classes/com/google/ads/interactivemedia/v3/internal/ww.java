package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.WindowManager;

public final class ww
{
  private final WindowManager a;
  private final wy b;
  private final wv c;
  private long d;
  private long e;
  private long f;
  private long g;
  private long h;
  private boolean i;
  private long j;
  private long k;
  private long l;
  
  public ww()
  {
    this(null);
  }
  
  public ww(Context paramContext)
  {
    Object localObject = null;
    Context localContext;
    if (paramContext != null)
    {
      localContext = paramContext.getApplicationContext();
      a = ((WindowManager)localContext.getSystemService("window"));
    }
    else
    {
      a = null;
      localContext = paramContext;
    }
    if (a != null)
    {
      paramContext = (Context)localObject;
      if (wl.a >= 17)
      {
        paramContext = (DisplayManager)localContext.getSystemService("display");
        if (paramContext == null) {
          paramContext = (Context)localObject;
        } else {
          paramContext = new wv(this, paramContext);
        }
      }
      c = paramContext;
      b = wy.a();
    }
    else
    {
      c = null;
      b = null;
    }
    d = -9223372036854775807L;
    e = -9223372036854775807L;
  }
  
  private final boolean b(long paramLong1, long paramLong2)
  {
    long l1 = k;
    return Math.abs(paramLong2 - j - (paramLong1 - l1)) > 20000000L;
  }
  
  private final void c()
  {
    Display localDisplay = a.getDefaultDisplay();
    if (localDisplay != null)
    {
      long l1 = (1.0E9D / localDisplay.getRefreshRate());
      d = l1;
      e = (l1 * 80L / 100L);
    }
  }
  
  public final long a(long paramLong1, long paramLong2)
  {
    long l1 = 1000L * paramLong1;
    if (i)
    {
      if (paramLong1 != f)
      {
        l += 1L;
        g = h;
      }
      l2 = l;
      if (l2 >= 6L)
      {
        l2 = (l1 - k) / l2;
        l3 = g + l2;
        if (b(l3, paramLong2))
        {
          i = false;
        }
        else
        {
          l2 = j + l3 - k;
          break label134;
        }
      }
      else if (b(l1, paramLong2))
      {
        i = false;
      }
    }
    long l2 = paramLong2;
    long l3 = l1;
    label134:
    if (!i)
    {
      k = l1;
      j = paramLong2;
      l = 0L;
      i = true;
    }
    f = paramLong1;
    h = l3;
    wy localwy = b;
    if ((localwy != null) && (d != -9223372036854775807L))
    {
      paramLong1 = a;
      if (paramLong1 == -9223372036854775807L) {
        return l2;
      }
      l3 = d;
      paramLong1 = (l2 - paramLong1) / l3 * l3 + paramLong1;
      if (l2 <= paramLong1)
      {
        paramLong2 = paramLong1 - l3;
      }
      else
      {
        paramLong2 = paramLong1;
        paramLong1 = l3 + paramLong1;
      }
      if (paramLong1 - l2 >= l2 - paramLong2) {
        paramLong1 = paramLong2;
      }
      return paramLong1 - e;
    }
    return l2;
  }
  
  public final void a()
  {
    i = false;
    if (a != null)
    {
      b.b();
      wv localwv = c;
      if (localwv != null) {
        localwv.a();
      }
      c();
    }
  }
  
  public final void b()
  {
    if (a != null)
    {
      wv localwv = c;
      if (localwv != null) {
        localwv.b();
      }
      b.c();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ww
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */