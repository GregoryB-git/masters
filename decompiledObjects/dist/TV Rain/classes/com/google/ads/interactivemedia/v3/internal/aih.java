package com.google.ads.interactivemedia.v3.internal;

final class aih<E>
  extends ahw<E>
{
  public static final ahw<Object> a = new aih(new Object[0], 0);
  private final transient Object[] b;
  private final transient int c;
  
  public aih(Object[] paramArrayOfObject, int paramInt)
  {
    b = paramArrayOfObject;
    c = paramInt;
  }
  
  public final int b(Object[] paramArrayOfObject, int paramInt)
  {
    System.arraycopy(b, 0, paramArrayOfObject, paramInt, c);
    return paramInt + c;
  }
  
  public final Object[] d()
  {
    return b;
  }
  
  public final int e()
  {
    return 0;
  }
  
  public final int f()
  {
    return c;
  }
  
  public final boolean g()
  {
    return false;
  }
  
  public final E get(int paramInt)
  {
    ahf.a(paramInt, c);
    return (E)b[paramInt];
  }
  
  public final int size()
  {
    return c;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aih
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */