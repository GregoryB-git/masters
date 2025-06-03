package com.google.ads.interactivemedia.v3.api;

import java.util.Map;

public abstract interface StreamRequest
{
  public abstract void forceExperimentId(Integer paramInteger);
  
  public abstract Map<String, String> getAdTagParameters();
  
  public abstract String getApiKey();
  
  public abstract String getAssetKey();
  
  public abstract String getAuthToken();
  
  public abstract String getContentSourceId();
  
  public abstract Integer getForcedExperimentId();
  
  public abstract StreamFormat getFormat();
  
  public abstract String getManifestSuffix();
  
  public abstract String getStreamActivityMonitorId();
  
  @Deprecated
  public abstract StreamDisplayContainer getStreamDisplayContainer();
  
  public abstract Boolean getUseQAStreamBaseUrl();
  
  public abstract Object getUserRequestContext();
  
  public abstract String getVideoId();
  
  public abstract void setAdTagParameters(Map<String, String> paramMap);
  
  public abstract void setAuthToken(String paramString);
  
  public abstract void setFormat(StreamFormat paramStreamFormat);
  
  public abstract void setManifestSuffix(String paramString);
  
  public abstract void setStreamActivityMonitorId(String paramString);
  
  public abstract void setUseQAStreamBaseUrl(Boolean paramBoolean);
  
  public abstract void setUserRequestContext(Object paramObject);
  
  public static enum StreamFormat
  {
    static
    {
      StreamFormat localStreamFormat1 = new StreamFormat("DASH", 0);
      DASH = localStreamFormat1;
      StreamFormat localStreamFormat2 = new StreamFormat("HLS", 1);
      HLS = localStreamFormat2;
      a = new StreamFormat[] { localStreamFormat1, localStreamFormat2 };
    }
    
    private StreamFormat() {}
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.api.StreamRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */