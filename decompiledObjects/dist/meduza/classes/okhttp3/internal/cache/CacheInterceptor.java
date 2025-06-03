package okhttp3.internal.cache;

import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.Response.Builder;

public final class CacheInterceptor
  implements Interceptor
{
  public final InternalCache a;
  
  public CacheInterceptor(InternalCache paramInternalCache)
  {
    a = paramInternalCache;
  }
  
  public static boolean b(String paramString)
  {
    boolean bool;
    if ((!"Content-Length".equalsIgnoreCase(paramString)) && (!"Content-Encoding".equalsIgnoreCase(paramString)) && (!"Content-Type".equalsIgnoreCase(paramString))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static boolean c(String paramString)
  {
    boolean bool;
    if ((!"Connection".equalsIgnoreCase(paramString)) && (!"Keep-Alive".equalsIgnoreCase(paramString)) && (!"Proxy-Authenticate".equalsIgnoreCase(paramString)) && (!"Proxy-Authorization".equalsIgnoreCase(paramString)) && (!"TE".equalsIgnoreCase(paramString)) && (!"Trailers".equalsIgnoreCase(paramString)) && (!"Transfer-Encoding".equalsIgnoreCase(paramString)) && (!"Upgrade".equalsIgnoreCase(paramString))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static Response d(Response paramResponse)
  {
    Response localResponse = paramResponse;
    if (paramResponse != null)
    {
      localResponse = paramResponse;
      if (o != null)
      {
        paramResponse = new Response.Builder(paramResponse);
        g = null;
        localResponse = paramResponse.a();
      }
    }
    return localResponse;
  }
  
  /* Error */
  public final Response a(okhttp3.internal.http.RealInterceptorChain paramRealInterceptorChain)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 15	okhttp3/internal/cache/CacheInterceptor:a	Lokhttp3/internal/cache/InternalCache;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnull +13 -> 19
    //   9: aload_2
    //   10: invokeinterface 73 1 0
    //   15: astore_2
    //   16: goto +5 -> 21
    //   19: aconst_null
    //   20: astore_2
    //   21: invokestatic 79	java/lang/System:currentTimeMillis	()J
    //   24: lstore_3
    //   25: aload_1
    //   26: getfield 85	okhttp3/internal/http/RealInterceptorChain:f	Lokhttp3/Request;
    //   29: astore 5
    //   31: new 87	okhttp3/internal/cache/CacheStrategy$Factory
    //   34: dup
    //   35: lload_3
    //   36: aload 5
    //   38: aload_2
    //   39: invokespecial 90	okhttp3/internal/cache/CacheStrategy$Factory:<init>	(JLokhttp3/Request;Lokhttp3/Response;)V
    //   42: astore 6
    //   44: aload_2
    //   45: ifnonnull +18 -> 63
    //   48: new 92	okhttp3/internal/cache/CacheStrategy
    //   51: dup
    //   52: aload 5
    //   54: aconst_null
    //   55: invokespecial 95	okhttp3/internal/cache/CacheStrategy:<init>	(Lokhttp3/Request;Lokhttp3/Response;)V
    //   58: astore 7
    //   60: goto +62 -> 122
    //   63: aload 5
    //   65: getfield 100	okhttp3/Request:a	Lokhttp3/HttpUrl;
    //   68: getfield 105	okhttp3/HttpUrl:a	Ljava/lang/String;
    //   71: ldc 107
    //   73: invokevirtual 111	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   76: ifeq +25 -> 101
    //   79: aload_2
    //   80: getfield 115	okhttp3/Response:e	Lokhttp3/Handshake;
    //   83: ifnonnull +18 -> 101
    //   86: new 92	okhttp3/internal/cache/CacheStrategy
    //   89: dup
    //   90: aload 5
    //   92: aconst_null
    //   93: invokespecial 95	okhttp3/internal/cache/CacheStrategy:<init>	(Lokhttp3/Request;Lokhttp3/Response;)V
    //   96: astore 7
    //   98: goto +24 -> 122
    //   101: aload 5
    //   103: aload_2
    //   104: invokestatic 118	okhttp3/internal/cache/CacheStrategy:a	(Lokhttp3/Request;Lokhttp3/Response;)Z
    //   107: ifne +28 -> 135
    //   110: new 92	okhttp3/internal/cache/CacheStrategy
    //   113: dup
    //   114: aload 5
    //   116: aconst_null
    //   117: invokespecial 95	okhttp3/internal/cache/CacheStrategy:<init>	(Lokhttp3/Request;Lokhttp3/Response;)V
    //   120: astore 7
    //   122: aload_2
    //   123: astore 8
    //   125: aload 7
    //   127: astore_2
    //   128: aload 8
    //   130: astore 7
    //   132: goto +828 -> 960
    //   135: aload 5
    //   137: getfield 121	okhttp3/Request:f	Lokhttp3/CacheControl;
    //   140: astore 7
    //   142: aload 7
    //   144: ifnull +6 -> 150
    //   147: goto +20 -> 167
    //   150: aload 5
    //   152: getfield 124	okhttp3/Request:c	Lokhttp3/Headers;
    //   155: invokestatic 129	okhttp3/CacheControl:a	(Lokhttp3/Headers;)Lokhttp3/CacheControl;
    //   158: astore 7
    //   160: aload 5
    //   162: aload 7
    //   164: putfield 121	okhttp3/Request:f	Lokhttp3/CacheControl;
    //   167: aload 7
    //   169: getfield 132	okhttp3/CacheControl:a	Z
    //   172: ifne +770 -> 942
    //   175: ldc -122
    //   177: astore 9
    //   179: aload 5
    //   181: ldc -122
    //   183: invokevirtual 137	okhttp3/Request:a	(Ljava/lang/String;)Ljava/lang/String;
    //   186: ifnonnull +22 -> 208
    //   189: aload 5
    //   191: ldc -117
    //   193: invokevirtual 137	okhttp3/Request:a	(Ljava/lang/String;)Ljava/lang/String;
    //   196: ifnull +6 -> 202
    //   199: goto +9 -> 208
    //   202: iconst_0
    //   203: istore 10
    //   205: goto +6 -> 211
    //   208: iconst_1
    //   209: istore 10
    //   211: iload 10
    //   213: ifeq +6 -> 219
    //   216: goto +726 -> 942
    //   219: aload_2
    //   220: invokevirtual 142	okhttp3/Response:f	()Lokhttp3/CacheControl;
    //   223: astore 11
    //   225: aload 6
    //   227: getfield 145	okhttp3/internal/cache/CacheStrategy$Factory:a	Ljava/util/Date;
    //   230: astore 8
    //   232: aload 8
    //   234: ifnull +23 -> 257
    //   237: lconst_0
    //   238: aload 6
    //   240: getfield 148	okhttp3/internal/cache/CacheStrategy$Factory:g	J
    //   243: aload 8
    //   245: invokevirtual 153	java/util/Date:getTime	()J
    //   248: lsub
    //   249: invokestatic 159	java/lang/Math:max	(JJ)J
    //   252: lstore 12
    //   254: goto +6 -> 260
    //   257: lconst_0
    //   258: lstore 12
    //   260: aload 6
    //   262: getfield 163	okhttp3/internal/cache/CacheStrategy$Factory:i	I
    //   265: istore 10
    //   267: lload 12
    //   269: lstore 14
    //   271: iload 10
    //   273: iconst_m1
    //   274: if_icmpeq +19 -> 293
    //   277: lload 12
    //   279: getstatic 169	java/util/concurrent/TimeUnit:SECONDS	Ljava/util/concurrent/TimeUnit;
    //   282: iload 10
    //   284: i2l
    //   285: invokevirtual 173	java/util/concurrent/TimeUnit:toMillis	(J)J
    //   288: invokestatic 159	java/lang/Math:max	(JJ)J
    //   291: lstore 14
    //   293: aload 6
    //   295: getfield 148	okhttp3/internal/cache/CacheStrategy$Factory:g	J
    //   298: lstore 12
    //   300: lload 14
    //   302: lload 12
    //   304: aload 6
    //   306: getfield 175	okhttp3/internal/cache/CacheStrategy$Factory:f	J
    //   309: lsub
    //   310: ladd
    //   311: lload_3
    //   312: lload 12
    //   314: lsub
    //   315: ladd
    //   316: lstore 16
    //   318: aload_2
    //   319: invokevirtual 142	okhttp3/Response:f	()Lokhttp3/CacheControl;
    //   322: getfield 177	okhttp3/CacheControl:c	I
    //   325: istore 10
    //   327: iload 10
    //   329: iconst_m1
    //   330: if_icmpeq +17 -> 347
    //   333: getstatic 169	java/util/concurrent/TimeUnit:SECONDS	Ljava/util/concurrent/TimeUnit;
    //   336: iload 10
    //   338: i2l
    //   339: invokevirtual 173	java/util/concurrent/TimeUnit:toMillis	(J)J
    //   342: lstore 12
    //   344: goto +60 -> 404
    //   347: aload 6
    //   349: getfield 179	okhttp3/internal/cache/CacheStrategy$Factory:e	Ljava/util/Date;
    //   352: ifnull +55 -> 407
    //   355: aload 6
    //   357: getfield 145	okhttp3/internal/cache/CacheStrategy$Factory:a	Ljava/util/Date;
    //   360: astore 8
    //   362: aload 8
    //   364: ifnull +13 -> 377
    //   367: aload 8
    //   369: invokevirtual 153	java/util/Date:getTime	()J
    //   372: lstore 12
    //   374: goto +10 -> 384
    //   377: aload 6
    //   379: getfield 148	okhttp3/internal/cache/CacheStrategy$Factory:g	J
    //   382: lstore 12
    //   384: aload 6
    //   386: getfield 179	okhttp3/internal/cache/CacheStrategy$Factory:e	Ljava/util/Date;
    //   389: invokevirtual 153	java/util/Date:getTime	()J
    //   392: lload 12
    //   394: lsub
    //   395: lstore 12
    //   397: lload 12
    //   399: lconst_0
    //   400: lcmp
    //   401: ifle +128 -> 529
    //   404: goto +131 -> 535
    //   407: aload 6
    //   409: getfield 181	okhttp3/internal/cache/CacheStrategy$Factory:c	Ljava/util/Date;
    //   412: ifnull +117 -> 529
    //   415: aload_2
    //   416: getfield 183	okhttp3/Response:a	Lokhttp3/Request;
    //   419: getfield 100	okhttp3/Request:a	Lokhttp3/HttpUrl;
    //   422: astore 8
    //   424: aload 8
    //   426: getfield 186	okhttp3/HttpUrl:g	Ljava/util/List;
    //   429: ifnonnull +9 -> 438
    //   432: aconst_null
    //   433: astore 8
    //   435: goto +29 -> 464
    //   438: new 188	java/lang/StringBuilder
    //   441: dup
    //   442: invokespecial 189	java/lang/StringBuilder:<init>	()V
    //   445: astore 18
    //   447: aload 18
    //   449: aload 8
    //   451: getfield 186	okhttp3/HttpUrl:g	Ljava/util/List;
    //   454: invokestatic 192	okhttp3/HttpUrl:i	(Ljava/lang/StringBuilder;Ljava/util/List;)V
    //   457: aload 18
    //   459: invokevirtual 196	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   462: astore 8
    //   464: aload 8
    //   466: ifnonnull +63 -> 529
    //   469: aload 6
    //   471: getfield 145	okhttp3/internal/cache/CacheStrategy$Factory:a	Ljava/util/Date;
    //   474: astore 8
    //   476: aload 8
    //   478: ifnull +13 -> 491
    //   481: aload 8
    //   483: invokevirtual 153	java/util/Date:getTime	()J
    //   486: lstore 12
    //   488: goto +10 -> 498
    //   491: aload 6
    //   493: getfield 175	okhttp3/internal/cache/CacheStrategy$Factory:f	J
    //   496: lstore 12
    //   498: lload 12
    //   500: aload 6
    //   502: getfield 181	okhttp3/internal/cache/CacheStrategy$Factory:c	Ljava/util/Date;
    //   505: invokevirtual 153	java/util/Date:getTime	()J
    //   508: lsub
    //   509: lstore 12
    //   511: lload 12
    //   513: lconst_0
    //   514: lcmp
    //   515: ifle +14 -> 529
    //   518: lload 12
    //   520: ldc2_w 197
    //   523: ldiv
    //   524: lstore 12
    //   526: goto -122 -> 404
    //   529: lconst_0
    //   530: lstore 12
    //   532: goto -128 -> 404
    //   535: aload 7
    //   537: getfield 177	okhttp3/CacheControl:c	I
    //   540: istore 10
    //   542: lload 12
    //   544: lstore 14
    //   546: iload 10
    //   548: iconst_m1
    //   549: if_icmpeq +19 -> 568
    //   552: lload 12
    //   554: getstatic 169	java/util/concurrent/TimeUnit:SECONDS	Ljava/util/concurrent/TimeUnit;
    //   557: iload 10
    //   559: i2l
    //   560: invokevirtual 173	java/util/concurrent/TimeUnit:toMillis	(J)J
    //   563: invokestatic 201	java/lang/Math:min	(JJ)J
    //   566: lstore 14
    //   568: aload 7
    //   570: getfield 202	okhttp3/CacheControl:i	I
    //   573: istore 10
    //   575: iload 10
    //   577: iconst_m1
    //   578: if_icmpeq +17 -> 595
    //   581: getstatic 169	java/util/concurrent/TimeUnit:SECONDS	Ljava/util/concurrent/TimeUnit;
    //   584: iload 10
    //   586: i2l
    //   587: invokevirtual 173	java/util/concurrent/TimeUnit:toMillis	(J)J
    //   590: lstore 12
    //   592: goto +6 -> 598
    //   595: lconst_0
    //   596: lstore 12
    //   598: aload 11
    //   600: getfield 204	okhttp3/CacheControl:g	Z
    //   603: ifne +29 -> 632
    //   606: aload 7
    //   608: getfield 207	okhttp3/CacheControl:h	I
    //   611: istore 10
    //   613: iload 10
    //   615: iconst_m1
    //   616: if_icmpeq +16 -> 632
    //   619: getstatic 169	java/util/concurrent/TimeUnit:SECONDS	Ljava/util/concurrent/TimeUnit;
    //   622: iload 10
    //   624: i2l
    //   625: invokevirtual 173	java/util/concurrent/TimeUnit:toMillis	(J)J
    //   628: lstore_3
    //   629: goto +5 -> 634
    //   632: lconst_0
    //   633: lstore_3
    //   634: aload 11
    //   636: getfield 132	okhttp3/CacheControl:a	Z
    //   639: ifne +166 -> 805
    //   642: lload 12
    //   644: lload 16
    //   646: ladd
    //   647: lstore 12
    //   649: lload 12
    //   651: lload_3
    //   652: lload 14
    //   654: ladd
    //   655: lcmp
    //   656: ifge +149 -> 805
    //   659: aload_2
    //   660: astore 7
    //   662: new 56	okhttp3/Response$Builder
    //   665: dup
    //   666: aload 7
    //   668: invokespecial 59	okhttp3/Response$Builder:<init>	(Lokhttp3/Response;)V
    //   671: astore_2
    //   672: lload 12
    //   674: lload 14
    //   676: lcmp
    //   677: iflt +36 -> 713
    //   680: aload_2
    //   681: getfield 210	okhttp3/Response$Builder:f	Lokhttp3/Headers$Builder;
    //   684: astore 8
    //   686: aload 8
    //   688: invokevirtual 214	java/lang/Object:getClass	()Ljava/lang/Class;
    //   691: pop
    //   692: ldc -40
    //   694: invokestatic 221	okhttp3/Headers:a	(Ljava/lang/String;)V
    //   697: ldc -33
    //   699: ldc -40
    //   701: invokestatic 226	okhttp3/Headers:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   704: aload 8
    //   706: ldc -40
    //   708: ldc -33
    //   710: invokevirtual 229	okhttp3/Headers$Builder:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   713: lload 16
    //   715: ldc2_w 230
    //   718: lcmp
    //   719: ifle +70 -> 789
    //   722: aload 7
    //   724: invokevirtual 142	okhttp3/Response:f	()Lokhttp3/CacheControl;
    //   727: getfield 177	okhttp3/CacheControl:c	I
    //   730: iconst_m1
    //   731: if_icmpne +17 -> 748
    //   734: aload 6
    //   736: getfield 179	okhttp3/internal/cache/CacheStrategy$Factory:e	Ljava/util/Date;
    //   739: ifnonnull +9 -> 748
    //   742: iconst_1
    //   743: istore 10
    //   745: goto +6 -> 751
    //   748: iconst_0
    //   749: istore 10
    //   751: iload 10
    //   753: ifeq +36 -> 789
    //   756: aload_2
    //   757: getfield 210	okhttp3/Response$Builder:f	Lokhttp3/Headers$Builder;
    //   760: astore 8
    //   762: aload 8
    //   764: invokevirtual 214	java/lang/Object:getClass	()Ljava/lang/Class;
    //   767: pop
    //   768: ldc -40
    //   770: invokestatic 221	okhttp3/Headers:a	(Ljava/lang/String;)V
    //   773: ldc -23
    //   775: ldc -40
    //   777: invokestatic 226	okhttp3/Headers:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   780: aload 8
    //   782: ldc -40
    //   784: ldc -23
    //   786: invokevirtual 229	okhttp3/Headers$Builder:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   789: new 92	okhttp3/internal/cache/CacheStrategy
    //   792: dup
    //   793: aconst_null
    //   794: aload_2
    //   795: invokevirtual 65	okhttp3/Response$Builder:a	()Lokhttp3/Response;
    //   798: invokespecial 95	okhttp3/internal/cache/CacheStrategy:<init>	(Lokhttp3/Request;Lokhttp3/Response;)V
    //   801: astore_2
    //   802: goto +158 -> 960
    //   805: aload_2
    //   806: astore 7
    //   808: aload 6
    //   810: getfield 235	okhttp3/internal/cache/CacheStrategy$Factory:h	Ljava/lang/String;
    //   813: astore_2
    //   814: aload_2
    //   815: ifnull +10 -> 825
    //   818: ldc -117
    //   820: astore 8
    //   822: goto +42 -> 864
    //   825: aload 6
    //   827: getfield 181	okhttp3/internal/cache/CacheStrategy$Factory:c	Ljava/util/Date;
    //   830: ifnull +16 -> 846
    //   833: aload 6
    //   835: getfield 237	okhttp3/internal/cache/CacheStrategy$Factory:d	Ljava/lang/String;
    //   838: astore_2
    //   839: aload 9
    //   841: astore 8
    //   843: goto +21 -> 864
    //   846: aload 6
    //   848: getfield 145	okhttp3/internal/cache/CacheStrategy$Factory:a	Ljava/util/Date;
    //   851: ifnull +77 -> 928
    //   854: aload 6
    //   856: getfield 239	okhttp3/internal/cache/CacheStrategy$Factory:b	Ljava/lang/String;
    //   859: astore_2
    //   860: aload 9
    //   862: astore 8
    //   864: aload 5
    //   866: getfield 124	okhttp3/Request:c	Lokhttp3/Headers;
    //   869: invokevirtual 242	okhttp3/Headers:e	()Lokhttp3/Headers$Builder;
    //   872: astore 9
    //   874: getstatic 247	okhttp3/internal/Internal:a	Lokhttp3/internal/Internal;
    //   877: aload 9
    //   879: aload 8
    //   881: aload_2
    //   882: invokevirtual 250	okhttp3/internal/Internal:b	(Lokhttp3/Headers$Builder;Ljava/lang/String;Ljava/lang/String;)V
    //   885: new 252	okhttp3/Request$Builder
    //   888: dup
    //   889: aload 5
    //   891: invokespecial 255	okhttp3/Request$Builder:<init>	(Lokhttp3/Request;)V
    //   894: astore_2
    //   895: aload_2
    //   896: new 218	okhttp3/Headers
    //   899: dup
    //   900: aload 9
    //   902: invokespecial 258	okhttp3/Headers:<init>	(Lokhttp3/Headers$Builder;)V
    //   905: invokevirtual 242	okhttp3/Headers:e	()Lokhttp3/Headers$Builder;
    //   908: putfield 260	okhttp3/Request$Builder:c	Lokhttp3/Headers$Builder;
    //   911: new 92	okhttp3/internal/cache/CacheStrategy
    //   914: dup
    //   915: aload_2
    //   916: invokevirtual 263	okhttp3/Request$Builder:a	()Lokhttp3/Request;
    //   919: aload 7
    //   921: invokespecial 95	okhttp3/internal/cache/CacheStrategy:<init>	(Lokhttp3/Request;Lokhttp3/Response;)V
    //   924: astore_2
    //   925: goto +35 -> 960
    //   928: new 92	okhttp3/internal/cache/CacheStrategy
    //   931: dup
    //   932: aload 5
    //   934: aconst_null
    //   935: invokespecial 95	okhttp3/internal/cache/CacheStrategy:<init>	(Lokhttp3/Request;Lokhttp3/Response;)V
    //   938: astore_2
    //   939: goto +21 -> 960
    //   942: new 92	okhttp3/internal/cache/CacheStrategy
    //   945: dup
    //   946: aload 5
    //   948: aconst_null
    //   949: invokespecial 95	okhttp3/internal/cache/CacheStrategy:<init>	(Lokhttp3/Request;Lokhttp3/Response;)V
    //   952: astore 8
    //   954: aload_2
    //   955: astore 7
    //   957: aload 8
    //   959: astore_2
    //   960: aload_2
    //   961: astore 8
    //   963: aload_2
    //   964: getfield 264	okhttp3/internal/cache/CacheStrategy:a	Lokhttp3/Request;
    //   967: ifnull +57 -> 1024
    //   970: aload 5
    //   972: getfield 121	okhttp3/Request:f	Lokhttp3/CacheControl;
    //   975: astore 9
    //   977: aload 9
    //   979: ifnull +6 -> 985
    //   982: goto +20 -> 1002
    //   985: aload 5
    //   987: getfield 124	okhttp3/Request:c	Lokhttp3/Headers;
    //   990: invokestatic 129	okhttp3/CacheControl:a	(Lokhttp3/Headers;)Lokhttp3/CacheControl;
    //   993: astore 9
    //   995: aload 5
    //   997: aload 9
    //   999: putfield 121	okhttp3/Request:f	Lokhttp3/CacheControl;
    //   1002: aload_2
    //   1003: astore 8
    //   1005: aload 9
    //   1007: getfield 267	okhttp3/CacheControl:j	Z
    //   1010: ifeq +14 -> 1024
    //   1013: new 92	okhttp3/internal/cache/CacheStrategy
    //   1016: dup
    //   1017: aconst_null
    //   1018: aconst_null
    //   1019: invokespecial 95	okhttp3/internal/cache/CacheStrategy:<init>	(Lokhttp3/Request;Lokhttp3/Response;)V
    //   1022: astore 8
    //   1024: aload 8
    //   1026: getfield 264	okhttp3/internal/cache/CacheStrategy:a	Lokhttp3/Request;
    //   1029: astore 9
    //   1031: aload 8
    //   1033: getfield 270	okhttp3/internal/cache/CacheStrategy:b	Lokhttp3/Response;
    //   1036: astore_2
    //   1037: aload_0
    //   1038: getfield 15	okhttp3/internal/cache/CacheInterceptor:a	Lokhttp3/internal/cache/InternalCache;
    //   1041: astore 8
    //   1043: aload 8
    //   1045: ifnull +10 -> 1055
    //   1048: aload 8
    //   1050: invokeinterface 272 1 0
    //   1055: aload 7
    //   1057: ifnull +15 -> 1072
    //   1060: aload_2
    //   1061: ifnonnull +11 -> 1072
    //   1064: aload 7
    //   1066: getfield 54	okhttp3/Response:o	Lokhttp3/ResponseBody;
    //   1069: invokestatic 277	okhttp3/internal/Util:e	(Ljava/io/Closeable;)V
    //   1072: aload 9
    //   1074: ifnonnull +70 -> 1144
    //   1077: aload_2
    //   1078: ifnonnull +66 -> 1144
    //   1081: new 56	okhttp3/Response$Builder
    //   1084: dup
    //   1085: invokespecial 278	okhttp3/Response$Builder:<init>	()V
    //   1088: astore_2
    //   1089: aload_2
    //   1090: aload_1
    //   1091: getfield 85	okhttp3/internal/http/RealInterceptorChain:f	Lokhttp3/Request;
    //   1094: putfield 279	okhttp3/Response$Builder:a	Lokhttp3/Request;
    //   1097: aload_2
    //   1098: getstatic 284	okhttp3/Protocol:c	Lokhttp3/Protocol;
    //   1101: putfield 286	okhttp3/Response$Builder:b	Lokhttp3/Protocol;
    //   1104: aload_2
    //   1105: sipush 504
    //   1108: putfield 287	okhttp3/Response$Builder:c	I
    //   1111: aload_2
    //   1112: ldc_w 289
    //   1115: putfield 290	okhttp3/Response$Builder:d	Ljava/lang/String;
    //   1118: aload_2
    //   1119: getstatic 292	okhttp3/internal/Util:c	Lokhttp3/ResponseBody;
    //   1122: putfield 62	okhttp3/Response$Builder:g	Lokhttp3/ResponseBody;
    //   1125: aload_2
    //   1126: ldc2_w 293
    //   1129: putfield 297	okhttp3/Response$Builder:k	J
    //   1132: aload_2
    //   1133: invokestatic 79	java/lang/System:currentTimeMillis	()J
    //   1136: putfield 300	okhttp3/Response$Builder:l	J
    //   1139: aload_2
    //   1140: invokevirtual 65	okhttp3/Response$Builder:a	()Lokhttp3/Response;
    //   1143: areturn
    //   1144: aload 9
    //   1146: ifnonnull +43 -> 1189
    //   1149: aload_2
    //   1150: invokevirtual 214	java/lang/Object:getClass	()Ljava/lang/Class;
    //   1153: pop
    //   1154: new 56	okhttp3/Response$Builder
    //   1157: dup
    //   1158: aload_2
    //   1159: invokespecial 59	okhttp3/Response$Builder:<init>	(Lokhttp3/Response;)V
    //   1162: astore_1
    //   1163: aload_2
    //   1164: invokestatic 302	okhttp3/internal/cache/CacheInterceptor:d	(Lokhttp3/Response;)Lokhttp3/Response;
    //   1167: astore_2
    //   1168: aload_2
    //   1169: ifnull +10 -> 1179
    //   1172: ldc_w 304
    //   1175: aload_2
    //   1176: invokestatic 307	okhttp3/Response$Builder:b	(Ljava/lang/String;Lokhttp3/Response;)V
    //   1179: aload_1
    //   1180: aload_2
    //   1181: putfield 309	okhttp3/Response$Builder:i	Lokhttp3/Response;
    //   1184: aload_1
    //   1185: invokevirtual 65	okhttp3/Response$Builder:a	()Lokhttp3/Response;
    //   1188: areturn
    //   1189: aload_1
    //   1190: aload 9
    //   1192: invokevirtual 312	okhttp3/internal/http/RealInterceptorChain:c	(Lokhttp3/Request;)Lokhttp3/Response;
    //   1195: astore_1
    //   1196: aload_1
    //   1197: ifnonnull +16 -> 1213
    //   1200: aload 7
    //   1202: ifnull +11 -> 1213
    //   1205: aload 7
    //   1207: getfield 54	okhttp3/Response:o	Lokhttp3/ResponseBody;
    //   1210: invokestatic 277	okhttp3/internal/Util:e	(Ljava/io/Closeable;)V
    //   1213: aload_2
    //   1214: ifnull +337 -> 1551
    //   1217: aload_1
    //   1218: getfield 313	okhttp3/Response:c	I
    //   1221: sipush 304
    //   1224: if_icmpne +320 -> 1544
    //   1227: new 56	okhttp3/Response$Builder
    //   1230: dup
    //   1231: aload_2
    //   1232: invokespecial 59	okhttp3/Response$Builder:<init>	(Lokhttp3/Response;)V
    //   1235: astore 7
    //   1237: aload_2
    //   1238: getfield 315	okhttp3/Response:f	Lokhttp3/Headers;
    //   1241: astore 6
    //   1243: aload_1
    //   1244: getfield 315	okhttp3/Response:f	Lokhttp3/Headers;
    //   1247: astore 8
    //   1249: new 228	okhttp3/Headers$Builder
    //   1252: dup
    //   1253: invokespecial 316	okhttp3/Headers$Builder:<init>	()V
    //   1256: astore 9
    //   1258: aload 6
    //   1260: getfield 319	okhttp3/Headers:a	[Ljava/lang/String;
    //   1263: arraylength
    //   1264: iconst_2
    //   1265: idiv
    //   1266: istore 19
    //   1268: iconst_0
    //   1269: istore 10
    //   1271: iload 10
    //   1273: iload 19
    //   1275: if_icmpge +89 -> 1364
    //   1278: aload 6
    //   1280: iload 10
    //   1282: invokevirtual 322	okhttp3/Headers:d	(I)Ljava/lang/String;
    //   1285: astore 11
    //   1287: aload 6
    //   1289: iload 10
    //   1291: invokevirtual 324	okhttp3/Headers:f	(I)Ljava/lang/String;
    //   1294: astore 5
    //   1296: ldc -40
    //   1298: aload 11
    //   1300: invokevirtual 25	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   1303: ifeq +17 -> 1320
    //   1306: aload 5
    //   1308: ldc_w 326
    //   1311: invokevirtual 329	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   1314: ifeq +6 -> 1320
    //   1317: goto +41 -> 1358
    //   1320: aload 11
    //   1322: invokestatic 331	okhttp3/internal/cache/CacheInterceptor:b	(Ljava/lang/String;)Z
    //   1325: ifne +21 -> 1346
    //   1328: aload 11
    //   1330: invokestatic 333	okhttp3/internal/cache/CacheInterceptor:c	(Ljava/lang/String;)Z
    //   1333: ifeq +13 -> 1346
    //   1336: aload 8
    //   1338: aload 11
    //   1340: invokevirtual 335	okhttp3/Headers:c	(Ljava/lang/String;)Ljava/lang/String;
    //   1343: ifnonnull +15 -> 1358
    //   1346: getstatic 247	okhttp3/internal/Internal:a	Lokhttp3/internal/Internal;
    //   1349: aload 9
    //   1351: aload 11
    //   1353: aload 5
    //   1355: invokevirtual 250	okhttp3/internal/Internal:b	(Lokhttp3/Headers$Builder;Ljava/lang/String;Ljava/lang/String;)V
    //   1358: iinc 10 1
    //   1361: goto -90 -> 1271
    //   1364: aload 8
    //   1366: getfield 319	okhttp3/Headers:a	[Ljava/lang/String;
    //   1369: arraylength
    //   1370: iconst_2
    //   1371: idiv
    //   1372: istore 19
    //   1374: iconst_0
    //   1375: istore 10
    //   1377: iload 10
    //   1379: iload 19
    //   1381: if_icmpge +51 -> 1432
    //   1384: aload 8
    //   1386: iload 10
    //   1388: invokevirtual 322	okhttp3/Headers:d	(I)Ljava/lang/String;
    //   1391: astore 5
    //   1393: aload 5
    //   1395: invokestatic 331	okhttp3/internal/cache/CacheInterceptor:b	(Ljava/lang/String;)Z
    //   1398: ifne +28 -> 1426
    //   1401: aload 5
    //   1403: invokestatic 333	okhttp3/internal/cache/CacheInterceptor:c	(Ljava/lang/String;)Z
    //   1406: ifeq +20 -> 1426
    //   1409: getstatic 247	okhttp3/internal/Internal:a	Lokhttp3/internal/Internal;
    //   1412: aload 9
    //   1414: aload 5
    //   1416: aload 8
    //   1418: iload 10
    //   1420: invokevirtual 324	okhttp3/Headers:f	(I)Ljava/lang/String;
    //   1423: invokevirtual 250	okhttp3/internal/Internal:b	(Lokhttp3/Headers$Builder;Ljava/lang/String;Ljava/lang/String;)V
    //   1426: iinc 10 1
    //   1429: goto -52 -> 1377
    //   1432: aload 7
    //   1434: new 218	okhttp3/Headers
    //   1437: dup
    //   1438: aload 9
    //   1440: invokespecial 258	okhttp3/Headers:<init>	(Lokhttp3/Headers$Builder;)V
    //   1443: invokevirtual 242	okhttp3/Headers:e	()Lokhttp3/Headers$Builder;
    //   1446: putfield 210	okhttp3/Response$Builder:f	Lokhttp3/Headers$Builder;
    //   1449: aload 7
    //   1451: aload_1
    //   1452: getfield 338	okhttp3/Response:s	J
    //   1455: putfield 297	okhttp3/Response$Builder:k	J
    //   1458: aload 7
    //   1460: aload_1
    //   1461: getfield 341	okhttp3/Response:t	J
    //   1464: putfield 300	okhttp3/Response$Builder:l	J
    //   1467: aload_2
    //   1468: invokestatic 302	okhttp3/internal/cache/CacheInterceptor:d	(Lokhttp3/Response;)Lokhttp3/Response;
    //   1471: astore_2
    //   1472: aload_2
    //   1473: ifnull +10 -> 1483
    //   1476: ldc_w 304
    //   1479: aload_2
    //   1480: invokestatic 307	okhttp3/Response$Builder:b	(Ljava/lang/String;Lokhttp3/Response;)V
    //   1483: aload 7
    //   1485: aload_2
    //   1486: putfield 309	okhttp3/Response$Builder:i	Lokhttp3/Response;
    //   1489: aload_1
    //   1490: invokestatic 302	okhttp3/internal/cache/CacheInterceptor:d	(Lokhttp3/Response;)Lokhttp3/Response;
    //   1493: astore_2
    //   1494: aload_2
    //   1495: ifnull +10 -> 1505
    //   1498: ldc_w 343
    //   1501: aload_2
    //   1502: invokestatic 307	okhttp3/Response$Builder:b	(Ljava/lang/String;Lokhttp3/Response;)V
    //   1505: aload 7
    //   1507: aload_2
    //   1508: putfield 345	okhttp3/Response$Builder:h	Lokhttp3/Response;
    //   1511: aload 7
    //   1513: invokevirtual 65	okhttp3/Response$Builder:a	()Lokhttp3/Response;
    //   1516: astore_2
    //   1517: aload_1
    //   1518: getfield 54	okhttp3/Response:o	Lokhttp3/ResponseBody;
    //   1521: invokevirtual 350	okhttp3/ResponseBody:close	()V
    //   1524: aload_0
    //   1525: getfield 15	okhttp3/internal/cache/CacheInterceptor:a	Lokhttp3/internal/cache/InternalCache;
    //   1528: invokeinterface 352 1 0
    //   1533: aload_0
    //   1534: getfield 15	okhttp3/internal/cache/CacheInterceptor:a	Lokhttp3/internal/cache/InternalCache;
    //   1537: invokeinterface 354 1 0
    //   1542: aload_2
    //   1543: areturn
    //   1544: aload_2
    //   1545: getfield 54	okhttp3/Response:o	Lokhttp3/ResponseBody;
    //   1548: invokestatic 277	okhttp3/internal/Util:e	(Ljava/io/Closeable;)V
    //   1551: aload_1
    //   1552: invokevirtual 214	java/lang/Object:getClass	()Ljava/lang/Class;
    //   1555: pop
    //   1556: new 56	okhttp3/Response$Builder
    //   1559: dup
    //   1560: aload_1
    //   1561: invokespecial 59	okhttp3/Response$Builder:<init>	(Lokhttp3/Response;)V
    //   1564: astore 7
    //   1566: aload_2
    //   1567: invokestatic 302	okhttp3/internal/cache/CacheInterceptor:d	(Lokhttp3/Response;)Lokhttp3/Response;
    //   1570: astore_2
    //   1571: aload_2
    //   1572: ifnull +10 -> 1582
    //   1575: ldc_w 304
    //   1578: aload_2
    //   1579: invokestatic 307	okhttp3/Response$Builder:b	(Ljava/lang/String;Lokhttp3/Response;)V
    //   1582: aload 7
    //   1584: aload_2
    //   1585: putfield 309	okhttp3/Response$Builder:i	Lokhttp3/Response;
    //   1588: aload_1
    //   1589: invokestatic 302	okhttp3/internal/cache/CacheInterceptor:d	(Lokhttp3/Response;)Lokhttp3/Response;
    //   1592: astore_1
    //   1593: aload_1
    //   1594: ifnull +10 -> 1604
    //   1597: ldc_w 343
    //   1600: aload_1
    //   1601: invokestatic 307	okhttp3/Response$Builder:b	(Ljava/lang/String;Lokhttp3/Response;)V
    //   1604: aload 7
    //   1606: aload_1
    //   1607: putfield 345	okhttp3/Response$Builder:h	Lokhttp3/Response;
    //   1610: aload 7
    //   1612: invokevirtual 65	okhttp3/Response$Builder:a	()Lokhttp3/Response;
    //   1615: astore_1
    //   1616: aload_0
    //   1617: getfield 15	okhttp3/internal/cache/CacheInterceptor:a	Lokhttp3/internal/cache/InternalCache;
    //   1620: ifnull +154 -> 1774
    //   1623: aload_1
    //   1624: invokestatic 359	okhttp3/internal/http/HttpHeaders:b	(Lokhttp3/Response;)Z
    //   1627: ifeq +127 -> 1754
    //   1630: aload 9
    //   1632: aload_1
    //   1633: invokestatic 118	okhttp3/internal/cache/CacheStrategy:a	(Lokhttp3/Request;Lokhttp3/Response;)Z
    //   1636: ifeq +118 -> 1754
    //   1639: aload_0
    //   1640: getfield 15	okhttp3/internal/cache/CacheInterceptor:a	Lokhttp3/internal/cache/InternalCache;
    //   1643: invokeinterface 362 1 0
    //   1648: astore 7
    //   1650: aload 7
    //   1652: ifnonnull +6 -> 1658
    //   1655: goto +97 -> 1752
    //   1658: aload 7
    //   1660: invokeinterface 367 1 0
    //   1665: astore_2
    //   1666: aload_2
    //   1667: ifnonnull +6 -> 1673
    //   1670: goto +82 -> 1752
    //   1673: new 369	okhttp3/internal/cache/CacheInterceptor$1
    //   1676: dup
    //   1677: aload_1
    //   1678: getfield 54	okhttp3/Response:o	Lokhttp3/ResponseBody;
    //   1681: invokevirtual 373	okhttp3/ResponseBody:H	()Lxc/h;
    //   1684: aload 7
    //   1686: new 375	xc/r
    //   1689: dup
    //   1690: aload_2
    //   1691: invokespecial 378	xc/r:<init>	(Lxc/w;)V
    //   1694: invokespecial 381	okhttp3/internal/cache/CacheInterceptor$1:<init>	(Lxc/h;Lokhttp3/internal/cache/CacheRequest;Lxc/r;)V
    //   1697: astore_2
    //   1698: aload_1
    //   1699: ldc 29
    //   1701: invokevirtual 383	okhttp3/Response:g	(Ljava/lang/String;)Ljava/lang/String;
    //   1704: astore 7
    //   1706: aload_1
    //   1707: getfield 54	okhttp3/Response:o	Lokhttp3/ResponseBody;
    //   1710: invokevirtual 385	okhttp3/ResponseBody:f	()J
    //   1713: lstore 12
    //   1715: new 56	okhttp3/Response$Builder
    //   1718: dup
    //   1719: aload_1
    //   1720: invokespecial 59	okhttp3/Response$Builder:<init>	(Lokhttp3/Response;)V
    //   1723: astore_1
    //   1724: aload_1
    //   1725: new 387	okhttp3/internal/http/RealResponseBody
    //   1728: dup
    //   1729: aload 7
    //   1731: lload 12
    //   1733: new 389	xc/s
    //   1736: dup
    //   1737: aload_2
    //   1738: invokespecial 392	xc/s:<init>	(Lxc/y;)V
    //   1741: invokespecial 395	okhttp3/internal/http/RealResponseBody:<init>	(Ljava/lang/String;JLxc/s;)V
    //   1744: putfield 62	okhttp3/Response$Builder:g	Lokhttp3/ResponseBody;
    //   1747: aload_1
    //   1748: invokevirtual 65	okhttp3/Response$Builder:a	()Lokhttp3/Response;
    //   1751: astore_1
    //   1752: aload_1
    //   1753: areturn
    //   1754: aload 9
    //   1756: getfield 396	okhttp3/Request:b	Ljava/lang/String;
    //   1759: invokestatic 400	okhttp3/internal/http/HttpMethod:a	(Ljava/lang/String;)Z
    //   1762: ifeq +12 -> 1774
    //   1765: aload_0
    //   1766: getfield 15	okhttp3/internal/cache/CacheInterceptor:a	Lokhttp3/internal/cache/InternalCache;
    //   1769: invokeinterface 403 1 0
    //   1774: aload_1
    //   1775: areturn
    //   1776: astore_1
    //   1777: aload 7
    //   1779: ifnull +11 -> 1790
    //   1782: aload 7
    //   1784: getfield 54	okhttp3/Response:o	Lokhttp3/ResponseBody;
    //   1787: invokestatic 277	okhttp3/internal/Util:e	(Ljava/io/Closeable;)V
    //   1790: aload_1
    //   1791: athrow
    //   1792: astore_2
    //   1793: goto -19 -> 1774
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1796	0	this	CacheInterceptor
    //   0	1796	1	paramRealInterceptorChain	okhttp3.internal.http.RealInterceptorChain
    //   4	1734	2	localObject1	Object
    //   1792	1	2	localIOException	java.io.IOException
    //   24	628	3	l1	long
    //   29	1386	5	localObject2	Object
    //   42	1246	6	localObject3	Object
    //   58	1725	7	localObject4	Object
    //   123	1294	8	localObject5	Object
    //   177	1578	9	localObject6	Object
    //   203	1224	10	i	int
    //   223	1129	11	localObject7	Object
    //   252	1480	12	l2	long
    //   269	406	14	l3	long
    //   316	398	16	l4	long
    //   445	13	18	localStringBuilder	StringBuilder
    //   1266	116	19	j	int
    // Exception table:
    //   from	to	target	type
    //   1189	1196	1776	finally
    //   1765	1774	1792	java/io/IOException
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.cache.CacheInterceptor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */