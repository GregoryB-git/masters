package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataSource.Factory;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.util.Assertions;

public final class SingleSampleMediaSource$Factory
{
  private final DataSource.Factory dataSourceFactory;
  private boolean isCreateCalled;
  private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
  @Nullable
  private Object tag;
  private boolean treatLoadErrorsAsEndOfStream;
  
  public SingleSampleMediaSource$Factory(DataSource.Factory paramFactory)
  {
    dataSourceFactory = ((DataSource.Factory)Assertions.checkNotNull(paramFactory));
    loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
  }
  
  public SingleSampleMediaSource createMediaSource(Uri paramUri, Format paramFormat, long paramLong)
  {
    isCreateCalled = true;
    return new SingleSampleMediaSource(paramUri, dataSourceFactory, paramFormat, paramLong, loadErrorHandlingPolicy, treatLoadErrorsAsEndOfStream, tag, null);
  }
  
  @Deprecated
  public SingleSampleMediaSource createMediaSource(Uri paramUri, Format paramFormat, long paramLong, @Nullable Handler paramHandler, @Nullable MediaSourceEventListener paramMediaSourceEventListener)
  {
    paramUri = createMediaSource(paramUri, paramFormat, paramLong);
    if ((paramHandler != null) && (paramMediaSourceEventListener != null)) {
      paramUri.addEventListener(paramHandler, paramMediaSourceEventListener);
    }
    return paramUri;
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
  
  public Factory setTreatLoadErrorsAsEndOfStream(boolean paramBoolean)
  {
    Assertions.checkState(isCreateCalled ^ true);
    treatLoadErrorsAsEndOfStream = paramBoolean;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.SingleSampleMediaSource.Factory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */