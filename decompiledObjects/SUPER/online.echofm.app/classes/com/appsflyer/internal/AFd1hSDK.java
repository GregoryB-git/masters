package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.text.i;
import org.json.JSONObject;

public class AFd1hSDK
  extends AFd1oSDK<String>
{
  private static final AFd1vSDK[] AppsFlyer2dXConversionCallback = { AFd1vSDK.afRDLog, AFd1vSDK.valueOf, AFd1vSDK.onInstallConversionFailureNative, AFd1vSDK.afErrorLog };
  private final AFc1dSDK AFLogger$LogLevel;
  private final AFb1wSDK AFVersionDeclaration;
  protected final AFb1dSDK afErrorLogForExcManagerOnly;
  public final AFa1qSDK afInfoLog;
  private final AFb1bSDK afWarnLog;
  @NonNull
  private final AFb1gSDK getLevel;
  
  public AFd1hSDK(@NonNull AFa1qSDK paramAFa1qSDK, @NonNull AFc1xSDK paramAFc1xSDK)
  {
    this(paramAFa1qSDK, paramAFc1xSDK, null);
  }
  
  public AFd1hSDK(@NonNull AFa1qSDK paramAFa1qSDK, @NonNull AFc1xSDK paramAFc1xSDK, String paramString)
  {
    super(localAFd1vSDK1, new AFd1vSDK[] { localAFd1vSDK2 }, paramAFc1xSDK, paramString);
    afInfoLog = paramAFa1qSDK;
    AFLogger$LogLevel = paramAFc1xSDK.onInstallConversionFailureNative();
    afErrorLogForExcManagerOnly = paramAFc1xSDK.values();
    AFVersionDeclaration = paramAFc1xSDK.afRDLog();
    afWarnLog = paramAFc1xSDK.init();
    getLevel = paramAFc1xSDK.AFInAppEventParameterName();
    paramAFa1qSDK = AppsFlyer2dXConversionCallback;
    int j = paramAFa1qSDK.length;
    while (i < j)
    {
      paramAFc1xSDK = paramAFa1qSDK[i];
      if (values == paramAFc1xSDK) {
        return;
      }
      i++;
    }
    i = afInfoLog.AFLogger;
    paramAFa1qSDK = values;
    if (i <= 0)
    {
      paramAFc1xSDK = AFd1vSDK.AFInAppEventParameterName;
      if (paramAFa1qSDK != paramAFc1xSDK) {
        AFInAppEventParameterName.add(paramAFc1xSDK);
      }
    }
    else
    {
      paramAFa1qSDK = AFd1vSDK.AFInAppEventParameterName;
      AFKeystoreWrapper.add(paramAFa1qSDK);
    }
  }
  
  @NonNull
  private static Map<String, Object> AFKeystoreWrapper(AFa1qSDK paramAFa1qSDK)
  {
    Map localMap = (Map)paramAFa1qSDK.valueOf().get("meta");
    Object localObject = localMap;
    if (localMap == null)
    {
      localObject = new HashMap();
      paramAFa1qSDK.valueOf().put("meta", localObject);
    }
    return (Map<String, Object>)localObject;
  }
  
  public boolean afInfoLog()
  {
    return true;
  }
  
  public final AppsFlyerRequestListener afRDLog()
  {
    return afInfoLog.AFInAppEventParameterName;
  }
  
  public void valueOf(AFa1qSDK paramAFa1qSDK)
  {
    if (paramAFa1qSDK.afErrorLog())
    {
      localObject1 = afDebugLog;
      paramAFa1qSDK.values(new AFb1fSDK(paramAFa1qSDK.valueOf(), AFKeystoreWrapper.AFInAppEventType));
      paramAFa1qSDK.values(afDebugLog.AFInAppEventParameterName(paramAFa1qSDK.valueOf()));
    }
    if (paramAFa1qSDK.afDebugLog()) {
      paramAFa1qSDK.values(afDebugLog.valueOf());
    }
    Object localObject1 = AFInAppEventParameterName;
    int i;
    if ((!((Set)localObject1).contains(AFd1vSDK.afWarnLog)) && (!((Set)localObject1).contains(AFd1vSDK.AFInAppEventParameterName))) {
      i = 0;
    } else {
      i = 1;
    }
    if ((AFLogger()) && (i != 0)) {
      paramAFa1qSDK.AFInAppEventParameterName(afErrorLogForExcManagerOnly.values("appsFlyerCount", 0));
    }
    if (paramAFa1qSDK.afRDLog())
    {
      Map localMap = AFKeystoreWrapper(paramAFa1qSDK);
      localObject1 = AFLogger$LogLevel;
      Object localObject2 = ((AFc1dSDK)localObject1).AFInAppEventParameterName();
      Object localObject3 = ((AFc1dSDK)localObject1).valueOf();
      if (AFc1dSDK.AFInAppEventType()) {
        localObject1 = AFc1aSDK.AFKeystoreWrapper;
      } else {
        localObject1 = AFc1aSDK.AFInAppEventType;
      }
      localObject1 = new AFc1eSDK((String)localObject2, (String)localObject3, (AFc1aSDK)localObject1);
      localObject2 = new JSONObject();
      ((JSONObject)localObject2).put("name", AFInAppEventType);
      localObject3 = valueOf;
      if (localObject3 != AFc1aSDK.AFKeystoreWrapper) {
        ((JSONObject)localObject2).put("method", valueOf);
      }
      localObject3 = values;
      if ((localObject3 != null) && (!i.F((CharSequence)localObject3))) {
        ((JSONObject)localObject2).put("prefix", values);
      }
      localMap.put("host", localObject2);
    }
    if (getLevel.AFKeystoreWrapper("AF_PREINSTALL_DISABLED")) {
      AFKeystoreWrapper(paramAFa1qSDK).put("preinstall_disabled", Boolean.TRUE);
    }
  }
  
  /* Error */
  public final AFc1qSDK<String> values(@NonNull String paramString)
  {
    // Byte code:
    //   0: ldc_w 261
    //   3: astore_2
    //   4: aload_0
    //   5: aload_0
    //   6: getfield 60	com/appsflyer/internal/AFd1hSDK:afInfoLog	Lcom/appsflyer/internal/AFa1qSDK;
    //   9: invokevirtual 263	com/appsflyer/internal/AFd1hSDK:valueOf	(Lcom/appsflyer/internal/AFa1qSDK;)V
    //   12: aload_0
    //   13: getfield 60	com/appsflyer/internal/AFd1hSDK:afInfoLog	Lcom/appsflyer/internal/AFa1qSDK;
    //   16: invokevirtual 114	com/appsflyer/internal/AFa1qSDK:valueOf	()Ljava/util/Map;
    //   19: ldc 116
    //   21: invokeinterface 266 2 0
    //   26: ifeq +52 -> 78
    //   29: aload_0
    //   30: getfield 77	com/appsflyer/internal/AFd1hSDK:AFVersionDeclaration	Lcom/appsflyer/internal/AFb1wSDK;
    //   33: getfield 271	com/appsflyer/internal/AFb1wSDK:AFInAppEventType	Lcom/appsflyer/internal/AFb1ySDK;
    //   36: getfield 276	com/appsflyer/internal/AFb1ySDK:AFInAppEventParameterName	Lcom/appsflyer/internal/AFe1qSDK;
    //   39: getfield 281	com/appsflyer/internal/AFe1qSDK:AFInAppEventParameterName	Lcom/appsflyer/internal/AFd1aSDK;
    //   42: getfield 286	com/appsflyer/internal/AFd1aSDK:AFInAppEventParameterName	Lcom/appsflyer/internal/AFe1sSDK;
    //   45: getfield 291	com/appsflyer/internal/AFe1sSDK:AFInAppEventType	D
    //   48: dstore_3
    //   49: goto +7 -> 56
    //   52: astore 5
    //   54: dconst_1
    //   55: dstore_3
    //   56: dload_3
    //   57: invokestatic 294	com/appsflyer/internal/AFa1qSDK:AFInAppEventType	(D)Z
    //   60: ifeq +18 -> 78
    //   63: aload_0
    //   64: getfield 60	com/appsflyer/internal/AFd1hSDK:afInfoLog	Lcom/appsflyer/internal/AFa1qSDK;
    //   67: invokevirtual 114	com/appsflyer/internal/AFa1qSDK:valueOf	()Ljava/util/Map;
    //   70: ldc 116
    //   72: invokeinterface 297 2 0
    //   77: pop
    //   78: aload_0
    //   79: getfield 60	com/appsflyer/internal/AFd1hSDK:afInfoLog	Lcom/appsflyer/internal/AFa1qSDK;
    //   82: astore 5
    //   84: aload 5
    //   86: getfield 299	com/appsflyer/internal/AFa1qSDK:afRDLog	Ljava/lang/String;
    //   89: astore 6
    //   91: aload 5
    //   93: invokevirtual 114	com/appsflyer/internal/AFa1qSDK:valueOf	()Ljava/util/Map;
    //   96: astore 7
    //   98: aconst_null
    //   99: astore 5
    //   101: new 212	org/json/JSONObject
    //   104: astore 8
    //   106: aload 8
    //   108: aload 7
    //   110: invokespecial 302	org/json/JSONObject:<init>	(Ljava/util/Map;)V
    //   113: aload 8
    //   115: invokevirtual 305	org/json/JSONObject:toString	()Ljava/lang/String;
    //   118: astore 8
    //   120: aload 8
    //   122: ifnull +41 -> 163
    //   125: aload 8
    //   127: ldc_w 307
    //   130: ldc_w 309
    //   133: invokevirtual 315	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   136: astore 5
    //   138: goto +320 -> 458
    //   141: astore 9
    //   143: aload 8
    //   145: astore 5
    //   147: aload 9
    //   149: astore 8
    //   151: goto +41 -> 192
    //   154: astore 9
    //   156: aload 8
    //   158: astore 5
    //   160: goto +57 -> 217
    //   163: new 257	java/lang/NullPointerException
    //   166: astore 5
    //   168: aload 5
    //   170: ldc_w 317
    //   173: invokespecial 320	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   176: aload 5
    //   178: athrow
    //   179: astore 8
    //   181: goto +11 -> 192
    //   184: astore 9
    //   186: aconst_null
    //   187: astore 5
    //   189: goto +28 -> 217
    //   192: ldc_w 322
    //   195: aload 8
    //   197: iconst_1
    //   198: invokestatic 327	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    //   201: ldc_w 261
    //   204: astore 9
    //   206: aload 5
    //   208: astore 8
    //   210: aload 9
    //   212: astore 5
    //   214: goto +244 -> 458
    //   217: ldc_w 329
    //   220: aload 9
    //   222: iconst_1
    //   223: invokestatic 327	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    //   226: sipush 12254
    //   229: invokestatic 335	android/view/ViewConfiguration:getFadingEdgeLength	()I
    //   232: bipush 16
    //   234: ishr
    //   235: isub
    //   236: i2c
    //   237: bipush 38
    //   239: invokestatic 339	android/view/ViewConfiguration:getGlobalActionKeyTimeout	()J
    //   242: lconst_0
    //   243: lcmp
    //   244: isub
    //   245: lconst_0
    //   246: invokestatic 345	android/widget/ExpandableListView:getPackedPositionType	(J)I
    //   249: bipush 74
    //   251: iadd
    //   252: invokestatic 350	com/appsflyer/internal/AFa1vSDK:AFInAppEventParameterName	(CII)Ljava/lang/Object;
    //   255: checkcast 352	java/lang/Class
    //   258: ldc_w 353
    //   261: iconst_1
    //   262: anewarray 352	java/lang/Class
    //   265: dup
    //   266: iconst_0
    //   267: ldc 118
    //   269: aastore
    //   270: invokevirtual 357	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   273: aconst_null
    //   274: iconst_1
    //   275: anewarray 359	java/lang/Object
    //   278: dup
    //   279: iconst_0
    //   280: aload 7
    //   282: aastore
    //   283: invokevirtual 365	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   286: checkcast 311	java/lang/String
    //   289: astore 8
    //   291: aload 8
    //   293: ifnull +62 -> 355
    //   296: aload 8
    //   298: ldc_w 307
    //   301: ldc_w 309
    //   304: invokevirtual 315	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   307: astore 5
    //   309: goto +149 -> 458
    //   312: astore 9
    //   314: aload 8
    //   316: astore 5
    //   318: aload 9
    //   320: astore 8
    //   322: goto +84 -> 406
    //   325: astore 5
    //   327: aload 8
    //   329: astore 9
    //   331: aload 5
    //   333: astore 8
    //   335: aload 9
    //   337: astore 5
    //   339: goto +88 -> 427
    //   342: astore 9
    //   344: aload 8
    //   346: astore 5
    //   348: aload 9
    //   350: astore 8
    //   352: goto +90 -> 442
    //   355: new 257	java/lang/NullPointerException
    //   358: astore 5
    //   360: aload 5
    //   362: ldc_w 317
    //   365: invokespecial 320	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   368: aload 5
    //   370: athrow
    //   371: astore 8
    //   373: aload 8
    //   375: invokevirtual 371	java/lang/Throwable:getCause	()Ljava/lang/Throwable;
    //   378: astore 9
    //   380: aload 9
    //   382: ifnull +21 -> 403
    //   385: aload 9
    //   387: athrow
    //   388: astore 8
    //   390: goto +16 -> 406
    //   393: astore 8
    //   395: goto +32 -> 427
    //   398: astore 8
    //   400: goto +42 -> 442
    //   403: aload 8
    //   405: athrow
    //   406: ldc_w 322
    //   409: aload 8
    //   411: iconst_1
    //   412: invokestatic 327	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    //   415: aload 5
    //   417: astore 8
    //   419: ldc_w 261
    //   422: astore 5
    //   424: goto +34 -> 458
    //   427: ldc_w 373
    //   430: aload 8
    //   432: invokestatic 376	com/appsflyer/AFLogger:afErrorLogForExcManagerOnly	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   435: aload 5
    //   437: astore 8
    //   439: goto -20 -> 419
    //   442: ldc_w 378
    //   445: aload 8
    //   447: iconst_1
    //   448: invokestatic 327	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    //   451: aload 5
    //   453: astore 8
    //   455: goto -36 -> 419
    //   458: aload 8
    //   460: ifnonnull +9 -> 469
    //   463: aload_2
    //   464: astore 8
    //   466: goto +3 -> 469
    //   469: aload 5
    //   471: aload 8
    //   473: invokevirtual 381	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   476: ifne +12 -> 488
    //   479: ldc_w 383
    //   482: invokestatic 385	com/appsflyer/AFLogger:afWarnLog	(Ljava/lang/String;)V
    //   485: goto +7 -> 492
    //   488: aload 8
    //   490: astore 5
    //   492: new 387	java/lang/StringBuilder
    //   495: dup
    //   496: invokespecial 388	java/lang/StringBuilder:<init>	()V
    //   499: astore 8
    //   501: aload 8
    //   503: aload_0
    //   504: invokevirtual 392	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   507: pop
    //   508: aload 8
    //   510: ldc_w 394
    //   513: invokevirtual 397	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   516: pop
    //   517: aload 8
    //   519: aload 5
    //   521: invokevirtual 397	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   524: pop
    //   525: aload 8
    //   527: invokevirtual 398	java/lang/Object:toString	()Ljava/lang/String;
    //   530: invokestatic 402	com/appsflyer/internal/AFa1aSDK:values	(Ljava/lang/String;)V
    //   533: aload_0
    //   534: getfield 405	com/appsflyer/internal/AFd1oSDK:afRDLog	Lcom/appsflyer/internal/AFb1tSDK;
    //   537: aload 6
    //   539: aload 5
    //   541: invokeinterface 410 3 0
    //   546: aload_0
    //   547: getfield 413	com/appsflyer/internal/AFd1oSDK:AFLogger	Lcom/appsflyer/internal/AFc1oSDK;
    //   550: aload_0
    //   551: getfield 60	com/appsflyer/internal/AFd1hSDK:afInfoLog	Lcom/appsflyer/internal/AFa1qSDK;
    //   554: aload_1
    //   555: aload_0
    //   556: getfield 83	com/appsflyer/internal/AFd1hSDK:afWarnLog	Lcom/appsflyer/internal/AFb1bSDK;
    //   559: invokevirtual 418	com/appsflyer/internal/AFc1oSDK:AFKeystoreWrapper	(Lcom/appsflyer/internal/AFa1qSDK;Ljava/lang/String;Lcom/appsflyer/internal/AFb1bSDK;)Lcom/appsflyer/internal/AFc1qSDK;
    //   562: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	563	0	this	AFd1hSDK
    //   0	563	1	paramString	String
    //   3	461	2	str1	String
    //   48	9	3	d	double
    //   52	1	5	localNullPointerException1	NullPointerException
    //   82	235	5	localObject1	Object
    //   325	7	5	localException1	Exception
    //   337	203	5	localObject2	Object
    //   89	449	6	str2	String
    //   96	185	7	localMap	Map
    //   104	53	8	localObject3	Object
    //   179	17	8	localThrowable1	Throwable
    //   208	143	8	localObject4	Object
    //   371	3	8	localObject5	Object
    //   388	1	8	localObject6	Object
    //   393	1	8	localException2	Exception
    //   398	12	8	localNullPointerException2	NullPointerException
    //   417	109	8	localObject7	Object
    //   141	7	9	localObject8	Object
    //   154	1	9	localNullPointerException3	NullPointerException
    //   184	1	9	localNullPointerException4	NullPointerException
    //   204	17	9	str3	String
    //   312	7	9	localObject9	Object
    //   329	7	9	localObject10	Object
    //   342	7	9	localNullPointerException5	NullPointerException
    //   378	8	9	localThrowable2	Throwable
    // Exception table:
    //   from	to	target	type
    //   29	49	52	java/lang/NullPointerException
    //   125	138	141	finally
    //   163	179	141	finally
    //   125	138	154	java/lang/NullPointerException
    //   163	179	154	java/lang/NullPointerException
    //   101	120	179	finally
    //   101	120	184	java/lang/NullPointerException
    //   296	309	312	finally
    //   355	371	312	finally
    //   296	309	325	java/lang/Exception
    //   355	371	325	java/lang/Exception
    //   296	309	342	java/lang/NullPointerException
    //   355	371	342	java/lang/NullPointerException
    //   226	291	371	finally
    //   373	380	388	finally
    //   385	388	388	finally
    //   403	406	388	finally
    //   373	380	393	java/lang/Exception
    //   385	388	393	java/lang/Exception
    //   403	406	393	java/lang/Exception
    //   373	380	398	java/lang/NullPointerException
    //   385	388	398	java/lang/NullPointerException
    //   403	406	398	java/lang/NullPointerException
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFd1hSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */