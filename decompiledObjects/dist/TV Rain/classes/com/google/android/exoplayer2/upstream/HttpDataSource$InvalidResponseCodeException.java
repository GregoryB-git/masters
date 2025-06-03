package com.google.android.exoplayer2.upstream;

import a;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

public final class HttpDataSource$InvalidResponseCodeException
  extends HttpDataSource.HttpDataSourceException
{
  public final Map<String, List<String>> headerFields;
  public final int responseCode;
  @Nullable
  public final String responseMessage;
  
  public HttpDataSource$InvalidResponseCodeException(int paramInt, @Nullable String paramString, Map<String, List<String>> paramMap, DataSpec paramDataSpec)
  {
    super(a.f("Response code: ", paramInt), paramDataSpec, 1);
    responseCode = paramInt;
    responseMessage = paramString;
    headerFields = paramMap;
  }
  
  @Deprecated
  public HttpDataSource$InvalidResponseCodeException(int paramInt, Map<String, List<String>> paramMap, DataSpec paramDataSpec)
  {
    this(paramInt, null, paramMap, paramDataSpec);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */