package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;

final class ahz
  implements Serializable
{
  private static final long serialVersionUID = 0L;
  private final Object[] a;
  
  public ahz(Object[] paramArrayOfObject)
  {
    a = paramArrayOfObject;
  }
  
  public final Object readResolve()
  {
    return ahw.a(a);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ahz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */