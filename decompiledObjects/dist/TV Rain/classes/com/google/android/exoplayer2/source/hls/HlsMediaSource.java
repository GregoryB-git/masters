package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.BaseMediaSource;
import com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.DefaultCompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.SinglePeriodTimeline;
import com.google.android.exoplayer2.source.ads.AdsMediaSource.MediaSourceFactory;
import com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistParserFactory;
import com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.Factory;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PrimaryPlaylistListener;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource.Factory;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.ParsingLoadable.Parser;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.List;

public final class HlsMediaSource
  extends BaseMediaSource
  implements HlsPlaylistTracker.PrimaryPlaylistListener
{
  private final boolean allowChunklessPreparation;
  private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
  private final HlsDataSourceFactory dataSourceFactory;
  private final HlsExtractorFactory extractorFactory;
  private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
  private final Uri manifestUri;
  @Nullable
  private TransferListener mediaTransferListener;
  private final HlsPlaylistTracker playlistTracker;
  @Nullable
  private final Object tag;
  
  static
  {
    ExoPlayerLibraryInfo.registerModule("goog.exo.hls");
  }
  
  @Deprecated
  public HlsMediaSource(Uri paramUri, HlsDataSourceFactory paramHlsDataSourceFactory, HlsExtractorFactory paramHlsExtractorFactory, int paramInt, Handler paramHandler, MediaSourceEventListener paramMediaSourceEventListener, ParsingLoadable.Parser<HlsPlaylist> paramParser)
  {
    this(paramUri, paramHlsDataSourceFactory, paramHlsExtractorFactory, new DefaultCompositeSequenceableLoaderFactory(), new DefaultLoadErrorHandlingPolicy(paramInt), new DefaultHlsPlaylistTracker(paramHlsDataSourceFactory, new DefaultLoadErrorHandlingPolicy(paramInt), paramParser), false, null);
    if ((paramHandler != null) && (paramMediaSourceEventListener != null)) {
      addEventListener(paramHandler, paramMediaSourceEventListener);
    }
  }
  
  private HlsMediaSource(Uri paramUri, HlsDataSourceFactory paramHlsDataSourceFactory, HlsExtractorFactory paramHlsExtractorFactory, CompositeSequenceableLoaderFactory paramCompositeSequenceableLoaderFactory, LoadErrorHandlingPolicy paramLoadErrorHandlingPolicy, HlsPlaylistTracker paramHlsPlaylistTracker, boolean paramBoolean, @Nullable Object paramObject)
  {
    manifestUri = paramUri;
    dataSourceFactory = paramHlsDataSourceFactory;
    extractorFactory = paramHlsExtractorFactory;
    compositeSequenceableLoaderFactory = paramCompositeSequenceableLoaderFactory;
    loadErrorHandlingPolicy = paramLoadErrorHandlingPolicy;
    playlistTracker = paramHlsPlaylistTracker;
    allowChunklessPreparation = paramBoolean;
    tag = paramObject;
  }
  
  @Deprecated
  public HlsMediaSource(Uri paramUri, DataSource.Factory paramFactory, int paramInt, Handler paramHandler, MediaSourceEventListener paramMediaSourceEventListener)
  {
    this(paramUri, new DefaultHlsDataSourceFactory(paramFactory), HlsExtractorFactory.DEFAULT, paramInt, paramHandler, paramMediaSourceEventListener, new HlsPlaylistParser());
  }
  
  @Deprecated
  public HlsMediaSource(Uri paramUri, DataSource.Factory paramFactory, Handler paramHandler, MediaSourceEventListener paramMediaSourceEventListener)
  {
    this(paramUri, paramFactory, 3, paramHandler, paramMediaSourceEventListener);
  }
  
  public MediaPeriod createPeriod(MediaSource.MediaPeriodId paramMediaPeriodId, Allocator paramAllocator)
  {
    paramMediaPeriodId = createEventDispatcher(paramMediaPeriodId);
    return new HlsMediaPeriod(extractorFactory, playlistTracker, dataSourceFactory, mediaTransferListener, loadErrorHandlingPolicy, paramMediaPeriodId, paramAllocator, compositeSequenceableLoaderFactory, allowChunklessPreparation);
  }
  
  public void maybeThrowSourceInfoRefreshError()
    throws IOException
  {
    playlistTracker.maybeThrowPrimaryPlaylistRefreshError();
  }
  
  public void onPrimaryPlaylistRefreshed(HlsMediaPlaylist paramHlsMediaPlaylist)
  {
    long l1;
    if (hasProgramDateTime) {
      l1 = C.usToMs(startTimeUs);
    } else {
      l1 = -9223372036854775807L;
    }
    int i = playlistType;
    long l2;
    if ((i != 2) && (i != 1)) {
      l2 = -9223372036854775807L;
    } else {
      l2 = l1;
    }
    long l3 = startOffsetUs;
    long l5;
    Object localObject;
    if (playlistTracker.isLive())
    {
      long l4 = startTimeUs - playlistTracker.getInitialStartTimeUs();
      if (hasEndTag) {
        l5 = l4 + durationUs;
      } else {
        l5 = -9223372036854775807L;
      }
      localObject = segments;
      if (l3 == -9223372036854775807L) {
        if (((List)localObject).isEmpty()) {
          l3 = 0L;
        } else {
          l3 = getmax0size3relativeStartTimeUs;
        }
      }
      localObject = new SinglePeriodTimeline(l2, l1, l5, durationUs, l4, l3, true, hasEndTag ^ true, tag);
    }
    else
    {
      if (l3 == -9223372036854775807L) {
        l3 = 0L;
      }
      l5 = durationUs;
      localObject = new SinglePeriodTimeline(l2, l1, l5, l5, 0L, l3, true, false, tag);
    }
    refreshSourceInfo((Timeline)localObject, new HlsManifest(playlistTracker.getMasterPlaylist(), paramHlsMediaPlaylist));
  }
  
  public void prepareSourceInternal(ExoPlayer paramExoPlayer, boolean paramBoolean, @Nullable TransferListener paramTransferListener)
  {
    mediaTransferListener = paramTransferListener;
    paramExoPlayer = createEventDispatcher(null);
    playlistTracker.start(manifestUri, paramExoPlayer, this);
  }
  
  public void releasePeriod(MediaPeriod paramMediaPeriod)
  {
    ((HlsMediaPeriod)paramMediaPeriod).release();
  }
  
  public void releaseSourceInternal()
  {
    playlistTracker.stop();
  }
  
  public static final class Factory
    implements AdsMediaSource.MediaSourceFactory
  {
    private boolean allowChunklessPreparation;
    private CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private HlsExtractorFactory extractorFactory;
    private final HlsDataSourceFactory hlsDataSourceFactory;
    private boolean isCreateCalled;
    private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private HlsPlaylistParserFactory playlistParserFactory;
    private HlsPlaylistTracker.Factory playlistTrackerFactory;
    @Nullable
    private Object tag;
    
    public Factory(HlsDataSourceFactory paramHlsDataSourceFactory)
    {
      hlsDataSourceFactory = ((HlsDataSourceFactory)Assertions.checkNotNull(paramHlsDataSourceFactory));
      playlistParserFactory = new DefaultHlsPlaylistParserFactory();
      playlistTrackerFactory = DefaultHlsPlaylistTracker.FACTORY;
      extractorFactory = HlsExtractorFactory.DEFAULT;
      loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
      compositeSequenceableLoaderFactory = new DefaultCompositeSequenceableLoaderFactory();
    }
    
    public Factory(DataSource.Factory paramFactory)
    {
      this(new DefaultHlsDataSourceFactory(paramFactory));
    }
    
    public HlsMediaSource createMediaSource(Uri paramUri)
    {
      isCreateCalled = true;
      HlsDataSourceFactory localHlsDataSourceFactory = hlsDataSourceFactory;
      HlsExtractorFactory localHlsExtractorFactory = extractorFactory;
      CompositeSequenceableLoaderFactory localCompositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
      LoadErrorHandlingPolicy localLoadErrorHandlingPolicy = loadErrorHandlingPolicy;
      return new HlsMediaSource(paramUri, localHlsDataSourceFactory, localHlsExtractorFactory, localCompositeSequenceableLoaderFactory, localLoadErrorHandlingPolicy, playlistTrackerFactory.createTracker(localHlsDataSourceFactory, localLoadErrorHandlingPolicy, playlistParserFactory), allowChunklessPreparation, tag, null);
    }
    
    @Deprecated
    public HlsMediaSource createMediaSource(Uri paramUri, @Nullable Handler paramHandler, @Nullable MediaSourceEventListener paramMediaSourceEventListener)
    {
      paramUri = createMediaSource(paramUri);
      if ((paramHandler != null) && (paramMediaSourceEventListener != null)) {
        paramUri.addEventListener(paramHandler, paramMediaSourceEventListener);
      }
      return paramUri;
    }
    
    public int[] getSupportedTypes()
    {
      return new int[] { 2 };
    }
    
    public Factory setAllowChunklessPreparation(boolean paramBoolean)
    {
      Assertions.checkState(isCreateCalled ^ true);
      allowChunklessPreparation = paramBoolean;
      return this;
    }
    
    public Factory setCompositeSequenceableLoaderFactory(CompositeSequenceableLoaderFactory paramCompositeSequenceableLoaderFactory)
    {
      Assertions.checkState(isCreateCalled ^ true);
      compositeSequenceableLoaderFactory = ((CompositeSequenceableLoaderFactory)Assertions.checkNotNull(paramCompositeSequenceableLoaderFactory));
      return this;
    }
    
    public Factory setExtractorFactory(HlsExtractorFactory paramHlsExtractorFactory)
    {
      Assertions.checkState(isCreateCalled ^ true);
      extractorFactory = ((HlsExtractorFactory)Assertions.checkNotNull(paramHlsExtractorFactory));
      return this;
    }
    
    public Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy paramLoadErrorHandlingPolicy)
    {
      Assertions.checkState(isCreateCalled ^ true);
      loadErrorHandlingPolicy = paramLoadErrorHandlingPolicy;
      return this;
    }
    
    @Deprecated
    public Factory setMinLoadableRetryCount(int paramInt)
    {
      Assertions.checkState(isCreateCalled ^ true);
      loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy(paramInt);
      return this;
    }
    
    public Factory setPlaylistParserFactory(HlsPlaylistParserFactory paramHlsPlaylistParserFactory)
    {
      Assertions.checkState(isCreateCalled ^ true);
      playlistParserFactory = ((HlsPlaylistParserFactory)Assertions.checkNotNull(paramHlsPlaylistParserFactory));
      return this;
    }
    
    public Factory setPlaylistTrackerFactory(HlsPlaylistTracker.Factory paramFactory)
    {
      Assertions.checkState(isCreateCalled ^ true);
      playlistTrackerFactory = ((HlsPlaylistTracker.Factory)Assertions.checkNotNull(paramFactory));
      return this;
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
 * Qualified Name:     com.google.android.exoplayer2.source.hls.HlsMediaSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */