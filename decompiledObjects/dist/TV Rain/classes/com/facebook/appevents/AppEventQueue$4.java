package com.facebook.appevents;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

final class AppEventQueue$4
  implements Runnable
{
  public AppEventQueue$4(AccessTokenAppIdPair paramAccessTokenAppIdPair, AppEvent paramAppEvent) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      AppEventQueue.access$100().addEvent(val$accessTokenAppId, val$appEvent);
      if ((AppEventsLogger.getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) && (AppEventQueue.access$100().getEventCount() > AppEventQueue.access$200().intValue())) {
        AppEventQueue.flushAndWait(FlushReason.EVENT_THRESHOLD);
      } else if (AppEventQueue.access$000() == null) {
        AppEventQueue.access$002(AppEventQueue.access$400().schedule(AppEventQueue.access$300(), 15L, TimeUnit.SECONDS));
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.AppEventQueue.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */