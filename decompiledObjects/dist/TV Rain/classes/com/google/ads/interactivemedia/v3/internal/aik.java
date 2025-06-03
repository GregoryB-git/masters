package com.google.ads.interactivemedia.v3.internal;

final class aik
  extends ahw<Object>
{
  private final transient Object[] a;
  private final transient int b;
  private final transient int c;
  
  public aik(Object[] paramArrayOfObject, int paramInt1, int paramInt2)
  {
    a = paramArrayOfObject;
    b = paramInt1;
    c = paramInt2;
  }
  
  public final boolean g()
  {
    return true;
  }
  
  public final Object get(int paramInt)
  {
    ahf.a(paramInt, c);
    return a[(paramInt * 2 + b)];
  }
  
  public final int size()
  {
    return c;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aik
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */