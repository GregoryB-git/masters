package com.pichillilorenzo.flutter_inappwebview_android.print_job;

import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
import com.pichillilorenzo.flutter_inappwebview_android.types.MediaSizeExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.ResolutionExt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintJobSettings
  implements ISettings<PrintJobController>
{
  public static final String LOG_TAG = "PrintJobSettings";
  public Integer colorMode;
  public Integer duplexMode;
  public Boolean handledByClient = Boolean.FALSE;
  public String jobName;
  public MediaSizeExt mediaSize;
  public Integer orientation;
  public ResolutionExt resolution;
  
  public Map<String, Object> getRealSettings(PrintJobController paramPrintJobController)
  {
    return toMap();
  }
  
  public PrintJobSettings parse(Map<String, Object> paramMap)
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
        case 2140418565: 
          if (str.equals("mediaSize")) {
            i = 6;
          }
          break;
        case 1980724134: 
          if (str.equals("colorMode")) {
            i = 5;
          }
          break;
        case -244986274: 
          if (str.equals("handledByClient")) {
            i = 4;
          }
          break;
        case -1438096408: 
          if (str.equals("jobName")) {
            i = 3;
          }
          break;
        case -1439500848: 
          if (str.equals("orientation")) {
            i = 2;
          }
          break;
        case -1498106493: 
          if (str.equals("duplexMode")) {
            i = 1;
          }
          break;
        case -1600030548: 
          if (str.equals("resolution")) {
            i = 0;
          }
          break;
        }
        switch (i)
        {
        default: 
          break;
        case 6: 
          mediaSize = MediaSizeExt.fromMap((Map)localObject);
          break;
        case 5: 
          colorMode = ((Integer)localObject);
          break;
        case 4: 
          handledByClient = ((Boolean)localObject);
          break;
        case 3: 
          jobName = ((String)localObject);
          break;
        case 2: 
          orientation = ((Integer)localObject);
          break;
        case 1: 
          duplexMode = ((Integer)localObject);
          break;
        case 0: 
          resolution = ResolutionExt.fromMap((Map)localObject);
        }
      }
    }
    return this;
  }
  
  public Map<String, Object> toMap()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("handledByClient", handledByClient);
    localHashMap.put("jobName", jobName);
    localHashMap.put("orientation", orientation);
    Object localObject1 = mediaSize;
    Object localObject2 = null;
    if (localObject1 != null) {
      localObject1 = ((MediaSizeExt)localObject1).toMap();
    } else {
      localObject1 = null;
    }
    localHashMap.put("mediaSize", localObject1);
    localHashMap.put("colorMode", colorMode);
    localHashMap.put("duplexMode", duplexMode);
    ResolutionExt localResolutionExt = resolution;
    localObject1 = localObject2;
    if (localResolutionExt != null) {
      localObject1 = localResolutionExt.toMap();
    }
    localHashMap.put("resolution", localObject1);
    return localHashMap;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobSettings
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */