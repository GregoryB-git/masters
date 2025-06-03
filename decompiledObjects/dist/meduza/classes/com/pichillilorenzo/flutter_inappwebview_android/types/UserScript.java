package com.pichillilorenzo.flutter_inappwebview_android.types;

import a0.j;
import f;
import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserScript
{
  private Set<String> allowedOriginRules = new HashSet();
  private ContentWorld contentWorld;
  private String groupName;
  private UserScriptInjectionTime injectionTime;
  private String source;
  
  public UserScript(String paramString1, String paramString2, UserScriptInjectionTime paramUserScriptInjectionTime, ContentWorld paramContentWorld, Set<String> paramSet)
  {
    groupName = paramString1;
    source = paramString2;
    injectionTime = paramUserScriptInjectionTime;
    paramString1 = paramContentWorld;
    if (paramContentWorld == null) {
      paramString1 = ContentWorld.PAGE;
    }
    contentWorld = paramString1;
    paramString1 = paramSet;
    if (paramSet == null) {
      paramString1 = new HashSet() {};
    }
    allowedOriginRules = paramString1;
  }
  
  public static UserScript fromMap(Map<String, Object> paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    return new UserScript((String)paramMap.get("groupName"), (String)paramMap.get("source"), UserScriptInjectionTime.fromValue(((Integer)paramMap.get("injectionTime")).intValue()), ContentWorld.fromMap((Map)paramMap.get("contentWorld")), new HashSet((List)paramMap.get("allowedOriginRules")));
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (UserScript)paramObject;
      String str = groupName;
      if (str != null ? !str.equals(groupName) : groupName != null) {
        return false;
      }
      if (!source.equals(source)) {
        return false;
      }
      if (injectionTime != injectionTime) {
        return false;
      }
      if (!contentWorld.equals(contentWorld)) {
        return false;
      }
      return allowedOriginRules.equals(allowedOriginRules);
    }
    return false;
  }
  
  public Set<String> getAllowedOriginRules()
  {
    return allowedOriginRules;
  }
  
  public ContentWorld getContentWorld()
  {
    return contentWorld;
  }
  
  public String getGroupName()
  {
    return groupName;
  }
  
  public UserScriptInjectionTime getInjectionTime()
  {
    return injectionTime;
  }
  
  public String getSource()
  {
    return source;
  }
  
  public int hashCode()
  {
    String str = groupName;
    if (str != null) {
      i = str.hashCode();
    } else {
      i = 0;
    }
    int i = j.e(source, i * 31, 31);
    int j = injectionTime.hashCode();
    int k = contentWorld.hashCode();
    return allowedOriginRules.hashCode() + (k + (j + i) * 31) * 31;
  }
  
  public void setAllowedOriginRules(Set<String> paramSet)
  {
    allowedOriginRules = paramSet;
  }
  
  public void setContentWorld(ContentWorld paramContentWorld)
  {
    ContentWorld localContentWorld = paramContentWorld;
    if (paramContentWorld == null) {
      localContentWorld = ContentWorld.PAGE;
    }
    contentWorld = localContentWorld;
  }
  
  public void setGroupName(String paramString)
  {
    groupName = paramString;
  }
  
  public void setInjectionTime(UserScriptInjectionTime paramUserScriptInjectionTime)
  {
    injectionTime = paramUserScriptInjectionTime;
  }
  
  public void setSource(String paramString)
  {
    source = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("UserScript{groupName='");
    j.s(localStringBuilder, groupName, '\'', ", source='");
    j.s(localStringBuilder, source, '\'', ", injectionTime=");
    localStringBuilder.append(injectionTime);
    localStringBuilder.append(", contentWorld=");
    localStringBuilder.append(contentWorld);
    localStringBuilder.append(", allowedOriginRules=");
    localStringBuilder.append(allowedOriginRules);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.UserScript
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */