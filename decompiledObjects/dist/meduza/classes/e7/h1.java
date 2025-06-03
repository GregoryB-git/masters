package e7;

import java.net.URL;
import java.util.Map;
import m6.j;

public final class h1
  implements Runnable
{
  public final URL a;
  public final byte[] b;
  public final f1 c;
  public final String d;
  public final Map<String, String> e;
  
  public h1(String paramString, URL paramURL, byte[] paramArrayOfByte, Map<String, String> paramMap, f1 paramf1)
  {
    j.e(paramURL);
    j.i(paramArrayOfByte);
    a = paramArrayOfByte;
    b = paramMap;
    f1 localf1;
    c = localf1;
    d = paramURL;
    e = paramf1;
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 23	e7/h1:f	Le7/g1;
    //   4: getfield 56	d2/q:b	Ljava/lang/Object;
    //   7: checkcast 58	e7/j2
    //   10: invokevirtual 62	e7/j2:zzl	()Le7/e2;
    //   13: invokevirtual 67	e7/e2:x	()V
    //   16: iconst_0
    //   17: istore_1
    //   18: iconst_0
    //   19: istore_2
    //   20: iconst_0
    //   21: istore_3
    //   22: aconst_null
    //   23: astore 4
    //   25: aconst_null
    //   26: astore 5
    //   28: aconst_null
    //   29: astore 6
    //   31: aload_0
    //   32: getfield 37	e7/h1:a	Ljava/net/URL;
    //   35: astore 7
    //   37: invokestatic 73	com/google/android/gms/internal/measurement/zzda:zza	()Lcom/google/android/gms/internal/measurement/zzda;
    //   40: aload 7
    //   42: ldc 75
    //   44: invokevirtual 78	com/google/android/gms/internal/measurement/zzda:zza	(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URLConnection;
    //   47: astore 7
    //   49: aload 7
    //   51: instanceof 80
    //   54: ifeq +373 -> 427
    //   57: aload 7
    //   59: checkcast 80	java/net/HttpURLConnection
    //   62: astore 7
    //   64: aload 7
    //   66: iconst_0
    //   67: invokevirtual 86	java/net/URLConnection:setDefaultUseCaches	(Z)V
    //   70: aload 7
    //   72: ldc 87
    //   74: invokevirtual 91	java/net/URLConnection:setConnectTimeout	(I)V
    //   77: aload 7
    //   79: ldc 92
    //   81: invokevirtual 95	java/net/URLConnection:setReadTimeout	(I)V
    //   84: aload 7
    //   86: iconst_0
    //   87: invokevirtual 98	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   90: aload 7
    //   92: iconst_1
    //   93: invokevirtual 101	java/net/URLConnection:setDoInput	(Z)V
    //   96: aload_0
    //   97: getfield 45	e7/h1:e	Ljava/util/Map;
    //   100: astore 8
    //   102: aload 8
    //   104: ifnull +67 -> 171
    //   107: aload 8
    //   109: invokeinterface 107 1 0
    //   114: invokeinterface 113 1 0
    //   119: astore 8
    //   121: aload 8
    //   123: invokeinterface 119 1 0
    //   128: ifeq +43 -> 171
    //   131: aload 8
    //   133: invokeinterface 123 1 0
    //   138: checkcast 125	java/util/Map$Entry
    //   141: astore 9
    //   143: aload 7
    //   145: aload 9
    //   147: invokeinterface 128 1 0
    //   152: checkcast 130	java/lang/String
    //   155: aload 9
    //   157: invokeinterface 133 1 0
    //   162: checkcast 130	java/lang/String
    //   165: invokevirtual 137	java/net/URLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   168: goto -47 -> 121
    //   171: aload_0
    //   172: getfield 39	e7/h1:b	[B
    //   175: ifnull +135 -> 310
    //   178: aload_0
    //   179: getfield 23	e7/h1:f	Le7/g1;
    //   182: invokevirtual 143	e7/z5:m	()Le7/o6;
    //   185: aload_0
    //   186: getfield 39	e7/h1:b	[B
    //   189: invokevirtual 149	e7/o6:V	([B)[B
    //   192: astore 9
    //   194: aload_0
    //   195: getfield 23	e7/h1:f	Le7/g1;
    //   198: invokevirtual 153	d2/q:zzj	()Le7/a1;
    //   201: getfield 159	e7/a1:w	Le7/b1;
    //   204: ldc -95
    //   206: aload 9
    //   208: arraylength
    //   209: invokestatic 167	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   212: invokevirtual 172	e7/b1:c	(Ljava/lang/String;Ljava/lang/Object;)V
    //   215: aload 7
    //   217: iconst_1
    //   218: invokevirtual 175	java/net/URLConnection:setDoOutput	(Z)V
    //   221: aload 7
    //   223: ldc -79
    //   225: ldc -77
    //   227: invokevirtual 137	java/net/URLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   230: aload 7
    //   232: aload 9
    //   234: arraylength
    //   235: invokevirtual 182	java/net/HttpURLConnection:setFixedLengthStreamingMode	(I)V
    //   238: aload 7
    //   240: invokevirtual 185	java/net/URLConnection:connect	()V
    //   243: aload 7
    //   245: invokevirtual 189	java/net/URLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   248: astore 8
    //   250: aload 8
    //   252: aload 9
    //   254: invokevirtual 195	java/io/OutputStream:write	([B)V
    //   257: aload 8
    //   259: invokevirtual 198	java/io/OutputStream:close	()V
    //   262: goto +48 -> 310
    //   265: astore 6
    //   267: aload 8
    //   269: astore 9
    //   271: iconst_0
    //   272: istore_2
    //   273: aload 6
    //   275: astore 8
    //   277: aload 9
    //   279: astore 6
    //   281: goto +168 -> 449
    //   284: astore 5
    //   286: iconst_0
    //   287: istore_2
    //   288: aconst_null
    //   289: astore 4
    //   291: aload 8
    //   293: astore 9
    //   295: aload 7
    //   297: astore 6
    //   299: aload 5
    //   301: astore 7
    //   303: aload 4
    //   305: astore 8
    //   307: goto +252 -> 559
    //   310: aload 7
    //   312: invokevirtual 202	java/net/HttpURLConnection:getResponseCode	()I
    //   315: istore_2
    //   316: aload 7
    //   318: invokevirtual 206	java/net/URLConnection:getHeaderFields	()Ljava/util/Map;
    //   321: astore 9
    //   323: aload 7
    //   325: invokestatic 212	e7/g1:t	(Ljava/net/HttpURLConnection;)[B
    //   328: astore 8
    //   330: aload 7
    //   332: invokevirtual 215	java/net/HttpURLConnection:disconnect	()V
    //   335: aload_0
    //   336: getfield 23	e7/h1:f	Le7/g1;
    //   339: invokevirtual 216	d2/q:zzl	()Le7/e2;
    //   342: astore 7
    //   344: new 218	e7/i1
    //   347: dup
    //   348: aload_0
    //   349: getfield 43	e7/h1:d	Ljava/lang/String;
    //   352: aload_0
    //   353: getfield 41	e7/h1:c	Le7/f1;
    //   356: iload_2
    //   357: aconst_null
    //   358: aload 8
    //   360: aload 9
    //   362: invokespecial 221	e7/i1:<init>	(Ljava/lang/String;Le7/f1;ILjava/io/IOException;[BLjava/util/Map;)V
    //   365: astore 8
    //   367: goto +277 -> 644
    //   370: astore 8
    //   372: aload 4
    //   374: astore 6
    //   376: goto +76 -> 452
    //   379: astore 8
    //   381: aload 7
    //   383: astore 6
    //   385: aload 9
    //   387: astore 7
    //   389: goto +154 -> 543
    //   392: astore 8
    //   394: goto +12 -> 406
    //   397: astore 8
    //   399: goto +14 -> 413
    //   402: astore 8
    //   404: iload_3
    //   405: istore_2
    //   406: goto +43 -> 449
    //   409: astore 8
    //   411: iload_1
    //   412: istore_2
    //   413: aconst_null
    //   414: astore 9
    //   416: aload 7
    //   418: astore 6
    //   420: aload 9
    //   422: astore 7
    //   424: goto +119 -> 543
    //   427: new 51	java/io/IOException
    //   430: astore 7
    //   432: aload 7
    //   434: ldc -33
    //   436: invokespecial 225	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   439: aload 7
    //   441: athrow
    //   442: astore 8
    //   444: iconst_0
    //   445: istore_2
    //   446: aconst_null
    //   447: astore 7
    //   449: aconst_null
    //   450: astore 9
    //   452: aload 6
    //   454: ifnull +37 -> 491
    //   457: aload 6
    //   459: invokevirtual 198	java/io/OutputStream:close	()V
    //   462: goto +29 -> 491
    //   465: astore 6
    //   467: aload_0
    //   468: getfield 23	e7/h1:f	Le7/g1;
    //   471: invokevirtual 153	d2/q:zzj	()Le7/a1;
    //   474: getfield 228	e7/a1:o	Le7/b1;
    //   477: ldc -26
    //   479: aload_0
    //   480: getfield 43	e7/h1:d	Ljava/lang/String;
    //   483: invokestatic 234	e7/a1:p	(Ljava/lang/String;)Le7/e1;
    //   486: aload 6
    //   488: invokevirtual 237	e7/b1:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   491: aload 7
    //   493: ifnull +8 -> 501
    //   496: aload 7
    //   498: invokevirtual 215	java/net/HttpURLConnection:disconnect	()V
    //   501: aload_0
    //   502: getfield 23	e7/h1:f	Le7/g1;
    //   505: invokevirtual 216	d2/q:zzl	()Le7/e2;
    //   508: new 218	e7/i1
    //   511: dup
    //   512: aload_0
    //   513: getfield 43	e7/h1:d	Ljava/lang/String;
    //   516: aload_0
    //   517: getfield 41	e7/h1:c	Le7/f1;
    //   520: iload_2
    //   521: aconst_null
    //   522: aconst_null
    //   523: aload 9
    //   525: invokespecial 221	e7/i1:<init>	(Ljava/lang/String;Le7/f1;ILjava/io/IOException;[BLjava/util/Map;)V
    //   528: invokevirtual 241	e7/e2:u	(Ljava/lang/Runnable;)V
    //   531: aload 8
    //   533: athrow
    //   534: astore 8
    //   536: aconst_null
    //   537: astore 6
    //   539: aload 6
    //   541: astore 7
    //   543: aload 8
    //   545: astore 9
    //   547: aload 7
    //   549: astore 8
    //   551: aload 9
    //   553: astore 7
    //   555: aload 5
    //   557: astore 9
    //   559: aload 9
    //   561: ifnull +37 -> 598
    //   564: aload 9
    //   566: invokevirtual 198	java/io/OutputStream:close	()V
    //   569: goto +29 -> 598
    //   572: astore 9
    //   574: aload_0
    //   575: getfield 23	e7/h1:f	Le7/g1;
    //   578: invokevirtual 153	d2/q:zzj	()Le7/a1;
    //   581: getfield 228	e7/a1:o	Le7/b1;
    //   584: ldc -26
    //   586: aload_0
    //   587: getfield 43	e7/h1:d	Ljava/lang/String;
    //   590: invokestatic 234	e7/a1:p	(Ljava/lang/String;)Le7/e1;
    //   593: aload 9
    //   595: invokevirtual 237	e7/b1:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   598: aload 6
    //   600: ifnull +8 -> 608
    //   603: aload 6
    //   605: invokevirtual 215	java/net/HttpURLConnection:disconnect	()V
    //   608: aload_0
    //   609: getfield 23	e7/h1:f	Le7/g1;
    //   612: invokevirtual 216	d2/q:zzl	()Le7/e2;
    //   615: astore 6
    //   617: new 218	e7/i1
    //   620: dup
    //   621: aload_0
    //   622: getfield 43	e7/h1:d	Ljava/lang/String;
    //   625: aload_0
    //   626: getfield 41	e7/h1:c	Le7/f1;
    //   629: iload_2
    //   630: aload 7
    //   632: aconst_null
    //   633: aload 8
    //   635: invokespecial 221	e7/i1:<init>	(Ljava/lang/String;Le7/f1;ILjava/io/IOException;[BLjava/util/Map;)V
    //   638: astore 8
    //   640: aload 6
    //   642: astore 7
    //   644: aload 7
    //   646: aload 8
    //   648: invokevirtual 241	e7/e2:u	(Ljava/lang/Runnable;)V
    //   651: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	652	0	this	h1
    //   17	395	1	i	int
    //   19	611	2	j	int
    //   21	384	3	k	int
    //   23	350	4	localObject1	Object
    //   26	1	5	localObject2	Object
    //   284	272	5	localIOException1	java.io.IOException
    //   29	1	6	localObject3	Object
    //   265	9	6	localObject4	Object
    //   279	179	6	localObject5	Object
    //   465	22	6	localIOException2	java.io.IOException
    //   537	104	6	locale2	e2
    //   35	610	7	localObject6	Object
    //   100	266	8	localObject7	Object
    //   370	1	8	localObject8	Object
    //   379	1	8	localIOException3	java.io.IOException
    //   392	1	8	localObject9	Object
    //   397	1	8	localIOException4	java.io.IOException
    //   402	1	8	localObject10	Object
    //   409	1	8	localIOException5	java.io.IOException
    //   442	90	8	localObject11	Object
    //   534	10	8	localIOException6	java.io.IOException
    //   549	98	8	localObject12	Object
    //   141	424	9	localObject13	Object
    //   572	22	9	localIOException7	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   250	262	265	finally
    //   250	262	284	java/io/IOException
    //   323	330	370	finally
    //   323	330	379	java/io/IOException
    //   316	323	392	finally
    //   316	323	397	java/io/IOException
    //   96	102	402	finally
    //   107	121	402	finally
    //   121	168	402	finally
    //   171	250	402	finally
    //   310	316	402	finally
    //   96	102	409	java/io/IOException
    //   107	121	409	java/io/IOException
    //   121	168	409	java/io/IOException
    //   171	250	409	java/io/IOException
    //   310	316	409	java/io/IOException
    //   31	96	442	finally
    //   427	442	442	finally
    //   457	462	465	java/io/IOException
    //   31	96	534	java/io/IOException
    //   427	442	534	java/io/IOException
    //   564	569	572	java/io/IOException
  }
}

/* Location:
 * Qualified Name:     e7.h1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */