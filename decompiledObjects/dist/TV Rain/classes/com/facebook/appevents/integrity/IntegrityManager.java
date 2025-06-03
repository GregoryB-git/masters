package com.facebook.appevents.integrity;

import com.facebook.FacebookSdk;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.appevents.ml.ModelManager.Task;
import com.facebook.internal.FetchedAppGateKeepersManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Arrays;

public final class IntegrityManager
{
  public static final String INTEGRITY_TYPE_ADDRESS = "address";
  public static final String INTEGRITY_TYPE_HEALTH = "health";
  public static final String INTEGRITY_TYPE_NONE = "none";
  private static final String RESTRICTIVE_ON_DEVICE_PARAMS_KEY = "_onDeviceParams";
  private static boolean enabled = false;
  private static boolean isSampleEnabled = false;
  
  public static void enable()
  {
    if (CrashShieldHandler.isObjectCrashing(IntegrityManager.class)) {
      return;
    }
    try
    {
      enabled = true;
      isSampleEnabled = FetchedAppGateKeepersManager.getGateKeeperForKey("FBSDKFeatureIntegritySample", FacebookSdk.getApplicationId(), false);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, IntegrityManager.class);
    }
  }
  
  private static String getIntegrityPredictionResult(String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(IntegrityManager.class)) {
      return null;
    }
    try
    {
      float[] arrayOfFloat = new float[30];
      Arrays.fill(arrayOfFloat, 0.0F);
      paramString = ModelManager.predict(ModelManager.Task.MTML_INTEGRITY_DETECT, new float[][] { arrayOfFloat }, new String[] { paramString });
      if (paramString == null) {
        paramString = "none";
      } else {
        paramString = paramString[0];
      }
      return paramString;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, IntegrityManager.class);
    }
    return null;
  }
  
  /* Error */
  public static void processParameters(java.util.Map<String, String> paramMap)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 33	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: getstatic 35	com/facebook/appevents/integrity/IntegrityManager:enabled	Z
    //   12: ifeq +146 -> 158
    //   15: aload_0
    //   16: invokeinterface 89 1 0
    //   21: istore_1
    //   22: iload_1
    //   23: ifne +6 -> 29
    //   26: goto +132 -> 158
    //   29: new 91	java/util/ArrayList
    //   32: astore_2
    //   33: aload_2
    //   34: aload_0
    //   35: invokeinterface 95 1 0
    //   40: invokespecial 98	java/util/ArrayList:<init>	(Ljava/util/Collection;)V
    //   43: new 100	org/json/JSONObject
    //   46: astore_3
    //   47: aload_3
    //   48: invokespecial 101	org/json/JSONObject:<init>	()V
    //   51: aload_2
    //   52: invokevirtual 105	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   55: astore 4
    //   57: aload 4
    //   59: invokeinterface 111 1 0
    //   64: ifeq +74 -> 138
    //   67: aload 4
    //   69: invokeinterface 115 1 0
    //   74: checkcast 73	java/lang/String
    //   77: astore 5
    //   79: aload_0
    //   80: aload 5
    //   82: invokeinterface 119 2 0
    //   87: checkcast 73	java/lang/String
    //   90: astore_2
    //   91: aload 5
    //   93: invokestatic 123	com/facebook/appevents/integrity/IntegrityManager:shouldFilter	(Ljava/lang/String;)Z
    //   96: ifne +10 -> 106
    //   99: aload_2
    //   100: invokestatic 123	com/facebook/appevents/integrity/IntegrityManager:shouldFilter	(Ljava/lang/String;)Z
    //   103: ifeq -46 -> 57
    //   106: aload_0
    //   107: aload 5
    //   109: invokeinterface 126 2 0
    //   114: pop
    //   115: getstatic 51	com/facebook/appevents/integrity/IntegrityManager:isSampleEnabled	Z
    //   118: ifeq +6 -> 124
    //   121: goto +6 -> 127
    //   124: ldc -128
    //   126: astore_2
    //   127: aload_3
    //   128: aload 5
    //   130: aload_2
    //   131: invokevirtual 132	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   134: pop
    //   135: goto -78 -> 57
    //   138: aload_3
    //   139: invokevirtual 135	org/json/JSONObject:length	()I
    //   142: ifeq +16 -> 158
    //   145: aload_0
    //   146: ldc 17
    //   148: aload_3
    //   149: invokevirtual 138	org/json/JSONObject:toString	()Ljava/lang/String;
    //   152: invokeinterface 141 3 0
    //   157: pop
    //   158: return
    //   159: astore_0
    //   160: aload_0
    //   161: ldc 2
    //   163: invokestatic 55	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   166: return
    //   167: astore_0
    //   168: goto -10 -> 158
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	171	0	paramMap	java.util.Map<String, String>
    //   21	2	1	i	int
    //   32	99	2	localObject	Object
    //   46	103	3	localJSONObject	org.json.JSONObject
    //   55	13	4	localIterator	java.util.Iterator
    //   77	52	5	str	String
    // Exception table:
    //   from	to	target	type
    //   9	22	159	finally
    //   29	57	159	finally
    //   57	106	159	finally
    //   106	121	159	finally
    //   127	135	159	finally
    //   138	158	159	finally
    //   29	57	167	java/lang/Exception
    //   57	106	167	java/lang/Exception
    //   106	121	167	java/lang/Exception
    //   127	135	167	java/lang/Exception
    //   138	158	167	java/lang/Exception
  }
  
  private static boolean shouldFilter(String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(IntegrityManager.class)) {
      return false;
    }
    try
    {
      boolean bool = "none".equals(getIntegrityPredictionResult(paramString));
      return bool ^ true;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, IntegrityManager.class);
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.integrity.IntegrityManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */