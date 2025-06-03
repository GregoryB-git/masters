package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Timeline.Period;
import com.google.android.exoplayer2.source.BaseMediaSource;
import com.google.android.exoplayer2.source.CompositeMediaSource;
import com.google.android.exoplayer2.source.DeferredMediaPeriod;
import com.google.android.exoplayer2.source.DeferredMediaPeriod.PrepareErrorListener;
import com.google.android.exoplayer2.source.ExtractorMediaSource.Factory;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource.Factory;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class AdsMediaSource
  extends CompositeMediaSource<MediaSource.MediaPeriodId>
{
  private static final MediaSource.MediaPeriodId DUMMY_CONTENT_MEDIA_PERIOD_ID = new MediaSource.MediaPeriodId(new Object());
  private MediaSource[][] adGroupMediaSources;
  private Timeline[][] adGroupTimelines;
  private final MediaSourceFactory adMediaSourceFactory;
  private AdPlaybackState adPlaybackState;
  private final ViewGroup adUiViewGroup;
  private final AdsLoader adsLoader;
  private ComponentListener componentListener;
  private Object contentManifest;
  private final MediaSource contentMediaSource;
  private Timeline contentTimeline;
  private final Map<MediaSource, List<DeferredMediaPeriod>> deferredMediaPeriodByAdMediaSource;
  @Nullable
  private final Handler eventHandler;
  @Nullable
  private final EventListener eventListener;
  private final Handler mainHandler;
  private final Timeline.Period period;
  
  public AdsMediaSource(MediaSource paramMediaSource, MediaSourceFactory paramMediaSourceFactory, AdsLoader paramAdsLoader, ViewGroup paramViewGroup)
  {
    this(paramMediaSource, paramMediaSourceFactory, paramAdsLoader, paramViewGroup, null, null);
  }
  
  @Deprecated
  public AdsMediaSource(MediaSource paramMediaSource, MediaSourceFactory paramMediaSourceFactory, AdsLoader paramAdsLoader, ViewGroup paramViewGroup, @Nullable Handler paramHandler, @Nullable EventListener paramEventListener)
  {
    contentMediaSource = paramMediaSource;
    adMediaSourceFactory = paramMediaSourceFactory;
    adsLoader = paramAdsLoader;
    adUiViewGroup = paramViewGroup;
    eventHandler = paramHandler;
    eventListener = paramEventListener;
    mainHandler = new Handler(Looper.getMainLooper());
    deferredMediaPeriodByAdMediaSource = new HashMap();
    period = new Timeline.Period();
    adGroupMediaSources = new MediaSource[0][];
    adGroupTimelines = new Timeline[0][];
    paramAdsLoader.setSupportedContentTypes(paramMediaSourceFactory.getSupportedTypes());
  }
  
  public AdsMediaSource(MediaSource paramMediaSource, DataSource.Factory paramFactory, AdsLoader paramAdsLoader, ViewGroup paramViewGroup)
  {
    this(paramMediaSource, new ExtractorMediaSource.Factory(paramFactory), paramAdsLoader, paramViewGroup, null, null);
  }
  
  @Deprecated
  public AdsMediaSource(MediaSource paramMediaSource, DataSource.Factory paramFactory, AdsLoader paramAdsLoader, ViewGroup paramViewGroup, @Nullable Handler paramHandler, @Nullable EventListener paramEventListener)
  {
    this(paramMediaSource, new ExtractorMediaSource.Factory(paramFactory), paramAdsLoader, paramViewGroup, paramHandler, paramEventListener);
  }
  
  private static long[][] getAdDurations(Timeline[][] paramArrayOfTimeline, Timeline.Period paramPeriod)
  {
    long[][] arrayOfLong = new long[paramArrayOfTimeline.length][];
    for (int i = 0; i < paramArrayOfTimeline.length; i++)
    {
      arrayOfLong[i] = new long[paramArrayOfTimeline[i].length];
      for (int j = 0;; j++)
      {
        Object localObject = paramArrayOfTimeline[i];
        if (j >= localObject.length) {
          break;
        }
        long[] arrayOfLong1 = arrayOfLong[i];
        localObject = localObject[j];
        long l;
        if (localObject == null) {
          l = -9223372036854775807L;
        } else {
          l = ((Timeline)localObject).getPeriod(0, paramPeriod).getDurationUs();
        }
        arrayOfLong1[j] = l;
      }
    }
    return arrayOfLong;
  }
  
  private void maybeUpdateSourceInfo()
  {
    Object localObject = adPlaybackState;
    if ((localObject != null) && (contentTimeline != null))
    {
      localObject = ((AdPlaybackState)localObject).withAdDurationsUs(getAdDurations(adGroupTimelines, period));
      adPlaybackState = ((AdPlaybackState)localObject);
      if (adGroupCount == 0) {
        localObject = contentTimeline;
      } else {
        localObject = new SinglePeriodAdTimeline(contentTimeline, adPlaybackState);
      }
      refreshSourceInfo((Timeline)localObject, contentManifest);
    }
  }
  
  private void onAdPlaybackState(AdPlaybackState paramAdPlaybackState)
  {
    if (adPlaybackState == null)
    {
      Object localObject = new MediaSource[adGroupCount][];
      adGroupMediaSources = ((MediaSource[][])localObject);
      Arrays.fill((Object[])localObject, new MediaSource[0]);
      localObject = new Timeline[adGroupCount][];
      adGroupTimelines = ((Timeline[][])localObject);
      Arrays.fill((Object[])localObject, new Timeline[0]);
    }
    adPlaybackState = paramAdPlaybackState;
    maybeUpdateSourceInfo();
  }
  
  private void onAdSourceInfoRefreshed(MediaSource paramMediaSource, int paramInt1, int paramInt2, Timeline paramTimeline)
  {
    int i = paramTimeline.getPeriodCount();
    int j = 0;
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    Assertions.checkArgument(bool);
    adGroupTimelines[paramInt1][paramInt2] = paramTimeline;
    paramMediaSource = (List)deferredMediaPeriodByAdMediaSource.remove(paramMediaSource);
    if (paramMediaSource != null)
    {
      paramTimeline = paramTimeline.getUidOfPeriod(0);
      for (paramInt1 = j; paramInt1 < paramMediaSource.size(); paramInt1++)
      {
        DeferredMediaPeriod localDeferredMediaPeriod = (DeferredMediaPeriod)paramMediaSource.get(paramInt1);
        localDeferredMediaPeriod.createPeriod(new MediaSource.MediaPeriodId(paramTimeline, id.windowSequenceNumber));
      }
    }
    maybeUpdateSourceInfo();
  }
  
  private void onContentSourceInfoRefreshed(Timeline paramTimeline, Object paramObject)
  {
    contentTimeline = paramTimeline;
    contentManifest = paramObject;
    maybeUpdateSourceInfo();
  }
  
  public MediaPeriod createPeriod(MediaSource.MediaPeriodId paramMediaPeriodId, Allocator paramAllocator)
  {
    if ((adPlaybackState.adGroupCount > 0) && (paramMediaPeriodId.isAd()))
    {
      int i = adGroupIndex;
      int j = adIndexInAdGroup;
      Object localObject1 = adPlaybackState.adGroups[i].uris[j];
      if (adGroupMediaSources[i].length <= j)
      {
        localMediaSource = adMediaSourceFactory.createMediaSource((Uri)localObject1);
        Object localObject2 = adGroupMediaSources;
        Object[] arrayOfObject = localObject2[i];
        if (j >= arrayOfObject.length)
        {
          int k = j + 1;
          localObject2[i] = ((MediaSource[])Arrays.copyOf(arrayOfObject, k));
          localObject2 = adGroupTimelines;
          localObject2[i] = ((Timeline[])Arrays.copyOf(localObject2[i], k));
        }
        adGroupMediaSources[i][j] = localMediaSource;
        deferredMediaPeriodByAdMediaSource.put(localMediaSource, new ArrayList());
        prepareChildSource(paramMediaPeriodId, localMediaSource);
      }
      MediaSource localMediaSource = adGroupMediaSources[i][j];
      paramAllocator = new DeferredMediaPeriod(localMediaSource, paramMediaPeriodId, paramAllocator);
      paramAllocator.setPrepareErrorListener(new AdPrepareErrorListener((Uri)localObject1, i, j));
      localObject1 = (List)deferredMediaPeriodByAdMediaSource.get(localMediaSource);
      if (localObject1 == null) {
        paramAllocator.createPeriod(new MediaSource.MediaPeriodId(adGroupTimelines[i][j].getUidOfPeriod(0), windowSequenceNumber));
      } else {
        ((List)localObject1).add(paramAllocator);
      }
      return paramAllocator;
    }
    paramAllocator = new DeferredMediaPeriod(contentMediaSource, paramMediaPeriodId, paramAllocator);
    paramAllocator.createPeriod(paramMediaPeriodId);
    return paramAllocator;
  }
  
  @Nullable
  public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSource.MediaPeriodId paramMediaPeriodId1, MediaSource.MediaPeriodId paramMediaPeriodId2)
  {
    if (!paramMediaPeriodId1.isAd()) {
      paramMediaPeriodId1 = paramMediaPeriodId2;
    }
    return paramMediaPeriodId1;
  }
  
  public void onChildSourceInfoRefreshed(MediaSource.MediaPeriodId paramMediaPeriodId, MediaSource paramMediaSource, Timeline paramTimeline, @Nullable Object paramObject)
  {
    if (paramMediaPeriodId.isAd()) {
      onAdSourceInfoRefreshed(paramMediaSource, adGroupIndex, adIndexInAdGroup, paramTimeline);
    } else {
      onContentSourceInfoRefreshed(paramTimeline, paramObject);
    }
  }
  
  public void prepareSourceInternal(ExoPlayer paramExoPlayer, boolean paramBoolean, @Nullable TransferListener paramTransferListener)
  {
    super.prepareSourceInternal(paramExoPlayer, paramBoolean, paramTransferListener);
    Assertions.checkArgument(paramBoolean, "AdsMediaSource must be the top-level source used to prepare the player.");
    paramTransferListener = new ComponentListener();
    componentListener = paramTransferListener;
    prepareChildSource(DUMMY_CONTENT_MEDIA_PERIOD_ID, contentMediaSource);
    mainHandler.post(new a(this, paramExoPlayer, paramTransferListener));
  }
  
  public void releasePeriod(MediaPeriod paramMediaPeriod)
  {
    DeferredMediaPeriod localDeferredMediaPeriod = (DeferredMediaPeriod)paramMediaPeriod;
    paramMediaPeriod = (List)deferredMediaPeriodByAdMediaSource.get(mediaSource);
    if (paramMediaPeriod != null) {
      paramMediaPeriod.remove(localDeferredMediaPeriod);
    }
    localDeferredMediaPeriod.releasePeriod();
  }
  
  public void releaseSourceInternal()
  {
    super.releaseSourceInternal();
    componentListener.release();
    componentListener = null;
    deferredMediaPeriodByAdMediaSource.clear();
    contentTimeline = null;
    contentManifest = null;
    adPlaybackState = null;
    adGroupMediaSources = new MediaSource[0][];
    adGroupTimelines = new Timeline[0][];
    Handler localHandler = mainHandler;
    AdsLoader localAdsLoader = adsLoader;
    localAdsLoader.getClass();
    localHandler.post(new c(localAdsLoader, 2));
  }
  
  public static final class AdLoadException
    extends IOException
  {
    public static final int TYPE_AD = 0;
    public static final int TYPE_AD_GROUP = 1;
    public static final int TYPE_ALL_ADS = 2;
    public static final int TYPE_UNEXPECTED = 3;
    public final int type;
    
    private AdLoadException(int paramInt, Exception paramException)
    {
      super();
      type = paramInt;
    }
    
    public static AdLoadException createForAd(Exception paramException)
    {
      return new AdLoadException(0, paramException);
    }
    
    public static AdLoadException createForAdGroup(Exception paramException, int paramInt)
    {
      return new AdLoadException(1, new IOException(a.f("Failed to load ad group ", paramInt), paramException));
    }
    
    public static AdLoadException createForAllAds(Exception paramException)
    {
      return new AdLoadException(2, paramException);
    }
    
    public static AdLoadException createForUnexpected(RuntimeException paramRuntimeException)
    {
      return new AdLoadException(3, paramRuntimeException);
    }
    
    public RuntimeException getRuntimeExceptionForUnexpected()
    {
      boolean bool;
      if (type == 3) {
        bool = true;
      } else {
        bool = false;
      }
      Assertions.checkState(bool);
      return (RuntimeException)getCause();
    }
    
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public static @interface Type {}
  }
  
  public final class AdPrepareErrorListener
    implements DeferredMediaPeriod.PrepareErrorListener
  {
    private final int adGroupIndex;
    private final int adIndexInAdGroup;
    private final Uri adUri;
    
    public AdPrepareErrorListener(Uri paramUri, int paramInt1, int paramInt2)
    {
      adUri = paramUri;
      adGroupIndex = paramInt1;
      adIndexInAdGroup = paramInt2;
    }
    
    public void onPrepareError(MediaSource.MediaPeriodId paramMediaPeriodId, IOException paramIOException)
    {
      AdsMediaSource.access$400(AdsMediaSource.this, paramMediaPeriodId).loadError(new DataSpec(adUri), adUri, Collections.emptyMap(), 6, -1L, 0L, 0L, AdsMediaSource.AdLoadException.createForAd(paramIOException), true);
      AdsMediaSource.access$500(AdsMediaSource.this).post(new b(this, paramIOException, 0));
    }
  }
  
  public final class ComponentListener
    implements AdsLoader.EventListener
  {
    private final Handler playerHandler = new Handler();
    private volatile boolean released;
    
    public ComponentListener() {}
    
    public void onAdClicked()
    {
      if (released) {
        return;
      }
      if ((AdsMediaSource.access$000(AdsMediaSource.this) != null) && (AdsMediaSource.access$100(AdsMediaSource.this) != null)) {
        AdsMediaSource.access$000(AdsMediaSource.this).post(new c(this, 1));
      }
    }
    
    public void onAdLoadError(AdsMediaSource.AdLoadException paramAdLoadException, DataSpec paramDataSpec)
    {
      if (released) {
        return;
      }
      AdsMediaSource.access$200(AdsMediaSource.this, null).loadError(paramDataSpec, uri, Collections.emptyMap(), 6, -1L, 0L, 0L, paramAdLoadException, true);
      if ((AdsMediaSource.access$000(AdsMediaSource.this) != null) && (AdsMediaSource.access$100(AdsMediaSource.this) != null)) {
        AdsMediaSource.access$000(AdsMediaSource.this).post(new b(this, paramAdLoadException, 1));
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
      if ((AdsMediaSource.access$000(AdsMediaSource.this) != null) && (AdsMediaSource.access$100(AdsMediaSource.this) != null)) {
        AdsMediaSource.access$000(AdsMediaSource.this).post(new c(this, 0));
      }
    }
    
    public void release()
    {
      released = true;
      playerHandler.removeCallbacksAndMessages(null);
    }
  }
  
  @Deprecated
  public static abstract interface EventListener
  {
    public abstract void onAdClicked();
    
    public abstract void onAdLoadError(IOException paramIOException);
    
    public abstract void onAdTapped();
    
    public abstract void onInternalAdLoadError(RuntimeException paramRuntimeException);
  }
  
  public static abstract interface MediaSourceFactory
  {
    public abstract MediaSource createMediaSource(Uri paramUri);
    
    public abstract int[] getSupportedTypes();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.ads.AdsMediaSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */