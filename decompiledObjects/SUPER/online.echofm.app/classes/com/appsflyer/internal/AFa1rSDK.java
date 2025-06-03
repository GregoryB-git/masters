package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AFa1rSDK
{
  public String AFInAppEventParameterName;
  public AFd1vSDK AFInAppEventType;
  String AFKeystoreWrapper;
  public String valueOf;
  private byte[] values;
  
  public AFa1rSDK() {}
  
  public AFa1rSDK(String paramString1, byte[] paramArrayOfByte, String paramString2, AFd1vSDK paramAFd1vSDK)
  {
    valueOf = paramString1;
    values = paramArrayOfByte;
    AFKeystoreWrapper = paramString2;
    AFInAppEventType = paramAFd1vSDK;
  }
  
  public AFa1rSDK(char[] paramArrayOfChar)
  {
    Scanner localScanner = new Scanner(new String(paramArrayOfChar));
    int i = 0;
    int j = 0;
    while (localScanner.hasNextLine())
    {
      paramArrayOfChar = localScanner.nextLine();
      if (paramArrayOfChar.startsWith("url="))
      {
        valueOf = paramArrayOfChar.substring(4).trim();
      }
      else if (paramArrayOfChar.startsWith("version="))
      {
        AFKeystoreWrapper = paramArrayOfChar.substring(8).trim();
        paramArrayOfChar = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$").matcher(AFKeystoreWrapper);
        if (paramArrayOfChar.matches())
        {
          i = Integer.parseInt(paramArrayOfChar.group(1));
          j = Integer.parseInt(paramArrayOfChar.group(2));
        }
      }
      else if (paramArrayOfChar.startsWith("data="))
      {
        paramArrayOfChar = paramArrayOfChar.substring(5).trim();
        if ((i <= 4) && (j < 11)) {
          paramArrayOfChar = paramArrayOfChar.getBytes(Charset.defaultCharset());
        } else {
          paramArrayOfChar = Base64.decode(paramArrayOfChar, 2);
        }
        values = paramArrayOfChar;
      }
      else if (paramArrayOfChar.startsWith("type="))
      {
        String str = paramArrayOfChar.substring(5).trim();
        try
        {
          AFInAppEventType = AFd1vSDK.valueOf(str);
        }
        catch (Exception paramArrayOfChar)
        {
          AFLogger.afErrorLog("CACHE: Unknown task type: ".concat(String.valueOf(str)), paramArrayOfChar);
        }
      }
    }
    localScanner.close();
  }
  
  public static AFe1tSDK AFInAppEventParameterName(Context paramContext)
  {
    if ((paramContext instanceof Activity)) {
      paramContext = AFe1tSDK.AFInAppEventType;
    } else if ((paramContext instanceof Application)) {
      paramContext = AFe1tSDK.AFInAppEventParameterName;
    } else {
      paramContext = AFe1tSDK.values;
    }
    return paramContext;
  }
  
  private static Object AFInAppEventType(Object paramObject)
  {
    if (paramObject == null) {
      return JSONObject.NULL;
    }
    Object localObject = paramObject;
    if (!(paramObject instanceof JSONArray)) {
      if ((paramObject instanceof JSONObject))
      {
        localObject = paramObject;
      }
      else
      {
        if (paramObject.equals(JSONObject.NULL)) {
          return paramObject;
        }
        try
        {
          if ((paramObject instanceof Collection))
          {
            localObject = new org/json/JSONArray;
            ((JSONArray)localObject).<init>();
            paramObject = ((Collection)paramObject).iterator();
            while (((Iterator)paramObject).hasNext()) {
              ((JSONArray)localObject).put(AFInAppEventType(((Iterator)paramObject).next()));
            }
            return localObject;
          }
          if (paramObject.getClass().isArray())
          {
            int i = Array.getLength(paramObject);
            localObject = new org/json/JSONArray;
            ((JSONArray)localObject).<init>();
            for (int j = 0; j < i; j++) {
              ((JSONArray)localObject).put(AFInAppEventType(Array.get(paramObject, j)));
            }
            return localObject;
          }
          if ((paramObject instanceof Map))
          {
            paramObject = AFInAppEventType((Map)paramObject);
            return paramObject;
          }
          localObject = paramObject;
          if (!(paramObject instanceof Boolean))
          {
            localObject = paramObject;
            if (!(paramObject instanceof Byte))
            {
              localObject = paramObject;
              if (!(paramObject instanceof Character))
              {
                localObject = paramObject;
                if (!(paramObject instanceof Double))
                {
                  localObject = paramObject;
                  if (!(paramObject instanceof Float))
                  {
                    localObject = paramObject;
                    if (!(paramObject instanceof Integer))
                    {
                      localObject = paramObject;
                      if (!(paramObject instanceof Long))
                      {
                        localObject = paramObject;
                        if (!(paramObject instanceof Short)) {
                          if ((paramObject instanceof String)) {
                            localObject = paramObject;
                          } else {
                            localObject = paramObject.toString();
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          return localObject;
        }
        catch (Exception paramObject)
        {
          localObject = JSONObject.NULL;
        }
      }
    }
    return localObject;
  }
  
  private static List<Object> AFInAppEventType(JSONArray paramJSONArray)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramJSONArray.length(); i++)
    {
      Object localObject1 = paramJSONArray.get(i);
      Object localObject2;
      if ((localObject1 instanceof JSONArray))
      {
        localObject2 = AFInAppEventType((JSONArray)localObject1);
      }
      else
      {
        localObject2 = localObject1;
        if ((localObject1 instanceof JSONObject)) {
          localObject2 = valueOf((JSONObject)localObject1);
        }
      }
      localArrayList.add(localObject2);
    }
    return localArrayList;
  }
  
  public static JSONObject AFInAppEventType(Map<String, ?> paramMap)
  {
    JSONObject localJSONObject = new JSONObject();
    paramMap = paramMap.entrySet().iterator();
    for (;;)
    {
      Map.Entry localEntry;
      Object localObject;
      if (paramMap.hasNext())
      {
        localEntry = (Map.Entry)paramMap.next();
        localObject = AFInAppEventType(localEntry.getValue());
      }
      try
      {
        localJSONObject.put((String)localEntry.getKey(), localObject);
      }
      catch (JSONException localJSONException) {}
      return localJSONObject;
    }
  }
  
  public static Map<String, Object> valueOf(@NonNull JSONObject paramJSONObject)
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
        localObject2 = AFInAppEventType((JSONArray)localObject1);
      }
      else
      {
        localObject2 = localObject1;
        if ((localObject1 instanceof JSONObject)) {
          localObject2 = valueOf((JSONObject)localObject1);
        }
      }
      localHashMap.put(str, localObject2);
    }
    return localHashMap;
  }
  
  public static JSONObject valueOf(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    try
    {
      paramString = new JSONObject(paramString);
      return paramString;
    }
    catch (JSONException paramString) {}
    return null;
  }
  
  public final byte[] AFInAppEventType()
  {
    return values;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (AFa1rSDK.class == paramObject.getClass()))
    {
      paramObject = (AFa1rSDK)paramObject;
      String str = AFKeystoreWrapper;
      if (str != null ? !str.equals(AFKeystoreWrapper) : AFKeystoreWrapper != null) {
        return false;
      }
      if (!Arrays.equals(values, values)) {
        return false;
      }
      str = valueOf;
      if (str != null ? !str.equals(valueOf) : valueOf != null) {
        return false;
      }
      str = AFInAppEventParameterName;
      if (str != null ? !str.equals(AFInAppEventParameterName) : AFInAppEventParameterName != null) {
        return false;
      }
      if (AFInAppEventType == AFInAppEventType) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    Object localObject = AFKeystoreWrapper;
    int i = 0;
    int j;
    if (localObject != null) {
      j = localObject.hashCode();
    } else {
      j = 0;
    }
    int k = Arrays.hashCode(values);
    localObject = valueOf;
    int m;
    if (localObject != null) {
      m = localObject.hashCode();
    } else {
      m = 0;
    }
    localObject = AFInAppEventParameterName;
    int n;
    if (localObject != null) {
      n = localObject.hashCode();
    } else {
      n = 0;
    }
    localObject = AFInAppEventType;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return (((j * 31 + k) * 31 + m) * 31 + n) * 31 + i;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFa1rSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */