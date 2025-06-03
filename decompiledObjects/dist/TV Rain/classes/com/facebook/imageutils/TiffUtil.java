package com.facebook.imageutils;

import com.facebook.common.logging.FLog;
import java.io.IOException;
import java.io.InputStream;

class TiffUtil
{
  private static final Class<?> TAG = TiffUtil.class;
  public static final int TIFF_BYTE_ORDER_BIG_END = 1296891946;
  public static final int TIFF_BYTE_ORDER_LITTLE_END = 1229531648;
  public static final int TIFF_TAG_ORIENTATION = 274;
  public static final int TIFF_TYPE_SHORT = 3;
  
  public static int getAutoRotateAngleFromOrientation(int paramInt)
  {
    if (paramInt != 3)
    {
      if (paramInt != 6)
      {
        if (paramInt != 8) {
          return 0;
        }
        return 270;
      }
      return 90;
    }
    return 180;
  }
  
  private static int getOrientationFromTiffEntry(InputStream paramInputStream, int paramInt, boolean paramBoolean)
    throws IOException
  {
    if (paramInt < 10) {
      return 0;
    }
    if (StreamProcessor.readPackedInt(paramInputStream, 2, paramBoolean) != 3) {
      return 0;
    }
    if (StreamProcessor.readPackedInt(paramInputStream, 4, paramBoolean) != 1) {
      return 0;
    }
    paramInt = StreamProcessor.readPackedInt(paramInputStream, 2, paramBoolean);
    StreamProcessor.readPackedInt(paramInputStream, 2, paramBoolean);
    return paramInt;
  }
  
  private static int moveToTiffEntryWithTag(InputStream paramInputStream, int paramInt1, boolean paramBoolean, int paramInt2)
    throws IOException
  {
    if (paramInt1 < 14) {
      return 0;
    }
    int i = StreamProcessor.readPackedInt(paramInputStream, 2, paramBoolean);
    int j = paramInt1 - 2;
    for (paramInt1 = i; (paramInt1 > 0) && (j >= 12); paramInt1--)
    {
      i = StreamProcessor.readPackedInt(paramInputStream, 2, paramBoolean);
      j -= 2;
      if (i == paramInt2) {
        return j;
      }
      paramInputStream.skip(10L);
      j -= 10;
    }
    return 0;
  }
  
  public static int readOrientationFromTIFF(InputStream paramInputStream, int paramInt)
    throws IOException
  {
    TiffHeader localTiffHeader = new TiffHeader(null);
    int i = readTiffHeader(paramInputStream, paramInt, localTiffHeader);
    paramInt = firstIfdOffset - 8;
    if ((i != 0) && (paramInt <= i))
    {
      paramInputStream.skip(paramInt);
      return getOrientationFromTiffEntry(paramInputStream, moveToTiffEntryWithTag(paramInputStream, i - paramInt, isLittleEndian, 274), isLittleEndian);
    }
    return 0;
  }
  
  private static int readTiffHeader(InputStream paramInputStream, int paramInt, TiffHeader paramTiffHeader)
    throws IOException
  {
    if (paramInt <= 8) {
      return 0;
    }
    int i = StreamProcessor.readPackedInt(paramInputStream, 4, false);
    byteOrder = i;
    if ((i != 1229531648) && (i != 1296891946))
    {
      FLog.e(TAG, "Invalid TIFF header");
      return 0;
    }
    boolean bool;
    if (i == 1229531648) {
      bool = true;
    } else {
      bool = false;
    }
    isLittleEndian = bool;
    i = StreamProcessor.readPackedInt(paramInputStream, 4, bool);
    firstIfdOffset = i;
    paramInt = paramInt - 4 - 4;
    if ((i >= 8) && (i - 8 <= paramInt)) {
      return paramInt;
    }
    FLog.e(TAG, "Invalid offset");
    return 0;
  }
  
  public static class TiffHeader
  {
    public int byteOrder;
    public int firstIfdOffset;
    public boolean isLittleEndian;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imageutils.TiffUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */