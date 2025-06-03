package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Looper;

public final class ch
{
  private final cj a;
  private final ck b;
  private final cr c;
  private int d;
  private Object e;
  private Handler f;
  private int g;
  private long h;
  private boolean i;
  private boolean j;
  private boolean k;
  private boolean l;
  
  public ch(ck paramck, cj paramcj, cr paramcr, int paramInt, Handler paramHandler)
  {
    b = paramck;
    a = paramcj;
    c = paramcr;
    f = paramHandler;
    g = paramInt;
    h = -9223372036854775807L;
    i = true;
  }
  
  public final ch a(int paramInt)
  {
    rp.c(j ^ true);
    d = paramInt;
    return this;
  }
  
  public final ch a(Object paramObject)
  {
    rp.c(j ^ true);
    e = paramObject;
    return this;
  }
  
  public final cr a()
  {
    return c;
  }
  
  public final void a(boolean paramBoolean)
  {
    try
    {
      k = (paramBoolean | k);
      l = true;
      notifyAll();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final cj b()
  {
    return a;
  }
  
  public final int c()
  {
    return d;
  }
  
  public final Object d()
  {
    return e;
  }
  
  public final Handler e()
  {
    return f;
  }
  
  public final long f()
  {
    return h;
  }
  
  public final int g()
  {
    return g;
  }
  
  public final boolean h()
  {
    return i;
  }
  
  public final ch i()
  {
    rp.c(j ^ true);
    if (h == -9223372036854775807L) {
      rp.b(i);
    }
    j = true;
    b.a(this);
    return this;
  }
  
  public final boolean j()
  {
    return false;
  }
  
  public final boolean k()
    throws InterruptedException
  {
    try
    {
      rp.c(j);
      if (f.getLooper().getThread() != Thread.currentThread()) {
        bool = true;
      } else {
        bool = false;
      }
      rp.c(bool);
      while (!l) {
        wait();
      }
      boolean bool = k;
      return bool;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ch
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */