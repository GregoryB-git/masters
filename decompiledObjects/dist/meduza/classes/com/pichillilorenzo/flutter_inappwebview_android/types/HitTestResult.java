package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.webkit.WebView.HitTestResult;
import f;
import java.util.HashMap;
import java.util.Map;

public class HitTestResult
{
  private String extra;
  private int type;
  
  public HitTestResult(int paramInt, String paramString)
  {
    type = paramInt;
    extra = paramString;
  }
  
  public static HitTestResult fromWebViewHitTestResult(WebView.HitTestResult paramHitTestResult)
  {
    if (paramHitTestResult == null) {
      return null;
    }
    return new HitTestResult(paramHitTestResult.getType(), paramHitTestResult.getExtra());
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      Object localObject = (HitTestResult)paramObject;
      if (type != type) {
        return false;
      }
      paramObject = extra;
      localObject = extra;
      if (paramObject != null) {
        bool = ((String)paramObject).equals(localObject);
      } else if (localObject != null) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public String getExtra()
  {
    return extra;
  }
  
  public int getType()
  {
    return type;
  }
  
  public int hashCode()
  {
    int i = type;
    String str = extra;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    return i * 31 + j;
  }
  
  public void setExtra(String paramString)
  {
    extra = paramString;
  }
  
  public void setType(int paramInt)
  {
    type = paramInt;
  }
  
  public Map<String, Object> toMap()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("type", Integer.valueOf(type));
    localHashMap.put("extra", extra);
    return localHashMap;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("HitTestResultMap{type=");
    localStringBuilder.append(type);
    localStringBuilder.append(", extra='");
    localStringBuilder.append(extra);
    localStringBuilder.append('\'');
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.HitTestResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */