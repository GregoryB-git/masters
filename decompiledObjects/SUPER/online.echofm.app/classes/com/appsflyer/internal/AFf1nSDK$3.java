package com.appsflyer.internal;

import android.content.Context;
import java.util.Map;

final class AFf1nSDK$3
  extends AFb1hSDK<Map<String, Object>>
{
  public AFf1nSDK$3(AFf1nSDK paramAFf1nSDK, Context paramContext, AFc1xSDK paramAFc1xSDK, String paramString, String... paramVarArgs)
  {
    super(paramContext, paramAFc1xSDK, paramString, paramVarArgs);
  }
  
  /* Error */
  private Map<String, Object> AFInAppEventType()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 27	com/appsflyer/internal/AFb1hSDK:AFInAppEventParameterName	Landroid/content/Context;
    //   4: invokevirtual 33	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   7: aload_0
    //   8: getfield 37	com/appsflyer/internal/AFb1hSDK:AFKeystoreWrapper	Ljava/lang/String;
    //   11: sipush 128
    //   14: invokevirtual 43	android/content/pm/PackageManager:resolveContentProvider	(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
    //   17: getfield 48	android/content/pm/PackageItemInfo:packageName	Ljava/lang/String;
    //   20: astore_1
    //   21: aload_0
    //   22: getfield 15	com/appsflyer/internal/AFf1nSDK$3:valueOf	Lcom/appsflyer/internal/AFf1nSDK;
    //   25: getfield 53	com/appsflyer/internal/AFf1pSDK:AFInAppEventParameterName	Ljava/util/Map;
    //   28: ldc 55
    //   30: aload_0
    //   31: getfield 27	com/appsflyer/internal/AFb1hSDK:AFInAppEventParameterName	Landroid/content/Context;
    //   34: aload_1
    //   35: invokestatic 60	com/appsflyer/internal/AFa1fSDK:AFInAppEventType	(Landroid/content/Context;Ljava/lang/String;)J
    //   38: invokestatic 65	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   41: invokeinterface 71 3 0
    //   46: pop
    //   47: aload_0
    //   48: getfield 15	com/appsflyer/internal/AFf1nSDK$3:valueOf	Lcom/appsflyer/internal/AFf1nSDK;
    //   51: getfield 53	com/appsflyer/internal/AFf1pSDK:AFInAppEventParameterName	Ljava/util/Map;
    //   54: ldc 73
    //   56: aload_0
    //   57: getfield 27	com/appsflyer/internal/AFb1hSDK:AFInAppEventParameterName	Landroid/content/Context;
    //   60: aload_1
    //   61: invokestatic 76	com/appsflyer/internal/AFa1fSDK:AFKeystoreWrapper	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   64: invokeinterface 71 3 0
    //   69: pop
    //   70: aconst_null
    //   71: astore_2
    //   72: aconst_null
    //   73: astore_3
    //   74: aload_3
    //   75: astore 4
    //   77: aload_2
    //   78: astore_1
    //   79: aload_0
    //   80: getfield 27	com/appsflyer/internal/AFb1hSDK:AFInAppEventParameterName	Landroid/content/Context;
    //   83: invokevirtual 80	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   86: astore 5
    //   88: aload_3
    //   89: astore 4
    //   91: aload_2
    //   92: astore_1
    //   93: new 82	java/lang/StringBuilder
    //   96: astore 6
    //   98: aload_3
    //   99: astore 4
    //   101: aload_2
    //   102: astore_1
    //   103: aload 6
    //   105: ldc 84
    //   107: invokespecial 87	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   110: aload_3
    //   111: astore 4
    //   113: aload_2
    //   114: astore_1
    //   115: aload 6
    //   117: aload_0
    //   118: getfield 37	com/appsflyer/internal/AFb1hSDK:AFKeystoreWrapper	Ljava/lang/String;
    //   121: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: pop
    //   125: aload_3
    //   126: astore 4
    //   128: aload_2
    //   129: astore_1
    //   130: aload 6
    //   132: ldc 93
    //   134: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: pop
    //   138: aload_3
    //   139: astore 4
    //   141: aload_2
    //   142: astore_1
    //   143: aload 5
    //   145: aload 6
    //   147: invokevirtual 99	java/lang/Object:toString	()Ljava/lang/String;
    //   150: invokestatic 105	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   153: aconst_null
    //   154: aconst_null
    //   155: iconst_1
    //   156: anewarray 107	java/lang/String
    //   159: dup
    //   160: iconst_0
    //   161: aload_0
    //   162: getfield 27	com/appsflyer/internal/AFb1hSDK:AFInAppEventParameterName	Landroid/content/Context;
    //   165: invokevirtual 110	android/content/Context:getPackageName	()Ljava/lang/String;
    //   168: aastore
    //   169: aconst_null
    //   170: invokevirtual 116	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   173: astore_3
    //   174: aload_3
    //   175: ifnull +303 -> 478
    //   178: aload_3
    //   179: astore 4
    //   181: aload_3
    //   182: astore_1
    //   183: aload_3
    //   184: invokeinterface 122 1 0
    //   189: ifeq +264 -> 453
    //   192: aload_3
    //   193: astore 4
    //   195: aload_3
    //   196: astore_1
    //   197: aload_0
    //   198: getfield 15	com/appsflyer/internal/AFf1nSDK$3:valueOf	Lcom/appsflyer/internal/AFf1nSDK;
    //   201: getfield 53	com/appsflyer/internal/AFf1pSDK:AFInAppEventParameterName	Ljava/util/Map;
    //   204: ldc 124
    //   206: ldc 126
    //   208: invokeinterface 71 3 0
    //   213: pop
    //   214: aload_3
    //   215: astore 4
    //   217: aload_3
    //   218: astore_1
    //   219: aload_0
    //   220: getfield 15	com/appsflyer/internal/AFf1nSDK$3:valueOf	Lcom/appsflyer/internal/AFf1nSDK;
    //   223: getfield 53	com/appsflyer/internal/AFf1pSDK:AFInAppEventParameterName	Ljava/util/Map;
    //   226: ldc -128
    //   228: aload_3
    //   229: iconst_0
    //   230: invokeinterface 132 2 0
    //   235: invokeinterface 71 3 0
    //   240: pop
    //   241: aload_3
    //   242: astore 4
    //   244: aload_3
    //   245: astore_1
    //   246: aload_0
    //   247: getfield 15	com/appsflyer/internal/AFf1nSDK$3:valueOf	Lcom/appsflyer/internal/AFf1nSDK;
    //   250: getfield 53	com/appsflyer/internal/AFf1pSDK:AFInAppEventParameterName	Ljava/util/Map;
    //   253: ldc -122
    //   255: aload_3
    //   256: iconst_1
    //   257: invokeinterface 138 2 0
    //   262: invokestatic 65	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   265: invokeinterface 71 3 0
    //   270: pop
    //   271: aload_3
    //   272: astore 4
    //   274: aload_3
    //   275: astore_1
    //   276: aload_0
    //   277: getfield 15	com/appsflyer/internal/AFf1nSDK$3:valueOf	Lcom/appsflyer/internal/AFf1nSDK;
    //   280: getfield 53	com/appsflyer/internal/AFf1pSDK:AFInAppEventParameterName	Ljava/util/Map;
    //   283: ldc -116
    //   285: aload_3
    //   286: iconst_2
    //   287: invokeinterface 138 2 0
    //   292: invokestatic 65	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   295: invokeinterface 71 3 0
    //   300: pop
    //   301: aload_3
    //   302: astore 4
    //   304: aload_3
    //   305: astore_1
    //   306: aload_3
    //   307: invokeinterface 144 1 0
    //   312: iconst_3
    //   313: if_icmple +187 -> 500
    //   316: aload_3
    //   317: astore 4
    //   319: aload_3
    //   320: astore_1
    //   321: aload_0
    //   322: getfield 15	com/appsflyer/internal/AFf1nSDK$3:valueOf	Lcom/appsflyer/internal/AFf1nSDK;
    //   325: getfield 53	com/appsflyer/internal/AFf1pSDK:AFInAppEventParameterName	Ljava/util/Map;
    //   328: ldc -110
    //   330: aload_3
    //   331: iconst_3
    //   332: invokeinterface 138 2 0
    //   337: invokestatic 65	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   340: invokeinterface 71 3 0
    //   345: pop
    //   346: aload_3
    //   347: astore 4
    //   349: aload_3
    //   350: astore_1
    //   351: new 148	java/util/HashMap
    //   354: astore 5
    //   356: aload_3
    //   357: astore 4
    //   359: aload_3
    //   360: astore_1
    //   361: aload 5
    //   363: invokespecial 151	java/util/HashMap:<init>	()V
    //   366: aload_3
    //   367: astore 4
    //   369: aload_3
    //   370: astore_1
    //   371: aload_3
    //   372: iconst_4
    //   373: invokeinterface 132 2 0
    //   378: astore_2
    //   379: aload_2
    //   380: ifnull +28 -> 408
    //   383: aload_3
    //   384: astore 4
    //   386: aload_3
    //   387: astore_1
    //   388: aload 5
    //   390: ldc -103
    //   392: aload_2
    //   393: invokevirtual 156	java/util/AbstractMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   396: pop
    //   397: goto +11 -> 408
    //   400: astore_1
    //   401: goto +167 -> 568
    //   404: astore_3
    //   405: goto +110 -> 515
    //   408: aload_3
    //   409: astore 4
    //   411: aload_3
    //   412: astore_1
    //   413: aload 5
    //   415: ldc -98
    //   417: aload_3
    //   418: iconst_5
    //   419: invokeinterface 132 2 0
    //   424: invokevirtual 156	java/util/AbstractMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   427: pop
    //   428: aload_3
    //   429: astore 4
    //   431: aload_3
    //   432: astore_1
    //   433: aload_0
    //   434: getfield 15	com/appsflyer/internal/AFf1nSDK$3:valueOf	Lcom/appsflyer/internal/AFf1nSDK;
    //   437: getfield 53	com/appsflyer/internal/AFf1pSDK:AFInAppEventParameterName	Ljava/util/Map;
    //   440: ldc -96
    //   442: aload 5
    //   444: invokeinterface 71 3 0
    //   449: pop
    //   450: goto +50 -> 500
    //   453: aload_3
    //   454: astore 4
    //   456: aload_3
    //   457: astore_1
    //   458: aload_0
    //   459: getfield 15	com/appsflyer/internal/AFf1nSDK$3:valueOf	Lcom/appsflyer/internal/AFf1nSDK;
    //   462: getfield 53	com/appsflyer/internal/AFf1pSDK:AFInAppEventParameterName	Ljava/util/Map;
    //   465: ldc 124
    //   467: ldc -94
    //   469: invokeinterface 71 3 0
    //   474: pop
    //   475: goto +25 -> 500
    //   478: aload_3
    //   479: astore 4
    //   481: aload_3
    //   482: astore_1
    //   483: aload_0
    //   484: getfield 15	com/appsflyer/internal/AFf1nSDK$3:valueOf	Lcom/appsflyer/internal/AFf1nSDK;
    //   487: getfield 53	com/appsflyer/internal/AFf1pSDK:AFInAppEventParameterName	Ljava/util/Map;
    //   490: ldc 124
    //   492: ldc -92
    //   494: invokeinterface 71 3 0
    //   499: pop
    //   500: aload_3
    //   501: ifnull +52 -> 553
    //   504: aload_3
    //   505: astore_1
    //   506: aload_1
    //   507: invokeinterface 167 1 0
    //   512: goto +41 -> 553
    //   515: aload_1
    //   516: astore 4
    //   518: aload_0
    //   519: getfield 15	com/appsflyer/internal/AFf1nSDK$3:valueOf	Lcom/appsflyer/internal/AFf1nSDK;
    //   522: getfield 53	com/appsflyer/internal/AFf1pSDK:AFInAppEventParameterName	Ljava/util/Map;
    //   525: ldc 124
    //   527: ldc -94
    //   529: invokeinterface 71 3 0
    //   534: pop
    //   535: aload_1
    //   536: astore 4
    //   538: aload_3
    //   539: invokevirtual 172	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   542: aload_3
    //   543: invokestatic 178	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   546: aload_1
    //   547: ifnull +6 -> 553
    //   550: goto -44 -> 506
    //   553: aload_0
    //   554: getfield 15	com/appsflyer/internal/AFf1nSDK$3:valueOf	Lcom/appsflyer/internal/AFf1nSDK;
    //   557: invokevirtual 181	com/appsflyer/internal/AFf1pSDK:values	()V
    //   560: aload_0
    //   561: getfield 15	com/appsflyer/internal/AFf1nSDK$3:valueOf	Lcom/appsflyer/internal/AFf1nSDK;
    //   564: getfield 53	com/appsflyer/internal/AFf1pSDK:AFInAppEventParameterName	Ljava/util/Map;
    //   567: areturn
    //   568: aload 4
    //   570: ifnull +10 -> 580
    //   573: aload 4
    //   575: invokeinterface 167 1 0
    //   580: aload_1
    //   581: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	582	0	this	3
    //   20	368	1	localObject1	Object
    //   400	1	1	localObject2	Object
    //   412	169	1	localObject3	Object
    //   71	322	2	str	String
    //   73	314	3	localCursor	android.database.Cursor
    //   404	139	3	localException	Exception
    //   75	499	4	localObject4	Object
    //   86	357	5	localObject5	Object
    //   96	50	6	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   79	88	400	finally
    //   93	98	400	finally
    //   103	110	400	finally
    //   115	125	400	finally
    //   130	138	400	finally
    //   143	174	400	finally
    //   183	192	400	finally
    //   197	214	400	finally
    //   219	241	400	finally
    //   246	271	400	finally
    //   276	301	400	finally
    //   306	316	400	finally
    //   321	346	400	finally
    //   351	356	400	finally
    //   361	366	400	finally
    //   371	379	400	finally
    //   388	397	400	finally
    //   413	428	400	finally
    //   433	450	400	finally
    //   458	475	400	finally
    //   483	500	400	finally
    //   518	535	400	finally
    //   538	546	400	finally
    //   79	88	404	java/lang/Exception
    //   93	98	404	java/lang/Exception
    //   103	110	404	java/lang/Exception
    //   115	125	404	java/lang/Exception
    //   130	138	404	java/lang/Exception
    //   143	174	404	java/lang/Exception
    //   183	192	404	java/lang/Exception
    //   197	214	404	java/lang/Exception
    //   219	241	404	java/lang/Exception
    //   246	271	404	java/lang/Exception
    //   276	301	404	java/lang/Exception
    //   306	316	404	java/lang/Exception
    //   321	346	404	java/lang/Exception
    //   351	356	404	java/lang/Exception
    //   361	366	404	java/lang/Exception
    //   371	379	404	java/lang/Exception
    //   388	397	404	java/lang/Exception
    //   413	428	404	java/lang/Exception
    //   433	450	404	java/lang/Exception
    //   458	475	404	java/lang/Exception
    //   483	500	404	java/lang/Exception
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFf1nSDK.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */