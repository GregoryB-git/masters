package com.google.android.exoplayer2.drm;

import android.annotation.TargetApi;
import android.media.MediaCrypto;
import com.google.android.exoplayer2.util.Assertions;

@TargetApi(16)
public final class FrameworkMediaCrypto
  implements ExoMediaCrypto
{
  private final boolean forceAllowInsecureDecoderComponents;
  private final MediaCrypto mediaCrypto;
  
  public FrameworkMediaCrypto(MediaCrypto paramMediaCrypto)
  {
    this(paramMediaCrypto, false);
  }
  
  public FrameworkMediaCrypto(MediaCrypto paramMediaCrypto, boolean paramBoolean)
  {
    mediaCrypto = ((MediaCrypto)Assertions.checkNotNull(paramMediaCrypto));
    forceAllowInsecureDecoderComponents = paramBoolean;
  }
  
  public MediaCrypto getWrappedMediaCrypto()
  {
    return mediaCrypto;
  }
  
  public boolean requiresSecureDecoderComponent(String paramString)
  {
    boolean bool;
    if ((!forceAllowInsecureDecoderComponents) && (mediaCrypto.requiresSecureDecoderComponent(paramString))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.drm.FrameworkMediaCrypto
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */