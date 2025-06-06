package com.facebook.internal;

import android.os.BaseBundle;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z2;

public class BundleJSONConverter
{
  private static final Map<Class<?>, Setter> SETTERS;
  
  static
  {
    HashMap localHashMap = new HashMap();
    SETTERS = localHashMap;
    localHashMap.put(Boolean.class, new Setter()
    {
      public void setOnBundle(Bundle paramAnonymousBundle, String paramAnonymousString, Object paramAnonymousObject)
        throws JSONException
      {
        paramAnonymousBundle.putBoolean(paramAnonymousString, ((Boolean)paramAnonymousObject).booleanValue());
      }
      
      public void setOnJSON(JSONObject paramAnonymousJSONObject, String paramAnonymousString, Object paramAnonymousObject)
        throws JSONException
      {
        paramAnonymousJSONObject.put(paramAnonymousString, paramAnonymousObject);
      }
    });
    localHashMap.put(Integer.class, new Setter()
    {
      public void setOnBundle(Bundle paramAnonymousBundle, String paramAnonymousString, Object paramAnonymousObject)
        throws JSONException
      {
        paramAnonymousBundle.putInt(paramAnonymousString, ((Integer)paramAnonymousObject).intValue());
      }
      
      public void setOnJSON(JSONObject paramAnonymousJSONObject, String paramAnonymousString, Object paramAnonymousObject)
        throws JSONException
      {
        paramAnonymousJSONObject.put(paramAnonymousString, paramAnonymousObject);
      }
    });
    localHashMap.put(Long.class, new Setter()
    {
      public void setOnBundle(Bundle paramAnonymousBundle, String paramAnonymousString, Object paramAnonymousObject)
        throws JSONException
      {
        paramAnonymousBundle.putLong(paramAnonymousString, ((Long)paramAnonymousObject).longValue());
      }
      
      public void setOnJSON(JSONObject paramAnonymousJSONObject, String paramAnonymousString, Object paramAnonymousObject)
        throws JSONException
      {
        paramAnonymousJSONObject.put(paramAnonymousString, paramAnonymousObject);
      }
    });
    localHashMap.put(Double.class, new Setter()
    {
      public void setOnBundle(Bundle paramAnonymousBundle, String paramAnonymousString, Object paramAnonymousObject)
        throws JSONException
      {
        paramAnonymousBundle.putDouble(paramAnonymousString, ((Double)paramAnonymousObject).doubleValue());
      }
      
      public void setOnJSON(JSONObject paramAnonymousJSONObject, String paramAnonymousString, Object paramAnonymousObject)
        throws JSONException
      {
        paramAnonymousJSONObject.put(paramAnonymousString, paramAnonymousObject);
      }
    });
    localHashMap.put(String.class, new Setter()
    {
      public void setOnBundle(Bundle paramAnonymousBundle, String paramAnonymousString, Object paramAnonymousObject)
        throws JSONException
      {
        paramAnonymousBundle.putString(paramAnonymousString, (String)paramAnonymousObject);
      }
      
      public void setOnJSON(JSONObject paramAnonymousJSONObject, String paramAnonymousString, Object paramAnonymousObject)
        throws JSONException
      {
        paramAnonymousJSONObject.put(paramAnonymousString, paramAnonymousObject);
      }
    });
    localHashMap.put(String[].class, new Setter()
    {
      public void setOnBundle(Bundle paramAnonymousBundle, String paramAnonymousString, Object paramAnonymousObject)
        throws JSONException
      {
        throw new IllegalArgumentException("Unexpected type from JSON");
      }
      
      public void setOnJSON(JSONObject paramAnonymousJSONObject, String paramAnonymousString, Object paramAnonymousObject)
        throws JSONException
      {
        JSONArray localJSONArray = new JSONArray();
        paramAnonymousObject = (String[])paramAnonymousObject;
        int i = paramAnonymousObject.length;
        for (int j = 0; j < i; j++) {
          localJSONArray.put(paramAnonymousObject[j]);
        }
        paramAnonymousJSONObject.put(paramAnonymousString, localJSONArray);
      }
    });
    localHashMap.put(JSONArray.class, new Setter()
    {
      public void setOnBundle(Bundle paramAnonymousBundle, String paramAnonymousString, Object paramAnonymousObject)
        throws JSONException
      {
        JSONArray localJSONArray = (JSONArray)paramAnonymousObject;
        ArrayList localArrayList = new ArrayList();
        if (localJSONArray.length() == 0)
        {
          paramAnonymousBundle.putStringArrayList(paramAnonymousString, localArrayList);
          return;
        }
        int i = 0;
        while (i < localJSONArray.length())
        {
          paramAnonymousObject = localJSONArray.get(i);
          if ((paramAnonymousObject instanceof String))
          {
            localArrayList.add((String)paramAnonymousObject);
            i++;
          }
          else
          {
            paramAnonymousBundle = z2.t("Unexpected type in an array: ");
            paramAnonymousBundle.append(paramAnonymousObject.getClass());
            throw new IllegalArgumentException(paramAnonymousBundle.toString());
          }
        }
        paramAnonymousBundle.putStringArrayList(paramAnonymousString, localArrayList);
      }
      
      public void setOnJSON(JSONObject paramAnonymousJSONObject, String paramAnonymousString, Object paramAnonymousObject)
        throws JSONException
      {
        throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
      }
    });
  }
  
  public static Bundle convertToBundle(JSONObject paramJSONObject)
    throws JSONException
  {
    Bundle localBundle = new Bundle();
    Iterator localIterator = paramJSONObject.keys();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = paramJSONObject.get(str);
      if ((localObject != null) && (localObject != JSONObject.NULL)) {
        if ((localObject instanceof JSONObject))
        {
          localBundle.putBundle(str, convertToBundle((JSONObject)localObject));
        }
        else
        {
          Setter localSetter = (Setter)SETTERS.get(localObject.getClass());
          if (localSetter != null)
          {
            localSetter.setOnBundle(localBundle, str, localObject);
          }
          else
          {
            paramJSONObject = z2.t("Unsupported type: ");
            paramJSONObject.append(localObject.getClass());
            throw new IllegalArgumentException(paramJSONObject.toString());
          }
        }
      }
    }
    return localBundle;
  }
  
  public static JSONObject convertToJSON(Bundle paramBundle)
    throws JSONException
  {
    JSONObject localJSONObject = new JSONObject();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject1 = paramBundle.get(str);
      if (localObject1 != null)
      {
        Object localObject2;
        if ((localObject1 instanceof List))
        {
          localObject2 = new JSONArray();
          localObject1 = ((List)localObject1).iterator();
          while (((Iterator)localObject1).hasNext()) {
            ((JSONArray)localObject2).put((String)((Iterator)localObject1).next());
          }
          localJSONObject.put(str, localObject2);
        }
        else if ((localObject1 instanceof Bundle))
        {
          localJSONObject.put(str, convertToJSON((Bundle)localObject1));
        }
        else
        {
          localObject2 = (Setter)SETTERS.get(localObject1.getClass());
          if (localObject2 != null)
          {
            ((Setter)localObject2).setOnJSON(localJSONObject, str, localObject1);
          }
          else
          {
            paramBundle = z2.t("Unsupported type: ");
            paramBundle.append(localObject1.getClass());
            throw new IllegalArgumentException(paramBundle.toString());
          }
        }
      }
    }
    return localJSONObject;
  }
  
  public static abstract interface Setter
  {
    public abstract void setOnBundle(Bundle paramBundle, String paramString, Object paramObject)
      throws JSONException;
    
    public abstract void setOnJSON(JSONObject paramJSONObject, String paramString, Object paramObject)
      throws JSONException;
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.BundleJSONConverter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */