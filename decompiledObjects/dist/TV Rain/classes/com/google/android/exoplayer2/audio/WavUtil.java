package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.Util;

public final class WavUtil
{
  public static final int DATA_FOURCC = Util.getIntegerCodeForString("data");
  public static final int FMT_FOURCC;
  public static final int RIFF_FOURCC = Util.getIntegerCodeForString("RIFF");
  private static final int TYPE_A_LAW = 6;
  private static final int TYPE_FLOAT = 3;
  private static final int TYPE_MU_LAW = 7;
  private static final int TYPE_PCM = 1;
  private static final int TYPE_WAVE_FORMAT_EXTENSIBLE = 65534;
  public static final int WAVE_FOURCC = Util.getIntegerCodeForString("WAVE");
  
  static
  {
    FMT_FOURCC = Util.getIntegerCodeForString("fmt ");
  }
  
  public static int getEncodingForType(int paramInt1, int paramInt2)
  {
    if (paramInt1 != 1)
    {
      int i = 0;
      if (paramInt1 != 3)
      {
        if (paramInt1 != 65534)
        {
          if (paramInt1 != 6)
          {
            if (paramInt1 != 7) {
              return 0;
            }
            return 268435456;
          }
          return 536870912;
        }
      }
      else
      {
        paramInt1 = i;
        if (paramInt2 == 32) {
          paramInt1 = 4;
        }
        return paramInt1;
      }
    }
    return Util.getPcmEncoding(paramInt2);
  }
  
  public static int getTypeForEncoding(int paramInt)
  {
    if (paramInt != Integer.MIN_VALUE) {
      if (paramInt != 268435456)
      {
        if (paramInt != 536870912)
        {
          if ((paramInt != 1073741824) && (paramInt != 2) && (paramInt != 3))
          {
            if (paramInt == 4) {
              return 3;
            }
            throw new IllegalArgumentException();
          }
        }
        else {
          return 6;
        }
      }
      else {
        return 7;
      }
    }
    return 1;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.WavUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */