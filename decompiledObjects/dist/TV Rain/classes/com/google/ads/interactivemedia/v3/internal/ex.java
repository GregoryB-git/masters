package com.google.ads.interactivemedia.v3.internal;

import android.annotation.TargetApi;
import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCodec.CryptoInfo.Pattern;

@TargetApi(24)
final class ex
{
  private final MediaCodec.CryptoInfo a;
  private final MediaCodec.CryptoInfo.Pattern b;
  
  private ex(MediaCodec.CryptoInfo paramCryptoInfo)
  {
    a = paramCryptoInfo;
    b = new MediaCodec.CryptoInfo.Pattern(0, 0);
  }
  
  private final void a(int paramInt1, int paramInt2)
  {
    b.set(paramInt1, paramInt2);
    a.setPattern(b);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ex
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */