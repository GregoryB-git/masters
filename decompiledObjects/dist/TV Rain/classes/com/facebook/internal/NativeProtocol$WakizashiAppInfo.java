package com.facebook.internal;

class NativeProtocol$WakizashiAppInfo
  extends NativeProtocol.NativeAppInfo
{
  public static final String WAKIZASHI_PACKAGE = "com.facebook.wakizashi";
  
  private NativeProtocol$WakizashiAppInfo()
  {
    super(null);
  }
  
  public String getLoginActivity()
  {
    return "com.facebook.katana.ProxyAuth";
  }
  
  public String getPackage()
  {
    return "com.facebook.wakizashi";
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.NativeProtocol.WakizashiAppInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */