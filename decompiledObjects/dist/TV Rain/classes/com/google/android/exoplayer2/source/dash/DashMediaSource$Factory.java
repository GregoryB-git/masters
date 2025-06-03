package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.BaseMediaSource;
import com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.DefaultCompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.ads.AdsMediaSource.MediaSourceFactory;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.DashManifestParser;
import com.google.android.exoplayer2.upstream.DataSource.Factory;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.ParsingLoadable.Parser;
import com.google.android.exoplayer2.util.Assertions;

public final class DashMediaSource$Factory
  implements AdsMediaSource.MediaSourceFactory
{
  private final DashChunkSource.Factory chunkSourceFactory;
  private CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
  private boolean isCreateCalled;
  private long livePresentationDelayMs;
  private boolean livePresentationDelayOverridesManifest;
  private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
  @Nullable
  private final DataSource.Factory manifestDataSourceFactory;
  @Nullable
  private ParsingLoadable.Parser<? extends DashManifest> manifestParser;
  @Nullable
  private Object tag;
  
  public DashMediaSource$Factory(DashChunkSource.Factory paramFactory, @Nullable DataSource.Factory paramFactory1)
  {
    chunkSourceFactory = ((DashChunkSource.Factory)Assertions.checkNotNull(paramFactory));
    manifestDataSourceFactory = paramFactory1;
    loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
    livePresentationDelayMs = 30000L;
    compositeSequenceableLoaderFactory = new DefaultCompositeSequenceableLoaderFactory();
  }
  
  public DashMediaSource$Factory(DataSource.Factory paramFactory)
  {
    this(new DefaultDashChunkSource.Factory(paramFactory), paramFactory);
  }
  
  public DashMediaSource createMediaSource(Uri paramUri)
  {
    isCreateCalled = true;
    if (manifestParser == null) {
      manifestParser = new DashManifestParser();
    }
    return new DashMediaSource(null, (Uri)Assertions.checkNotNull(paramUri), manifestDataSourceFactory, manifestParser, chunkSourceFactory, compositeSequenceableLoaderFactory, loadErrorHandlingPolicy, livePresentationDelayMs, livePresentationDelayOverridesManifest, tag, null);
  }
  
  @Deprecated
  public DashMediaSource createMediaSource(Uri paramUri, @Nullable Handler paramHandler, @Nullable MediaSourceEventListener paramMediaSourceEventListener)
  {
    paramUri = createMediaSource(paramUri);
    if ((paramHandler != null) && (paramMediaSourceEventListener != null)) {
      paramUri.addEventListener(paramHandler, paramMediaSourceEventListener);
    }
    return paramUri;
  }
  
  public DashMediaSource createMediaSource(DashManifest paramDashManifest)
  {
    Assertions.checkArgument(dynamic ^ true);
    isCreateCalled = true;
    return new DashMediaSource(paramDashManifest, null, null, null, chunkSourceFactory, compositeSequenceableLoaderFactory, loadErrorHandlingPolicy, livePresentationDelayMs, livePresentationDelayOverridesManifest, tag, null);
  }
  
  @Deprecated
  public DashMediaSource createMediaSource(DashManifest paramDashManifest, @Nullable Handler paramHandler, @Nullable MediaSourceEventListener paramMediaSourceEventListener)
  {
    paramDashManifest = createMediaSource(paramDashManifest);
    if ((paramHandler != null) && (paramMediaSourceEventListener != null)) {
      paramDashManifest.addEventListener(paramHandler, paramMediaSourceEventListener);
    }
    return paramDashManifest;
  }
  
  public int[] getSupportedTypes()
  {
    return new int[] { 0 };
  }
  
  public Factory setCompositeSequenceableLoaderFactory(CompositeSequenceableLoaderFactory paramCompositeSequenceableLoaderFactory)
  {
    Assertions.checkState(isCreateCalled ^ true);
    compositeSequenceableLoaderFactory = ((CompositeSequenceableLoaderFactory)Assertions.checkNotNull(paramCompositeSequenceableLoaderFactory));
    return this;
  }
  
  @Deprecated
  public Factory setLivePresentationDelayMs(long paramLong)
  {
    if (paramLong == -1L) {
      return setLivePresentationDelayMs(30000L, false);
    }
    return setLivePresentationDelayMs(paramLong, true);
  }
  
  public Factory setLivePresentationDelayMs(long paramLong, boolean paramBoolean)
  {
    Assertions.checkState(isCreateCalled ^ true);
    livePresentationDelayMs = paramLong;
    livePresentationDelayOverridesManifest = paramBoolean;
    return this;
  }
  
  public Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy paramLoadErrorHandlingPolicy)
  {
    Assertions.checkState(isCreateCalled ^ true);
    loadErrorHandlingPolicy = paramLoadErrorHandlingPolicy;
    return this;
  }
  
  public Factory setManifestParser(ParsingLoadable.Parser<? extends DashManifest> paramParser)
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
 * Qualified Name:     com.google.android.exoplayer2.source.dash.DashMediaSource.Factory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */