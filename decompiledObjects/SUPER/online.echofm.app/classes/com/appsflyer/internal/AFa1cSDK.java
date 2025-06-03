package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class AFa1cSDK
{
  static Boolean valueOf;
  static String values;
  public final String[] AFInAppEventType;
  
  public AFa1cSDK() {}
  
  public AFa1cSDK(String... paramVarArgs)
  {
    if ((paramVarArgs != null) && (paramVarArgs.length != 0))
    {
      Pattern localPattern = Pattern.compile("[\\w]{1,45}");
      ArrayList localArrayList = new ArrayList();
      int i = paramVarArgs.length;
      for (int j = 0; j < i; j++)
      {
        String str = paramVarArgs[j];
        if ((str != null) && (localPattern.matcher(str).matches())) {
          localArrayList.add(str.toLowerCase(Locale.getDefault()));
        } else {
          AFLogger.afWarnLog("Invalid partner name: ".concat(String.valueOf(str)));
        }
      }
      if (localArrayList.contains("all"))
      {
        AFInAppEventType = new String[] { "all" };
        return;
      }
      if (!localArrayList.isEmpty())
      {
        AFInAppEventType = ((String[])localArrayList.toArray(new String[0]));
        return;
      }
      AFInAppEventType = null;
      return;
    }
    AFInAppEventType = null;
  }
  
  /* Error */
  public static AFc1uSDK.AFa1wSDK AFInAppEventParameterName(android.content.ContentResolver paramContentResolver)
  {
    // Byte code:
    //   0: invokestatic 89	com/appsflyer/internal/AFa1cSDK:AFInAppEventType	()Z
    //   3: istore_1
    //   4: aconst_null
    //   5: astore_2
    //   6: iload_1
    //   7: ifne +5 -> 12
    //   10: aconst_null
    //   11: areturn
    //   12: aload_0
    //   13: ifnonnull +5 -> 18
    //   16: aconst_null
    //   17: areturn
    //   18: aload_2
    //   19: astore_3
    //   20: invokestatic 95	com/appsflyer/AppsFlyerProperties:getInstance	()Lcom/appsflyer/AppsFlyerProperties;
    //   23: ldc 97
    //   25: invokevirtual 100	com/appsflyer/AppsFlyerProperties:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   28: ifnonnull +93 -> 121
    //   31: aload_2
    //   32: astore_3
    //   33: ldc 102
    //   35: getstatic 107	android/os/Build:MANUFACTURER	Ljava/lang/String;
    //   38: invokevirtual 110	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   41: ifeq +80 -> 121
    //   44: aload_0
    //   45: ldc 112
    //   47: iconst_2
    //   48: invokestatic 118	android/provider/Settings$Secure:getInt	(Landroid/content/ContentResolver;Ljava/lang/String;I)I
    //   51: istore 4
    //   53: iload 4
    //   55: ifne +23 -> 78
    //   58: new 120	com/appsflyer/internal/AFc1uSDK$AFa1wSDK
    //   61: dup
    //   62: aload_0
    //   63: ldc 122
    //   65: invokestatic 125	android/provider/Settings$Secure:getString	(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;
    //   68: getstatic 130	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   71: invokespecial 133	com/appsflyer/internal/AFc1uSDK$AFa1wSDK:<init>	(Ljava/lang/String;Ljava/lang/Boolean;)V
    //   74: astore_3
    //   75: goto +46 -> 121
    //   78: iload 4
    //   80: iconst_2
    //   81: if_icmpne +8 -> 89
    //   84: aload_2
    //   85: astore_3
    //   86: goto +35 -> 121
    //   89: aload_0
    //   90: ldc 122
    //   92: invokestatic 125	android/provider/Settings$Secure:getString	(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;
    //   95: astore_0
    //   96: goto +13 -> 109
    //   99: astore_0
    //   100: ldc -121
    //   102: aload_0
    //   103: invokestatic 139	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   106: ldc -115
    //   108: astore_0
    //   109: new 120	com/appsflyer/internal/AFc1uSDK$AFa1wSDK
    //   112: dup
    //   113: aload_0
    //   114: getstatic 144	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   117: invokespecial 133	com/appsflyer/internal/AFc1uSDK$AFa1wSDK:<init>	(Ljava/lang/String;Ljava/lang/Boolean;)V
    //   120: astore_3
    //   121: aload_3
    //   122: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	123	0	paramContentResolver	android.content.ContentResolver
    //   3	4	1	bool	boolean
    //   5	80	2	localObject1	Object
    //   19	103	3	localObject2	Object
    //   51	31	4	i	int
    // Exception table:
    //   from	to	target	type
    //   89	96	99	finally
  }
  
  private static boolean AFInAppEventType()
  {
    Boolean localBoolean = valueOf;
    return (localBoolean == null) || (localBoolean.booleanValue());
  }
  
  /* Error */
  public static AFc1uSDK.AFa1wSDK values(android.content.Context paramContext)
  {
    // Byte code:
    //   0: invokestatic 95	com/appsflyer/AppsFlyerProperties:getInstance	()Lcom/appsflyer/AppsFlyerProperties;
    //   3: astore_1
    //   4: getstatic 152	com/appsflyer/internal/AFa1cSDK:values	Ljava/lang/String;
    //   7: astore_2
    //   8: aload_2
    //   9: ifnull +8 -> 17
    //   12: iconst_1
    //   13: istore_3
    //   14: goto +5 -> 19
    //   17: iconst_0
    //   18: istore_3
    //   19: iload_3
    //   20: ifeq +10 -> 30
    //   23: aload_2
    //   24: astore_0
    //   25: aconst_null
    //   26: astore_2
    //   27: goto +92 -> 119
    //   30: getstatic 146	com/appsflyer/internal/AFa1cSDK:valueOf	Ljava/lang/Boolean;
    //   33: astore_2
    //   34: aload_2
    //   35: ifnull +10 -> 45
    //   38: aload_2
    //   39: invokevirtual 149	java/lang/Boolean:booleanValue	()Z
    //   42: ifne +19 -> 61
    //   45: getstatic 146	com/appsflyer/internal/AFa1cSDK:valueOf	Ljava/lang/Boolean;
    //   48: ifnonnull +67 -> 115
    //   51: aload_1
    //   52: ldc -102
    //   54: iconst_1
    //   55: invokevirtual 158	com/appsflyer/AppsFlyerProperties:getBoolean	(Ljava/lang/String;Z)Z
    //   58: ifeq +57 -> 115
    //   61: new 160	com/appsflyer/oaid/OaidClient
    //   64: astore_2
    //   65: aload_2
    //   66: aload_0
    //   67: invokespecial 163	com/appsflyer/oaid/OaidClient:<init>	(Landroid/content/Context;)V
    //   70: aload_2
    //   71: aload_1
    //   72: invokevirtual 166	com/appsflyer/AppsFlyerProperties:isEnableLog	()Z
    //   75: invokevirtual 170	com/appsflyer/oaid/OaidClient:setLogging	(Z)V
    //   78: aload_2
    //   79: invokevirtual 174	com/appsflyer/oaid/OaidClient:fetch	()Lcom/appsflyer/oaid/OaidClient$Info;
    //   82: astore_2
    //   83: aload_2
    //   84: ifnull +31 -> 115
    //   87: aload_2
    //   88: invokevirtual 180	com/appsflyer/oaid/OaidClient$Info:getId	()Ljava/lang/String;
    //   91: astore_0
    //   92: aload_2
    //   93: invokevirtual 184	com/appsflyer/oaid/OaidClient$Info:getLat	()Ljava/lang/Boolean;
    //   96: astore_2
    //   97: goto +22 -> 119
    //   100: astore_2
    //   101: goto +6 -> 107
    //   104: astore_0
    //   105: aconst_null
    //   106: astore_0
    //   107: ldc -70
    //   109: invokestatic 189	com/appsflyer/AFLogger:afDebugLog	(Ljava/lang/String;)V
    //   112: goto -87 -> 25
    //   115: aconst_null
    //   116: astore_2
    //   117: aload_2
    //   118: astore_0
    //   119: aload_0
    //   120: ifnull +23 -> 143
    //   123: new 120	com/appsflyer/internal/AFc1uSDK$AFa1wSDK
    //   126: dup
    //   127: aload_0
    //   128: aload_2
    //   129: invokespecial 133	com/appsflyer/internal/AFc1uSDK$AFa1wSDK:<init>	(Ljava/lang/String;Ljava/lang/Boolean;)V
    //   132: astore_0
    //   133: aload_0
    //   134: iload_3
    //   135: invokestatic 192	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   138: putfield 194	com/appsflyer/internal/AFc1uSDK$AFa1wSDK:values	Ljava/lang/Boolean;
    //   141: aload_0
    //   142: areturn
    //   143: aconst_null
    //   144: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	145	0	paramContext	android.content.Context
    //   3	69	1	localAppsFlyerProperties	com.appsflyer.AppsFlyerProperties
    //   7	90	2	localObject1	Object
    //   100	1	2	localObject2	Object
    //   116	13	2	localBoolean	Boolean
    //   13	122	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   92	97	100	finally
    //   61	83	104	finally
    //   87	92	104	finally
  }
  
  /* Error */
  public static AFc1uSDK.AFa1wSDK values(android.content.Context paramContext, java.util.Map<String, Object> paramMap)
  {
    // Byte code:
    //   0: invokestatic 89	com/appsflyer/internal/AFa1cSDK:AFInAppEventType	()Z
    //   3: istore_2
    //   4: aconst_null
    //   5: astore_3
    //   6: aconst_null
    //   7: astore 4
    //   9: iload_2
    //   10: ifne +5 -> 15
    //   13: aconst_null
    //   14: areturn
    //   15: ldc -59
    //   17: invokestatic 200	com/appsflyer/AFLogger:afInfoLog	(Ljava/lang/String;)V
    //   20: new 202	java/lang/StringBuilder
    //   23: dup
    //   24: invokespecial 203	java/lang/StringBuilder:<init>	()V
    //   27: astore 5
    //   29: invokestatic 209	x2/j:m	()Lx2/j;
    //   32: aload_0
    //   33: invokevirtual 213	x2/j:g	(Landroid/content/Context;)I
    //   36: istore 6
    //   38: goto +15 -> 53
    //   41: astore 7
    //   43: ldc -41
    //   45: aload 7
    //   47: invokestatic 218	com/appsflyer/AFLogger:afErrorLogForExcManagerOnly	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   50: iconst_m1
    //   51: istore 6
    //   53: aload_0
    //   54: invokestatic 224	s2/a:a	(Landroid/content/Context;)Ls2/a$a;
    //   57: astore 7
    //   59: aload 7
    //   61: ifnull +92 -> 153
    //   64: aload 7
    //   66: invokevirtual 228	s2/a$a:a	()Ljava/lang/String;
    //   69: astore 8
    //   71: aload 7
    //   73: invokevirtual 231	s2/a$a:b	()Z
    //   76: invokestatic 192	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   79: astore 7
    //   81: aload 8
    //   83: ifnull +30 -> 113
    //   86: aload 8
    //   88: invokevirtual 235	java/lang/String:length	()I
    //   91: ifne +30 -> 121
    //   94: goto +19 -> 113
    //   97: astore_3
    //   98: iconst_1
    //   99: istore_2
    //   100: aload 8
    //   102: astore 4
    //   104: aload_3
    //   105: astore 8
    //   107: aload 4
    //   109: astore_3
    //   110: goto +66 -> 176
    //   113: aload 5
    //   115: ldc -19
    //   117: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: pop
    //   121: iconst_1
    //   122: istore_2
    //   123: aload 7
    //   125: astore_3
    //   126: aload 8
    //   128: astore 7
    //   130: goto +277 -> 407
    //   133: astore_3
    //   134: iconst_0
    //   135: istore_2
    //   136: aload 4
    //   138: astore 7
    //   140: goto -40 -> 100
    //   143: astore 8
    //   145: iconst_0
    //   146: istore_2
    //   147: aconst_null
    //   148: astore 7
    //   150: goto +26 -> 176
    //   153: aload 5
    //   155: ldc -13
    //   157: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: pop
    //   161: new 245	java/lang/IllegalStateException
    //   164: astore 7
    //   166: aload 7
    //   168: ldc -9
    //   170: invokespecial 249	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   173: aload 7
    //   175: athrow
    //   176: new 202	java/lang/StringBuilder
    //   179: dup
    //   180: ldc -5
    //   182: invokespecial 252	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   185: astore 4
    //   187: aload 4
    //   189: aload 8
    //   191: invokevirtual 257	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   194: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   197: pop
    //   198: aload 4
    //   200: invokevirtual 260	java/lang/Object:toString	()Ljava/lang/String;
    //   203: aload 8
    //   205: invokestatic 139	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   208: aload 5
    //   210: aload 8
    //   212: invokevirtual 264	java/lang/Object:getClass	()Ljava/lang/Class;
    //   215: invokevirtual 269	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   218: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   221: pop
    //   222: aload 5
    //   224: ldc_w 271
    //   227: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   230: pop
    //   231: ldc_w 273
    //   234: invokestatic 200	com/appsflyer/AFLogger:afInfoLog	(Ljava/lang/String;)V
    //   237: invokestatic 95	com/appsflyer/AppsFlyerProperties:getInstance	()Lcom/appsflyer/AppsFlyerProperties;
    //   240: ldc_w 275
    //   243: iconst_1
    //   244: invokevirtual 158	com/appsflyer/AppsFlyerProperties:getBoolean	(Ljava/lang/String;Z)Z
    //   247: ifeq +150 -> 397
    //   250: aload_0
    //   251: invokestatic 280	com/appsflyer/internal/AFa1hSDK:AFInAppEventType	(Landroid/content/Context;)Lcom/appsflyer/internal/AFa1hSDK$AFa1ySDK;
    //   254: astore_3
    //   255: aload_3
    //   256: getfield 284	com/appsflyer/internal/AFa1hSDK$AFa1ySDK:valueOf	Ljava/lang/String;
    //   259: astore 7
    //   261: aload_3
    //   262: invokevirtual 285	com/appsflyer/internal/AFa1hSDK$AFa1ySDK:AFInAppEventType	()Z
    //   265: invokestatic 192	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   268: astore_3
    //   269: aload 7
    //   271: ifnull +18 -> 289
    //   274: aload 7
    //   276: invokevirtual 235	java/lang/String:length	()I
    //   279: ifne +19 -> 298
    //   282: goto +7 -> 289
    //   285: astore_3
    //   286: goto +15 -> 301
    //   289: aload 5
    //   291: ldc_w 287
    //   294: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   297: pop
    //   298: goto +109 -> 407
    //   301: aload_3
    //   302: invokevirtual 257	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   305: aload_3
    //   306: iconst_1
    //   307: iconst_0
    //   308: iconst_0
    //   309: invokestatic 290	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V
    //   312: aload 5
    //   314: aload_3
    //   315: invokevirtual 264	java/lang/Object:getClass	()Ljava/lang/Class;
    //   318: invokevirtual 269	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   321: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   324: pop
    //   325: aload 5
    //   327: ldc_w 271
    //   330: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   333: pop
    //   334: invokestatic 95	com/appsflyer/AppsFlyerProperties:getInstance	()Lcom/appsflyer/AppsFlyerProperties;
    //   337: ldc_w 292
    //   340: invokevirtual 100	com/appsflyer/AppsFlyerProperties:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   343: astore 7
    //   345: invokestatic 95	com/appsflyer/AppsFlyerProperties:getInstance	()Lcom/appsflyer/AppsFlyerProperties;
    //   348: ldc_w 294
    //   351: invokevirtual 100	com/appsflyer/AppsFlyerProperties:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   354: invokestatic 298	java/lang/Boolean:parseBoolean	(Ljava/lang/String;)Z
    //   357: istore 9
    //   359: aload_3
    //   360: invokevirtual 301	java/lang/Throwable:getLocalizedMessage	()Ljava/lang/String;
    //   363: ifnull +15 -> 378
    //   366: aload_3
    //   367: invokevirtual 301	java/lang/Throwable:getLocalizedMessage	()Ljava/lang/String;
    //   370: astore_3
    //   371: aload_3
    //   372: invokestatic 200	com/appsflyer/AFLogger:afInfoLog	(Ljava/lang/String;)V
    //   375: goto +11 -> 386
    //   378: aload_3
    //   379: invokevirtual 260	java/lang/Object:toString	()Ljava/lang/String;
    //   382: astore_3
    //   383: goto -12 -> 371
    //   386: iload 9
    //   388: iconst_1
    //   389: ixor
    //   390: invokestatic 192	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   393: astore_3
    //   394: goto +13 -> 407
    //   397: aload 7
    //   399: astore 8
    //   401: aload_3
    //   402: astore 7
    //   404: aload 8
    //   406: astore_3
    //   407: aload_0
    //   408: invokevirtual 264	java/lang/Object:getClass	()Ljava/lang/Class;
    //   411: invokevirtual 304	java/lang/Class:getName	()Ljava/lang/String;
    //   414: ldc_w 306
    //   417: invokevirtual 110	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   420: ifeq +41 -> 461
    //   423: invokestatic 95	com/appsflyer/AppsFlyerProperties:getInstance	()Lcom/appsflyer/AppsFlyerProperties;
    //   426: ldc_w 292
    //   429: invokevirtual 100	com/appsflyer/AppsFlyerProperties:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   432: astore 7
    //   434: invokestatic 95	com/appsflyer/AppsFlyerProperties:getInstance	()Lcom/appsflyer/AppsFlyerProperties;
    //   437: ldc_w 294
    //   440: invokevirtual 100	com/appsflyer/AppsFlyerProperties:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   443: invokestatic 298	java/lang/Boolean:parseBoolean	(Ljava/lang/String;)Z
    //   446: iconst_1
    //   447: ixor
    //   448: invokestatic 192	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   451: astore_3
    //   452: aload 5
    //   454: ldc_w 308
    //   457: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   460: pop
    //   461: aload 5
    //   463: invokevirtual 309	java/lang/StringBuilder:length	()I
    //   466: ifle +47 -> 513
    //   469: new 202	java/lang/StringBuilder
    //   472: dup
    //   473: invokespecial 203	java/lang/StringBuilder:<init>	()V
    //   476: astore_0
    //   477: aload_0
    //   478: iload 6
    //   480: invokevirtual 312	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   483: pop
    //   484: aload_0
    //   485: ldc_w 314
    //   488: invokevirtual 241	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   491: pop
    //   492: aload_0
    //   493: aload 5
    //   495: invokevirtual 317	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   498: pop
    //   499: aload_1
    //   500: ldc_w 319
    //   503: aload_0
    //   504: invokevirtual 260	java/lang/Object:toString	()Ljava/lang/String;
    //   507: invokeinterface 325 3 0
    //   512: pop
    //   513: aload 7
    //   515: ifnull +81 -> 596
    //   518: aload_3
    //   519: ifnull +77 -> 596
    //   522: aload_1
    //   523: ldc_w 292
    //   526: aload 7
    //   528: invokeinterface 325 3 0
    //   533: pop
    //   534: aload_1
    //   535: ldc_w 294
    //   538: aload_3
    //   539: invokevirtual 149	java/lang/Boolean:booleanValue	()Z
    //   542: iconst_1
    //   543: ixor
    //   544: invokestatic 328	java/lang/String:valueOf	(Z)Ljava/lang/String;
    //   547: invokeinterface 325 3 0
    //   552: pop
    //   553: invokestatic 95	com/appsflyer/AppsFlyerProperties:getInstance	()Lcom/appsflyer/AppsFlyerProperties;
    //   556: ldc_w 292
    //   559: aload 7
    //   561: invokevirtual 332	com/appsflyer/AppsFlyerProperties:set	(Ljava/lang/String;Ljava/lang/String;)V
    //   564: invokestatic 95	com/appsflyer/AppsFlyerProperties:getInstance	()Lcom/appsflyer/AppsFlyerProperties;
    //   567: ldc_w 294
    //   570: aload_3
    //   571: invokevirtual 149	java/lang/Boolean:booleanValue	()Z
    //   574: iconst_1
    //   575: ixor
    //   576: invokestatic 328	java/lang/String:valueOf	(Z)Ljava/lang/String;
    //   579: invokevirtual 332	com/appsflyer/AppsFlyerProperties:set	(Ljava/lang/String;Ljava/lang/String;)V
    //   582: aload_1
    //   583: ldc_w 334
    //   586: iload_2
    //   587: invokestatic 328	java/lang/String:valueOf	(Z)Ljava/lang/String;
    //   590: invokeinterface 325 3 0
    //   595: pop
    //   596: new 120	com/appsflyer/internal/AFc1uSDK$AFa1wSDK
    //   599: dup
    //   600: aload 7
    //   602: aload_3
    //   603: invokespecial 133	com/appsflyer/internal/AFc1uSDK$AFa1wSDK:<init>	(Ljava/lang/String;Ljava/lang/Boolean;)V
    //   606: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	607	0	paramContext	android.content.Context
    //   0	607	1	paramMap	java.util.Map<String, Object>
    //   3	584	2	bool1	boolean
    //   5	1	3	localObject1	Object
    //   97	8	3	localObject2	Object
    //   109	17	3	localObject3	Object
    //   133	1	3	localObject4	Object
    //   254	15	3	localObject5	Object
    //   285	82	3	localThrowable1	Throwable
    //   370	233	3	localObject6	Object
    //   7	192	4	localObject7	Object
    //   27	467	5	localStringBuilder	StringBuilder
    //   36	443	6	i	int
    //   41	5	7	localThrowable2	Throwable
    //   57	544	7	localObject8	Object
    //   69	58	8	localObject9	Object
    //   143	68	8	localThrowable3	Throwable
    //   399	6	8	localObject10	Object
    //   357	33	9	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   29	38	41	finally
    //   86	94	97	finally
    //   113	121	97	finally
    //   71	81	133	finally
    //   53	59	143	finally
    //   64	71	143	finally
    //   153	176	143	finally
    //   250	269	285	finally
    //   274	282	285	finally
    //   289	298	285	finally
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFa1cSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */