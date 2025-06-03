package com.google.android.exoplayer2.offline;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class StreamKey
  implements Comparable<StreamKey>
{
  public final int groupIndex;
  public final int periodIndex;
  public final int trackIndex;
  
  public StreamKey(int paramInt1, int paramInt2)
  {
    this(0, paramInt1, paramInt2);
  }
  
  public StreamKey(int paramInt1, int paramInt2, int paramInt3)
  {
    periodIndex = paramInt1;
    groupIndex = paramInt2;
    trackIndex = paramInt3;
  }
  
  public int compareTo(@NonNull StreamKey paramStreamKey)
  {
    int i = periodIndex - periodIndex;
    int j = i;
    if (i == 0)
    {
      i = groupIndex - groupIndex;
      j = i;
      if (i == 0) {
        j = trackIndex - trackIndex;
      }
    }
    return j;
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (StreamKey.class == paramObject.getClass()))
    {
      paramObject = (StreamKey)paramObject;
      if ((periodIndex != periodIndex) || (groupIndex != groupIndex) || (trackIndex != trackIndex)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return (periodIndex * 31 + groupIndex) * 31 + trackIndex;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(periodIndex);
    localStringBuilder.append(".");
    localStringBuilder.append(groupIndex);
    localStringBuilder.append(".");
    localStringBuilder.append(trackIndex);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.offline.StreamKey
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */