package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.v3.api.StreamRequest;
import com.google.ads.interactivemedia.v3.api.StreamRequest.StreamFormat;
import java.util.Map;

public final class afm
  implements StreamRequest
{
  private StreamDisplayContainer a;
  private String b;
  private String c;
  private String d;
  private String e;
  private Map<String, String> f;
  private String g;
  private String h;
  private String i;
  private Integer j;
  private StreamRequest.StreamFormat k;
  private Boolean l;
  private transient Object m;
  
  @Deprecated
  public final void a(StreamDisplayContainer paramStreamDisplayContainer)
  {
    a = paramStreamDisplayContainer;
  }
  
  public final void a(String paramString)
  {
    b = paramString;
  }
  
  public final void b(String paramString)
  {
    d = paramString;
  }
  
  public final void c(String paramString)
  {
    e = paramString;
  }
  
  public final void d(String paramString)
  {
    c = paramString;
  }
  
  public final void forceExperimentId(Integer paramInteger)
  {
    j = paramInteger;
  }
  
  public final Map<String, String> getAdTagParameters()
  {
    return f;
  }
  
  public final String getApiKey()
  {
    return c;
  }
  
  public final String getAssetKey()
  {
    return b;
  }
  
  public final String getAuthToken()
  {
    return h;
  }
  
  public final String getContentSourceId()
  {
    return d;
  }
  
  public final Integer getForcedExperimentId()
  {
    return j;
  }
  
  public final StreamRequest.StreamFormat getFormat()
  {
    return k;
  }
  
  public final String getManifestSuffix()
  {
    return g;
  }
  
  public final String getStreamActivityMonitorId()
  {
    return i;
  }
  
  public final StreamDisplayContainer getStreamDisplayContainer()
  {
    return a;
  }
  
  public final Boolean getUseQAStreamBaseUrl()
  {
    return l;
  }
  
  public final Object getUserRequestContext()
  {
    return m;
  }
  
  public final String getVideoId()
  {
    return e;
  }
  
  public final void setAdTagParameters(Map<String, String> paramMap)
  {
    f = paramMap;
  }
  
  public final void setAuthToken(String paramString)
  {
    h = paramString;
  }
  
  public final void setFormat(StreamRequest.StreamFormat paramStreamFormat)
  {
    k = paramStreamFormat;
  }
  
  public final void setManifestSuffix(String paramString)
  {
    g = paramString;
  }
  
  public final void setStreamActivityMonitorId(String paramString)
  {
    i = paramString;
  }
  
  public final void setUseQAStreamBaseUrl(Boolean paramBoolean)
  {
    l = paramBoolean;
  }
  
  public final void setUserRequestContext(Object paramObject)
  {
    m = paramObject;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.afm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */