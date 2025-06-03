package com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh;

import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PullToRefreshSettings
  implements ISettings<PullToRefreshLayout>
{
  public static final String LOG_TAG = "PullToRefreshSettings";
  public String backgroundColor;
  public String color;
  public Integer distanceToTriggerSync;
  public Boolean enabled = Boolean.TRUE;
  public Integer size;
  public Integer slingshotDistance;
  
  public Map<String, Object> getRealSettings(PullToRefreshLayout paramPullToRefreshLayout)
  {
    return toMap();
  }
  
  public PullToRefreshSettings parse(Map<String, Object> paramMap)
  {
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Object localObject = (Map.Entry)paramMap.next();
      String str = (String)((Map.Entry)localObject).getKey();
      localObject = ((Map.Entry)localObject).getValue();
      if (localObject != null)
      {
        str.getClass();
        int i = -1;
        switch (str.hashCode())
        {
        default: 
          break;
        case 1719097976: 
          if (str.equals("slingshotDistance")) {
            i = 5;
          }
          break;
        case 1287124693: 
          if (str.equals("backgroundColor")) {
            i = 4;
          }
          break;
        case 94842723: 
          if (str.equals("color")) {
            i = 3;
          }
          break;
        case 3530753: 
          if (str.equals("size")) {
            i = 2;
          }
          break;
        case -1609594047: 
          if (str.equals("enabled")) {
            i = 1;
          }
          break;
        case -1878912765: 
          if (str.equals("distanceToTriggerSync")) {
            i = 0;
          }
          break;
        }
        switch (i)
        {
        default: 
          break;
        case 5: 
          slingshotDistance = ((Integer)localObject);
          break;
        case 4: 
          backgroundColor = ((String)localObject);
          break;
        case 3: 
          color = ((String)localObject);
          break;
        case 2: 
          size = ((Integer)localObject);
          break;
        case 1: 
          enabled = ((Boolean)localObject);
          break;
        case 0: 
          distanceToTriggerSync = ((Integer)localObject);
        }
      }
    }
    return this;
  }
  
  public Map<String, Object> toMap()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("enabled", enabled);
    localHashMap.put("color", color);
    localHashMap.put("backgroundColor", backgroundColor);
    localHashMap.put("distanceToTriggerSync", distanceToTriggerSync);
    localHashMap.put("slingshotDistance", slingshotDistance);
    localHashMap.put("size", size);
    return localHashMap;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshSettings
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */