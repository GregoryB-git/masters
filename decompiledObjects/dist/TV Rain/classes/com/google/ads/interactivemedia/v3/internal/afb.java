package com.google.ads.interactivemedia.v3.internal;

public final class afb
{
  private final long a;
  
  public afb(long paramLong)
  {
    a = paramLong;
  }
  
  public final long a()
  {
    return a;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof afb)) {
      return false;
    }
    paramObject = (afb)paramObject;
    return a == a;
  }
  
  public final int hashCode()
  {
    return (int)a;
  }
  
  public final String toString()
  {
    long l = a;
    StringBuilder localStringBuilder = new StringBuilder(56);
    localStringBuilder.append("NativeBridgeConfig [adTimeUpdateMs=");
    localStringBuilder.append(l);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.afb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */