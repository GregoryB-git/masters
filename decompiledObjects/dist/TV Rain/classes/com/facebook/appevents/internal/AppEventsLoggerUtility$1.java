package com.facebook.appevents.internal;

import java.util.AbstractMap;
import java.util.HashMap;

final class AppEventsLoggerUtility$1
  extends HashMap<AppEventsLoggerUtility.GraphAPIActivityType, String>
{
  public AppEventsLoggerUtility$1()
  {
    put(AppEventsLoggerUtility.GraphAPIActivityType.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL");
    put(AppEventsLoggerUtility.GraphAPIActivityType.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS");
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.internal.AppEventsLoggerUtility.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */