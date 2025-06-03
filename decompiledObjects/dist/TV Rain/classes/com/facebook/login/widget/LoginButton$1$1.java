package com.facebook.login.widget;

import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

class LoginButton$1$1
  implements Runnable
{
  public LoginButton$1$1(LoginButton.1 param1, FetchedAppSettings paramFetchedAppSettings) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      LoginButton.access$000(this$1.this$0, val$settings);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.widget.LoginButton.1.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */