package com.pichillilorenzo.flutter_inappwebview_android.types;

import a0.j;
import android.webkit.WebResourceResponse;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import f;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WebResourceResponseExt
{
  private String contentEncoding;
  private String contentType;
  private byte[] data;
  private Map<String, String> headers;
  private String reasonPhrase;
  private Integer statusCode;
  
  public WebResourceResponseExt(String paramString1, String paramString2, Integer paramInteger, String paramString3, Map<String, String> paramMap, byte[] paramArrayOfByte)
  {
    contentType = paramString1;
    contentEncoding = paramString2;
    statusCode = paramInteger;
    reasonPhrase = paramString3;
    headers = paramMap;
    data = paramArrayOfByte;
  }
  
  public static WebResourceResponseExt fromMap(Map<String, Object> paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    return new WebResourceResponseExt((String)paramMap.get("contentType"), (String)paramMap.get("contentEncoding"), (Integer)paramMap.get("statusCode"), (String)paramMap.get("reasonPhrase"), (Map)paramMap.get("headers"), (byte[])paramMap.get("data"));
  }
  
  public static WebResourceResponseExt fromWebResourceResponse(WebResourceResponse paramWebResourceResponse)
  {
    int i = paramWebResourceResponse.getStatusCode();
    String str = paramWebResourceResponse.getReasonPhrase();
    Map localMap = paramWebResourceResponse.getResponseHeaders();
    return new WebResourceResponseExt(paramWebResourceResponse.getMimeType(), paramWebResourceResponse.getEncoding(), Integer.valueOf(i), str, localMap, Util.readAllBytes(paramWebResourceResponse.getData()));
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (WebResourceResponseExt)paramObject;
      Object localObject = contentType;
      if (localObject != null ? !((String)localObject).equals(contentType) : contentType != null) {
        return false;
      }
      localObject = contentEncoding;
      if (localObject != null ? !((String)localObject).equals(contentEncoding) : contentEncoding != null) {
        return false;
      }
      localObject = statusCode;
      if (localObject != null ? !((Integer)localObject).equals(statusCode) : statusCode != null) {
        return false;
      }
      localObject = reasonPhrase;
      if (localObject != null ? !((String)localObject).equals(reasonPhrase) : reasonPhrase != null) {
        return false;
      }
      localObject = headers;
      if (localObject != null ? !((Map)localObject).equals(headers) : headers != null) {
        return false;
      }
      return Arrays.equals(data, data);
    }
    return false;
  }
  
  public String getContentEncoding()
  {
    return contentEncoding;
  }
  
  public String getContentType()
  {
    return contentType;
  }
  
  public byte[] getData()
  {
    return data;
  }
  
  public Map<String, String> getHeaders()
  {
    return headers;
  }
  
  public String getReasonPhrase()
  {
    return reasonPhrase;
  }
  
  public Integer getStatusCode()
  {
    return statusCode;
  }
  
  public int hashCode()
  {
    Object localObject = contentType;
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((String)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = contentEncoding;
    int k;
    if (localObject != null) {
      k = ((String)localObject).hashCode();
    } else {
      k = 0;
    }
    localObject = statusCode;
    int m;
    if (localObject != null) {
      m = ((Integer)localObject).hashCode();
    } else {
      m = 0;
    }
    localObject = reasonPhrase;
    int n;
    if (localObject != null) {
      n = ((String)localObject).hashCode();
    } else {
      n = 0;
    }
    localObject = headers;
    if (localObject != null) {
      i = ((Map)localObject).hashCode();
    }
    return Arrays.hashCode(data) + ((((j * 31 + k) * 31 + m) * 31 + n) * 31 + i) * 31;
  }
  
  public void setContentEncoding(String paramString)
  {
    contentEncoding = paramString;
  }
  
  public void setContentType(String paramString)
  {
    contentType = paramString;
  }
  
  public void setData(byte[] paramArrayOfByte)
  {
    data = paramArrayOfByte;
  }
  
  public void setHeaders(Map<String, String> paramMap)
  {
    headers = paramMap;
  }
  
  public void setReasonPhrase(String paramString)
  {
    reasonPhrase = paramString;
  }
  
  public void setStatusCode(Integer paramInteger)
  {
    statusCode = paramInteger;
  }
  
  public Map<String, Object> toMap()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("contentType", contentType);
    localHashMap.put("contentEncoding", contentEncoding);
    localHashMap.put("statusCode", statusCode);
    localHashMap.put("reasonPhrase", reasonPhrase);
    localHashMap.put("headers", headers);
    localHashMap.put("data", data);
    return localHashMap;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("WebResourceResponseExt{contentType='");
    j.s(localStringBuilder, contentType, '\'', ", contentEncoding='");
    j.s(localStringBuilder, contentEncoding, '\'', ", statusCode=");
    localStringBuilder.append(statusCode);
    localStringBuilder.append(", reasonPhrase='");
    j.s(localStringBuilder, reasonPhrase, '\'', ", headers=");
    localStringBuilder.append(headers);
    localStringBuilder.append(", data=");
    localStringBuilder.append(Arrays.toString(data));
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */