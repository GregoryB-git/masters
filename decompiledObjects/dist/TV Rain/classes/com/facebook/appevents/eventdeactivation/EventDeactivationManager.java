package com.facebook.appevents.eventdeactivation;

import androidx.annotation.RestrictTo;
import com.facebook.appevents.AppEvent;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class EventDeactivationManager
{
  private static final Set<String> deprecatedEvents = new HashSet();
  private static final List<DeprecatedParamFilter> deprecatedParamFilters = new ArrayList();
  private static boolean enabled = false;
  
  public static void enable()
  {
    if (CrashShieldHandler.isObjectCrashing(EventDeactivationManager.class)) {
      return;
    }
    try
    {
      enabled = true;
      initialize();
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, EventDeactivationManager.class);
    }
  }
  
  /* Error */
  private static void initialize()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc 2
    //   5: invokestatic 43	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   8: istore_0
    //   9: iload_0
    //   10: ifeq +7 -> 17
    //   13: ldc 2
    //   15: monitorexit
    //   16: return
    //   17: invokestatic 60	com/facebook/FacebookSdk:getApplicationId	()Ljava/lang/String;
    //   20: iconst_0
    //   21: invokestatic 66	com/facebook/internal/FetchedAppSettingsManager:queryAppSettings	(Ljava/lang/String;Z)Lcom/facebook/internal/FetchedAppSettings;
    //   24: astore_1
    //   25: aload_1
    //   26: ifnonnull +7 -> 33
    //   29: ldc 2
    //   31: monitorexit
    //   32: return
    //   33: aload_1
    //   34: invokevirtual 71	com/facebook/internal/FetchedAppSettings:getRestrictiveDataSetting	()Ljava/lang/String;
    //   37: astore_2
    //   38: aload_2
    //   39: invokevirtual 77	java/lang/String:isEmpty	()Z
    //   42: ifne +151 -> 193
    //   45: new 79	org/json/JSONObject
    //   48: astore_1
    //   49: aload_1
    //   50: aload_2
    //   51: invokespecial 82	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   54: getstatic 29	com/facebook/appevents/eventdeactivation/EventDeactivationManager:deprecatedParamFilters	Ljava/util/List;
    //   57: invokeinterface 87 1 0
    //   62: aload_1
    //   63: invokevirtual 91	org/json/JSONObject:keys	()Ljava/util/Iterator;
    //   66: astore_3
    //   67: aload_3
    //   68: invokeinterface 96 1 0
    //   73: ifeq +120 -> 193
    //   76: aload_3
    //   77: invokeinterface 100 1 0
    //   82: checkcast 73	java/lang/String
    //   85: astore_2
    //   86: aload_1
    //   87: aload_2
    //   88: invokevirtual 104	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   91: astore 4
    //   93: aload 4
    //   95: ifnull -28 -> 67
    //   98: aload 4
    //   100: ldc 106
    //   102: invokevirtual 110	org/json/JSONObject:optBoolean	(Ljava/lang/String;)Z
    //   105: ifeq +16 -> 121
    //   108: getstatic 34	com/facebook/appevents/eventdeactivation/EventDeactivationManager:deprecatedEvents	Ljava/util/Set;
    //   111: aload_2
    //   112: invokeinterface 115 2 0
    //   117: pop
    //   118: goto -51 -> 67
    //   121: aload 4
    //   123: ldc 117
    //   125: invokevirtual 121	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   128: astore 5
    //   130: new 6	com/facebook/appevents/eventdeactivation/EventDeactivationManager$DeprecatedParamFilter
    //   133: astore 4
    //   135: new 24	java/util/ArrayList
    //   138: astore 6
    //   140: aload 6
    //   142: invokespecial 27	java/util/ArrayList:<init>	()V
    //   145: aload 4
    //   147: aload_2
    //   148: aload 6
    //   150: invokespecial 124	com/facebook/appevents/eventdeactivation/EventDeactivationManager$DeprecatedParamFilter:<init>	(Ljava/lang/String;Ljava/util/List;)V
    //   153: aload 5
    //   155: ifnull +13 -> 168
    //   158: aload 4
    //   160: aload 5
    //   162: invokestatic 130	com/facebook/internal/Utility:convertJSONArrayToList	(Lorg/json/JSONArray;)Ljava/util/List;
    //   165: putfield 133	com/facebook/appevents/eventdeactivation/EventDeactivationManager$DeprecatedParamFilter:deprecateParams	Ljava/util/List;
    //   168: getstatic 29	com/facebook/appevents/eventdeactivation/EventDeactivationManager:deprecatedParamFilters	Ljava/util/List;
    //   171: aload 4
    //   173: invokeinterface 134 2 0
    //   178: pop
    //   179: goto -112 -> 67
    //   182: astore_1
    //   183: aload_1
    //   184: ldc 2
    //   186: invokestatic 52	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   189: ldc 2
    //   191: monitorexit
    //   192: return
    //   193: ldc 2
    //   195: monitorexit
    //   196: return
    //   197: astore_1
    //   198: ldc 2
    //   200: monitorexit
    //   201: aload_1
    //   202: athrow
    //   203: astore_1
    //   204: goto -11 -> 193
    // Local variable table:
    //   start	length	slot	name	signature
    //   8	2	0	bool	boolean
    //   24	63	1	localObject1	Object
    //   182	2	1	localThrowable	Throwable
    //   197	5	1	localObject2	Object
    //   203	1	1	localException	Exception
    //   37	111	2	str	String
    //   66	11	3	localIterator	Iterator
    //   91	81	4	localObject3	Object
    //   128	33	5	localJSONArray	org.json.JSONArray
    //   138	11	6	localArrayList	ArrayList
    // Exception table:
    //   from	to	target	type
    //   17	25	182	finally
    //   33	67	182	finally
    //   67	93	182	finally
    //   98	118	182	finally
    //   121	153	182	finally
    //   158	168	182	finally
    //   168	179	182	finally
    //   3	9	197	finally
    //   183	189	197	finally
    //   17	25	203	java/lang/Exception
    //   33	67	203	java/lang/Exception
    //   67	93	203	java/lang/Exception
    //   98	118	203	java/lang/Exception
    //   121	153	203	java/lang/Exception
    //   158	168	203	java/lang/Exception
    //   168	179	203	java/lang/Exception
  }
  
  public static void processDeprecatedParameters(Map<String, String> paramMap, String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(EventDeactivationManager.class)) {
      return;
    }
    try
    {
      if (!enabled) {
        return;
      }
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(paramMap.keySet());
      Object localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>(deprecatedParamFilters);
      Iterator localIterator1 = ((ArrayList)localObject).iterator();
      while (localIterator1.hasNext())
      {
        DeprecatedParamFilter localDeprecatedParamFilter = (DeprecatedParamFilter)localIterator1.next();
        if (eventName.equals(paramString))
        {
          Iterator localIterator2 = localArrayList.iterator();
          while (localIterator2.hasNext())
          {
            localObject = (String)localIterator2.next();
            if (deprecateParams.contains(localObject)) {
              paramMap.remove(localObject);
            }
          }
        }
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramMap, EventDeactivationManager.class);
    }
  }
  
  public static void processEvents(List<AppEvent> paramList)
  {
    if (CrashShieldHandler.isObjectCrashing(EventDeactivationManager.class)) {
      return;
    }
    try
    {
      if (!enabled) {
        return;
      }
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        paramList = (AppEvent)localIterator.next();
        if (deprecatedEvents.contains(paramList.getName())) {
          localIterator.remove();
        }
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramList, EventDeactivationManager.class);
    }
  }
  
  public static class DeprecatedParamFilter
  {
    public List<String> deprecateParams;
    public String eventName;
    
    public DeprecatedParamFilter(String paramString, List<String> paramList)
    {
      eventName = paramString;
      deprecateParams = paramList;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.eventdeactivation.EventDeactivationManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */