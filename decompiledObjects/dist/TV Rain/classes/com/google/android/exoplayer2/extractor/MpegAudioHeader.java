package com.google.android.exoplayer2.extractor;

import z2;

public final class MpegAudioHeader
{
  private static final int[] BITRATE_V1_L1;
  private static final int[] BITRATE_V1_L2 = { 32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384 };
  private static final int[] BITRATE_V1_L3 = { 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320 };
  private static final int[] BITRATE_V2 = { 8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160 };
  private static final int[] BITRATE_V2_L1;
  public static final int MAX_FRAME_SIZE_BYTES = 4096;
  private static final String[] MIME_TYPE_BY_LAYER = { "audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg" };
  private static final int[] SAMPLING_RATE_V1 = { 44100, 48000, 32000 };
  public int bitrate;
  public int channels;
  public int frameSize;
  public String mimeType;
  public int sampleRate;
  public int samplesPerFrame;
  public int version;
  
  static
  {
    BITRATE_V1_L1 = new int[] { 32, 64, 96, 128, 160, 192, 224, 256, 288, 320, 352, 384, 416, 448 };
    BITRATE_V2_L1 = new int[] { 32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, 192, 224, 256 };
  }
  
  public static int getFrameSize(int paramInt)
  {
    if ((paramInt & 0xFFE00000) != -2097152) {
      return -1;
    }
    int i = paramInt >>> 19 & 0x3;
    if (i == 1) {
      return -1;
    }
    int j = paramInt >>> 17 & 0x3;
    if (j == 0) {
      return -1;
    }
    int k = paramInt >>> 12 & 0xF;
    if ((k != 0) && (k != 15))
    {
      int m = paramInt >>> 10 & 0x3;
      if (m == 3) {
        return -1;
      }
      int n = SAMPLING_RATE_V1[m];
      if (i == 2)
      {
        m = n / 2;
      }
      else
      {
        m = n;
        if (i == 0) {
          m = n / 4;
        }
      }
      int i1 = paramInt >>> 9 & 0x1;
      if (j == 3)
      {
        if (i == 3) {
          paramInt = BITRATE_V1_L1[(k - 1)];
        } else {
          paramInt = BITRATE_V2_L1[(k - 1)];
        }
        return (paramInt * 12000 / m + i1) * 4;
      }
      if (i == 3)
      {
        if (j == 2) {
          paramInt = BITRATE_V1_L2[(k - 1)];
        } else {
          paramInt = BITRATE_V1_L3[(k - 1)];
        }
      }
      else {
        paramInt = BITRATE_V2[(k - 1)];
      }
      n = 144000;
      if (i == 3) {
        return z2.a(paramInt, 144000, m, i1);
      }
      if (j == 1) {
        n = 72000;
      }
      return z2.a(n, paramInt, m, i1);
    }
    return -1;
  }
  
  public static boolean populateHeader(int paramInt, MpegAudioHeader paramMpegAudioHeader)
  {
    if ((paramInt & 0xFFE00000) != -2097152) {
      return false;
    }
    int i = paramInt >>> 19 & 0x3;
    if (i == 1) {
      return false;
    }
    int j = paramInt >>> 17 & 0x3;
    if (j == 0) {
      return false;
    }
    int k = paramInt >>> 12 & 0xF;
    if ((k != 0) && (k != 15))
    {
      int m = paramInt >>> 10 & 0x3;
      if (m == 3) {
        return false;
      }
      int n = SAMPLING_RATE_V1[m];
      if (i == 2)
      {
        m = n / 2;
      }
      else
      {
        m = n;
        if (i == 0) {
          m = n / 4;
        }
      }
      int i1 = paramInt >>> 9 & 0x1;
      int i2 = 1152;
      int i3;
      if (j == 3)
      {
        if (i == 3) {
          n = BITRATE_V1_L1[(k - 1)];
        } else {
          n = BITRATE_V2_L1[(k - 1)];
        }
        i3 = (n * 12000 / m + i1) * 4;
        i2 = 384;
      }
      else
      {
        i3 = 144000;
        if (i == 3)
        {
          if (j == 2) {
            n = BITRATE_V1_L2[(k - 1)];
          } else {
            n = BITRATE_V1_L3[(k - 1)];
          }
          i3 = 144000 * n / m;
        }
        else
        {
          k = BITRATE_V2[(k - 1)];
          n = i2;
          if (j == 1) {
            n = 576;
          }
          i2 = i3;
          if (j == 1) {
            i2 = 72000;
          }
          i3 = i2 * k / m;
          i2 = n;
          n = k;
        }
        i3 += i1;
      }
      String str = MIME_TYPE_BY_LAYER[(3 - j)];
      if ((paramInt >> 6 & 0x3) == 3) {
        paramInt = 1;
      } else {
        paramInt = 2;
      }
      paramMpegAudioHeader.setValues(i, str, i3, m, paramInt, n * 1000, i2);
      return true;
    }
    return false;
  }
  
  private void setValues(int paramInt1, String paramString, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    version = paramInt1;
    mimeType = paramString;
    frameSize = paramInt2;
    sampleRate = paramInt3;
    channels = paramInt4;
    bitrate = paramInt5;
    samplesPerFrame = paramInt6;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.MpegAudioHeader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */