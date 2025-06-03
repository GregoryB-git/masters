package com.appsflyer.internal;

public final class AFe1fSDK
  extends AFa1qSDK
{
  public final AFd1vSDK AFLogger$LogLevel;
  
  @Deprecated
  public AFe1fSDK()
  {
    AFLogger$LogLevel = null;
  }
  
  public AFe1fSDK(String paramString1, byte[] paramArrayOfByte, String paramString2, AFd1vSDK paramAFd1vSDK)
  {
    super(null, paramString1, Boolean.FALSE);
    AFInAppEventType = paramString2;
    valueOf(paramArrayOfByte);
    AFLogger$LogLevel = paramAFd1vSDK;
  }
  
  public final AFd1vSDK AFInAppEventType()
  {
    AFd1vSDK localAFd1vSDK = AFLogger$LogLevel;
    if (localAFd1vSDK != null) {
      return localAFd1vSDK;
    }
    return AFd1vSDK.AFKeystoreWrapper;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFe1fSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */