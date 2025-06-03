package com.facebook.appevents.suggestedevents;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.concurrent.atomic.AtomicBoolean;

final class SuggestedEventsManager$1
  implements Runnable
{
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      if (SuggestedEventsManager.access$000().get()) {
        return;
      }
      SuggestedEventsManager.access$000().set(true);
      SuggestedEventsManager.access$100();
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.suggestedevents.SuggestedEventsManager.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */