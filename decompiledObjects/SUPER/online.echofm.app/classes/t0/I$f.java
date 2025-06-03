package t0;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;

public final class I$f
  implements I.d
{
  public final int a;
  public MediaCodecInfo[] b;
  
  public I$f(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i;
    if ((!paramBoolean1) && (!paramBoolean2)) {
      i = 0;
    } else {
      i = 1;
    }
    a = i;
  }
  
  public MediaCodecInfo a(int paramInt)
  {
    f();
    return b[paramInt];
  }
  
  public boolean b(String paramString1, String paramString2, MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    return paramCodecCapabilities.isFeatureRequired(paramString1);
  }
  
  public int c()
  {
    f();
    return b.length;
  }
  
  public boolean d(String paramString1, String paramString2, MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    return paramCodecCapabilities.isFeatureSupported(paramString1);
  }
  
  public boolean e()
  {
    return true;
  }
  
  public final void f()
  {
    if (b == null) {
      b = new MediaCodecList(a).getCodecInfos();
    }
  }
}

/* Location:
 * Qualified Name:     t0.I.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */