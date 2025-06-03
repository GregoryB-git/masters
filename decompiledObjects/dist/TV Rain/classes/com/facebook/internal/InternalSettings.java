package com.facebook.internal;

public class InternalSettings
{
  private static final String UNITY_PREFIX = "Unity.";
  private static volatile String mCustomUserAgent;
  
  public static String getCustomUserAgent()
  {
    return mCustomUserAgent;
  }
  
  public static boolean isUnityApp()
  {
    boolean bool;
    if ((mCustomUserAgent != null) && (mCustomUserAgent.startsWith("Unity."))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static void setCustomUserAgent(String paramString)
  {
    mCustomUserAgent = paramString;
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.InternalSettings
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */