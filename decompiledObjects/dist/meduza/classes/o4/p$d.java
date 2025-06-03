package o4;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;

public final class p$d
  implements p.c
{
  public final MediaCodecInfo a(int paramInt)
  {
    return MediaCodecList.getCodecInfoAt(paramInt);
  }
  
  public final boolean b(String paramString1, String paramString2, MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    boolean bool;
    if (("secure-playback".equals(paramString1)) && ("video/avc".equals(paramString2))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean c(String paramString, MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    return false;
  }
  
  public final int d()
  {
    return MediaCodecList.getCodecCount();
  }
  
  public final boolean e()
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     o4.p.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */