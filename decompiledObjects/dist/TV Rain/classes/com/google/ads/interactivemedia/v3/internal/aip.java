package com.google.ads.interactivemedia.v3.internal;

import a;

final class aip<E>
  extends aid<E>
{
  private final transient E a;
  private transient int b;
  
  public aip(E paramE)
  {
    a = ahf.a(paramE);
  }
  
  public aip(E paramE, int paramInt)
  {
    a = paramE;
    b = paramInt;
  }
  
  public final boolean a()
  {
    return b != 0;
  }
  
  public final int b(Object[] paramArrayOfObject, int paramInt)
  {
    paramArrayOfObject[paramInt] = a;
    return paramInt + 1;
  }
  
  public final aio<E> b()
  {
    return aim.a(a);
  }
  
  public final boolean contains(Object paramObject)
  {
    return a.equals(paramObject);
  }
  
  public final boolean g()
  {
    return false;
  }
  
  public final ahw<E> h()
  {
    return ahw.a(a);
  }
  
  public final int hashCode()
  {
    int i = b;
    int j = i;
    if (i == 0)
    {
      j = a.hashCode();
      b = j;
    }
    return j;
  }
  
  public final int size()
  {
    return 1;
  }
  
  public final String toString()
  {
    String str = a.toString();
    StringBuilder localStringBuilder = new StringBuilder(a.b(str, 2));
    localStringBuilder.append('[');
    localStringBuilder.append(str);
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aip
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */