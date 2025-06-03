package com.pichillilorenzo.flutter_inappwebview_android.content_blocker;

import f;
import java.util.Map;

public class ContentBlockerAction
{
  private String selector;
  private ContentBlockerActionType type;
  
  public ContentBlockerAction(ContentBlockerActionType paramContentBlockerActionType, String paramString)
  {
    type = paramContentBlockerActionType;
    paramContentBlockerActionType.equals(ContentBlockerActionType.CSS_DISPLAY_NONE);
    selector = paramString;
  }
  
  public static ContentBlockerAction fromMap(Map<String, Object> paramMap)
  {
    return new ContentBlockerAction(ContentBlockerActionType.fromValue((String)paramMap.get("type")), (String)paramMap.get("selector"));
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      Object localObject = (ContentBlockerAction)paramObject;
      if (type != type) {
        return false;
      }
      paramObject = selector;
      localObject = selector;
      if (paramObject != null) {
        bool = ((String)paramObject).equals(localObject);
      } else if (localObject != null) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public String getSelector()
  {
    return selector;
  }
  
  public ContentBlockerActionType getType()
  {
    return type;
  }
  
  public int hashCode()
  {
    int i = type.hashCode();
    String str = selector;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    return i * 31 + j;
  }
  
  public void setSelector(String paramString)
  {
    selector = paramString;
  }
  
  public void setType(ContentBlockerActionType paramContentBlockerActionType)
  {
    type = paramContentBlockerActionType;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("ContentBlockerAction{type=");
    localStringBuilder.append(type);
    localStringBuilder.append(", selector='");
    localStringBuilder.append(selector);
    localStringBuilder.append('\'');
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerAction
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */