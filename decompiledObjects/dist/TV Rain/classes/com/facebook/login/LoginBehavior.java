package com.facebook.login;

public enum LoginBehavior
{
  private final boolean allowsCustomTabAuth;
  private final boolean allowsDeviceAuth;
  private final boolean allowsFacebookLiteAuth;
  private final boolean allowsGetTokenAuth;
  private final boolean allowsKatanaAuth;
  private final boolean allowsWebViewAuth;
  
  static
  {
    LoginBehavior localLoginBehavior1 = new LoginBehavior("NATIVE_WITH_FALLBACK", 0, true, true, true, false, true, true);
    NATIVE_WITH_FALLBACK = localLoginBehavior1;
    LoginBehavior localLoginBehavior2 = new LoginBehavior("NATIVE_ONLY", 1, true, true, false, false, false, true);
    NATIVE_ONLY = localLoginBehavior2;
    LoginBehavior localLoginBehavior3 = new LoginBehavior("KATANA_ONLY", 2, false, true, false, false, false, false);
    KATANA_ONLY = localLoginBehavior3;
    LoginBehavior localLoginBehavior4 = new LoginBehavior("WEB_ONLY", 3, false, false, true, false, true, false);
    WEB_ONLY = localLoginBehavior4;
    LoginBehavior localLoginBehavior5 = new LoginBehavior("WEB_VIEW_ONLY", 4, false, false, true, false, false, false);
    WEB_VIEW_ONLY = localLoginBehavior5;
    LoginBehavior localLoginBehavior6 = new LoginBehavior("DIALOG_ONLY", 5, false, true, true, false, true, true);
    DIALOG_ONLY = localLoginBehavior6;
    LoginBehavior localLoginBehavior7 = new LoginBehavior("DEVICE_AUTH", 6, false, false, false, true, false, false);
    DEVICE_AUTH = localLoginBehavior7;
    $VALUES = new LoginBehavior[] { localLoginBehavior1, localLoginBehavior2, localLoginBehavior3, localLoginBehavior4, localLoginBehavior5, localLoginBehavior6, localLoginBehavior7 };
  }
  
  private LoginBehavior(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6)
  {
    allowsGetTokenAuth = paramBoolean1;
    allowsKatanaAuth = paramBoolean2;
    allowsWebViewAuth = paramBoolean3;
    allowsDeviceAuth = paramBoolean4;
    allowsCustomTabAuth = paramBoolean5;
    allowsFacebookLiteAuth = paramBoolean6;
  }
  
  public boolean allowsCustomTabAuth()
  {
    return allowsCustomTabAuth;
  }
  
  public boolean allowsDeviceAuth()
  {
    return allowsDeviceAuth;
  }
  
  public boolean allowsFacebookLiteAuth()
  {
    return allowsFacebookLiteAuth;
  }
  
  public boolean allowsGetTokenAuth()
  {
    return allowsGetTokenAuth;
  }
  
  public boolean allowsKatanaAuth()
  {
    return allowsKatanaAuth;
  }
  
  public boolean allowsWebViewAuth()
  {
    return allowsWebViewAuth;
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.LoginBehavior
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */