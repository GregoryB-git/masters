package com.google.android.exoplayer2.upstream;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class HttpDataSource$HttpDataSourceException
  extends IOException
{
  public static final int TYPE_CLOSE = 3;
  public static final int TYPE_OPEN = 1;
  public static final int TYPE_READ = 2;
  public final DataSpec dataSpec;
  public final int type;
  
  public HttpDataSource$HttpDataSourceException(DataSpec paramDataSpec, int paramInt)
  {
    dataSpec = paramDataSpec;
    type = paramInt;
  }
  
  public HttpDataSource$HttpDataSourceException(IOException paramIOException, DataSpec paramDataSpec, int paramInt)
  {
    super(paramIOException);
    dataSpec = paramDataSpec;
    type = paramInt;
  }
  
  public HttpDataSource$HttpDataSourceException(String paramString, DataSpec paramDataSpec, int paramInt)
  {
    super(paramString);
    dataSpec = paramDataSpec;
    type = paramInt;
  }
  
  public HttpDataSource$HttpDataSourceException(String paramString, IOException paramIOException, DataSpec paramDataSpec, int paramInt)
  {
    super(paramString, paramIOException);
    dataSpec = paramDataSpec;
    type = paramInt;
  }
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface Type {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */