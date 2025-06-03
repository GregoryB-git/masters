package com.google.ads.interactivemedia.v3.internal;

import z2;

final class ahj<T>
  extends ahh<T>
{
  private static final long serialVersionUID = 0L;
  private final T a;
  
  public ahj(T paramT)
  {
    a = paramT;
  }
  
  public final <V> ahh<V> a(ahe<? super T, V> paramahe)
  {
    return new ahj(ahf.b(paramahe.apply(a), "the Function passed to Optional.transform() must not return null."));
  }
  
  public final T a()
  {
    return (T)a;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof ahj))
    {
      paramObject = (ahj)paramObject;
      return a.equals(a);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return a.hashCode() + 1502476572;
  }
  
  public final String toString()
  {
    String str = String.valueOf(a);
    return z2.l(str.length() + 13, "Optional.of(", str, ")");
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ahj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */