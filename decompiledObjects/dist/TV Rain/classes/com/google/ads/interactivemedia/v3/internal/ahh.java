package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;

public abstract class ahh<T>
  implements Serializable
{
  private static final long serialVersionUID = 0L;
  
  public static <T> ahh<T> a(T paramT)
  {
    if (paramT == null) {
      return ahb.a;
    }
    return new ahj(paramT);
  }
  
  public abstract <V> ahh<V> a(ahe<? super T, V> paramahe);
  
  public abstract T a();
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ahh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */