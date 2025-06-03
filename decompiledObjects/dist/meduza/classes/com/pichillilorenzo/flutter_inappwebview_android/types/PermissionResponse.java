package com.pichillilorenzo.flutter_inappwebview_android.types;

import f;
import java.util.List;
import java.util.Map;

public class PermissionResponse
{
  private Integer action;
  private List<String> resources;
  
  public PermissionResponse(List<String> paramList, Integer paramInteger)
  {
    resources = paramList;
    action = paramInteger;
  }
  
  public static PermissionResponse fromMap(Map<String, Object> paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    return new PermissionResponse((List)paramMap.get("resources"), (Integer)paramMap.get("action"));
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      Object localObject = (PermissionResponse)paramObject;
      if (!resources.equals(resources)) {
        return false;
      }
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
  
  public List<String> getResources()
  {
    return resources;
  }
  
  public int hashCode()
  {
    int i = resources.hashCode();
    Integer localInteger = action;
    int j;
    if (localInteger != null) {
      j = localInteger.hashCode();
    } else {
      j = 0;
    }
    return i * 31 + j;
  }
  
  public void setAction(Integer paramInteger)
  {
    action = paramInteger;
  }
  
  public void setResources(List<String> paramList)
  {
    resources = paramList;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("PermissionResponse{resources=");
    localStringBuilder.append(resources);
    localStringBuilder.append(", action=");
    localStringBuilder.append(action);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.PermissionResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */