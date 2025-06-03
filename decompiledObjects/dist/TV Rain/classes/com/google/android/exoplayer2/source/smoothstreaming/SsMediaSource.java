package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.BaseMediaSource;
import com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.DefaultCompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher;
import com.google.android.exoplayer2.source.SinglePeriodTimeline;
import com.google.android.exoplayer2.source.ads.AdsMediaSource.MediaSourceFactory;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest.StreamElement;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsUtil;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSource.Factory;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.Loader.Callback;
import com.google.android.exoplayer2.upstream.Loader.LoadErrorAction;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower.Dummy;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.upstream.ParsingLoadable.Parser;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import h0;
import java.io.IOException;
import java.util.ArrayList;

public final class SsMediaSource
  extends BaseMediaSource
  implements Loader.Callback<ParsingLoadable<SsManifest>>
{
  public static final long DEFAULT_LIVE_PRESENTATION_DELAY_MS = 30000L;
  private static final int MINIMUM_MANIFEST_REFRESH_PERIOD_MS = 5000;
  private static final long MIN_LIVE_DEFAULT_START_POSITION_US = 5000000L;
  private final SsChunkSource.Factory chunkSourceFactory;
  private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
  private final long livePresentationDelayMs;
  private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
  private SsManifest manifest;
  private DataSource manifestDataSource;
  private final DataSource.Factory manifestDataSourceFactory;
  private final MediaSourceEventListener.EventDispatcher manifestEventDispatcher;
  private long manifestLoadStartTimestamp;
  private Loader manifestLoader;
  private LoaderErrorThrower manifestLoaderErrorThrower;
  private final ParsingLoadable.Parser<? extends SsManifest> manifestParser;
  private Handler manifestRefreshHandler;
  private final Uri manifestUri;
  private final ArrayList<SsMediaPeriod> mediaPeriods;
  @Nullable
  private TransferListener mediaTransferListener;
  private final boolean sideloadedManifest;
  @Nullable
  private final Object tag;
  
  static
  {
    ExoPlayerLibraryInfo.registerModule("goog.exo.smoothstreaming");
  }
  
  @Deprecated
  public SsMediaSource(Uri paramUri, DataSource.Factory paramFactory, SsChunkSource.Factory paramFactory1, int paramInt, long paramLong, Handler paramHandler, MediaSourceEventListener paramMediaSourceEventListener)
  {
    this(paramUri, paramFactory, new SsManifestParser(), paramFactory1, paramInt, paramLong, paramHandler, paramMediaSourceEventListener);
  }
  
  @Deprecated
  public SsMediaSource(Uri paramUri, DataSource.Factory paramFactory, SsChunkSource.Factory paramFactory1, Handler paramHandler, MediaSourceEventListener paramMediaSourceEventListener)
  {
    this(paramUri, paramFactory, paramFactory1, 3, 30000L, paramHandler, paramMediaSourceEventListener);
  }
  
  @Deprecated
  public SsMediaSource(Uri paramUri, DataSource.Factory paramFactory, ParsingLoadable.Parser<? extends SsManifest> paramParser, SsChunkSource.Factory paramFactory1, int paramInt, long paramLong, Handler paramHandler, MediaSourceEventListener paramMediaSourceEventListener)
  {
    this(null, paramUri, paramFactory, paramParser, paramFactory1, new DefaultCompositeSequenceableLoaderFactory(), new DefaultLoadErrorHandlingPolicy(paramInt), paramLong, null);
    if ((paramHandler != null) && (paramMediaSourceEventListener != null)) {
      addEventListener(paramHandler, paramMediaSourceEventListener);
    }
  }
  
  private SsMediaSource(SsManifest paramSsManifest, Uri paramUri, DataSource.Factory paramFactory, ParsingLoadable.Parser<? extends SsManifest> paramParser, SsChunkSource.Factory paramFactory1, CompositeSequenceableLoaderFactory paramCompositeSequenceableLoaderFactory, LoadErrorHandlingPolicy paramLoadErrorHandlingPolicy, long paramLong, @Nullable Object paramObject)
  {
    boolean bool1 = false;
    if ((paramSsManifest != null) && (isLive)) {
      bool2 = false;
    } else {
      bool2 = true;
    }
    Assertions.checkState(bool2);
    manifest = paramSsManifest;
    if (paramUri == null) {
      paramUri = null;
    } else {
      paramUri = SsUtil.fixManifestUri(paramUri);
    }
    manifestUri = paramUri;
    manifestDataSourceFactory = paramFactory;
    manifestParser = paramParser;
    chunkSourceFactory = paramFactory1;
    compositeSequenceableLoaderFactory = paramCompositeSequenceableLoaderFactory;
    loadErrorHandlingPolicy = paramLoadErrorHandlingPolicy;
    livePresentationDelayMs = paramLong;
    manifestEventDispatcher = createEventDispatcher(null);
    tag = paramObject;
    boolean bool2 = bool1;
    if (paramSsManifest != null) {
      bool2 = true;
    }
    sideloadedManifest = bool2;
    mediaPeriods = new ArrayList();
  }
  
  @Deprecated
  public SsMediaSource(SsManifest paramSsManifest, SsChunkSource.Factory paramFactory, int paramInt, Handler paramHandler, MediaSourceEventListener paramMediaSourceEventListener)
  {
    this(paramSsManifest, null, null, null, paramFactory, new DefaultCompositeSequenceableLoaderFactory(), new DefaultLoadErrorHandlingPolicy(paramInt), 30000L, null);
    if ((paramHandler != null) && (paramMediaSourceEventListener != null)) {
      addEventListener(paramHandler, paramMediaSourceEventListener);
    }
  }
  
  @Deprecated
  public SsMediaSource(SsManifest paramSsManifest, SsChunkSource.Factory paramFactory, Handler paramHandler, MediaSourceEventListener paramMediaSourceEventListener)
  {
    this(paramSsManifest, paramFactory, 3, paramHandler, paramMediaSourceEventListener);
  }
  
  private void processManifest()
  {
    for (int i = 0; i < mediaPeriods.size(); i++) {
      ((SsMediaPeriod)mediaPeriods.get(i)).updateManifest(manifest);
    }
    long l1 = Long.MIN_VALUE;
    SsManifest.StreamElement[] arrayOfStreamElement = manifest.streamElements;
    int j = arrayOfStreamElement.length;
    i = 0;
    Object localObject;
    long l3;
    long l4;
    for (long l2 = Long.MAX_VALUE; i < j; l2 = l4)
    {
      localObject = arrayOfStreamElement[i];
      l3 = l1;
      l4 = l2;
      if (chunkCount > 0)
      {
        l4 = Math.min(l2, ((SsManifest.StreamElement)localObject).getStartTimeUs(0));
        l2 = ((SsManifest.StreamElement)localObject).getStartTimeUs(chunkCount - 1);
        l3 = Math.max(l1, ((SsManifest.StreamElement)localObject).getChunkDurationUs(chunkCount - 1) + l2);
      }
      i++;
      l1 = l3;
    }
    if (l2 == Long.MAX_VALUE)
    {
      if (manifest.isLive) {
        l2 = -9223372036854775807L;
      } else {
        l2 = 0L;
      }
      localObject = new SinglePeriodTimeline(l2, 0L, 0L, 0L, true, manifest.isLive, tag);
    }
    else
    {
      localObject = manifest;
      if (isLive)
      {
        l3 = dvrWindowLengthUs;
        l4 = l2;
        if (l3 != -9223372036854775807L)
        {
          l4 = l2;
          if (l3 > 0L) {
            l4 = Math.max(l2, l1 - l3);
          }
        }
        l3 = l1 - l4;
        l1 = l3 - C.msToUs(livePresentationDelayMs);
        l2 = l1;
        if (l1 < 5000000L) {
          l2 = Math.min(5000000L, l3 / 2L);
        }
        localObject = new SinglePeriodTimeline(-9223372036854775807L, l3, l4, l2, true, true, tag);
      }
      else
      {
        l4 = durationUs;
        if (l4 != -9223372036854775807L) {
          l1 = l4;
        } else {
          l1 -= l2;
        }
        localObject = new SinglePeriodTimeline(l2 + l1, l1, l2, 0L, true, false, tag);
      }
    }
    refreshSourceInfo((Timeline)localObject, manifest);
  }
  
  private void scheduleManifestRefresh()
  {
    if (!manifest.isLive) {
      return;
    }
    long l = Math.max(0L, manifestLoadStartTimestamp + 5000L - SystemClock.elapsedRealtime());
    manifestRefreshHandler.postDelayed(new h0(this, 4), l);
  }
  
  private void startLoadingManifest()
  {
    ParsingLoadable localParsingLoadable = new ParsingLoadable(manifestDataSource, manifestUri, 4, manifestParser);
    long l = manifestLoader.startLoading(localParsingLoadable, this, loadErrorHandlingPolicy.getMinimumLoadableRetryCount(type));
    manifestEventDispatcher.loadStarted(dataSpec, type, l);
  }
  
  public MediaPeriod createPeriod(MediaSource.MediaPeriodId paramMediaPeriodId, Allocator paramAllocator)
  {
    paramMediaPeriodId = createEventDispatcher(paramMediaPeriodId);
    paramMediaPeriodId = new SsMediaPeriod(manifest, chunkSourceFactory, mediaTransferListener, compositeSequenceableLoaderFactory, loadErrorHandlingPolicy, paramMediaPeriodId, manifestLoaderErrorThrower, paramAllocator);
    mediaPeriods.add(paramMediaPeriodId);
    return paramMediaPeriodId;
  }
  
  public void maybeThrowSourceInfoRefreshError()
    throws IOException
  {
    manifestLoaderErrorThrower.maybeThrowError();
  }
  
  public void onLoadCanceled(ParsingLoadable<SsManifest> paramParsingLoadable, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    manifestEventDispatcher.loadCanceled(dataSpec, paramParsingLoadable.getUri(), paramParsingLoadable.getResponseHeaders(), type, paramLong1, paramLong2, paramParsingLoadable.bytesLoaded());
  }
  
  public void onLoadCompleted(ParsingLoadable<SsManifest> paramParsingLoadable, long paramLong1, long paramLong2)
  {
    manifestEventDispatcher.loadCompleted(dataSpec, paramParsingLoadable.getUri(), paramParsingLoadable.getResponseHeaders(), type, paramLong1, paramLong2, paramParsingLoadable.bytesLoaded());
    manifest = ((SsManifest)paramParsingLoadable.getResult());
    manifestLoadStartTimestamp = (paramLong1 - paramLong2);
    processManifest();
    scheduleManifestRefresh();
  }
  
  public Loader.LoadErrorAction onLoadError(ParsingLoadable<SsManifest> paramParsingLoadable, long paramLong1, long paramLong2, IOException paramIOException, int paramInt)
  {
    boolean bool = paramIOException instanceof ParserException;
    manifestEventDispatcher.loadError(dataSpec, paramParsingLoadable.getUri(), paramParsingLoadable.getResponseHeaders(), type, paramLong1, paramLong2, paramParsingLoadable.bytesLoaded(), paramIOException, bool);
    if (bool) {
      paramParsingLoadable = Loader.DONT_RETRY_FATAL;
    } else {
      paramParsingLoadable = Loader.RETRY;
    }
    return paramParsingLoadable;
  }
  
  public void prepareSourceInternal(ExoPlayer paramExoPlayer, boolean paramBoolean, @Nullable TransferListener paramTransferListener)
  {
    mediaTransferListener = paramTransferListener;
    if (sideloadedManifest)
    {
      manifestLoaderErrorThrower = new LoaderErrorThrower.Dummy();
      processManifest();
    }
    else
    {
      manifestDataSource = manifestDataSourceFactory.createDataSource();
      paramExoPlayer = new Loader("Loader:Manifest");
      manifestLoader = paramExoPlayer;
      manifestLoaderErrorThrower = paramExoPlayer;
      manifestRefreshHandler = new Handler();
      startLoadingManifest();
    }
  }
  
  public void releasePeriod(MediaPeriod paramMediaPeriod)
  {
    ((SsMediaPeriod)paramMediaPeriod).release();
    mediaPeriods.remove(paramMediaPeriod);
  }
  
  public void releaseSourceInternal()
  {
    if (sideloadedManifest) {
      localObject = manifest;
    } else {
      localObject = null;
    }
    manifest = ((SsManifest)localObject);
    manifestDataSource = null;
    manifestLoadStartTimestamp = 0L;
    Object localObject = manifestLoader;
    if (localObject != null)
    {
      ((Loader)localObject).release();
      manifestLoader = null;
    }
    localObject = manifestRefreshHandler;
    if (localObject != null)
    {
      ((Handler)localObject).removeCallbacksAndMessages(null);
      manifestRefreshHandler = null;
    }
  }
  
  public static final class Factory
    implements AdsMediaSource.MediaSourceFactory
  {
    private final SsChunkSource.Factory chunkSourceFactory;
    private CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private boolean isCreateCalled;
    private long livePresentationDelayMs;
    private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    @Nullable
    private final DataSource.Factory manifestDataSourceFactory;
    @Nullable
    private ParsingLoadable.Parser<? extends SsManifest> manifestParser;
    @Nullable
    private Object tag;
    
    public Factory(SsChunkSource.Factory paramFactory, @Nullable DataSource.Factory paramFactory1)
    {
      chunkSourceFactory = ((SsChunkSource.Factory)Assertions.checkNotNull(paramFactory));
      manifestDataSourceFactory = paramFactory1;
      loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
      livePresentationDelayMs = 30000L;
      compositeSequenceableLoaderFactory = new DefaultCompositeSequenceableLoaderFactory();
    }
    
    public Factory(DataSource.Factory paramFactory)
    {
      this(new DefaultSsChunkSource.Factory(paramFactory), paramFactory);
    }
    
    public SsMediaSource createMediaSource(Uri paramUri)
    {
      isCreateCalled = true;
      if (manifestParser == null) {
        manifestParser = new SsManifestParser();
      }
      return new SsMediaSource(null, (Uri)Assertions.checkNotNull(paramUri), manifestDataSourceFactory, manifestParser, chunkSourceFactory, compositeSequenceableLoaderFactory, loadErrorHandlingPolicy, livePresentationDelayMs, tag, null);
    }
    
    @Deprecated
    public SsMediaSource createMediaSource(Uri paramUri, @Nullable Handler paramHandler, @Nullable MediaSourceEventListener paramMediaSourceEventListener)
    {
      paramUri = createMediaSource(paramUri);
      if ((paramHandler != null) && (paramMediaSourceEventListener != null)) {
        paramUri.addEventListener(paramHandler, paramMediaSourceEventListener);
      }
      return paramUri;
    }
    
    public SsMediaSource createMediaSource(SsManifest paramSsManifest)
    {
      Assertions.checkArgument(isLive ^ true);
      isCreateCalled = true;
      return new SsMediaSource(paramSsManifest, null, null, null, chunkSourceFactory, compositeSequenceableLoaderFactory, loadErrorHandlingPolicy, livePresentationDelayMs, tag, null);
    }
    
    @Deprecated
    public SsMediaSource createMediaSource(SsManifest paramSsManifest, @Nullable Handler paramHandler, @Nullable MediaSourceEventListener paramMediaSourceEventListener)
    {
      paramSsManifest = createMediaSource(paramSsManifest);
      if ((paramHandler != null) && (paramMediaSourceEventListener != null)) {
        paramSsManifest.addEventListener(paramHandler, paramMediaSourceEventListener);
      }
      return paramSsManifest;
    }
    
    public int[] getSupportedTypes()
    {
      return new int[] { 1 };
    }
    
    public Factory setCompositeSequenceableLoaderFactory(CompositeSequenceableLoaderFactory paramCompositeSequenceableLoaderFactory)
    {
      Assertions.checkState(isCreateCalled ^ true);
      compositeSequenceableLoaderFactory = ((CompositeSequenceableLoaderFactory)Assertions.checkNotNull(paramCompositeSequenceableLoaderFactory));
      return this;
    }
    
    public Factory setLivePresentationDelayMs(long paramLong)
    {
      Assertions.checkState(isCreateCalled ^ true);
      livePresentationDelayMs = paramLong;
      return this;
    }
    
    public Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy paramLoadErrorHandlingPolicy)
    {
      Assertions.checkState(isCreateCalled ^ true);
      loadErrorHandlingPolicy = paramLoadErrorHandlingPolicy;
      return this;
    }
    
    public Factory setManifestParser(ParsingLoadable.Parser<? extends SsManifest> paramParser)
    {
      Assertions.checkState(isCreateCalled ^ true);
      manifestParser = ((ParsingLoadable.Parser)Assertions.checkNotNull(paramParser));
      return this;
    }
    
    @Deprecated
    public Factory setMinLoadableRetryCount(int paramInt)
    {
      return setLoadErrorHandlingPolicy(new DefaultLoadErrorHandlingPolicy(paramInt));
    }
    
    public Factory setTag(Object paramObject)
    {
      Assertions.checkState(isCreateCalled ^ true);
      tag = paramObject;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */