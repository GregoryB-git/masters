package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.util.ParsableBitArray;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class DtsUtil
{
  private static final int[] CHANNELS_BY_AMODE = { 1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8 };
  private static final byte FIRST_BYTE_14B_BE = 31;
  private static final byte FIRST_BYTE_14B_LE = -1;
  private static final byte FIRST_BYTE_BE = 127;
  private static final byte FIRST_BYTE_LE = -2;
  private static final int[] SAMPLE_RATE_BY_SFREQ = { -1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1 };
  private static final int SYNC_VALUE_14B_BE = 536864768;
  private static final int SYNC_VALUE_14B_LE = -14745368;
  private static final int SYNC_VALUE_BE = 2147385345;
  private static final int SYNC_VALUE_LE = -25230976;
  private static final int[] TWICE_BITRATE_KBPS_BY_RATE = { 64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680 };
  
  public static int getDtsFrameSize(byte[] paramArrayOfByte)
  {
    int i = 0;
    int j = paramArrayOfByte[0];
    if (j != -2)
    {
      if (j != -1)
      {
        if (j != 31)
        {
          j = (paramArrayOfByte[5] & 0x3) << 12 | (paramArrayOfByte[6] & 0xFF) << 4;
          k = paramArrayOfByte[7];
          break label147;
        }
        k = (paramArrayOfByte[6] & 0x3) << 12 | (paramArrayOfByte[7] & 0xFF) << 4;
        j = paramArrayOfByte[8];
      }
      else
      {
        k = (paramArrayOfByte[7] & 0x3) << 12 | (paramArrayOfByte[6] & 0xFF) << 4;
        j = paramArrayOfByte[9];
      }
      j = ((j & 0x3C) >> 2 | k) + 1;
      k = 1;
      break label161;
    }
    else
    {
      j = (paramArrayOfByte[4] & 0x3) << 12 | (paramArrayOfByte[7] & 0xFF) << 4;
      k = paramArrayOfByte[6];
    }
    label147:
    j = ((k & 0xF0) >> 4 | j) + 1;
    int k = i;
    label161:
    i = j;
    if (k != 0) {
      i = j * 16 / 14;
    }
    return i;
  }
  
  private static ParsableBitArray getNormalizedFrameHeader(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte[0] == Byte.MAX_VALUE) {
      return new ParsableBitArray(paramArrayOfByte);
    }
    paramArrayOfByte = Arrays.copyOf(paramArrayOfByte, paramArrayOfByte.length);
    if (isLittleEndianFrameHeader(paramArrayOfByte)) {
      for (int i = 0; i < paramArrayOfByte.length - 1; i += 2)
      {
        int j = paramArrayOfByte[i];
        int k = i + 1;
        paramArrayOfByte[i] = ((byte)paramArrayOfByte[k]);
        paramArrayOfByte[k] = ((byte)j);
      }
    }
    ParsableBitArray localParsableBitArray1 = new ParsableBitArray(paramArrayOfByte);
    if (paramArrayOfByte[0] == 31)
    {
      ParsableBitArray localParsableBitArray2 = new ParsableBitArray(paramArrayOfByte);
      while (localParsableBitArray2.bitsLeft() >= 16)
      {
        localParsableBitArray2.skipBits(2);
        localParsableBitArray1.putInt(localParsableBitArray2.readBits(14), 14);
      }
    }
    localParsableBitArray1.reset(paramArrayOfByte);
    return localParsableBitArray1;
  }
  
  private static boolean isLittleEndianFrameHeader(byte[] paramArrayOfByte)
  {
    boolean bool = false;
    int i = paramArrayOfByte[0];
    if ((i == -2) || (i == -1)) {
      bool = true;
    }
    return bool;
  }
  
  public static boolean isSyncWord(int paramInt)
  {
    boolean bool;
    if ((paramInt != 2147385345) && (paramInt != -25230976) && (paramInt != 536864768) && (paramInt != -14745368)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static int parseDtsAudioSampleCount(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.position();
    int j = paramByteBuffer.get(i);
    if (j != -2)
    {
      if (j != -1)
      {
        if (j != 31)
        {
          j = (paramByteBuffer.get(i + 4) & 0x1) << 6;
          i = paramByteBuffer.get(i + 5);
          break label128;
        }
        j = (paramByteBuffer.get(i + 5) & 0x7) << 4;
        i = paramByteBuffer.get(i + 6);
      }
      else
      {
        j = (paramByteBuffer.get(i + 4) & 0x7) << 4;
        i = paramByteBuffer.get(i + 7);
      }
      i &= 0x3C;
      break label134;
    }
    else
    {
      j = (paramByteBuffer.get(i + 5) & 0x1) << 6;
      i = paramByteBuffer.get(i + 4);
    }
    label128:
    i &= 0xFC;
    label134:
    return ((i >> 2 | j) + 1) * 32;
  }
  
  public static int parseDtsAudioSampleCount(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte[0];
    int j;
    if (i != -2)
    {
      if (i != -1)
      {
        if (i != 31)
        {
          i = (paramArrayOfByte[4] & 0x1) << 6;
          j = paramArrayOfByte[5];
          break label89;
        }
        i = (paramArrayOfByte[5] & 0x7) << 4;
        j = paramArrayOfByte[6];
      }
      else
      {
        i = (paramArrayOfByte[4] & 0x7) << 4;
        j = paramArrayOfByte[7];
      }
      j &= 0x3C;
      break label95;
    }
    else
    {
      i = (paramArrayOfByte[5] & 0x1) << 6;
      j = paramArrayOfByte[4];
    }
    label89:
    j &= 0xFC;
    label95:
    return ((j >> 2 | i) + 1) * 32;
  }
  
  public static Format parseDtsFormat(byte[] paramArrayOfByte, String paramString1, String paramString2, DrmInitData paramDrmInitData)
  {
    ParsableBitArray localParsableBitArray = getNormalizedFrameHeader(paramArrayOfByte);
    localParsableBitArray.skipBits(60);
    int i = localParsableBitArray.readBits(6);
    int j = CHANNELS_BY_AMODE[i];
    i = localParsableBitArray.readBits(4);
    int k = SAMPLE_RATE_BY_SFREQ[i];
    i = localParsableBitArray.readBits(5);
    paramArrayOfByte = TWICE_BITRATE_KBPS_BY_RATE;
    if (i >= paramArrayOfByte.length) {
      i = -1;
    } else {
      i = paramArrayOfByte[i] * 1000 / 2;
    }
    localParsableBitArray.skipBits(10);
    int m;
    if (localParsableBitArray.readBits(2) > 0) {
      m = 1;
    } else {
      m = 0;
    }
    return Format.createAudioSampleFormat(paramString1, "audio/vnd.dts", null, i, -1, j + m, k, null, paramDrmInitData, 0, paramString2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.DtsUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */