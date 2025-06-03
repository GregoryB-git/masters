package com.facebook;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

class AccessTokenManager$1
  implements Runnable
{
  public AccessTokenManager$1(AccessTokenManager paramAccessTokenManager, AccessToken.AccessTokenRefreshCallback paramAccessTokenRefreshCallback) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      AccessTokenManager.access$000(this$0, val$callback);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.AccessTokenManager.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */