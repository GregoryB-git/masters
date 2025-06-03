package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.source.DeferredMediaPeriod.PrepareErrorListener;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;
import java.util.Collections;

final class AdsMediaSource$AdPrepareErrorListener
  implements DeferredMediaPeriod.PrepareErrorListener
{
  private final int adGroupIndex;
  private final int adIndexInAdGroup;
  private final Uri adUri;
  
  public AdsMediaSource$AdPrepareErrorListener(AdsMediaSource paramAdsMediaSource, Uri paramUri, int paramInt1, int paramInt2)
  {
    adUri = paramUri;
    adGroupIndex = paramInt1;
    adIndexInAdGroup = paramInt2;
  }
  
  public void onPrepareError(MediaSource.MediaPeriodId paramMediaPeriodId, IOException paramIOException)
  {
    AdsMediaSource.access$400(this$0, paramMediaPeriodId).loadError(new DataSpec(adUri), adUri, Collections.emptyMap(), 6, -1L, 0L, 0L, AdsMediaSource.AdLoadException.createForAd(paramIOException), true);
    AdsMediaSource.access$500(this$0).post(new b(this, paramIOException, 0));
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.ads.AdsMediaSource.AdPrepareErrorListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */