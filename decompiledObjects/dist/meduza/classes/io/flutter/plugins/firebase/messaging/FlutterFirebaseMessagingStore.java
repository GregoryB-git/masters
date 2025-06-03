package io.flutter.plugins.firebase.messaging;

import aa.z;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FlutterFirebaseMessagingStore
{
  private static final String KEY_NOTIFICATION_IDS = "notification_ids";
  private static final int MAX_SIZE_NOTIFICATIONS = 100;
  private static final String PREFERENCES_FILE = "io.flutter.plugins.firebase.messaging";
  private static FlutterFirebaseMessagingStore instance;
  private final String DELIMITER = ",";
  private SharedPreferences preferences;
  
  public static FlutterFirebaseMessagingStore getInstance()
  {
    if (instance == null) {
      instance = new FlutterFirebaseMessagingStore();
    }
    return instance;
  }
  
  private SharedPreferences getPreferences()
  {
    if (preferences == null) {
      preferences = ContextHolder.getApplicationContext().getSharedPreferences("io.flutter.plugins.firebase.messaging", 0);
    }
    return preferences;
  }
  
  private Map<String, Object> jsonObjectToMap(JSONObject paramJSONObject)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramJSONObject.keys();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject1 = paramJSONObject.get(str);
      Object localObject2;
      if ((localObject1 instanceof JSONArray))
      {
        localObject2 = jsonArrayToList((JSONArray)localObject1);
      }
      else
      {
        localObject2 = localObject1;
        if ((localObject1 instanceof JSONObject)) {
          localObject2 = jsonObjectToMap((JSONObject)localObject1);
        }
      }
      localHashMap.put(str, localObject2);
    }
    return localHashMap;
  }
  
  public Map<String, Object> getFirebaseMessageMap(String paramString)
  {
    String str = getPreferencesStringValue(paramString, null);
    if (str != null) {
      try
      {
        HashMap localHashMap = new java/util/HashMap;
        localHashMap.<init>(1);
        Object localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(str);
        localObject = jsonObjectToMap((JSONObject)localObject);
        ((Map)localObject).put("to", paramString);
        localHashMap.put("message", localObject);
        return localHashMap;
      }
      catch (JSONException paramString)
      {
        paramString.printStackTrace();
      }
    }
    return null;
  }
  
  public String getPreferencesStringValue(String paramString1, String paramString2)
  {
    return getPreferences().getString(paramString1, paramString2);
  }
  
  public List<Object> jsonArrayToList(JSONArray paramJSONArray)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramJSONArray.length(); i++)
    {
      Object localObject1 = paramJSONArray.get(i);
      Object localObject2;
      if ((localObject1 instanceof JSONArray))
      {
        localObject2 = jsonArrayToList((JSONArray)localObject1);
      }
      else
      {
        localObject2 = localObject1;
        if ((localObject1 instanceof JSONObject)) {
          localObject2 = jsonObjectToMap((JSONObject)localObject1);
        }
      }
      localArrayList.add(localObject2);
    }
    return localArrayList;
  }
  
  public void removeFirebaseMessage(String paramString)
  {
    getPreferences().edit().remove(paramString).apply();
    String str = getPreferencesStringValue("notification_ids", "");
    if (!str.isEmpty())
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString);
      localStringBuilder.append(",");
      setPreferencesStringValue("notification_ids", str.replace(localStringBuilder.toString(), ""));
    }
  }
  
  public void setPreferencesStringValue(String paramString1, String paramString2)
  {
    getPreferences().edit().putString(paramString1, paramString2).apply();
  }
  
  public void storeFirebaseMessage(z paramz)
  {
    Object localObject1 = new JSONObject(FlutterFirebaseMessagingUtils.remoteMessageToMap(paramz)).toString();
    setPreferencesStringValue(paramz.E(), (String)localObject1);
    localObject1 = f.l(getPreferencesStringValue("notification_ids", ""));
    ((StringBuilder)localObject1).append(paramz.E());
    ((StringBuilder)localObject1).append(",");
    localObject1 = ((StringBuilder)localObject1).toString();
    Object localObject2 = new ArrayList(Arrays.asList(((String)localObject1).split(",")));
    paramz = (z)localObject1;
    if (((ArrayList)localObject2).size() > 100)
    {
      paramz = (String)((ArrayList)localObject2).get(0);
      getPreferences().edit().remove(paramz).apply();
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append(paramz);
      ((StringBuilder)localObject2).append(",");
      paramz = ((String)localObject1).replace(((StringBuilder)localObject2).toString(), "");
    }
    setPreferencesStringValue("notification_ids", paramz);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingStore
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */