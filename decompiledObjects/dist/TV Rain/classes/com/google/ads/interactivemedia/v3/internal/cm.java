package com.google.ads.interactivemedia.v3.internal;

import android.os.Looper;
import java.io.IOException;

public abstract class cm
  implements cj
{
  private final int a;
  private cl b;
  private int c;
  private int d;
  private nw e;
  private bw[] f;
  private long g;
  private long h;
  private boolean i;
  
  public cm(int paramInt)
  {
    a = paramInt;
    h = Long.MIN_VALUE;
  }
  
  public static boolean a(fj<?> paramfj, fe paramfe)
  {
    if (paramfe == null) {
      return true;
    }
    if (paramfj == null) {
      return false;
    }
    return paramfj.b();
  }
  
  public boolean A()
  {
    if (i()) {
      return i;
    }
    return e.b();
  }
  
  public int a()
  {
    return a;
  }
  
  public abstract int a(bw parambw)
    throws ba;
  
  public int a(by paramby, ez paramez, boolean paramBoolean)
  {
    int j = e.a(paramby, paramez, paramBoolean);
    long l;
    if (j == -4)
    {
      if (paramez.c())
      {
        h = Long.MIN_VALUE;
        if (i) {
          return -4;
        }
        return -3;
      }
      l = c + g;
      c = l;
      h = Math.max(h, l);
    }
    else if (j == -5)
    {
      paramez = c;
      l = m;
      if (l != Long.MAX_VALUE) {
        c = paramez.a(l + g);
      }
    }
    return j;
  }
  
  public <T extends fk> fh<T> a(bw parambw1, bw parambw2, fj<T> paramfj, fh<T> paramfh)
    throws ba
  {
    fe localfe = l;
    Object localObject = null;
    if (parambw1 == null) {
      parambw1 = null;
    } else {
      parambw1 = l;
    }
    if (!(wl.a(localfe, parambw1) ^ true)) {
      return paramfh;
    }
    parambw1 = (bw)localObject;
    if (l != null) {
      if (paramfj != null)
      {
        parambw1 = (Looper)rp.a(Looper.myLooper());
        parambw1 = paramfj.c();
      }
      else
      {
        throw ba.a(new IllegalStateException("Media requires a DrmSessionManager"), z());
      }
    }
    if (paramfh != null) {
      paramfh.e();
    }
    return parambw1;
  }
  
  public void a(float paramFloat)
    throws ba
  {}
  
  public void a(int paramInt)
  {
    c = paramInt;
  }
  
  public void a(int paramInt, Object paramObject)
    throws ba
  {}
  
  public void a(long paramLong)
    throws ba
  {
    i = false;
    h = paramLong;
    a(paramLong, false);
  }
  
  public void a(long paramLong, boolean paramBoolean)
    throws ba
  {}
  
  public void a(cl paramcl, bw[] paramArrayOfbw, nw paramnw, long paramLong1, boolean paramBoolean, long paramLong2)
    throws ba
  {
    boolean bool;
    if (d == 0) {
      bool = true;
    } else {
      bool = false;
    }
    rp.c(bool);
    b = paramcl;
    d = 1;
    a(paramBoolean);
    a(paramArrayOfbw, paramnw, paramLong2);
    a(paramLong1, paramBoolean);
  }
  
  public void a(boolean paramBoolean)
    throws ba
  {}
  
  public void a(bw[] paramArrayOfbw, long paramLong)
    throws ba
  {}
  
  public void a(bw[] paramArrayOfbw, nw paramnw, long paramLong)
    throws ba
  {
    rp.c(i ^ true);
    e = paramnw;
    h = paramLong;
    f = paramArrayOfbw;
    g = paramLong;
    a(paramArrayOfbw, paramLong);
  }
  
  public int b(long paramLong)
  {
    return e.b_(paramLong - g);
  }
  
  public cm b()
  {
    return this;
  }
  
  public vt e()
  {
    return null;
  }
  
  public int f()
  {
    return d;
  }
  
  public void g()
    throws ba
  {
    int j = d;
    boolean bool = true;
    if (j != 1) {
      bool = false;
    }
    rp.c(bool);
    d = 2;
    t();
  }
  
  public nw h()
  {
    return e;
  }
  
  public boolean i()
  {
    return h == Long.MIN_VALUE;
  }
  
  public long j()
  {
    return h;
  }
  
  public void k()
  {
    i = true;
  }
  
  public boolean l()
  {
    return i;
  }
  
  public void m()
    throws IOException
  {
    e.c();
  }
  
  public void p()
    throws ba
  {
    boolean bool;
    if (d == 2) {
      bool = true;
    } else {
      bool = false;
    }
    rp.c(bool);
    d = 1;
    u();
  }
  
  public void q()
  {
    int j = d;
    boolean bool = true;
    if (j != 1) {
      bool = false;
    }
    rp.c(bool);
    d = 0;
    e = null;
    f = null;
    i = false;
    v();
  }
  
  public void r()
  {
    boolean bool;
    if (d == 0) {
      bool = true;
    } else {
      bool = false;
    }
    rp.c(bool);
    w();
  }
  
  public int s()
    throws ba
  {
    return 0;
  }
  
  public void t()
    throws ba
  {}
  
  public void u()
    throws ba
  {}
  
  public void v() {}
  
  public void w() {}
  
  public bw[] x()
  {
    return f;
  }
  
  public cl y()
  {
    return b;
  }
  
  public int z()
  {
    return c;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.cm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */