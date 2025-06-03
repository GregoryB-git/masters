package com.google.android.exoplayer2.upstream;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class HttpDataSource$RequestProperties
{
  private final Map<String, String> requestProperties = new HashMap();
  private Map<String, String> requestPropertiesSnapshot;
  
  public void clear()
  {
    try
    {
      requestPropertiesSnapshot = null;
      requestProperties.clear();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void clearAndSet(Map<String, String> paramMap)
  {
    try
    {
      requestPropertiesSnapshot = null;
      requestProperties.clear();
      requestProperties.putAll(paramMap);
      return;
    }
    finally
    {
      paramMap = finally;
      throw paramMap;
    }
  }
  
  public Map<String, String> getSnapshot()
  {
    try
    {
      if (requestPropertiesSnapshot == null)
      {
        localObject1 = new java/util/HashMap;
        ((HashMap)localObject1).<init>(requestProperties);
        requestPropertiesSnapshot = Collections.unmodifiableMap((Map)localObject1);
      }
      Object localObject1 = requestPropertiesSnapshot;
      return (Map<String, String>)localObject1;
    }
    finally {}
  }
  
  public void remove(String paramString)
  {
    try
    {
      requestPropertiesSnapshot = null;
      requestProperties.remove(paramString);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void set(String paramString1, String paramString2)
  {
    try
    {
      requestPropertiesSnapshot = null;
      requestProperties.put(paramString1, paramString2);
      return;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  public void set(Map<String, String> paramMap)
  {
    try
    {
      requestPropertiesSnapshot = null;
      requestProperties.putAll(paramMap);
      return;
    }
    finally
    {
      paramMap = finally;
      throw paramMap;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.HttpDataSource.RequestProperties
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */