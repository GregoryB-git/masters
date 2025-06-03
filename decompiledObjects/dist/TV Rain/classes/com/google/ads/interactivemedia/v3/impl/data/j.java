package com.google.ads.interactivemedia.v3.impl.data;

final class j
  extends z
{
  private final double end;
  private final boolean played;
  private final double start;
  
  public j(double paramDouble1, double paramDouble2, boolean paramBoolean)
  {
    start = paramDouble1;
    end = paramDouble2;
    played = paramBoolean;
  }
  
  public final double end()
  {
    return end;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof z))
    {
      paramObject = (z)paramObject;
      if ((Double.doubleToLongBits(start) == Double.doubleToLongBits(((z)paramObject).start())) && (Double.doubleToLongBits(end) == Double.doubleToLongBits(((z)paramObject).end())) && (played == ((z)paramObject).played())) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = (int)(Double.doubleToLongBits(start) >>> 32 ^ Double.doubleToLongBits(start));
    int j = (int)(Double.doubleToLongBits(end) >>> 32 ^ Double.doubleToLongBits(end));
    int k;
    if (played) {
      k = 1231;
    } else {
      k = 1237;
    }
    return ((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ k;
  }
  
  public final boolean played()
  {
    return played;
  }
  
  public final double start()
  {
    return start;
  }
  
  public final String toString()
  {
    double d1 = start;
    double d2 = end;
    boolean bool = played;
    StringBuilder localStringBuilder = new StringBuilder(88);
    localStringBuilder.append("CuePointData{start=");
    localStringBuilder.append(d1);
    localStringBuilder.append(", end=");
    localStringBuilder.append(d2);
    localStringBuilder.append(", played=");
    localStringBuilder.append(bool);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */