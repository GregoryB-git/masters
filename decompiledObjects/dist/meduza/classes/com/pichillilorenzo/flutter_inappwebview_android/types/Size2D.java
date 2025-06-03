package com.pichillilorenzo.flutter_inappwebview_android.types;

import f;
import java.util.HashMap;
import java.util.Map;

public class Size2D
{
  private double height;
  private double width;
  
  public Size2D(double paramDouble1, double paramDouble2)
  {
    width = paramDouble1;
    height = paramDouble2;
  }
  
  public static Size2D fromMap(Map<String, Object> paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    Double localDouble = (Double)paramMap.get("width");
    paramMap = (Double)paramMap.get("height");
    return new Size2D(localDouble.doubleValue(), paramMap.doubleValue());
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (Size2D)paramObject;
      if (Double.compare(width, width) != 0) {
        return false;
      }
      if (Double.compare(height, height) != 0) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public double getHeight()
  {
    return height;
  }
  
  public double getWidth()
  {
    return width;
  }
  
  public int hashCode()
  {
    long l = Double.doubleToLongBits(width);
    int i = (int)(l ^ l >>> 32);
    l = Double.doubleToLongBits(height);
    return i * 31 + (int)(l >>> 32 ^ l);
  }
  
  public void setHeight(double paramDouble)
  {
    height = paramDouble;
  }
  
  public void setWidth(double paramDouble)
  {
    width = paramDouble;
  }
  
  public Map<String, Object> toMap()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("width", Double.valueOf(width));
    localHashMap.put("height", Double.valueOf(height));
    return localHashMap;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("Size{width=");
    localStringBuilder.append(width);
    localStringBuilder.append(", height=");
    localStringBuilder.append(height);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.Size2D
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */