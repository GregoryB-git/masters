package com.appsflyer.internal;

public final class AFb1uSDK
{
  private final boolean AFInAppEventType;
  final long AFKeystoreWrapper;
  final String valueOf;
  
  public AFb1uSDK() {}
  
  public AFb1uSDK(String paramString, long paramLong, boolean paramBoolean)
  {
    valueOf = paramString;
    AFKeystoreWrapper = paramLong;
    AFInAppEventType = paramBoolean;
  }
  
  public static boolean AFInAppEventType(String paramString)
  {
    return (paramString == null) || (paramString.trim().length() == 0);
  }
  
  public static boolean values(String paramString)
  {
    return (paramString == null) || (paramString.length() == 0);
  }
  
  public final boolean AFKeystoreWrapper()
  {
    return AFInAppEventType;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFb1uSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */