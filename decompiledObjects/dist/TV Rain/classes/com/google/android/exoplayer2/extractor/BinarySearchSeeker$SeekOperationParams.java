package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.Util;

public class BinarySearchSeeker$SeekOperationParams
{
  private final long approxBytesPerFrame;
  private long ceilingBytePosition;
  private long ceilingTimePosition;
  private long floorBytePosition;
  private long floorTimePosition;
  private long nextSearchBytePosition;
  private final long seekTimeUs;
  private final long targetTimePosition;
  
  public BinarySearchSeeker$SeekOperationParams(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7)
  {
    seekTimeUs = paramLong1;
    targetTimePosition = paramLong2;
    floorTimePosition = paramLong3;
    ceilingTimePosition = paramLong4;
    floorBytePosition = paramLong5;
    ceilingBytePosition = paramLong6;
    approxBytesPerFrame = paramLong7;
    nextSearchBytePosition = calculateNextSearchBytePosition(paramLong2, paramLong3, paramLong4, paramLong5, paramLong6, paramLong7);
  }
  
  public static long calculateNextSearchBytePosition(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6)
  {
    if ((paramLong4 + 1L < paramLong5) && (paramLong2 + 1L < paramLong3))
    {
      float f = (float)(paramLong5 - paramLong4) / (float)(paramLong3 - paramLong2);
      paramLong1 = ((float)(paramLong1 - paramLong2) * f);
      return Util.constrainValue(paramLong1 + paramLong4 - paramLong6 - paramLong1 / 20L, paramLong4, paramLong5 - 1L);
    }
    return paramLong4;
  }
  
  private long getCeilingBytePosition()
  {
    return ceilingBytePosition;
  }
  
  private long getFloorBytePosition()
  {
    return floorBytePosition;
  }
  
  private long getNextSearchBytePosition()
  {
    return nextSearchBytePosition;
  }
  
  private long getSeekTimeUs()
  {
    return seekTimeUs;
  }
  
  private long getTargetTimePosition()
  {
    return targetTimePosition;
  }
  
  private void updateNextSearchBytePosition()
  {
    nextSearchBytePosition = calculateNextSearchBytePosition(targetTimePosition, floorTimePosition, ceilingTimePosition, floorBytePosition, ceilingBytePosition, approxBytesPerFrame);
  }
  
  private void updateSeekCeiling(long paramLong1, long paramLong2)
  {
    ceilingTimePosition = paramLong1;
    ceilingBytePosition = paramLong2;
    updateNextSearchBytePosition();
  }
  
  private void updateSeekFloor(long paramLong1, long paramLong2)
  {
    floorTimePosition = paramLong1;
    floorBytePosition = paramLong2;
    updateNextSearchBytePosition();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekOperationParams
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */