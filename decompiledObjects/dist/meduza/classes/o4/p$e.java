package o4;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;

public final class p$e
  implements p.c
{
  public final int a;
  public MediaCodecInfo[] b;
  
  public p$e(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i;
    if ((!paramBoolean1) && (!paramBoolean2)) {
      i = 0;
    } else {
      i = 1;
    }
    a = i;
  }
  
  public final MediaCodecInfo a(int paramInt)
  {
    if (b == null) {
      b = new MediaCodecList(a).getCodecInfos();
    }
    return b[paramInt];
  }
  
  public final boolean b(String paramString1, String paramString2, MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    return paramCodecCapabilities.isFeatureSupported(paramString1);
  }
  
  public final boolean c(String paramString, MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    return paramCodecCapabilities.isFeatureRequired(paramString);
  }
  
  public final int d()
  {
    if (b == null) {
      b = new MediaCodecList(a).getCodecInfos();
    }
    return b.length;
  }
  
  public final boolean e()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     o4.p.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */