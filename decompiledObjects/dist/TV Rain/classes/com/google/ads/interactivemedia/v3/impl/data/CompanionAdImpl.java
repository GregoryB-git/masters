package com.google.ads.interactivemedia.v3.impl.data;

import a;
import com.google.ads.interactivemedia.v3.api.CompanionAd;
import com.google.ads.interactivemedia.v3.internal.aje;
import com.google.ads.interactivemedia.v3.internal.ajg;

public class CompanionAdImpl
  implements CompanionAd
{
  private String apiFramework;
  private int height;
  private String resourceValue;
  private int width;
  
  public boolean equals(Object paramObject)
  {
    return aje.a(this, paramObject, new String[0]);
  }
  
  public String getApiFramework()
  {
    return apiFramework;
  }
  
  public int getHeight()
  {
    return height;
  }
  
  public String getResourceValue()
  {
    return resourceValue;
  }
  
  public int getWidth()
  {
    return width;
  }
  
  public int hashCode()
  {
    return ajg.a(this, new String[0]);
  }
  
  public void setApiFramework(String paramString)
  {
    apiFramework = paramString;
  }
  
  public void setHeight(int paramInt)
  {
    height = paramInt;
  }
  
  public void setResourceValue(String paramString)
  {
    resourceValue = paramString;
  }
  
  public void setWidth(int paramInt)
  {
    width = paramInt;
  }
  
  public String toString()
  {
    Object localObject = apiFramework;
    String str = resourceValue;
    int i = width;
    int j = height;
    localObject = a.q(a.b(str, a.b((String)localObject, 80)), "CompanionAd [apiFramework=", (String)localObject, ", resourceUrl=", str);
    ((StringBuilder)localObject).append(", width=");
    ((StringBuilder)localObject).append(i);
    ((StringBuilder)localObject).append(", height=");
    ((StringBuilder)localObject).append(j);
    ((StringBuilder)localObject).append("]");
    return ((StringBuilder)localObject).toString();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.CompanionAdImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */