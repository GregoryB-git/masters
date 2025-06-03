package com.facebook.appevents;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

class PersistedEvents
  implements Serializable
{
  private static final long serialVersionUID = 20160629001L;
  private HashMap<AccessTokenAppIdPair, List<AppEvent>> events;
  
  public PersistedEvents()
  {
    events = new HashMap();
  }
  
  public PersistedEvents(HashMap<AccessTokenAppIdPair, List<AppEvent>> paramHashMap)
  {
    HashMap localHashMap = new HashMap();
    events = localHashMap;
    localHashMap.putAll(paramHashMap);
  }
  
  private Object writeReplace()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return null;
    }
    try
    {
      SerializationProxyV1 localSerializationProxyV1 = new SerializationProxyV1(events, null);
      return localSerializationProxyV1;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
    return null;
  }
  
  public void addEvents(AccessTokenAppIdPair paramAccessTokenAppIdPair, List<AppEvent> paramList)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      if (!events.containsKey(paramAccessTokenAppIdPair))
      {
        events.put(paramAccessTokenAppIdPair, paramList);
        return;
      }
      ((List)events.get(paramAccessTokenAppIdPair)).addAll(paramList);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramAccessTokenAppIdPair, this);
    }
  }
  
  public boolean containsKey(AccessTokenAppIdPair paramAccessTokenAppIdPair)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return false;
    }
    try
    {
      boolean bool = events.containsKey(paramAccessTokenAppIdPair);
      return bool;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramAccessTokenAppIdPair, this);
    }
    return false;
  }
  
  public List<AppEvent> get(AccessTokenAppIdPair paramAccessTokenAppIdPair)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return null;
    }
    try
    {
      paramAccessTokenAppIdPair = (List)events.get(paramAccessTokenAppIdPair);
      return paramAccessTokenAppIdPair;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramAccessTokenAppIdPair, this);
    }
    return null;
  }
  
  public Set<AccessTokenAppIdPair> keySet()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return null;
    }
    try
    {
      Set localSet = events.keySet();
      return localSet;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
    return null;
  }
  
  public static class SerializationProxyV1
    implements Serializable
  {
    private static final long serialVersionUID = 20160629001L;
    private final HashMap<AccessTokenAppIdPair, List<AppEvent>> proxyEvents;
    
    private SerializationProxyV1(HashMap<AccessTokenAppIdPair, List<AppEvent>> paramHashMap)
    {
      proxyEvents = paramHashMap;
    }
    
    private Object readResolve()
    {
      return new PersistedEvents(proxyEvents);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.PersistedEvents
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */