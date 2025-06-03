package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

final class rf
  implements nw
{
  private final int a;
  private final re b;
  private int c;
  
  public rf(re paramre, int paramInt)
  {
    b = paramre;
    a = paramInt;
    c = -1;
  }
  
  private final boolean e()
  {
    int i = c;
    return (i != -1) && (i != -3) && (i != -2);
  }
  
  public final int a(by paramby, ez paramez, boolean paramBoolean)
  {
    if (c == -3)
    {
      paramez.b(4);
      return -4;
    }
    if (e()) {
      return b.a(c, paramby, paramez, paramBoolean);
    }
    return -3;
  }
  
  public final void a()
  {
    boolean bool;
    if (c == -1) {
      bool = true;
    } else {
      bool = false;
    }
    rp.b(bool);
    c = b.a(a);
  }
  
  public final boolean b()
  {
    return (c == -3) || ((e()) && (b.c(c)));
  }
  
  public final int b_(long paramLong)
  {
    if (e()) {
      return b.a(c, paramLong);
    }
    return 0;
  }
  
  public final void c()
    throws IOException
  {
    int i = c;
    if (i != -2)
    {
      if (i == -1)
      {
        b.j();
        return;
      }
      if (i != -3) {
        b.d(i);
      }
      return;
    }
    throw new aix(b.f().a(a).a(0).i);
  }
  
  public final void d()
  {
    if (c != -1)
    {
      b.b(a);
      c = -1;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.rf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */