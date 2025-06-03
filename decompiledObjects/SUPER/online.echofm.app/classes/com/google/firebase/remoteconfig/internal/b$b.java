package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class b$b
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

/* Location:
 * Qualified Name:     com.google.firebase.remoteconfig.internal.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */