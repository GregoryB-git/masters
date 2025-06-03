package com.pichillilorenzo.flutter_inappwebview_android.types;

import a0.j;
import f;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class URLRequest
{
  private byte[] body;
  private Map<String, String> headers;
  private String method;
  private String url;
  
  public URLRequest(String paramString1, String paramString2, byte[] paramArrayOfByte, Map<String, String> paramMap)
  {
    url = paramString1;
    method = paramString2;
    body = paramArrayOfByte;
    headers = paramMap;
  }
  
  public static URLRequest fromMap(Map<String, Object> paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    String str1 = (String)paramMap.get("url");
    String str2 = str1;
    if (str1 == null) {
      str2 = "about:blank";
    }
    return new URLRequest(str2, (String)paramMap.get("method"), (byte[])paramMap.get("body"), (Map)paramMap.get("headers"));
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (URLRequest)paramObject;
      Object localObject = url;
      if (localObject != null ? !((String)localObject).equals(url) : url != null) {
        return false;
      }
      localObject = method;
      if (localObject != null ? !((String)localObject).equals(method) : method != null) {
        return false;
      }
      if (!Arrays.equals(body, body)) {
        return false;
      }
      localObject = headers;
      paramObject = headers;
      if (localObject != null) {
        bool = ((Map)localObject).equals(paramObject);
      } else if (paramObject != null) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public byte[] getBody()
  {
    return body;
  }
  
  public Map<String, String> getHeaders()
  {
    return headers;
  }
  
  public String getMethod()
  {
    return method;
  }
  
  public String getUrl()
  {
    return url;
  }
  
  public int hashCode()
  {
    Object localObject = url;
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((String)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = method;
    int k;
    if (localObject != null) {
      k = ((String)localObject).hashCode();
    } else {
      k = 0;
    }
    int m = Arrays.hashCode(body);
    localObject = headers;
    if (localObject != null) {
      i = ((Map)localObject).hashCode();
    }
    return (m + (j * 31 + k) * 31) * 31 + i;
  }
  
  public void setBody(byte[] paramArrayOfByte)
  {
    body = paramArrayOfByte;
  }
  
  public void setHeaders(Map<String, String> paramMap)
  {
    headers = paramMap;
  }
  
  public void setMethod(String paramString)
  {
    method = paramString;
  }
  
  public void setUrl(String paramString)
  {
    url = paramString;
  }
  
  public Map<String, Object> toMap()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("url", url);
    localHashMap.put("method", method);
    localHashMap.put("headers", headers);
    localHashMap.put("body", body);
    localHashMap.put("allowsCellularAccess", null);
    localHashMap.put("allowsConstrainedNetworkAccess", null);
    localHashMap.put("allowsExpensiveNetworkAccess", null);
    localHashMap.put("cachePolicy", null);
    localHashMap.put("httpShouldHandleCookies", null);
    localHashMap.put("httpShouldUsePipelining", null);
    localHashMap.put("networkServiceType", null);
    localHashMap.put("timeoutInterval", null);
    localHashMap.put("mainDocumentURL", null);
    localHashMap.put("assumesHTTP3Capable", null);
    localHashMap.put("attribution", null);
    return localHashMap;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("URLRequest{url='");
    j.s(localStringBuilder, url, '\'', ", method='");
    j.s(localStringBuilder, method, '\'', ", body=");
    localStringBuilder.append(Arrays.toString(body));
    localStringBuilder.append(", headers=");
    localStringBuilder.append(headers);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */