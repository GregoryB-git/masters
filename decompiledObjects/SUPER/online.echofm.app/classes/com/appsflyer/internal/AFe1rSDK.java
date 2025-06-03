package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class AFe1rSDK
  extends AFd1oSDK<Map<String, Object>>
{
  private static final List<String> afInfoLog = Arrays.asList(new String[] { "googleplay", "playstore", "googleplaystore" });
  private Map<String, Object> AFLogger$LogLevel;
  private final AFe1mSDK AFVersionDeclaration;
  private String AppsFlyer2dXConversionCallback;
  private final AFb1gSDK afErrorLogForExcManagerOnly;
  private final AFb1dSDK afWarnLog;
  private final AFc1oSDK getLevel;
  
  public AFe1rSDK(@NonNull AFc1xSDK paramAFc1xSDK)
  {
    super(AFd1vSDK.afDebugLog, new AFd1vSDK[] { AFd1vSDK.values }, paramAFc1xSDK, "GCD-FETCH");
    getLevel = paramAFc1xSDK.AFKeystoreWrapper();
    afWarnLog = paramAFc1xSDK.values();
    AFVersionDeclaration = paramAFc1xSDK.afDebugLog();
    afErrorLogForExcManagerOnly = paramAFc1xSDK.AFInAppEventParameterName();
    paramAFc1xSDK = AFd1vSDK.AFInAppEventParameterName;
    AFKeystoreWrapper.add(paramAFc1xSDK);
    paramAFc1xSDK = AFd1vSDK.afWarnLog;
    AFKeystoreWrapper.add(paramAFc1xSDK);
  }
  
  public final boolean AFInAppEventParameterName()
  {
    return false;
  }
  
  public final boolean afInfoLog()
  {
    return false;
  }
  
  public final AppsFlyerRequestListener afRDLog()
  {
    return null;
  }
  
  /* Error */
  @NonNull
  public final AFd1ySDK valueOf()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 109	com/appsflyer/internal/AFd1oSDK:afDebugLog	Lcom/appsflyer/internal/AFe1wSDK;
    //   4: invokevirtual 113	com/appsflyer/internal/AFe1wSDK:AFKeystoreWrapper	()Z
    //   7: ifne +547 -> 554
    //   10: getstatic 118	com/appsflyer/internal/AFd1ySDK:valueOf	Lcom/appsflyer/internal/AFd1ySDK;
    //   13: astore_1
    //   14: iconst_0
    //   15: istore_2
    //   16: iload_2
    //   17: iconst_2
    //   18: if_icmpgt +534 -> 552
    //   21: iload_2
    //   22: iconst_2
    //   23: if_icmplt +8 -> 31
    //   26: iconst_1
    //   27: istore_3
    //   28: goto +5 -> 33
    //   31: iconst_0
    //   32: istore_3
    //   33: aload_0
    //   34: getfield 75	com/appsflyer/internal/AFe1rSDK:AFVersionDeclaration	Lcom/appsflyer/internal/AFe1mSDK;
    //   37: invokestatic 124	java/lang/System:currentTimeMillis	()J
    //   40: putfield 129	com/appsflyer/internal/AFe1mSDK:AFVersionDeclaration	J
    //   43: aload_0
    //   44: invokespecial 131	com/appsflyer/internal/AFd1oSDK:valueOf	()Lcom/appsflyer/internal/AFd1ySDK;
    //   47: astore_1
    //   48: aload_0
    //   49: getfield 135	com/appsflyer/internal/AFd1oSDK:afErrorLog	Lcom/appsflyer/internal/AFc1gSDK;
    //   52: astore 4
    //   54: aload 4
    //   56: ifnonnull +6 -> 62
    //   59: goto +429 -> 488
    //   62: aload 4
    //   64: invokevirtual 141	com/appsflyer/internal/AFc1gSDK:getStatusCode	()I
    //   67: istore 5
    //   69: iload 5
    //   71: sipush 403
    //   74: if_icmpeq +20 -> 94
    //   77: iload 5
    //   79: sipush 500
    //   82: if_icmplt +6 -> 88
    //   85: goto +9 -> 94
    //   88: iconst_0
    //   89: istore 6
    //   91: goto +6 -> 97
    //   94: iconst_1
    //   95: istore 6
    //   97: aload 4
    //   99: invokevirtual 144	com/appsflyer/internal/AFc1gSDK:isSuccessful	()Z
    //   102: ifne +75 -> 177
    //   105: iload 5
    //   107: sipush 404
    //   110: if_icmpne +6 -> 116
    //   113: goto +64 -> 177
    //   116: iload_3
    //   117: ifne +14 -> 131
    //   120: iload 6
    //   122: ifne +366 -> 488
    //   125: goto +6 -> 131
    //   128: goto +376 -> 504
    //   131: aload_0
    //   132: ldc -110
    //   134: iload 5
    //   136: invokestatic 149	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   139: invokevirtual 153	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   142: putfield 155	com/appsflyer/internal/AFe1rSDK:AppsFlyer2dXConversionCallback	Ljava/lang/String;
    //   145: getstatic 118	com/appsflyer/internal/AFd1ySDK:valueOf	Lcom/appsflyer/internal/AFd1ySDK;
    //   148: astore_1
    //   149: aload_0
    //   150: getfield 75	com/appsflyer/internal/AFe1rSDK:AFVersionDeclaration	Lcom/appsflyer/internal/AFe1mSDK;
    //   153: iload_2
    //   154: invokevirtual 158	com/appsflyer/internal/AFe1mSDK:values	(I)V
    //   157: ldc -96
    //   159: invokestatic 165	com/appsflyer/AFLogger:afDebugLog	(Ljava/lang/String;)V
    //   162: aload_1
    //   163: areturn
    //   164: astore_1
    //   165: goto +372 -> 537
    //   168: astore 7
    //   170: goto +280 -> 450
    //   173: astore_1
    //   174: goto +348 -> 522
    //   177: aload 4
    //   179: invokevirtual 169	com/appsflyer/internal/AFc1gSDK:getBody	()Ljava/lang/Object;
    //   182: checkcast 171	java/util/Map
    //   185: astore 7
    //   187: aload 4
    //   189: invokevirtual 141	com/appsflyer/internal/AFc1gSDK:getStatusCode	()I
    //   192: istore 6
    //   194: aload 7
    //   196: ldc -83
    //   198: invokeinterface 177 2 0
    //   203: checkcast 179	java/lang/Boolean
    //   206: astore_1
    //   207: iload 6
    //   209: sipush 404
    //   212: if_icmpne +47 -> 259
    //   215: aload 7
    //   217: ldc -75
    //   219: invokeinterface 184 2 0
    //   224: pop
    //   225: aload 7
    //   227: ldc -70
    //   229: invokeinterface 184 2 0
    //   234: pop
    //   235: aload 7
    //   237: ldc -68
    //   239: ldc -66
    //   241: invokeinterface 194 3 0
    //   246: pop
    //   247: aload 7
    //   249: ldc -60
    //   251: ldc -58
    //   253: invokeinterface 194 3 0
    //   258: pop
    //   259: aload_1
    //   260: ifnull +24 -> 284
    //   263: aload_1
    //   264: invokevirtual 201	java/lang/Boolean:booleanValue	()Z
    //   267: ifne +17 -> 284
    //   270: aload_0
    //   271: getfield 70	com/appsflyer/internal/AFe1rSDK:afWarnLog	Lcom/appsflyer/internal/AFb1dSDK;
    //   274: ldc -53
    //   276: invokestatic 124	java/lang/System:currentTimeMillis	()J
    //   279: invokeinterface 208 4 0
    //   284: aload 7
    //   286: ldc -46
    //   288: invokeinterface 213 2 0
    //   293: ifeq +76 -> 369
    //   296: aload 7
    //   298: ldc -41
    //   300: invokeinterface 213 2 0
    //   305: ifeq +39 -> 344
    //   308: new 217	java/lang/StringBuilder
    //   311: astore_1
    //   312: aload_1
    //   313: ldc -37
    //   315: invokespecial 221	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   318: aload_1
    //   319: aload 7
    //   321: ldc -41
    //   323: invokeinterface 177 2 0
    //   328: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   331: pop
    //   332: aload_1
    //   333: invokevirtual 231	java/lang/Object:toString	()Ljava/lang/String;
    //   336: astore_1
    //   337: aload_1
    //   338: invokestatic 165	com/appsflyer/AFLogger:afDebugLog	(Ljava/lang/String;)V
    //   341: goto +28 -> 369
    //   344: ldc -23
    //   346: iconst_1
    //   347: anewarray 227	java/lang/Object
    //   350: dup
    //   351: iconst_0
    //   352: aload 7
    //   354: ldc -46
    //   356: invokeinterface 177 2 0
    //   361: aastore
    //   362: invokestatic 237	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   365: astore_1
    //   366: goto -29 -> 337
    //   369: aload 7
    //   371: ldc -17
    //   373: getstatic 243	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   376: invokeinterface 194 3 0
    //   381: pop
    //   382: new 245	org/json/JSONObject
    //   385: astore_1
    //   386: aload_1
    //   387: aload 7
    //   389: invokespecial 248	org/json/JSONObject:<init>	(Ljava/util/Map;)V
    //   392: aload_1
    //   393: invokevirtual 249	org/json/JSONObject:toString	()Ljava/lang/String;
    //   396: astore_1
    //   397: aload_0
    //   398: getfield 70	com/appsflyer/internal/AFe1rSDK:afWarnLog	Lcom/appsflyer/internal/AFb1dSDK;
    //   401: ldc -5
    //   403: aload_1
    //   404: invokeinterface 254 3 0
    //   409: aload_0
    //   410: getfield 70	com/appsflyer/internal/AFe1rSDK:afWarnLog	Lcom/appsflyer/internal/AFb1dSDK;
    //   413: ldc_w 256
    //   416: invokeinterface 259 2 0
    //   421: ifne +16 -> 437
    //   424: aload 7
    //   426: ldc -17
    //   428: getstatic 262	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   431: invokeinterface 194 3 0
    //   436: pop
    //   437: aload_0
    //   438: aload 7
    //   440: putfield 264	com/appsflyer/internal/AFe1rSDK:AFLogger$LogLevel	Ljava/util/Map;
    //   443: getstatic 266	com/appsflyer/internal/AFd1ySDK:AFInAppEventParameterName	Lcom/appsflyer/internal/AFd1ySDK;
    //   446: astore_1
    //   447: goto -298 -> 149
    //   450: new 217	java/lang/StringBuilder
    //   453: astore_1
    //   454: aload_1
    //   455: ldc_w 268
    //   458: invokespecial 221	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   461: aload_1
    //   462: aload 7
    //   464: invokevirtual 273	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   467: invokevirtual 276	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   470: pop
    //   471: aload_1
    //   472: invokevirtual 231	java/lang/Object:toString	()Ljava/lang/String;
    //   475: aload 7
    //   477: invokestatic 279	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   480: getstatic 118	com/appsflyer/internal/AFd1ySDK:valueOf	Lcom/appsflyer/internal/AFd1ySDK;
    //   483: astore_1
    //   484: iload_3
    //   485: ifne +25 -> 510
    //   488: aload_0
    //   489: getfield 75	com/appsflyer/internal/AFe1rSDK:AFVersionDeclaration	Lcom/appsflyer/internal/AFe1mSDK;
    //   492: iload_2
    //   493: invokevirtual 158	com/appsflyer/internal/AFe1mSDK:values	(I)V
    //   496: ldc -96
    //   498: invokestatic 165	com/appsflyer/AFLogger:afDebugLog	(Ljava/lang/String;)V
    //   501: goto -373 -> 128
    //   504: iinc 2 1
    //   507: goto -491 -> 16
    //   510: aload_0
    //   511: aload 7
    //   513: invokevirtual 273	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   516: putfield 155	com/appsflyer/internal/AFe1rSDK:AppsFlyer2dXConversionCallback	Ljava/lang/String;
    //   519: aload 7
    //   521: athrow
    //   522: ldc_w 281
    //   525: invokestatic 165	com/appsflyer/AFLogger:afDebugLog	(Ljava/lang/String;)V
    //   528: aload_0
    //   529: ldc_w 283
    //   532: putfield 155	com/appsflyer/internal/AFe1rSDK:AppsFlyer2dXConversionCallback	Ljava/lang/String;
    //   535: aload_1
    //   536: athrow
    //   537: aload_0
    //   538: getfield 75	com/appsflyer/internal/AFe1rSDK:AFVersionDeclaration	Lcom/appsflyer/internal/AFe1mSDK;
    //   541: iload_2
    //   542: invokevirtual 158	com/appsflyer/internal/AFe1mSDK:values	(I)V
    //   545: ldc -96
    //   547: invokestatic 165	com/appsflyer/AFLogger:afDebugLog	(Ljava/lang/String;)V
    //   550: aload_1
    //   551: athrow
    //   552: aload_1
    //   553: areturn
    //   554: ldc_w 285
    //   557: invokestatic 165	com/appsflyer/AFLogger:afDebugLog	(Ljava/lang/String;)V
    //   560: aload_0
    //   561: ldc_w 287
    //   564: putfield 155	com/appsflyer/internal/AFe1rSDK:AppsFlyer2dXConversionCallback	Ljava/lang/String;
    //   567: new 289	com/appsflyer/internal/AFd1xSDK
    //   570: dup
    //   571: invokespecial 291	com/appsflyer/internal/AFd1xSDK:<init>	()V
    //   574: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	575	0	this	AFe1rSDK
    //   13	150	1	localAFd1ySDK	AFd1ySDK
    //   164	1	1	localObject1	Object
    //   173	1	1	localAFd1tSDK	AFd1tSDK
    //   206	347	1	localObject2	Object
    //   15	527	2	i	int
    //   27	458	3	j	int
    //   52	136	4	localAFc1gSDK	AFc1gSDK
    //   67	68	5	k	int
    //   89	124	6	m	int
    //   168	1	7	localException	Exception
    //   185	335	7	localMap	Map
    // Exception table:
    //   from	to	target	type
    //   43	54	164	finally
    //   62	69	164	finally
    //   97	105	164	finally
    //   131	149	164	finally
    //   177	207	164	finally
    //   215	259	164	finally
    //   263	284	164	finally
    //   284	337	164	finally
    //   337	341	164	finally
    //   344	366	164	finally
    //   369	437	164	finally
    //   437	447	164	finally
    //   450	484	164	finally
    //   510	522	164	finally
    //   522	537	164	finally
    //   43	54	168	java/lang/Exception
    //   62	69	168	java/lang/Exception
    //   97	105	168	java/lang/Exception
    //   131	149	168	java/lang/Exception
    //   177	207	168	java/lang/Exception
    //   215	259	168	java/lang/Exception
    //   263	284	168	java/lang/Exception
    //   284	337	168	java/lang/Exception
    //   337	341	168	java/lang/Exception
    //   344	366	168	java/lang/Exception
    //   369	437	168	java/lang/Exception
    //   437	447	168	java/lang/Exception
    //   43	54	173	com/appsflyer/internal/AFd1tSDK
    //   62	69	173	com/appsflyer/internal/AFd1tSDK
    //   97	105	173	com/appsflyer/internal/AFd1tSDK
    //   131	149	173	com/appsflyer/internal/AFd1tSDK
    //   177	207	173	com/appsflyer/internal/AFd1tSDK
    //   215	259	173	com/appsflyer/internal/AFd1tSDK
    //   263	284	173	com/appsflyer/internal/AFd1tSDK
    //   284	337	173	com/appsflyer/internal/AFd1tSDK
    //   337	341	173	com/appsflyer/internal/AFd1tSDK
    //   344	366	173	com/appsflyer/internal/AFd1tSDK
    //   369	437	173	com/appsflyer/internal/AFd1tSDK
    //   437	447	173	com/appsflyer/internal/AFd1tSDK
  }
  
  public final AFc1qSDK<Map<String, Object>> values(@NonNull String paramString)
  {
    Object localObject = AFa1eSDK.AFInAppEventType(afWarnLog, afErrorLogForExcManagerOnly.values());
    if ((localObject != null) && (!((String)localObject).trim().isEmpty()))
    {
      if (!afInfoLog.contains(((String)localObject).toLowerCase(Locale.getDefault()))) {
        localObject = "-".concat((String)localObject);
      } else {
        AFLogger.afWarnLog(String.format("[GCD] AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", new Object[] { localObject }));
      }
    }
    else {
      localObject = "";
    }
    paramString = getLevel.values((String)localObject, paramString);
    localObject = new StringBuilder("[GCD-B01] URL: ");
    ((StringBuilder)localObject).append(valueOf.valueOf);
    AFa1aSDK.values(localObject.toString());
    return paramString;
  }
  
  public final void values()
  {
    super.values();
    Map localMap = AFLogger$LogLevel;
    String str = AppsFlyer2dXConversionCallback;
    if (localMap != null)
    {
      AFe1sSDK.values(localMap);
      return;
    }
    if ((str != null) && (!str.isEmpty()))
    {
      AFe1sSDK.AFInAppEventType(str);
      return;
    }
    AFe1sSDK.AFInAppEventType("Unknown error");
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFe1rSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */