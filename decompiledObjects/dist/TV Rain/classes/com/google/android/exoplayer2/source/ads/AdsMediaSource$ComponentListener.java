package com.google.android.exoplayer2.source.ads;

import android.os.Handler;
import com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.util.Collections;

final class AdsMediaSource$ComponentListener
  implements AdsLoader.EventListener
{
  private final Handler playerHandler = new Handler();
  private volatile boolean released;
  
  public AdsMediaSource$ComponentListener(AdsMediaSource paramAdsMediaSource) {}
  
  public void onAdClicked()
  {
    if (released) {
      return;
    }
    if ((AdsMediaSource.access$000(this$0) != null) && (AdsMediaSource.access$100(this$0) != null)) {
      AdsMediaSource.access$000(this$0).post(new c(this, 1));
    }
  }
  
  public void onAdLoadError(AdsMediaSource.AdLoadException paramAdLoadException, DataSpec paramDataSpec)
  {
    if (released) {
      return;
    }
    AdsMediaSource.access$200(this$0, null).loadError(paramDataSpec, uri, Collections.emptyMap(), 6, -1L, 0L, 0L, paramAdLoadException, true);
    if ((AdsMediaSource.access$000(this$0) != null) && (AdsMediaSource.access$100(this$0) != null)) {
      AdsMediaSource.access$000(this$0).post(new b(this, paramAdLoadException, 1));
    }
  }
  
  public void onAdPlaybackState(AdPlaybackState paramAdPlaybackState)
  {
    if (released) {
      return;
    }
    playerHandler.post(new b(this, paramAdPlaybackState, 2));
  }
  
  public void onAdTapped()
  {
    if (released) {
      return;
    }
    if ((AdsMediaSource.access$000(this$0) != null) && (AdsMediaSource.access$100(this$0) != null)) {
      AdsMediaSource.access$000(this$0).post(new c(this, 0));
    }
  }
  
  public void release()
  {
    released = true;
    playerHandler.removeCallbacksAndMessages(null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.ads.AdsMediaSource.ComponentListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */