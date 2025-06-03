package com.appsflyer.internal;

import androidx.annotation.NonNull;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

public final class AFb1fSDK$AFa1ySDK
{
  public final int AFInAppEventParameterName;
  public final String AFInAppEventType;
  public final int AFKeystoreWrapper;
  public final long valueOf;
  
  public AFb1fSDK$AFa1ySDK() {}
  
  public AFb1fSDK$AFa1ySDK(String paramString, int paramInt1, int paramInt2, long paramLong)
  {
    AFInAppEventType = paramString;
    AFInAppEventParameterName = paramInt1;
    AFKeystoreWrapper = paramInt2;
    valueOf = paramLong;
  }
  
  public static byte[] AFInAppEventParameterName(@NonNull byte[] paramArrayOfByte)
  {
    for (int i = 0; i < paramArrayOfByte.length; i++) {
      paramArrayOfByte[i] = ((byte)(byte)(paramArrayOfByte[i] ^ i % 2 + 42));
    }
    return paramArrayOfByte;
  }
  
  @NonNull
  public static byte[] valueOf(@NonNull String paramString)
  {
    return paramString.getBytes(Charset.defaultCharset());
  }
  
  public final String AFInAppEventType()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("sdk_ver", AFInAppEventType);
      localJSONObject.put("min", AFInAppEventParameterName);
      localJSONObject.put("expire", AFKeystoreWrapper);
      localJSONObject.put("ttl", valueOf);
      return localJSONObject.toString();
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (AFa1ySDK.class == paramObject.getClass()))
    {
      paramObject = (AFa1ySDK)paramObject;
      if ((AFInAppEventParameterName == AFInAppEventParameterName) && (AFKeystoreWrapper == AFKeystoreWrapper) && (valueOf == valueOf))
      {
        String str = AFInAppEventType;
        if ((str != null) && (str.equals(AFInAppEventType))) {
          return true;
        }
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    String str = AFInAppEventType;
    int i;
    if (str != null) {
      i = str.hashCode();
    } else {
      i = 0;
    }
    return ((i * 31 + AFInAppEventParameterName) * 31 + AFKeystoreWrapper) * 31 + (int)valueOf;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFb1fSDK.AFa1ySDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */