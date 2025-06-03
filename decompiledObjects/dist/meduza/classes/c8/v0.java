package c8;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class v0
{
  public static final HashMap a;
  
  static
  {
    HashMap localHashMap = new HashMap();
    a = localHashMap;
    localHashMap.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
    localHashMap.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
    localHashMap.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
    localHashMap.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
    localHashMap.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
  }
  
  public static Status a(String paramString)
  {
    try
    {
      Object localObject1 = new org/json/JSONObject;
      ((JSONObject)localObject1).<init>(paramString);
      str = ((JSONObject)localObject1).getString("code");
      localObject1 = ((JSONObject)localObject1).getString("message");
      if ((!TextUtils.isEmpty(str)) && (!TextUtils.isEmpty((CharSequence)localObject1)))
      {
        Object localObject2 = a;
        if (((HashMap)localObject2).containsKey(str))
        {
          str = (String)((HashMap)localObject2).get(str);
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          ((StringBuilder)localObject2).append(str);
          ((StringBuilder)localObject2).append(":");
          ((StringBuilder)localObject2).append((String)localObject1);
          return p.a(((StringBuilder)localObject2).toString());
        }
      }
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("WEB_INTERNAL_ERROR:");
      ((StringBuilder)localObject1).append(paramString);
      localObject1 = p.a(((StringBuilder)localObject1).toString());
      return (Status)localObject1;
    }
    catch (JSONException localJSONException)
    {
      String str = localJSONException.getLocalizedMessage();
      StringBuilder localStringBuilder = new StringBuilder("WEB_INTERNAL_ERROR:");
      localStringBuilder.append(paramString);
      localStringBuilder.append("[ ");
      localStringBuilder.append(str);
      localStringBuilder.append(" ]");
      return p.a(localStringBuilder.toString());
    }
  }
}

/* Location:
 * Qualified Name:     c8.v0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */