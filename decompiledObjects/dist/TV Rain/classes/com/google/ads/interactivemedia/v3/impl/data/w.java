package com.google.ads.interactivemedia.v3.impl.data;

final class w
  extends ap
{
  private final float volume;
  
  private w(float paramFloat)
  {
    volume = paramFloat;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof ap))
    {
      paramObject = (ap)paramObject;
      if (Float.floatToIntBits(volume) == Float.floatToIntBits(((ap)paramObject).volume())) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Float.floatToIntBits(volume) ^ 0xF4243;
  }
  
  public final String toString()
  {
    float f = volume;
    StringBuilder localStringBuilder = new StringBuilder(40);
    localStringBuilder.append("VolumeUpdateData{volume=");
    localStringBuilder.append(f);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public final float volume()
  {
    return volume;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */