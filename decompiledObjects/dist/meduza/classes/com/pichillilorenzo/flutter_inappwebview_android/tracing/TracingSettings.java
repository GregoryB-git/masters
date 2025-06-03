package com.pichillilorenzo.flutter_inappwebview_android.tracing;

import c2.i;
import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TracingSettings
  implements ISettings<i>
{
  public static final String LOG_TAG = "TracingSettings";
  public List<Object> categories = new ArrayList();
  public Integer tracingMode;
  
  public Map<String, Object> getRealSettings(i parami)
  {
    return toMap();
  }
  
  public TracingSettings parse(Map<String, Object> paramMap)
  {
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      paramMap = (String)((Map.Entry)localObject).getKey();
      localObject = ((Map.Entry)localObject).getValue();
      if (localObject != null)
      {
        paramMap.getClass();
        if (!paramMap.equals("tracingMode"))
        {
          if (paramMap.equals("categories")) {
            categories = ((List)localObject);
          }
        }
        else {
          tracingMode = ((Integer)localObject);
        }
      }
    }
    return this;
  }
  
  public Map<String, Object> toMap()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("categories", categories);
    localHashMap.put("tracingMode", tracingMode);
    return localHashMap;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.tracing.TracingSettings
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */