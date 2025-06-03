package com.facebook.appevents.suggestedevents;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

final class ViewOnClickListener$1
  implements Runnable
{
  public ViewOnClickListener$1(String paramString1, String paramString2) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      ViewOnClickListener.access$000(val$queriedEvent, val$buttonText, new float[0]);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.suggestedevents.ViewOnClickListener.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */