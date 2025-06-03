package com.appsflyer.internal;

public enum AFd1dSDK
{
  static
  {
    AFd1dSDK localAFd1dSDK1 = new AFd1dSDK("SUCCESS", 0);
    values = localAFd1dSDK1;
    AFd1dSDK localAFd1dSDK2 = new AFd1dSDK("USE_CACHED", 1);
    AFKeystoreWrapper = localAFd1dSDK2;
    AFd1dSDK localAFd1dSDK3 = new AFd1dSDK("FAILURE", 2);
    AFInAppEventParameterName = localAFd1dSDK3;
    valueOf = new AFd1dSDK[] { localAFd1dSDK1, localAFd1dSDK2, localAFd1dSDK3 };
  }
  
  private AFd1dSDK() {}
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFd1dSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */