package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;

final class kc
  implements jz
{
  public final int a()
  {
    return MediaCodecList.getCodecCount();
  }
  
  public final MediaCodecInfo a(int paramInt)
  {
    return MediaCodecList.getCodecInfoAt(paramInt);
  }
  
  public final boolean a(String paramString, MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    return false;
  }
  
  public final boolean a(String paramString1, String paramString2, MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    return ("secure-playback".equals(paramString1)) && ("video/avc".equals(paramString2));
  }
  
  public final boolean b()
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.kc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */