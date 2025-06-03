package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

final class ls
  implements nw
{
  public final nw a;
  private boolean b;
  
  public ls(lt paramlt, nw paramnw)
  {
    a = paramnw;
  }
  
  public final int a(by paramby, ez paramez, boolean paramBoolean)
  {
    if (c.f()) {
      return -3;
    }
    if (b)
    {
      paramez.a(4);
      return -4;
    }
    int i = a.a(paramby, paramez, paramBoolean);
    if (i == -5)
    {
      paramez = (bw)rp.a(c);
      i = w;
      if ((i != 0) || (x != 0))
      {
        lt locallt = c;
        l = b;
        int j = 0;
        if (l != 0L) {
          i = 0;
        }
        if (c == Long.MIN_VALUE) {
          j = x;
        }
        c = paramez.a(i, j);
      }
      return -5;
    }
    paramby = c;
    long l = c;
    if ((l != Long.MIN_VALUE) && (((i == -4) && (c >= l)) || ((i == -3) && (paramby.d() == Long.MIN_VALUE))))
    {
      paramez.a();
      paramez.a(4);
      b = true;
      return -4;
    }
    return i;
  }
  
  public final void a()
  {
    b = false;
  }
  
  public final boolean b()
  {
    return (!c.f()) && (a.b());
  }
  
  public final int b_(long paramLong)
  {
    if (c.f()) {
      return -3;
    }
    return a.b_(paramLong);
  }
  
  public final void c()
    throws IOException
  {
    a.c();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ls
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */