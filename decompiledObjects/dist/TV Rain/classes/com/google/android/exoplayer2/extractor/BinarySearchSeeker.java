package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.nio.ByteBuffer;

public abstract class BinarySearchSeeker
{
  private static final long MAX_SKIP_BYTES = 262144L;
  private final int minimumSearchRange;
  public final BinarySearchSeekMap seekMap;
  @Nullable
  public SeekOperationParams seekOperationParams;
  public final TimestampSeeker timestampSeeker;
  
  public BinarySearchSeeker(SeekTimestampConverter paramSeekTimestampConverter, TimestampSeeker paramTimestampSeeker, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, int paramInt)
  {
    timestampSeeker = paramTimestampSeeker;
    minimumSearchRange = paramInt;
    seekMap = new BinarySearchSeekMap(paramSeekTimestampConverter, paramLong1, paramLong2, paramLong3, paramLong4, paramLong5, paramLong6);
  }
  
  public SeekOperationParams createSeekParamsForTargetTimeUs(long paramLong)
  {
    return new SeekOperationParams(paramLong, seekMap.timeUsToTargetTime(paramLong), BinarySearchSeekMap.access$1000(seekMap), BinarySearchSeekMap.access$1100(seekMap), BinarySearchSeekMap.access$1200(seekMap), BinarySearchSeekMap.access$1300(seekMap), BinarySearchSeekMap.access$1400(seekMap));
  }
  
  public final SeekMap getSeekMap()
  {
    return seekMap;
  }
  
  public int handlePendingSeek(ExtractorInput paramExtractorInput, PositionHolder paramPositionHolder, OutputFrameHolder paramOutputFrameHolder)
    throws InterruptedException, IOException
  {
    TimestampSeeker localTimestampSeeker = (TimestampSeeker)Assertions.checkNotNull(timestampSeeker);
    long l3;
    for (;;)
    {
      SeekOperationParams localSeekOperationParams = (SeekOperationParams)Assertions.checkNotNull(seekOperationParams);
      long l1 = SeekOperationParams.access$100(localSeekOperationParams);
      long l2 = SeekOperationParams.access$200(localSeekOperationParams);
      l3 = SeekOperationParams.access$300(localSeekOperationParams);
      if (l2 - l1 <= minimumSearchRange)
      {
        markSeekOperationFinished(false, l1);
        return seekToPosition(paramExtractorInput, l1, paramPositionHolder);
      }
      if (!skipInputUntilPosition(paramExtractorInput, l3)) {
        return seekToPosition(paramExtractorInput, l3, paramPositionHolder);
      }
      paramExtractorInput.resetPeekPosition();
      TimestampSearchResult localTimestampSearchResult = localTimestampSeeker.searchForTimestamp(paramExtractorInput, SeekOperationParams.access$400(localSeekOperationParams), paramOutputFrameHolder);
      int i = TimestampSearchResult.access$500(localTimestampSearchResult);
      if (i == -3) {
        break;
      }
      if (i != -2)
      {
        if (i != -1)
        {
          if (i == 0)
          {
            markSeekOperationFinished(true, TimestampSearchResult.access$700(localTimestampSearchResult));
            skipInputUntilPosition(paramExtractorInput, TimestampSearchResult.access$700(localTimestampSearchResult));
            return seekToPosition(paramExtractorInput, TimestampSearchResult.access$700(localTimestampSearchResult), paramPositionHolder);
          }
          throw new IllegalStateException("Invalid case");
        }
        SeekOperationParams.access$800(localSeekOperationParams, TimestampSearchResult.access$600(localTimestampSearchResult), TimestampSearchResult.access$700(localTimestampSearchResult));
      }
      else
      {
        SeekOperationParams.access$900(localSeekOperationParams, TimestampSearchResult.access$600(localTimestampSearchResult), TimestampSearchResult.access$700(localTimestampSearchResult));
      }
    }
    markSeekOperationFinished(false, l3);
    return seekToPosition(paramExtractorInput, l3, paramPositionHolder);
  }
  
  public final boolean isSeeking()
  {
    boolean bool;
    if (seekOperationParams != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void markSeekOperationFinished(boolean paramBoolean, long paramLong)
  {
    seekOperationParams = null;
    onSeekOperationFinished(paramBoolean, paramLong);
  }
  
  public void onSeekOperationFinished(boolean paramBoolean, long paramLong) {}
  
  public final int seekToPosition(ExtractorInput paramExtractorInput, long paramLong, PositionHolder paramPositionHolder)
  {
    if (paramLong == paramExtractorInput.getPosition()) {
      return 0;
    }
    position = paramLong;
    return 1;
  }
  
  public final void setSeekTargetUs(long paramLong)
  {
    SeekOperationParams localSeekOperationParams = seekOperationParams;
    if ((localSeekOperationParams != null) && (SeekOperationParams.access$000(localSeekOperationParams) == paramLong)) {
      return;
    }
    seekOperationParams = createSeekParamsForTargetTimeUs(paramLong);
  }
  
  public final boolean skipInputUntilPosition(ExtractorInput paramExtractorInput, long paramLong)
    throws IOException, InterruptedException
  {
    paramLong -= paramExtractorInput.getPosition();
    if ((paramLong >= 0L) && (paramLong <= 262144L))
    {
      paramExtractorInput.skipFully((int)paramLong);
      return true;
    }
    return false;
  }
  
  public static class BinarySearchSeekMap
    implements SeekMap
  {
    private final long approxBytesPerFrame;
    private final long ceilingBytePosition;
    private final long ceilingTimePosition;
    private final long durationUs;
    private final long floorBytePosition;
    private final long floorTimePosition;
    private final BinarySearchSeeker.SeekTimestampConverter seekTimestampConverter;
    
    public BinarySearchSeekMap(BinarySearchSeeker.SeekTimestampConverter paramSeekTimestampConverter, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6)
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
  
  public static final class DefaultSeekTimestampConverter
    implements BinarySearchSeeker.SeekTimestampConverter
  {
    public long timeUsToTargetTime(long paramLong)
    {
      return paramLong;
    }
  }
  
  public static final class OutputFrameHolder
  {
    public ByteBuffer byteBuffer;
    public long timeUs = 0L;
    
    public OutputFrameHolder(ByteBuffer paramByteBuffer)
    {
      byteBuffer = paramByteBuffer;
    }
  }
  
  public static class SeekOperationParams
  {
    private final long approxBytesPerFrame;
    private long ceilingBytePosition;
    private long ceilingTimePosition;
    private long floorBytePosition;
    private long floorTimePosition;
    private long nextSearchBytePosition;
    private final long seekTimeUs;
    private final long targetTimePosition;
    
    public SeekOperationParams(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7)
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
  
  public static abstract interface SeekTimestampConverter
  {
    public abstract long timeUsToTargetTime(long paramLong);
  }
  
  public static final class TimestampSearchResult
  {
    public static final TimestampSearchResult NO_TIMESTAMP_IN_RANGE_RESULT = new TimestampSearchResult(-3, -9223372036854775807L, -1L);
    public static final int RESULT_NO_TIMESTAMP = -3;
    public static final int RESULT_POSITION_OVERESTIMATED = -1;
    public static final int RESULT_POSITION_UNDERESTIMATED = -2;
    public static final int RESULT_TARGET_TIMESTAMP_FOUND = 0;
    private final long bytePositionToUpdate;
    private final int result;
    private final long timestampToUpdate;
    
    private TimestampSearchResult(int paramInt, long paramLong1, long paramLong2)
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
  
  public static abstract interface TimestampSeeker
  {
    public abstract BinarySearchSeeker.TimestampSearchResult searchForTimestamp(ExtractorInput paramExtractorInput, long paramLong, BinarySearchSeeker.OutputFrameHolder paramOutputFrameHolder)
      throws IOException, InterruptedException;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.BinarySearchSeeker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */