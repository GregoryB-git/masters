package com.google.ads.interactivemedia.v3.internal;

import android.os.Looper;
import java.io.IOException;

public final class mh
{
  private final nv a;
  private final fj<?> b;
  private final by c;
  private final boolean d;
  private bw e;
  private fh<?> f;
  
  public mh(nv paramnv, fj<?> paramfj)
  {
    a = paramnv;
    b = paramfj;
    c = new by();
    int i = paramfj.e();
    boolean bool = true;
    if ((i & 0x1) == 0) {
      bool = false;
    }
    d = bool;
  }
  
  public final int a(by paramby, ez paramez, boolean paramBoolean1, boolean paramBoolean2, long paramLong)
  {
    Object localObject = e;
    boolean bool1 = false;
    boolean bool2;
    if ((localObject != null) && (!paramBoolean1))
    {
      if ((b != fj.a) && (l != null) && (((fh)rp.a(f)).a() != 4))
      {
        if (d)
        {
          paramBoolean1 = false;
          bool2 = true;
        }
        else
        {
          bool2 = false;
          bool1 = true;
          paramBoolean1 = bool1;
        }
      }
      else
      {
        paramBoolean1 = false;
        bool2 = paramBoolean1;
      }
    }
    else
    {
      bool2 = false;
      paramBoolean1 = true;
    }
    int i = a.a(c, paramez, paramBoolean1, bool2, paramBoolean2, paramLong);
    if (i == -5)
    {
      if ((bool1) && (e == c.c)) {
        return -3;
      }
      localObject = (bw)rp.a(c.c);
      c = ((bw)localObject);
      paramez = e;
      if (paramez != null) {
        paramez = l;
      } else {
        paramez = null;
      }
      e = ((bw)localObject);
      if (b != fj.a)
      {
        a = true;
        b = f;
        if (!wl.a(paramez, l))
        {
          fh localfh = f;
          if (e.l != null)
          {
            paramez = b;
            localObject = (Looper)rp.a(Looper.myLooper());
            f = paramez.c();
          }
          else
          {
            f = null;
          }
          b = f;
          if (localfh != null) {
            localfh.e();
          }
        }
      }
    }
    return i;
  }
  
  public final void a()
  {
    fh localfh = f;
    if (localfh != null)
    {
      localfh.e();
      f = null;
    }
  }
  
  public final boolean a(boolean paramBoolean)
  {
    int i = a.p();
    if (i == 0) {
      return paramBoolean;
    }
    if (i == 1) {
      return true;
    }
    if (i == 2) {
      return (f == null) || (d);
    }
    if (i == 3) {
      return (b == fj.a) || (((fh)rp.a(f)).a() == 4);
    }
    throw new IllegalStateException();
  }
  
  public final void b()
    throws IOException
  {
    fh localfh = f;
    if ((localfh != null) && (localfh.a() == 1)) {
      throw ((fg)rp.a(f.b()));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.mh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */