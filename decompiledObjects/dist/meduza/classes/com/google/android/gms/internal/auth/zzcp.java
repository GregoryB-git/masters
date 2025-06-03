package com.google.android.gms.internal.auth;

public final class zzcp
{
  private static volatile zzdh zza;
  
  /* Error */
  public static zzdh zza(android.content.Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 20	com/google/android/gms/internal/auth/zzcp:zza	Lcom/google/android/gms/internal/auth/zzdh;
    //   6: astore_1
    //   7: aload_1
    //   8: astore_2
    //   9: aload_1
    //   10: ifnonnull +580 -> 590
    //   13: getstatic 26	android/os/Build:TYPE	Ljava/lang/String;
    //   16: astore_1
    //   17: getstatic 29	android/os/Build:TAGS	Ljava/lang/String;
    //   20: astore_2
    //   21: aload_1
    //   22: ldc 31
    //   24: invokevirtual 37	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   27: ifne +12 -> 39
    //   30: aload_1
    //   31: ldc 39
    //   33: invokevirtual 37	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   36: ifeq +24 -> 60
    //   39: aload_2
    //   40: ldc 41
    //   42: invokevirtual 45	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   45: ifne +22 -> 67
    //   48: aload_2
    //   49: ldc 47
    //   51: invokevirtual 45	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   54: ifeq +6 -> 60
    //   57: goto +10 -> 67
    //   60: invokestatic 53	com/google/android/gms/internal/auth/zzdh:zzc	()Lcom/google/android/gms/internal/auth/zzdh;
    //   63: astore_0
    //   64: goto +510 -> 574
    //   67: aload_0
    //   68: astore_2
    //   69: invokestatic 59	com/google/android/gms/internal/auth/zzcc:zzb	()Z
    //   72: ifeq +17 -> 89
    //   75: aload_0
    //   76: astore_2
    //   77: aload_0
    //   78: invokestatic 65	b0/f:q	(Landroid/content/Context;)Z
    //   81: ifne +8 -> 89
    //   84: aload_0
    //   85: invokestatic 71	a0/d:f	(Landroid/content/Context;)Landroid/content/Context;
    //   88: astore_2
    //   89: invokestatic 77	android/os/StrictMode:allowThreadDiskReads	()Landroid/os/StrictMode$ThreadPolicy;
    //   92: astore_3
    //   93: invokestatic 80	android/os/StrictMode:allowThreadDiskWrites	()Landroid/os/StrictMode$ThreadPolicy;
    //   96: pop
    //   97: new 82	java/io/File
    //   100: astore_0
    //   101: aload_0
    //   102: aload_2
    //   103: ldc 84
    //   105: iconst_0
    //   106: invokevirtual 90	android/content/Context:getDir	(Ljava/lang/String;I)Ljava/io/File;
    //   109: ldc 92
    //   111: invokespecial 95	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   114: aload_0
    //   115: invokevirtual 98	java/io/File:exists	()Z
    //   118: ifeq +11 -> 129
    //   121: aload_0
    //   122: invokestatic 102	com/google/android/gms/internal/auth/zzdh:zzd	(Ljava/lang/Object;)Lcom/google/android/gms/internal/auth/zzdh;
    //   125: astore_0
    //   126: goto +23 -> 149
    //   129: invokestatic 53	com/google/android/gms/internal/auth/zzdh:zzc	()Lcom/google/android/gms/internal/auth/zzdh;
    //   132: astore_0
    //   133: goto +16 -> 149
    //   136: astore_0
    //   137: ldc 104
    //   139: ldc 106
    //   141: aload_0
    //   142: invokestatic 112	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   145: pop
    //   146: goto -17 -> 129
    //   149: aload_0
    //   150: invokevirtual 113	com/google/android/gms/internal/auth/zzdh:zzb	()Z
    //   153: ifeq +410 -> 563
    //   156: aload_0
    //   157: invokevirtual 116	com/google/android/gms/internal/auth/zzdh:zza	()Ljava/lang/Object;
    //   160: astore 4
    //   162: new 118	java/io/BufferedReader
    //   165: astore 5
    //   167: new 120	java/io/InputStreamReader
    //   170: astore_1
    //   171: new 122	java/io/FileInputStream
    //   174: astore_0
    //   175: aload_0
    //   176: aload 4
    //   178: checkcast 82	java/io/File
    //   181: invokespecial 125	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   184: aload_1
    //   185: aload_0
    //   186: invokespecial 128	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   189: aload 5
    //   191: aload_1
    //   192: invokespecial 131	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   195: new 133	r/h
    //   198: astore 6
    //   200: aload 6
    //   202: invokespecial 134	r/h:<init>	()V
    //   205: new 136	java/util/HashMap
    //   208: astore 7
    //   210: aload 7
    //   212: invokespecial 137	java/util/HashMap:<init>	()V
    //   215: aload 5
    //   217: invokevirtual 141	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   220: astore_0
    //   221: aload_0
    //   222: ifnull +211 -> 433
    //   225: aload_0
    //   226: ldc -113
    //   228: iconst_3
    //   229: invokevirtual 147	java/lang/String:split	(Ljava/lang/String;I)[Ljava/lang/String;
    //   232: astore 8
    //   234: aload 8
    //   236: arraylength
    //   237: iconst_3
    //   238: if_icmpeq +37 -> 275
    //   241: new 149	java/lang/StringBuilder
    //   244: astore_1
    //   245: aload_1
    //   246: invokespecial 150	java/lang/StringBuilder:<init>	()V
    //   249: aload_1
    //   250: ldc -104
    //   252: invokevirtual 156	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   255: pop
    //   256: aload_1
    //   257: aload_0
    //   258: invokevirtual 156	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   261: pop
    //   262: ldc 104
    //   264: aload_1
    //   265: invokevirtual 159	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   268: invokestatic 162	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   271: pop
    //   272: goto -57 -> 215
    //   275: aload 8
    //   277: iconst_0
    //   278: aaload
    //   279: astore_0
    //   280: new 33	java/lang/String
    //   283: astore 9
    //   285: aload 9
    //   287: aload_0
    //   288: invokespecial 165	java/lang/String:<init>	(Ljava/lang/String;)V
    //   291: aload 8
    //   293: iconst_1
    //   294: aaload
    //   295: astore_0
    //   296: new 33	java/lang/String
    //   299: astore_1
    //   300: aload_1
    //   301: aload_0
    //   302: invokespecial 165	java/lang/String:<init>	(Ljava/lang/String;)V
    //   305: aload_1
    //   306: invokestatic 171	android/net/Uri:decode	(Ljava/lang/String;)Ljava/lang/String;
    //   309: astore 10
    //   311: aload 7
    //   313: aload 8
    //   315: iconst_2
    //   316: aaload
    //   317: invokevirtual 175	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   320: checkcast 33	java/lang/String
    //   323: astore_1
    //   324: aload_1
    //   325: astore_0
    //   326: aload_1
    //   327: ifnonnull +54 -> 381
    //   330: aload 8
    //   332: iconst_2
    //   333: aaload
    //   334: astore_0
    //   335: new 33	java/lang/String
    //   338: astore 8
    //   340: aload 8
    //   342: aload_0
    //   343: invokespecial 165	java/lang/String:<init>	(Ljava/lang/String;)V
    //   346: aload 8
    //   348: invokestatic 171	android/net/Uri:decode	(Ljava/lang/String;)Ljava/lang/String;
    //   351: astore_1
    //   352: aload_1
    //   353: invokevirtual 179	java/lang/String:length	()I
    //   356: sipush 1024
    //   359: if_icmplt +11 -> 370
    //   362: aload_1
    //   363: astore_0
    //   364: aload_1
    //   365: aload 8
    //   367: if_acmpne +14 -> 381
    //   370: aload 7
    //   372: aload 8
    //   374: aload_1
    //   375: invokevirtual 183	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   378: pop
    //   379: aload_1
    //   380: astore_0
    //   381: aload 6
    //   383: aload 9
    //   385: invokevirtual 186	r/h:containsKey	(Ljava/lang/Object;)Z
    //   388: ifne +20 -> 408
    //   391: new 133	r/h
    //   394: astore_1
    //   395: aload_1
    //   396: invokespecial 134	r/h:<init>	()V
    //   399: aload 6
    //   401: aload 9
    //   403: aload_1
    //   404: invokevirtual 187	r/h:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   407: pop
    //   408: aload 6
    //   410: aload 9
    //   412: aconst_null
    //   413: invokevirtual 190	r/h:getOrDefault	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   416: checkcast 133	r/h
    //   419: aload 10
    //   421: aload_0
    //   422: invokevirtual 187	r/h:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   425: pop
    //   426: goto -211 -> 215
    //   429: astore_0
    //   430: goto +81 -> 511
    //   433: aload 4
    //   435: invokevirtual 191	java/lang/Object:toString	()Ljava/lang/String;
    //   438: astore_0
    //   439: aload_2
    //   440: invokevirtual 194	android/content/Context:getPackageName	()Ljava/lang/String;
    //   443: astore_2
    //   444: new 149	java/lang/StringBuilder
    //   447: astore_1
    //   448: aload_1
    //   449: invokespecial 150	java/lang/StringBuilder:<init>	()V
    //   452: aload_1
    //   453: ldc -60
    //   455: invokevirtual 156	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   458: pop
    //   459: aload_1
    //   460: aload_0
    //   461: invokevirtual 156	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   464: pop
    //   465: aload_1
    //   466: ldc -58
    //   468: invokevirtual 156	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   471: pop
    //   472: aload_1
    //   473: aload_2
    //   474: invokevirtual 156	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   477: pop
    //   478: ldc 104
    //   480: aload_1
    //   481: invokevirtual 159	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   484: invokestatic 201	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   487: pop
    //   488: new 203	com/google/android/gms/internal/auth/zzci
    //   491: dup
    //   492: aload 6
    //   494: invokespecial 206	com/google/android/gms/internal/auth/zzci:<init>	(Lr/h;)V
    //   497: astore_0
    //   498: aload 5
    //   500: invokevirtual 209	java/io/BufferedReader:close	()V
    //   503: aload_0
    //   504: invokestatic 102	com/google/android/gms/internal/auth/zzdh:zzd	(Ljava/lang/Object;)Lcom/google/android/gms/internal/auth/zzdh;
    //   507: astore_0
    //   508: goto +59 -> 567
    //   511: aload 5
    //   513: invokevirtual 209	java/io/BufferedReader:close	()V
    //   516: goto +33 -> 549
    //   519: astore_2
    //   520: ldc -45
    //   522: ldc -43
    //   524: iconst_1
    //   525: anewarray 215	java/lang/Class
    //   528: dup
    //   529: iconst_0
    //   530: ldc -45
    //   532: aastore
    //   533: invokevirtual 219	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   536: aload_0
    //   537: iconst_1
    //   538: anewarray 4	java/lang/Object
    //   541: dup
    //   542: iconst_0
    //   543: aload_2
    //   544: aastore
    //   545: invokevirtual 225	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   548: pop
    //   549: aload_0
    //   550: athrow
    //   551: astore_0
    //   552: new 14	java/lang/RuntimeException
    //   555: astore_2
    //   556: aload_2
    //   557: aload_0
    //   558: invokespecial 228	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   561: aload_2
    //   562: athrow
    //   563: invokestatic 53	com/google/android/gms/internal/auth/zzdh:zzc	()Lcom/google/android/gms/internal/auth/zzdh;
    //   566: astore_0
    //   567: aload_3
    //   568: invokestatic 232	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   571: goto -507 -> 64
    //   574: aload_0
    //   575: putstatic 20	com/google/android/gms/internal/auth/zzcp:zza	Lcom/google/android/gms/internal/auth/zzdh;
    //   578: aload_0
    //   579: astore_2
    //   580: goto +10 -> 590
    //   583: astore_0
    //   584: aload_3
    //   585: invokestatic 232	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   588: aload_0
    //   589: athrow
    //   590: ldc 2
    //   592: monitorexit
    //   593: aload_2
    //   594: areturn
    //   595: astore_0
    //   596: ldc 2
    //   598: monitorexit
    //   599: aload_0
    //   600: athrow
    //   601: astore_2
    //   602: goto -53 -> 549
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	605	0	paramContext	android.content.Context
    //   6	475	1	localObject1	Object
    //   8	466	2	localObject2	Object
    //   519	25	2	localObject3	Object
    //   555	39	2	localObject4	Object
    //   601	1	2	localException	Exception
    //   92	493	3	localThreadPolicy	android.os.StrictMode.ThreadPolicy
    //   160	274	4	localObject5	Object
    //   165	347	5	localBufferedReader	java.io.BufferedReader
    //   198	295	6	localh	r.h
    //   208	163	7	localHashMap	java.util.HashMap
    //   232	141	8	localObject6	Object
    //   283	128	9	str1	String
    //   309	111	10	str2	String
    // Exception table:
    //   from	to	target	type
    //   97	114	136	java/lang/RuntimeException
    //   195	215	429	finally
    //   215	221	429	finally
    //   225	272	429	finally
    //   280	291	429	finally
    //   296	324	429	finally
    //   335	362	429	finally
    //   370	379	429	finally
    //   381	408	429	finally
    //   408	426	429	finally
    //   433	498	429	finally
    //   511	516	519	finally
    //   162	195	551	java/io/IOException
    //   498	503	551	java/io/IOException
    //   549	551	551	java/io/IOException
    //   93	97	583	finally
    //   97	114	583	finally
    //   114	126	583	finally
    //   129	133	583	finally
    //   137	146	583	finally
    //   149	162	583	finally
    //   162	195	583	finally
    //   498	503	583	finally
    //   503	508	583	finally
    //   520	549	583	finally
    //   549	551	583	finally
    //   552	563	583	finally
    //   563	567	583	finally
    //   3	7	595	finally
    //   13	39	595	finally
    //   39	57	595	finally
    //   60	64	595	finally
    //   69	75	595	finally
    //   77	89	595	finally
    //   89	93	595	finally
    //   567	571	595	finally
    //   574	578	595	finally
    //   584	590	595	finally
    //   590	593	595	finally
    //   596	599	595	finally
    //   520	549	601	java/lang/Exception
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzcp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */