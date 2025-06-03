package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSource.Factory;

public final class DefaultHlsDataSourceFactory
  implements HlsDataSourceFactory
{
  private final DataSource.Factory dataSourceFactory;
  
  public DefaultHlsDataSourceFactory(DataSource.Factory paramFactory)
  {
    dataSourceFactory = paramFactory;
  }
  
  public DataSource createDataSource(int paramInt)
  {
    return dataSourceFactory.createDataSource();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.DefaultHlsDataSourceFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */