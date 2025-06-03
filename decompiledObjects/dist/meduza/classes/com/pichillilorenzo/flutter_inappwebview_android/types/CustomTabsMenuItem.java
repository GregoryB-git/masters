package com.pichillilorenzo.flutter_inappwebview_android.types;

import f;
import java.util.Map;

public class CustomTabsMenuItem
{
  private int id;
  private String label;
  
  public CustomTabsMenuItem(int paramInt, String paramString)
  {
    id = paramInt;
    label = paramString;
  }
  
  public static CustomTabsMenuItem fromMap(Map<String, Object> paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    return new CustomTabsMenuItem(((Integer)paramMap.get("id")).intValue(), (String)paramMap.get("label"));
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (CustomTabsMenuItem)paramObject;
      if (id != id) {
        return false;
      }
      return label.equals(label);
    }
    return false;
  }
  
  public int getId()
  {
    return id;
  }
  
  public String getLabel()
  {
    return label;
  }
  
  public int hashCode()
  {
    int i = id;
    return label.hashCode() + i * 31;
  }
  
  public void setId(int paramInt)
  {
    id = paramInt;
  }
  
  public void setLabel(String paramString)
  {
    label = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("CustomTabsMenuItem{id=");
    localStringBuilder.append(id);
    localStringBuilder.append(", label='");
    localStringBuilder.append(label);
    localStringBuilder.append('\'');
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsMenuItem
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */