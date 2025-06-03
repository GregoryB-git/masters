package com.google.ads.interactivemedia.v3.internal;

import java.util.HashSet;
import org.json.JSONObject;

public class ap
{
  private JSONObject a;
  private final am b;
  
  public ap(am paramam)
  {
    b = paramam;
  }
  
  public JSONObject a()
  {
    return a;
  }
  
  public void a(JSONObject paramJSONObject)
  {
    a = paramJSONObject;
  }
  
  public void a(JSONObject paramJSONObject, HashSet<String> paramHashSet, long paramLong)
  {
    b.a(new aq(this, paramHashSet, paramJSONObject, paramLong));
  }
  
  public void b()
  {
    b.a(new ao(this));
  }
  
  public void b(JSONObject paramJSONObject, HashSet<String> paramHashSet, long paramLong)
  {
    b.a(new ar(this, paramHashSet, paramJSONObject, paramLong));
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */