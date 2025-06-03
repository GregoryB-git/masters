package com.google.ads.interactivemedia.v3.internal;

import java.util.HashSet;
import org.json.JSONObject;

public abstract class ak
  extends an
{
  public final HashSet<String> a;
  public final JSONObject b;
  public final long c;
  
  public ak(ap paramap, HashSet<String> paramHashSet, JSONObject paramJSONObject, long paramLong)
  {
    super(paramap);
    a = new HashSet(paramHashSet);
    b = paramJSONObject;
    c = paramLong;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ak
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */