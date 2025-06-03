package com.google.ads.interactivemedia.v3.internal;

import a;
import z2;

final class aea
  extends afo
{
  private final String TXXX;
  
  public aea(String paramString)
  {
    if (paramString != null)
    {
      TXXX = paramString;
      return;
    }
    throw new NullPointerException("Null TXXX");
  }
  
  public final String TXXX()
  {
    return TXXX;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof afo))
    {
      paramObject = (afo)paramObject;
      return TXXX.equals(((afo)paramObject).TXXX());
    }
    return false;
  }
  
  public final int hashCode()
  {
    return TXXX.hashCode() ^ 0xF4243;
  }
  
  public final String toString()
  {
    String str = TXXX;
    return z2.l(a.b(str, 28), "TimedMetadataWithKeys{TXXX=", str, "}");
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aea
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */