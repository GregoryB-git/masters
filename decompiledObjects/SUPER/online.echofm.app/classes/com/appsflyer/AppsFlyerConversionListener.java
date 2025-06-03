package com.appsflyer;

import java.util.Map;

public abstract interface AppsFlyerConversionListener
{
  public abstract void onAppOpenAttribution(Map<String, String> paramMap);
  
  public abstract void onAttributionFailure(String paramString);
  
  public abstract void onConversionDataFail(String paramString);
  
  public abstract void onConversionDataSuccess(Map<String, Object> paramMap);
}

/* Location:
 * Qualified Name:     com.appsflyer.AppsFlyerConversionListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */