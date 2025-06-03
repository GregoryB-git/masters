package com.pichillilorenzo.flutter_inappwebview_android.types;

import f;
import java.util.HashMap;
import java.util.Map;

public class NavigationAction
{
  public boolean hasGesture;
  public boolean isForMainFrame;
  public boolean isRedirect;
  public URLRequest request;
  
  public NavigationAction(URLRequest paramURLRequest, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    request = paramURLRequest;
    isForMainFrame = paramBoolean1;
    hasGesture = paramBoolean2;
    isRedirect = paramBoolean3;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (NavigationAction)paramObject;
      if (isForMainFrame != isForMainFrame) {
        return false;
      }
      if (hasGesture != hasGesture) {
        return false;
      }
      if (isRedirect != isRedirect) {
        return false;
      }
      return request.equals(request);
    }
    return false;
  }
  
  public URLRequest getRequest()
  {
    return request;
  }
  
  public int hashCode()
  {
    return ((request.hashCode() * 31 + isForMainFrame) * 31 + hasGesture) * 31 + isRedirect;
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
  
  public void setRedirect(boolean paramBoolean)
  {
    isRedirect = paramBoolean;
  }
  
  public void setRequest(URLRequest paramURLRequest)
  {
    request = paramURLRequest;
  }
  
  public Map<String, Object> toMap()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("request", request.toMap());
    localHashMap.put("isForMainFrame", Boolean.valueOf(isForMainFrame));
    localHashMap.put("hasGesture", Boolean.valueOf(hasGesture));
    localHashMap.put("isRedirect", Boolean.valueOf(isRedirect));
    localHashMap.put("navigationType", null);
    localHashMap.put("sourceFrame", null);
    localHashMap.put("targetFrame", null);
    localHashMap.put("shouldPerformDownload", null);
    return localHashMap;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("NavigationAction{request=");
    localStringBuilder.append(request);
    localStringBuilder.append(", isForMainFrame=");
    localStringBuilder.append(isForMainFrame);
    localStringBuilder.append(", hasGesture=");
    localStringBuilder.append(hasGesture);
    localStringBuilder.append(", isRedirect=");
    localStringBuilder.append(isRedirect);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.NavigationAction
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */