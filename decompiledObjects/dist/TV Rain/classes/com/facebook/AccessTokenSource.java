package com.facebook;

public enum AccessTokenSource
{
  private final boolean canExtendToken;
  
  static
  {
    AccessTokenSource localAccessTokenSource1 = new AccessTokenSource("NONE", 0, false);
    NONE = localAccessTokenSource1;
    AccessTokenSource localAccessTokenSource2 = new AccessTokenSource("FACEBOOK_APPLICATION_WEB", 1, true);
    FACEBOOK_APPLICATION_WEB = localAccessTokenSource2;
    AccessTokenSource localAccessTokenSource3 = new AccessTokenSource("FACEBOOK_APPLICATION_NATIVE", 2, true);
    FACEBOOK_APPLICATION_NATIVE = localAccessTokenSource3;
    AccessTokenSource localAccessTokenSource4 = new AccessTokenSource("FACEBOOK_APPLICATION_SERVICE", 3, true);
    FACEBOOK_APPLICATION_SERVICE = localAccessTokenSource4;
    AccessTokenSource localAccessTokenSource5 = new AccessTokenSource("WEB_VIEW", 4, true);
    WEB_VIEW = localAccessTokenSource5;
    AccessTokenSource localAccessTokenSource6 = new AccessTokenSource("CHROME_CUSTOM_TAB", 5, true);
    CHROME_CUSTOM_TAB = localAccessTokenSource6;
    AccessTokenSource localAccessTokenSource7 = new AccessTokenSource("TEST_USER", 6, true);
    TEST_USER = localAccessTokenSource7;
    AccessTokenSource localAccessTokenSource8 = new AccessTokenSource("CLIENT_TOKEN", 7, true);
    CLIENT_TOKEN = localAccessTokenSource8;
    AccessTokenSource localAccessTokenSource9 = new AccessTokenSource("DEVICE_AUTH", 8, true);
    DEVICE_AUTH = localAccessTokenSource9;
    $VALUES = new AccessTokenSource[] { localAccessTokenSource1, localAccessTokenSource2, localAccessTokenSource3, localAccessTokenSource4, localAccessTokenSource5, localAccessTokenSource6, localAccessTokenSource7, localAccessTokenSource8, localAccessTokenSource9 };
  }
  
  private AccessTokenSource(boolean paramBoolean)
  {
    canExtendToken = paramBoolean;
  }
  
  public boolean canExtendToken()
  {
    return canExtendToken;
  }
}

/* Location:
 * Qualified Name:     com.facebook.AccessTokenSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */