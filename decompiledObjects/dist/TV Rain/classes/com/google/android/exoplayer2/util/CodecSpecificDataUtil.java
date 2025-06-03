package com.google.android.exoplayer2.util;

import a;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import z2;

public final class CodecSpecificDataUtil
{
  private static final int AUDIO_OBJECT_TYPE_AAC_LC = 2;
  private static final int AUDIO_OBJECT_TYPE_ER_BSAC = 22;
  private static final int AUDIO_OBJECT_TYPE_ESCAPE = 31;
  private static final int AUDIO_OBJECT_TYPE_PS = 29;
  private static final int AUDIO_OBJECT_TYPE_SBR = 5;
  private static final int AUDIO_SPECIFIC_CONFIG_CHANNEL_CONFIGURATION_INVALID = -1;
  private static final int[] AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE = { 0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1 };
  private static final int AUDIO_SPECIFIC_CONFIG_FREQUENCY_INDEX_ARBITRARY = 15;
  private static final int[] AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE;
  private static final byte[] NAL_START_CODE = { 0, 0, 0, 1 };
  
  static
  {
    AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE = new int[] { 96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350 };
  }
  
  public static byte[] buildAacAudioSpecificConfig(int paramInt1, int paramInt2, int paramInt3)
  {
    return new byte[] { (byte)(paramInt1 << 3 & 0xF8 | paramInt2 >> 1 & 0x7), (byte)(paramInt2 << 7 & 0x80 | paramInt3 << 3 & 0x78) };
  }
  
  public static byte[] buildAacLcAudioSpecificConfig(int paramInt1, int paramInt2)
  {
    int i = 0;
    int j = 0;
    int k = -1;
    int[] arrayOfInt;
    for (;;)
    {
      arrayOfInt = AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE;
      if (j >= arrayOfInt.length) {
        break;
      }
      if (paramInt1 == arrayOfInt[j]) {
        k = j;
      }
      j++;
    }
    int m = -1;
    for (j = i;; j++)
    {
      arrayOfInt = AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE;
      if (j >= arrayOfInt.length) {
        break;
      }
      if (paramInt2 == arrayOfInt[j]) {
        m = j;
      }
    }
    if ((paramInt1 != -1) && (m != -1)) {
      return buildAacAudioSpecificConfig(2, k, m);
    }
    throw new IllegalArgumentException(z2.n("Invalid sample rate or number of channels: ", paramInt1, ", ", paramInt2));
  }
  
  public static String buildAvcCodecString(int paramInt1, int paramInt2, int paramInt3)
  {
    return String.format("avc1.%02X%02X%02X", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
  }
  
  public static byte[] buildNalUnit(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte1 = NAL_START_CODE;
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length + paramInt2];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte2, arrayOfByte1.length, paramInt2);
    return arrayOfByte2;
  }
  
  private static int findNalStartCode(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramArrayOfByte.length;
    int j = NAL_START_CODE.length;
    while (paramInt <= i - j)
    {
      if (isNalStartCode(paramArrayOfByte, paramInt)) {
        return paramInt;
      }
      paramInt++;
    }
    return -1;
  }
  
  private static int getAacAudioObjectType(ParsableBitArray paramParsableBitArray)
  {
    int i = paramParsableBitArray.readBits(5);
    int j = i;
    if (i == 31) {
      j = paramParsableBitArray.readBits(6) + 32;
    }
    return j;
  }
  
  private static int getAacSamplingFrequency(ParsableBitArray paramParsableBitArray)
  {
    int i = paramParsableBitArray.readBits(4);
    if (i == 15)
    {
      i = paramParsableBitArray.readBits(24);
    }
    else
    {
      boolean bool;
      if (i < 13) {
        bool = true;
      } else {
        bool = false;
      }
      Assertions.checkArgument(bool);
      i = AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE[i];
    }
    return i;
  }
  
  private static boolean isNalStartCode(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramArrayOfByte.length - paramInt <= NAL_START_CODE.length) {
      return false;
    }
    for (int i = 0;; i++)
    {
      byte[] arrayOfByte = NAL_START_CODE;
      if (i >= arrayOfByte.length) {
        break;
      }
      if (paramArrayOfByte[(paramInt + i)] != arrayOfByte[i]) {
        return false;
      }
    }
    return true;
  }
  
  public static Pair<Integer, Integer> parseAacAudioSpecificConfig(ParsableBitArray paramParsableBitArray, boolean paramBoolean)
    throws ParserException
  {
    int i = getAacAudioObjectType(paramParsableBitArray);
    int j = getAacSamplingFrequency(paramParsableBitArray);
    int k = paramParsableBitArray.readBits(4);
    int n;
    if (i != 5)
    {
      m = i;
      n = k;
      if (i != 29) {}
    }
    else
    {
      i = getAacSamplingFrequency(paramParsableBitArray);
      int i1 = getAacAudioObjectType(paramParsableBitArray);
      m = i1;
      j = i;
      n = k;
      if (i1 == 22)
      {
        n = paramParsableBitArray.readBits(4);
        j = i;
        m = i1;
      }
    }
    boolean bool = true;
    if (paramBoolean)
    {
      if ((m != 1) && (m != 2) && (m != 3) && (m != 4) && (m != 6) && (m != 7) && (m != 17)) {
        switch (m)
        {
        default: 
          throw new ParserException(a.f("Unsupported audio object type: ", m));
        }
      }
      parseGaSpecificConfig(paramParsableBitArray, m, n);
      switch (m)
      {
      case 18: 
      default: 
        break;
      case 17: 
      case 19: 
      case 20: 
      case 21: 
      case 22: 
      case 23: 
        m = paramParsableBitArray.readBits(2);
        if ((m == 2) || (m == 3)) {
          throw new ParserException(a.f("Unsupported epConfig: ", m));
        }
        break;
      }
    }
    int m = AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE[n];
    if (m != -1) {
      paramBoolean = bool;
    } else {
      paramBoolean = false;
    }
    Assertions.checkArgument(paramBoolean);
    return Pair.create(Integer.valueOf(j), Integer.valueOf(m));
  }
  
  public static Pair<Integer, Integer> parseAacAudioSpecificConfig(byte[] paramArrayOfByte)
    throws ParserException
  {
    return parseAacAudioSpecificConfig(new ParsableBitArray(paramArrayOfByte), false);
  }
  
  private static void parseGaSpecificConfig(ParsableBitArray paramParsableBitArray, int paramInt1, int paramInt2)
  {
    paramParsableBitArray.skipBits(1);
    if (paramParsableBitArray.readBit()) {
      paramParsableBitArray.skipBits(14);
    }
    boolean bool = paramParsableBitArray.readBit();
    if (paramInt2 != 0)
    {
      if ((paramInt1 == 6) || (paramInt1 == 20)) {
        paramParsableBitArray.skipBits(3);
      }
      if (bool)
      {
        if (paramInt1 == 22) {
          paramParsableBitArray.skipBits(16);
        }
        if ((paramInt1 == 17) || (paramInt1 == 19) || (paramInt1 == 20) || (paramInt1 == 23)) {
          paramParsableBitArray.skipBits(3);
        }
        paramParsableBitArray.skipBits(1);
      }
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  @Nullable
  public static byte[][] splitNalUnits(byte[] paramArrayOfByte)
  {
    if (!isNalStartCode(paramArrayOfByte, 0)) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    int j;
    do
    {
      localArrayList.add(Integer.valueOf(i));
      j = findNalStartCode(paramArrayOfByte, i + NAL_START_CODE.length);
      i = j;
    } while (j != -1);
    byte[][] arrayOfByte = new byte[localArrayList.size()][];
    for (i = 0; i < localArrayList.size(); i++)
    {
      int k = ((Integer)localArrayList.get(i)).intValue();
      if (i < localArrayList.size() - 1) {
        j = ((Integer)localArrayList.get(i + 1)).intValue();
      } else {
        j = paramArrayOfByte.length;
      }
      j -= k;
      byte[] arrayOfByte1 = new byte[j];
      System.arraycopy(paramArrayOfByte, k, arrayOfByte1, 0, j);
      arrayOfByte[i] = arrayOfByte1;
    }
    return arrayOfByte;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.util.CodecSpecificDataUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */