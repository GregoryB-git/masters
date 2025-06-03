package com.pichillilorenzo.flutter_inappwebview_android.types;

import a0.j;
import f;
import java.util.Map;

public class HttpAuthResponse
{
  private Integer action;
  private String password;
  public boolean permanentPersistence;
  private String username;
  
  public HttpAuthResponse(String paramString1, String paramString2, boolean paramBoolean, Integer paramInteger)
  {
    username = paramString1;
    password = paramString2;
    permanentPersistence = paramBoolean;
    action = paramInteger;
  }
  
  public static HttpAuthResponse fromMap(Map<String, Object> paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    return new HttpAuthResponse((String)paramMap.get("username"), (String)paramMap.get("password"), ((Boolean)paramMap.get("permanentPersistence")).booleanValue(), (Integer)paramMap.get("action"));
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      Object localObject = (HttpAuthResponse)paramObject;
      if (permanentPersistence != permanentPersistence) {
        return false;
      }
      if (!username.equals(username)) {
        return false;
      }
      if (!password.equals(password)) {
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
  
  public String getPassword()
  {
    return password;
  }
  
  public String getUsername()
  {
    return username;
  }
  
  public int hashCode()
  {
    int i = username.hashCode();
    int j = j.e(password, i * 31, 31);
    int k = permanentPersistence;
    Integer localInteger = action;
    if (localInteger != null) {
      i = localInteger.hashCode();
    } else {
      i = 0;
    }
    return (j + k) * 31 + i;
  }
  
  public boolean isPermanentPersistence()
  {
    return permanentPersistence;
  }
  
  public void setAction(Integer paramInteger)
  {
    action = paramInteger;
  }
  
  public void setPassword(String paramString)
  {
    password = paramString;
  }
  
  public void setPermanentPersistence(boolean paramBoolean)
  {
    permanentPersistence = paramBoolean;
  }
  
  public void setUsername(String paramString)
  {
    username = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("HttpAuthResponse{username='");
    j.s(localStringBuilder, username, '\'', ", password='");
    j.s(localStringBuilder, password, '\'', ", permanentPersistence=");
    localStringBuilder.append(permanentPersistence);
    localStringBuilder.append(", action=");
    localStringBuilder.append(action);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.HttpAuthResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */