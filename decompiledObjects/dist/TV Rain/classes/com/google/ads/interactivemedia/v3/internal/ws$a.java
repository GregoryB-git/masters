package com.google.ads.interactivemedia.v3.internal;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.OnFrameRenderedListener;
import android.os.Handler;

@TargetApi(23)
final class ws$a
  implements MediaCodec.OnFrameRenderedListener
{
  private ws$a(ws paramws, MediaCodec paramMediaCodec)
  {
    paramMediaCodec.setOnFrameRenderedListener(this, new Handler());
  }
  
  public final void onFrameRendered(MediaCodec paramMediaCodec, long paramLong1, long paramLong2)
  {
    paramMediaCodec = a;
    if (this != b) {
      return;
    }
    paramMediaCodec.e(paramLong1);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ws.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */