package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;

public final class AFd1eSDK
  extends AFd1hSDK
{
  private static char[] AppsFlyer2dXConversionCallback = { 172, 188, 171, 184, 174 };
  private static boolean init = true;
  private static boolean onAppOpenAttributionNative = true;
  private static int onInstallConversionDataLoadedNative = 74;
  private static int onInstallConversionFailureNative = 0;
  private static int onResponseNative = 1;
  private final AFb1bSDK AFLogger$LogLevel;
  private final AFe1vSDK AFVersionDeclaration;
  private final String afWarnLog;
  private final AFb1gSDK getLevel;
  
  public AFd1eSDK(@NonNull String paramString, @NonNull AFc1xSDK paramAFc1xSDK)
  {
    super(new AFe1uSDK(initAFInAppEventType), paramAFc1xSDK, paramString);
    getLevel = paramAFc1xSDK.AFInAppEventParameterName();
    AFLogger$LogLevel = paramAFc1xSDK.init();
    afWarnLog = paramString;
    AFVersionDeclaration = paramAFc1xSDK.AFLogger();
  }
  
  private static void AFInAppEventParameterName(String arg0, String paramString2, int[] paramArrayOfInt, int paramInt, Object[] paramArrayOfObject)
  {
    Object localObject = paramString2;
    if (paramString2 != null) {
      localObject = paramString2.toCharArray();
    }
    localObject = (char[])localObject;
    paramString2 = ???;
    if (??? != null) {
      paramString2 = ???.getBytes("ISO-8859-1");
    }
    byte[] arrayOfByte = (byte[])paramString2;
    int i;
    int j;
    int k;
    int m;
    synchronized (AFg1tSDK.AFKeystoreWrapper)
    {
      paramString2 = AppsFlyer2dXConversionCallback;
      i = onInstallConversionDataLoadedNative;
      if (init)
      {
        j = arrayOfByte.length;
        AFg1tSDK.values = j;
        paramArrayOfInt = new char[j];
        AFg1tSDK.valueOf = 0;
        if (AFg1tSDK.valueOf < AFg1tSDK.values)
        {
          k = AFg1tSDK.valueOf;
          j = AFg1tSDK.values;
          m = AFg1tSDK.valueOf;
          paramArrayOfInt[k] = ((char)(char)(paramString2[(arrayOfByte[(j - 1 - m)] + paramInt)] - i));
          AFg1tSDK.valueOf = m + 1;
        }
      }
    }
  }
  
  private void AFVersionDeclaration()
  {
    onResponseNative = (onInstallConversionFailureNative + 27) % 128;
    afErrorLogForExcManagerOnly.values("sentRegisterRequestToAF", true);
    AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
    onResponseNative = (onInstallConversionFailureNative + 29) % 128;
  }
  
  public final boolean afInfoLog()
  {
    int i = onInstallConversionFailureNative;
    boolean bool = true;
    int j = i + 1;
    i = j % 128;
    onResponseNative = i;
    if (j % 2 != 0) {
      bool = false;
    }
    i += 115;
    onInstallConversionFailureNative = i % 128;
    if (i % 2 == 0) {
      return bool;
    }
    throw null;
  }
  
  /* Error */
  public final void valueOf(AFa1qSDK paramAFa1qSDK)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial 137	com/appsflyer/internal/AFd1hSDK:valueOf	(Lcom/appsflyer/internal/AFa1qSDK;)V
    //   5: aload_0
    //   6: getfield 67	com/appsflyer/internal/AFd1eSDK:AFLogger$LogLevel	Lcom/appsflyer/internal/AFb1bSDK;
    //   9: getfield 53	com/appsflyer/internal/AFb1bSDK:AFInAppEventType	Landroid/content/Context;
    //   12: astore_2
    //   13: invokestatic 142	com/appsflyer/internal/AFa1eSDK:valueOf	()Lcom/appsflyer/internal/AFa1eSDK;
    //   16: astore_3
    //   17: aload_2
    //   18: ifnull +508 -> 526
    //   21: aload_3
    //   22: invokevirtual 144	com/appsflyer/internal/AFa1eSDK:AFKeystoreWrapper	()Z
    //   25: ifne +483 -> 508
    //   28: aload_2
    //   29: invokevirtual 150	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   32: astore_3
    //   33: aload_2
    //   34: invokevirtual 154	android/content/Context:getPackageName	()Ljava/lang/String;
    //   37: astore 4
    //   39: aload_3
    //   40: aload 4
    //   42: iconst_0
    //   43: invokevirtual 160	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   46: astore 4
    //   48: aload_1
    //   49: ldc -94
    //   51: aload 4
    //   53: getfield 167	android/content/pm/PackageInfo:versionCode	I
    //   56: invokestatic 173	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   59: invokevirtual 178	com/appsflyer/internal/AFa1qSDK:AFKeystoreWrapper	(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFa1qSDK;
    //   62: pop
    //   63: aload_1
    //   64: ldc -76
    //   66: aload 4
    //   68: getfield 183	android/content/pm/PackageInfo:versionName	Ljava/lang/String;
    //   71: invokevirtual 178	com/appsflyer/internal/AFa1qSDK:AFKeystoreWrapper	(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFa1qSDK;
    //   74: pop
    //   75: aload_1
    //   76: ldc -71
    //   78: aload_3
    //   79: aload 4
    //   81: getfield 189	android/content/pm/PackageInfo:applicationInfo	Landroid/content/pm/ApplicationInfo;
    //   84: invokevirtual 193	android/content/pm/PackageManager:getApplicationLabel	(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
    //   87: invokeinterface 197 1 0
    //   92: invokevirtual 178	com/appsflyer/internal/AFa1qSDK:AFKeystoreWrapper	(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFa1qSDK;
    //   95: pop
    //   96: aload 4
    //   98: getfield 201	android/content/pm/PackageInfo:firstInstallTime	J
    //   101: lstore 5
    //   103: new 203	java/text/SimpleDateFormat
    //   106: astore_3
    //   107: aload_3
    //   108: ldc -51
    //   110: getstatic 211	java/util/Locale:US	Ljava/util/Locale;
    //   113: invokespecial 214	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;Ljava/util/Locale;)V
    //   116: aload_1
    //   117: ldc -40
    //   119: aload_3
    //   120: lload 5
    //   122: invokestatic 219	com/appsflyer/internal/AFa1eSDK:AFInAppEventType	(Ljava/text/SimpleDateFormat;J)Ljava/lang/String;
    //   125: invokevirtual 178	com/appsflyer/internal/AFa1qSDK:AFKeystoreWrapper	(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFa1qSDK;
    //   128: pop
    //   129: getstatic 111	com/appsflyer/internal/AFd1eSDK:onInstallConversionFailureNative	I
    //   132: bipush 85
    //   134: iadd
    //   135: sipush 128
    //   138: irem
    //   139: putstatic 113	com/appsflyer/internal/AFd1eSDK:onResponseNative	I
    //   142: goto +10 -> 152
    //   145: astore_3
    //   146: ldc -35
    //   148: aload_3
    //   149: invokestatic 225	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   152: aload_0
    //   153: getfield 75	com/appsflyer/internal/AFd1eSDK:AFVersionDeclaration	Lcom/appsflyer/internal/AFe1vSDK;
    //   156: aload_1
    //   157: invokevirtual 228	com/appsflyer/internal/AFa1qSDK:valueOf	()Ljava/util/Map;
    //   160: invokeinterface 233 2 0
    //   165: invokestatic 235	com/appsflyer/internal/AFa1eSDK:AFInAppEventParameterName	()Ljava/lang/String;
    //   168: astore_3
    //   169: aload_3
    //   170: ifnull +23 -> 193
    //   173: getstatic 113	com/appsflyer/internal/AFd1eSDK:onResponseNative	I
    //   176: iconst_5
    //   177: iadd
    //   178: sipush 128
    //   181: irem
    //   182: putstatic 111	com/appsflyer/internal/AFd1eSDK:onInstallConversionFailureNative	I
    //   185: aload_1
    //   186: ldc -19
    //   188: aload_3
    //   189: invokevirtual 178	com/appsflyer/internal/AFa1qSDK:AFKeystoreWrapper	(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFa1qSDK;
    //   192: pop
    //   193: aload_1
    //   194: ldc -17
    //   196: getstatic 244	android/os/Build:MODEL	Ljava/lang/String;
    //   199: invokevirtual 178	com/appsflyer/internal/AFa1qSDK:AFKeystoreWrapper	(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFa1qSDK;
    //   202: pop
    //   203: iconst_0
    //   204: iconst_0
    //   205: invokestatic 250	android/graphics/drawable/Drawable:resolveOpacity	(II)I
    //   208: istore 7
    //   210: iconst_1
    //   211: anewarray 252	java/lang/Object
    //   214: astore_3
    //   215: ldc -2
    //   217: aconst_null
    //   218: aconst_null
    //   219: bipush 127
    //   221: iload 7
    //   223: isub
    //   224: aload_3
    //   225: invokestatic 256	com/appsflyer/internal/AFd1eSDK:AFInAppEventParameterName	(Ljava/lang/String;Ljava/lang/String;[II[Ljava/lang/Object;)V
    //   228: aload_1
    //   229: aload_3
    //   230: iconst_0
    //   231: aaload
    //   232: checkcast 79	java/lang/String
    //   235: invokevirtual 259	java/lang/String:intern	()Ljava/lang/String;
    //   238: getstatic 262	android/os/Build:BRAND	Ljava/lang/String;
    //   241: invokevirtual 178	com/appsflyer/internal/AFa1qSDK:AFKeystoreWrapper	(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFa1qSDK;
    //   244: pop
    //   245: goto +11 -> 256
    //   248: astore_3
    //   249: ldc_w 264
    //   252: aload_3
    //   253: invokestatic 225	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   256: iconst_1
    //   257: invokestatic 270	com/appsflyer/AppsFlyerProperties:getInstance	()Lcom/appsflyer/AppsFlyerProperties;
    //   260: ldc_w 272
    //   263: iconst_0
    //   264: invokevirtual 276	com/appsflyer/AppsFlyerProperties:getBoolean	(Ljava/lang/String;Z)Z
    //   267: ixor
    //   268: ifeq +6 -> 274
    //   271: goto +14 -> 285
    //   274: aload_1
    //   275: ldc_w 272
    //   278: ldc_w 278
    //   281: invokevirtual 178	com/appsflyer/internal/AFa1qSDK:AFKeystoreWrapper	(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFa1qSDK;
    //   284: pop
    //   285: aload_2
    //   286: invokevirtual 282	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   289: invokestatic 287	com/appsflyer/internal/AFa1cSDK:AFInAppEventParameterName	(Landroid/content/ContentResolver;)Lcom/appsflyer/internal/AFc1uSDK$AFa1wSDK;
    //   292: astore_2
    //   293: aload_2
    //   294: ifnull +30 -> 324
    //   297: aload_1
    //   298: ldc_w 289
    //   301: aload_2
    //   302: getfield 293	com/appsflyer/internal/AFc1uSDK$AFa1wSDK:valueOf	Ljava/lang/String;
    //   305: invokevirtual 178	com/appsflyer/internal/AFa1qSDK:AFKeystoreWrapper	(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFa1qSDK;
    //   308: pop
    //   309: aload_1
    //   310: ldc_w 295
    //   313: aload_2
    //   314: getfield 298	com/appsflyer/internal/AFc1uSDK$AFa1wSDK:AFInAppEventType	Ljava/lang/Boolean;
    //   317: invokestatic 301	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   320: invokevirtual 178	com/appsflyer/internal/AFa1qSDK:AFKeystoreWrapper	(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFa1qSDK;
    //   323: pop
    //   324: invokestatic 270	com/appsflyer/AppsFlyerProperties:getInstance	()Lcom/appsflyer/AppsFlyerProperties;
    //   327: ldc_w 303
    //   330: invokevirtual 307	com/appsflyer/AppsFlyerProperties:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   333: astore_2
    //   334: aload_2
    //   335: ifnull +41 -> 376
    //   338: getstatic 111	com/appsflyer/internal/AFd1eSDK:onInstallConversionFailureNative	I
    //   341: bipush 27
    //   343: iadd
    //   344: istore 7
    //   346: iload 7
    //   348: sipush 128
    //   351: irem
    //   352: putstatic 113	com/appsflyer/internal/AFd1eSDK:onResponseNative	I
    //   355: aload_1
    //   356: ldc_w 303
    //   359: aload_2
    //   360: invokevirtual 178	com/appsflyer/internal/AFa1qSDK:AFKeystoreWrapper	(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFa1qSDK;
    //   363: pop
    //   364: iload 7
    //   366: iconst_2
    //   367: irem
    //   368: ifeq +6 -> 374
    //   371: goto +5 -> 376
    //   374: aconst_null
    //   375: athrow
    //   376: aload_1
    //   377: ldc_w 309
    //   380: aload_0
    //   381: getfield 314	com/appsflyer/internal/AFd1oSDK:afDebugLog	Lcom/appsflyer/internal/AFe1wSDK;
    //   384: getfield 318	com/appsflyer/internal/AFe1wSDK:AFInAppEventParameterName	Ljava/lang/String;
    //   387: invokevirtual 178	com/appsflyer/internal/AFa1qSDK:AFKeystoreWrapper	(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFa1qSDK;
    //   390: pop
    //   391: aload_1
    //   392: ldc_w 320
    //   395: aload_0
    //   396: getfield 67	com/appsflyer/internal/AFd1eSDK:AFLogger$LogLevel	Lcom/appsflyer/internal/AFb1bSDK;
    //   399: aload_0
    //   400: getfield 117	com/appsflyer/internal/AFd1hSDK:afErrorLogForExcManagerOnly	Lcom/appsflyer/internal/AFb1dSDK;
    //   403: invokestatic 325	com/appsflyer/internal/AFb1zSDK:valueOf	(Lcom/appsflyer/internal/AFb1bSDK;Lcom/appsflyer/internal/AFb1dSDK;)Ljava/lang/String;
    //   406: invokevirtual 178	com/appsflyer/internal/AFa1qSDK:AFKeystoreWrapper	(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFa1qSDK;
    //   409: pop
    //   410: aload_1
    //   411: ldc_w 327
    //   414: aload_0
    //   415: getfield 69	com/appsflyer/internal/AFd1eSDK:afWarnLog	Ljava/lang/String;
    //   418: invokevirtual 178	com/appsflyer/internal/AFa1qSDK:AFKeystoreWrapper	(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFa1qSDK;
    //   421: pop
    //   422: aload_1
    //   423: ldc_w 329
    //   426: aload_0
    //   427: getfield 117	com/appsflyer/internal/AFd1hSDK:afErrorLogForExcManagerOnly	Lcom/appsflyer/internal/AFb1dSDK;
    //   430: ldc_w 331
    //   433: iconst_0
    //   434: invokeinterface 334 3 0
    //   439: invokestatic 173	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   442: invokevirtual 178	com/appsflyer/internal/AFa1qSDK:AFKeystoreWrapper	(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFa1qSDK;
    //   445: pop
    //   446: aload_1
    //   447: ldc_w 336
    //   450: getstatic 341	android/os/Build$VERSION:SDK_INT	I
    //   453: invokestatic 173	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   456: invokevirtual 178	com/appsflyer/internal/AFa1qSDK:AFKeystoreWrapper	(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFa1qSDK;
    //   459: pop
    //   460: aload_0
    //   461: getfield 65	com/appsflyer/internal/AFd1eSDK:getLevel	Lcom/appsflyer/internal/AFb1gSDK;
    //   464: invokevirtual 345	com/appsflyer/internal/AFb1gSDK:values	()Ljava/lang/String;
    //   467: astore_2
    //   468: aload_2
    //   469: ifnull +12 -> 481
    //   472: aload_1
    //   473: ldc_w 347
    //   476: aload_2
    //   477: invokevirtual 178	com/appsflyer/internal/AFa1qSDK:AFKeystoreWrapper	(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFa1qSDK;
    //   480: pop
    //   481: getstatic 113	com/appsflyer/internal/AFd1eSDK:onResponseNative	I
    //   484: bipush 101
    //   486: iadd
    //   487: istore 7
    //   489: iload 7
    //   491: sipush 128
    //   494: irem
    //   495: putstatic 111	com/appsflyer/internal/AFd1eSDK:onInstallConversionFailureNative	I
    //   498: iload 7
    //   500: iconst_2
    //   501: irem
    //   502: ifne +4 -> 506
    //   505: return
    //   506: aconst_null
    //   507: athrow
    //   508: ldc_w 349
    //   511: iconst_1
    //   512: invokestatic 351	com/appsflyer/AFLogger:afInfoLog	(Ljava/lang/String;Z)V
    //   515: new 353	java/lang/IllegalStateException
    //   518: dup
    //   519: ldc_w 355
    //   522: invokespecial 357	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   525: athrow
    //   526: new 353	java/lang/IllegalStateException
    //   529: dup
    //   530: ldc_w 359
    //   533: invokespecial 357	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   536: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	537	0	this	AFd1eSDK
    //   0	537	1	paramAFa1qSDK	AFa1qSDK
    //   12	465	2	localObject1	Object
    //   16	104	3	localObject2	Object
    //   145	4	3	localThrowable1	Throwable
    //   168	62	3	localObject3	Object
    //   248	5	3	localThrowable2	Throwable
    //   37	60	4	localObject4	Object
    //   101	20	5	l	long
    //   208	294	7	i	int
    // Exception table:
    //   from	to	target	type
    //   39	129	145	finally
    //   193	245	248	finally
  }
  
  public final void values()
  {
    onResponseNative = (onInstallConversionFailureNative + 97) % 128;
    super.values();
    AFc1gSDK localAFc1gSDK = afErrorLog;
    if (localAFc1gSDK != null)
    {
      onResponseNative = (onInstallConversionFailureNative + 111) % 128;
      if (localAFc1gSDK.isSuccessful())
      {
        onResponseNative = (onInstallConversionFailureNative + 91) % 128;
        AFVersionDeclaration();
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFd1eSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */