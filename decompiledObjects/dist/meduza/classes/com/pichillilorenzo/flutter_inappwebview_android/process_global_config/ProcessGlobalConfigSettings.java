package com.pichillilorenzo.flutter_inappwebview_android.process_global_config;

import android.content.Context;
import androidx.webkit.ProcessGlobalConfig;
import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
import d2.i0;
import d2.z;
import g;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import x6.b;

public class ProcessGlobalConfigSettings
  implements ISettings<ProcessGlobalConfig>
{
  public static final String LOG_TAG = "ProcessGlobalConfigSettings";
  public String dataDirectorySuffix;
  public DirectoryBasePaths directoryBasePaths;
  
  public Map<String, Object> getRealSettings(ProcessGlobalConfig paramProcessGlobalConfig)
  {
    return toMap();
  }
  
  public ProcessGlobalConfigSettings parse(Map<String, Object> paramMap)
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
        if (!str.equals("dataDirectorySuffix"))
        {
          if (str.equals("directoryBasePaths")) {
            directoryBasePaths = new DirectoryBasePaths().parse((Map)localObject);
          }
        }
        else {
          dataDirectorySuffix = ((String)localObject);
        }
      }
    }
    return this;
  }
  
  public Map<String, Object> toMap()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("dataDirectorySuffix", dataDirectorySuffix);
    return localHashMap;
  }
  
  public ProcessGlobalConfig toProcessGlobalConfig(Context paramContext)
  {
    ProcessGlobalConfig localProcessGlobalConfig = new ProcessGlobalConfig();
    Object localObject;
    if ((dataDirectorySuffix != null) && (b.e0(paramContext, "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX")))
    {
      localObject = dataDirectorySuffix;
      if (i0.A.a(paramContext))
      {
        if (!((String)localObject).equals(""))
        {
          if (((String)localObject).indexOf(File.separatorChar) < 0) {
            a = ((String)localObject);
          } else {
            throw new IllegalArgumentException(g.e("Suffix ", (String)localObject, " contains a path separator"));
          }
        }
        else {
          throw new IllegalArgumentException("Suffix cannot be an empty string");
        }
      }
      else {
        throw i0.a();
      }
    }
    if ((directoryBasePaths != null) && (b.e0(paramContext, "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS")))
    {
      localObject = new File(directoryBasePaths.dataDirectoryBasePath);
      File localFile = new File(directoryBasePaths.cacheDirectoryBasePath);
      if (i0.B.a(paramContext))
      {
        if (((File)localObject).isAbsolute())
        {
          if (localFile.isAbsolute())
          {
            b = ((File)localObject).getAbsolutePath();
            c = localFile.getAbsolutePath();
          }
          else
          {
            throw new IllegalArgumentException("cacheDirectoryBasePath must be a non-empty absolute path");
          }
        }
        else {
          throw new IllegalArgumentException("dataDirectoryBasePath must be a non-empty absolute path");
        }
      }
      else {
        throw i0.a();
      }
    }
    return localProcessGlobalConfig;
  }
  
  public static class DirectoryBasePaths
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
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.process_global_config.ProcessGlobalConfigSettings
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */