package com.pichillilorenzo.flutter_inappwebview_android.types;

import a0.j;
import f;
import java.util.HashMap;
import java.util.Map;

public class ProxyRuleExt
{
  private String schemeFilter;
  private String url;
  
  public ProxyRuleExt(String paramString1, String paramString2)
  {
    schemeFilter = paramString1;
    url = paramString2;
  }
  
  public static ProxyRuleExt fromMap(Map<String, String> paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    String str = (String)paramMap.get("url");
    return new ProxyRuleExt((String)paramMap.get("schemeFilter"), str);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      ProxyRuleExt localProxyRuleExt = (ProxyRuleExt)paramObject;
      paramObject = schemeFilter;
      if (paramObject != null ? !((String)paramObject).equals(schemeFilter) : schemeFilter != null) {
        return false;
      }
      return url.equals(url);
    }
    return false;
  }
  
  public String getSchemeFilter()
  {
    return schemeFilter;
  }
  
  public String getUrl()
  {
    return url;
  }
  
  public int hashCode()
  {
    String str = schemeFilter;
    int i;
    if (str != null) {
      i = str.hashCode();
    } else {
      i = 0;
    }
    return url.hashCode() + i * 31;
  }
  
  public void setSchemeFilter(String paramString)
  {
    schemeFilter = paramString;
  }
  
  public void setUrl(String paramString)
  {
    url = paramString;
  }
  
  public Map<String, String> toMap()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("url", url);
    localHashMap.put("schemeFilter", schemeFilter);
    return localHashMap;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("ProxyRuleExt{schemeFilter='");
    j.s(localStringBuilder, schemeFilter, '\'', ", url='");
    localStringBuilder.append(url);
    localStringBuilder.append('\'');
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.ProxyRuleExt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */