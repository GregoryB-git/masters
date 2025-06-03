package com.pichillilorenzo.flutter_inappwebview_android.types;

import f;
import java.util.HashMap;
import java.util.Map;

public class FindSession
{
  private int highlightedResultIndex;
  private int resultCount;
  private int searchResultDisplayStyle = 2;
  
  public FindSession(int paramInt1, int paramInt2)
  {
    resultCount = paramInt1;
    highlightedResultIndex = paramInt2;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (FindSession)paramObject;
      if (resultCount != resultCount) {
        return false;
      }
      if (highlightedResultIndex != highlightedResultIndex) {
        return false;
      }
      if (searchResultDisplayStyle != searchResultDisplayStyle) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int getHighlightedResultIndex()
  {
    return highlightedResultIndex;
  }
  
  public int getResultCount()
  {
    return resultCount;
  }
  
  public int getSearchResultDisplayStyle()
  {
    return searchResultDisplayStyle;
  }
  
  public int hashCode()
  {
    return (resultCount * 31 + highlightedResultIndex) * 31 + searchResultDisplayStyle;
  }
  
  public void setHighlightedResultIndex(int paramInt)
  {
    highlightedResultIndex = paramInt;
  }
  
  public void setResultCount(int paramInt)
  {
    resultCount = paramInt;
  }
  
  public void setSearchResultDisplayStyle(int paramInt)
  {
    searchResultDisplayStyle = paramInt;
  }
  
  public Map<String, Object> toMap()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("resultCount", Integer.valueOf(resultCount));
    localHashMap.put("highlightedResultIndex", Integer.valueOf(highlightedResultIndex));
    localHashMap.put("searchResultDisplayStyle", Integer.valueOf(searchResultDisplayStyle));
    return localHashMap;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("FindSession{resultCount=");
    localStringBuilder.append(resultCount);
    localStringBuilder.append(", highlightedResultIndex=");
    localStringBuilder.append(highlightedResultIndex);
    localStringBuilder.append(", searchResultDisplayStyle=");
    localStringBuilder.append(searchResultDisplayStyle);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.FindSession
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */