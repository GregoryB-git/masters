package com.google.android.datatransport.cct;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.BatchedLogRequest;
import java.net.URL;

final class CctTransportBackend$HttpRequest
{
  @Nullable
  public final String apiKey;
  public final BatchedLogRequest requestBody;
  public final URL url;
  
  public CctTransportBackend$HttpRequest(URL paramURL, BatchedLogRequest paramBatchedLogRequest, @Nullable String paramString)
  {
    url = paramURL;
    requestBody = paramBatchedLogRequest;
    apiKey = paramString;
  }
  
  public HttpRequest withUrl(URL paramURL)
  {
    return new HttpRequest(paramURL, requestBody, apiKey);
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.CctTransportBackend.HttpRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */