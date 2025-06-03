package com.pichillilorenzo.flutter_inappwebview_android.types;

import a0.j;
import f;
import java.util.Arrays;
import java.util.Map;

public class CustomTabsActionButton
{
  private String description;
  private byte[] icon;
  private int id;
  private boolean shouldTint;
  
  public CustomTabsActionButton(int paramInt, byte[] paramArrayOfByte, String paramString, boolean paramBoolean)
  {
    id = paramInt;
    icon = paramArrayOfByte;
    description = paramString;
    shouldTint = paramBoolean;
  }
  
  public static CustomTabsActionButton fromMap(Map<String, Object> paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    return new CustomTabsActionButton(((Integer)paramMap.get("id")).intValue(), (byte[])paramMap.get("icon"), (String)paramMap.get("description"), ((Boolean)paramMap.get("shouldTint")).booleanValue());
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (CustomTabsActionButton)paramObject;
      if (id != id) {
        return false;
      }
      if (shouldTint != shouldTint) {
        return false;
      }
      if (!Arrays.equals(icon, icon)) {
        return false;
      }
      return description.equals(description);
    }
    return false;
  }
  
  public String getDescription()
  {
    return description;
  }
  
  public byte[] getIcon()
  {
    return icon;
  }
  
  public int getId()
  {
    return id;
  }
  
  public int hashCode()
  {
    int i = id;
    int j = Arrays.hashCode(icon);
    return j.e(description, (j + i * 31) * 31, 31) + shouldTint;
  }
  
  public boolean isShouldTint()
  {
    return shouldTint;
  }
  
  public void setDescription(String paramString)
  {
    description = paramString;
  }
  
  public void setIcon(byte[] paramArrayOfByte)
  {
    icon = paramArrayOfByte;
  }
  
  public void setId(int paramInt)
  {
    id = paramInt;
  }
  
  public void setShouldTint(boolean paramBoolean)
  {
    shouldTint = paramBoolean;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("CustomTabsActionButton{id=");
    localStringBuilder.append(id);
    localStringBuilder.append(", icon=");
    localStringBuilder.append(Arrays.toString(icon));
    localStringBuilder.append(", description='");
    j.s(localStringBuilder, description, '\'', ", shouldTint=");
    localStringBuilder.append(shouldTint);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsActionButton
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */