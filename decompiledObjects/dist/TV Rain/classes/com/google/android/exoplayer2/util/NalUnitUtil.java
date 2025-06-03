package com.google.android.exoplayer2.util;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class NalUnitUtil
{
  public static final float[] ASPECT_RATIO_IDC_VALUES;
  public static final int EXTENDED_SAR = 255;
  private static final int H264_NAL_UNIT_TYPE_SEI = 6;
  private static final int H264_NAL_UNIT_TYPE_SPS = 7;
  private static final int H265_NAL_UNIT_TYPE_PREFIX_SEI = 39;
  public static final byte[] NAL_START_CODE = { 0, 0, 0, 1 };
  private static final String TAG = "NalUnitUtil";
  private static int[] scratchEscapePositions = new int[10];
  private static final Object scratchEscapePositionsLock;
  
  static
  {
    ASPECT_RATIO_IDC_VALUES = new float[] { 1.0F, 1.0F, 1.0909091F, 0.90909094F, 1.4545455F, 1.2121212F, 2.1818182F, 1.8181819F, 2.909091F, 2.4242425F, 1.6363636F, 1.3636364F, 1.939394F, 1.6161616F, 1.3333334F, 1.5F, 2.0F };
    scratchEscapePositionsLock = new Object();
  }
  
  public static void clearPrefixFlags(boolean[] paramArrayOfBoolean)
  {
    paramArrayOfBoolean[0] = false;
    paramArrayOfBoolean[1] = false;
    paramArrayOfBoolean[2] = false;
  }
  
  public static void discardToSps(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.position();
    int j = 0;
    int k = j;
    for (;;)
    {
      int m = j + 1;
      if (m >= i) {
        break;
      }
      int n = paramByteBuffer.get(j) & 0xFF;
      int i1;
      if (k == 3)
      {
        i1 = k;
        if (n == 1)
        {
          i1 = k;
          if ((paramByteBuffer.get(m) & 0x1F) == 7)
          {
            ByteBuffer localByteBuffer = paramByteBuffer.duplicate();
            localByteBuffer.position(j - 3);
            localByteBuffer.limit(i);
            paramByteBuffer.position(0);
            paramByteBuffer.put(localByteBuffer);
          }
        }
      }
      else
      {
        i1 = k;
        if (n == 0) {
          i1 = k + 1;
        }
      }
      k = i1;
      if (n != 0) {
        k = 0;
      }
      j = m;
    }
    paramByteBuffer.clear();
  }
  
  public static int findNalUnit(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean[] paramArrayOfBoolean)
  {
    int i = paramInt2 - paramInt1;
    boolean bool1 = false;
    boolean bool2;
    if (i >= 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Assertions.checkState(bool2);
    if (i == 0) {
      return paramInt2;
    }
    if (paramArrayOfBoolean != null)
    {
      if (paramArrayOfBoolean[0] != 0)
      {
        clearPrefixFlags(paramArrayOfBoolean);
        return paramInt1 - 3;
      }
      if ((i > 1) && (paramArrayOfBoolean[1] != 0) && (paramArrayOfByte[paramInt1] == 1))
      {
        clearPrefixFlags(paramArrayOfBoolean);
        return paramInt1 - 2;
      }
      if ((i > 2) && (paramArrayOfBoolean[2] != 0) && (paramArrayOfByte[paramInt1] == 0) && (paramArrayOfByte[(paramInt1 + 1)] == 1))
      {
        clearPrefixFlags(paramArrayOfBoolean);
        return paramInt1 - 1;
      }
    }
    int j = paramInt2 - 1;
    paramInt1 += 2;
    while (paramInt1 < j)
    {
      int k = paramArrayOfByte[paramInt1];
      if ((k & 0xFE) == 0)
      {
        int m = paramInt1 - 2;
        if ((paramArrayOfByte[m] == 0) && (paramArrayOfByte[(paramInt1 - 1)] == 0) && (k == 1))
        {
          if (paramArrayOfBoolean != null) {
            clearPrefixFlags(paramArrayOfBoolean);
          }
          return m;
        }
        paramInt1 -= 2;
      }
      paramInt1 += 3;
    }
    if (paramArrayOfBoolean != null)
    {
      if (i > 2)
      {
        if ((paramArrayOfByte[(paramInt2 - 3)] == 0) && (paramArrayOfByte[(paramInt2 - 2)] == 0) && (paramArrayOfByte[j] == 1)) {}
      }
      else {
        while (i == 2 ? (paramArrayOfBoolean[2] == 0) || (paramArrayOfByte[(paramInt2 - 2)] != 0) || (paramArrayOfByte[j] != 1) : (paramArrayOfBoolean[1] == 0) || (paramArrayOfByte[j] != 1))
        {
          bool2 = false;
          break;
        }
      }
      bool2 = true;
      paramArrayOfBoolean[0] = bool2;
      if (i > 1 ? (paramArrayOfByte[(paramInt2 - 2)] == 0) && (paramArrayOfByte[j] == 0) : (paramArrayOfBoolean[2] != 0) && (paramArrayOfByte[j] == 0)) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      paramArrayOfBoolean[1] = bool2;
      bool2 = bool1;
      if (paramArrayOfByte[j] == 0) {
        bool2 = true;
      }
      paramArrayOfBoolean[2] = bool2;
    }
    return paramInt2;
  }
  
  private static int findNextUnescapeIndex(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    while (paramInt1 < paramInt2 - 2)
    {
      if ((paramArrayOfByte[paramInt1] == 0) && (paramArrayOfByte[(paramInt1 + 1)] == 0) && (paramArrayOfByte[(paramInt1 + 2)] == 3)) {
        return paramInt1;
      }
      paramInt1++;
    }
    return paramInt2;
  }
  
  public static int getH265NalUnitType(byte[] paramArrayOfByte, int paramInt)
  {
    return (paramArrayOfByte[(paramInt + 3)] & 0x7E) >> 1;
  }
  
  public static int getNalUnitType(byte[] paramArrayOfByte, int paramInt)
  {
    return paramArrayOfByte[(paramInt + 3)] & 0x1F;
  }
  
  public static boolean isNalUnitSei(String paramString, byte paramByte)
  {
    boolean bool1 = "video/avc".equals(paramString);
    boolean bool2 = true;
    if (bool1)
    {
      bool1 = bool2;
      if ((paramByte & 0x1F) == 6) {}
    }
    else if (("video/hevc".equals(paramString)) && ((paramByte & 0x7E) >> 1 == 39))
    {
      bool1 = bool2;
    }
    else
    {
      bool1 = false;
    }
    return bool1;
  }
  
  public static PpsData parsePpsNalUnit(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte = new ParsableNalUnitBitArray(paramArrayOfByte, paramInt1, paramInt2);
    paramArrayOfByte.skipBits(8);
    paramInt2 = paramArrayOfByte.readUnsignedExpGolombCodedInt();
    paramInt1 = paramArrayOfByte.readUnsignedExpGolombCodedInt();
    paramArrayOfByte.skipBit();
    return new PpsData(paramInt2, paramInt1, paramArrayOfByte.readBit());
  }
  
  public static SpsData parseSpsNalUnit(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte = new ParsableNalUnitBitArray(paramArrayOfByte, paramInt1, paramInt2);
    paramArrayOfByte.skipBits(8);
    int i = paramArrayOfByte.readBits(8);
    int j = paramArrayOfByte.readBits(8);
    int k = paramArrayOfByte.readBits(8);
    int m = paramArrayOfByte.readUnsignedExpGolombCodedInt();
    int n = 1;
    int i1;
    boolean bool1;
    if ((i != 100) && (i != 110) && (i != 122) && (i != 244) && (i != 44) && (i != 83) && (i != 86) && (i != 118) && (i != 128) && (i != 138))
    {
      i1 = 1;
      bool1 = false;
    }
    else
    {
      i2 = paramArrayOfByte.readUnsignedExpGolombCodedInt();
      if (i2 == 3) {
        bool2 = paramArrayOfByte.readBit();
      } else {
        bool2 = false;
      }
      paramArrayOfByte.readUnsignedExpGolombCodedInt();
      paramArrayOfByte.readUnsignedExpGolombCodedInt();
      paramArrayOfByte.skipBit();
      i1 = i2;
      bool1 = bool2;
      if (paramArrayOfByte.readBit())
      {
        if (i2 != 3) {
          paramInt1 = 8;
        } else {
          paramInt1 = 12;
        }
        for (paramInt2 = 0;; paramInt2++)
        {
          i1 = i2;
          bool1 = bool2;
          if (paramInt2 >= paramInt1) {
            break;
          }
          if (paramArrayOfByte.readBit())
          {
            if (paramInt2 < 6) {
              i1 = 16;
            } else {
              i1 = 64;
            }
            skipScalingList(paramArrayOfByte, i1);
          }
        }
      }
    }
    int i3 = paramArrayOfByte.readUnsignedExpGolombCodedInt();
    int i4 = paramArrayOfByte.readUnsignedExpGolombCodedInt();
    if (i4 == 0)
    {
      paramInt1 = paramArrayOfByte.readUnsignedExpGolombCodedInt() + 4;
    }
    else
    {
      if (i4 == 1)
      {
        bool2 = paramArrayOfByte.readBit();
        paramArrayOfByte.readSignedExpGolombCodedInt();
        paramArrayOfByte.readSignedExpGolombCodedInt();
        long l = paramArrayOfByte.readUnsignedExpGolombCodedInt();
        for (paramInt1 = 0; paramInt1 < l; paramInt1++) {
          paramArrayOfByte.readUnsignedExpGolombCodedInt();
        }
        paramInt2 = 0;
        break label332;
      }
      paramInt1 = 0;
    }
    boolean bool2 = false;
    paramInt2 = paramInt1;
    label332:
    paramArrayOfByte.readUnsignedExpGolombCodedInt();
    paramArrayOfByte.skipBit();
    int i2 = paramArrayOfByte.readUnsignedExpGolombCodedInt();
    paramInt1 = paramArrayOfByte.readUnsignedExpGolombCodedInt();
    boolean bool3 = paramArrayOfByte.readBit();
    if (!bool3) {
      paramArrayOfByte.skipBit();
    }
    paramArrayOfByte.skipBit();
    int i5 = (i2 + 1) * 16;
    int i6 = (true - bool3) * (paramInt1 + 1) * 16;
    i2 = i5;
    paramInt1 = i6;
    if (paramArrayOfByte.readBit())
    {
      int i7 = paramArrayOfByte.readUnsignedExpGolombCodedInt();
      int i8 = paramArrayOfByte.readUnsignedExpGolombCodedInt();
      int i9 = paramArrayOfByte.readUnsignedExpGolombCodedInt();
      int i10 = paramArrayOfByte.readUnsignedExpGolombCodedInt();
      if (i1 == 0)
      {
        paramInt1 = true - bool3;
        i1 = n;
      }
      else
      {
        if (i1 == 3) {
          paramInt1 = 1;
        } else {
          paramInt1 = 2;
        }
        i2 = 1;
        if (i1 == 1) {
          i2 = 2;
        }
        i2 = (true - bool3) * i2;
        i1 = paramInt1;
        paramInt1 = i2;
      }
      i2 = i5 - (i7 + i8) * i1;
      paramInt1 = i6 - (i9 + i10) * paramInt1;
    }
    float f1 = 1.0F;
    float f2 = f1;
    if (paramArrayOfByte.readBit())
    {
      f2 = f1;
      if (paramArrayOfByte.readBit())
      {
        i1 = paramArrayOfByte.readBits(8);
        if (i1 == 255)
        {
          n = paramArrayOfByte.readBits(16);
          i1 = paramArrayOfByte.readBits(16);
          f2 = f1;
          if (n != 0)
          {
            f2 = f1;
            if (i1 != 0) {
              f2 = n / i1;
            }
          }
        }
        else
        {
          paramArrayOfByte = ASPECT_RATIO_IDC_VALUES;
          if (i1 < paramArrayOfByte.length)
          {
            f2 = paramArrayOfByte[i1];
          }
          else
          {
            paramArrayOfByte = new StringBuilder();
            paramArrayOfByte.append("Unexpected aspect_ratio_idc value: ");
            paramArrayOfByte.append(i1);
            Log.w("NalUnitUtil", paramArrayOfByte.toString());
            f2 = f1;
          }
        }
      }
    }
    return new SpsData(i, j, k, m, i2, paramInt1, f2, bool1, bool3, i3 + 4, i4, paramInt2, bool2);
  }
  
  private static void skipScalingList(ParsableNalUnitBitArray paramParsableNalUnitBitArray, int paramInt)
  {
    int i = 8;
    int j = 0;
    int k = 8;
    while (j < paramInt)
    {
      int m = i;
      if (i != 0) {
        m = (paramParsableNalUnitBitArray.readSignedExpGolombCodedInt() + k + 256) % 256;
      }
      if (m != 0) {
        k = m;
      }
      j++;
      i = m;
    }
  }
  
  public static int unescapeStream(byte[] paramArrayOfByte, int paramInt)
  {
    Object localObject = scratchEscapePositionsLock;
    int i = 0;
    int j = i;
    for (;;)
    {
      if (i < paramInt) {
        try
        {
          k = findNextUnescapeIndex(paramArrayOfByte, i, paramInt);
          i = k;
          if (k < paramInt)
          {
            int[] arrayOfInt = scratchEscapePositions;
            if (arrayOfInt.length <= j) {
              scratchEscapePositions = Arrays.copyOf(arrayOfInt, arrayOfInt.length * 2);
            }
            scratchEscapePositions[j] = k;
            i = k + 3;
            j++;
          }
        }
        finally
        {
          break label189;
        }
      }
    }
    int m = paramInt - j;
    int n = 0;
    paramInt = n;
    i = paramInt;
    int k = paramInt;
    for (paramInt = n; paramInt < j; paramInt++)
    {
      n = scratchEscapePositions[paramInt] - i;
      System.arraycopy(paramArrayOfByte, i, paramArrayOfByte, k, n);
      k += n;
      int i1 = k + 1;
      paramArrayOfByte[k] = ((byte)0);
      k = i1 + 1;
      paramArrayOfByte[i1] = ((byte)0);
      i += n + 3;
    }
    System.arraycopy(paramArrayOfByte, i, paramArrayOfByte, k, m - k);
    return m;
    label189:
    throw paramArrayOfByte;
  }
  
  public static final class PpsData
  {
    public final boolean bottomFieldPicOrderInFramePresentFlag;
    public final int picParameterSetId;
    public final int seqParameterSetId;
    
    public PpsData(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      picParameterSetId = paramInt1;
      seqParameterSetId = paramInt2;
      bottomFieldPicOrderInFramePresentFlag = paramBoolean;
    }
  }
  
  public static final class SpsData
  {
    public final int constraintsFlagsAndReservedZero2Bits;
    public final boolean deltaPicOrderAlwaysZeroFlag;
    public final boolean frameMbsOnlyFlag;
    public final int frameNumLength;
    public final int height;
    public final int levelIdc;
    public final int picOrderCntLsbLength;
    public final int picOrderCountType;
    public final float pixelWidthAspectRatio;
    public final int profileIdc;
    public final boolean separateColorPlaneFlag;
    public final int seqParameterSetId;
    public final int width;
    
    public SpsData(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, float paramFloat, boolean paramBoolean1, boolean paramBoolean2, int paramInt7, int paramInt8, int paramInt9, boolean paramBoolean3)
    {
      profileIdc = paramInt1;
      constraintsFlagsAndReservedZero2Bits = paramInt2;
      levelIdc = paramInt3;
      seqParameterSetId = paramInt4;
      width = paramInt5;
      height = paramInt6;
      pixelWidthAspectRatio = paramFloat;
      separateColorPlaneFlag = paramBoolean1;
      frameMbsOnlyFlag = paramBoolean2;
      frameNumLength = paramInt7;
      picOrderCountType = paramInt8;
      picOrderCntLsbLength = paramInt9;
      deltaPicOrderAlwaysZeroFlag = paramBoolean3;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.util.NalUnitUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */