package com.google.ads.interactivemedia.v3.internal;

final class ahb<T>
  extends ahh<T>
{
  public static final ahb<Object> a = new ahb();
  private static final long serialVersionUID = 0L;
  
  private final Object readResolve()
  {
    return a;
  }
  
  public final <V> ahh<V> a(ahe<? super T, V> paramahe)
  {
    ahf.a(paramahe);
    return a;
  }
  
  public final T a()
  {
    return null;
  }
  
  public final boolean equals(Object paramObject)
  {
    return paramObject == this;
  }
  
  public final int hashCode()
  {
    return 2040732332;
  }
  
  public final String toString()
  {
    return "Optional.absent()";
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ahb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */