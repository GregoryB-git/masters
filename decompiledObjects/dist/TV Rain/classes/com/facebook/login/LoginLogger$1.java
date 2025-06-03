package com.facebook.login;

import android.os.Bundle;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

class LoginLogger$1
  implements Runnable
{
  public LoginLogger$1(LoginLogger paramLoginLogger, Bundle paramBundle) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      LoginLogger.access$000(this$0).logEventImplicitly("fb_mobile_login_heartbeat", val$bundle);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.LoginLogger.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */