package com.pichillilorenzo.flutter_inappwebview_android.types;

import a0.d;
import android.net.Uri;
import android.os.Build.VERSION;
import android.webkit.WebResourceRequest;
import c2.m;
import f;
import java.util.HashMap;
import java.util.Map;
import x6.b;

public class WebResourceRequestExt
{
  private boolean hasGesture;
  private Map<String, String> headers;
  private boolean isForMainFrame;
  private boolean isRedirect;
  private String method;
  private String url;
  
  public WebResourceRequestExt(String paramString1, Map<String, String> paramMap, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString2)
  {
    url = paramString1;
    headers = paramMap;
    isRedirect = paramBoolean1;
    hasGesture = paramBoolean2;
    isForMainFrame = paramBoolean3;
    method = paramString2;
  }
  
  public static WebResourceRequestExt fromWebResourceRequest(WebResourceRequest paramWebResourceRequest)
  {
    boolean bool;
    if (b.c0("WEB_RESOURCE_REQUEST_IS_REDIRECT")) {
      bool = m.a(paramWebResourceRequest);
    } else if (Build.VERSION.SDK_INT >= 24) {
      bool = d.m(paramWebResourceRequest);
    } else {
      bool = false;
    }
    return new WebResourceRequestExt(paramWebResourceRequest.getUrl().toString(), paramWebResourceRequest.getRequestHeaders(), bool, paramWebResourceRequest.hasGesture(), paramWebResourceRequest.isForMainFrame(), paramWebResourceRequest.getMethod());
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      Object localObject = (WebResourceRequestExt)paramObject;
      if (isRedirect != isRedirect) {
        return false;
      }
      if (hasGesture != hasGesture) {
        return false;
      }
      if (isForMainFrame != isForMainFrame) {
        return false;
      }
      if (!url.equals(url)) {
        return false;
      }
      paramObject = headers;
      if (paramObject != null ? !((Map)paramObject).equals(headers) : headers != null) {
        return false;
      }
      paramObject = method;
      localObject = method;
      if (paramObject != null) {
        bool = ((String)paramObject).equals(localObject);
      } else if (localObject != null) {
        bool = false;
      }
      return bool;
    }
    return false;
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
    int i = url.hashCode();
    Object localObject = headers;
    int j = 0;
    int k;
    if (localObject != null) {
      k = ((Map)localObject).hashCode();
    } else {
      k = 0;
    }
    int m = isRedirect;
    int n = hasGesture;
    int i1 = isForMainFrame;
    localObject = method;
    if (localObject != null) {
      j = ((String)localObject).hashCode();
    }
    return ((((i * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31 + j;
  }
  
  public boolean isForMainFrame()
  {
    return isForMainFrame;
  }
  
  public boolean isHasGesture()
  {
    return hasGesture;
  }
  
  public boolean isRedirect()
  {
    return isRedirect;
  }
  
  public void setForMainFrame(boolean paramBoolean)
  {
    isForMainFrame = paramBoolean;
  }
  
  public void setHasGesture(boolean paramBoolean)
  {
    hasGesture = paramBoolean;
  }
  
  public void setHeaders(Map<String, String> paramMap)
  {
    headers = paramMap;
  }
  
  public void setMethod(String paramString)
  {
    method = paramString;
  }
  
  public void setRedirect(boolean paramBoolean)
  {
    isRedirect = paramBoolean;
  }
  
  public void setUrl(String paramString)
  {
    url = paramString;
  }
  
  public Map<String, Object> toMap()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("url", url);
    localHashMap.put("headers", headers);
    localHashMap.put("isRedirect", Boolean.valueOf(isRedirect));
    localHashMap.put("hasGesture", Boolean.valueOf(hasGesture));
    localHashMap.put("isForMainFrame", Boolean.valueOf(isForMainFrame));
    localHashMap.put("method", method);
    return localHashMap;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("WebResourceRequestExt{url=");
    localStringBuilder.append(url);
    localStringBuilder.append(", headers=");
    localStringBuilder.append(headers);
    localStringBuilder.append(", isRedirect=");
    localStringBuilder.append(isRedirect);
    localStringBuilder.append(", hasGesture=");
    localStringBuilder.append(hasGesture);
    localStringBuilder.append(", isForMainFrame=");
    localStringBuilder.append(isForMainFrame);
    localStringBuilder.append(", method='");
    localStringBuilder.append(method);
    localStringBuilder.append('\'');
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */