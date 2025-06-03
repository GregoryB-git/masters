package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.print.PrintJobInfo;
import android.print.PrinterId;
import java.util.HashMap;
import java.util.Map;

public class PrintJobInfoExt
{
  private PrintAttributesExt attributes;
  private int copies;
  private long creationTime;
  private String label;
  private Integer numberOfPages;
  private String printerId;
  private int state;
  
  public static PrintJobInfoExt fromPrintJobInfo(PrintJobInfo paramPrintJobInfo)
  {
    Object localObject1 = null;
    if (paramPrintJobInfo == null) {
      return null;
    }
    PrintJobInfoExt localPrintJobInfoExt = new PrintJobInfoExt();
    state = paramPrintJobInfo.getState();
    copies = paramPrintJobInfo.getCopies();
    if (paramPrintJobInfo.getPages() != null) {
      localObject2 = Integer.valueOf(paramPrintJobInfo.getPages().length);
    } else {
      localObject2 = null;
    }
    numberOfPages = ((Integer)localObject2);
    creationTime = paramPrintJobInfo.getCreationTime();
    label = paramPrintJobInfo.getLabel();
    Object localObject2 = localObject1;
    if (paramPrintJobInfo.getPrinterId() != null) {
      localObject2 = paramPrintJobInfo.getPrinterId().getLocalId();
    }
    printerId = ((String)localObject2);
    attributes = PrintAttributesExt.fromPrintAttributes(paramPrintJobInfo.getAttributes());
    return localPrintJobInfoExt;
  }
  
  public Map<String, Object> toMap()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("state", Integer.valueOf(state));
    localHashMap.put("copies", Integer.valueOf(copies));
    localHashMap.put("numberOfPages", numberOfPages);
    localHashMap.put("creationTime", Long.valueOf(creationTime));
    localHashMap.put("label", label);
    Object localObject = new HashMap();
    ((HashMap)localObject).put("id", printerId);
    localHashMap.put("printer", localObject);
    localObject = attributes;
    if (localObject != null) {
      localObject = ((PrintAttributesExt)localObject).toMap();
    } else {
      localObject = null;
    }
    localHashMap.put("attributes", localObject);
    return localHashMap;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.PrintJobInfoExt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */