package com.facebook.appevents.ml;

import com.facebook.appevents.suggestedevents.SuggestedEventsManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

final class ModelManager$2
  implements Runnable
{
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      SuggestedEventsManager.enable();
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.ml.ModelManager.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */