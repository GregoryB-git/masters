package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class b
{
  public static final Date g = new Date(0L);
  public JSONObject a;
  public JSONObject b;
  public Date c;
  public JSONArray d;
  public JSONObject e;
  public long f;
  
  public b(JSONObject paramJSONObject1, Date paramDate, JSONArray paramJSONArray, JSONObject paramJSONObject2, long paramLong)
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("configs_key", paramJSONObject1);
    localJSONObject.put("fetch_time_key", paramDate.getTime());
    localJSONObject.put("abt_experiments_key", paramJSONArray);
    localJSONObject.put("personalization_metadata_key", paramJSONObject2);
    localJSONObject.put("template_version_number_key", paramLong);
    b = paramJSONObject1;
    c = paramDate;
    d = paramJSONArray;
    e = paramJSONObject2;
    f = paramLong;
    a = localJSONObject;
  }
  
  public static b b(JSONObject paramJSONObject)
  {
    JSONObject localJSONObject1 = paramJSONObject.optJSONObject("personalization_metadata_key");
    JSONObject localJSONObject2 = localJSONObject1;
    if (localJSONObject1 == null) {
      localJSONObject2 = new JSONObject();
    }
    return new b(paramJSONObject.getJSONObject("configs_key"), new Date(paramJSONObject.getLong("fetch_time_key")), paramJSONObject.getJSONArray("abt_experiments_key"), localJSONObject2, paramJSONObject.optLong("template_version_number_key"));
  }
  
  public static b c(JSONObject paramJSONObject)
  {
    return b(new JSONObject(paramJSONObject.toString()));
  }
  
  public static b j()
  {
    return new b(null);
  }
  
  public JSONArray d()
  {
    return d;
  }
  
  public Set e(b paramb)
  {
    JSONObject localJSONObject = c(a).f();
    HashSet localHashSet = new HashSet();
    Iterator localIterator = f().keys();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (!paramb.f().has(str)) {}
      while ((!f().get(str).equals(paramb.f().get(str))) || ((h().has(str)) && (!paramb.h().has(str))) || ((!h().has(str)) && (paramb.h().has(str))) || ((h().has(str)) && (paramb.h().has(str)) && (!h().getJSONObject(str).toString().equals(paramb.h().getJSONObject(str).toString()))))
      {
        localHashSet.add(str);
        break;
      }
      localJSONObject.remove(str);
    }
    paramb = localJSONObject.keys();
    while (paramb.hasNext()) {
      localHashSet.add((String)paramb.next());
    }
    return localHashSet;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof b)) {
      return false;
    }
    paramObject = (b)paramObject;
    return a.toString().equals(((b)paramObject).toString());
  }
  
  public JSONObject f()
  {
    return b;
  }
  
  public Date g()
  {
    return c;
  }
  
  public JSONObject h()
  {
    return e;
  }
  
  public int hashCode()
  {
    return a.hashCode();
  }
  
  public long i()
  {
    return f;
  }
  
  public String toString()
  {
    return a.toString();
  }
  
  public static class b
  {
    public JSONObject a = new JSONObject();
    public Date b = b.a();
    public JSONArray c = new JSONArray();
    public JSONObject d = new JSONObject();
    public long e = 0L;
    
    public b a()
    {
      return new b(a, b, c, d, e, null);
    }
    
    public b b(Map paramMap)
    {
      a = new JSONObject(paramMap);
      return this;
    }
    
    public b c(JSONObject paramJSONObject)
    {
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramJSONObject.toString());
        a = localJSONObject;
        return this;
      }
      catch (JSONException paramJSONObject)
      {
        for (;;) {}
      }
    }
    
    public b d(JSONArray paramJSONArray)
    {
      try
      {
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>(paramJSONArray.toString());
        c = localJSONArray;
        return this;
      }
      catch (JSONException paramJSONArray)
      {
        for (;;) {}
      }
    }
    
    public b e(Date paramDate)
    {
      b = paramDate;
      return this;
    }
    
    public b f(JSONObject paramJSONObject)
    {
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramJSONObject.toString());
        d = localJSONObject;
        return this;
      }
      catch (JSONException paramJSONObject)
      {
        for (;;) {}
      }
    }
    
    public b g(long paramLong)
    {
      e = paramLong;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.remoteconfig.internal.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */