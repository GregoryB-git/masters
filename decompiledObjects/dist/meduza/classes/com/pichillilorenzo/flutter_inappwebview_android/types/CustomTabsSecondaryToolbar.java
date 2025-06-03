package com.pichillilorenzo.flutter_inappwebview_android.types;

import f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CustomTabsSecondaryToolbar
{
  private List<AndroidResource> clickableIDs;
  private AndroidResource layout;
  
  public CustomTabsSecondaryToolbar(AndroidResource paramAndroidResource, List<AndroidResource> paramList)
  {
    new ArrayList();
    layout = paramAndroidResource;
    clickableIDs = paramList;
  }
  
  public static CustomTabsSecondaryToolbar fromMap(Map<String, Object> paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    AndroidResource localAndroidResource = AndroidResource.fromMap((Map)paramMap.get("layout"));
    ArrayList localArrayList = new ArrayList();
    paramMap = (List)paramMap.get("clickableIDs");
    if (paramMap != null)
    {
      Iterator localIterator = paramMap.iterator();
      while (localIterator.hasNext())
      {
        paramMap = AndroidResource.fromMap((Map)((Map)localIterator.next()).get("id"));
        if (paramMap != null) {
          localArrayList.add(paramMap);
        }
      }
    }
    return new CustomTabsSecondaryToolbar(localAndroidResource, localArrayList);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (CustomTabsSecondaryToolbar)paramObject;
      if (!layout.equals(layout)) {
        return false;
      }
      return clickableIDs.equals(clickableIDs);
    }
    return false;
  }
  
  public List<AndroidResource> getClickableIDs()
  {
    return clickableIDs;
  }
  
  public AndroidResource getLayout()
  {
    return layout;
  }
  
  public int hashCode()
  {
    int i = layout.hashCode();
    return clickableIDs.hashCode() + i * 31;
  }
  
  public void setClickableIDs(List<AndroidResource> paramList)
  {
    clickableIDs = paramList;
  }
  
  public void setLayout(AndroidResource paramAndroidResource)
  {
    layout = paramAndroidResource;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("CustomTabsSecondaryToolbar{layout=");
    localStringBuilder.append(layout);
    localStringBuilder.append(", clickableIDs=");
    localStringBuilder.append(clickableIDs);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsSecondaryToolbar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */