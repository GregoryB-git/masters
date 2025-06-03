package com.google.ads.interactivemedia.v3.internal;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public final class um
  implements ux
{
  public static final ur a = new ur(2, -9223372036854775807L, (byte)0);
  public static final ur b = new ur(3, -9223372036854775807L, (byte)0);
  private final ExecutorService c;
  private uq<? extends ut> d;
  private IOException e;
  
  static
  {
    a(false, -9223372036854775807L);
    a(true, -9223372036854775807L);
  }
  
  public um(String paramString)
  {
    c = wl.a(paramString);
  }
  
  public static ur a(boolean paramBoolean, long paramLong)
  {
    return new ur(paramBoolean, paramLong, (byte)0);
  }
  
  public final <T extends ut> long a(T paramT, uo<T> paramuo, int paramInt)
  {
    Looper localLooper = Looper.myLooper();
    boolean bool;
    if (localLooper != null) {
      bool = true;
    } else {
      bool = false;
    }
    rp.c(bool);
    e = null;
    long l = SystemClock.elapsedRealtime();
    new uq(this, localLooper, paramT, paramuo, paramInt, l).a(0L);
    return l;
  }
  
  public final void a()
    throws IOException
  {
    a(Integer.MIN_VALUE);
  }
  
  public final void a(int paramInt)
    throws IOException
  {
    Object localObject = e;
    if (localObject == null)
    {
      localObject = d;
      if (localObject != null)
      {
        int i = paramInt;
        if (paramInt == Integer.MIN_VALUE) {
          i = a;
        }
        ((uq)localObject).a(i);
      }
      return;
    }
    throw ((Throwable)localObject);
  }
  
  public final void a(us paramus)
  {
    uq localuq = d;
    if (localuq != null) {
      localuq.a(true);
    }
    if (paramus != null) {
      c.execute(new uv(paramus));
    }
    c.shutdown();
  }
  
  public final boolean b()
  {
    return d != null;
  }
  
  public final void c()
  {
    d.a(false);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.um
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */