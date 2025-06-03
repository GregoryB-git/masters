package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import z2;

public final class ChunkIndex
  implements SeekMap
{
  private final long durationUs;
  public final long[] durationsUs;
  public final int length;
  public final long[] offsets;
  public final int[] sizes;
  public final long[] timesUs;
  
  public ChunkIndex(int[] paramArrayOfInt, long[] paramArrayOfLong1, long[] paramArrayOfLong2, long[] paramArrayOfLong3)
  {
    sizes = paramArrayOfInt;
    offsets = paramArrayOfLong1;
    durationsUs = paramArrayOfLong2;
    timesUs = paramArrayOfLong3;
    int i = paramArrayOfInt.length;
    length = i;
    if (i > 0) {
      durationUs = (paramArrayOfLong2[(i - 1)] + paramArrayOfLong3[(i - 1)]);
    } else {
      durationUs = 0L;
    }
  }
  
  public int getChunkIndex(long paramLong)
  {
    return Util.binarySearchFloor(timesUs, paramLong, true, true);
  }
  
  public long getDurationUs()
  {
    return durationUs;
  }
  
  public SeekMap.SeekPoints getSeekPoints(long paramLong)
  {
    int i = getChunkIndex(paramLong);
    SeekPoint localSeekPoint = new SeekPoint(timesUs[i], offsets[i]);
    if ((timeUs < paramLong) && (i != length - 1))
    {
      long[] arrayOfLong = timesUs;
      i++;
      return new SeekMap.SeekPoints(localSeekPoint, new SeekPoint(arrayOfLong[i], offsets[i]));
    }
    return new SeekMap.SeekPoints(localSeekPoint);
  }
  
  public boolean isSeekable()
  {
    return true;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("ChunkIndex(length=");
    localStringBuilder.append(length);
    localStringBuilder.append(", sizes=");
    localStringBuilder.append(Arrays.toString(sizes));
    localStringBuilder.append(", offsets=");
    localStringBuilder.append(Arrays.toString(offsets));
    localStringBuilder.append(", timeUs=");
    localStringBuilder.append(Arrays.toString(timesUs));
    localStringBuilder.append(", durationsUs=");
    localStringBuilder.append(Arrays.toString(durationsUs));
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ChunkIndex
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */