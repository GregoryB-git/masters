package com.facebook.appevents.restrictivedatafilter;

import androidx.annotation.RestrictTo;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class RestrictiveDataManager
{
  private static final String PROCESS_EVENT_NAME = "process_event_name";
  private static final String REPLACEMENT_STRING = "_removed_";
  private static final String RESTRICTIVE_PARAM = "restrictive_param";
  private static final String RESTRICTIVE_PARAM_KEY = "_restrictedParams";
  private static final String TAG = "com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager";
  private static boolean enabled = false;
  private static final Set<String> restrictedEvents = new CopyOnWriteArraySet();
  private static final List<RestrictiveParamFilter> restrictiveParamFilters = new ArrayList();
  
  public static void enable()
  {
    if (CrashShieldHandler.isObjectCrashing(RestrictiveDataManager.class)) {
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
      CrashShieldHandler.handleThrowable(localThrowable, RestrictiveDataManager.class);
    }
  }
  
  /* Error */
  @androidx.annotation.Nullable
  private static String getMatchedRuleType(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 59	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: ifeq +5 -> 10
    //   8: aconst_null
    //   9: areturn
    //   10: new 40	java/util/ArrayList
    //   13: astore_2
    //   14: aload_2
    //   15: getstatic 45	com/facebook/appevents/restrictivedatafilter/RestrictiveDataManager:restrictiveParamFilters	Ljava/util/List;
    //   18: invokespecial 76	java/util/ArrayList:<init>	(Ljava/util/Collection;)V
    //   21: aload_2
    //   22: invokevirtual 80	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   25: astore_3
    //   26: aload_3
    //   27: invokeinterface 86 1 0
    //   32: ifeq +112 -> 144
    //   35: aload_3
    //   36: invokeinterface 90 1 0
    //   41: checkcast 6	com/facebook/appevents/restrictivedatafilter/RestrictiveDataManager$RestrictiveParamFilter
    //   44: astore 4
    //   46: aload 4
    //   48: ifnonnull +6 -> 54
    //   51: goto -25 -> 26
    //   54: aload_0
    //   55: aload 4
    //   57: getfield 93	com/facebook/appevents/restrictivedatafilter/RestrictiveDataManager$RestrictiveParamFilter:eventName	Ljava/lang/String;
    //   60: invokevirtual 98	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   63: ifeq -37 -> 26
    //   66: aload 4
    //   68: getfield 102	com/facebook/appevents/restrictivedatafilter/RestrictiveDataManager$RestrictiveParamFilter:restrictiveParams	Ljava/util/Map;
    //   71: invokeinterface 108 1 0
    //   76: invokeinterface 111 1 0
    //   81: astore_2
    //   82: aload_2
    //   83: invokeinterface 86 1 0
    //   88: ifeq -62 -> 26
    //   91: aload_2
    //   92: invokeinterface 90 1 0
    //   97: checkcast 95	java/lang/String
    //   100: astore 5
    //   102: aload_1
    //   103: aload 5
    //   105: invokevirtual 98	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   108: ifeq -26 -> 82
    //   111: aload 4
    //   113: getfield 102	com/facebook/appevents/restrictivedatafilter/RestrictiveDataManager$RestrictiveParamFilter:restrictiveParams	Ljava/util/Map;
    //   116: aload 5
    //   118: invokeinterface 115 2 0
    //   123: checkcast 95	java/lang/String
    //   126: astore_0
    //   127: aload_0
    //   128: areturn
    //   129: astore_0
    //   130: goto +16 -> 146
    //   133: astore_0
    //   134: getstatic 117	com/facebook/appevents/restrictivedatafilter/RestrictiveDataManager:TAG	Ljava/lang/String;
    //   137: ldc 119
    //   139: aload_0
    //   140: invokestatic 125	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   143: pop
    //   144: aconst_null
    //   145: areturn
    //   146: aload_0
    //   147: ldc 2
    //   149: invokestatic 68	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   152: aconst_null
    //   153: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	154	0	paramString1	String
    //   0	154	1	paramString2	String
    //   13	79	2	localObject	Object
    //   25	11	3	localIterator	java.util.Iterator
    //   44	68	4	localRestrictiveParamFilter	RestrictiveParamFilter
    //   100	17	5	str	String
    // Exception table:
    //   from	to	target	type
    //   10	26	129	finally
    //   26	46	129	finally
    //   54	82	129	finally
    //   82	127	129	finally
    //   134	144	129	finally
    //   10	26	133	java/lang/Exception
    //   26	46	133	java/lang/Exception
    //   54	82	133	java/lang/Exception
    //   82	127	133	java/lang/Exception
  }
  
  /* Error */
  private static void initialize()
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 59	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: invokestatic 132	com/facebook/FacebookSdk:getApplicationId	()Ljava/lang/String;
    //   12: iconst_0
    //   13: invokestatic 138	com/facebook/internal/FetchedAppSettingsManager:queryAppSettings	(Ljava/lang/String;Z)Lcom/facebook/internal/FetchedAppSettings;
    //   16: astore_0
    //   17: aload_0
    //   18: ifnonnull +4 -> 22
    //   21: return
    //   22: aload_0
    //   23: invokevirtual 143	com/facebook/internal/FetchedAppSettings:getRestrictiveDataSetting	()Ljava/lang/String;
    //   26: astore_1
    //   27: aload_1
    //   28: ifnull +156 -> 184
    //   31: aload_1
    //   32: invokevirtual 146	java/lang/String:isEmpty	()Z
    //   35: ifeq +6 -> 41
    //   38: goto +146 -> 184
    //   41: new 148	org/json/JSONObject
    //   44: astore_0
    //   45: aload_0
    //   46: aload_1
    //   47: invokespecial 151	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   50: getstatic 45	com/facebook/appevents/restrictivedatafilter/RestrictiveDataManager:restrictiveParamFilters	Ljava/util/List;
    //   53: invokeinterface 156 1 0
    //   58: getstatic 50	com/facebook/appevents/restrictivedatafilter/RestrictiveDataManager:restrictedEvents	Ljava/util/Set;
    //   61: invokeinterface 157 1 0
    //   66: aload_0
    //   67: invokevirtual 160	org/json/JSONObject:keys	()Ljava/util/Iterator;
    //   70: astore_2
    //   71: aload_2
    //   72: invokeinterface 86 1 0
    //   77: ifeq +115 -> 192
    //   80: aload_2
    //   81: invokeinterface 90 1 0
    //   86: checkcast 95	java/lang/String
    //   89: astore_3
    //   90: aload_0
    //   91: aload_3
    //   92: invokevirtual 164	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   95: astore 4
    //   97: aload 4
    //   99: ifnull -28 -> 71
    //   102: aload 4
    //   104: ldc 21
    //   106: invokevirtual 167	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   109: astore 5
    //   111: new 6	com/facebook/appevents/restrictivedatafilter/RestrictiveDataManager$RestrictiveParamFilter
    //   114: astore 6
    //   116: new 169	java/util/HashMap
    //   119: astore_1
    //   120: aload_1
    //   121: invokespecial 170	java/util/HashMap:<init>	()V
    //   124: aload 6
    //   126: aload_3
    //   127: aload_1
    //   128: invokespecial 173	com/facebook/appevents/restrictivedatafilter/RestrictiveDataManager$RestrictiveParamFilter:<init>	(Ljava/lang/String;Ljava/util/Map;)V
    //   131: aload 5
    //   133: ifnull +24 -> 157
    //   136: aload 6
    //   138: aload 5
    //   140: invokestatic 179	com/facebook/internal/Utility:convertJSONObjectToStringMap	(Lorg/json/JSONObject;)Ljava/util/Map;
    //   143: putfield 102	com/facebook/appevents/restrictivedatafilter/RestrictiveDataManager$RestrictiveParamFilter:restrictiveParams	Ljava/util/Map;
    //   146: getstatic 45	com/facebook/appevents/restrictivedatafilter/RestrictiveDataManager:restrictiveParamFilters	Ljava/util/List;
    //   149: aload 6
    //   151: invokeinterface 182 2 0
    //   156: pop
    //   157: aload 4
    //   159: ldc 15
    //   161: invokevirtual 186	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   164: ifeq -93 -> 71
    //   167: getstatic 50	com/facebook/appevents/restrictivedatafilter/RestrictiveDataManager:restrictedEvents	Ljava/util/Set;
    //   170: aload 6
    //   172: getfield 93	com/facebook/appevents/restrictivedatafilter/RestrictiveDataManager$RestrictiveParamFilter:eventName	Ljava/lang/String;
    //   175: invokeinterface 187 2 0
    //   180: pop
    //   181: goto -110 -> 71
    //   184: return
    //   185: astore_0
    //   186: aload_0
    //   187: ldc 2
    //   189: invokestatic 68	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   192: return
    //   193: astore_0
    //   194: goto -2 -> 192
    // Local variable table:
    //   start	length	slot	name	signature
    //   16	75	0	localObject1	Object
    //   185	2	0	localThrowable	Throwable
    //   193	1	0	localException	Exception
    //   26	102	1	localObject2	Object
    //   70	11	2	localIterator	java.util.Iterator
    //   89	38	3	str	String
    //   95	63	4	localJSONObject1	org.json.JSONObject
    //   109	30	5	localJSONObject2	org.json.JSONObject
    //   114	57	6	localRestrictiveParamFilter	RestrictiveParamFilter
    // Exception table:
    //   from	to	target	type
    //   9	17	185	finally
    //   22	27	185	finally
    //   31	38	185	finally
    //   41	71	185	finally
    //   71	97	185	finally
    //   102	131	185	finally
    //   136	157	185	finally
    //   157	181	185	finally
    //   9	17	193	java/lang/Exception
    //   22	27	193	java/lang/Exception
    //   31	38	193	java/lang/Exception
    //   41	71	193	java/lang/Exception
    //   71	97	193	java/lang/Exception
    //   102	131	193	java/lang/Exception
    //   136	157	193	java/lang/Exception
    //   157	181	193	java/lang/Exception
  }
  
  private static boolean isRestrictedEvent(String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(RestrictiveDataManager.class)) {
      return false;
    }
    try
    {
      boolean bool = restrictedEvents.contains(paramString);
      return bool;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, RestrictiveDataManager.class);
    }
    return false;
  }
  
  public static String processEvent(String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(RestrictiveDataManager.class)) {
      return null;
    }
    String str = paramString;
    try
    {
      if (enabled)
      {
        str = paramString;
        if (isRestrictedEvent(paramString)) {
          str = "_removed_";
        }
      }
      return str;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, RestrictiveDataManager.class);
    }
    return null;
  }
  
  /* Error */
  public static void processParameters(Map<String, String> paramMap, String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 59	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: getstatic 61	com/facebook/appevents/restrictivedatafilter/RestrictiveDataManager:enabled	Z
    //   12: ifne +4 -> 16
    //   15: return
    //   16: new 169	java/util/HashMap
    //   19: astore_2
    //   20: aload_2
    //   21: invokespecial 170	java/util/HashMap:<init>	()V
    //   24: new 40	java/util/ArrayList
    //   27: astore_3
    //   28: aload_3
    //   29: aload_0
    //   30: invokeinterface 108 1 0
    //   35: invokespecial 76	java/util/ArrayList:<init>	(Ljava/util/Collection;)V
    //   38: aload_3
    //   39: invokevirtual 80	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   42: astore 4
    //   44: aload 4
    //   46: invokeinterface 86 1 0
    //   51: ifeq +46 -> 97
    //   54: aload 4
    //   56: invokeinterface 90 1 0
    //   61: checkcast 95	java/lang/String
    //   64: astore 5
    //   66: aload_1
    //   67: aload 5
    //   69: invokestatic 201	com/facebook/appevents/restrictivedatafilter/RestrictiveDataManager:getMatchedRuleType	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   72: astore_3
    //   73: aload_3
    //   74: ifnull -30 -> 44
    //   77: aload_2
    //   78: aload 5
    //   80: aload_3
    //   81: invokevirtual 205	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   84: pop
    //   85: aload_0
    //   86: aload 5
    //   88: invokeinterface 208 2 0
    //   93: pop
    //   94: goto -50 -> 44
    //   97: aload_2
    //   98: invokevirtual 212	java/util/HashMap:size	()I
    //   101: istore 6
    //   103: iload 6
    //   105: ifle +76 -> 181
    //   108: new 148	org/json/JSONObject
    //   111: astore_1
    //   112: aload_1
    //   113: invokespecial 213	org/json/JSONObject:<init>	()V
    //   116: aload_2
    //   117: invokevirtual 216	java/util/HashMap:entrySet	()Ljava/util/Set;
    //   120: invokeinterface 111 1 0
    //   125: astore_2
    //   126: aload_2
    //   127: invokeinterface 86 1 0
    //   132: ifeq +36 -> 168
    //   135: aload_2
    //   136: invokeinterface 90 1 0
    //   141: checkcast 218	java/util/Map$Entry
    //   144: astore_3
    //   145: aload_1
    //   146: aload_3
    //   147: invokeinterface 221 1 0
    //   152: checkcast 95	java/lang/String
    //   155: aload_3
    //   156: invokeinterface 224 1 0
    //   161: invokevirtual 227	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   164: pop
    //   165: goto -39 -> 126
    //   168: aload_0
    //   169: ldc 24
    //   171: aload_1
    //   172: invokevirtual 230	org/json/JSONObject:toString	()Ljava/lang/String;
    //   175: invokeinterface 231 3 0
    //   180: pop
    //   181: return
    //   182: astore_0
    //   183: aload_0
    //   184: ldc 2
    //   186: invokestatic 68	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   189: return
    //   190: astore_0
    //   191: goto -10 -> 181
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	194	0	paramMap	Map<String, String>
    //   0	194	1	paramString	String
    //   19	117	2	localObject1	Object
    //   27	129	3	localObject2	Object
    //   42	13	4	localIterator	java.util.Iterator
    //   64	23	5	str	String
    //   101	3	6	i	int
    // Exception table:
    //   from	to	target	type
    //   9	15	182	finally
    //   16	44	182	finally
    //   44	73	182	finally
    //   77	94	182	finally
    //   97	103	182	finally
    //   108	126	182	finally
    //   126	165	182	finally
    //   168	181	182	finally
    //   108	126	190	org/json/JSONException
    //   126	165	190	org/json/JSONException
    //   168	181	190	org/json/JSONException
  }
  
  public static class RestrictiveParamFilter
  {
    public String eventName;
    public Map<String, String> restrictiveParams;
    
    public RestrictiveParamFilter(String paramString, Map<String, String> paramMap)
    {
      eventName = paramString;
      restrictiveParams = paramMap;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */