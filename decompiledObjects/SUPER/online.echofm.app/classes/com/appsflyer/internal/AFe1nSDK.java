package com.appsflyer.internal;

public enum AFe1nSDK
{
  static
  {
    AFe1nSDK localAFe1nSDK1 = new AFe1nSDK("onReceive", 0);
    AFInAppEventParameterName = localAFe1nSDK1;
    AFe1nSDK localAFe1nSDK2 = new AFe1nSDK("logSession", 1);
    values = localAFe1nSDK2;
    AFe1nSDK localAFe1nSDK3 = new AFe1nSDK("logEvent", 2);
    AFInAppEventType = localAFe1nSDK3;
    AFe1nSDK localAFe1nSDK4 = new AFe1nSDK("setCustomerIdAndLogSession", 3);
    AFKeystoreWrapper = localAFe1nSDK4;
    valueOf = new AFe1nSDK[] { localAFe1nSDK1, localAFe1nSDK2, localAFe1nSDK3, localAFe1nSDK4 };
  }
  
  private AFe1nSDK() {}
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFe1nSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */