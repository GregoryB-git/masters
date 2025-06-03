package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import z2;

public final class SeekMap$SeekPoints
{
  public final SeekPoint first;
  public final SeekPoint second;
  
  public SeekMap$SeekPoints(SeekPoint paramSeekPoint)
  {
    this(paramSeekPoint, paramSeekPoint);
  }
  
  public SeekMap$SeekPoints(SeekPoint paramSeekPoint1, SeekPoint paramSeekPoint2)
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

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.SeekMap.SeekPoints
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */