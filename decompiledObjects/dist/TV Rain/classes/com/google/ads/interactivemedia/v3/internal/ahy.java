package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

final class ahy
  extends ahw
{
  private final transient int a;
  private final transient int b;
  
  public ahy(ahw paramahw, int paramInt1, int paramInt2)
  {
    a = paramInt1;
    b = paramInt2;
  }
  
  public final ahw a(int paramInt1, int paramInt2)
  {
    ahf.a(paramInt1, paramInt2, b);
    ahw localahw = c;
    int i = a;
    return localahw.a(paramInt1 + i, paramInt2 + i);
  }
  
  public final Object[] d()
  {
    return c.d();
  }
  
  public final int e()
  {
    return c.e() + a;
  }
  
  public final int f()
  {
    return c.e() + a + b;
  }
  
  public final boolean g()
  {
    return true;
  }
  
  public final Object get(int paramInt)
  {
    ahf.a(paramInt, b);
    return c.get(paramInt + a);
  }
  
  public final int size()
  {
    return b;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ahy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */