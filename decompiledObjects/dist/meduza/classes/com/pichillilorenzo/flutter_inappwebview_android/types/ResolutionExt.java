package com.pichillilorenzo.flutter_inappwebview_android.types;

import a0.j;
import android.print.PrintAttributes.Resolution;
import f;
import java.util.HashMap;
import java.util.Map;

public class ResolutionExt
{
  private int horizontalDpi;
  private String id;
  private String label;
  private int verticalDpi;
  
  public ResolutionExt(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    id = paramString1;
    label = paramString2;
    verticalDpi = paramInt1;
    horizontalDpi = paramInt2;
  }
  
  public static ResolutionExt fromMap(Map<String, Object> paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    return new ResolutionExt((String)paramMap.get("id"), (String)paramMap.get("label"), ((Integer)paramMap.get("verticalDpi")).intValue(), ((Integer)paramMap.get("horizontalDpi")).intValue());
  }
  
  public static ResolutionExt fromResolution(PrintAttributes.Resolution paramResolution)
  {
    if (paramResolution == null) {
      return null;
    }
    return new ResolutionExt(paramResolution.getId(), paramResolution.getLabel(), paramResolution.getVerticalDpi(), paramResolution.getHorizontalDpi());
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (ResolutionExt)paramObject;
      if (verticalDpi != verticalDpi) {
        return false;
      }
      if (horizontalDpi != horizontalDpi) {
        return false;
      }
      if (!id.equals(id)) {
        return false;
      }
      return label.equals(label);
    }
    return false;
  }
  
  public int getHorizontalDpi()
  {
    return horizontalDpi;
  }
  
  public String getId()
  {
    return id;
  }
  
  public String getLabel()
  {
    return label;
  }
  
  public int getVerticalDpi()
  {
    return verticalDpi;
  }
  
  public int hashCode()
  {
    int i = id.hashCode();
    return (j.e(label, i * 31, 31) + verticalDpi) * 31 + horizontalDpi;
  }
  
  public void setHorizontalDpi(int paramInt)
  {
    horizontalDpi = paramInt;
  }
  
  public void setId(String paramString)
  {
    id = paramString;
  }
  
  public void setLabel(String paramString)
  {
    label = paramString;
  }
  
  public void setVerticalDpi(int paramInt)
  {
    verticalDpi = paramInt;
  }
  
  public Map<String, Object> toMap()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("id", id);
    localHashMap.put("label", label);
    localHashMap.put("verticalDpi", Integer.valueOf(verticalDpi));
    localHashMap.put("horizontalDpi", Integer.valueOf(horizontalDpi));
    return localHashMap;
  }
  
  public PrintAttributes.Resolution toResolution()
  {
    return new PrintAttributes.Resolution(id, label, horizontalDpi, verticalDpi);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("ResolutionExt{id='");
    j.s(localStringBuilder, id, '\'', ", label='");
    j.s(localStringBuilder, label, '\'', ", verticalDpi=");
    localStringBuilder.append(verticalDpi);
    localStringBuilder.append(", horizontalDpi=");
    localStringBuilder.append(horizontalDpi);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.ResolutionExt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */