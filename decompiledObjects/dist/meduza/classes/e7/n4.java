package e7;

import d2.q;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import m6.j;

public final class n4
  implements Runnable
{
  public final URL a;
  public final byte[] b;
  public final k4 c;
  public final String d;
  public final Map<String, String> e;
  
  public n4(l4 paraml4, String paramString, URL paramURL, byte[] paramArrayOfByte, HashMap paramHashMap, k4 paramk4)
  {
    j.e(paramString);
    a = paramURL;
    b = paramArrayOfByte;
    c = paramk4;
    d = paramString;
    e = paramHashMap;
  }
  
  public final void a(int paramInt, IOException paramIOException, byte[] paramArrayOfByte, Map paramMap)
  {
    f.zzl().u(new m4(this, paramInt, paramIOException, paramArrayOfByte, paramMap));
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 23	e7/n4:f	Le7/l4;
    //   4: getfield 66	d2/q:b	Ljava/lang/Object;
    //   7: checkcast 68	e7/j2
    //   10: invokevirtual 69	e7/j2:zzl	()Le7/e2;
    //   13: invokevirtual 72	e7/e2:x	()V
    //   16: iconst_0
    //   17: istore_1
    //   18: iconst_0
    //   19: istore_2
    //   20: iconst_0
    //   21: istore_3
    //   22: iconst_0
    //   23: istore 4
    //   25: iconst_0
    //   26: istore 5
    //   28: iconst_0
    //   29: istore 6
    //   31: aload_0
    //   32: getfield 33	e7/n4:a	Ljava/net/URL;
    //   35: astore 7
    //   37: invokestatic 78	com/google/android/gms/internal/measurement/zzda:zza	()Lcom/google/android/gms/internal/measurement/zzda;
    //   40: aload 7
    //   42: ldc 80
    //   44: invokevirtual 83	com/google/android/gms/internal/measurement/zzda:zza	(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URLConnection;
    //   47: astore 7
    //   49: aload 7
    //   51: instanceof 85
    //   54: ifeq +551 -> 605
    //   57: aload 7
    //   59: checkcast 85	java/net/HttpURLConnection
    //   62: astore 7
    //   64: aload 7
    //   66: iconst_0
    //   67: invokevirtual 91	java/net/URLConnection:setDefaultUseCaches	(Z)V
    //   70: aload 7
    //   72: ldc 92
    //   74: invokevirtual 96	java/net/URLConnection:setConnectTimeout	(I)V
    //   77: aload 7
    //   79: ldc 97
    //   81: invokevirtual 100	java/net/URLConnection:setReadTimeout	(I)V
    //   84: aload 7
    //   86: iconst_0
    //   87: invokevirtual 103	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   90: aload 7
    //   92: iconst_1
    //   93: invokevirtual 106	java/net/URLConnection:setDoInput	(Z)V
    //   96: iload 6
    //   98: istore_2
    //   99: iload_1
    //   100: istore 4
    //   102: aload_0
    //   103: getfield 41	e7/n4:e	Ljava/util/Map;
    //   106: astore 8
    //   108: aload 8
    //   110: ifnull +91 -> 201
    //   113: iload 6
    //   115: istore_2
    //   116: iload_1
    //   117: istore 4
    //   119: aload 8
    //   121: invokeinterface 112 1 0
    //   126: invokeinterface 118 1 0
    //   131: astore 9
    //   133: iload 6
    //   135: istore_2
    //   136: iload_1
    //   137: istore 4
    //   139: aload 9
    //   141: invokeinterface 124 1 0
    //   146: ifeq +55 -> 201
    //   149: iload 6
    //   151: istore_2
    //   152: iload_1
    //   153: istore 4
    //   155: aload 9
    //   157: invokeinterface 128 1 0
    //   162: checkcast 130	java/util/Map$Entry
    //   165: astore 8
    //   167: iload 6
    //   169: istore_2
    //   170: iload_1
    //   171: istore 4
    //   173: aload 7
    //   175: aload 8
    //   177: invokeinterface 133 1 0
    //   182: checkcast 135	java/lang/String
    //   185: aload 8
    //   187: invokeinterface 138 1 0
    //   192: checkcast 135	java/lang/String
    //   195: invokevirtual 142	java/net/URLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   198: goto -65 -> 133
    //   201: iload 6
    //   203: istore_2
    //   204: iload_1
    //   205: istore 4
    //   207: aload_0
    //   208: getfield 35	e7/n4:b	[B
    //   211: astore 10
    //   213: aload 10
    //   215: ifnull +269 -> 484
    //   218: iload 6
    //   220: istore_2
    //   221: new 144	java/io/ByteArrayOutputStream
    //   224: astore 8
    //   226: iload 6
    //   228: istore_2
    //   229: aload 8
    //   231: invokespecial 145	java/io/ByteArrayOutputStream:<init>	()V
    //   234: iload 6
    //   236: istore_2
    //   237: new 147	java/util/zip/GZIPOutputStream
    //   240: astore 9
    //   242: iload 6
    //   244: istore_2
    //   245: aload 9
    //   247: aload 8
    //   249: invokespecial 150	java/util/zip/GZIPOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   252: iload 6
    //   254: istore_2
    //   255: aload 9
    //   257: aload 10
    //   259: invokevirtual 156	java/io/OutputStream:write	([B)V
    //   262: iload 6
    //   264: istore_2
    //   265: aload 9
    //   267: invokevirtual 159	java/io/OutputStream:close	()V
    //   270: iload 6
    //   272: istore_2
    //   273: aload 8
    //   275: invokevirtual 160	java/io/ByteArrayOutputStream:close	()V
    //   278: iload 6
    //   280: istore_2
    //   281: aload 8
    //   283: invokevirtual 164	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   286: astore 8
    //   288: iload 6
    //   290: istore_2
    //   291: iload_1
    //   292: istore 4
    //   294: aload_0
    //   295: getfield 23	e7/n4:f	Le7/l4;
    //   298: invokevirtual 168	d2/q:zzj	()Le7/a1;
    //   301: getfield 174	e7/a1:w	Le7/b1;
    //   304: ldc -80
    //   306: aload 8
    //   308: arraylength
    //   309: invokestatic 182	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   312: invokevirtual 187	e7/b1:c	(Ljava/lang/String;Ljava/lang/Object;)V
    //   315: iload 6
    //   317: istore_2
    //   318: iload_1
    //   319: istore 4
    //   321: aload 7
    //   323: iconst_1
    //   324: invokevirtual 190	java/net/URLConnection:setDoOutput	(Z)V
    //   327: iload 6
    //   329: istore_2
    //   330: iload_1
    //   331: istore 4
    //   333: aload 7
    //   335: ldc -64
    //   337: ldc -62
    //   339: invokevirtual 142	java/net/URLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   342: iload 6
    //   344: istore_2
    //   345: iload_1
    //   346: istore 4
    //   348: aload 7
    //   350: aload 8
    //   352: arraylength
    //   353: invokevirtual 197	java/net/HttpURLConnection:setFixedLengthStreamingMode	(I)V
    //   356: iload 6
    //   358: istore_2
    //   359: iload_1
    //   360: istore 4
    //   362: aload 7
    //   364: invokevirtual 200	java/net/URLConnection:connect	()V
    //   367: iload 6
    //   369: istore_2
    //   370: iload_1
    //   371: istore 4
    //   373: aload 7
    //   375: invokevirtual 204	java/net/URLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   378: astore 10
    //   380: aload 10
    //   382: aload 8
    //   384: invokevirtual 156	java/io/OutputStream:write	([B)V
    //   387: aload 10
    //   389: invokevirtual 159	java/io/OutputStream:close	()V
    //   392: goto +92 -> 484
    //   395: astore 11
    //   397: aconst_null
    //   398: astore 12
    //   400: iload_3
    //   401: istore 6
    //   403: aload 7
    //   405: astore 9
    //   407: aload 10
    //   409: astore 8
    //   411: aload 12
    //   413: astore 7
    //   415: aload 11
    //   417: astore 10
    //   419: goto +220 -> 639
    //   422: astore 11
    //   424: aconst_null
    //   425: astore 12
    //   427: iload 5
    //   429: istore 6
    //   431: aload 7
    //   433: astore 8
    //   435: aload 10
    //   437: astore 9
    //   439: aload 12
    //   441: astore 7
    //   443: aload 11
    //   445: astore 10
    //   447: goto +274 -> 721
    //   450: astore 8
    //   452: iload 6
    //   454: istore_2
    //   455: iload_1
    //   456: istore 4
    //   458: aload_0
    //   459: getfield 23	e7/n4:f	Le7/l4;
    //   462: invokevirtual 168	d2/q:zzj	()Le7/a1;
    //   465: getfield 207	e7/a1:o	Le7/b1;
    //   468: ldc -47
    //   470: aload 8
    //   472: invokevirtual 187	e7/b1:c	(Ljava/lang/String;Ljava/lang/Object;)V
    //   475: iload 6
    //   477: istore_2
    //   478: iload_1
    //   479: istore 4
    //   481: aload 8
    //   483: athrow
    //   484: iload 6
    //   486: istore_2
    //   487: iload_1
    //   488: istore 4
    //   490: aload 7
    //   492: invokevirtual 213	java/net/HttpURLConnection:getResponseCode	()I
    //   495: istore 6
    //   497: iload 6
    //   499: istore_2
    //   500: iload 6
    //   502: istore 4
    //   504: aload 7
    //   506: invokevirtual 217	java/net/URLConnection:getHeaderFields	()Ljava/util/Map;
    //   509: astore 8
    //   511: aload 7
    //   513: invokestatic 223	e7/l4:p	(Ljava/net/HttpURLConnection;)[B
    //   516: astore 9
    //   518: aload 7
    //   520: invokevirtual 226	java/net/HttpURLConnection:disconnect	()V
    //   523: aload_0
    //   524: iload 6
    //   526: aconst_null
    //   527: aload 9
    //   529: aload 8
    //   531: invokevirtual 228	e7/n4:a	(ILjava/io/IOException;[BLjava/util/Map;)V
    //   534: return
    //   535: astore 10
    //   537: aload 8
    //   539: astore 11
    //   541: aconst_null
    //   542: astore 8
    //   544: aload 7
    //   546: astore 9
    //   548: aload 11
    //   550: astore 7
    //   552: goto +87 -> 639
    //   555: astore 10
    //   557: aload 8
    //   559: astore 11
    //   561: aconst_null
    //   562: astore 9
    //   564: aload 7
    //   566: astore 8
    //   568: aload 11
    //   570: astore 7
    //   572: goto +149 -> 721
    //   575: astore 8
    //   577: aload 7
    //   579: astore 9
    //   581: aload 8
    //   583: astore 7
    //   585: goto +40 -> 625
    //   588: astore 9
    //   590: iload 4
    //   592: istore 6
    //   594: aload 7
    //   596: astore 8
    //   598: aload 9
    //   600: astore 7
    //   602: goto +108 -> 710
    //   605: new 63	java/io/IOException
    //   608: astore 7
    //   610: aload 7
    //   612: ldc -26
    //   614: invokespecial 232	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   617: aload 7
    //   619: athrow
    //   620: astore 7
    //   622: aconst_null
    //   623: astore 9
    //   625: aconst_null
    //   626: astore 8
    //   628: aload 7
    //   630: astore 10
    //   632: aload 8
    //   634: astore 7
    //   636: iload_2
    //   637: istore 6
    //   639: aload 8
    //   641: ifnull +37 -> 678
    //   644: aload 8
    //   646: invokevirtual 159	java/io/OutputStream:close	()V
    //   649: goto +29 -> 678
    //   652: astore 8
    //   654: aload_0
    //   655: getfield 23	e7/n4:f	Le7/l4;
    //   658: invokevirtual 168	d2/q:zzj	()Le7/a1;
    //   661: getfield 207	e7/a1:o	Le7/b1;
    //   664: ldc -22
    //   666: aload_0
    //   667: getfield 39	e7/n4:d	Ljava/lang/String;
    //   670: invokestatic 237	e7/a1:p	(Ljava/lang/String;)Le7/e1;
    //   673: aload 8
    //   675: invokevirtual 240	e7/b1:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   678: aload 9
    //   680: ifnull +8 -> 688
    //   683: aload 9
    //   685: invokevirtual 226	java/net/HttpURLConnection:disconnect	()V
    //   688: aload_0
    //   689: iload 6
    //   691: aconst_null
    //   692: aconst_null
    //   693: aload 7
    //   695: invokevirtual 228	e7/n4:a	(ILjava/io/IOException;[BLjava/util/Map;)V
    //   698: aload 10
    //   700: athrow
    //   701: astore 7
    //   703: aconst_null
    //   704: astore 8
    //   706: iload 4
    //   708: istore 6
    //   710: aconst_null
    //   711: astore 9
    //   713: aload 7
    //   715: astore 10
    //   717: aload 9
    //   719: astore 7
    //   721: aload 9
    //   723: ifnull +37 -> 760
    //   726: aload 9
    //   728: invokevirtual 159	java/io/OutputStream:close	()V
    //   731: goto +29 -> 760
    //   734: astore 9
    //   736: aload_0
    //   737: getfield 23	e7/n4:f	Le7/l4;
    //   740: invokevirtual 168	d2/q:zzj	()Le7/a1;
    //   743: getfield 207	e7/a1:o	Le7/b1;
    //   746: ldc -22
    //   748: aload_0
    //   749: getfield 39	e7/n4:d	Ljava/lang/String;
    //   752: invokestatic 237	e7/a1:p	(Ljava/lang/String;)Le7/e1;
    //   755: aload 9
    //   757: invokevirtual 240	e7/b1:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   760: aload 8
    //   762: ifnull +8 -> 770
    //   765: aload 8
    //   767: invokevirtual 226	java/net/HttpURLConnection:disconnect	()V
    //   770: aload_0
    //   771: iload 6
    //   773: aload 10
    //   775: aconst_null
    //   776: aload 7
    //   778: invokevirtual 228	e7/n4:a	(ILjava/io/IOException;[BLjava/util/Map;)V
    //   781: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	782	0	this	n4
    //   17	471	1	i	int
    //   19	618	2	j	int
    //   21	380	3	k	int
    //   23	684	4	m	int
    //   26	402	5	n	int
    //   29	743	6	i1	int
    //   35	583	7	localObject1	Object
    //   620	9	7	localObject2	Object
    //   634	60	7	localObject3	Object
    //   701	13	7	localIOException1	IOException
    //   719	58	7	localObject4	Object
    //   106	328	8	localObject5	Object
    //   450	32	8	localIOException2	IOException
    //   509	58	8	localObject6	Object
    //   575	7	8	localObject7	Object
    //   596	49	8	localObject8	Object
    //   652	22	8	localIOException3	IOException
    //   704	62	8	localObject9	Object
    //   131	449	9	localObject10	Object
    //   588	11	9	localIOException4	IOException
    //   623	104	9	localObject11	Object
    //   734	22	9	localIOException5	IOException
    //   211	235	10	localObject12	Object
    //   535	1	10	localObject13	Object
    //   555	1	10	localIOException6	IOException
    //   630	144	10	localObject14	Object
    //   395	21	11	localObject15	Object
    //   422	22	11	localIOException7	IOException
    //   539	30	11	localObject16	Object
    //   398	42	12	localObject17	Object
    // Exception table:
    //   from	to	target	type
    //   380	392	395	finally
    //   380	392	422	java/io/IOException
    //   221	226	450	java/io/IOException
    //   229	234	450	java/io/IOException
    //   237	242	450	java/io/IOException
    //   245	252	450	java/io/IOException
    //   255	262	450	java/io/IOException
    //   265	270	450	java/io/IOException
    //   273	278	450	java/io/IOException
    //   281	288	450	java/io/IOException
    //   511	518	535	finally
    //   511	518	555	java/io/IOException
    //   102	108	575	finally
    //   119	133	575	finally
    //   139	149	575	finally
    //   155	167	575	finally
    //   173	198	575	finally
    //   207	213	575	finally
    //   221	226	575	finally
    //   229	234	575	finally
    //   237	242	575	finally
    //   245	252	575	finally
    //   255	262	575	finally
    //   265	270	575	finally
    //   273	278	575	finally
    //   281	288	575	finally
    //   294	315	575	finally
    //   321	327	575	finally
    //   333	342	575	finally
    //   348	356	575	finally
    //   362	367	575	finally
    //   373	380	575	finally
    //   458	475	575	finally
    //   481	484	575	finally
    //   490	497	575	finally
    //   504	511	575	finally
    //   102	108	588	java/io/IOException
    //   119	133	588	java/io/IOException
    //   139	149	588	java/io/IOException
    //   155	167	588	java/io/IOException
    //   173	198	588	java/io/IOException
    //   207	213	588	java/io/IOException
    //   294	315	588	java/io/IOException
    //   321	327	588	java/io/IOException
    //   333	342	588	java/io/IOException
    //   348	356	588	java/io/IOException
    //   362	367	588	java/io/IOException
    //   373	380	588	java/io/IOException
    //   458	475	588	java/io/IOException
    //   481	484	588	java/io/IOException
    //   490	497	588	java/io/IOException
    //   504	511	588	java/io/IOException
    //   31	96	620	finally
    //   605	620	620	finally
    //   644	649	652	java/io/IOException
    //   31	96	701	java/io/IOException
    //   605	620	701	java/io/IOException
    //   726	731	734	java/io/IOException
  }
}

/* Location:
 * Qualified Name:     e7.n4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */