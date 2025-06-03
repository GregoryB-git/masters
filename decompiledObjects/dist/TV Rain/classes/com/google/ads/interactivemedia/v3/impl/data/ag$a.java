package com.google.ads.interactivemedia.v3.impl.data;

import java.util.HashMap;
import java.util.Map;

public final class ag$a
{
  public int errorCode;
  public String errorMessage;
  public String innerError;
  public String type;
  
  public final Map<String, String> constructMap()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("type", type);
    localHashMap.put("errorCode", String.valueOf(errorCode));
    localHashMap.put("errorMessage", errorMessage);
    String str = innerError;
    if (str != null) {
      localHashMap.put("innerError", str);
    }
    return localHashMap;
  }
  
  public final String toString()
  {
    return String.format("Log[type=%s, errorCode=%s, errorMessage=%s, innerError=%s]", new Object[] { type, Integer.valueOf(errorCode), errorMessage, innerError });
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.ag.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */