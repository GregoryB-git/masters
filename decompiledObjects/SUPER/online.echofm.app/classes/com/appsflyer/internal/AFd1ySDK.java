package com.appsflyer.internal;

public enum AFd1ySDK
{
  static
  {
    AFd1ySDK localAFd1ySDK1 = new AFd1ySDK("SUCCESS", 0);
    AFInAppEventParameterName = localAFd1ySDK1;
    AFd1ySDK localAFd1ySDK2 = new AFd1ySDK("FAILURE", 1);
    valueOf = localAFd1ySDK2;
    AFd1ySDK localAFd1ySDK3 = new AFd1ySDK("TIMEOUT", 2);
    AFInAppEventType = localAFd1ySDK3;
    values = new AFd1ySDK[] { localAFd1ySDK1, localAFd1ySDK2, localAFd1ySDK3 };
  }
  
  private AFd1ySDK() {}
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFd1ySDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */