package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z2;

final class ClearKeyUtil
{
  private static final String TAG = "ClearKeyUtil";
  
  public static byte[] adjustRequestData(byte[] paramArrayOfByte)
  {
    if (Util.SDK_INT >= 27) {
      return paramArrayOfByte;
    }
    return Util.getUtf8Bytes(base64ToBase64Url(Util.fromUtf8Bytes(paramArrayOfByte)));
  }
  
  public static byte[] adjustResponseData(byte[] paramArrayOfByte)
  {
    if (Util.SDK_INT >= 27) {
      return paramArrayOfByte;
    }
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(Util.fromUtf8Bytes(paramArrayOfByte));
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("{\"keys\":[");
      JSONArray localJSONArray = localJSONObject.getJSONArray("keys");
      for (int i = 0; i < localJSONArray.length(); i++)
      {
        if (i != 0) {
          ((StringBuilder)localObject).append(",");
        }
        localJSONObject = localJSONArray.getJSONObject(i);
        ((StringBuilder)localObject).append("{\"k\":\"");
        ((StringBuilder)localObject).append(base64UrlToBase64(localJSONObject.getString("k")));
        ((StringBuilder)localObject).append("\",\"kid\":\"");
        ((StringBuilder)localObject).append(base64UrlToBase64(localJSONObject.getString("kid")));
        ((StringBuilder)localObject).append("\",\"kty\":\"");
        ((StringBuilder)localObject).append(localJSONObject.getString("kty"));
        ((StringBuilder)localObject).append("\"}");
      }
      ((StringBuilder)localObject).append("]}");
      localObject = Util.getUtf8Bytes(((StringBuilder)localObject).toString());
      return (byte[])localObject;
    }
    catch (JSONException localJSONException)
    {
      Object localObject = z2.t("Failed to adjust response data: ");
      ((StringBuilder)localObject).append(Util.fromUtf8Bytes(paramArrayOfByte));
      Log.e("ClearKeyUtil", ((StringBuilder)localObject).toString(), localJSONException);
    }
    return paramArrayOfByte;
  }
  
  private static String base64ToBase64Url(String paramString)
  {
    return paramString.replace('+', '-').replace('/', '_');
  }
  
  private static String base64UrlToBase64(String paramString)
  {
    return paramString.replace('-', '+').replace('_', '/');
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.drm.ClearKeyUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */