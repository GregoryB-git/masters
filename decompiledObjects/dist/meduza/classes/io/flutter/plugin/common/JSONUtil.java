package io.flutter.plugin.common;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class JSONUtil
{
  public static Object unwrap(Object paramObject)
  {
    if ((JSONObject.NULL.equals(paramObject)) || (paramObject == null) || ((!(paramObject instanceof Boolean)) && (!(paramObject instanceof Byte)) && (!(paramObject instanceof Character)) && (!(paramObject instanceof Double)) && (!(paramObject instanceof Float)) && (!(paramObject instanceof Integer)) && (!(paramObject instanceof Long)) && (!(paramObject instanceof Short)) && (!(paramObject instanceof String)))) {}
    try
    {
      Object localObject;
      if ((paramObject instanceof JSONArray))
      {
        localObject = new java/util/ArrayList;
        ((ArrayList)localObject).<init>();
        paramObject = (JSONArray)paramObject;
        for (int i = 0; i < ((JSONArray)paramObject).length(); i++) {
          ((ArrayList)localObject).add(unwrap(((JSONArray)paramObject).get(i)));
        }
        return localObject;
      }
      if ((paramObject instanceof JSONObject))
      {
        localObject = new java/util/HashMap;
        ((HashMap)localObject).<init>();
        paramObject = (JSONObject)paramObject;
        Iterator localIterator = ((JSONObject)paramObject).keys();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          ((HashMap)localObject).put(str, unwrap(((JSONObject)paramObject).get(str)));
        }
        return localObject;
      }
    }
    catch (Exception paramObject)
    {
      for (;;) {}
    }
    return null;
    return paramObject;
    return null;
  }
  
  public static Object wrap(Object paramObject)
  {
    if (paramObject == null) {
      return JSONObject.NULL;
    }
    Object localObject = paramObject;
    if (!(paramObject instanceof JSONArray)) {
      if ((paramObject instanceof JSONObject)) {
        localObject = paramObject;
      } else if (paramObject.equals(JSONObject.NULL)) {
        return paramObject;
      }
    }
    try
    {
      if ((paramObject instanceof Collection))
      {
        localObject = new org/json/JSONArray;
        ((JSONArray)localObject).<init>();
        paramObject = ((Collection)paramObject).iterator();
        while (((Iterator)paramObject).hasNext()) {
          ((JSONArray)localObject).put(wrap(((Iterator)paramObject).next()));
        }
        return localObject;
      }
      if (paramObject.getClass().isArray())
      {
        localObject = new org/json/JSONArray;
        ((JSONArray)localObject).<init>();
        int i = Array.getLength(paramObject);
        for (int j = 0; j < i; j++) {
          ((JSONArray)localObject).put(wrap(Array.get(paramObject, j)));
        }
        return localObject;
      }
      if ((paramObject instanceof Map))
      {
        localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>();
        Iterator localIterator = ((Map)paramObject).entrySet().iterator();
        while (localIterator.hasNext())
        {
          paramObject = (Map.Entry)localIterator.next();
          ((JSONObject)localObject).put((String)((Map.Entry)paramObject).getKey(), wrap(((Map.Entry)paramObject).getValue()));
        }
        return localObject;
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
                      if ((paramObject instanceof String))
                      {
                        localObject = paramObject;
                      }
                      else
                      {
                        if (!paramObject.getClass().getPackage().getName().startsWith("java.")) {
                          break label334;
                        }
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
      label334:
      for (;;) {}
    }
    localObject = null;
    return localObject;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.common.JSONUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */