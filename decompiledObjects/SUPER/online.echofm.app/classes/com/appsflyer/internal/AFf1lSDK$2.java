package com.appsflyer.internal;

import android.content.Context;

final class AFf1lSDK$2
  implements Runnable
{
  public AFf1lSDK$2(AFf1lSDK paramAFf1lSDK, Context paramContext) {}
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 19	com/appsflyer/internal/AFf1lSDK$2:AFInAppEventParameterName	Lcom/appsflyer/internal/AFf1lSDK;
    //   4: astore_1
    //   5: aload_1
    //   6: invokestatic 36	java/lang/System:currentTimeMillis	()J
    //   9: putfield 42	com/appsflyer/internal/AFf1pSDK:afInfoLog	J
    //   12: aload_1
    //   13: getstatic 48	com/appsflyer/internal/AFf1pSDK$AFa1zSDK:AFInAppEventType	Lcom/appsflyer/internal/AFf1pSDK$AFa1zSDK;
    //   16: putfield 51	com/appsflyer/internal/AFf1pSDK:afDebugLog	Lcom/appsflyer/internal/AFf1pSDK$AFa1zSDK;
    //   19: aload_1
    //   20: new 53	com/appsflyer/internal/AFf1pSDK$1
    //   23: dup
    //   24: aload_1
    //   25: invokespecial 56	com/appsflyer/internal/AFf1pSDK$1:<init>	(Lcom/appsflyer/internal/AFf1pSDK;)V
    //   28: invokevirtual 62	java/util/Observable:addObserver	(Ljava/util/Observer;)V
    //   31: new 64	java/lang/StringBuilder
    //   34: dup
    //   35: ldc 66
    //   37: invokespecial 69	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   40: astore_1
    //   41: aload_1
    //   42: aload_0
    //   43: getfield 19	com/appsflyer/internal/AFf1lSDK$2:AFInAppEventParameterName	Lcom/appsflyer/internal/AFf1lSDK;
    //   46: getfield 72	com/appsflyer/internal/AFf1lSDK:AFInAppEventType	Landroid/content/pm/ProviderInfo;
    //   49: getfield 78	android/content/pm/ProviderInfo:authority	Ljava/lang/String;
    //   52: invokevirtual 82	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: pop
    //   56: aload_1
    //   57: ldc 84
    //   59: invokevirtual 82	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: pop
    //   63: aload_1
    //   64: invokevirtual 88	java/lang/Object:toString	()Ljava/lang/String;
    //   67: invokestatic 94	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   70: astore_2
    //   71: aload_0
    //   72: getfield 21	com/appsflyer/internal/AFf1lSDK$2:AFKeystoreWrapper	Landroid/content/Context;
    //   75: aload_2
    //   76: invokestatic 97	com/appsflyer/internal/AFf1lSDK:valueOf	(Landroid/content/Context;Landroid/net/Uri;)Landroid/content/ContentProviderClient;
    //   79: astore_3
    //   80: aload_3
    //   81: ifnull +117 -> 198
    //   84: new 64	java/lang/StringBuilder
    //   87: astore_1
    //   88: aload_1
    //   89: ldc 99
    //   91: invokespecial 69	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   94: aload_1
    //   95: aload_0
    //   96: getfield 21	com/appsflyer/internal/AFf1lSDK$2:AFKeystoreWrapper	Landroid/content/Context;
    //   99: invokevirtual 104	android/content/Context:getPackageName	()Ljava/lang/String;
    //   102: invokevirtual 82	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: pop
    //   106: aload_3
    //   107: aload_2
    //   108: aconst_null
    //   109: aload_1
    //   110: invokevirtual 88	java/lang/Object:toString	()Ljava/lang/String;
    //   113: aconst_null
    //   114: aconst_null
    //   115: invokevirtual 110	android/content/ContentProviderClient:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   118: astore_1
    //   119: getstatic 116	android/os/Build$VERSION:SDK_INT	I
    //   122: istore 4
    //   124: aload_3
    //   125: invokevirtual 120	android/content/ContentProviderClient:release	()Z
    //   128: pop
    //   129: goto +71 -> 200
    //   132: astore_1
    //   133: goto +11 -> 144
    //   136: astore_2
    //   137: goto +31 -> 168
    //   140: astore_2
    //   141: goto +39 -> 180
    //   144: ldc 122
    //   146: aload_1
    //   147: iconst_0
    //   148: invokestatic 128	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    //   151: getstatic 116	android/os/Build$VERSION:SDK_INT	I
    //   154: istore 4
    //   156: aload_3
    //   157: invokevirtual 120	android/content/ContentProviderClient:release	()Z
    //   160: pop
    //   161: goto +37 -> 198
    //   164: astore_1
    //   165: goto +21 -> 186
    //   168: ldc -126
    //   170: astore_1
    //   171: aload_1
    //   172: aload_2
    //   173: iconst_0
    //   174: invokestatic 128	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    //   177: goto -26 -> 151
    //   180: ldc -124
    //   182: astore_1
    //   183: goto -12 -> 171
    //   186: getstatic 116	android/os/Build$VERSION:SDK_INT	I
    //   189: istore 4
    //   191: aload_3
    //   192: invokevirtual 120	android/content/ContentProviderClient:release	()Z
    //   195: pop
    //   196: aload_1
    //   197: athrow
    //   198: aconst_null
    //   199: astore_1
    //   200: aload_1
    //   201: ifnull +121 -> 322
    //   204: aload_1
    //   205: ldc -122
    //   207: invokeinterface 140 2 0
    //   212: istore 4
    //   214: iload 4
    //   216: iconst_m1
    //   217: if_icmpne +28 -> 245
    //   220: ldc -114
    //   222: invokestatic 145	com/appsflyer/AFLogger:afWarnLog	(Ljava/lang/String;)V
    //   225: aload_0
    //   226: getfield 19	com/appsflyer/internal/AFf1lSDK$2:AFInAppEventParameterName	Lcom/appsflyer/internal/AFf1lSDK;
    //   229: getfield 148	com/appsflyer/internal/AFf1pSDK:AFInAppEventParameterName	Ljava/util/Map;
    //   232: ldc -106
    //   234: ldc -104
    //   236: invokeinterface 158 3 0
    //   241: pop
    //   242: goto +71 -> 313
    //   245: aload_0
    //   246: getfield 19	com/appsflyer/internal/AFf1lSDK$2:AFInAppEventParameterName	Lcom/appsflyer/internal/AFf1lSDK;
    //   249: getfield 148	com/appsflyer/internal/AFf1pSDK:AFInAppEventParameterName	Ljava/util/Map;
    //   252: ldc -106
    //   254: ldc -96
    //   256: invokeinterface 158 3 0
    //   261: pop
    //   262: aload_1
    //   263: invokeinterface 163 1 0
    //   268: ifeq +45 -> 313
    //   271: aload_1
    //   272: iload 4
    //   274: invokeinterface 167 2 0
    //   279: astore_2
    //   280: aload_1
    //   281: invokeinterface 170 1 0
    //   286: aload_2
    //   287: ifnull +26 -> 313
    //   290: aload_2
    //   291: invokevirtual 175	java/lang/String:isEmpty	()Z
    //   294: ifne +19 -> 313
    //   297: aload_0
    //   298: getfield 19	com/appsflyer/internal/AFf1lSDK$2:AFInAppEventParameterName	Lcom/appsflyer/internal/AFf1lSDK;
    //   301: getfield 148	com/appsflyer/internal/AFf1pSDK:AFInAppEventParameterName	Ljava/util/Map;
    //   304: ldc -79
    //   306: aload_2
    //   307: invokeinterface 158 3 0
    //   312: pop
    //   313: aload_1
    //   314: invokeinterface 170 1 0
    //   319: goto +25 -> 344
    //   322: ldc -77
    //   324: invokestatic 145	com/appsflyer/AFLogger:afWarnLog	(Ljava/lang/String;)V
    //   327: aload_0
    //   328: getfield 19	com/appsflyer/internal/AFf1lSDK$2:AFInAppEventParameterName	Lcom/appsflyer/internal/AFf1lSDK;
    //   331: getfield 148	com/appsflyer/internal/AFf1pSDK:AFInAppEventParameterName	Ljava/util/Map;
    //   334: ldc -106
    //   336: ldc -75
    //   338: invokeinterface 158 3 0
    //   343: pop
    //   344: aload_0
    //   345: getfield 19	com/appsflyer/internal/AFf1lSDK$2:AFInAppEventParameterName	Lcom/appsflyer/internal/AFf1lSDK;
    //   348: astore_1
    //   349: aload_1
    //   350: getfield 148	com/appsflyer/internal/AFf1pSDK:AFInAppEventParameterName	Ljava/util/Map;
    //   353: ldc -73
    //   355: aload_0
    //   356: getfield 21	com/appsflyer/internal/AFf1lSDK$2:AFKeystoreWrapper	Landroid/content/Context;
    //   359: aload_1
    //   360: getfield 72	com/appsflyer/internal/AFf1lSDK:AFInAppEventType	Landroid/content/pm/ProviderInfo;
    //   363: getfield 188	android/content/pm/PackageItemInfo:packageName	Ljava/lang/String;
    //   366: invokestatic 193	com/appsflyer/internal/AFa1fSDK:AFInAppEventType	(Landroid/content/Context;Ljava/lang/String;)J
    //   369: invokestatic 198	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   372: invokeinterface 158 3 0
    //   377: pop
    //   378: aload_0
    //   379: getfield 19	com/appsflyer/internal/AFf1lSDK$2:AFInAppEventParameterName	Lcom/appsflyer/internal/AFf1lSDK;
    //   382: astore_1
    //   383: aload_1
    //   384: getfield 148	com/appsflyer/internal/AFf1pSDK:AFInAppEventParameterName	Ljava/util/Map;
    //   387: ldc -56
    //   389: aload_0
    //   390: getfield 21	com/appsflyer/internal/AFf1lSDK$2:AFKeystoreWrapper	Landroid/content/Context;
    //   393: aload_1
    //   394: getfield 72	com/appsflyer/internal/AFf1lSDK:AFInAppEventType	Landroid/content/pm/ProviderInfo;
    //   397: getfield 188	android/content/pm/PackageItemInfo:packageName	Ljava/lang/String;
    //   400: invokestatic 203	com/appsflyer/internal/AFa1fSDK:AFKeystoreWrapper	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   403: invokeinterface 158 3 0
    //   408: pop
    //   409: aload_0
    //   410: getfield 19	com/appsflyer/internal/AFf1lSDK$2:AFInAppEventParameterName	Lcom/appsflyer/internal/AFf1lSDK;
    //   413: invokevirtual 206	com/appsflyer/internal/AFf1pSDK:values	()V
    //   416: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	417	0	this	2
    //   4	115	1	localObject1	Object
    //   132	15	1	localThrowable	Throwable
    //   164	1	1	localObject2	Object
    //   170	224	1	localObject3	Object
    //   70	38	2	localUri	android.net.Uri
    //   136	1	2	localRemoteException	android.os.RemoteException
    //   140	33	2	localDeadObjectException	android.os.DeadObjectException
    //   279	28	2	str	String
    //   79	113	3	localContentProviderClient	android.content.ContentProviderClient
    //   122	151	4	i	int
    // Exception table:
    //   from	to	target	type
    //   84	119	132	finally
    //   84	119	136	android/os/RemoteException
    //   84	119	140	android/os/DeadObjectException
    //   144	151	164	finally
    //   171	177	164	finally
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFf1lSDK.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */