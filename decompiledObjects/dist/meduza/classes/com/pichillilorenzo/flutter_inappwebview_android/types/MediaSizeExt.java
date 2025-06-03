package com.pichillilorenzo.flutter_inappwebview_android.types;

import a0.j;
import android.print.PrintAttributes.MediaSize;
import f;
import java.util.HashMap;
import java.util.Map;

public class MediaSizeExt
{
  private int heightMils;
  private String id;
  private String label;
  private int widthMils;
  
  public MediaSizeExt(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    id = paramString1;
    label = paramString2;
    widthMils = paramInt1;
    heightMils = paramInt2;
  }
  
  public static MediaSizeExt fromMap(Map<String, Object> paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    return new MediaSizeExt((String)paramMap.get("id"), (String)paramMap.get("label"), ((Integer)paramMap.get("widthMils")).intValue(), ((Integer)paramMap.get("heightMils")).intValue());
  }
  
  public static MediaSizeExt fromMediaSize(PrintAttributes.MediaSize paramMediaSize)
  {
    if (paramMediaSize == null) {
      return null;
    }
    return new MediaSizeExt(paramMediaSize.getId(), null, paramMediaSize.getHeightMils(), paramMediaSize.getWidthMils());
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      Object localObject = (MediaSizeExt)paramObject;
      if (widthMils != widthMils) {
        return false;
      }
      if (heightMils != heightMils) {
        return false;
      }
      if (!id.equals(id)) {
        return false;
      }
      paramObject = label;
      localObject = label;
      if (paramObject != null) {
        bool = ((String)paramObject).equals(localObject);
      } else if (localObject != null) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int getHeightMils()
  {
    return heightMils;
  }
  
  public String getId()
  {
    return id;
  }
  
  public String getLabel()
  {
    return label;
  }
  
  public int getWidthMils()
  {
    return widthMils;
  }
  
  public int hashCode()
  {
    int i = id.hashCode();
    String str = label;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    return ((i * 31 + j) * 31 + widthMils) * 31 + heightMils;
  }
  
  public void setHeightMils(int paramInt)
  {
    heightMils = paramInt;
  }
  
  public void setId(String paramString)
  {
    id = paramString;
  }
  
  public void setLabel(String paramString)
  {
    label = paramString;
  }
  
  public void setWidthMils(int paramInt)
  {
    widthMils = paramInt;
  }
  
  public Map<String, Object> toMap()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("id", id);
    localHashMap.put("label", label);
    localHashMap.put("heightMils", Integer.valueOf(heightMils));
    localHashMap.put("widthMils", Integer.valueOf(widthMils));
    return localHashMap;
  }
  
  public PrintAttributes.MediaSize toMediaSize()
  {
    return new PrintAttributes.MediaSize(id, "Custom", widthMils, heightMils);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("MediaSizeExt{id='");
    j.s(localStringBuilder, id, '\'', ", label='");
    j.s(localStringBuilder, label, '\'', ", widthMils=");
    localStringBuilder.append(widthMils);
    localStringBuilder.append(", heightMils=");
    localStringBuilder.append(heightMils);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.MediaSizeExt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */