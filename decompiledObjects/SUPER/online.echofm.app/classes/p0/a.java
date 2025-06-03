package p0;

import g0.M;
import g0.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class a
{
  public static byte[] a(byte[] paramArrayOfByte)
  {
    if (M.a >= 27) {
      return paramArrayOfByte;
    }
    return M.r0(c(M.H(paramArrayOfByte)));
  }
  
  public static byte[] b(byte[] paramArrayOfByte)
  {
    if (M.a >= 27) {
      return paramArrayOfByte;
    }
    for (;;)
    {
      int i;
      try
      {
        Object localObject1 = new org/json/JSONObject;
        ((JSONObject)localObject1).<init>(M.H(paramArrayOfByte));
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("{\"keys\":[");
        localObject1 = ((JSONObject)localObject1).getJSONArray("keys");
        i = 0;
        if (i >= ((JSONArray)localObject1).length()) {
          break;
        }
        if (i != 0) {
          ((StringBuilder)localObject2).append(",");
        }
      }
      catch (JSONException localJSONException)
      {
        break label167;
      }
      JSONObject localJSONObject = localJSONException.getJSONObject(i);
      ((StringBuilder)localObject2).append("{\"k\":\"");
      ((StringBuilder)localObject2).append(d(localJSONObject.getString("k")));
      ((StringBuilder)localObject2).append("\",\"kid\":\"");
      ((StringBuilder)localObject2).append(d(localJSONObject.getString("kid")));
      ((StringBuilder)localObject2).append("\",\"kty\":\"");
      ((StringBuilder)localObject2).append(localJSONObject.getString("kty"));
      ((StringBuilder)localObject2).append("\"}");
      i++;
    }
    ((StringBuilder)localObject2).append("]}");
    Object localObject2 = M.r0(((StringBuilder)localObject2).toString());
    return (byte[])localObject2;
    label167:
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("Failed to adjust response data: ");
    ((StringBuilder)localObject2).append(M.H(paramArrayOfByte));
    o.d("ClearKeyUtil", ((StringBuilder)localObject2).toString(), localJSONException);
    return paramArrayOfByte;
  }
  
  public static String c(String paramString)
  {
    return paramString.replace('+', '-').replace('/', '_');
  }
  
  public static String d(String paramString)
  {
    return paramString.replace('-', '+').replace('_', '/');
  }
}

/* Location:
 * Qualified Name:     p0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */