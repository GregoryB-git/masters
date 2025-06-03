package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.Util;

public class ConstantBitrateSeekMap
  implements SeekMap
{
  private final int bitrate;
  private final long dataSize;
  private final long durationUs;
  private final long firstFrameBytePosition;
  private final int frameSize;
  private final long inputLength;
  
  public ConstantBitrateSeekMap(long paramLong1, long paramLong2, int paramInt1, int paramInt2)
  {
    inputLength = paramLong1;
    firstFrameBytePosition = paramLong2;
    int i = paramInt2;
    if (paramInt2 == -1) {
      i = 1;
    }
    frameSize = i;
    bitrate = paramInt1;
    if (paramLong1 == -1L)
    {
      dataSize = -1L;
      durationUs = -9223372036854775807L;
    }
    else
    {
      dataSize = (paramLong1 - paramLong2);
      durationUs = getTimeUsAtPosition(paramLong1, paramLong2, paramInt1);
    }
  }
  
  private long getFramePositionForTimeUs(long paramLong)
  {
    paramLong = paramLong * bitrate / 8000000L;
    int i = frameSize;
    paramLong = Util.constrainValue(paramLong / i * i, 0L, dataSize - i);
    return firstFrameBytePosition + paramLong;
  }
  
  private static long getTimeUsAtPosition(long paramLong1, long paramLong2, int paramInt)
  {
    return Math.max(0L, paramLong1 - paramLong2) * 8L * 1000000L / paramInt;
  }
  
  public long getDurationUs()
  {
    return durationUs;
  }
  
  public SeekMap.SeekPoints getSeekPoints(long paramLong)
  {
    if (dataSize == -1L) {
      return new SeekMap.SeekPoints(new SeekPoint(0L, firstFrameBytePosition));
    }
    long l1 = getFramePositionForTimeUs(paramLong);
    long l2 = getTimeUsAtPosition(l1);
    SeekPoint localSeekPoint = new SeekPoint(l2, l1);
    if (l2 < paramLong)
    {
      int i = frameSize;
      if (i + l1 < inputLength)
      {
        paramLong = l1 + i;
        return new SeekMap.SeekPoints(localSeekPoint, new SeekPoint(getTimeUsAtPosition(paramLong), paramLong));
      }
    }
    return new SeekMap.SeekPoints(localSeekPoint);
  }
  
  public long getTimeUsAtPosition(long paramLong)
  {
    return getTimeUsAtPosition(paramLong, firstFrameBytePosition, bitrate);
  }
  
  public boolean isSeekable()
  {
    boolean bool;
    if (dataSize != -1L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ConstantBitrateSeekMap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */