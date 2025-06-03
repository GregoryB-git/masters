package com.google.ads.interactivemedia.v3.api.player;

import com.google.ads.interactivemedia.v3.internal.ahf;

public final class VideoProgressUpdate
{
  public static final VideoProgressUpdate VIDEO_TIME_NOT_READY = new VideoProgressUpdate(-1L, -1L);
  private float currentTime;
  private float duration;
  
  public VideoProgressUpdate(long paramLong1, long paramLong2)
  {
    currentTime = ((float)paramLong1 / 1000.0F);
    duration = ((float)paramLong2 / 1000.0F);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    if (VideoProgressUpdate.class != paramObject.getClass()) {
      return false;
    }
    paramObject = (VideoProgressUpdate)paramObject;
    if (Float.floatToIntBits(currentTime) != Float.floatToIntBits(currentTime)) {
      return false;
    }
    return Float.floatToIntBits(duration) == Float.floatToIntBits(duration);
  }
  
  public final float getCurrentTime()
  {
    return currentTime;
  }
  
  public final float getDuration()
  {
    return duration;
  }
  
  public final int hashCode()
  {
    return ahf.a(new Object[] { Float.valueOf(currentTime), Float.valueOf(duration) });
  }
  
  public final String toString()
  {
    float f1 = currentTime;
    float f2 = duration;
    StringBuilder localStringBuilder = new StringBuilder(75);
    localStringBuilder.append("VideoProgressUpdate [currentTime=");
    localStringBuilder.append(f1);
    localStringBuilder.append(", duration=");
    localStringBuilder.append(f2);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */