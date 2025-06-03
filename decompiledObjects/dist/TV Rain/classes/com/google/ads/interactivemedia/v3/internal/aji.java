package com.google.ads.interactivemedia.v3.internal;

final class aji
{
  private final Object a;
  private final int b;
  
  public aji(Object paramObject)
  {
    b = System.identityHashCode(paramObject);
    a = paramObject;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof aji)) {
      return false;
    }
    paramObject = (aji)paramObject;
    if (b != b) {
      return false;
    }
    return a == a;
  }
  
  public final int hashCode()
  {
    return b;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aji
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */