package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.print.PrintAttributes.Margins;
import f;
import java.util.HashMap;
import java.util.Map;

public class MarginsExt
{
  private double bottom;
  private double left;
  private double right;
  private double top;
  
  public MarginsExt() {}
  
  public MarginsExt(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    top = paramDouble1;
    right = paramDouble2;
    bottom = paramDouble3;
    left = paramDouble4;
  }
  
  public static MarginsExt fromMap(Map<String, Object> paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    return new MarginsExt(((Double)paramMap.get("top")).doubleValue(), ((Double)paramMap.get("right")).doubleValue(), ((Double)paramMap.get("bottom")).doubleValue(), ((Double)paramMap.get("left")).doubleValue());
  }
  
  public static MarginsExt fromMargins(PrintAttributes.Margins paramMargins)
  {
    if (paramMargins == null) {
      return null;
    }
    MarginsExt localMarginsExt = new MarginsExt();
    top = milsToPixels(paramMargins.getTopMils());
    right = milsToPixels(paramMargins.getRightMils());
    bottom = milsToPixels(paramMargins.getBottomMils());
    left = milsToPixels(paramMargins.getLeftMils());
    return localMarginsExt;
  }
  
  private static double milsToPixels(int paramInt)
  {
    return paramInt * 0.09600001209449D;
  }
  
  private static int pixelsToMils(double paramDouble)
  {
    return (int)Math.round(paramDouble * 10.416665354331D);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (MarginsExt)paramObject;
      if (Double.compare(top, top) != 0) {
        return false;
      }
      if (Double.compare(right, right) != 0) {
        return false;
      }
      if (Double.compare(bottom, bottom) != 0) {
        return false;
      }
      if (Double.compare(left, left) != 0) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public double getBottom()
  {
    return bottom;
  }
  
  public double getLeft()
  {
    return left;
  }
  
  public double getRight()
  {
    return right;
  }
  
  public double getTop()
  {
    return top;
  }
  
  public int hashCode()
  {
    long l = Double.doubleToLongBits(top);
    int i = (int)(l ^ l >>> 32);
    l = Double.doubleToLongBits(right);
    int j = (int)(l ^ l >>> 32);
    l = Double.doubleToLongBits(bottom);
    int k = (int)(l ^ l >>> 32);
    l = Double.doubleToLongBits(left);
    return ((i * 31 + j) * 31 + k) * 31 + (int)(l >>> 32 ^ l);
  }
  
  public void setBottom(double paramDouble)
  {
    bottom = paramDouble;
  }
  
  public void setLeft(double paramDouble)
  {
    left = paramDouble;
  }
  
  public void setRight(double paramDouble)
  {
    right = paramDouble;
  }
  
  public void setTop(double paramDouble)
  {
    top = paramDouble;
  }
  
  public Map<String, Object> toMap()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("top", Double.valueOf(top));
    localHashMap.put("right", Double.valueOf(right));
    localHashMap.put("bottom", Double.valueOf(bottom));
    localHashMap.put("left", Double.valueOf(left));
    return localHashMap;
  }
  
  public PrintAttributes.Margins toMargins()
  {
    return new PrintAttributes.Margins(pixelsToMils(left), pixelsToMils(top), pixelsToMils(right), pixelsToMils(bottom));
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("MarginsExt{top=");
    localStringBuilder.append(top);
    localStringBuilder.append(", right=");
    localStringBuilder.append(right);
    localStringBuilder.append(", bottom=");
    localStringBuilder.append(bottom);
    localStringBuilder.append(", left=");
    localStringBuilder.append(left);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.MarginsExt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */