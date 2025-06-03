package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;

public final class DefaultHttpDataSourceFactory
  extends HttpDataSource.BaseFactory
{
  private final boolean allowCrossProtocolRedirects;
  private final int connectTimeoutMillis;
  @Nullable
  private final TransferListener listener;
  private final int readTimeoutMillis;
  private final String userAgent;
  
  public DefaultHttpDataSourceFactory(String paramString)
  {
    this(paramString, null);
  }
  
  public DefaultHttpDataSourceFactory(String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this(paramString, null, paramInt1, paramInt2, paramBoolean);
  }
  
  public DefaultHttpDataSourceFactory(String paramString, @Nullable TransferListener paramTransferListener)
  {
    this(paramString, paramTransferListener, 8000, 8000, false);
  }
  
  public DefaultHttpDataSourceFactory(String paramString, @Nullable TransferListener paramTransferListener, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    userAgent = paramString;
    listener = paramTransferListener;
    connectTimeoutMillis = paramInt1;
    readTimeoutMillis = paramInt2;
    allowCrossProtocolRedirects = paramBoolean;
  }
  
  public DefaultHttpDataSource createDataSourceInternal(HttpDataSource.RequestProperties paramRequestProperties)
  {
    paramRequestProperties = new DefaultHttpDataSource(userAgent, null, connectTimeoutMillis, readTimeoutMillis, allowCrossProtocolRedirects, paramRequestProperties);
    TransferListener localTransferListener = listener;
    if (localTransferListener != null) {
      paramRequestProperties.addTransferListener(localTransferListener);
    }
    return paramRequestProperties;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.DefaultHttpDataSourceFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */