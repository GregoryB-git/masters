package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class Ac3Util
{
  private static final int AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT = 1536;
  private static final int AUDIO_SAMPLES_PER_AUDIO_BLOCK = 256;
  private static final int[] BITRATE_BY_HALF_FRMSIZECOD = { 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640 };
  private static final int[] BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD = { 1, 2, 3, 6 };
  private static final int[] CHANNEL_COUNT_BY_ACMOD;
  private static final int[] SAMPLE_RATE_BY_FSCOD = { 48000, 44100, 32000 };
  private static final int[] SAMPLE_RATE_BY_FSCOD2 = { 24000, 22050, 16000 };
  private static final int[] SYNCFRAME_SIZE_WORDS_BY_HALF_FRMSIZECOD_44_1 = { 69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393 };
  public static final int TRUEHD_RECHUNK_SAMPLE_COUNT = 16;
  public static final int TRUEHD_SYNCFRAME_PREFIX_LENGTH = 10;
  
  static
  {
    CHANNEL_COUNT_BY_ACMOD = new int[] { 2, 1, 2, 3, 3, 4, 4, 5 };
  }
  
  public static int findTrueHdSyncframeOffset(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.position();
    int j = paramByteBuffer.limit();
    for (int k = i; k <= j - 10; k++) {
      if ((paramByteBuffer.getInt(k + 4) & 0xFEFFFFFF) == -1167101192) {
        return k - i;
      }
    }
    return -1;
  }
  
  public static int getAc3SyncframeAudioSampleCount()
  {
    return 1536;
  }
  
  private static int getAc3SyncframeSize(int paramInt1, int paramInt2)
  {
    int i = paramInt2 / 2;
    if (paramInt1 >= 0)
    {
      int[] arrayOfInt1 = SAMPLE_RATE_BY_FSCOD;
      if ((paramInt1 < arrayOfInt1.length) && (paramInt2 >= 0))
      {
        int[] arrayOfInt2 = SYNCFRAME_SIZE_WORDS_BY_HALF_FRMSIZECOD_44_1;
        if (i < arrayOfInt2.length)
        {
          paramInt1 = arrayOfInt1[paramInt1];
          if (paramInt1 == 44100) {
            return (paramInt2 % 2 + arrayOfInt2[i]) * 2;
          }
          paramInt2 = BITRATE_BY_HALF_FRMSIZECOD[i];
          if (paramInt1 == 32000) {
            return paramInt2 * 6;
          }
          return paramInt2 * 4;
        }
      }
    }
    return -1;
  }
  
  public static Format parseAc3AnnexFFormat(ParsableByteArray paramParsableByteArray, String paramString1, String paramString2, DrmInitData paramDrmInitData)
  {
    int i = paramParsableByteArray.readUnsignedByte();
    int j = SAMPLE_RATE_BY_FSCOD[((i & 0xC0) >> 6)];
    int k = paramParsableByteArray.readUnsignedByte();
    int m = CHANNEL_COUNT_BY_ACMOD[((k & 0x38) >> 3)];
    i = m;
    if ((k & 0x4) != 0) {
      i = m + 1;
    }
    return Format.createAudioSampleFormat(paramString1, "audio/ac3", null, -1, -1, i, j, null, paramDrmInitData, 0, paramString2);
  }
  
  public static SyncFrameInfo parseAc3SyncframeInfo(ParsableBitArray paramParsableBitArray)
  {
    int i = paramParsableBitArray.getPosition();
    paramParsableBitArray.skipBits(40);
    int j;
    if (paramParsableBitArray.readBits(5) == 16) {
      j = 1;
    } else {
      j = 0;
    }
    paramParsableBitArray.setPosition(i);
    i = -1;
    int i1;
    int i2;
    int i6;
    if (j != 0)
    {
      paramParsableBitArray.skipBits(16);
      j = paramParsableBitArray.readBits(2);
      if (j != 0)
      {
        if (j != 1)
        {
          if (j == 2) {
            i = 2;
          }
        }
        else {
          i = 1;
        }
      }
      else {
        i = 0;
      }
      paramParsableBitArray.skipBits(3);
      int k = (paramParsableBitArray.readBits(11) + 1) * 2;
      int n = paramParsableBitArray.readBits(2);
      if (n == 3)
      {
        j = SAMPLE_RATE_BY_FSCOD2[paramParsableBitArray.readBits(2)];
        i1 = 6;
        i2 = 3;
      }
      else
      {
        i2 = paramParsableBitArray.readBits(2);
        i1 = BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD[i2];
        j = SAMPLE_RATE_BY_FSCOD[n];
      }
      int i3 = i1 * 256;
      int i4 = paramParsableBitArray.readBits(3);
      int i5 = paramParsableBitArray.readBit();
      int i7 = CHANNEL_COUNT_BY_ACMOD[i4] + i5;
      paramParsableBitArray.skipBits(10);
      if (paramParsableBitArray.readBit()) {
        paramParsableBitArray.skipBits(8);
      }
      if (i4 == 0)
      {
        paramParsableBitArray.skipBits(5);
        if (paramParsableBitArray.readBit()) {
          paramParsableBitArray.skipBits(8);
        }
      }
      if ((i == 1) && (paramParsableBitArray.readBit())) {
        paramParsableBitArray.skipBits(16);
      }
      if (paramParsableBitArray.readBit())
      {
        if (i4 > 2) {
          paramParsableBitArray.skipBits(2);
        }
        if (((i4 & 0x1) != 0) && (i4 > 2)) {
          paramParsableBitArray.skipBits(6);
        }
        if ((i4 & 0x4) != 0) {
          paramParsableBitArray.skipBits(6);
        }
        if ((i5 != 0) && (paramParsableBitArray.readBit())) {
          paramParsableBitArray.skipBits(5);
        }
        if (i == 0)
        {
          if (paramParsableBitArray.readBit()) {
            paramParsableBitArray.skipBits(6);
          }
          if ((i4 == 0) && (paramParsableBitArray.readBit())) {
            paramParsableBitArray.skipBits(6);
          }
          if (paramParsableBitArray.readBit()) {
            paramParsableBitArray.skipBits(6);
          }
          i6 = paramParsableBitArray.readBits(2);
          if (i6 == 1)
          {
            paramParsableBitArray.skipBits(5);
          }
          else if (i6 == 2)
          {
            paramParsableBitArray.skipBits(12);
          }
          else if (i6 == 3)
          {
            i6 = paramParsableBitArray.readBits(5);
            if (paramParsableBitArray.readBit())
            {
              paramParsableBitArray.skipBits(5);
              if (paramParsableBitArray.readBit()) {
                paramParsableBitArray.skipBits(4);
              }
              if (paramParsableBitArray.readBit()) {
                paramParsableBitArray.skipBits(4);
              }
              if (paramParsableBitArray.readBit()) {
                paramParsableBitArray.skipBits(4);
              }
              if (paramParsableBitArray.readBit()) {
                paramParsableBitArray.skipBits(4);
              }
              if (paramParsableBitArray.readBit()) {
                paramParsableBitArray.skipBits(4);
              }
              if (paramParsableBitArray.readBit()) {
                paramParsableBitArray.skipBits(4);
              }
              if (paramParsableBitArray.readBit()) {
                paramParsableBitArray.skipBits(4);
              }
              if (paramParsableBitArray.readBit())
              {
                if (paramParsableBitArray.readBit()) {
                  paramParsableBitArray.skipBits(4);
                }
                if (paramParsableBitArray.readBit()) {
                  paramParsableBitArray.skipBits(4);
                }
              }
            }
            if (paramParsableBitArray.readBit())
            {
              paramParsableBitArray.skipBits(5);
              if (paramParsableBitArray.readBit())
              {
                paramParsableBitArray.skipBits(7);
                if (paramParsableBitArray.readBit()) {
                  paramParsableBitArray.skipBits(8);
                }
              }
            }
            paramParsableBitArray.skipBits((i6 + 2) * 8);
            paramParsableBitArray.byteAlign();
          }
          if (i4 < 2)
          {
            if (paramParsableBitArray.readBit()) {
              paramParsableBitArray.skipBits(14);
            }
            if ((i4 == 0) && (paramParsableBitArray.readBit())) {
              paramParsableBitArray.skipBits(14);
            }
          }
          if (paramParsableBitArray.readBit()) {
            if (i2 == 0) {
              paramParsableBitArray.skipBits(5);
            } else {
              for (i6 = 0; i6 < i1; i6++) {
                if (paramParsableBitArray.readBit()) {
                  paramParsableBitArray.skipBits(5);
                }
              }
            }
          }
        }
      }
      if (paramParsableBitArray.readBit())
      {
        paramParsableBitArray.skipBits(5);
        if (i4 == 2) {
          paramParsableBitArray.skipBits(4);
        }
        if (i4 >= 6) {
          paramParsableBitArray.skipBits(2);
        }
        if (paramParsableBitArray.readBit()) {
          paramParsableBitArray.skipBits(8);
        }
        if ((i4 == 0) && (paramParsableBitArray.readBit())) {
          paramParsableBitArray.skipBits(8);
        }
        if (n < 3) {
          paramParsableBitArray.skipBit();
        }
      }
      if ((i == 0) && (i2 != 3)) {
        paramParsableBitArray.skipBit();
      }
      if ((i == 2) && ((i2 == 3) || (paramParsableBitArray.readBit()))) {
        paramParsableBitArray.skipBits(6);
      }
      if ((paramParsableBitArray.readBit()) && (paramParsableBitArray.readBits(6) == 1) && (paramParsableBitArray.readBits(8) == 1))
      {
        paramParsableBitArray = "audio/eac3-joc";
        i1 = k;
        i2 = j;
        j = i3;
        i6 = i7;
      }
      else
      {
        paramParsableBitArray = "audio/eac3";
        i1 = k;
        i2 = j;
        j = i3;
        i6 = i7;
      }
    }
    else
    {
      paramParsableBitArray.skipBits(32);
      j = paramParsableBitArray.readBits(2);
      i1 = getAc3SyncframeSize(j, paramParsableBitArray.readBits(6));
      paramParsableBitArray.skipBits(8);
      i6 = paramParsableBitArray.readBits(3);
      if (((i6 & 0x1) != 0) && (i6 != 1)) {
        paramParsableBitArray.skipBits(2);
      }
      if ((i6 & 0x4) != 0) {
        paramParsableBitArray.skipBits(2);
      }
      if (i6 == 2) {
        paramParsableBitArray.skipBits(2);
      }
      i2 = SAMPLE_RATE_BY_FSCOD[j];
      j = 1536;
      int m = paramParsableBitArray.readBit();
      i6 = CHANNEL_COUNT_BY_ACMOD[i6] + m;
      paramParsableBitArray = "audio/ac3";
    }
    return new SyncFrameInfo(paramParsableBitArray, i, i6, i2, i1, j, null);
  }
  
  public static int parseAc3SyncframeSize(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length < 6) {
      return -1;
    }
    if ((paramArrayOfByte[5] & 0xFF) >> 3 == 16) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      i = paramArrayOfByte[2];
      return ((paramArrayOfByte[3] & 0xFF | (i & 0x7) << 8) + 1) * 2;
    }
    int i = paramArrayOfByte[4];
    return getAc3SyncframeSize((i & 0xC0) >> 6, i & 0x3F);
  }
  
  public static Format parseEAc3AnnexFFormat(ParsableByteArray paramParsableByteArray, String paramString1, String paramString2, DrmInitData paramDrmInitData)
  {
    paramParsableByteArray.skipBytes(2);
    int i = paramParsableByteArray.readUnsignedByte();
    int j = SAMPLE_RATE_BY_FSCOD[((i & 0xC0) >> 6)];
    int k = paramParsableByteArray.readUnsignedByte();
    int m = CHANNEL_COUNT_BY_ACMOD[((k & 0xE) >> 1)];
    i = m;
    if ((k & 0x1) != 0) {
      i = m + 1;
    }
    m = i;
    if ((paramParsableByteArray.readUnsignedByte() & 0x1E) >> 1 > 0)
    {
      m = i;
      if ((0x2 & paramParsableByteArray.readUnsignedByte()) != 0) {
        m = i + 2;
      }
    }
    if ((paramParsableByteArray.bytesLeft() > 0) && ((paramParsableByteArray.readUnsignedByte() & 0x1) != 0)) {
      paramParsableByteArray = "audio/eac3-joc";
    } else {
      paramParsableByteArray = "audio/eac3";
    }
    return Format.createAudioSampleFormat(paramString1, paramParsableByteArray, null, -1, -1, m, j, null, paramDrmInitData, 0, paramString2);
  }
  
  public static int parseEAc3SyncframeAudioSampleCount(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.get(paramByteBuffer.position() + 4);
    int j = 6;
    if ((i & 0xC0) >> 6 != 3) {
      j = BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD[((paramByteBuffer.get(paramByteBuffer.position() + 4) & 0x30) >> 4)];
    }
    return j * 256;
  }
  
  public static int parseTrueHdSyncframeAudioSampleCount(ByteBuffer paramByteBuffer, int paramInt)
  {
    int i;
    if ((paramByteBuffer.get(paramByteBuffer.position() + paramInt + 7) & 0xFF) == 187) {
      i = 1;
    } else {
      i = 0;
    }
    int j = paramByteBuffer.position();
    if (i != 0) {
      i = 9;
    } else {
      i = 8;
    }
    return 40 << (paramByteBuffer.get(j + paramInt + i) >> 4 & 0x7);
  }
  
  public static int parseTrueHdSyncframeAudioSampleCount(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte[4];
    int j = 0;
    if ((i == -8) && (paramArrayOfByte[5] == 114) && (paramArrayOfByte[6] == 111))
    {
      i = paramArrayOfByte[7];
      if ((i & 0xFE) == 186)
      {
        if ((i & 0xFF) == 187) {
          j = 1;
        }
        if (j != 0) {
          j = 9;
        } else {
          j = 8;
        }
        return 40 << (paramArrayOfByte[j] >> 4 & 0x7);
      }
    }
    return 0;
  }
  
  public static final class SyncFrameInfo
  {
    public static final int STREAM_TYPE_TYPE0 = 0;
    public static final int STREAM_TYPE_TYPE1 = 1;
    public static final int STREAM_TYPE_TYPE2 = 2;
    public static final int STREAM_TYPE_UNDEFINED = -1;
    public final int channelCount;
    public final int frameSize;
    public final String mimeType;
    public final int sampleCount;
    public final int sampleRate;
    public final int streamType;
    
    private SyncFrameInfo(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
    {
      mimeType = paramString;
      streamType = paramInt1;
      channelCount = paramInt2;
      sampleRate = paramInt3;
      frameSize = paramInt4;
      sampleCount = paramInt5;
    }
    
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public static @interface StreamType {}
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.Ac3Util
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */