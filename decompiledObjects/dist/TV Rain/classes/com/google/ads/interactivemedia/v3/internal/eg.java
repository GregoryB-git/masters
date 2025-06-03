package com.google.ads.interactivemedia.v3.internal;

public final class eg
{
  public final int a = 0;
  public final float b = 0.0F;
  
  public eg(int paramInt, float paramFloat) {}
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (eg.class == paramObject.getClass()))
    {
      paramObject = (eg)paramObject;
      if ((a == a) && (Float.compare(b, b) == 0)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a;
    return Float.floatToIntBits(b) + (i + 527) * 31;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.eg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */