package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.io.IOException;

final class TsDurationReader
{
  private static final int DURATION_READ_BYTES = 37600;
  private static final int DURATION_READ_PACKETS = 200;
  private long durationUs = -9223372036854775807L;
  private long firstPcrValue = -9223372036854775807L;
  private boolean isDurationRead;
  private boolean isFirstPcrValueRead;
  private boolean isLastPcrValueRead;
  private long lastPcrValue = -9223372036854775807L;
  private final ParsableByteArray packetBuffer = new ParsableByteArray(37600);
  private final TimestampAdjuster pcrTimestampAdjuster = new TimestampAdjuster(0L);
  
  private int finishReadDuration(ExtractorInput paramExtractorInput)
  {
    isDurationRead = true;
    paramExtractorInput.resetPeekPosition();
    return 0;
  }
  
  private int readFirstPcrValue(ExtractorInput paramExtractorInput, PositionHolder paramPositionHolder, int paramInt)
    throws IOException, InterruptedException
  {
    if (paramExtractorInput.getPosition() != 0L)
    {
      position = 0L;
      return 1;
    }
    int i = (int)Math.min(37600L, paramExtractorInput.getLength());
    paramExtractorInput.resetPeekPosition();
    paramExtractorInput.peekFully(packetBuffer.data, 0, i);
    packetBuffer.setPosition(0);
    packetBuffer.setLimit(i);
    firstPcrValue = readFirstPcrValueFromBuffer(packetBuffer, paramInt);
    isFirstPcrValueRead = true;
    return 0;
  }
  
  private long readFirstPcrValueFromBuffer(ParsableByteArray paramParsableByteArray, int paramInt)
  {
    int i = paramParsableByteArray.getPosition();
    int j = paramParsableByteArray.limit();
    while (i < j)
    {
      if (data[i] == 71)
      {
        long l = TsUtil.readPcrFromPacket(paramParsableByteArray, i, paramInt);
        if (l != -9223372036854775807L) {
          return l;
        }
      }
      i++;
    }
    return -9223372036854775807L;
  }
  
  private int readLastPcrValue(ExtractorInput paramExtractorInput, PositionHolder paramPositionHolder, int paramInt)
    throws IOException, InterruptedException
  {
    int i = (int)Math.min(37600L, paramExtractorInput.getLength());
    long l = paramExtractorInput.getLength() - i;
    if (paramExtractorInput.getPosition() != l)
    {
      position = l;
      return 1;
    }
    paramExtractorInput.resetPeekPosition();
    paramExtractorInput.peekFully(packetBuffer.data, 0, i);
    packetBuffer.setPosition(0);
    packetBuffer.setLimit(i);
    lastPcrValue = readLastPcrValueFromBuffer(packetBuffer, paramInt);
    isLastPcrValueRead = true;
    return 0;
  }
  
  private long readLastPcrValueFromBuffer(ParsableByteArray paramParsableByteArray, int paramInt)
  {
    int i = paramParsableByteArray.getPosition();
    for (int j = paramParsableByteArray.limit() - 1; j >= i; j--) {
      if (data[j] == 71)
      {
        long l = TsUtil.readPcrFromPacket(paramParsableByteArray, j, paramInt);
        if (l != -9223372036854775807L) {
          return l;
        }
      }
    }
    return -9223372036854775807L;
  }
  
  public long getDurationUs()
  {
    return durationUs;
  }
  
  public TimestampAdjuster getPcrTimestampAdjuster()
  {
    return pcrTimestampAdjuster;
  }
  
  public boolean isDurationReadFinished()
  {
    return isDurationRead;
  }
  
  public int readDuration(ExtractorInput paramExtractorInput, PositionHolder paramPositionHolder, int paramInt)
    throws IOException, InterruptedException
  {
    if (paramInt <= 0) {
      return finishReadDuration(paramExtractorInput);
    }
    if (!isLastPcrValueRead) {
      return readLastPcrValue(paramExtractorInput, paramPositionHolder, paramInt);
    }
    if (lastPcrValue == -9223372036854775807L) {
      return finishReadDuration(paramExtractorInput);
    }
    if (!isFirstPcrValueRead) {
      return readFirstPcrValue(paramExtractorInput, paramPositionHolder, paramInt);
    }
    long l = firstPcrValue;
    if (l == -9223372036854775807L) {
      return finishReadDuration(paramExtractorInput);
    }
    l = pcrTimestampAdjuster.adjustTsTimestamp(l);
    durationUs = (pcrTimestampAdjuster.adjustTsTimestamp(lastPcrValue) - l);
    return finishReadDuration(paramExtractorInput);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ts.TsDurationReader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */