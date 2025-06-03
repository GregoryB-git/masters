package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import z2;

public final class SeekPoint
{
  public static final SeekPoint START = new SeekPoint(0L, 0L);
  public final long position;
  public final long timeUs;
  
  public SeekPoint(long paramLong1, long paramLong2)
  {
    timeUs = paramLong1;
    position = paramLong2;
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (SeekPoint.class == paramObject.getClass()))
    {
      paramObject = (SeekPoint)paramObject;
      if ((timeUs != timeUs) || (position != position)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return (int)timeUs * 31 + (int)position;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("[timeUs=");
    localStringBuilder.append(timeUs);
    localStringBuilder.append(", position=");
    return z2.r(localStringBuilder, position, "]");
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.SeekPoint
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */