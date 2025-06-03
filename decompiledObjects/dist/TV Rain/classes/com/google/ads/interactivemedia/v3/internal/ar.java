package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

public final class ar
  extends ak
{
  public ar(ap paramap, HashSet<String> paramHashSet, JSONObject paramJSONObject, long paramLong)
  {
    super(paramap, paramHashSet, paramJSONObject, paramLong);
  }
  
  public final void a(String paramString)
  {
    Object localObject = k.a();
    if (localObject != null)
    {
      localObject = ((k)localObject).b().iterator();
      while (((Iterator)localObject).hasNext())
      {
        e locale = (e)((Iterator)localObject).next();
        if (a.contains(locale.f())) {
          locale.e().b(paramString, c);
        }
      }
    }
    super.a(paramString);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */