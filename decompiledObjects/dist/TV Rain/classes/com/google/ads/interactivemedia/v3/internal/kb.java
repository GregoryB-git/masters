package com.google.ads.interactivemedia.v3.internal;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;

@TargetApi(21)
final class kb
  implements jz
{
  private final int a;
  private MediaCodecInfo[] b;
  
  public kb(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i;
    if ((!paramBoolean1) && (!paramBoolean2)) {
      i = 0;
    } else {
      i = 1;
    }
    a = i;
  }
  
  private final void c()
  {
    if (b == null) {
      b = new MediaCodecList(a).getCodecInfos();
    }
  }
  
  public final int a()
  {
    c();
    return b.length;
  }
  
  public final MediaCodecInfo a(int paramInt)
  {
    c();
    return b[paramInt];
  }
  
  public final boolean a(String paramString, MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    return paramCodecCapabilities.isFeatureRequired(paramString);
  }
  
  public final boolean a(String paramString1, String paramString2, MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    return paramCodecCapabilities.isFeatureSupported(paramString1);
  }
  
  public final boolean b()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.kb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */