package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.BaseMediaSource;
import com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.DefaultCompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.ads.AdsMediaSource.MediaSourceFactory;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser;
import com.google.android.exoplayer2.upstream.DataSource.Factory;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.ParsingLoadable.Parser;
import com.google.android.exoplayer2.util.Assertions;

public final class SsMediaSource$Factory
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
  
  public SsMediaSource$Factory(SsChunkSource.Factory paramFactory, @Nullable DataSource.Factory paramFactory1)
  {
    chunkSourceFactory = ((SsChunkSource.Factory)Assertions.checkNotNull(paramFactory));
    manifestDataSourceFactory = paramFactory1;
    loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
    livePresentationDelayMs = 30000L;
    compositeSequenceableLoaderFactory = new DefaultCompositeSequenceableLoaderFactory();
  }
  
  public SsMediaSource$Factory(DataSource.Factory paramFactory)
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

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource.Factory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */