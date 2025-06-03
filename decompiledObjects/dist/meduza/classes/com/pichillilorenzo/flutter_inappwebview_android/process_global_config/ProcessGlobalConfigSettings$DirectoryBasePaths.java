package com.pichillilorenzo.flutter_inappwebview_android.process_global_config;

import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class ProcessGlobalConfigSettings$DirectoryBasePaths
  implements ISettings<Object>
{
  public static final String LOG_TAG = "ProcessGlobalConfigSettings";
  public String cacheDirectoryBasePath;
  public String dataDirectoryBasePath;
  
  public Map<String, Object> getRealSettings(Object paramObject)
  {
    return toMap();
  }
  
  public DirectoryBasePaths parse(Map<String, Object> paramMap)
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
        if (!paramMap.equals("dataDirectoryBasePath"))
        {
          if (paramMap.equals("cacheDirectoryBasePath")) {
            cacheDirectoryBasePath = ((String)localObject);
          }
        }
        else {
          dataDirectoryBasePath = ((String)localObject);
        }
      }
    }
    return this;
  }
  
  public Map<String, Object> toMap()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("cacheDirectoryBasePath", cacheDirectoryBasePath);
    localHashMap.put("dataDirectoryBasePath", dataDirectoryBasePath);
    return localHashMap;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.process_global_config.ProcessGlobalConfigSettings.DirectoryBasePaths
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */