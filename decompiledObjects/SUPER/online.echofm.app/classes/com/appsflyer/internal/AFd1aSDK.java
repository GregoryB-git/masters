package com.appsflyer.internal;

import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AFd1aSDK
{
  public final AFe1sSDK AFInAppEventParameterName;
  public final AFb1fSDK.AFa1ySDK values;
  
  public AFd1aSDK() {}
  
  public AFd1aSDK(JSONObject paramJSONObject)
  {
    boolean bool = paramJSONObject.has("exc_mngr");
    localObject1 = null;
    if (bool) {}
    try
    {
      localObject2 = paramJSONObject.getJSONArray("exc_mngr").optJSONObject(0).optJSONObject("data");
      Objects.requireNonNull(localObject2);
      localObject2 = ((JSONObject)localObject2).optJSONObject("v1");
      localObject3 = ((JSONObject)localObject2).getString("sdk_ver");
      int i = ((JSONObject)localObject2).optInt("min", -1);
      int j = ((JSONObject)localObject2).optInt("expire", -1);
      long l = ((JSONObject)localObject2).optLong("ttl", -1L);
      localObject2 = new com/appsflyer/internal/AFb1fSDK$AFa1ySDK;
      ((AFb1fSDK.AFa1ySDK)localObject2).<init>((String)localObject3, i, j, l);
    }
    catch (JSONException|NullPointerException localJSONException)
    {
      try
      {
        Object localObject2;
        paramJSONObject = paramJSONObject.getJSONArray("meta_data").optJSONObject(0).optJSONObject("data");
        Objects.requireNonNull(paramJSONObject);
        double d = paramJSONObject.optJSONObject("v1").optDouble("send_rate", 1.0D);
        localObject3 = new com/appsflyer/internal/AFe1sSDK;
        ((AFe1sSDK)localObject3).<init>(d);
        values = ((AFb1fSDK.AFa1ySDK)localObject2);
        AFInAppEventParameterName = ((AFe1sSDK)localObject3);
        return;
        localJSONException = localJSONException;
      }
      catch (JSONException|NullPointerException paramJSONObject)
      {
        for (;;)
        {
          Object localObject3 = localObject1;
        }
      }
    }
    localObject2 = null;
    localObject3 = localObject1;
    if (!paramJSONObject.has("meta_data")) {}
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (AFd1aSDK.class == paramObject.getClass()))
    {
      paramObject = (AFd1aSDK)paramObject;
      Object localObject = values;
      if ((localObject != null) && (localObject.equals(values)))
      {
        localObject = AFInAppEventParameterName;
        if ((localObject != null) && (localObject.equals(AFInAppEventParameterName))) {
          return true;
        }
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    AFb1fSDK.AFa1ySDK localAFa1ySDK = values;
    if (localAFa1ySDK != null) {
      return localAFa1ySDK.hashCode();
    }
    return 0;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFd1aSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */