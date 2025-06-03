package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

public final class oq
  implements nw
{
  public final or a;
  private final nv b;
  private final int c;
  private boolean d;
  
  public oq(or paramor1, or paramor2, nv paramnv, int paramInt)
  {
    a = paramor2;
    b = paramnv;
    c = paramInt;
  }
  
  private final void d()
  {
    if (!d)
    {
      or.e(e).a(or.b(e)[c], or.c(e)[c], 0, null, or.d(e));
      d = true;
    }
  }
  
  public final int a(by paramby, ez paramez, boolean paramBoolean)
  {
    if (e.f()) {
      return -3;
    }
    d();
    nv localnv = b;
    or localor = e;
    return localnv.a(paramby, paramez, paramBoolean, false, c, b);
  }
  
  public final void a()
  {
    rp.c(or.a(e)[c]);
    or.a(e)[c] = 0;
  }
  
  public final boolean b()
  {
    or localor = e;
    return (c) || ((!localor.f()) && (b.d()));
  }
  
  public final int b_(long paramLong)
  {
    boolean bool = e.f();
    int i = 0;
    if (bool) {
      return 0;
    }
    d();
    if ((e.c) && (paramLong > b.i()))
    {
      i = b.o();
    }
    else
    {
      int j = b.b(paramLong, true, true);
      if (j != -1) {
        i = j;
      }
    }
    return i;
  }
  
  public final void c()
    throws IOException
  {}
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.oq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */