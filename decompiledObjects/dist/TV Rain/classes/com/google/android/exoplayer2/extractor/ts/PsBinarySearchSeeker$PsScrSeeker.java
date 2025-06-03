package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.BinarySearchSeeker.OutputFrameHolder;
import com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult;
import com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.io.IOException;

final class PsBinarySearchSeeker$PsScrSeeker
  implements BinarySearchSeeker.TimestampSeeker
{
  private final ParsableByteArray packetBuffer;
  private final TimestampAdjuster scrTimestampAdjuster;
  
  private PsBinarySearchSeeker$PsScrSeeker(TimestampAdjuster paramTimestampAdjuster)
  {
    scrTimestampAdjuster = paramTimestampAdjuster;
    packetBuffer = new ParsableByteArray(20000);
  }
  
  private BinarySearchSeeker.TimestampSearchResult searchForScrValueInBuffer(ParsableByteArray paramParsableByteArray, long paramLong1, long paramLong2)
  {
    int i = -1;
    int j = -1;
    long l1 = -9223372036854775807L;
    while (paramParsableByteArray.bytesLeft() >= 4) {
      if (PsBinarySearchSeeker.access$100(data, paramParsableByteArray.getPosition()) != 442)
      {
        paramParsableByteArray.skipBytes(1);
      }
      else
      {
        paramParsableByteArray.skipBytes(4);
        long l2 = PsDurationReader.readScrValueFromPack(paramParsableByteArray);
        int k = j;
        long l3 = l1;
        if (l2 != -9223372036854775807L)
        {
          l3 = scrTimestampAdjuster.adjustTsTimestamp(l2);
          if (l3 > paramLong1)
          {
            if (l1 == -9223372036854775807L) {
              return BinarySearchSeeker.TimestampSearchResult.overestimatedResult(l3, paramLong2);
            }
            return BinarySearchSeeker.TimestampSearchResult.targetFoundResult(paramLong2 + j);
          }
          if (100000L + l3 > paramLong1) {
            return BinarySearchSeeker.TimestampSearchResult.targetFoundResult(paramLong2 + paramParsableByteArray.getPosition());
          }
          k = paramParsableByteArray.getPosition();
        }
        skipToEndOfCurrentPack(paramParsableByteArray);
        i = paramParsableByteArray.getPosition();
        j = k;
        l1 = l3;
      }
    }
    if (l1 != -9223372036854775807L) {
      return BinarySearchSeeker.TimestampSearchResult.underestimatedResult(l1, paramLong2 + i);
    }
    return BinarySearchSeeker.TimestampSearchResult.NO_TIMESTAMP_IN_RANGE_RESULT;
  }
  
  private static void skipToEndOfCurrentPack(ParsableByteArray paramParsableByteArray)
  {
    int i = paramParsableByteArray.limit();
    if (paramParsableByteArray.bytesLeft() < 10)
    {
      paramParsableByteArray.setPosition(i);
      return;
    }
    paramParsableByteArray.skipBytes(9);
    int j = paramParsableByteArray.readUnsignedByte() & 0x7;
    if (paramParsableByteArray.bytesLeft() < j)
    {
      paramParsableByteArray.setPosition(i);
      return;
    }
    paramParsableByteArray.skipBytes(j);
    if (paramParsableByteArray.bytesLeft() < 4)
    {
      paramParsableByteArray.setPosition(i);
      return;
    }
    if (PsBinarySearchSeeker.access$100(data, paramParsableByteArray.getPosition()) == 443)
    {
      paramParsableByteArray.skipBytes(4);
      j = paramParsableByteArray.readUnsignedShort();
      if (paramParsableByteArray.bytesLeft() < j)
      {
        paramParsableByteArray.setPosition(i);
        return;
      }
      paramParsableByteArray.skipBytes(j);
    }
    while (paramParsableByteArray.bytesLeft() >= 4)
    {
      j = PsBinarySearchSeeker.access$100(data, paramParsableByteArray.getPosition());
      if ((j == 442) || (j == 441) || (j >>> 8 != 1)) {
        break;
      }
      paramParsableByteArray.skipBytes(4);
      if (paramParsableByteArray.bytesLeft() < 2)
      {
        paramParsableByteArray.setPosition(i);
        return;
      }
      j = paramParsableByteArray.readUnsignedShort();
      paramParsableByteArray.setPosition(Math.min(paramParsableByteArray.limit(), paramParsableByteArray.getPosition() + j));
    }
  }
  
  public BinarySearchSeeker.TimestampSearchResult searchForTimestamp(ExtractorInput paramExtractorInput, long paramLong, BinarySearchSeeker.OutputFrameHolder paramOutputFrameHolder)
    throws IOException, InterruptedException
  {
    long l = paramExtractorInput.getPosition();
    int i = (int)Math.min(20000L, paramExtractorInput.getLength() - paramExtractorInput.getPosition());
    packetBuffer.reset(i);
    paramExtractorInput.peekFully(packetBuffer.data, 0, i);
    return searchForScrValueInBuffer(packetBuffer, paramLong, l);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ts.PsBinarySearchSeeker.PsScrSeeker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */