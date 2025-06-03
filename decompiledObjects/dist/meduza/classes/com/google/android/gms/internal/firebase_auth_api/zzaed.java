package com.google.android.gms.internal.firebase_auth_api;

import android.util.Log;
import java.util.List;

public final class zzaed
{
  private final int zza;
  
  private zzaed(String paramString)
  {
    zza = zza(paramString);
  }
  
  private static int zza(String paramString)
  {
    try
    {
      List localList = zzv.zza("[.-]").zza(paramString);
      if (localList.size() == 1) {
        return Integer.parseInt(paramString);
      }
      if (localList.size() >= 3)
      {
        int i = Integer.parseInt((String)localList.get(0));
        int j = Integer.parseInt((String)localList.get(1));
        int k = Integer.parseInt((String)localList.get(2));
        return j * 1000 + i * 1000000 + k;
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      if (Log.isLoggable("LibraryVersionContainer", 3)) {
        Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", new Object[] { paramString, localIllegalArgumentException }));
      }
    }
    return -1;
  }
  
  /* Error */
  public static com.google.android.gms.internal.firebase-auth-api.zzaed zza()
  {
    // Byte code:
    //   0: ldc 70
    //   2: astore_0
    //   3: getstatic 76	m6/f:c	Lm6/f;
    //   6: astore_1
    //   7: aload_1
    //   8: invokevirtual 80	java/lang/Object:getClass	()Ljava/lang/Class;
    //   11: pop
    //   12: ldc 82
    //   14: ldc 84
    //   16: invokestatic 90	m6/j:f	(Ljava/lang/String;Ljava/lang/String;)V
    //   19: aload_1
    //   20: getfield 94	m6/f:a	Ljava/util/concurrent/ConcurrentHashMap;
    //   23: ldc 84
    //   25: invokevirtual 100	java/util/concurrent/ConcurrentHashMap:containsKey	(Ljava/lang/Object;)Z
    //   28: ifeq +19 -> 47
    //   31: aload_1
    //   32: getfield 94	m6/f:a	Ljava/util/concurrent/ConcurrentHashMap;
    //   35: ldc 84
    //   37: invokevirtual 103	java/util/concurrent/ConcurrentHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   40: checkcast 46	java/lang/String
    //   43: astore_2
    //   44: goto +467 -> 511
    //   47: new 105	java/util/Properties
    //   50: dup
    //   51: invokespecial 106	java/util/Properties:<init>	()V
    //   54: astore_3
    //   55: aconst_null
    //   56: astore_2
    //   57: aconst_null
    //   58: astore 4
    //   60: aconst_null
    //   61: astore 5
    //   63: aconst_null
    //   64: astore 6
    //   66: ldc 72
    //   68: ldc 108
    //   70: iconst_1
    //   71: anewarray 4	java/lang/Object
    //   74: dup
    //   75: iconst_0
    //   76: ldc 84
    //   78: aastore
    //   79: invokestatic 61	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   82: invokevirtual 114	java/lang/Class:getResourceAsStream	(Ljava/lang/String;)Ljava/io/InputStream;
    //   85: astore 7
    //   87: aload 7
    //   89: ifnull +171 -> 260
    //   92: aload 6
    //   94: astore 4
    //   96: aload_3
    //   97: aload 7
    //   99: invokevirtual 118	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   102: aload 6
    //   104: astore 4
    //   106: aload_3
    //   107: ldc 120
    //   109: aconst_null
    //   110: invokevirtual 124	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   113: astore 6
    //   115: aload 6
    //   117: astore 4
    //   119: getstatic 128	m6/f:b	Lm6/d;
    //   122: astore 8
    //   124: aload 6
    //   126: astore 4
    //   128: new 130	java/lang/StringBuilder
    //   131: astore_2
    //   132: aload 6
    //   134: astore 4
    //   136: aload_2
    //   137: invokespecial 131	java/lang/StringBuilder:<init>	()V
    //   140: aload 6
    //   142: astore 4
    //   144: aload_2
    //   145: ldc 84
    //   147: invokevirtual 135	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: pop
    //   151: aload 6
    //   153: astore 4
    //   155: aload_2
    //   156: ldc -119
    //   158: invokevirtual 135	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: pop
    //   162: aload 6
    //   164: astore 4
    //   166: aload_2
    //   167: aload 6
    //   169: invokevirtual 135	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   172: pop
    //   173: aload 6
    //   175: astore 4
    //   177: aload_2
    //   178: invokevirtual 141	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   181: astore 5
    //   183: aload 6
    //   185: astore 4
    //   187: aload 6
    //   189: astore_2
    //   190: aload 7
    //   192: astore_3
    //   193: aload 8
    //   195: getfield 146	m6/d:a	Ljava/lang/String;
    //   198: iconst_2
    //   199: invokestatic 55	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   202: ifeq +230 -> 432
    //   205: aload 6
    //   207: astore 4
    //   209: aload 8
    //   211: getfield 148	m6/d:b	Ljava/lang/String;
    //   214: astore_2
    //   215: aload_2
    //   216: ifnonnull +9 -> 225
    //   219: aload 5
    //   221: astore_2
    //   222: goto +14 -> 236
    //   225: aload 6
    //   227: astore 4
    //   229: aload_2
    //   230: aload 5
    //   232: invokevirtual 152	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   235: astore_2
    //   236: aload 6
    //   238: astore 4
    //   240: ldc -102
    //   242: aload_2
    //   243: invokestatic 157	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   246: pop
    //   247: aload 6
    //   249: astore_2
    //   250: aload 7
    //   252: astore_3
    //   253: goto +179 -> 432
    //   256: astore_2
    //   257: goto +291 -> 548
    //   260: aload 6
    //   262: astore 4
    //   264: getstatic 128	m6/f:b	Lm6/d;
    //   267: astore 8
    //   269: aload 6
    //   271: astore 4
    //   273: aload 5
    //   275: astore_2
    //   276: aload 7
    //   278: astore_3
    //   279: aload 8
    //   281: getfield 146	m6/d:a	Ljava/lang/String;
    //   284: iconst_5
    //   285: invokestatic 55	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   288: ifeq +144 -> 432
    //   291: aload 6
    //   293: astore 4
    //   295: aload 8
    //   297: getfield 148	m6/d:b	Ljava/lang/String;
    //   300: astore_2
    //   301: aload_2
    //   302: ifnonnull +9 -> 311
    //   305: ldc 70
    //   307: astore_2
    //   308: goto +14 -> 322
    //   311: aload 6
    //   313: astore 4
    //   315: aload_2
    //   316: ldc 70
    //   318: invokevirtual 152	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   321: astore_2
    //   322: aload 6
    //   324: astore 4
    //   326: ldc -102
    //   328: aload_2
    //   329: invokestatic 160	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   332: pop
    //   333: aload 5
    //   335: astore_2
    //   336: aload 7
    //   338: astore_3
    //   339: goto +93 -> 432
    //   342: astore 6
    //   344: aload 7
    //   346: astore_2
    //   347: aload 4
    //   349: astore 7
    //   351: goto +8 -> 359
    //   354: astore 6
    //   356: aconst_null
    //   357: astore 7
    //   359: aload_2
    //   360: astore 4
    //   362: getstatic 128	m6/f:b	Lm6/d;
    //   365: astore_3
    //   366: aload_2
    //   367: astore 4
    //   369: aload_3
    //   370: getfield 146	m6/d:a	Ljava/lang/String;
    //   373: bipush 6
    //   375: invokestatic 55	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   378: ifeq +49 -> 427
    //   381: aload_2
    //   382: astore 4
    //   384: aload_3
    //   385: getfield 148	m6/d:b	Ljava/lang/String;
    //   388: astore_3
    //   389: aload_3
    //   390: ifnonnull +8 -> 398
    //   393: aload_0
    //   394: astore_3
    //   395: goto +13 -> 408
    //   398: aload_2
    //   399: astore 4
    //   401: aload_3
    //   402: ldc 70
    //   404: invokevirtual 152	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   407: astore_3
    //   408: aload_2
    //   409: astore 4
    //   411: ldc -102
    //   413: aload_3
    //   414: aload 6
    //   416: invokestatic 164	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   419: pop
    //   420: goto +7 -> 427
    //   423: astore_2
    //   424: goto +120 -> 544
    //   427: aload_2
    //   428: astore_3
    //   429: aload 7
    //   431: astore_2
    //   432: aload_3
    //   433: ifnull +7 -> 440
    //   436: aload_3
    //   437: invokestatic 169	v6/c:a	(Ljava/io/Closeable;)V
    //   440: aload_2
    //   441: ifnonnull +59 -> 500
    //   444: getstatic 128	m6/f:b	Lm6/d;
    //   447: astore 7
    //   449: aload 7
    //   451: getfield 146	m6/d:a	Ljava/lang/String;
    //   454: iconst_3
    //   455: invokestatic 55	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   458: ifeq +36 -> 494
    //   461: ldc -85
    //   463: astore_2
    //   464: aload 7
    //   466: getfield 148	m6/d:b	Ljava/lang/String;
    //   469: astore 7
    //   471: aload 7
    //   473: ifnonnull +6 -> 479
    //   476: goto +11 -> 487
    //   479: aload 7
    //   481: ldc -85
    //   483: invokevirtual 152	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   486: astore_2
    //   487: ldc -102
    //   489: aload_2
    //   490: invokestatic 65	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   493: pop
    //   494: ldc -83
    //   496: astore_2
    //   497: goto +3 -> 500
    //   500: aload_1
    //   501: getfield 94	m6/f:a	Ljava/util/concurrent/ConcurrentHashMap;
    //   504: ldc 84
    //   506: aload_2
    //   507: invokevirtual 177	java/util/concurrent/ConcurrentHashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   510: pop
    //   511: aload_2
    //   512: invokestatic 183	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   515: ifne +15 -> 530
    //   518: aload_2
    //   519: astore 7
    //   521: aload_2
    //   522: ldc -83
    //   524: invokevirtual 186	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   527: ifeq +7 -> 534
    //   530: ldc -68
    //   532: astore 7
    //   534: new 2	com/google/android/gms/internal/firebase_auth_api/zzaed
    //   537: dup
    //   538: aload 7
    //   540: invokespecial 190	com/google/android/gms/internal/firebase_auth_api/zzaed:<init>	(Ljava/lang/String;)V
    //   543: areturn
    //   544: aload 4
    //   546: astore 7
    //   548: aload 7
    //   550: ifnull +8 -> 558
    //   553: aload 7
    //   555: invokestatic 169	v6/c:a	(Ljava/io/Closeable;)V
    //   558: aload_2
    //   559: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   2	392	0	str1	String
    //   6	495	1	localf	m6.f
    //   43	207	2	localObject1	Object
    //   256	1	2	localObject2	Object
    //   275	134	2	localObject3	Object
    //   423	5	2	localObject4	Object
    //   431	128	2	localObject5	Object
    //   54	383	3	localObject6	Object
    //   58	487	4	localObject7	Object
    //   61	273	5	str2	String
    //   64	259	6	str3	String
    //   342	1	6	localIOException1	java.io.IOException
    //   354	61	6	localIOException2	java.io.IOException
    //   85	469	7	localObject8	Object
    //   122	174	8	locald	m6.d
    // Exception table:
    //   from	to	target	type
    //   96	102	256	finally
    //   106	115	256	finally
    //   119	124	256	finally
    //   128	132	256	finally
    //   136	140	256	finally
    //   144	151	256	finally
    //   155	162	256	finally
    //   166	173	256	finally
    //   177	183	256	finally
    //   193	205	256	finally
    //   209	215	256	finally
    //   229	236	256	finally
    //   240	247	256	finally
    //   264	269	256	finally
    //   279	291	256	finally
    //   295	301	256	finally
    //   315	322	256	finally
    //   326	333	256	finally
    //   96	102	342	java/io/IOException
    //   106	115	342	java/io/IOException
    //   119	124	342	java/io/IOException
    //   128	132	342	java/io/IOException
    //   136	140	342	java/io/IOException
    //   144	151	342	java/io/IOException
    //   155	162	342	java/io/IOException
    //   166	173	342	java/io/IOException
    //   177	183	342	java/io/IOException
    //   193	205	342	java/io/IOException
    //   209	215	342	java/io/IOException
    //   229	236	342	java/io/IOException
    //   240	247	342	java/io/IOException
    //   264	269	342	java/io/IOException
    //   279	291	342	java/io/IOException
    //   295	301	342	java/io/IOException
    //   315	322	342	java/io/IOException
    //   326	333	342	java/io/IOException
    //   66	87	354	java/io/IOException
    //   66	87	423	finally
    //   362	366	423	finally
    //   369	381	423	finally
    //   384	389	423	finally
    //   401	408	423	finally
    //   411	420	423	finally
  }
  
  public final String zzb()
  {
    return String.format("X%s", new Object[] { Integer.toString(zza) });
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaed
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */