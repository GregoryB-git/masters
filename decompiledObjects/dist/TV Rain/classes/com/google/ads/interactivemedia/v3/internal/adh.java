package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.Ad;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class adh
  implements AdEvent
{
  private AdEvent.AdEventType a;
  private Ad b;
  private Map<String, String> c;
  
  public adh(AdEvent.AdEventType paramAdEventType, Ad paramAd, Map<String, String> paramMap)
  {
    a = paramAdEventType;
    b = paramAd;
    c = paramMap;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof adh)) {
      return false;
    }
    paramObject = (adh)paramObject;
    if (a != a) {
      return false;
    }
    if (!ahf.a(b, b)) {
      return false;
    }
    return ahf.a(c, c);
  }
  
  public final Ad getAd()
  {
    return b;
  }
  
  public final Map<String, String> getAdData()
  {
    return c;
  }
  
  public final AdEvent.AdEventType getType()
  {
    return a;
  }
  
  public final int hashCode()
  {
    return ahf.a(new Object[] { a, b, c });
  }
  
  public final String toString()
  {
    String str = String.valueOf(String.format("AdEvent[type=%s, ad=%s", new Object[] { a, b }));
    Object localObject = c;
    if (localObject == null)
    {
      localObject = "]";
    }
    else
    {
      if (localObject == null)
      {
        localObject = "";
      }
      else
      {
        StringBuilder localStringBuilder = new StringBuilder("{");
        localObject = c.entrySet().iterator();
        while (((Iterator)localObject).hasNext())
        {
          Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
          localStringBuilder.append((String)localEntry.getKey());
          localStringBuilder.append(": ");
          localStringBuilder.append((String)localEntry.getValue());
          if (((Iterator)localObject).hasNext()) {
            localStringBuilder.append(", ");
          }
        }
        localStringBuilder.append("}");
        localObject = localStringBuilder.toString();
      }
      localObject = String.format(", adData=%s]", new Object[] { localObject });
    }
    localObject = String.valueOf(localObject);
    if (((String)localObject).length() != 0) {
      return str.concat((String)localObject);
    }
    return new String(str);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.adh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */