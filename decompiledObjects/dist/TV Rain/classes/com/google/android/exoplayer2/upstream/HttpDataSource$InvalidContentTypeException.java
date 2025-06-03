package com.google.android.exoplayer2.upstream;

import z2;

public final class HttpDataSource$InvalidContentTypeException
  extends HttpDataSource.HttpDataSourceException
{
  public final String contentType;
  
  public HttpDataSource$InvalidContentTypeException(String paramString, DataSpec paramDataSpec)
  {
    super(z2.o("Invalid content type: ", paramString), paramDataSpec, 1);
    contentType = paramString;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.HttpDataSource.InvalidContentTypeException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */