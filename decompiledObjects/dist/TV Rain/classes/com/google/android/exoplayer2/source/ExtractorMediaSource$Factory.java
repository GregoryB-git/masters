package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.source.ads.AdsMediaSource.MediaSourceFactory;
import com.google.android.exoplayer2.upstream.DataSource.Factory;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.util.Assertions;

public final class ExtractorMediaSource$Factory
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
  
  public ExtractorMediaSource$Factory(DataSource.Factory paramFactory)
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

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.ExtractorMediaSource.Factory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */