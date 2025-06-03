package com.google.android.exoplayer2.video;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Collections;
import java.util.List;

public final class HevcConfig
{
  @Nullable
  public final List<byte[]> initializationData;
  public final int nalUnitLengthFieldLength;
  
  private HevcConfig(@Nullable List<byte[]> paramList, int paramInt)
  {
    initializationData = paramList;
    nalUnitLengthFieldLength = paramInt;
  }
  
  public static HevcConfig parse(ParsableByteArray paramParsableByteArray)
    throws ParserException
  {
    try
    {
      paramParsableByteArray.skipBytes(21);
      int i = paramParsableByteArray.readUnsignedByte();
      int j = paramParsableByteArray.readUnsignedByte();
      int k = paramParsableByteArray.getPosition();
      int m = 0;
      int n = m;
      int i1;
      int i2;
      int i3;
      while (m < j)
      {
        paramParsableByteArray.skipBytes(1);
        i1 = paramParsableByteArray.readUnsignedShort();
        for (i2 = 0; i2 < i1; i2++)
        {
          i3 = paramParsableByteArray.readUnsignedShort();
          n += i3 + 4;
          paramParsableByteArray.skipBytes(i3);
        }
        m++;
      }
      paramParsableByteArray.setPosition(k);
      byte[] arrayOfByte1 = new byte[n];
      m = 0;
      k = m;
      while (m < j)
      {
        paramParsableByteArray.skipBytes(1);
        i1 = paramParsableByteArray.readUnsignedShort();
        for (i2 = 0; i2 < i1; i2++)
        {
          i3 = paramParsableByteArray.readUnsignedShort();
          byte[] arrayOfByte2 = NalUnitUtil.NAL_START_CODE;
          System.arraycopy(arrayOfByte2, 0, arrayOfByte1, k, arrayOfByte2.length);
          k += arrayOfByte2.length;
          System.arraycopy(data, paramParsableByteArray.getPosition(), arrayOfByte1, k, i3);
          k += i3;
          paramParsableByteArray.skipBytes(i3);
        }
        m++;
      }
      if (n == 0) {
        paramParsableByteArray = null;
      } else {
        paramParsableByteArray = Collections.singletonList(arrayOfByte1);
      }
      paramParsableByteArray = new HevcConfig(paramParsableByteArray, (i & 0x3) + 1);
      return paramParsableByteArray;
    }
    catch (ArrayIndexOutOfBoundsException paramParsableByteArray)
    {
      throw new ParserException("Error parsing HEVC config", paramParsableByteArray);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.video.HevcConfig
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */