package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class AFc1rSDK
  implements AFc1hSDK<Map<String, Object>>
{
  public static Map<String, Object> AFKeystoreWrapper(String paramString)
  {
    try
    {
      HashMap localHashMap1 = new java/util/HashMap;
      localHashMap1.<init>();
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      Iterator localIterator = localJSONObject.keys();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        Object localObject;
        if (localJSONObject.isNull(str)) {
          localObject = null;
        } else {
          localObject = localJSONObject.get(str);
        }
        localHashMap1.put(str, localObject);
      }
      label98:
      HashMap localHashMap2;
      return paramString;
    }
    catch (JSONException localJSONException)
    {
      break label98;
      localHashMap1.remove("is_cache");
      return localHashMap1;
      AFLogger.afErrorLogForExcManagerOnly("error while paring GCD response", localJSONException);
      localHashMap2 = new HashMap();
      localHashMap2.put("string_response", paramString);
      paramString = localHashMap2;
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFc1rSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */