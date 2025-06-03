package R2;

import A2.n;
import java.net.URL;
import java.util.Map;

public final class k2
  implements Runnable
{
  public final URL o;
  public final byte[] p;
  public final e2 q;
  public final String r;
  public final Map s;
  
  public k2(f2 paramf2, String paramString, URL paramURL, byte[] paramArrayOfByte, Map paramMap, e2 parame2)
  {
    n.e(paramString);
    n.i(paramURL);
    n.i(parame2);
    o = paramURL;
    p = paramArrayOfByte;
    q = parame2;
    r = paramString;
    s = paramMap;
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 22	R2/k2:t	LR2/f2;
    //   4: invokevirtual 54	R2/m3:l	()V
    //   7: aconst_null
    //   8: astore_1
    //   9: aconst_null
    //   10: astore_2
    //   11: aload_0
    //   12: getfield 37	R2/k2:o	Ljava/net/URL;
    //   15: astore_3
    //   16: invokestatic 60	com/google/android/gms/internal/measurement/h0:a	()Lcom/google/android/gms/internal/measurement/h0;
    //   19: aload_3
    //   20: ldc 62
    //   22: invokevirtual 66	com/google/android/gms/internal/measurement/h0:b	(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URLConnection;
    //   25: astore_3
    //   26: aload_3
    //   27: instanceof 68
    //   30: ifeq +418 -> 448
    //   33: aload_3
    //   34: checkcast 68	java/net/HttpURLConnection
    //   37: astore_3
    //   38: aload_3
    //   39: iconst_0
    //   40: invokevirtual 74	java/net/URLConnection:setDefaultUseCaches	(Z)V
    //   43: aload_3
    //   44: ldc 75
    //   46: invokevirtual 79	java/net/URLConnection:setConnectTimeout	(I)V
    //   49: aload_3
    //   50: ldc 80
    //   52: invokevirtual 83	java/net/URLConnection:setReadTimeout	(I)V
    //   55: aload_3
    //   56: iconst_0
    //   57: invokevirtual 86	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   60: aload_3
    //   61: iconst_1
    //   62: invokevirtual 89	java/net/URLConnection:setDoInput	(Z)V
    //   65: aload_0
    //   66: getfield 45	R2/k2:s	Ljava/util/Map;
    //   69: astore 4
    //   71: aload 4
    //   73: ifnull +102 -> 175
    //   76: aload 4
    //   78: invokeinterface 95 1 0
    //   83: invokeinterface 101 1 0
    //   88: astore 4
    //   90: aload 4
    //   92: invokeinterface 107 1 0
    //   97: ifeq +78 -> 175
    //   100: aload 4
    //   102: invokeinterface 111 1 0
    //   107: checkcast 113	java/util/Map$Entry
    //   110: astore 5
    //   112: aload_3
    //   113: aload 5
    //   115: invokeinterface 116 1 0
    //   120: checkcast 118	java/lang/String
    //   123: aload 5
    //   125: invokeinterface 121 1 0
    //   130: checkcast 118	java/lang/String
    //   133: invokevirtual 125	java/net/URLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   136: goto -46 -> 90
    //   139: astore 4
    //   141: aconst_null
    //   142: astore 6
    //   144: iconst_0
    //   145: istore 7
    //   147: aload_3
    //   148: astore 5
    //   150: aload 6
    //   152: astore_3
    //   153: goto +307 -> 460
    //   156: astore 4
    //   158: aload_3
    //   159: astore_2
    //   160: aconst_null
    //   161: astore_3
    //   162: iconst_0
    //   163: istore 7
    //   165: aload 4
    //   167: astore 5
    //   169: aload_1
    //   170: astore 4
    //   172: goto +367 -> 539
    //   175: aload_0
    //   176: getfield 39	R2/k2:p	[B
    //   179: ifnull +125 -> 304
    //   182: aload_0
    //   183: getfield 22	R2/k2:t	LR2/f2;
    //   186: invokevirtual 130	R2/z5:o	()LR2/N5;
    //   189: aload_0
    //   190: getfield 39	R2/k2:p	[B
    //   193: invokevirtual 136	R2/N5:g0	([B)[B
    //   196: astore 5
    //   198: aload_0
    //   199: getfield 22	R2/k2:t	LR2/f2;
    //   202: invokevirtual 140	R2/m3:j	()LR2/Y1;
    //   205: invokevirtual 146	R2/Y1:K	()LR2/a2;
    //   208: ldc -108
    //   210: aload 5
    //   212: arraylength
    //   213: invokestatic 154	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   216: invokevirtual 159	R2/a2:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   219: aload_3
    //   220: iconst_1
    //   221: invokevirtual 162	java/net/URLConnection:setDoOutput	(Z)V
    //   224: aload_3
    //   225: ldc -92
    //   227: ldc -90
    //   229: invokevirtual 125	java/net/URLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   232: aload_3
    //   233: aload 5
    //   235: arraylength
    //   236: invokevirtual 169	java/net/HttpURLConnection:setFixedLengthStreamingMode	(I)V
    //   239: aload_3
    //   240: invokevirtual 172	java/net/URLConnection:connect	()V
    //   243: aload_3
    //   244: invokevirtual 176	java/net/URLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   247: astore 4
    //   249: aload 4
    //   251: aload 5
    //   253: invokevirtual 182	java/io/OutputStream:write	([B)V
    //   256: aload 4
    //   258: invokevirtual 185	java/io/OutputStream:close	()V
    //   261: goto +43 -> 304
    //   264: astore 5
    //   266: aconst_null
    //   267: astore 6
    //   269: iconst_0
    //   270: istore 7
    //   272: aload 4
    //   274: astore_2
    //   275: aload 5
    //   277: astore 4
    //   279: aload_3
    //   280: astore 5
    //   282: aload 6
    //   284: astore_3
    //   285: goto +175 -> 460
    //   288: astore 5
    //   290: aconst_null
    //   291: astore 6
    //   293: iconst_0
    //   294: istore 7
    //   296: aload_3
    //   297: astore_2
    //   298: aload 6
    //   300: astore_3
    //   301: goto +238 -> 539
    //   304: aload_3
    //   305: invokevirtual 189	java/net/HttpURLConnection:getResponseCode	()I
    //   308: istore 7
    //   310: aload_3
    //   311: invokevirtual 193	java/net/URLConnection:getHeaderFields	()Ljava/util/Map;
    //   314: astore 4
    //   316: aload_0
    //   317: getfield 22	R2/k2:t	LR2/f2;
    //   320: aload_3
    //   321: invokestatic 199	R2/f2:y	(LR2/f2;Ljava/net/HttpURLConnection;)[B
    //   324: astore 5
    //   326: aload_3
    //   327: invokevirtual 202	java/net/HttpURLConnection:disconnect	()V
    //   330: aload_0
    //   331: getfield 22	R2/k2:t	LR2/f2;
    //   334: invokevirtual 205	R2/m3:e	()LR2/G2;
    //   337: astore_3
    //   338: new 207	R2/i2
    //   341: dup
    //   342: aload_0
    //   343: getfield 43	R2/k2:r	Ljava/lang/String;
    //   346: aload_0
    //   347: getfield 41	R2/k2:q	LR2/e2;
    //   350: iload 7
    //   352: aconst_null
    //   353: aload 5
    //   355: aload 4
    //   357: aconst_null
    //   358: invokespecial 210	R2/i2:<init>	(Ljava/lang/String;LR2/e2;ILjava/lang/Throwable;[BLjava/util/Map;LR2/g2;)V
    //   361: astore 4
    //   363: aload_3
    //   364: aload 4
    //   366: invokevirtual 216	R2/G2:D	(Ljava/lang/Runnable;)V
    //   369: return
    //   370: astore 5
    //   372: aload 4
    //   374: astore 6
    //   376: aload 5
    //   378: astore 4
    //   380: aload_3
    //   381: astore 5
    //   383: aload 6
    //   385: astore_3
    //   386: goto +74 -> 460
    //   389: astore 6
    //   391: aload 4
    //   393: astore 5
    //   395: aload_3
    //   396: astore_2
    //   397: aload 6
    //   399: astore 4
    //   401: aload 5
    //   403: astore_3
    //   404: goto -239 -> 165
    //   407: astore 4
    //   409: aconst_null
    //   410: astore 6
    //   412: aload_3
    //   413: astore 5
    //   415: aload 6
    //   417: astore_3
    //   418: goto +42 -> 460
    //   421: astore 4
    //   423: aconst_null
    //   424: astore 5
    //   426: aload_3
    //   427: astore_2
    //   428: aload 5
    //   430: astore_3
    //   431: goto -266 -> 165
    //   434: astore 4
    //   436: aconst_null
    //   437: astore_3
    //   438: goto -297 -> 141
    //   441: astore 4
    //   443: aconst_null
    //   444: astore_2
    //   445: goto -285 -> 160
    //   448: new 49	java/io/IOException
    //   451: astore_3
    //   452: aload_3
    //   453: ldc -38
    //   455: invokespecial 221	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   458: aload_3
    //   459: athrow
    //   460: aload_2
    //   461: ifnull +34 -> 495
    //   464: aload_2
    //   465: invokevirtual 185	java/io/OutputStream:close	()V
    //   468: goto +27 -> 495
    //   471: astore_2
    //   472: aload_0
    //   473: getfield 22	R2/k2:t	LR2/f2;
    //   476: invokevirtual 140	R2/m3:j	()LR2/Y1;
    //   479: invokevirtual 224	R2/Y1:G	()LR2/a2;
    //   482: ldc -30
    //   484: aload_0
    //   485: getfield 43	R2/k2:r	Ljava/lang/String;
    //   488: invokestatic 230	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   491: aload_2
    //   492: invokevirtual 234	R2/a2:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   495: aload 5
    //   497: ifnull +8 -> 505
    //   500: aload 5
    //   502: invokevirtual 202	java/net/HttpURLConnection:disconnect	()V
    //   505: aload_0
    //   506: getfield 22	R2/k2:t	LR2/f2;
    //   509: invokevirtual 205	R2/m3:e	()LR2/G2;
    //   512: new 207	R2/i2
    //   515: dup
    //   516: aload_0
    //   517: getfield 43	R2/k2:r	Ljava/lang/String;
    //   520: aload_0
    //   521: getfield 41	R2/k2:q	LR2/e2;
    //   524: iload 7
    //   526: aconst_null
    //   527: aconst_null
    //   528: aload_3
    //   529: aconst_null
    //   530: invokespecial 210	R2/i2:<init>	(Ljava/lang/String;LR2/e2;ILjava/lang/Throwable;[BLjava/util/Map;LR2/g2;)V
    //   533: invokevirtual 216	R2/G2:D	(Ljava/lang/Runnable;)V
    //   536: aload 4
    //   538: athrow
    //   539: aload 4
    //   541: ifnull +37 -> 578
    //   544: aload 4
    //   546: invokevirtual 185	java/io/OutputStream:close	()V
    //   549: goto +29 -> 578
    //   552: astore 4
    //   554: aload_0
    //   555: getfield 22	R2/k2:t	LR2/f2;
    //   558: invokevirtual 140	R2/m3:j	()LR2/Y1;
    //   561: invokevirtual 224	R2/Y1:G	()LR2/a2;
    //   564: ldc -30
    //   566: aload_0
    //   567: getfield 43	R2/k2:r	Ljava/lang/String;
    //   570: invokestatic 230	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   573: aload 4
    //   575: invokevirtual 234	R2/a2:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   578: aload_2
    //   579: ifnull +7 -> 586
    //   582: aload_2
    //   583: invokevirtual 202	java/net/HttpURLConnection:disconnect	()V
    //   586: aload_0
    //   587: getfield 22	R2/k2:t	LR2/f2;
    //   590: invokevirtual 205	R2/m3:e	()LR2/G2;
    //   593: astore 4
    //   595: new 207	R2/i2
    //   598: dup
    //   599: aload_0
    //   600: getfield 43	R2/k2:r	Ljava/lang/String;
    //   603: aload_0
    //   604: getfield 41	R2/k2:q	LR2/e2;
    //   607: iload 7
    //   609: aload 5
    //   611: aconst_null
    //   612: aload_3
    //   613: aconst_null
    //   614: invokespecial 210	R2/i2:<init>	(Ljava/lang/String;LR2/e2;ILjava/lang/Throwable;[BLjava/util/Map;LR2/g2;)V
    //   617: astore_2
    //   618: aload 4
    //   620: astore_3
    //   621: aload_2
    //   622: astore 4
    //   624: goto -261 -> 363
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	627	0	this	k2
    //   8	162	1	localObject1	Object
    //   10	455	2	localObject2	Object
    //   471	112	2	localIOException1	java.io.IOException
    //   617	5	2	locali2	i2
    //   15	606	3	localObject3	Object
    //   69	32	4	localObject4	Object
    //   139	1	4	localObject5	Object
    //   156	10	4	localIOException2	java.io.IOException
    //   170	230	4	localObject6	Object
    //   407	1	4	localObject7	Object
    //   421	1	4	localIOException3	java.io.IOException
    //   434	1	4	localObject8	Object
    //   441	104	4	localIOException4	java.io.IOException
    //   552	22	4	localIOException5	java.io.IOException
    //   593	30	4	localObject9	Object
    //   110	142	5	localObject10	Object
    //   264	12	5	localObject11	Object
    //   280	1	5	localObject12	Object
    //   288	1	5	localIOException6	java.io.IOException
    //   324	30	5	arrayOfByte	byte[]
    //   370	7	5	localObject13	Object
    //   381	229	5	localObject14	Object
    //   142	242	6	localObject15	Object
    //   389	9	6	localIOException7	java.io.IOException
    //   410	6	6	localObject16	Object
    //   145	463	7	i	int
    // Exception table:
    //   from	to	target	type
    //   65	71	139	finally
    //   76	90	139	finally
    //   90	136	139	finally
    //   175	249	139	finally
    //   304	310	139	finally
    //   65	71	156	java/io/IOException
    //   76	90	156	java/io/IOException
    //   90	136	156	java/io/IOException
    //   175	249	156	java/io/IOException
    //   304	310	156	java/io/IOException
    //   249	261	264	finally
    //   249	261	288	java/io/IOException
    //   316	326	370	finally
    //   316	326	389	java/io/IOException
    //   310	316	407	finally
    //   310	316	421	java/io/IOException
    //   11	65	434	finally
    //   448	460	434	finally
    //   11	65	441	java/io/IOException
    //   448	460	441	java/io/IOException
    //   464	468	471	java/io/IOException
    //   544	549	552	java/io/IOException
  }
}

/* Location:
 * Qualified Name:     R2.k2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */