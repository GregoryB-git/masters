package com.google.android.exoplayer2.decoder;

import android.annotation.TargetApi;
import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCodec.CryptoInfo.Pattern;

@TargetApi(24)
final class CryptoInfo$PatternHolderV24
{
  private final MediaCodec.CryptoInfo frameworkCryptoInfo;
  private final MediaCodec.CryptoInfo.Pattern pattern;
  
  private CryptoInfo$PatternHolderV24(MediaCodec.CryptoInfo paramCryptoInfo)
  {
    frameworkCryptoInfo = paramCryptoInfo;
    pattern = new MediaCodec.CryptoInfo.Pattern(0, 0);
  }
  
  private void set(int paramInt1, int paramInt2)
  {
    pattern.set(paramInt1, paramInt2);
    frameworkCryptoInfo.setPattern(pattern);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.decoder.CryptoInfo.PatternHolderV24
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */