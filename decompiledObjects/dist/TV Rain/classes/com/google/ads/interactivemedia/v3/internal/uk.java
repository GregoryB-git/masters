package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class uk
{
  private final Map<String, String> a = new HashMap();
  private Map<String, String> b;
  
  public final Map<String, String> a()
  {
    try
    {
      if (b == null)
      {
        localObject1 = new java/util/HashMap;
        ((HashMap)localObject1).<init>(a);
        b = Collections.unmodifiableMap((Map)localObject1);
      }
      Object localObject1 = b;
      return (Map<String, String>)localObject1;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.uk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */