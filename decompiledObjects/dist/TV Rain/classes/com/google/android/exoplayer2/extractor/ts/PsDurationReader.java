package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.io.IOException;

final class PsDurationReader
{
  private static final int DURATION_READ_BYTES = 20000;
  private long durationUs = -9223372036854775807L;
  private long firstScrValue = -9223372036854775807L;
  private boolean isDurationRead;
  private boolean isFirstScrValueRead;
  private boolean isLastScrValueRead;
  private long lastScrValue = -9223372036854775807L;
  private final ParsableByteArray packetBuffer = new ParsableByteArray(20000);
  private final TimestampAdjuster scrTimestampAdjuster = new TimestampAdjuster(0L);
  
  private static boolean checkMarkerBits(byte[] paramArrayOfByte)
  {
    boolean bool = false;
    if ((paramArrayOfByte[0] & 0xC4) != 68) {
      return false;
    }
    if ((paramArrayOfByte[2] & 0x4) != 4) {
      return false;
    }
    if ((paramArrayOfByte[4] & 0x4) != 4) {
      return false;
    }
    if ((paramArrayOfByte[5] & 0x1) != 1) {
      return false;
    }
    if ((paramArrayOfByte[8] & 0x3) == 3) {
      bool = true;
    }
    return bool;
  }
  
  private int finishReadDuration(ExtractorInput paramExtractorInput)
  {
    isDurationRead = true;
    paramExtractorInput.resetPeekPosition();
    return 0;
  }
  
  private int peekIntAtPosition(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramArrayOfByte[paramInt];
    int j = paramArrayOfByte[(paramInt + 1)];
    int k = paramArrayOfByte[(paramInt + 2)];
    return paramArrayOfByte[(paramInt + 3)] & 0xFF | (i & 0xFF) << 24 | (j & 0xFF) << 16 | (k & 0xFF) << 8;
  }
  
  private int readFirstScrValue(ExtractorInput paramExtractorInput, PositionHolder paramPositionHolder)
    throws IOException, InterruptedException
  {
    if (paramExtractorInput.getPosition() != 0L)
    {
      position = 0L;
      return 1;
    }
    int i = (int)Math.min(20000L, paramExtractorInput.getLength());
    paramExtractorInput.resetPeekPosition();
    paramExtractorInput.peekFully(packetBuffer.data, 0, i);
    packetBuffer.setPosition(0);
    packetBuffer.setLimit(i);
    firstScrValue = readFirstScrValueFromBuffer(packetBuffer);
    isFirstScrValueRead = true;
    return 0;
  }
  
  private long readFirstScrValueFromBuffer(ParsableByteArray paramParsableByteArray)
  {
    int i = paramParsableByteArray.getPosition();
    int j = paramParsableByteArray.limit();
    while (i < j - 3)
    {
      if (peekIntAtPosition(data, i) == 442)
      {
        paramParsableByteArray.setPosition(i + 4);
        long l = readScrValueFromPack(paramParsableByteArray);
        if (l != -9223372036854775807L) {
          return l;
        }
      }
      i++;
    }
    return -9223372036854775807L;
  }
  
  private int readLastScrValue(ExtractorInput paramExtractorInput, PositionHolder paramPositionHolder)
    throws IOException, InterruptedException
  {
    int i = (int)Math.min(20000L, paramExtractorInput.getLength());
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
    lastScrValue = readLastScrValueFromBuffer(packetBuffer);
    isLastScrValueRead = true;
    return 0;
  }
  
  private long readLastScrValueFromBuffer(ParsableByteArray paramParsableByteArray)
  {
    int i = paramParsableByteArray.getPosition();
    for (int j = paramParsableByteArray.limit() - 4; j >= i; j--) {
      if (peekIntAtPosition(data, j) == 442)
      {
        paramParsableByteArray.setPosition(j + 4);
        long l = readScrValueFromPack(paramParsableByteArray);
        if (l != -9223372036854775807L) {
          return l;
        }
      }
    }
    return -9223372036854775807L;
  }
  
  public static long readScrValueFromPack(ParsableByteArray paramParsableByteArray)
  {
    int i = paramParsableByteArray.getPosition();
    if (paramParsableByteArray.bytesLeft() < 9) {
      return -9223372036854775807L;
    }
    byte[] arrayOfByte = new byte[9];
    paramParsableByteArray.readBytes(arrayOfByte, 0, 9);
    paramParsableByteArray.setPosition(i);
    if (!checkMarkerBits(arrayOfByte)) {
      return -9223372036854775807L;
    }
    return readScrValueFromPackHeader(arrayOfByte);
  }
  
  private static long readScrValueFromPackHeader(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte[0];
    long l1 = i;
    long l2 = i;
    long l3 = paramArrayOfByte[1];
    i = paramArrayOfByte[2];
    return (l1 & 0x38) >> 3 << 30 | (l2 & 0x3) << 28 | (l3 & 0xFF) << 20 | (i & 0xF8) >> 3 << 15 | (i & 0x3) << 13 | (paramArrayOfByte[3] & 0xFF) << 5 | (paramArrayOfByte[4] & 0xF8) >> 3;
  }
  
  public long getDurationUs()
  {
    return durationUs;
  }
  
  public TimestampAdjuster getScrTimestampAdjuster()
  {
    return scrTimestampAdjuster;
  }
  
  public boolean isDurationReadFinished()
  {
    return isDurationRead;
  }
  
  public int readDuration(ExtractorInput paramExtractorInput, PositionHolder paramPositionHolder)
    throws IOException, InterruptedException
  {
    if (!isLastScrValueRead) {
      return readLastScrValue(paramExtractorInput, paramPositionHolder);
    }
    if (lastScrValue == -9223372036854775807L) {
      return finishReadDuration(paramExtractorInput);
    }
    if (!isFirstScrValueRead) {
      return readFirstScrValue(paramExtractorInput, paramPositionHolder);
    }
    long l = firstScrValue;
    if (l == -9223372036854775807L) {
      return finishReadDuration(paramExtractorInput);
    }
    l = scrTimestampAdjuster.adjustTsTimestamp(l);
    durationUs = (scrTimestampAdjuster.adjustTsTimestamp(lastScrValue) - l);
    return finishReadDuration(paramExtractorInput);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ts.PsDurationReader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */