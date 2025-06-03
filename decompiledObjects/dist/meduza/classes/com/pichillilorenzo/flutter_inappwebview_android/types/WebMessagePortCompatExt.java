package com.pichillilorenzo.flutter_inappwebview_android.types;

import f;
import java.util.HashMap;
import java.util.Map;

public class WebMessagePortCompatExt
{
  private int index;
  private String webMessageChannelId;
  
  public WebMessagePortCompatExt(int paramInt, String paramString)
  {
    index = paramInt;
    webMessageChannelId = paramString;
  }
  
  public static WebMessagePortCompatExt fromMap(Map<String, Object> paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    Integer localInteger = (Integer)paramMap.get("index");
    paramMap = (String)paramMap.get("webMessageChannelId");
    return new WebMessagePortCompatExt(localInteger.intValue(), paramMap);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (WebMessagePortCompatExt)paramObject;
      if (index != index) {
        return false;
      }
      return webMessageChannelId.equals(webMessageChannelId);
    }
    return false;
  }
  
  public int getIndex()
  {
    return index;
  }
  
  public String getWebMessageChannelId()
  {
    return webMessageChannelId;
  }
  
  public int hashCode()
  {
    int i = index;
    return webMessageChannelId.hashCode() + i * 31;
  }
  
  public void setIndex(int paramInt)
  {
    index = paramInt;
  }
  
  public void setWebMessageChannelId(String paramString)
  {
    webMessageChannelId = paramString;
  }
  
  public Map<String, Object> toMap()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("index", Integer.valueOf(index));
    localHashMap.put("webMessageChannelId", webMessageChannelId);
    return localHashMap;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("WebMessagePortCompatExt{index=");
    localStringBuilder.append(index);
    localStringBuilder.append(", webMessageChannelId='");
    localStringBuilder.append(webMessageChannelId);
    localStringBuilder.append('\'');
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePortCompatExt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */