package com.facebook.internal;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

class FacebookWebFallbackDialog$1
  implements Runnable
{
  public FacebookWebFallbackDialog$1(FacebookWebFallbackDialog paramFacebookWebFallbackDialog) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      FacebookWebFallbackDialog.access$001(this$0);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.FacebookWebFallbackDialog.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */