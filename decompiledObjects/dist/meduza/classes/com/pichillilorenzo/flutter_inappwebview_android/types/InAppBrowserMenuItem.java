package com.pichillilorenzo.flutter_inappwebview_android.types;

import a0.j;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import f;
import java.util.Map;
import java.util.Objects;

public class InAppBrowserMenuItem
{
  private Object icon;
  private String iconColor;
  private int id;
  private Integer order;
  private boolean showAsAction;
  private String title;
  
  public InAppBrowserMenuItem(int paramInt, String paramString1, Integer paramInteger, Object paramObject, String paramString2, boolean paramBoolean)
  {
    id = paramInt;
    title = paramString1;
    order = paramInteger;
    icon = paramObject;
    iconColor = paramString2;
    showAsAction = paramBoolean;
  }
  
  public static InAppBrowserMenuItem fromMap(Map<String, Object> paramMap)
  {
    Object localObject1 = null;
    if (paramMap == null) {
      return null;
    }
    int i = ((Integer)paramMap.get("id")).intValue();
    String str = (String)paramMap.get("title");
    Integer localInteger = (Integer)paramMap.get("order");
    Object localObject2 = paramMap.get("icon");
    if ((localObject2 instanceof Map)) {
      localObject1 = AndroidResource.fromMap((Map)paramMap.get("icon"));
    }
    for (;;)
    {
      break;
      if ((localObject2 instanceof byte[])) {
        localObject1 = localObject2;
      }
    }
    return new InAppBrowserMenuItem(i, str, localInteger, localObject1, (String)paramMap.get("iconColor"), ((Boolean)Util.getOrDefault(paramMap, "showAsAction", Boolean.FALSE)).booleanValue());
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (InAppBrowserMenuItem)paramObject;
      if (id != id) {
        return false;
      }
      if (showAsAction != showAsAction) {
        return false;
      }
      if (!title.equals(title)) {
        return false;
      }
      if (!Objects.equals(order, order)) {
        return false;
      }
      if (!Objects.equals(icon, icon)) {
        return false;
      }
      return Objects.equals(iconColor, iconColor);
    }
    return false;
  }
  
  public Object getIcon()
  {
    return icon;
  }
  
  public String getIconColor()
  {
    return iconColor;
  }
  
  public int getId()
  {
    return id;
  }
  
  public Integer getOrder()
  {
    return order;
  }
  
  public String getTitle()
  {
    return title;
  }
  
  public int hashCode()
  {
    int i = id;
    int j = j.e(title, i * 31, 31);
    Object localObject = order;
    int k = 0;
    if (localObject != null) {
      i = ((Integer)localObject).hashCode();
    } else {
      i = 0;
    }
    localObject = icon;
    int m;
    if (localObject != null) {
      m = localObject.hashCode();
    } else {
      m = 0;
    }
    localObject = iconColor;
    if (localObject != null) {
      k = ((String)localObject).hashCode();
    }
    return (((j + i) * 31 + m) * 31 + k) * 31 + showAsAction;
  }
  
  public boolean isShowAsAction()
  {
    return showAsAction;
  }
  
  public void setIcon(Object paramObject)
  {
    icon = paramObject;
  }
  
  public void setIconColor(String paramString)
  {
    iconColor = paramString;
  }
  
  public void setId(int paramInt)
  {
    id = paramInt;
  }
  
  public void setOrder(Integer paramInteger)
  {
    order = paramInteger;
  }
  
  public void setShowAsAction(boolean paramBoolean)
  {
    showAsAction = paramBoolean;
  }
  
  public void setTitle(String paramString)
  {
    title = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("InAppBrowserMenuItem{id=");
    localStringBuilder.append(id);
    localStringBuilder.append(", title='");
    j.s(localStringBuilder, title, '\'', ", order=");
    localStringBuilder.append(order);
    localStringBuilder.append(", icon=");
    localStringBuilder.append(icon);
    localStringBuilder.append(", iconColor='");
    j.s(localStringBuilder, iconColor, '\'', ", showAsAction=");
    localStringBuilder.append(showAsAction);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.InAppBrowserMenuItem
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */