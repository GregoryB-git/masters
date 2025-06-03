package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdError.AdErrorCode;
import com.google.ads.interactivemedia.v3.api.AdError.AdErrorType;
import com.google.ads.interactivemedia.v3.impl.data.CompanionData;
import com.google.ads.interactivemedia.v3.impl.data.ResizeAndPositionVideoMsgData;
import java.util.Map;

public abstract interface aey
{
  public abstract void a();
  
  public abstract void a(AdError.AdErrorType paramAdErrorType, int paramInt, String paramString);
  
  public abstract void a(AdError.AdErrorType paramAdErrorType, AdError.AdErrorCode paramAdErrorCode, String paramString);
  
  public abstract void a(ResizeAndPositionVideoMsgData paramResizeAndPositionVideoMsgData);
  
  public abstract void a(aev paramaev);
  
  public abstract void a(Map<String, CompanionData> paramMap);
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aey
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */