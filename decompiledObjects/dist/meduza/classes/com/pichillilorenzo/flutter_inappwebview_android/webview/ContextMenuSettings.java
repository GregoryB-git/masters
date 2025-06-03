package com.pichillilorenzo.flutter_inappwebview_android.webview;

import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ContextMenuSettings
  implements ISettings<Object>
{
  public static final String LOG_TAG = "ContextMenuOptions";
  public Boolean hideDefaultSystemContextMenuItems = Boolean.FALSE;
  
  public Map<String, Object> getRealSettings(Object paramObject)
  {
    return toMap();
  }
  
  public ContextMenuSettings parse(Map<String, Object> paramMap)
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
        if (str.equals("hideDefaultSystemContextMenuItems")) {
          hideDefaultSystemContextMenuItems = ((Boolean)localObject);
        }
      }
    }
    return this;
  }
  
  public Map<String, Object> toMap()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("hideDefaultSystemContextMenuItems", hideDefaultSystemContextMenuItems);
    return localHashMap;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.ContextMenuSettings
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */