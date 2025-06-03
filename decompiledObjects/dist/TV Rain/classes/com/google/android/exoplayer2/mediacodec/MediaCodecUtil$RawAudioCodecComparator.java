package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.util.Util;
import java.util.Comparator;

final class MediaCodecUtil$RawAudioCodecComparator
  implements Comparator<MediaCodecInfo>
{
  private static int scoreMediaCodecInfo(MediaCodecInfo paramMediaCodecInfo)
  {
    paramMediaCodecInfo = name;
    if ((!paramMediaCodecInfo.startsWith("OMX.google")) && (!paramMediaCodecInfo.startsWith("c2.android")))
    {
      if ((Util.SDK_INT < 26) && (paramMediaCodecInfo.equals("OMX.MTK.AUDIO.DECODER.RAW"))) {
        return 1;
      }
      return 0;
    }
    return -1;
  }
  
  public int compare(MediaCodecInfo paramMediaCodecInfo1, MediaCodecInfo paramMediaCodecInfo2)
  {
    return scoreMediaCodecInfo(paramMediaCodecInfo1) - scoreMediaCodecInfo(paramMediaCodecInfo2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.mediacodec.MediaCodecUtil.RawAudioCodecComparator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */