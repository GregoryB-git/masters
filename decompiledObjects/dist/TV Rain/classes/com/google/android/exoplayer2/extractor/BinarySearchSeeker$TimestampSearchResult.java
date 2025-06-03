package com.google.android.exoplayer2.extractor;

public final class BinarySearchSeeker$TimestampSearchResult
{
  public static final TimestampSearchResult NO_TIMESTAMP_IN_RANGE_RESULT = new TimestampSearchResult(-3, -9223372036854775807L, -1L);
  public static final int RESULT_NO_TIMESTAMP = -3;
  public static final int RESULT_POSITION_OVERESTIMATED = -1;
  public static final int RESULT_POSITION_UNDERESTIMATED = -2;
  public static final int RESULT_TARGET_TIMESTAMP_FOUND = 0;
  private final long bytePositionToUpdate;
  private final int result;
  private final long timestampToUpdate;
  
  private BinarySearchSeeker$TimestampSearchResult(int paramInt, long paramLong1, long paramLong2)
  {
    result = paramInt;
    timestampToUpdate = paramLong1;
    bytePositionToUpdate = paramLong2;
  }
  
  public static TimestampSearchResult overestimatedResult(long paramLong1, long paramLong2)
  {
    return new TimestampSearchResult(-1, paramLong1, paramLong2);
  }
  
  public static TimestampSearchResult targetFoundResult(long paramLong)
  {
    return new TimestampSearchResult(0, -9223372036854775807L, paramLong);
  }
  
  public static TimestampSearchResult underestimatedResult(long paramLong1, long paramLong2)
  {
    return new TimestampSearchResult(-2, paramLong1, paramLong2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */