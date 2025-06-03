package t0;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;

public final class I$e
  implements I.d
{
  public MediaCodecInfo a(int paramInt)
  {
    return MediaCodecList.getCodecInfoAt(paramInt);
  }
  
  public boolean b(String paramString1, String paramString2, MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    return false;
  }
  
  public int c()
  {
    return MediaCodecList.getCodecCount();
  }
  
  public boolean d(String paramString1, String paramString2, MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    boolean bool;
    if (("secure-playback".equals(paramString1)) && ("video/avc".equals(paramString2))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean e()
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     t0.I.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */