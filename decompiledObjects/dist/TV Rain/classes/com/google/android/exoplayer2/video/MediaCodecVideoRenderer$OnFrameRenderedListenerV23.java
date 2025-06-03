package com.google.android.exoplayer2.video;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.OnFrameRenderedListener;
import android.os.Handler;
import androidx.annotation.NonNull;

@TargetApi(23)
final class MediaCodecVideoRenderer$OnFrameRenderedListenerV23
  implements MediaCodec.OnFrameRenderedListener
{
  private MediaCodecVideoRenderer$OnFrameRenderedListenerV23(MediaCodecVideoRenderer paramMediaCodecVideoRenderer, MediaCodec paramMediaCodec)
  {
    paramMediaCodec.setOnFrameRenderedListener(this, new Handler());
  }
  
  public void onFrameRendered(@NonNull MediaCodec paramMediaCodec, long paramLong1, long paramLong2)
  {
    paramMediaCodec = this$0;
    if (this != tunnelingOnFrameRenderedListener) {
      return;
    }
    paramMediaCodec.onProcessedTunneledBuffer(paramLong1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.video.MediaCodecVideoRenderer.OnFrameRenderedListenerV23
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */