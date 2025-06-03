package com.google.ads.interactivemedia.v3.internal;

public final class cg
{
  public static final cg a = new cg(1.0F);
  public final float b;
  public final float c;
  public final boolean d;
  private final int e;
  
  private cg(float paramFloat)
  {
    this(1.0F, 1.0F, false);
  }
  
  public cg(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramFloat1 > 0.0F) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    rp.b(bool2);
    if (paramFloat2 > 0.0F) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    rp.b(bool2);
    b = paramFloat1;
    c = paramFloat2;
    d = paramBoolean;
    e = Math.round(paramFloat1 * 1000.0F);
  }
  
  public final long a(long paramLong)
  {
    return paramLong * e;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (cg.class == paramObject.getClass()))
    {
      paramObject = (cg)paramObject;
      if ((b == b) && (c == c) && (d == d)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = Float.floatToRawIntBits(b);
    return (Float.floatToRawIntBits(c) + (i + 527) * 31) * 31 + d;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.cg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */