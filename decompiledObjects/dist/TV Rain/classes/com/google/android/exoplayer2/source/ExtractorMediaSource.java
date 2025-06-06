package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.source.ads.AdsMediaSource.MediaSourceFactory;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSource.Factory;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;

public final class ExtractorMediaSource
  extends BaseMediaSource
  implements ExtractorMediaPeriod.Listener
{
  public static final int DEFAULT_LOADING_CHECK_INTERVAL_BYTES = 1048576;
  private final int continueLoadingCheckIntervalBytes;
  private final String customCacheKey;
  private final DataSource.Factory dataSourceFactory;
  private final ExtractorsFactory extractorsFactory;
  private final LoadErrorHandlingPolicy loadableLoadErrorHandlingPolicy;
  @Nullable
  private final Object tag;
  private long timelineDurationUs;
  private boolean timelineIsSeekable;
  @Nullable
  private TransferListener transferListener;
  private final Uri uri;
  
  @Deprecated
  public ExtractorMediaSource(Uri paramUri, DataSource.Factory paramFactory, ExtractorsFactory paramExtractorsFactory, Handler paramHandler, EventListener paramEventListener)
  {
    this(paramUri, paramFactory, paramExtractorsFactory, paramHandler, paramEventListener, null);
  }
  
  @Deprecated
  public ExtractorMediaSource(Uri paramUri, DataSource.Factory paramFactory, ExtractorsFactory paramExtractorsFactory, Handler paramHandler, EventListener paramEventListener, String paramString)
  {
    this(paramUri, paramFactory, paramExtractorsFactory, paramHandler, paramEventListener, paramString, 1048576);
  }
  
  @Deprecated
  public ExtractorMediaSource(Uri paramUri, DataSource.Factory paramFactory, ExtractorsFactory paramExtractorsFactory, Handler paramHandler, EventListener paramEventListener, String paramString, int paramInt)
  {
    this(paramUri, paramFactory, paramExtractorsFactory, new DefaultLoadErrorHandlingPolicy(), paramString, paramInt, null);
    if ((paramEventListener != null) && (paramHandler != null)) {
      addEventListener(paramHandler, new EventListenerWrapper(paramEventListener));
    }
  }
  
  private ExtractorMediaSource(Uri paramUri, DataSource.Factory paramFactory, ExtractorsFactory paramExtractorsFactory, LoadErrorHandlingPolicy paramLoadErrorHandlingPolicy, @Nullable String paramString, int paramInt, @Nullable Object paramObject)
  {
    uri = paramUri;
    dataSourceFactory = paramFactory;
    extractorsFactory = paramExtractorsFactory;
    loadableLoadErrorHandlingPolicy = paramLoadErrorHandlingPolicy;
    customCacheKey = paramString;
    continueLoadingCheckIntervalBytes = paramInt;
    timelineDurationUs = -9223372036854775807L;
    tag = paramObject;
  }
  
  private void notifySourceInfoRefreshed(long paramLong, boolean paramBoolean)
  {
    timelineDurationUs = paramLong;
    timelineIsSeekable = paramBoolean;
    refreshSourceInfo(new SinglePeriodTimeline(timelineDurationUs, timelineIsSeekable, false, tag), null);
  }
  
  public MediaPeriod createPeriod(MediaSource.MediaPeriodId paramMediaPeriodId, Allocator paramAllocator)
  {
    DataSource localDataSource = dataSourceFactory.createDataSource();
    TransferListener localTransferListener = transferListener;
    if (localTransferListener != null) {
      localDataSource.addTransferListener(localTransferListener);
    }
    return new ExtractorMediaPeriod(uri, localDataSource, extractorsFactory.createExtractors(), loadableLoadErrorHandlingPolicy, createEventDispatcher(paramMediaPeriodId), this, paramAllocator, customCacheKey, continueLoadingCheckIntervalBytes);
  }
  
  public void maybeThrowSourceInfoRefreshError()
    throws IOException
  {}
  
  public void onSourceInfoRefreshed(long paramLong, boolean paramBoolean)
  {
    long l = paramLong;
    if (paramLong == -9223372036854775807L) {
      l = timelineDurationUs;
    }
    if ((timelineDurationUs == l) && (timelineIsSeekable == paramBoolean)) {
      return;
    }
    notifySourceInfoRefreshed(l, paramBoolean);
  }
  
  public void prepareSourceInternal(ExoPlayer paramExoPlayer, boolean paramBoolean, @Nullable TransferListener paramTransferListener)
  {
    transferListener = paramTransferListener;
    notifySourceInfoRefreshed(timelineDurationUs, false);
  }
  
  public void releasePeriod(MediaPeriod paramMediaPeriod)
  {
    ((ExtractorMediaPeriod)paramMediaPeriod).release();
  }
  
  public void releaseSourceInternal() {}
  
  @Deprecated
  public static abstract interface EventListener
  {
    public abstract void onLoadError(IOException paramIOException);
  }
  
  @Deprecated
  public static final class EventListenerWrapper
    extends DefaultMediaSourceEventListener
  {
    private final ExtractorMediaSource.EventListener eventListener;
    
    public EventListenerWrapper(ExtractorMediaSource.EventListener paramEventListener)
    {
      eventListener = ((ExtractorMediaSource.EventListener)Assertions.checkNotNull(paramEventListener));
    }
    
    public void onLoadError(int paramInt, @Nullable MediaSource.MediaPeriodId paramMediaPeriodId, MediaSourceEventListener.LoadEventInfo paramLoadEventInfo, MediaSourceEventListener.MediaLoadData paramMediaLoadData, IOException paramIOException, boolean paramBoolean)
    {
      eventListener.onLoadError(paramIOException);
    }
  }
  
  public static final class Factory
    implements AdsMediaSource.MediaSourceFactory
  {
    private int continueLoadingCheckIntervalBytes;
    @Nullable
    private String customCacheKey;
    private final DataSource.Factory dataSourceFactory;
    @Nullable
    private ExtractorsFactory extractorsFactory;
    private boolean isCreateCalled;
    private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    @Nullable
    private Object tag;
    
    public Factory(DataSource.Factory paramFactory)
    {
      dataSourceFactory = paramFactory;
      loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
      continueLoadingCheckIntervalBytes = 1048576;
    }
    
    public ExtractorMediaSource createMediaSource(Uri paramUri)
    {
      isCreateCalled = true;
      if (extractorsFactory == null) {
        extractorsFactory = new DefaultExtractorsFactory();
      }
      return new ExtractorMediaSource(paramUri, dataSourceFactory, extractorsFactory, loadErrorHandlingPolicy, customCacheKey, continueLoadingCheckIntervalBytes, tag, null);
    }
    
    @Deprecated
    public ExtractorMediaSource createMediaSource(Uri paramUri, @Nullable Handler paramHandler, @Nullable MediaSourceEventListener paramMediaSourceEventListener)
    {
      paramUri = createMediaSource(paramUri);
      if ((paramHandler != null) && (paramMediaSourceEventListener != null)) {
        paramUri.addEventListener(paramHandler, paramMediaSourceEventListener);
      }
      return paramUri;
    }
    
    public int[] getSupportedTypes()
    {
      return new int[] { 3 };
    }
    
    public Factory setContinueLoadingCheckIntervalBytes(int paramInt)
    {
      Assertions.checkState(isCreateCalled ^ true);
      continueLoadingCheckIntervalBytes = paramInt;
      return this;
    }
    
    public Factory setCustomCacheKey(String paramString)
    {
      Assertions.checkState(isCreateCalled ^ true);
      customCacheKey = paramString;
      return this;
    }
    
    public Factory setExtractorsFactory(ExtractorsFactory paramExtractorsFactory)
    {
      Assertions.checkState(isCreateCalled ^ true);
      extractorsFactory = paramExtractorsFactory;
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
 * Qualified Name:     com.google.android.exoplayer2.source.ExtractorMediaSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */