package com.facebook.internal;

class NativeProtocol$FBLiteAppInfo
  extends NativeProtocol.NativeAppInfo
{
  public static final String FACEBOOK_LITE_ACTIVITY = "com.facebook.lite.platform.LoginGDPDialogActivity";
  public static final String FBLITE_PACKAGE = "com.facebook.lite";
  
  private NativeProtocol$FBLiteAppInfo()
  {
    super(null);
  }
  
  public String getLoginActivity()
  {
    return "com.facebook.lite.platform.LoginGDPDialogActivity";
  }
  
  public String getPackage()
  {
    return "com.facebook.lite";
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.NativeProtocol.FBLiteAppInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */