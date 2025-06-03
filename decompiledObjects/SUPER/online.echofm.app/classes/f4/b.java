package f4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;
import org.json.JSONTokener;

public abstract class b
{
  public static Map a(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      paramString = h(localJSONObject);
      return paramString;
    }
    catch (JSONException paramString)
    {
      throw new IOException(paramString);
    }
  }
  
  public static Object b(String paramString)
  {
    try
    {
      JSONTokener localJSONTokener = new org/json/JSONTokener;
      localJSONTokener.<init>(paramString);
      paramString = f(localJSONTokener.nextValue());
      return paramString;
    }
    catch (JSONException paramString)
    {
      throw new IOException(paramString);
    }
  }
  
  public static String c(Map paramMap)
  {
    return d(paramMap);
  }
  
  public static String d(Object paramObject)
  {
    if (paramObject == null) {
      return "null";
    }
    if ((paramObject instanceof String)) {
      return JSONObject.quote((String)paramObject);
    }
    if ((paramObject instanceof Number)) {
      try
      {
        paramObject = JSONObject.numberToString((Number)paramObject);
        return (String)paramObject;
      }
      catch (JSONException paramObject)
      {
        throw new IOException("Could not serialize number", (Throwable)paramObject);
      }
    }
    if ((paramObject instanceof Boolean))
    {
      if (((Boolean)paramObject).booleanValue()) {
        paramObject = "true";
      } else {
        paramObject = "false";
      }
      return (String)paramObject;
    }
    try
    {
      JSONStringer localJSONStringer = new org/json/JSONStringer;
      localJSONStringer.<init>();
      e(paramObject, localJSONStringer);
      paramObject = localJSONStringer.toString();
      return (String)paramObject;
    }
    catch (JSONException paramObject)
    {
      throw new IOException("Failed to serialize JSON", (Throwable)paramObject);
    }
  }
  
  public static void e(Object paramObject, JSONStringer paramJSONStringer)
  {
    if ((paramObject instanceof Map))
    {
      paramJSONStringer.object();
      paramObject = ((Map)paramObject).entrySet().iterator();
      while (((Iterator)paramObject).hasNext())
      {
        Map.Entry localEntry = (Map.Entry)((Iterator)paramObject).next();
        paramJSONStringer.key((String)localEntry.getKey());
        e(localEntry.getValue(), paramJSONStringer);
      }
      paramJSONStringer.endObject();
    }
    else if ((paramObject instanceof Collection))
    {
      paramObject = (Collection)paramObject;
      paramJSONStringer.array();
      paramObject = ((Collection)paramObject).iterator();
      while (((Iterator)paramObject).hasNext()) {
        e(((Iterator)paramObject).next(), paramJSONStringer);
      }
      paramJSONStringer.endArray();
    }
    else
    {
      paramJSONStringer.value(paramObject);
    }
  }
  
  public static Object f(Object paramObject)
  {
    if ((paramObject instanceof JSONObject)) {
      return h((JSONObject)paramObject);
    }
    if ((paramObject instanceof JSONArray)) {
      return g((JSONArray)paramObject);
    }
    Object localObject = paramObject;
    if (paramObject.equals(JSONObject.NULL)) {
      localObject = null;
    }
    return localObject;
  }
  
  public static List g(JSONArray paramJSONArray)
  {
    ArrayList localArrayList = new ArrayList(paramJSONArray.length());
    for (int i = 0; i < paramJSONArray.length(); i++) {
      localArrayList.add(f(paramJSONArray.get(i)));
    }
    return localArrayList;
  }
  
  public static Map h(JSONObject paramJSONObject)
  {
    HashMap localHashMap = new HashMap(paramJSONObject.length());
    Iterator localIterator = paramJSONObject.keys();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localHashMap.put(str, f(paramJSONObject.get(str)));
    }
    return localHashMap;
  }
}

/* Location:
 * Qualified Name:     f4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */