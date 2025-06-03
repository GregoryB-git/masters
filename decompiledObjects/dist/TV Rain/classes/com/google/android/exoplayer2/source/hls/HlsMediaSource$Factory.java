package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.BaseMediaSource;
import com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.DefaultCompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.ads.AdsMediaSource.MediaSourceFactory;
import com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistParserFactory;
import com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.Factory;
import com.google.android.exoplayer2.upstream.DataSource.Factory;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.util.Assertions;

public final class HlsMediaSource$Factory
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
  
  public HlsMediaSource$Factory(HlsDataSourceFactory paramHlsDataSourceFactory)
  {
    hlsDataSourceFactory = ((HlsDataSourceFactory)Assertions.checkNotNull(paramHlsDataSourceFactory));
    playlistParserFactory = new DefaultHlsPlaylistParserFactory();
    playlistTrackerFactory = DefaultHlsPlaylistTracker.FACTORY;
    extractorFactory = HlsExtractorFactory.DEFAULT;
    loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
    compositeSequenceableLoaderFactory = new DefaultCompositeSequenceableLoaderFactory();
  }
  
  public HlsMediaSource$Factory(DataSource.Factory paramFactory)
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

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.HlsMediaSource.Factory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */