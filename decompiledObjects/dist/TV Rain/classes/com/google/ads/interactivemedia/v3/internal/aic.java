package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;

final class aic
  implements Serializable
{
  private static final long serialVersionUID = 0L;
  private final Object[] a;
  
  public aic(Object[] paramArrayOfObject)
  {
    a = paramArrayOfObject;
  }
  
  public final Object readResolve()
  {
    return aid.a(a);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aic
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */