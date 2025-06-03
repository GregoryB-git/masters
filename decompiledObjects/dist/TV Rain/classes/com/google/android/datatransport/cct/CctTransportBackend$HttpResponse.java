package com.google.android.datatransport.cct;

import androidx.annotation.Nullable;
import java.net.URL;

final class CctTransportBackend$HttpResponse
{
  public final int code;
  public final long nextRequestMillis;
  @Nullable
  public final URL redirectUrl;
  
  public CctTransportBackend$HttpResponse(int paramInt, @Nullable URL paramURL, long paramLong)
  {
    code = paramInt;
    redirectUrl = paramURL;
    nextRequestMillis = paramLong;
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.CctTransportBackend.HttpResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */