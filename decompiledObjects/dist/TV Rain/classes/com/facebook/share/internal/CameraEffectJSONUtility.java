package com.facebook.share.internal;

import com.facebook.share.model.CameraEffectArguments;
import com.facebook.share.model.CameraEffectArguments.Builder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z2;

public class CameraEffectJSONUtility
{
  private static final Map<Class<?>, Setter> SETTERS;
  
  static
  {
    HashMap localHashMap = new HashMap();
    SETTERS = localHashMap;
    localHashMap.put(String.class, new Setter()
    {
      public void setOnArgumentsBuilder(CameraEffectArguments.Builder paramAnonymousBuilder, String paramAnonymousString, Object paramAnonymousObject)
        throws JSONException
      {
        paramAnonymousBuilder.putArgument(paramAnonymousString, (String)paramAnonymousObject);
      }
      
      public void setOnJSON(JSONObject paramAnonymousJSONObject, String paramAnonymousString, Object paramAnonymousObject)
        throws JSONException
      {
        paramAnonymousJSONObject.put(paramAnonymousString, paramAnonymousObject);
      }
    });
    localHashMap.put(String[].class, new Setter()
    {
      public void setOnArgumentsBuilder(CameraEffectArguments.Builder paramAnonymousBuilder, String paramAnonymousString, Object paramAnonymousObject)
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
      public void setOnArgumentsBuilder(CameraEffectArguments.Builder paramAnonymousBuilder, String paramAnonymousString, Object paramAnonymousObject)
        throws JSONException
      {
        JSONArray localJSONArray = (JSONArray)paramAnonymousObject;
        String[] arrayOfString = new String[localJSONArray.length()];
        int i = 0;
        while (i < localJSONArray.length())
        {
          paramAnonymousObject = localJSONArray.get(i);
          if ((paramAnonymousObject instanceof String))
          {
            arrayOfString[i] = ((String)paramAnonymousObject);
            i++;
          }
          else
          {
            paramAnonymousBuilder = z2.t("Unexpected type in an array: ");
            paramAnonymousBuilder.append(paramAnonymousObject.getClass());
            throw new IllegalArgumentException(paramAnonymousBuilder.toString());
          }
        }
        paramAnonymousBuilder.putArgument(paramAnonymousString, arrayOfString);
      }
      
      public void setOnJSON(JSONObject paramAnonymousJSONObject, String paramAnonymousString, Object paramAnonymousObject)
        throws JSONException
      {
        throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
      }
    });
  }
  
  public static CameraEffectArguments convertToCameraEffectArguments(JSONObject paramJSONObject)
    throws JSONException
  {
    if (paramJSONObject == null) {
      return null;
    }
    CameraEffectArguments.Builder localBuilder = new CameraEffectArguments.Builder();
    Iterator localIterator = paramJSONObject.keys();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = paramJSONObject.get(str);
      if ((localObject != null) && (localObject != JSONObject.NULL))
      {
        Setter localSetter = (Setter)SETTERS.get(localObject.getClass());
        if (localSetter != null)
        {
          localSetter.setOnArgumentsBuilder(localBuilder, str, localObject);
        }
        else
        {
          paramJSONObject = z2.t("Unsupported type: ");
          paramJSONObject.append(localObject.getClass());
          throw new IllegalArgumentException(paramJSONObject.toString());
        }
      }
    }
    return localBuilder.build();
  }
  
  public static JSONObject convertToJSON(CameraEffectArguments paramCameraEffectArguments)
    throws JSONException
  {
    if (paramCameraEffectArguments == null) {
      return null;
    }
    JSONObject localJSONObject = new JSONObject();
    Iterator localIterator = paramCameraEffectArguments.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = paramCameraEffectArguments.get(str);
      if (localObject != null)
      {
        Setter localSetter = (Setter)SETTERS.get(localObject.getClass());
        if (localSetter != null)
        {
          localSetter.setOnJSON(localJSONObject, str, localObject);
        }
        else
        {
          paramCameraEffectArguments = z2.t("Unsupported type: ");
          paramCameraEffectArguments.append(localObject.getClass());
          throw new IllegalArgumentException(paramCameraEffectArguments.toString());
        }
      }
    }
    return localJSONObject;
  }
  
  public static abstract interface Setter
  {
    public abstract void setOnArgumentsBuilder(CameraEffectArguments.Builder paramBuilder, String paramString, Object paramObject)
      throws JSONException;
    
    public abstract void setOnJSON(JSONObject paramJSONObject, String paramString, Object paramObject)
      throws JSONException;
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.CameraEffectJSONUtility
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */