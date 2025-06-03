package com.appsflyer.internal;

import android.os.BaseBundle;
import android.os.Bundle;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

@Deprecated
public final class AFa1uSDK
{
  private final AFe1jSDK valueOf;
  private final AFb1tSDK values;
  
  public AFa1uSDK() {}
  
  public AFa1uSDK(AFe1jSDK paramAFe1jSDK, AFb1tSDK paramAFb1tSDK)
  {
    valueOf = paramAFe1jSDK;
    values = paramAFb1tSDK;
  }
  
  /* Error */
  public final java.net.HttpURLConnection AFInAppEventParameterName(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: getfield 22	com/appsflyer/internal/AFa1uSDK:valueOf	Lcom/appsflyer/internal/AFe1jSDK;
    //   6: astore_3
    //   7: aload_3
    //   8: getfield 34	com/appsflyer/internal/AFa1qSDK:afRDLog	Ljava/lang/String;
    //   11: astore 4
    //   13: aload_3
    //   14: invokevirtual 37	com/appsflyer/internal/AFa1qSDK:valueOf	()Ljava/util/Map;
    //   17: invokestatic 43	com/appsflyer/internal/AFa1rSDK:AFInAppEventType	(Ljava/util/Map;)Lorg/json/JSONObject;
    //   20: invokevirtual 49	org/json/JSONObject:toString	()Ljava/lang/String;
    //   23: astore 5
    //   25: aload_0
    //   26: getfield 22	com/appsflyer/internal/AFa1uSDK:valueOf	Lcom/appsflyer/internal/AFe1jSDK;
    //   29: invokevirtual 55	com/appsflyer/internal/AFe1jSDK:getLevel	()Z
    //   32: istore 6
    //   34: aload_0
    //   35: getfield 22	com/appsflyer/internal/AFa1uSDK:valueOf	Lcom/appsflyer/internal/AFe1jSDK;
    //   38: invokevirtual 58	com/appsflyer/internal/AFe1jSDK:afErrorLogForExcManagerOnly	()Z
    //   41: istore 7
    //   43: aload_0
    //   44: getfield 22	com/appsflyer/internal/AFa1uSDK:valueOf	Lcom/appsflyer/internal/AFe1jSDK;
    //   47: invokevirtual 61	com/appsflyer/internal/AFe1jSDK:AFVersionDeclaration	()Z
    //   50: istore 8
    //   52: aload_0
    //   53: getfield 22	com/appsflyer/internal/AFa1uSDK:valueOf	Lcom/appsflyer/internal/AFe1jSDK;
    //   56: invokevirtual 63	com/appsflyer/internal/AFa1qSDK:values	()Z
    //   59: istore 9
    //   61: ldc 65
    //   63: astore_3
    //   64: aload 5
    //   66: invokestatic 71	java/nio/charset/Charset:defaultCharset	()Ljava/nio/charset/Charset;
    //   69: invokevirtual 77	java/lang/String:getBytes	(Ljava/nio/charset/Charset;)[B
    //   72: astore 10
    //   74: aconst_null
    //   75: astore 11
    //   77: iload 6
    //   79: ifeq +5 -> 84
    //   82: aconst_null
    //   83: areturn
    //   84: new 79	java/net/URL
    //   87: astore 12
    //   89: aload 12
    //   91: aload 4
    //   93: invokespecial 82	java/net/URL:<init>	(Ljava/lang/String;)V
    //   96: iload 8
    //   98: ifeq +131 -> 229
    //   101: aload_0
    //   102: getfield 24	com/appsflyer/internal/AFa1uSDK:values	Lcom/appsflyer/internal/AFb1tSDK;
    //   105: aload 12
    //   107: invokevirtual 83	java/lang/Object:toString	()Ljava/lang/String;
    //   110: aload 5
    //   112: invokeinterface 88 3 0
    //   117: aload 5
    //   119: invokestatic 71	java/nio/charset/Charset:defaultCharset	()Ljava/nio/charset/Charset;
    //   122: invokevirtual 77	java/lang/String:getBytes	(Ljava/nio/charset/Charset;)[B
    //   125: arraylength
    //   126: istore 13
    //   128: new 90	java/lang/StringBuilder
    //   131: astore 14
    //   133: aload 14
    //   135: ldc 92
    //   137: invokespecial 93	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   140: aload 14
    //   142: aload 12
    //   144: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   147: pop
    //   148: aload 14
    //   150: ldc 99
    //   152: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: pop
    //   156: aload 14
    //   158: iload 13
    //   160: invokevirtual 105	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   163: pop
    //   164: aload 14
    //   166: ldc 107
    //   168: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   171: pop
    //   172: iload 13
    //   174: iconst_1
    //   175: if_icmple +18 -> 193
    //   178: ldc 109
    //   180: astore 15
    //   182: goto +15 -> 197
    //   185: astore_1
    //   186: aload 11
    //   188: astore 15
    //   190: goto +472 -> 662
    //   193: ldc 65
    //   195: astore 15
    //   197: aload 14
    //   199: aload 15
    //   201: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: pop
    //   205: aload 14
    //   207: ldc 111
    //   209: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   212: pop
    //   213: aload 14
    //   215: aload 5
    //   217: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   220: pop
    //   221: aload 14
    //   223: invokevirtual 83	java/lang/Object:toString	()Ljava/lang/String;
    //   226: invokestatic 115	com/appsflyer/internal/AFa1aSDK:values	(Ljava/lang/String;)V
    //   229: ldc 117
    //   231: invokevirtual 121	java/lang/Object:hashCode	()I
    //   234: invokestatic 127	android/net/TrafficStats:setThreadStatsTag	(I)V
    //   237: aload 12
    //   239: invokevirtual 131	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   242: invokestatic 137	com/google/firebase/perf/network/FirebasePerfUrlConnection:instrument	(Ljava/lang/Object;)Ljava/lang/Object;
    //   245: checkcast 139	java/net/URLConnection
    //   248: checkcast 141	java/net/HttpURLConnection
    //   251: astore 14
    //   253: aload_3
    //   254: astore 15
    //   256: aload 14
    //   258: sipush 30000
    //   261: invokevirtual 144	java/net/URLConnection:setReadTimeout	(I)V
    //   264: aload_3
    //   265: astore 15
    //   267: aload 14
    //   269: sipush 30000
    //   272: invokevirtual 147	java/net/URLConnection:setConnectTimeout	(I)V
    //   275: aload_3
    //   276: astore 15
    //   278: aload 14
    //   280: ldc -107
    //   282: invokevirtual 152	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   285: aload_3
    //   286: astore 15
    //   288: aload 14
    //   290: iconst_1
    //   291: invokevirtual 156	java/net/URLConnection:setDoInput	(Z)V
    //   294: aload_3
    //   295: astore 15
    //   297: aload 14
    //   299: iconst_1
    //   300: invokevirtual 159	java/net/URLConnection:setDoOutput	(Z)V
    //   303: iload 9
    //   305: ifeq +21 -> 326
    //   308: ldc -95
    //   310: astore 11
    //   312: goto +18 -> 330
    //   315: astore_1
    //   316: aload 15
    //   318: astore_3
    //   319: aload 14
    //   321: astore 15
    //   323: goto +339 -> 662
    //   326: ldc -93
    //   328: astore 11
    //   330: aload_3
    //   331: astore 15
    //   333: aload 14
    //   335: ldc -91
    //   337: aload 11
    //   339: invokevirtual 168	java/net/URLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   342: aload_3
    //   343: astore 15
    //   345: aload 14
    //   347: invokevirtual 172	java/net/URLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   350: astore 5
    //   352: aload 10
    //   354: astore 11
    //   356: iload 9
    //   358: ifeq +185 -> 543
    //   361: invokestatic 178	android/media/AudioTrack:getMaxVolume	()F
    //   364: fconst_0
    //   365: fcmpl
    //   366: ldc -77
    //   368: iadd
    //   369: i2c
    //   370: iconst_0
    //   371: iconst_0
    //   372: invokestatic 185	android/graphics/drawable/Drawable:resolveOpacity	(II)I
    //   375: bipush 37
    //   377: iadd
    //   378: bipush 37
    //   380: invokestatic 190	android/view/ViewConfiguration:getScrollBarFadeDuration	()I
    //   383: bipush 16
    //   385: ishr
    //   386: isub
    //   387: invokestatic 195	com/appsflyer/internal/AFa1vSDK:AFInAppEventParameterName	(CII)Ljava/lang/Object;
    //   390: checkcast 197	java/lang/Class
    //   393: ldc -58
    //   395: iconst_1
    //   396: anewarray 197	java/lang/Class
    //   399: dup
    //   400: iconst_0
    //   401: ldc 73
    //   403: aastore
    //   404: invokevirtual 202	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   407: aconst_null
    //   408: iconst_1
    //   409: anewarray 4	java/lang/Object
    //   412: dup
    //   413: iconst_0
    //   414: aload_1
    //   415: aastore
    //   416: invokevirtual 208	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   419: astore_1
    //   420: invokestatic 211	android/view/ViewConfiguration:getMaximumDrawingCacheSize	()I
    //   423: bipush 24
    //   425: ishr
    //   426: ldc -44
    //   428: iadd
    //   429: i2c
    //   430: bipush 37
    //   432: invokestatic 217	android/os/Process:myPid	()I
    //   435: bipush 22
    //   437: ishr
    //   438: isub
    //   439: invokestatic 222	android/view/KeyEvent:getModifierMetaStateMask	()I
    //   442: i2b
    //   443: bipush 38
    //   445: iadd
    //   446: invokestatic 195	com/appsflyer/internal/AFa1vSDK:AFInAppEventParameterName	(CII)Ljava/lang/Object;
    //   449: checkcast 197	java/lang/Class
    //   452: ldc -58
    //   454: iconst_1
    //   455: anewarray 197	java/lang/Class
    //   458: dup
    //   459: iconst_0
    //   460: ldc -32
    //   462: aastore
    //   463: invokevirtual 227	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   466: aload_1
    //   467: iconst_1
    //   468: anewarray 4	java/lang/Object
    //   471: dup
    //   472: iconst_0
    //   473: aload 10
    //   475: aastore
    //   476: invokevirtual 208	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   479: checkcast 224	[B
    //   482: astore 11
    //   484: goto +59 -> 543
    //   487: astore 11
    //   489: aload_3
    //   490: astore 15
    //   492: aload 11
    //   494: invokevirtual 233	java/lang/Throwable:getCause	()Ljava/lang/Throwable;
    //   497: astore_1
    //   498: aload_1
    //   499: ifnull +12 -> 511
    //   502: aload_3
    //   503: astore 15
    //   505: aload_1
    //   506: athrow
    //   507: astore_1
    //   508: goto +48 -> 556
    //   511: aload_3
    //   512: astore 15
    //   514: aload 11
    //   516: athrow
    //   517: astore 11
    //   519: aload_3
    //   520: astore 15
    //   522: aload 11
    //   524: invokevirtual 233	java/lang/Throwable:getCause	()Ljava/lang/Throwable;
    //   527: astore_1
    //   528: aload_1
    //   529: ifnull +8 -> 537
    //   532: aload_3
    //   533: astore 15
    //   535: aload_1
    //   536: athrow
    //   537: aload_3
    //   538: astore 15
    //   540: aload 11
    //   542: athrow
    //   543: aload_3
    //   544: astore 15
    //   546: aload 5
    //   548: aload 11
    //   550: invokevirtual 239	java/io/OutputStream:write	([B)V
    //   553: goto +12 -> 565
    //   556: aload_3
    //   557: astore 15
    //   559: ldc -15
    //   561: aload_1
    //   562: invokestatic 246	com/appsflyer/AFLogger:afErrorLogForExcManagerOnly	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   565: aload_3
    //   566: astore 15
    //   568: aload 5
    //   570: invokevirtual 249	java/io/OutputStream:close	()V
    //   573: aload_3
    //   574: astore 15
    //   576: aload 14
    //   578: invokevirtual 252	java/net/URLConnection:connect	()V
    //   581: aload_3
    //   582: astore 15
    //   584: aload 14
    //   586: invokevirtual 255	java/net/HttpURLConnection:getResponseCode	()I
    //   589: istore 13
    //   591: aload_3
    //   592: astore_1
    //   593: iload 7
    //   595: ifeq +12 -> 607
    //   598: aload_3
    //   599: astore 15
    //   601: aload 14
    //   603: invokestatic 260	com/appsflyer/internal/AFa1eSDK:values	(Ljava/net/HttpURLConnection;)Ljava/lang/String;
    //   606: astore_1
    //   607: iload 8
    //   609: ifeq +23 -> 632
    //   612: aload_1
    //   613: astore 15
    //   615: aload_0
    //   616: getfield 24	com/appsflyer/internal/AFa1uSDK:values	Lcom/appsflyer/internal/AFb1tSDK;
    //   619: aload 12
    //   621: invokevirtual 83	java/lang/Object:toString	()Ljava/lang/String;
    //   624: iload 13
    //   626: aload_1
    //   627: invokeinterface 263 4 0
    //   632: iload 13
    //   634: sipush 200
    //   637: if_icmpne +15 -> 652
    //   640: aload_1
    //   641: astore 15
    //   643: ldc_w 265
    //   646: invokestatic 268	com/appsflyer/AFLogger:afInfoLog	(Ljava/lang/String;)V
    //   649: goto +36 -> 685
    //   652: iconst_1
    //   653: istore_2
    //   654: goto +31 -> 685
    //   657: astore_1
    //   658: aload 11
    //   660: astore 15
    //   662: ldc_w 270
    //   665: aload 4
    //   667: invokestatic 273	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   670: invokevirtual 277	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   673: aload_1
    //   674: invokestatic 280	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   677: iconst_1
    //   678: istore_2
    //   679: aload_3
    //   680: astore_1
    //   681: aload 15
    //   683: astore 14
    //   685: new 90	java/lang/StringBuilder
    //   688: dup
    //   689: ldc_w 282
    //   692: invokespecial 93	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   695: astore 15
    //   697: iload_2
    //   698: ifeq +10 -> 708
    //   701: ldc_w 284
    //   704: astore_3
    //   705: goto +7 -> 712
    //   708: ldc_w 286
    //   711: astore_3
    //   712: aload 15
    //   714: aload_3
    //   715: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   718: pop
    //   719: aload 15
    //   721: ldc_w 288
    //   724: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   727: pop
    //   728: aload 15
    //   730: aload_1
    //   731: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   734: pop
    //   735: aload 15
    //   737: invokevirtual 83	java/lang/Object:toString	()Ljava/lang/String;
    //   740: invokestatic 268	com/appsflyer/AFLogger:afInfoLog	(Ljava/lang/String;)V
    //   743: aload 14
    //   745: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	746	0	this	AFa1uSDK
    //   0	746	1	paramString	String
    //   1	697	2	i	int
    //   6	709	3	localObject1	Object
    //   11	655	4	str	String
    //   23	546	5	localObject2	Object
    //   32	46	6	bool1	boolean
    //   41	553	7	bool2	boolean
    //   50	558	8	bool3	boolean
    //   59	298	9	bool4	boolean
    //   72	402	10	arrayOfByte1	byte[]
    //   75	408	11	localObject3	Object
    //   487	28	11	localObject4	Object
    //   517	142	11	arrayOfByte2	byte[]
    //   87	533	12	localURL	java.net.URL
    //   126	512	13	j	int
    //   131	613	14	localObject5	Object
    //   180	556	15	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   101	172	185	finally
    //   197	229	185	finally
    //   256	264	315	finally
    //   267	275	315	finally
    //   278	285	315	finally
    //   288	294	315	finally
    //   297	303	315	finally
    //   333	342	315	finally
    //   345	352	315	finally
    //   492	498	315	finally
    //   505	507	315	finally
    //   514	517	315	finally
    //   522	528	315	finally
    //   535	537	315	finally
    //   540	543	315	finally
    //   546	553	315	finally
    //   559	565	315	finally
    //   568	573	315	finally
    //   576	581	315	finally
    //   584	591	315	finally
    //   601	607	315	finally
    //   615	632	315	finally
    //   643	649	315	finally
    //   420	484	487	finally
    //   492	498	507	java/lang/Exception
    //   505	507	507	java/lang/Exception
    //   514	517	507	java/lang/Exception
    //   522	528	507	java/lang/Exception
    //   535	537	507	java/lang/Exception
    //   540	543	507	java/lang/Exception
    //   546	553	507	java/lang/Exception
    //   361	420	517	finally
    //   84	96	657	finally
    //   229	253	657	finally
  }
  
  public static abstract interface AFa1zSDK
  {
    public abstract void AFKeystoreWrapper(String paramString);
    
    public abstract void valueOf(String paramString1, String paramString2, String paramString3);
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFa1uSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */