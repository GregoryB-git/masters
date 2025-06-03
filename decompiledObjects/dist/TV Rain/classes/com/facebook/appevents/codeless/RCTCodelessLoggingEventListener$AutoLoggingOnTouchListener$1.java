package com.facebook.appevents.codeless;

import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

class RCTCodelessLoggingEventListener$AutoLoggingOnTouchListener$1
  implements Runnable
{
  public RCTCodelessLoggingEventListener$AutoLoggingOnTouchListener$1(RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener paramAutoLoggingOnTouchListener, String paramString, Bundle paramBundle) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      AppEventsLogger.newLogger(FacebookSdk.getApplicationContext()).logEvent(val$eventName, val$params);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */