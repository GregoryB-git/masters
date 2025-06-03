package com.facebook.appevents;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

class PersistedEvents$SerializationProxyV1
  implements Serializable
{
  private static final long serialVersionUID = 20160629001L;
  private final HashMap<AccessTokenAppIdPair, List<AppEvent>> proxyEvents;
  
  private PersistedEvents$SerializationProxyV1(HashMap<AccessTokenAppIdPair, List<AppEvent>> paramHashMap)
  {
    proxyEvents = paramHashMap;
  }
  
  private Object readResolve()
  {
    return new PersistedEvents(proxyEvents);
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.PersistedEvents.SerializationProxyV1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */