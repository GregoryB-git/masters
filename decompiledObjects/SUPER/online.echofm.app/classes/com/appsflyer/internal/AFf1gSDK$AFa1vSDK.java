package com.appsflyer.internal;

 enum AFf1gSDK$AFa1vSDK
{
  String values;
  
  static
  {
    AFInAppEventType = new AFa1vSDK("ACCELEROMETER", 1, "am");
    valueOf = new AFa1vSDK("MAGNETOMETER", 2, "mm");
    AFInAppEventParameterName = new AFa1vSDK("RESERVED", 3, "rs");
    AFa1vSDK localAFa1vSDK = new AFa1vSDK("GYROSCOPE", 4, "gs");
    AFLogger = localAFa1vSDK;
    afErrorLog = new AFa1vSDK[] { AFKeystoreWrapper, AFInAppEventType, valueOf, AFInAppEventParameterName, localAFa1vSDK };
  }
  
  private AFf1gSDK$AFa1vSDK(String paramString)
  {
    values = paramString;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFf1gSDK.AFa1vSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */