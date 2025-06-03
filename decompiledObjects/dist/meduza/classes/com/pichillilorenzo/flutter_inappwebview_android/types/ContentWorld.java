package com.pichillilorenzo.flutter_inappwebview_android.types;

import f;
import java.util.Map;

public class ContentWorld
{
  public static final ContentWorld DEFAULT_CLIENT = new ContentWorld("defaultClient");
  public static final ContentWorld PAGE = new ContentWorld("page");
  private String name;
  
  private ContentWorld(String paramString)
  {
    name = paramString;
  }
  
  public static ContentWorld fromMap(Map<String, Object> paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    return new ContentWorld((String)paramMap.get("name"));
  }
  
  public static ContentWorld world(String paramString)
  {
    return new ContentWorld(paramString);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (ContentWorld)paramObject;
      return name.equals(name);
    }
    return false;
  }
  
  public String getName()
  {
    return name;
  }
  
  public int hashCode()
  {
    return name.hashCode();
  }
  
  public void setName(String paramString)
  {
    name = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("ContentWorld{name='");
    localStringBuilder.append(name);
    localStringBuilder.append('\'');
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.ContentWorld
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */