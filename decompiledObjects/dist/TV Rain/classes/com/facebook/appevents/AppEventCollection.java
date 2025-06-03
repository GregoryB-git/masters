package com.facebook.appevents;

import android.content.Context;
import com.facebook.FacebookSdk;
import com.facebook.internal.AttributionIdentifiers;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class AppEventCollection
{
  private final HashMap<AccessTokenAppIdPair, SessionEventsState> stateMap = new HashMap();
  
  private SessionEventsState getSessionEventsState(AccessTokenAppIdPair paramAccessTokenAppIdPair)
  {
    try
    {
      Object localObject1 = (SessionEventsState)stateMap.get(paramAccessTokenAppIdPair);
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject1 = FacebookSdk.getApplicationContext();
        localObject2 = new com/facebook/appevents/SessionEventsState;
        ((SessionEventsState)localObject2).<init>(AttributionIdentifiers.getAttributionIdentifiers((Context)localObject1), AppEventsLogger.getAnonymousAppDeviceGUID((Context)localObject1));
      }
      stateMap.put(paramAccessTokenAppIdPair, localObject2);
      return (SessionEventsState)localObject2;
    }
    finally {}
  }
  
  public void addEvent(AccessTokenAppIdPair paramAccessTokenAppIdPair, AppEvent paramAppEvent)
  {
    try
    {
      getSessionEventsState(paramAccessTokenAppIdPair).addEvent(paramAppEvent);
      return;
    }
    finally
    {
      paramAccessTokenAppIdPair = finally;
      throw paramAccessTokenAppIdPair;
    }
  }
  
  public void addPersistedEvents(PersistedEvents paramPersistedEvents)
  {
    if (paramPersistedEvents == null) {
      return;
    }
    try
    {
      Iterator localIterator = paramPersistedEvents.keySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (AccessTokenAppIdPair)localIterator.next();
        SessionEventsState localSessionEventsState = getSessionEventsState((AccessTokenAppIdPair)localObject);
        localObject = paramPersistedEvents.get((AccessTokenAppIdPair)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          localSessionEventsState.addEvent((AppEvent)((Iterator)localObject).next());
        }
      }
      return;
    }
    finally {}
  }
  
  public SessionEventsState get(AccessTokenAppIdPair paramAccessTokenAppIdPair)
  {
    try
    {
      paramAccessTokenAppIdPair = (SessionEventsState)stateMap.get(paramAccessTokenAppIdPair);
      return paramAccessTokenAppIdPair;
    }
    finally
    {
      paramAccessTokenAppIdPair = finally;
      throw paramAccessTokenAppIdPair;
    }
  }
  
  public int getEventCount()
  {
    int i = 0;
    try
    {
      Iterator localIterator = stateMap.values().iterator();
      while (localIterator.hasNext())
      {
        int j = ((SessionEventsState)localIterator.next()).getAccumulatedEventCount();
        i += j;
      }
      return i;
    }
    finally {}
  }
  
  public Set<AccessTokenAppIdPair> keySet()
  {
    try
    {
      Set localSet = stateMap.keySet();
      return localSet;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.AppEventCollection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */