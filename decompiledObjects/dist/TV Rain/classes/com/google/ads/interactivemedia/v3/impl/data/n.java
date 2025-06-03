package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.ahw;
import z2;

final class n
  extends ai
{
  private final ahw<ak> obstructions;
  
  private n(ahw<ak> paramahw)
  {
    obstructions = paramahw;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof ai))
    {
      paramObject = (ai)paramObject;
      return obstructions.equals(((ai)paramObject).obstructions());
    }
    return false;
  }
  
  public final int hashCode()
  {
    return obstructions.hashCode() ^ 0xF4243;
  }
  
  public final ahw<ak> obstructions()
  {
    return obstructions;
  }
  
  public final String toString()
  {
    String str = String.valueOf(obstructions);
    return z2.l(str.length() + 34, "ObstructionListData{obstructions=", str, "}");
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */