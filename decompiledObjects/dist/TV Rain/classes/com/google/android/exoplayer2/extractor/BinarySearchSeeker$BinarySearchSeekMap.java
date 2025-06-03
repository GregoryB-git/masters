package com.google.android.exoplayer2.extractor;

public class BinarySearchSeeker$BinarySearchSeekMap
  implements SeekMap
{
  private final long approxBytesPerFrame;
  private final long ceilingBytePosition;
  private final long ceilingTimePosition;
  private final long durationUs;
  private final long floorBytePosition;
  private final long floorTimePosition;
  private final BinarySearchSeeker.SeekTimestampConverter seekTimestampConverter;
  
  public BinarySearchSeeker$BinarySearchSeekMap(BinarySearchSeeker.SeekTimestampConverter paramSeekTimestampConverter, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6)
  {
    seekTimestampConverter = paramSeekTimestampConverter;
    durationUs = paramLong1;
    floorTimePosition = paramLong2;
    ceilingTimePosition = paramLong3;
    floorBytePosition = paramLong4;
    ceilingBytePosition = paramLong5;
    approxBytesPerFrame = paramLong6;
  }
  
  public long getDurationUs()
  {
    return durationUs;
  }
  
  public SeekMap.SeekPoints getSeekPoints(long paramLong)
  {
    return new SeekMap.SeekPoints(new SeekPoint(paramLong, BinarySearchSeeker.SeekOperationParams.calculateNextSearchBytePosition(seekTimestampConverter.timeUsToTargetTime(paramLong), floorTimePosition, ceilingTimePosition, floorBytePosition, ceilingBytePosition, approxBytesPerFrame)));
  }
  
  public boolean isSeekable()
  {
    return true;
  }
  
  public long timeUsToTargetTime(long paramLong)
  {
    return seekTimestampConverter.timeUsToTargetTime(paramLong);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.BinarySearchSeeker.BinarySearchSeekMap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */