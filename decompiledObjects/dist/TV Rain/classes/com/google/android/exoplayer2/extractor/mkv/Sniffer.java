package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

final class Sniffer
{
  private static final int ID_EBML = 440786851;
  private static final int SEARCH_LENGTH = 1024;
  private int peekLength;
  private final ParsableByteArray scratch = new ParsableByteArray(8);
  
  private long readUint(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    byte[] arrayOfByte = scratch.data;
    int i = 0;
    paramExtractorInput.peekFully(arrayOfByte, 0, 1);
    int j = scratch.data[0] & 0xFF;
    if (j == 0) {
      return Long.MIN_VALUE;
    }
    int k = 128;
    for (int m = 0; (j & k) == 0; m++) {
      k >>= 1;
    }
    k = j & k;
    paramExtractorInput.peekFully(scratch.data, 1, m);
    while (i < m)
    {
      paramExtractorInput = scratch.data;
      i++;
      k = (paramExtractorInput[i] & 0xFF) + (k << 8);
    }
    peekLength = (m + 1 + peekLength);
    return k;
  }
  
  public boolean sniff(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    long l1 = paramExtractorInput.getLength();
    boolean bool1 = l1 < -1L;
    long l2 = 1024L;
    long l3 = l2;
    if (bool1) {
      if (l1 > 1024L) {
        l3 = l2;
      } else {
        l3 = l1;
      }
    }
    int i = (int)l3;
    byte[] arrayOfByte = scratch.data;
    boolean bool2 = false;
    paramExtractorInput.peekFully(arrayOfByte, 0, 4);
    l3 = scratch.readUnsignedInt();
    peekLength = 4;
    int j;
    while (l3 != 440786851L)
    {
      j = peekLength + 1;
      peekLength = j;
      if (j == i) {
        return false;
      }
      paramExtractorInput.peekFully(scratch.data, 0, 1);
      l3 = l3 << 8 & 0xFFFFFFFFFFFFFF00 | scratch.data[0] & 0xFF;
    }
    l3 = readUint(paramExtractorInput);
    l2 = peekLength;
    boolean bool4 = bool2;
    if (l3 != Long.MIN_VALUE) {
      if ((bool1) && (l2 + l3 >= l1))
      {
        bool4 = bool2;
      }
      else
      {
        int k;
        for (;;)
        {
          j = peekLength;
          long l4 = j;
          l1 = l2 + l3;
          if (l4 >= l1) {
            break label310;
          }
          if (readUint(paramExtractorInput) == Long.MIN_VALUE) {
            return false;
          }
          l1 = readUint(paramExtractorInput);
          boolean bool3 = l1 < 0L;
          if ((bool3) || (l1 > 2147483647L)) {
            break;
          }
          if (bool3)
          {
            k = (int)l1;
            paramExtractorInput.advancePeekPosition(k);
            peekLength += k;
          }
        }
        return false;
        label310:
        bool4 = bool2;
        if (k == l1) {
          bool4 = true;
        }
      }
    }
    return bool4;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.mkv.Sniffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */