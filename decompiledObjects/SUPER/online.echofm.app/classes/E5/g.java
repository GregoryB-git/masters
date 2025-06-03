package E5;

import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class g
  implements l
{
  public static final g a = new g();
  
  public ByteBuffer a(Object paramObject)
  {
    return f.a.a(new JSONArray().put(h.a(paramObject)));
  }
  
  public ByteBuffer b(String paramString1, String paramString2, Object paramObject, String paramString3)
  {
    return f.a.a(new JSONArray().put(paramString1).put(h.a(paramString2)).put(h.a(paramObject)).put(h.a(paramString3)));
  }
  
  public ByteBuffer c(j paramj)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject.put("method", a);
      localJSONObject.put("args", h.a(b));
      paramj = f.a.a(localJSONObject);
      return paramj;
    }
    catch (JSONException paramj)
    {
      throw new IllegalArgumentException("Invalid JSON", paramj);
    }
  }
  
  public ByteBuffer d(String paramString1, String paramString2, Object paramObject)
  {
    return f.a.a(new JSONArray().put(paramString1).put(h.a(paramString2)).put(h.a(paramObject)));
  }
  
  public j e(ByteBuffer paramByteBuffer)
  {
    try
    {
      paramByteBuffer = f.a.b(paramByteBuffer);
      if ((paramByteBuffer instanceof JSONObject))
      {
        localObject1 = (JSONObject)paramByteBuffer;
        localObject2 = ((JSONObject)localObject1).get("method");
        localObject1 = g(((JSONObject)localObject1).opt("args"));
        if ((localObject2 instanceof String)) {
          return new j((String)localObject2, localObject1);
        }
      }
    }
    catch (JSONException paramByteBuffer)
    {
      break label97;
      Object localObject2 = new java/lang/IllegalArgumentException;
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append("Invalid method call: ");
      ((StringBuilder)localObject1).append(paramByteBuffer);
      ((IllegalArgumentException)localObject2).<init>(((StringBuilder)localObject1).toString());
      throw ((Throwable)localObject2);
      label97:
      throw new IllegalArgumentException("Invalid JSON", paramByteBuffer);
    }
  }
  
  public Object f(ByteBuffer paramByteBuffer)
  {
    try
    {
      paramByteBuffer = f.a.b(paramByteBuffer);
      if ((paramByteBuffer instanceof JSONArray))
      {
        localObject1 = (JSONArray)paramByteBuffer;
        if (((JSONArray)localObject1).length() == 1) {
          return g(((JSONArray)localObject1).opt(0));
        }
      }
    }
    catch (JSONException paramByteBuffer)
    {
      Object localObject1;
      break label155;
      if (((JSONArray)localObject1).length() == 3)
      {
        localObject2 = ((JSONArray)localObject1).get(0);
        localObject3 = g(((JSONArray)localObject1).opt(1));
        localObject1 = g(((JSONArray)localObject1).opt(2));
        if (((localObject2 instanceof String)) && ((localObject3 == null) || ((localObject3 instanceof String))))
        {
          paramByteBuffer = new E5/e;
          paramByteBuffer.<init>((String)localObject2, (String)localObject3, localObject1);
          throw paramByteBuffer;
        }
      }
      Object localObject3 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("Invalid envelope: ");
      ((StringBuilder)localObject2).append(paramByteBuffer);
      ((IllegalArgumentException)localObject3).<init>(((StringBuilder)localObject2).toString());
      throw ((Throwable)localObject3);
      label155:
      throw new IllegalArgumentException("Invalid JSON", paramByteBuffer);
    }
  }
  
  public Object g(Object paramObject)
  {
    Object localObject = paramObject;
    if (paramObject == JSONObject.NULL) {
      localObject = null;
    }
    return localObject;
  }
}

/* Location:
 * Qualified Name:     E5.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */