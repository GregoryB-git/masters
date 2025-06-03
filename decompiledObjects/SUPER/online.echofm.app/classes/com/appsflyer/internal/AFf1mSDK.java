package com.appsflyer.internal;

import android.content.Context;
import android.database.Cursor;
import java.util.Map;

public final class AFf1mSDK
  extends AFf1rSDK
{
  private final AFc1xSDK AFInAppEventType;
  
  public AFf1mSDK(Runnable paramRunnable, AFc1xSDK paramAFc1xSDK)
  {
    super("store", "samsung", paramRunnable);
    AFInAppEventType = paramAFc1xSDK;
  }
  
  public final void valueOf(Context paramContext)
  {
    paramContext = new AFb1hSDK(paramContext, AFInAppEventType, "com.sec.android.app.samsungapps.referrer", new String[] { "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901" })
    {
      /* Error */
      private Map<String, Object> AFInAppEventParameterName()
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore_1
        //   2: aconst_null
        //   3: astore_2
        //   4: aload_2
        //   5: astore_3
        //   6: aload_1
        //   7: astore 4
        //   9: aload_0
        //   10: getfield 26	com/appsflyer/internal/AFb1hSDK:AFInAppEventParameterName	Landroid/content/Context;
        //   13: invokevirtual 32	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
        //   16: astore 5
        //   18: aload_2
        //   19: astore_3
        //   20: aload_1
        //   21: astore 4
        //   23: new 34	java/lang/StringBuilder
        //   26: astore 6
        //   28: aload_2
        //   29: astore_3
        //   30: aload_1
        //   31: astore 4
        //   33: aload 6
        //   35: ldc 36
        //   37: invokespecial 39	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
        //   40: aload_2
        //   41: astore_3
        //   42: aload_1
        //   43: astore 4
        //   45: aload 6
        //   47: aload_0
        //   48: getfield 43	com/appsflyer/internal/AFb1hSDK:AFKeystoreWrapper	Ljava/lang/String;
        //   51: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   54: pop
        //   55: aload_2
        //   56: astore_3
        //   57: aload_1
        //   58: astore 4
        //   60: aload 5
        //   62: aload 6
        //   64: invokevirtual 53	java/lang/Object:toString	()Ljava/lang/String;
        //   67: invokestatic 59	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
        //   70: aconst_null
        //   71: aconst_null
        //   72: aconst_null
        //   73: aconst_null
        //   74: invokevirtual 65	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   77: astore_2
        //   78: aload_2
        //   79: ifnull +339 -> 418
        //   82: aload_2
        //   83: astore_3
        //   84: aload_2
        //   85: astore 4
        //   87: aload_2
        //   88: invokeinterface 71 1 0
        //   93: ifeq +300 -> 393
        //   96: aload_2
        //   97: astore_3
        //   98: aload_2
        //   99: astore 4
        //   101: aload_0
        //   102: getfield 15	com/appsflyer/internal/AFf1mSDK$5:valueOf	Lcom/appsflyer/internal/AFf1mSDK;
        //   105: getfield 76	com/appsflyer/internal/AFf1pSDK:AFInAppEventParameterName	Ljava/util/Map;
        //   108: ldc 78
        //   110: ldc 80
        //   112: invokeinterface 86 3 0
        //   117: pop
        //   118: aload_2
        //   119: astore_3
        //   120: aload_2
        //   121: astore 4
        //   123: ldc 88
        //   125: aload_0
        //   126: getfield 15	com/appsflyer/internal/AFf1mSDK$5:valueOf	Lcom/appsflyer/internal/AFf1mSDK;
        //   129: getfield 76	com/appsflyer/internal/AFf1pSDK:AFInAppEventParameterName	Ljava/util/Map;
        //   132: aload_2
        //   133: invokestatic 91	com/appsflyer/internal/AFf1mSDK$5:AFInAppEventParameterName	(Ljava/lang/String;Ljava/util/Map;Landroid/database/Cursor;)V
        //   136: aload_2
        //   137: astore_3
        //   138: aload_2
        //   139: astore 4
        //   141: ldc 93
        //   143: aload_0
        //   144: getfield 15	com/appsflyer/internal/AFf1mSDK$5:valueOf	Lcom/appsflyer/internal/AFf1mSDK;
        //   147: getfield 76	com/appsflyer/internal/AFf1pSDK:AFInAppEventParameterName	Ljava/util/Map;
        //   150: aload_2
        //   151: invokestatic 95	com/appsflyer/internal/AFf1mSDK$5:AFKeystoreWrapper	(Ljava/lang/String;Ljava/util/Map;Landroid/database/Cursor;)V
        //   154: aload_2
        //   155: astore_3
        //   156: aload_2
        //   157: astore 4
        //   159: ldc 97
        //   161: aload_0
        //   162: getfield 15	com/appsflyer/internal/AFf1mSDK$5:valueOf	Lcom/appsflyer/internal/AFf1mSDK;
        //   165: getfield 76	com/appsflyer/internal/AFf1pSDK:AFInAppEventParameterName	Ljava/util/Map;
        //   168: aload_2
        //   169: invokestatic 95	com/appsflyer/internal/AFf1mSDK$5:AFKeystoreWrapper	(Ljava/lang/String;Ljava/util/Map;Landroid/database/Cursor;)V
        //   172: aload_2
        //   173: astore_3
        //   174: aload_2
        //   175: astore 4
        //   177: ldc 99
        //   179: aload_0
        //   180: getfield 15	com/appsflyer/internal/AFf1mSDK$5:valueOf	Lcom/appsflyer/internal/AFf1mSDK;
        //   183: getfield 76	com/appsflyer/internal/AFf1pSDK:AFInAppEventParameterName	Ljava/util/Map;
        //   186: aload_2
        //   187: invokestatic 95	com/appsflyer/internal/AFf1mSDK$5:AFKeystoreWrapper	(Ljava/lang/String;Ljava/util/Map;Landroid/database/Cursor;)V
        //   190: aload_2
        //   191: astore_3
        //   192: aload_2
        //   193: astore 4
        //   195: ldc 101
        //   197: aload_0
        //   198: getfield 15	com/appsflyer/internal/AFf1mSDK$5:valueOf	Lcom/appsflyer/internal/AFf1mSDK;
        //   201: getfield 76	com/appsflyer/internal/AFf1pSDK:AFInAppEventParameterName	Ljava/util/Map;
        //   204: aload_2
        //   205: invokestatic 91	com/appsflyer/internal/AFf1mSDK$5:AFInAppEventParameterName	(Ljava/lang/String;Ljava/util/Map;Landroid/database/Cursor;)V
        //   208: aload_2
        //   209: astore_3
        //   210: aload_2
        //   211: astore 4
        //   213: ldc 103
        //   215: aload_0
        //   216: getfield 15	com/appsflyer/internal/AFf1mSDK$5:valueOf	Lcom/appsflyer/internal/AFf1mSDK;
        //   219: getfield 76	com/appsflyer/internal/AFf1pSDK:AFInAppEventParameterName	Ljava/util/Map;
        //   222: aload_2
        //   223: invokestatic 91	com/appsflyer/internal/AFf1mSDK$5:AFInAppEventParameterName	(Ljava/lang/String;Ljava/util/Map;Landroid/database/Cursor;)V
        //   226: aload_2
        //   227: astore_3
        //   228: aload_2
        //   229: astore 4
        //   231: new 105	java/util/HashMap
        //   234: astore_1
        //   235: aload_2
        //   236: astore_3
        //   237: aload_2
        //   238: astore 4
        //   240: aload_1
        //   241: invokespecial 108	java/util/HashMap:<init>	()V
        //   244: aload_2
        //   245: astore_3
        //   246: aload_2
        //   247: astore 4
        //   249: aload_2
        //   250: ldc 110
        //   252: invokeinterface 114 2 0
        //   257: istore 7
        //   259: iload 7
        //   261: iconst_m1
        //   262: if_icmpeq +57 -> 319
        //   265: aload_2
        //   266: astore_3
        //   267: aload_2
        //   268: astore 4
        //   270: aload_2
        //   271: iload 7
        //   273: invokeinterface 118 2 0
        //   278: astore 6
        //   280: aload 6
        //   282: ifnull +37 -> 319
        //   285: aload_2
        //   286: astore_3
        //   287: aload_2
        //   288: astore 4
        //   290: aload_1
        //   291: ldc 110
        //   293: aload 6
        //   295: invokestatic 124	java/lang/Boolean:parseBoolean	(Ljava/lang/String;)Z
        //   298: invokestatic 127	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
        //   301: invokeinterface 86 3 0
        //   306: pop
        //   307: goto +12 -> 319
        //   310: astore 4
        //   312: goto +272 -> 584
        //   315: astore_2
        //   316: goto +141 -> 457
        //   319: aload_2
        //   320: astore_3
        //   321: aload_2
        //   322: astore 4
        //   324: ldc -127
        //   326: aload_1
        //   327: aload_2
        //   328: invokestatic 95	com/appsflyer/internal/AFf1mSDK$5:AFKeystoreWrapper	(Ljava/lang/String;Ljava/util/Map;Landroid/database/Cursor;)V
        //   331: aload_2
        //   332: astore_3
        //   333: aload_2
        //   334: astore 4
        //   336: ldc -125
        //   338: aload_1
        //   339: aload_2
        //   340: invokestatic 95	com/appsflyer/internal/AFf1mSDK$5:AFKeystoreWrapper	(Ljava/lang/String;Ljava/util/Map;Landroid/database/Cursor;)V
        //   343: aload_2
        //   344: astore_3
        //   345: aload_2
        //   346: astore 4
        //   348: ldc -123
        //   350: aload_1
        //   351: aload_2
        //   352: invokestatic 91	com/appsflyer/internal/AFf1mSDK$5:AFInAppEventParameterName	(Ljava/lang/String;Ljava/util/Map;Landroid/database/Cursor;)V
        //   355: aload_2
        //   356: astore_3
        //   357: aload_2
        //   358: astore 4
        //   360: aload_1
        //   361: invokeinterface 136 1 0
        //   366: ifne +74 -> 440
        //   369: aload_2
        //   370: astore_3
        //   371: aload_2
        //   372: astore 4
        //   374: aload_0
        //   375: getfield 15	com/appsflyer/internal/AFf1mSDK$5:valueOf	Lcom/appsflyer/internal/AFf1mSDK;
        //   378: getfield 76	com/appsflyer/internal/AFf1pSDK:AFInAppEventParameterName	Ljava/util/Map;
        //   381: ldc -118
        //   383: aload_1
        //   384: invokeinterface 86 3 0
        //   389: pop
        //   390: goto +50 -> 440
        //   393: aload_2
        //   394: astore_3
        //   395: aload_2
        //   396: astore 4
        //   398: aload_0
        //   399: getfield 15	com/appsflyer/internal/AFf1mSDK$5:valueOf	Lcom/appsflyer/internal/AFf1mSDK;
        //   402: getfield 76	com/appsflyer/internal/AFf1pSDK:AFInAppEventParameterName	Ljava/util/Map;
        //   405: ldc 78
        //   407: ldc -116
        //   409: invokeinterface 86 3 0
        //   414: pop
        //   415: goto +25 -> 440
        //   418: aload_2
        //   419: astore_3
        //   420: aload_2
        //   421: astore 4
        //   423: aload_0
        //   424: getfield 15	com/appsflyer/internal/AFf1mSDK$5:valueOf	Lcom/appsflyer/internal/AFf1mSDK;
        //   427: getfield 76	com/appsflyer/internal/AFf1pSDK:AFInAppEventParameterName	Ljava/util/Map;
        //   430: ldc 78
        //   432: ldc -114
        //   434: invokeinterface 86 3 0
        //   439: pop
        //   440: aload_2
        //   441: ifnull +55 -> 496
        //   444: aload_2
        //   445: astore 4
        //   447: aload 4
        //   449: invokeinterface 145 1 0
        //   454: goto +42 -> 496
        //   457: aload 4
        //   459: astore_3
        //   460: aload_0
        //   461: getfield 15	com/appsflyer/internal/AFf1mSDK$5:valueOf	Lcom/appsflyer/internal/AFf1mSDK;
        //   464: getfield 76	com/appsflyer/internal/AFf1pSDK:AFInAppEventParameterName	Ljava/util/Map;
        //   467: ldc 78
        //   469: ldc -116
        //   471: invokeinterface 86 3 0
        //   476: pop
        //   477: aload 4
        //   479: astore_3
        //   480: aload_2
        //   481: invokevirtual 150	java/lang/Throwable:getMessage	()Ljava/lang/String;
        //   484: aload_2
        //   485: invokestatic 156	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   488: aload 4
        //   490: ifnull +6 -> 496
        //   493: goto -46 -> 447
        //   496: aload_0
        //   497: getfield 26	com/appsflyer/internal/AFb1hSDK:AFInAppEventParameterName	Landroid/content/Context;
        //   500: invokevirtual 160	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
        //   503: aload_0
        //   504: getfield 43	com/appsflyer/internal/AFb1hSDK:AFKeystoreWrapper	Ljava/lang/String;
        //   507: sipush 128
        //   510: invokevirtual 166	android/content/pm/PackageManager:resolveContentProvider	(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
        //   513: getfield 171	android/content/pm/PackageItemInfo:packageName	Ljava/lang/String;
        //   516: astore 4
        //   518: aload_0
        //   519: getfield 15	com/appsflyer/internal/AFf1mSDK$5:valueOf	Lcom/appsflyer/internal/AFf1mSDK;
        //   522: getfield 76	com/appsflyer/internal/AFf1pSDK:AFInAppEventParameterName	Ljava/util/Map;
        //   525: ldc -83
        //   527: aload_0
        //   528: getfield 26	com/appsflyer/internal/AFb1hSDK:AFInAppEventParameterName	Landroid/content/Context;
        //   531: aload 4
        //   533: invokestatic 179	com/appsflyer/internal/AFa1fSDK:AFInAppEventType	(Landroid/content/Context;Ljava/lang/String;)J
        //   536: invokestatic 184	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   539: invokeinterface 86 3 0
        //   544: pop
        //   545: aload_0
        //   546: getfield 15	com/appsflyer/internal/AFf1mSDK$5:valueOf	Lcom/appsflyer/internal/AFf1mSDK;
        //   549: getfield 76	com/appsflyer/internal/AFf1pSDK:AFInAppEventParameterName	Ljava/util/Map;
        //   552: ldc -70
        //   554: aload_0
        //   555: getfield 26	com/appsflyer/internal/AFb1hSDK:AFInAppEventParameterName	Landroid/content/Context;
        //   558: aload 4
        //   560: invokestatic 189	com/appsflyer/internal/AFa1fSDK:AFKeystoreWrapper	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
        //   563: invokeinterface 86 3 0
        //   568: pop
        //   569: aload_0
        //   570: getfield 15	com/appsflyer/internal/AFf1mSDK$5:valueOf	Lcom/appsflyer/internal/AFf1mSDK;
        //   573: invokevirtual 192	com/appsflyer/internal/AFf1pSDK:values	()V
        //   576: aload_0
        //   577: getfield 15	com/appsflyer/internal/AFf1mSDK$5:valueOf	Lcom/appsflyer/internal/AFf1mSDK;
        //   580: getfield 76	com/appsflyer/internal/AFf1pSDK:AFInAppEventParameterName	Ljava/util/Map;
        //   583: areturn
        //   584: aload_3
        //   585: ifnull +9 -> 594
        //   588: aload_3
        //   589: invokeinterface 145 1 0
        //   594: aload 4
        //   596: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	597	0	this	5
        //   1	383	1	localHashMap	java.util.HashMap
        //   3	285	2	localCursor	Cursor
        //   315	170	2	localException	Exception
        //   5	584	3	localObject1	Object
        //   7	282	4	localObject2	Object
        //   310	1	4	localObject3	Object
        //   322	273	4	localObject4	Object
        //   16	45	5	localContentResolver	android.content.ContentResolver
        //   26	268	6	localObject5	Object
        //   257	15	7	i	int
        // Exception table:
        //   from	to	target	type
        //   9	18	310	finally
        //   23	28	310	finally
        //   33	40	310	finally
        //   45	55	310	finally
        //   60	78	310	finally
        //   87	96	310	finally
        //   101	118	310	finally
        //   123	136	310	finally
        //   141	154	310	finally
        //   159	172	310	finally
        //   177	190	310	finally
        //   195	208	310	finally
        //   213	226	310	finally
        //   231	235	310	finally
        //   240	244	310	finally
        //   249	259	310	finally
        //   270	280	310	finally
        //   290	307	310	finally
        //   324	331	310	finally
        //   336	343	310	finally
        //   348	355	310	finally
        //   360	369	310	finally
        //   374	390	310	finally
        //   398	415	310	finally
        //   423	440	310	finally
        //   460	477	310	finally
        //   480	488	310	finally
        //   9	18	315	java/lang/Exception
        //   23	28	315	java/lang/Exception
        //   33	40	315	java/lang/Exception
        //   45	55	315	java/lang/Exception
        //   60	78	315	java/lang/Exception
        //   87	96	315	java/lang/Exception
        //   101	118	315	java/lang/Exception
        //   123	136	315	java/lang/Exception
        //   141	154	315	java/lang/Exception
        //   159	172	315	java/lang/Exception
        //   177	190	315	java/lang/Exception
        //   195	208	315	java/lang/Exception
        //   213	226	315	java/lang/Exception
        //   231	235	315	java/lang/Exception
        //   240	244	315	java/lang/Exception
        //   249	259	315	java/lang/Exception
        //   270	280	315	java/lang/Exception
        //   290	307	315	java/lang/Exception
        //   324	331	315	java/lang/Exception
        //   336	343	315	java/lang/Exception
        //   348	355	315	java/lang/Exception
        //   360	369	315	java/lang/Exception
        //   374	390	315	java/lang/Exception
        //   398	415	315	java/lang/Exception
        //   423	440	315	java/lang/Exception
      }
      
      private static void AFInAppEventParameterName(String paramAnonymousString, Map<String, Object> paramAnonymousMap, Cursor paramAnonymousCursor)
      {
        int i = paramAnonymousCursor.getColumnIndex(paramAnonymousString);
        if (i == -1) {
          return;
        }
        paramAnonymousCursor = paramAnonymousCursor.getString(i);
        if (paramAnonymousCursor == null) {
          return;
        }
        paramAnonymousMap.put(paramAnonymousString, paramAnonymousCursor);
      }
      
      private static void AFKeystoreWrapper(String paramAnonymousString, Map<String, Object> paramAnonymousMap, Cursor paramAnonymousCursor)
      {
        int i = paramAnonymousCursor.getColumnIndex(paramAnonymousString);
        if (i == -1) {
          return;
        }
        long l = paramAnonymousCursor.getLong(i);
        if (l == 0L) {
          return;
        }
        paramAnonymousMap.put(paramAnonymousString, Long.valueOf(l));
      }
    };
    AFInAppEventType(AFInAppEventType.values(), paramContext);
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFf1mSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */