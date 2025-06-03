package com.pichillilorenzo.flutter_inappwebview_android.content_blocker;

import a0.j;
import f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class ContentBlockerTrigger
{
  private List<String> ifDomain = new ArrayList();
  private List<String> ifTopUrl = new ArrayList();
  private List<String> loadType = new ArrayList();
  private List<ContentBlockerTriggerResourceType> resourceType = new ArrayList();
  private List<String> unlessDomain = new ArrayList();
  private List<String> unlessTopUrl = new ArrayList();
  private String urlFilter;
  private Boolean urlFilterIsCaseSensitive;
  private Pattern urlFilterPatternCompiled;
  
  public ContentBlockerTrigger(String paramString, Boolean paramBoolean, List<ContentBlockerTriggerResourceType> paramList, List<String> paramList1, List<String> paramList2, List<String> paramList3, List<String> paramList4, List<String> paramList5)
  {
    int i = 0;
    boolean bool;
    if (paramBoolean != null) {
      bool = paramBoolean.booleanValue();
    } else {
      bool = false;
    }
    paramBoolean = Boolean.valueOf(bool);
    urlFilterIsCaseSensitive = paramBoolean;
    urlFilter = paramString;
    int j;
    if (paramBoolean.booleanValue()) {
      j = 0;
    } else {
      j = 2;
    }
    urlFilterPatternCompiled = Pattern.compile(paramString, j);
    if (paramList == null) {
      paramList = resourceType;
    }
    resourceType = paramList;
    if (paramList1 == null) {
      paramList1 = ifDomain;
    }
    ifDomain = paramList1;
    if (paramList2 == null) {
      paramList2 = unlessDomain;
    }
    unlessDomain = paramList2;
    if ((!paramList1.isEmpty()) && (!unlessDomain.isEmpty())) {
      j = 1;
    } else {
      j = 0;
    }
    if (j == 0)
    {
      if (paramList3 == null) {
        paramList3 = loadType;
      }
      loadType = paramList3;
      if (paramList3.size() <= 2)
      {
        if (paramList4 == null) {
          paramList4 = ifTopUrl;
        }
        ifTopUrl = paramList4;
        if (paramList5 == null) {
          paramList5 = unlessTopUrl;
        }
        unlessTopUrl = paramList5;
        j = i;
        if (!paramList4.isEmpty())
        {
          j = i;
          if (!unlessTopUrl.isEmpty()) {
            j = 1;
          }
        }
        if (j == 0) {
          return;
        }
        throw new AssertionError();
      }
      throw new AssertionError();
    }
    throw new AssertionError();
  }
  
  public static ContentBlockerTrigger fromMap(Map<String, Object> paramMap)
  {
    String str = (String)paramMap.get("url-filter");
    Boolean localBoolean = (Boolean)paramMap.get("url-filter-is-case-sensitive");
    Object localObject = (List)paramMap.get("resource-type");
    ArrayList localArrayList = new ArrayList();
    if (localObject != null)
    {
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        localArrayList.add(ContentBlockerTriggerResourceType.fromValue((String)((Iterator)localObject).next()));
      }
    }
    localArrayList.addAll(Arrays.asList(ContentBlockerTriggerResourceType.values()));
    return new ContentBlockerTrigger(str, localBoolean, localArrayList, (List)paramMap.get("if-domain"), (List)paramMap.get("unless-domain"), (List)paramMap.get("load-type"), (List)paramMap.get("if-top-url"), (List)paramMap.get("unless-top-url"));
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (ContentBlockerTrigger)paramObject;
      if (!urlFilter.equals(urlFilter)) {
        return false;
      }
      if (!urlFilterPatternCompiled.equals(urlFilterPatternCompiled)) {
        return false;
      }
      if (!urlFilterIsCaseSensitive.equals(urlFilterIsCaseSensitive)) {
        return false;
      }
      if (!resourceType.equals(resourceType)) {
        return false;
      }
      if (!ifDomain.equals(ifDomain)) {
        return false;
      }
      if (!unlessDomain.equals(unlessDomain)) {
        return false;
      }
      if (!loadType.equals(loadType)) {
        return false;
      }
      if (!ifTopUrl.equals(ifTopUrl)) {
        return false;
      }
      return unlessTopUrl.equals(unlessTopUrl);
    }
    return false;
  }
  
  public List<String> getIfDomain()
  {
    return ifDomain;
  }
  
  public List<String> getIfTopUrl()
  {
    return ifTopUrl;
  }
  
  public List<String> getLoadType()
  {
    return loadType;
  }
  
  public List<ContentBlockerTriggerResourceType> getResourceType()
  {
    return resourceType;
  }
  
  public List<String> getUnlessDomain()
  {
    return unlessDomain;
  }
  
  public List<String> getUnlessTopUrl()
  {
    return unlessTopUrl;
  }
  
  public String getUrlFilter()
  {
    return urlFilter;
  }
  
  public Boolean getUrlFilterIsCaseSensitive()
  {
    return urlFilterIsCaseSensitive;
  }
  
  public Pattern getUrlFilterPatternCompiled()
  {
    return urlFilterPatternCompiled;
  }
  
  public int hashCode()
  {
    int i = urlFilter.hashCode();
    int j = urlFilterPatternCompiled.hashCode();
    int k = urlFilterIsCaseSensitive.hashCode();
    int m = resourceType.hashCode();
    int n = ifDomain.hashCode();
    int i1 = unlessDomain.hashCode();
    int i2 = loadType.hashCode();
    int i3 = ifTopUrl.hashCode();
    return unlessTopUrl.hashCode() + (i3 + (i2 + (i1 + (n + (m + (k + (j + i * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31;
  }
  
  public void setIfDomain(List<String> paramList)
  {
    ifDomain = paramList;
  }
  
  public void setIfTopUrl(List<String> paramList)
  {
    ifTopUrl = paramList;
  }
  
  public void setLoadType(List<String> paramList)
  {
    loadType = paramList;
  }
  
  public void setResourceType(List<ContentBlockerTriggerResourceType> paramList)
  {
    resourceType = paramList;
  }
  
  public void setUnlessDomain(List<String> paramList)
  {
    unlessDomain = paramList;
  }
  
  public void setUnlessTopUrl(List<String> paramList)
  {
    unlessTopUrl = paramList;
  }
  
  public void setUrlFilter(String paramString)
  {
    urlFilter = paramString;
  }
  
  public void setUrlFilterIsCaseSensitive(Boolean paramBoolean)
  {
    urlFilterIsCaseSensitive = paramBoolean;
  }
  
  public void setUrlFilterPatternCompiled(Pattern paramPattern)
  {
    urlFilterPatternCompiled = paramPattern;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("ContentBlockerTrigger{urlFilter='");
    j.s(localStringBuilder, urlFilter, '\'', ", urlFilterPatternCompiled=");
    localStringBuilder.append(urlFilterPatternCompiled);
    localStringBuilder.append(", urlFilterIsCaseSensitive=");
    localStringBuilder.append(urlFilterIsCaseSensitive);
    localStringBuilder.append(", resourceType=");
    localStringBuilder.append(resourceType);
    localStringBuilder.append(", ifDomain=");
    localStringBuilder.append(ifDomain);
    localStringBuilder.append(", unlessDomain=");
    localStringBuilder.append(unlessDomain);
    localStringBuilder.append(", loadType=");
    localStringBuilder.append(loadType);
    localStringBuilder.append(", ifTopUrl=");
    localStringBuilder.append(ifTopUrl);
    localStringBuilder.append(", unlessTopUrl=");
    localStringBuilder.append(unlessTopUrl);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerTrigger
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */