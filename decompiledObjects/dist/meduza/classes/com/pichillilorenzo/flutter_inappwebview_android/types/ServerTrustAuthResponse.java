package com.pichillilorenzo.flutter_inappwebview_android.types;

import f;
import java.util.Map;

public class ServerTrustAuthResponse
{
  private Integer action;
  
  public ServerTrustAuthResponse(Integer paramInteger)
  {
    action = paramInteger;
  }
  
  public static ServerTrustAuthResponse fromMap(Map<String, Object> paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    return new ServerTrustAuthResponse((Integer)paramMap.get("action"));
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      Object localObject = (ServerTrustAuthResponse)paramObject;
      paramObject = action;
      localObject = action;
      if (paramObject != null) {
        bool = ((Integer)paramObject).equals(localObject);
      } else if (localObject != null) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public Integer getAction()
  {
    return action;
  }
  
  public int hashCode()
  {
    Integer localInteger = action;
    int i;
    if (localInteger != null) {
      i = localInteger.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public void setAction(Integer paramInteger)
  {
    action = paramInteger;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("ServerTrustAuthResponse{action=");
    localStringBuilder.append(action);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.ServerTrustAuthResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */