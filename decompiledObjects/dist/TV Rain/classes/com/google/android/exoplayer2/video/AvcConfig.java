package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.NalUnitUtil.SpsData;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.List;

public final class AvcConfig
{
  public final int height;
  public final List<byte[]> initializationData;
  public final int nalUnitLengthFieldLength;
  public final float pixelWidthAspectRatio;
  public final int width;
  
  private AvcConfig(List<byte[]> paramList, int paramInt1, int paramInt2, int paramInt3, float paramFloat)
  {
    initializationData = paramList;
    nalUnitLengthFieldLength = paramInt1;
    width = paramInt2;
    height = paramInt3;
    pixelWidthAspectRatio = paramFloat;
  }
  
  private static byte[] buildNalUnitForChild(ParsableByteArray paramParsableByteArray)
  {
    int i = paramParsableByteArray.readUnsignedShort();
    int j = paramParsableByteArray.getPosition();
    paramParsableByteArray.skipBytes(i);
    return CodecSpecificDataUtil.buildNalUnit(data, j, i);
  }
  
  public static AvcConfig parse(ParsableByteArray paramParsableByteArray)
    throws ParserException
  {
    try
    {
      paramParsableByteArray.skipBytes(4);
      int i = (paramParsableByteArray.readUnsignedByte() & 0x3) + 1;
      if (i != 3)
      {
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        int j = paramParsableByteArray.readUnsignedByte() & 0x1F;
        for (int k = 0; k < j; k++) {
          localArrayList.add(buildNalUnitForChild(paramParsableByteArray));
        }
        int m = paramParsableByteArray.readUnsignedByte();
        for (k = 0; k < m; k++) {
          localArrayList.add(buildNalUnitForChild(paramParsableByteArray));
        }
        float f;
        if (j > 0)
        {
          paramParsableByteArray = (byte[])localArrayList.get(0);
          paramParsableByteArray = NalUnitUtil.parseSpsNalUnit((byte[])localArrayList.get(0), i, paramParsableByteArray.length);
          k = width;
          j = height;
          f = pixelWidthAspectRatio;
        }
        else
        {
          f = 1.0F;
          k = -1;
          j = k;
        }
        return new AvcConfig(localArrayList, i, k, j, f);
      }
      paramParsableByteArray = new java/lang/IllegalStateException;
      paramParsableByteArray.<init>();
      throw paramParsableByteArray;
    }
    catch (ArrayIndexOutOfBoundsException paramParsableByteArray)
    {
      throw new ParserException("Error parsing AVC config", paramParsableByteArray);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.video.AvcConfig
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */