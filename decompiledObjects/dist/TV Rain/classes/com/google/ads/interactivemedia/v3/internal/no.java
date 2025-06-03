package com.google.ads.interactivemedia.v3.internal;

final class no
{
  public final boolean a;
  private final int b;
  
  public no(int paramInt, boolean paramBoolean)
  {
    b = paramInt;
    a = paramBoolean;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (no.class == paramObject.getClass()))
    {
      paramObject = (no)paramObject;
      if ((b == b) && (a == a)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return b * 31 + a;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.no
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */