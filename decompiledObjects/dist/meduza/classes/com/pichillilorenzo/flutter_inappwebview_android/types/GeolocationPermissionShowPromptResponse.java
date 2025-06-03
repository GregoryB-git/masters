package com.pichillilorenzo.flutter_inappwebview_android.types;

import a0.j;
import f;
import java.util.Map;

public class GeolocationPermissionShowPromptResponse
{
  public boolean allow;
  private String origin;
  public boolean retain;
  
  public GeolocationPermissionShowPromptResponse(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    origin = paramString;
    allow = paramBoolean1;
    retain = paramBoolean2;
  }
  
  public static GeolocationPermissionShowPromptResponse fromMap(Map<String, Object> paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    return new GeolocationPermissionShowPromptResponse((String)paramMap.get("origin"), ((Boolean)paramMap.get("allow")).booleanValue(), ((Boolean)paramMap.get("retain")).booleanValue());
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (GeolocationPermissionShowPromptResponse)paramObject;
      if (allow != allow) {
        return false;
      }
      if (retain != retain) {
        return false;
      }
      return origin.equals(origin);
    }
    return false;
  }
  
  public String getOrigin()
  {
    return origin;
  }
  
  public int hashCode()
  {
    return (origin.hashCode() * 31 + allow) * 31 + retain;
  }
  
  public boolean isAllow()
  {
    return allow;
  }
  
  public boolean isRetain()
  {
    return retain;
  }
  
  public void setAllow(boolean paramBoolean)
  {
    allow = paramBoolean;
  }
  
  public void setOrigin(String paramString)
  {
    origin = paramString;
  }
  
  public void setRetain(boolean paramBoolean)
  {
    retain = paramBoolean;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("GeolocationPermissionShowPromptResponse{origin='");
    j.s(localStringBuilder, origin, '\'', ", allow=");
    localStringBuilder.append(allow);
    localStringBuilder.append(", retain=");
    localStringBuilder.append(retain);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.GeolocationPermissionShowPromptResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */