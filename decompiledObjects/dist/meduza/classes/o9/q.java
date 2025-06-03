package o9;

import ec.i;
import g;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class q
{
  public q()
  {
    new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US).setTimeZone(TimeZone.getTimeZone("UTC"));
  }
  
  public static Object a(Object paramObject)
  {
    if ((paramObject instanceof Number)) {
      return paramObject;
    }
    if ((paramObject instanceof String)) {
      return paramObject;
    }
    if ((paramObject instanceof Boolean)) {
      return paramObject;
    }
    Object localObject1;
    if ((paramObject instanceof JSONObject))
    {
      paramObject = (JSONObject)paramObject;
      if (((JSONObject)paramObject).has("@type"))
      {
        localObject1 = ((JSONObject)paramObject).optString("@type");
        localObject2 = ((JSONObject)paramObject).optString("value");
        long l;
        if (i.a(localObject1, "type.googleapis.com/google.protobuf.Int64Value")) {
          try
          {
            i.d(localObject2, "value");
            l = Long.parseLong((String)localObject2);
            return Long.valueOf(l);
          }
          catch (NumberFormatException paramObject)
          {
            throw new IllegalArgumentException(g.d("Invalid Long format:", (String)localObject2));
          }
        }
        if (i.a(localObject1, "type.googleapis.com/google.protobuf.UInt64Value")) {
          try
          {
            i.d(localObject2, "value");
            l = Long.parseLong((String)localObject2);
            return Long.valueOf(l);
          }
          catch (NumberFormatException paramObject)
          {
            throw new IllegalArgumentException(g.d("Invalid Long format:", (String)localObject2));
          }
        }
      }
      localObject2 = new HashMap();
      localObject1 = ((JSONObject)paramObject).keys();
      while (((Iterator)localObject1).hasNext())
      {
        String str = (String)((Iterator)localObject1).next();
        Object localObject3 = ((JSONObject)paramObject).opt(str);
        i.d(localObject3, "obj.opt(key)");
        localObject3 = a(localObject3);
        i.d(str, "key");
        ((HashMap)localObject2).put(str, localObject3);
      }
      return localObject2;
    }
    if ((paramObject instanceof JSONArray))
    {
      localObject2 = new ArrayList();
      int i = 0;
      localObject1 = (JSONArray)paramObject;
      int j = ((JSONArray)localObject1).length();
      while (i < j)
      {
        paramObject = ((JSONArray)localObject1).opt(i);
        i.d(paramObject, "obj.opt(i)");
        ((ArrayList)localObject2).add(a(paramObject));
        i++;
      }
      return localObject2;
    }
    if (paramObject == JSONObject.NULL) {
      return null;
    }
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("Object cannot be decoded from JSON: ");
    ((StringBuilder)localObject2).append(paramObject);
    throw new IllegalArgumentException(((StringBuilder)localObject2).toString());
  }
  
  public static Object b(Object paramObject)
  {
    if ((paramObject != null) && (paramObject != JSONObject.NULL))
    {
      if ((paramObject instanceof Long))
      {
        localObject1 = new JSONObject();
        try
        {
          ((JSONObject)localObject1).put("@type", "type.googleapis.com/google.protobuf.Int64Value");
          ((JSONObject)localObject1).put("value", String.valueOf(((Number)paramObject).longValue()));
          return localObject1;
        }
        catch (JSONException paramObject)
        {
          throw new RuntimeException("Error encoding Long.", (Throwable)paramObject);
        }
      }
      if ((paramObject instanceof Number)) {
        return paramObject;
      }
      if ((paramObject instanceof String)) {
        return paramObject;
      }
      if ((paramObject instanceof Boolean)) {
        return paramObject;
      }
      boolean bool1 = paramObject instanceof JSONObject;
      if (bool1) {
        return paramObject;
      }
      boolean bool2 = paramObject instanceof JSONArray;
      if (bool2) {
        return paramObject;
      }
      Object localObject2;
      Object localObject3;
      Object localObject4;
      if ((paramObject instanceof Map))
      {
        localObject1 = new JSONObject();
        localObject2 = (Map)paramObject;
        localObject3 = ((Map)localObject2).keySet().iterator();
        for (;;)
        {
          if (!((Iterator)localObject3).hasNext()) {
            break label230;
          }
          localObject4 = ((Iterator)localObject3).next();
          if ((localObject4 instanceof String))
          {
            paramObject = b(((Map)localObject2).get(localObject4));
            try
            {
              ((JSONObject)localObject1).put((String)localObject4, paramObject);
            }
            catch (JSONException paramObject)
            {
              throw new RuntimeException((Throwable)paramObject);
            }
          }
        }
        throw new IllegalArgumentException("Object keys must be strings.".toString());
        label230:
        return localObject1;
      }
      if ((paramObject instanceof List))
      {
        localObject1 = new JSONArray();
        paramObject = ((List)paramObject).iterator();
        while (((Iterator)paramObject).hasNext()) {
          ((JSONArray)localObject1).put(b(((Iterator)paramObject).next()));
        }
        return localObject1;
      }
      if (bool1)
      {
        localObject1 = new JSONObject();
        localObject3 = (JSONObject)paramObject;
        localObject2 = ((JSONObject)localObject3).keys();
        for (;;)
        {
          if (!((Iterator)localObject2).hasNext()) {
            break label377;
          }
          paramObject = (String)((Iterator)localObject2).next();
          if (paramObject != null)
          {
            localObject4 = b(((JSONObject)localObject3).opt((String)paramObject));
            try
            {
              ((JSONObject)localObject1).put((String)paramObject, localObject4);
            }
            catch (JSONException paramObject)
            {
              throw new RuntimeException((Throwable)paramObject);
            }
          }
        }
        throw new IllegalArgumentException("Object keys cannot be null.");
        label377:
        return localObject1;
      }
      if (bool2)
      {
        localObject1 = new JSONArray();
        int i = 0;
        paramObject = (JSONArray)paramObject;
        int j = ((JSONArray)paramObject).length();
        while (i < j)
        {
          ((JSONArray)localObject1).put(b(((JSONArray)paramObject).opt(i)));
          i++;
        }
        return localObject1;
      }
      Object localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Object cannot be encoded in JSON: ");
      ((StringBuilder)localObject1).append(paramObject);
      throw new IllegalArgumentException(((StringBuilder)localObject1).toString());
    }
    paramObject = JSONObject.NULL;
    i.d(paramObject, "NULL");
    return paramObject;
  }
}

/* Location:
 * Qualified Name:     o9.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */