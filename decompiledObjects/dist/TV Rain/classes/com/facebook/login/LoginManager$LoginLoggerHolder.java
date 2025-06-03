package com.facebook.login;

import android.content.Context;
import com.facebook.FacebookSdk;

class LoginManager$LoginLoggerHolder
{
  private static LoginLogger logger;
  
  private static LoginLogger getLogger(Context paramContext)
  {
    if (paramContext == null) {}
    try
    {
      paramContext = FacebookSdk.getApplicationContext();
      if (paramContext == null) {
        return null;
      }
      if (logger == null)
      {
        LoginLogger localLoginLogger = new com/facebook/login/LoginLogger;
        localLoginLogger.<init>(paramContext, FacebookSdk.getApplicationId());
        logger = localLoginLogger;
      }
      paramContext = logger;
      return paramContext;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.LoginManager.LoginLoggerHolder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */