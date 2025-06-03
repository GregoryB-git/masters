package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import z2;

public abstract interface SeekMap
{
  public abstract long getDurationUs();
  
  public abstract SeekPoints getSeekPoints(long paramLong);
  
  public abstract boolean isSeekable();
  
  public static final class SeekPoints
  {
    public final SeekPoint first;
    public final SeekPoint second;
    
    public SeekPoints(SeekPoint paramSeekPoint)
    {
      this(paramSeekPoint, paramSeekPoint);
    }
    
    public SeekPoints(SeekPoint paramSeekPoint1, SeekPoint paramSeekPoint2)
    {
      first = ((SeekPoint)Assertions.checkNotNull(paramSeekPoint1));
      second = ((SeekPoint)Assertions.checkNotNull(paramSeekPoint2));
    }
    
    public boolean equals(@Nullable Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (SeekPoints.class == paramObject.getClass()))
      {
        paramObject = (SeekPoints)paramObject;
        if ((!first.equals(first)) || (!second.equals(second))) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public int hashCode()
    {
      int i = first.hashCode();
      return second.hashCode() + i * 31;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = z2.t("[");
      localStringBuilder.append(first);
      Object localObject;
      if (first.equals(second))
      {
        localObject = "";
      }
      else
      {
        localObject = z2.t(", ");
        ((StringBuilder)localObject).append(second);
        localObject = ((StringBuilder)localObject).toString();
      }
      return z2.s(localStringBuilder, (String)localObject, "]");
    }
  }
  
  public static final class Unseekable
    implements SeekMap
  {
    private final long durationUs;
    private final SeekMap.SeekPoints startSeekPoints;
    
    public Unseekable(long paramLong)
    {
      this(paramLong, 0L);
    }
    
    public Unseekable(long paramLong1, long paramLong2)
    {
      durationUs = paramLong1;
      SeekPoint localSeekPoint;
      if (paramLong2 == 0L) {
        localSeekPoint = SeekPoint.START;
      } else {
        localSeekPoint = new SeekPoint(0L, paramLong2);
      }
      startSeekPoints = new SeekMap.SeekPoints(localSeekPoint);
    }
    
    public long getDurationUs()
    {
      return durationUs;
    }
    
    public SeekMap.SeekPoints getSeekPoints(long paramLong)
    {
      return startSeekPoints;
    }
    
    public boolean isSeekable()
    {
      return false;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.SeekMap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */