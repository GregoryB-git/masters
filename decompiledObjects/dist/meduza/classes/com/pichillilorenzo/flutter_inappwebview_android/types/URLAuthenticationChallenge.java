package com.pichillilorenzo.flutter_inappwebview_android.types;

import f;
import java.util.HashMap;
import java.util.Map;

public class URLAuthenticationChallenge
{
  private URLProtectionSpace protectionSpace;
  
  public URLAuthenticationChallenge(URLProtectionSpace paramURLProtectionSpace)
  {
    protectionSpace = paramURLProtectionSpace;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (URLAuthenticationChallenge)paramObject;
      return protectionSpace.equals(protectionSpace);
    }
    return false;
  }
  
  public URLProtectionSpace getProtectionSpace()
  {
    return protectionSpace;
  }
  
  public int hashCode()
  {
    return protectionSpace.hashCode();
  }
  
  public void setProtectionSpace(URLProtectionSpace paramURLProtectionSpace)
  {
    protectionSpace = paramURLProtectionSpace;
  }
  
  public Map<String, Object> toMap()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("protectionSpace", protectionSpace.toMap());
    return localHashMap;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("URLAuthenticationChallenge{protectionSpace=");
    localStringBuilder.append(protectionSpace);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.URLAuthenticationChallenge
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */