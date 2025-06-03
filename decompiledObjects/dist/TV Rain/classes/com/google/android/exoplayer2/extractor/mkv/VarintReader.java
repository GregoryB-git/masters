package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import java.io.IOException;

final class VarintReader
{
  private static final int STATE_BEGIN_READING = 0;
  private static final int STATE_READ_CONTENTS = 1;
  private static final long[] VARINT_LENGTH_MASKS = { 128L, 64L, 32L, 16L, 8L, 4L, 2L, 1L };
  private int length;
  private final byte[] scratch = new byte[8];
  private int state;
  
  public static long assembleVarint(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    long l1 = paramArrayOfByte[0] & 0xFF;
    long l2 = l1;
    if (paramBoolean) {
      l2 = l1 & VARINT_LENGTH_MASKS[(paramInt - 1)];
    }
    for (int i = 1; i < paramInt; i++) {
      l2 = l2 << 8 | paramArrayOfByte[i] & 0xFF;
    }
    return l2;
  }
  
  public static int parseUnsignedVarintLength(int paramInt)
  {
    for (int i = 0;; i++)
    {
      long[] arrayOfLong = VARINT_LENGTH_MASKS;
      if (i >= arrayOfLong.length) {
        break;
      }
      if ((arrayOfLong[i] & paramInt) != 0L) {
        return i + 1;
      }
    }
    paramInt = -1;
    return paramInt;
  }
  
  public int getLastLength()
  {
    return length;
  }
  
  public long readUnsignedVarint(ExtractorInput paramExtractorInput, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
    throws IOException, InterruptedException
  {
    if (state == 0)
    {
      if (!paramExtractorInput.readFully(scratch, 0, 1, paramBoolean1)) {
        return -1L;
      }
      i = parseUnsignedVarintLength(scratch[0] & 0xFF);
      length = i;
      if (i != -1) {
        state = 1;
      } else {
        throw new IllegalStateException("No valid varint length mask found");
      }
    }
    int i = length;
    if (i > paramInt)
    {
      state = 0;
      return -2L;
    }
    if (i != 1) {
      paramExtractorInput.readFully(scratch, 1, i - 1);
    }
    state = 0;
    return assembleVarint(scratch, length, paramBoolean2);
  }
  
  public void reset()
  {
    state = 0;
    length = 0;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.mkv.VarintReader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */