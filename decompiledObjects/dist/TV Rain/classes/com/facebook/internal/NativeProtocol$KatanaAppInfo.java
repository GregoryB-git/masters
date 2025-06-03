package com.facebook.internal;

class NativeProtocol$KatanaAppInfo
  extends NativeProtocol.NativeAppInfo
{
  public static final String KATANA_PACKAGE = "com.facebook.katana";
  
  private NativeProtocol$KatanaAppInfo()
  {
    super(null);
  }
  
  public String getLoginActivity()
  {
    return "com.facebook.katana.ProxyAuth";
  }
  
  public String getPackage()
  {
    return "com.facebook.katana";
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.NativeProtocol.KatanaAppInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */