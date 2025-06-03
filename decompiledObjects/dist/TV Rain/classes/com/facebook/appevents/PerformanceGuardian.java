package com.facebook.appevents;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import androidx.annotation.RestrictTo;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class PerformanceGuardian
{
  private static final Integer ACTIVITY_PROCESS_TIME_THRESHOLD = Integer.valueOf(40);
  private static final String BANNED_ACTIVITY_STORE = "com.facebook.internal.BANNED_ACTIVITY";
  private static final String CACHE_APP_VERSION = "app_version";
  private static final Integer MAX_EXCEED_LIMIT_COUNT = Integer.valueOf(3);
  private static final Map<String, Integer> activityProcessTimeMapCodeless = new HashMap();
  private static final Map<String, Integer> activityProcessTimeMapSe = new HashMap();
  private static final Set<String> bannedCodelessActivitySet;
  private static final Set<String> bannedSuggestedEventActivitySet = new HashSet();
  private static boolean initialized = false;
  private static SharedPreferences sharedPreferences;
  
  static
  {
    bannedCodelessActivitySet = new HashSet();
  }
  
  /* Error */
  private static void initializeIfNotYet()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc 2
    //   5: invokestatic 73	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   8: istore_0
    //   9: iload_0
    //   10: ifeq +7 -> 17
    //   13: ldc 2
    //   15: monitorexit
    //   16: return
    //   17: getstatic 75	com/facebook/appevents/PerformanceGuardian:initialized	Z
    //   20: istore_0
    //   21: iload_0
    //   22: ifeq +7 -> 29
    //   25: ldc 2
    //   27: monitorexit
    //   28: return
    //   29: invokestatic 81	com/facebook/FacebookSdk:getApplicationContext	()Landroid/content/Context;
    //   32: ldc 19
    //   34: iconst_0
    //   35: invokevirtual 87	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   38: astore_1
    //   39: aload_1
    //   40: putstatic 89	com/facebook/appevents/PerformanceGuardian:sharedPreferences	Landroid/content/SharedPreferences;
    //   43: aload_1
    //   44: ldc 22
    //   46: ldc 91
    //   48: invokeinterface 97 3 0
    //   53: invokestatic 101	com/facebook/appevents/PerformanceGuardian:isCacheValid	(Ljava/lang/String;)Z
    //   56: ifne +24 -> 80
    //   59: getstatic 89	com/facebook/appevents/PerformanceGuardian:sharedPreferences	Landroid/content/SharedPreferences;
    //   62: invokeinterface 105 1 0
    //   67: invokeinterface 110 1 0
    //   72: invokeinterface 113 1 0
    //   77: goto +85 -> 162
    //   80: getstatic 57	com/facebook/appevents/PerformanceGuardian:bannedCodelessActivitySet	Ljava/util/Set;
    //   83: astore_2
    //   84: getstatic 89	com/facebook/appevents/PerformanceGuardian:sharedPreferences	Landroid/content/SharedPreferences;
    //   87: astore_1
    //   88: getstatic 117	com/facebook/appevents/PerformanceGuardian$UseCase:CODELESS	Lcom/facebook/appevents/PerformanceGuardian$UseCase;
    //   91: invokevirtual 121	java/lang/Object:toString	()Ljava/lang/String;
    //   94: astore_3
    //   95: new 50	java/util/HashSet
    //   98: astore 4
    //   100: aload 4
    //   102: invokespecial 53	java/util/HashSet:<init>	()V
    //   105: aload_2
    //   106: aload_1
    //   107: aload_3
    //   108: aload 4
    //   110: invokeinterface 125 3 0
    //   115: invokeinterface 131 2 0
    //   120: pop
    //   121: getstatic 55	com/facebook/appevents/PerformanceGuardian:bannedSuggestedEventActivitySet	Ljava/util/Set;
    //   124: astore_2
    //   125: getstatic 89	com/facebook/appevents/PerformanceGuardian:sharedPreferences	Landroid/content/SharedPreferences;
    //   128: astore_3
    //   129: getstatic 134	com/facebook/appevents/PerformanceGuardian$UseCase:SUGGESTED_EVENT	Lcom/facebook/appevents/PerformanceGuardian$UseCase;
    //   132: invokevirtual 121	java/lang/Object:toString	()Ljava/lang/String;
    //   135: astore_1
    //   136: new 50	java/util/HashSet
    //   139: astore 4
    //   141: aload 4
    //   143: invokespecial 53	java/util/HashSet:<init>	()V
    //   146: aload_2
    //   147: aload_3
    //   148: aload_1
    //   149: aload 4
    //   151: invokeinterface 125 3 0
    //   156: invokeinterface 131 2 0
    //   161: pop
    //   162: iconst_1
    //   163: putstatic 75	com/facebook/appevents/PerformanceGuardian:initialized	Z
    //   166: ldc 2
    //   168: monitorexit
    //   169: return
    //   170: astore_1
    //   171: aload_1
    //   172: ldc 2
    //   174: invokestatic 138	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   177: ldc 2
    //   179: monitorexit
    //   180: return
    //   181: astore_1
    //   182: ldc 2
    //   184: monitorexit
    //   185: aload_1
    //   186: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   8	14	0	bool	boolean
    //   38	111	1	localObject1	Object
    //   170	2	1	localThrowable	Throwable
    //   181	5	1	localObject2	Object
    //   83	64	2	localSet	Set
    //   94	54	3	localObject3	Object
    //   98	52	4	localHashSet	HashSet
    // Exception table:
    //   from	to	target	type
    //   17	21	170	finally
    //   29	77	170	finally
    //   80	162	170	finally
    //   162	166	170	finally
    //   3	9	181	finally
    //   171	177	181	finally
  }
  
  public static boolean isBannedActivity(String paramString, UseCase paramUseCase)
  {
    if (CrashShieldHandler.isObjectCrashing(PerformanceGuardian.class)) {
      return false;
    }
    try
    {
      initializeIfNotYet();
      int i = 1.$SwitchMap$com$facebook$appevents$PerformanceGuardian$UseCase[paramUseCase.ordinal()];
      if (i != 1)
      {
        if (i != 2) {
          return false;
        }
        return bannedSuggestedEventActivitySet.contains(paramString);
      }
      boolean bool = bannedCodelessActivitySet.contains(paramString);
      return bool;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, PerformanceGuardian.class);
    }
    return false;
  }
  
  private static boolean isCacheValid(String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(PerformanceGuardian.class)) {
      return false;
    }
    try
    {
      String str = Utility.getAppVersion();
      if ((str != null) && (!paramString.isEmpty()))
      {
        boolean bool = paramString.equals(str);
        return bool;
      }
      return false;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, PerformanceGuardian.class);
    }
    return false;
  }
  
  public static void limitProcessTime(String paramString, UseCase paramUseCase, long paramLong1, long paramLong2)
  {
    if (CrashShieldHandler.isObjectCrashing(PerformanceGuardian.class)) {
      return;
    }
    try
    {
      initializeIfNotYet();
      if ((paramString != null) && (paramLong2 - paramLong1 >= ACTIVITY_PROCESS_TIME_THRESHOLD.intValue()))
      {
        int i = 1.$SwitchMap$com$facebook$appevents$PerformanceGuardian$UseCase[paramUseCase.ordinal()];
        if (i != 1)
        {
          if (i == 2) {
            updateActivityMap(paramUseCase, paramString, activityProcessTimeMapSe, bannedSuggestedEventActivitySet);
          }
        }
        else {
          updateActivityMap(paramUseCase, paramString, activityProcessTimeMapCodeless, bannedCodelessActivitySet);
        }
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, PerformanceGuardian.class);
    }
  }
  
  private static void updateActivityMap(UseCase paramUseCase, String paramString, Map<String, Integer> paramMap, Set<String> paramSet)
  {
    if (CrashShieldHandler.isObjectCrashing(PerformanceGuardian.class)) {
      return;
    }
    int i = 0;
    try
    {
      if (paramMap.containsKey(paramString)) {
        i = ((Integer)paramMap.get(paramString)).intValue();
      }
      i++;
      paramMap.put(paramString, Integer.valueOf(i));
      if (i >= MAX_EXCEED_LIMIT_COUNT.intValue())
      {
        paramSet.add(paramString);
        sharedPreferences.edit().putStringSet(paramUseCase.toString(), paramSet).putString("app_version", Utility.getAppVersion()).apply();
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramUseCase, PerformanceGuardian.class);
    }
  }
  
  public static enum UseCase
  {
    static
    {
      UseCase localUseCase1 = new UseCase("CODELESS", 0);
      CODELESS = localUseCase1;
      UseCase localUseCase2 = new UseCase("SUGGESTED_EVENT", 1);
      SUGGESTED_EVENT = localUseCase2;
      $VALUES = new UseCase[] { localUseCase1, localUseCase2 };
    }
    
    private UseCase() {}
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.PerformanceGuardian
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */