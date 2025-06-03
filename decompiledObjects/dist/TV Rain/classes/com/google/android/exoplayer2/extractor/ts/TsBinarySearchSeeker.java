package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.BinarySearchSeeker;
import com.google.android.exoplayer2.extractor.BinarySearchSeeker.DefaultSeekTimestampConverter;
import com.google.android.exoplayer2.extractor.BinarySearchSeeker.OutputFrameHolder;
import com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult;
import com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.io.IOException;

final class TsBinarySearchSeeker
  extends BinarySearchSeeker
{
  private static final int MINIMUM_SEARCH_RANGE_BYTES = 940;
  private static final long SEEK_TOLERANCE_US = 100000L;
  private static final int TIMESTAMP_SEARCH_BYTES = 37600;
  private static final int TIMESTAMP_SEARCH_PACKETS = 200;
  
  public TsBinarySearchSeeker(TimestampAdjuster paramTimestampAdjuster, long paramLong1, long paramLong2, int paramInt)
  {
    super(new BinarySearchSeeker.DefaultSeekTimestampConverter(), new TsPcrSeeker(paramInt, paramTimestampAdjuster), paramLong1, 0L, paramLong1 + 1L, 0L, paramLong2, 188L, 940);
  }
  
  public static final class TsPcrSeeker
    implements BinarySearchSeeker.TimestampSeeker
  {
    private final ParsableByteArray packetBuffer;
    private final int pcrPid;
    private final TimestampAdjuster pcrTimestampAdjuster;
    
    public TsPcrSeeker(int paramInt, TimestampAdjuster paramTimestampAdjuster)
    {
      pcrPid = paramInt;
      pcrTimestampAdjuster = paramTimestampAdjuster;
      packetBuffer = new ParsableByteArray(37600);
    }
    
    private BinarySearchSeeker.TimestampSearchResult searchForPcrValueInBuffer(ParsableByteArray paramParsableByteArray, long paramLong1, long paramLong2)
    {
      int i = paramParsableByteArray.limit();
      long l1 = -1L;
      long l2 = -1L;
      long l5;
      for (long l3 = -9223372036854775807L; paramParsableByteArray.bytesLeft() >= 188; l3 = l5)
      {
        int j = TsUtil.findSyncBytePosition(data, paramParsableByteArray.getPosition(), i);
        int k = j + 188;
        if (k > i) {
          break;
        }
        l1 = TsUtil.readPcrFromPacket(paramParsableByteArray, j, pcrPid);
        long l4 = l2;
        l5 = l3;
        if (l1 != -9223372036854775807L)
        {
          l5 = pcrTimestampAdjuster.adjustTsTimestamp(l1);
          if (l5 > paramLong1)
          {
            if (l3 == -9223372036854775807L) {
              return BinarySearchSeeker.TimestampSearchResult.overestimatedResult(l5, paramLong2);
            }
            return BinarySearchSeeker.TimestampSearchResult.targetFoundResult(paramLong2 + l2);
          }
          if (100000L + l5 > paramLong1) {
            return BinarySearchSeeker.TimestampSearchResult.targetFoundResult(paramLong2 + j);
          }
          l4 = j;
        }
        paramParsableByteArray.setPosition(k);
        l1 = k;
        l2 = l4;
      }
      if (l3 != -9223372036854775807L) {
        return BinarySearchSeeker.TimestampSearchResult.underestimatedResult(l3, paramLong2 + l1);
      }
      return BinarySearchSeeker.TimestampSearchResult.NO_TIMESTAMP_IN_RANGE_RESULT;
    }
    
    public BinarySearchSeeker.TimestampSearchResult searchForTimestamp(ExtractorInput paramExtractorInput, long paramLong, BinarySearchSeeker.OutputFrameHolder paramOutputFrameHolder)
      throws IOException, InterruptedException
    {
      long l = paramExtractorInput.getPosition();
      int i = (int)Math.min(37600L, paramExtractorInput.getLength() - paramExtractorInput.getPosition());
      packetBuffer.reset(i);
      paramExtractorInput.peekFully(packetBuffer.data, 0, i);
      return searchForPcrValueInBuffer(packetBuffer, paramLong, l);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ts.TsBinarySearchSeeker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */