package com.pichillilorenzo.flutter_inappwebview_android.types;

import a0.j;
import f;
import java.util.HashMap;
import java.util.Map;

public class URLCredential
{
  private Long id;
  private String password;
  private Long protectionSpaceId;
  private String username;
  
  public URLCredential(Long paramLong1, String paramString1, String paramString2, Long paramLong2)
  {
    id = paramLong1;
    username = paramString1;
    password = paramString2;
    protectionSpaceId = paramLong2;
  }
  
  public URLCredential(String paramString1, String paramString2)
  {
    username = paramString1;
    password = paramString2;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      Object localObject = (URLCredential)paramObject;
      paramObject = username;
      if (paramObject != null ? !((String)paramObject).equals(username) : username != null) {
        return false;
      }
      paramObject = password;
      localObject = password;
      if (paramObject != null) {
        bool = ((String)paramObject).equals(localObject);
      } else if (localObject != null) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public Long getId()
  {
    return id;
  }
  
  public String getPassword()
  {
    return password;
  }
  
  public Long getProtectionSpaceId()
  {
    return protectionSpaceId;
  }
  
  public String getUsername()
  {
    return username;
  }
  
  public int hashCode()
  {
    String str = username;
    int i = 0;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    str = password;
    if (str != null) {
      i = str.hashCode();
    }
    return j * 31 + i;
  }
  
  public void setId(Long paramLong)
  {
    id = paramLong;
  }
  
  public void setPassword(String paramString)
  {
    password = paramString;
  }
  
  public void setProtectionSpaceId(Long paramLong)
  {
    protectionSpaceId = paramLong;
  }
  
  public void setUsername(String paramString)
  {
    username = paramString;
  }
  
  public Map<String, Object> toMap()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("username", username);
    localHashMap.put("password", password);
    localHashMap.put("certificates", null);
    localHashMap.put("persistence", null);
    return localHashMap;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("URLCredential{username='");
    j.s(localStringBuilder, username, '\'', ", password='");
    localStringBuilder.append(password);
    localStringBuilder.append('\'');
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.URLCredential
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */