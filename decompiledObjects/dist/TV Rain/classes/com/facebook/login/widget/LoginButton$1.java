package com.facebook.login.widget;

import android.app.Activity;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

class LoginButton$1
  implements Runnable
{
  public LoginButton$1(LoginButton paramLoginButton, String paramString) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      FetchedAppSettings localFetchedAppSettings = FetchedAppSettingsManager.queryAppSettings(val$appId, false);
      Activity localActivity = LoginButton.access$100(this$0);
      Runnable local1 = new com/facebook/login/widget/LoginButton$1$1;
      local1.<init>(this, localFetchedAppSettings);
      localActivity.runOnUiThread(local1);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.widget.LoginButton.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */