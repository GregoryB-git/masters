package okhttp3.internal.http;

import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import xc.i;
import xc.i.a;

public final class HttpHeaders
{
  static
  {
    i locali = i.d;
    i.a.a("\"\\");
    i.a.a("\t ,=");
  }
  
  public static long a(Response paramResponse)
  {
    paramResponse = f.c("Content-Length");
    if (paramResponse != null) {}
    try
    {
      l = Long.parseLong(paramResponse);
    }
    catch (NumberFormatException paramResponse)
    {
      long l;
      for (;;) {}
    }
    l = -1L;
    return l;
  }
  
  public static boolean b(Response paramResponse)
  {
    if (a.b.equals("HEAD")) {
      return false;
    }
    int i = c;
    if (((i < 100) || (i >= 200)) && (i != 204) && (i != 304)) {
      return true;
    }
    return (a(paramResponse) != -1L) || ("chunked".equalsIgnoreCase(paramResponse.g("Transfer-Encoding")));
  }
  
  public static int c(int paramInt, String paramString)
  {
    try
    {
      long l = Long.parseLong(paramString);
      if (l > 2147483647L) {
        return Integer.MAX_VALUE;
      }
      if (l < 0L) {
        return 0;
      }
      paramInt = (int)l;
    }
    catch (NumberFormatException paramString)
    {
      for (;;) {}
    }
    return paramInt;
  }
  
  /* Error */
  public static void d(okhttp3.CookieJar paramCookieJar, okhttp3.HttpUrl paramHttpUrl, Headers paramHeaders)
  {
    // Byte code:
    //   0: aload_0
    //   1: getstatic 103	okhttp3/CookieJar:a	Lokhttp3/CookieJar;
    //   4: if_acmpne +4 -> 8
    //   7: return
    //   8: getstatic 109	okhttp3/Cookie:j	Ljava/util/regex/Pattern;
    //   11: astore_3
    //   12: aload_2
    //   13: getfield 112	okhttp3/Headers:a	[Ljava/lang/String;
    //   16: arraylength
    //   17: iconst_2
    //   18: idiv
    //   19: istore 4
    //   21: iconst_0
    //   22: istore 5
    //   24: iconst_0
    //   25: istore 6
    //   27: aconst_null
    //   28: astore_3
    //   29: iload 6
    //   31: iload 4
    //   33: if_icmpge +60 -> 93
    //   36: aload_3
    //   37: astore 7
    //   39: ldc 114
    //   41: aload_2
    //   42: iload 6
    //   44: invokevirtual 117	okhttp3/Headers:d	(I)Ljava/lang/String;
    //   47: invokevirtual 85	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   50: ifeq +34 -> 84
    //   53: aload_3
    //   54: astore 7
    //   56: aload_3
    //   57: ifnonnull +13 -> 70
    //   60: new 119	java/util/ArrayList
    //   63: dup
    //   64: iconst_2
    //   65: invokespecial 122	java/util/ArrayList:<init>	(I)V
    //   68: astore 7
    //   70: aload 7
    //   72: aload_2
    //   73: iload 6
    //   75: invokevirtual 124	okhttp3/Headers:f	(I)Ljava/lang/String;
    //   78: invokeinterface 129 2 0
    //   83: pop
    //   84: iinc 6 1
    //   87: aload 7
    //   89: astore_3
    //   90: goto -61 -> 29
    //   93: aload_3
    //   94: ifnull +11 -> 105
    //   97: aload_3
    //   98: invokestatic 135	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   101: astore_2
    //   102: goto +7 -> 109
    //   105: invokestatic 139	java/util/Collections:emptyList	()Ljava/util/List;
    //   108: astore_2
    //   109: aload_2
    //   110: invokeinterface 143 1 0
    //   115: istore 8
    //   117: iconst_0
    //   118: istore 4
    //   120: aconst_null
    //   121: astore_3
    //   122: iload 5
    //   124: istore 6
    //   126: iload 4
    //   128: istore 5
    //   130: aload_2
    //   131: astore 9
    //   133: iload 5
    //   135: iload 8
    //   137: if_icmpge +1683 -> 1820
    //   140: aload 9
    //   142: iload 5
    //   144: invokeinterface 147 2 0
    //   149: checkcast 65	java/lang/String
    //   152: astore 10
    //   154: invokestatic 153	java/lang/System:currentTimeMillis	()J
    //   157: lstore 11
    //   159: aload 10
    //   161: invokevirtual 156	java/lang/String:length	()I
    //   164: istore 13
    //   166: aload 10
    //   168: iload 6
    //   170: iload 13
    //   172: bipush 59
    //   174: invokestatic 162	okhttp3/internal/Util:i	(Ljava/lang/String;IIC)I
    //   177: istore 14
    //   179: aload 10
    //   181: iload 6
    //   183: iload 14
    //   185: bipush 61
    //   187: invokestatic 162	okhttp3/internal/Util:i	(Ljava/lang/String;IIC)I
    //   190: istore 15
    //   192: iload 15
    //   194: iload 14
    //   196: if_icmpne +6 -> 202
    //   199: goto +1577 -> 1776
    //   202: iload 6
    //   204: iload 15
    //   206: aload 10
    //   208: invokestatic 166	okhttp3/internal/Util:x	(IILjava/lang/String;)Ljava/lang/String;
    //   211: astore 16
    //   213: aload 16
    //   215: invokevirtual 170	java/lang/String:isEmpty	()Z
    //   218: ifne -19 -> 199
    //   221: aload 16
    //   223: invokevirtual 156	java/lang/String:length	()I
    //   226: istore 17
    //   228: iload 6
    //   230: iload 17
    //   232: if_icmpge +43 -> 275
    //   235: aload 16
    //   237: iload 6
    //   239: invokevirtual 174	java/lang/String:charAt	(I)C
    //   242: istore 18
    //   244: iload 6
    //   246: istore 4
    //   248: iload 18
    //   250: bipush 31
    //   252: if_icmple +26 -> 278
    //   255: iload 18
    //   257: bipush 127
    //   259: if_icmplt +10 -> 269
    //   262: iload 6
    //   264: istore 4
    //   266: goto +12 -> 278
    //   269: iinc 6 1
    //   272: goto -44 -> 228
    //   275: iconst_m1
    //   276: istore 4
    //   278: iload 4
    //   280: iconst_m1
    //   281: if_icmpeq +6 -> 287
    //   284: goto +1377 -> 1661
    //   287: iload 15
    //   289: iconst_1
    //   290: iadd
    //   291: iload 14
    //   293: aload 10
    //   295: invokestatic 166	okhttp3/internal/Util:x	(IILjava/lang/String;)Ljava/lang/String;
    //   298: astore 19
    //   300: aload 19
    //   302: invokevirtual 156	java/lang/String:length	()I
    //   305: istore 15
    //   307: iconst_0
    //   308: istore 6
    //   310: iload 6
    //   312: iload 15
    //   314: if_icmpge +43 -> 357
    //   317: aload 19
    //   319: iload 6
    //   321: invokevirtual 174	java/lang/String:charAt	(I)C
    //   324: istore 17
    //   326: iload 6
    //   328: istore 4
    //   330: iload 17
    //   332: bipush 31
    //   334: if_icmple +26 -> 360
    //   337: iload 17
    //   339: bipush 127
    //   341: if_icmplt +10 -> 351
    //   344: iload 6
    //   346: istore 4
    //   348: goto +12 -> 360
    //   351: iinc 6 1
    //   354: goto -44 -> 310
    //   357: iconst_m1
    //   358: istore 4
    //   360: iload 4
    //   362: iconst_m1
    //   363: if_icmpeq +6 -> 369
    //   366: goto -82 -> 284
    //   369: iload 14
    //   371: iconst_1
    //   372: iadd
    //   373: istore 6
    //   375: ldc2_w 50
    //   378: lstore 20
    //   380: aconst_null
    //   381: astore 22
    //   383: iconst_0
    //   384: istore 23
    //   386: iconst_0
    //   387: istore 24
    //   389: iconst_1
    //   390: istore 25
    //   392: iconst_0
    //   393: istore 26
    //   395: ldc2_w 175
    //   398: lstore 27
    //   400: aconst_null
    //   401: astore 7
    //   403: ldc2_w 177
    //   406: lstore 29
    //   408: iload 6
    //   410: iload 13
    //   412: if_icmpge +466 -> 878
    //   415: aload 10
    //   417: iload 6
    //   419: iload 13
    //   421: bipush 59
    //   423: invokestatic 162	okhttp3/internal/Util:i	(Ljava/lang/String;IIC)I
    //   426: istore 4
    //   428: aload 10
    //   430: iload 6
    //   432: iload 4
    //   434: bipush 61
    //   436: invokestatic 162	okhttp3/internal/Util:i	(Ljava/lang/String;IIC)I
    //   439: istore 14
    //   441: iload 6
    //   443: iload 14
    //   445: aload 10
    //   447: invokestatic 166	okhttp3/internal/Util:x	(IILjava/lang/String;)Ljava/lang/String;
    //   450: astore 31
    //   452: iload 14
    //   454: iload 4
    //   456: if_icmpge +18 -> 474
    //   459: iload 14
    //   461: iconst_1
    //   462: iadd
    //   463: iload 4
    //   465: aload 10
    //   467: invokestatic 166	okhttp3/internal/Util:x	(IILjava/lang/String;)Ljava/lang/String;
    //   470: astore_2
    //   471: goto +6 -> 477
    //   474: ldc -76
    //   476: astore_2
    //   477: aload 31
    //   479: ldc -74
    //   481: invokevirtual 85	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   484: ifeq +16 -> 500
    //   487: aload_2
    //   488: invokevirtual 156	java/lang/String:length	()I
    //   491: aload_2
    //   492: invokestatic 185	okhttp3/Cookie:b	(ILjava/lang/String;)J
    //   495: lstore 29
    //   497: goto +78 -> 575
    //   500: aload 31
    //   502: ldc -69
    //   504: invokevirtual 85	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   507: ifeq +96 -> 603
    //   510: aload_2
    //   511: invokestatic 49	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   514: lstore 32
    //   516: lload 32
    //   518: lstore 20
    //   520: lload 27
    //   522: lstore 29
    //   524: lload 32
    //   526: lconst_0
    //   527: lcmp
    //   528: ifgt +47 -> 575
    //   531: goto +23 -> 554
    //   534: astore 34
    //   536: aload_2
    //   537: ldc -67
    //   539: invokevirtual 192	java/lang/String:matches	(Ljava/lang/String;)Z
    //   542: ifeq +58 -> 600
    //   545: aload_2
    //   546: ldc -62
    //   548: invokevirtual 197	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   551: ifeq +15 -> 566
    //   554: ldc2_w 198
    //   557: lstore 20
    //   559: lload 27
    //   561: lstore 29
    //   563: goto +12 -> 575
    //   566: ldc2_w 177
    //   569: lstore 20
    //   571: lload 27
    //   573: lstore 29
    //   575: iconst_1
    //   576: istore 35
    //   578: aload 22
    //   580: astore_2
    //   581: lload 20
    //   583: lstore 32
    //   585: iload 23
    //   587: istore 36
    //   589: iload 25
    //   591: istore 37
    //   593: aload 7
    //   595: astore 34
    //   597: goto +245 -> 842
    //   600: aload 34
    //   602: athrow
    //   603: aload 31
    //   605: ldc -55
    //   607: invokevirtual 85	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   610: ifeq +87 -> 697
    //   613: aload_2
    //   614: ldc -53
    //   616: invokevirtual 206	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   619: ifne +68 -> 687
    //   622: aload_2
    //   623: astore 34
    //   625: aload_2
    //   626: ldc -53
    //   628: invokevirtual 197	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   631: ifeq +10 -> 641
    //   634: aload_2
    //   635: iconst_1
    //   636: invokevirtual 209	java/lang/String:substring	(I)Ljava/lang/String;
    //   639: astore 34
    //   641: aload 34
    //   643: invokestatic 210	okhttp3/internal/Util:c	(Ljava/lang/String;)Ljava/lang/String;
    //   646: astore_2
    //   647: aload_2
    //   648: ifnull +29 -> 677
    //   651: iconst_0
    //   652: istore 37
    //   654: lload 20
    //   656: lstore 32
    //   658: iload 23
    //   660: istore 36
    //   662: iload 26
    //   664: istore 35
    //   666: lload 27
    //   668: lstore 29
    //   670: aload 7
    //   672: astore 34
    //   674: goto +168 -> 842
    //   677: new 92	java/lang/IllegalArgumentException
    //   680: astore_2
    //   681: aload_2
    //   682: invokespecial 211	java/lang/IllegalArgumentException:<init>	()V
    //   685: aload_2
    //   686: athrow
    //   687: new 92	java/lang/IllegalArgumentException
    //   690: astore_2
    //   691: aload_2
    //   692: invokespecial 211	java/lang/IllegalArgumentException:<init>	()V
    //   695: aload_2
    //   696: athrow
    //   697: aload 31
    //   699: ldc -43
    //   701: invokevirtual 85	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   704: ifeq +32 -> 736
    //   707: aload_2
    //   708: astore 34
    //   710: aload 22
    //   712: astore_2
    //   713: lload 20
    //   715: lstore 32
    //   717: iload 23
    //   719: istore 36
    //   721: iload 25
    //   723: istore 37
    //   725: iload 26
    //   727: istore 35
    //   729: lload 27
    //   731: lstore 29
    //   733: goto +109 -> 842
    //   736: aload 31
    //   738: ldc -41
    //   740: invokevirtual 85	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   743: ifeq +32 -> 775
    //   746: iconst_1
    //   747: istore 36
    //   749: aload 22
    //   751: astore_2
    //   752: lload 20
    //   754: lstore 32
    //   756: iload 25
    //   758: istore 37
    //   760: iload 26
    //   762: istore 35
    //   764: lload 27
    //   766: lstore 29
    //   768: aload 7
    //   770: astore 34
    //   772: goto +70 -> 842
    //   775: aload 22
    //   777: astore_2
    //   778: lload 20
    //   780: lstore 32
    //   782: iload 23
    //   784: istore 36
    //   786: iload 25
    //   788: istore 37
    //   790: iload 26
    //   792: istore 35
    //   794: lload 27
    //   796: lstore 29
    //   798: aload 7
    //   800: astore 34
    //   802: aload 31
    //   804: ldc -39
    //   806: invokevirtual 85	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   809: ifeq +33 -> 842
    //   812: iconst_1
    //   813: istore 24
    //   815: aload 7
    //   817: astore 34
    //   819: lload 27
    //   821: lstore 29
    //   823: iload 26
    //   825: istore 35
    //   827: iload 25
    //   829: istore 37
    //   831: iload 23
    //   833: istore 36
    //   835: lload 20
    //   837: lstore 32
    //   839: aload 22
    //   841: astore_2
    //   842: iload 4
    //   844: iconst_1
    //   845: iadd
    //   846: istore 6
    //   848: aload_2
    //   849: astore 22
    //   851: lload 32
    //   853: lstore 20
    //   855: iload 36
    //   857: istore 23
    //   859: iload 37
    //   861: istore 25
    //   863: iload 35
    //   865: istore 26
    //   867: lload 29
    //   869: lstore 27
    //   871: aload 34
    //   873: astore 7
    //   875: goto -472 -> 403
    //   878: lload 20
    //   880: ldc2_w 198
    //   883: lcmp
    //   884: ifne +11 -> 895
    //   887: ldc2_w 198
    //   890: lstore 20
    //   892: goto +75 -> 967
    //   895: lload 20
    //   897: ldc2_w 50
    //   900: lcmp
    //   901: ifeq +62 -> 963
    //   904: lload 29
    //   906: lstore 27
    //   908: lload 20
    //   910: ldc2_w 218
    //   913: lcmp
    //   914: ifgt +11 -> 925
    //   917: lload 20
    //   919: ldc2_w 220
    //   922: lmul
    //   923: lstore 27
    //   925: lload 11
    //   927: lload 27
    //   929: ladd
    //   930: lstore 20
    //   932: lload 20
    //   934: lload 11
    //   936: lcmp
    //   937: iflt +18 -> 955
    //   940: lload 20
    //   942: ldc2_w 175
    //   945: lcmp
    //   946: ifle +6 -> 952
    //   949: goto +6 -> 955
    //   952: goto +15 -> 967
    //   955: ldc2_w 175
    //   958: lstore 20
    //   960: goto +7 -> 967
    //   963: lload 27
    //   965: lstore 20
    //   967: aload_1
    //   968: getfield 225	okhttp3/HttpUrl:d	Ljava/lang/String;
    //   971: astore_2
    //   972: aload 22
    //   974: ifnonnull +9 -> 983
    //   977: aload_2
    //   978: astore 34
    //   980: goto +79 -> 1059
    //   983: aload_2
    //   984: aload 22
    //   986: invokevirtual 69	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   989: ifeq +6 -> 995
    //   992: goto +46 -> 1038
    //   995: aload_2
    //   996: aload 22
    //   998: invokevirtual 206	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   1001: ifeq +43 -> 1044
    //   1004: aload_2
    //   1005: aload_2
    //   1006: invokevirtual 156	java/lang/String:length	()I
    //   1009: aload 22
    //   1011: invokevirtual 156	java/lang/String:length	()I
    //   1014: isub
    //   1015: iconst_1
    //   1016: isub
    //   1017: invokevirtual 174	java/lang/String:charAt	(I)C
    //   1020: bipush 46
    //   1022: if_icmpne +22 -> 1044
    //   1025: getstatic 228	okhttp3/internal/Util:q	Ljava/util/regex/Pattern;
    //   1028: aload_2
    //   1029: invokevirtual 234	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   1032: invokevirtual 238	java/util/regex/Matcher:matches	()Z
    //   1035: ifne +9 -> 1044
    //   1038: iconst_1
    //   1039: istore 6
    //   1041: goto +6 -> 1047
    //   1044: iconst_0
    //   1045: istore 6
    //   1047: aload 22
    //   1049: astore 34
    //   1051: iload 6
    //   1053: ifne +6 -> 1059
    //   1056: goto -772 -> 284
    //   1059: aload_2
    //   1060: invokevirtual 156	java/lang/String:length	()I
    //   1063: aload 34
    //   1065: invokevirtual 156	java/lang/String:length	()I
    //   1068: if_icmpeq +618 -> 1686
    //   1071: getstatic 244	okhttp3/internal/publicsuffix/PublicSuffixDatabase:h	Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;
    //   1074: astore 38
    //   1076: aload 38
    //   1078: invokevirtual 248	java/lang/Object:getClass	()Ljava/lang/Class;
    //   1081: pop
    //   1082: aload 34
    //   1084: invokestatic 253	java/net/IDN:toUnicode	(Ljava/lang/String;)Ljava/lang/String;
    //   1087: ldc -1
    //   1089: invokevirtual 259	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   1092: astore 31
    //   1094: aload 38
    //   1096: getfield 262	okhttp3/internal/publicsuffix/PublicSuffixDatabase:a	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   1099: invokevirtual 266	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   1102: ifne +86 -> 1188
    //   1105: aload 38
    //   1107: getfield 262	okhttp3/internal/publicsuffix/PublicSuffixDatabase:a	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   1110: iconst_0
    //   1111: iconst_1
    //   1112: invokevirtual 270	java/util/concurrent/atomic/AtomicBoolean:compareAndSet	(ZZ)Z
    //   1115: ifeq +73 -> 1188
    //   1118: iconst_0
    //   1119: istore 6
    //   1121: aload 38
    //   1123: invokevirtual 272	okhttp3/internal/publicsuffix/PublicSuffixDatabase:b	()V
    //   1126: iload 6
    //   1128: ifeq +78 -> 1206
    //   1131: goto +24 -> 1155
    //   1134: astore_0
    //   1135: goto +40 -> 1175
    //   1138: astore_2
    //   1139: getstatic 277	okhttp3/internal/platform/Platform:a	Lokhttp3/internal/platform/Platform;
    //   1142: iconst_5
    //   1143: ldc_w 279
    //   1146: aload_2
    //   1147: invokevirtual 283	okhttp3/internal/platform/Platform:l	(ILjava/lang/String;Ljava/lang/Throwable;)V
    //   1150: iload 6
    //   1152: ifeq +54 -> 1206
    //   1155: invokestatic 289	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   1158: invokevirtual 292	java/lang/Thread:interrupt	()V
    //   1161: goto +45 -> 1206
    //   1164: astore_2
    //   1165: invokestatic 295	java/lang/Thread:interrupted	()Z
    //   1168: pop
    //   1169: iconst_1
    //   1170: istore 6
    //   1172: goto -51 -> 1121
    //   1175: iload 6
    //   1177: ifeq +9 -> 1186
    //   1180: invokestatic 289	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   1183: invokevirtual 292	java/lang/Thread:interrupt	()V
    //   1186: aload_0
    //   1187: athrow
    //   1188: aload 38
    //   1190: getfield 298	okhttp3/internal/publicsuffix/PublicSuffixDatabase:b	Ljava/util/concurrent/CountDownLatch;
    //   1193: invokevirtual 303	java/util/concurrent/CountDownLatch:await	()V
    //   1196: goto +10 -> 1206
    //   1199: astore_2
    //   1200: invokestatic 289	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   1203: invokevirtual 292	java/lang/Thread:interrupt	()V
    //   1206: aload 38
    //   1208: monitorenter
    //   1209: aload 38
    //   1211: getfield 306	okhttp3/internal/publicsuffix/PublicSuffixDatabase:c	[B
    //   1214: ifnull +453 -> 1667
    //   1217: aload 38
    //   1219: monitorexit
    //   1220: aload 31
    //   1222: arraylength
    //   1223: istore 4
    //   1225: iload 4
    //   1227: anewarray 307	[B
    //   1230: astore 39
    //   1232: iconst_0
    //   1233: istore 6
    //   1235: iload 6
    //   1237: aload 31
    //   1239: arraylength
    //   1240: if_icmpge +25 -> 1265
    //   1243: aload 39
    //   1245: iload 6
    //   1247: aload 31
    //   1249: iload 6
    //   1251: aaload
    //   1252: getstatic 310	okhttp3/internal/Util:i	Ljava/nio/charset/Charset;
    //   1255: invokevirtual 314	java/lang/String:getBytes	(Ljava/nio/charset/Charset;)[B
    //   1258: aastore
    //   1259: iinc 6 1
    //   1262: goto -27 -> 1235
    //   1265: iconst_0
    //   1266: istore 6
    //   1268: iload 6
    //   1270: iload 4
    //   1272: if_icmpge +29 -> 1301
    //   1275: aload 38
    //   1277: getfield 306	okhttp3/internal/publicsuffix/PublicSuffixDatabase:c	[B
    //   1280: aload 39
    //   1282: iload 6
    //   1284: invokestatic 317	okhttp3/internal/publicsuffix/PublicSuffixDatabase:a	([B[[BI)Ljava/lang/String;
    //   1287: astore_2
    //   1288: aload_2
    //   1289: ifnull +6 -> 1295
    //   1292: goto +11 -> 1303
    //   1295: iinc 6 1
    //   1298: goto -30 -> 1268
    //   1301: aconst_null
    //   1302: astore_2
    //   1303: iload 4
    //   1305: iconst_1
    //   1306: if_icmple +62 -> 1368
    //   1309: aload 39
    //   1311: invokevirtual 323	[[B:clone	()Ljava/lang/Object;
    //   1314: checkcast 319	[[B
    //   1317: astore 10
    //   1319: iconst_0
    //   1320: istore 6
    //   1322: iload 6
    //   1324: aload 10
    //   1326: arraylength
    //   1327: iconst_1
    //   1328: isub
    //   1329: if_icmpge +39 -> 1368
    //   1332: aload 10
    //   1334: iload 6
    //   1336: getstatic 326	okhttp3/internal/publicsuffix/PublicSuffixDatabase:e	[B
    //   1339: aastore
    //   1340: aload 38
    //   1342: getfield 306	okhttp3/internal/publicsuffix/PublicSuffixDatabase:c	[B
    //   1345: aload 10
    //   1347: iload 6
    //   1349: invokestatic 317	okhttp3/internal/publicsuffix/PublicSuffixDatabase:a	([B[[BI)Ljava/lang/String;
    //   1352: astore 22
    //   1354: aload 22
    //   1356: ifnull +6 -> 1362
    //   1359: goto +12 -> 1371
    //   1362: iinc 6 1
    //   1365: goto -43 -> 1322
    //   1368: aconst_null
    //   1369: astore 22
    //   1371: aload 22
    //   1373: ifnull +43 -> 1416
    //   1376: iconst_0
    //   1377: istore 6
    //   1379: iload 6
    //   1381: iload 4
    //   1383: iconst_1
    //   1384: isub
    //   1385: if_icmpge +31 -> 1416
    //   1388: aload 38
    //   1390: getfield 328	okhttp3/internal/publicsuffix/PublicSuffixDatabase:d	[B
    //   1393: aload 39
    //   1395: iload 6
    //   1397: invokestatic 317	okhttp3/internal/publicsuffix/PublicSuffixDatabase:a	([B[[BI)Ljava/lang/String;
    //   1400: astore 10
    //   1402: aload 10
    //   1404: ifnull +6 -> 1410
    //   1407: goto +12 -> 1419
    //   1410: iinc 6 1
    //   1413: goto -34 -> 1379
    //   1416: aconst_null
    //   1417: astore 10
    //   1419: aload 10
    //   1421: ifnull +39 -> 1460
    //   1424: new 330	java/lang/StringBuilder
    //   1427: dup
    //   1428: invokespecial 331	java/lang/StringBuilder:<init>	()V
    //   1431: astore_2
    //   1432: aload_2
    //   1433: ldc_w 333
    //   1436: invokevirtual 337	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1439: pop
    //   1440: aload_2
    //   1441: aload 10
    //   1443: invokevirtual 337	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1446: pop
    //   1447: aload_2
    //   1448: invokevirtual 341	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1451: ldc -1
    //   1453: invokevirtual 259	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   1456: astore_2
    //   1457: goto +73 -> 1530
    //   1460: aload_2
    //   1461: ifnonnull +15 -> 1476
    //   1464: aload 22
    //   1466: ifnonnull +10 -> 1476
    //   1469: getstatic 343	okhttp3/internal/publicsuffix/PublicSuffixDatabase:g	[Ljava/lang/String;
    //   1472: astore_2
    //   1473: goto +57 -> 1530
    //   1476: aload_2
    //   1477: ifnull +13 -> 1490
    //   1480: aload_2
    //   1481: ldc -1
    //   1483: invokevirtual 259	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   1486: astore_2
    //   1487: goto +7 -> 1494
    //   1490: getstatic 345	okhttp3/internal/publicsuffix/PublicSuffixDatabase:f	[Ljava/lang/String;
    //   1493: astore_2
    //   1494: aload 22
    //   1496: ifnull +15 -> 1511
    //   1499: aload 22
    //   1501: ldc -1
    //   1503: invokevirtual 259	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   1506: astore 22
    //   1508: goto +8 -> 1516
    //   1511: getstatic 345	okhttp3/internal/publicsuffix/PublicSuffixDatabase:f	[Ljava/lang/String;
    //   1514: astore 22
    //   1516: aload_2
    //   1517: arraylength
    //   1518: aload 22
    //   1520: arraylength
    //   1521: if_icmple +6 -> 1527
    //   1524: goto +6 -> 1530
    //   1527: aload 22
    //   1529: astore_2
    //   1530: aload 31
    //   1532: arraylength
    //   1533: aload_2
    //   1534: arraylength
    //   1535: if_icmpne +20 -> 1555
    //   1538: aload_2
    //   1539: iconst_0
    //   1540: aaload
    //   1541: iconst_0
    //   1542: invokevirtual 174	java/lang/String:charAt	(I)C
    //   1545: bipush 33
    //   1547: if_icmpeq +8 -> 1555
    //   1550: aconst_null
    //   1551: astore_2
    //   1552: goto +105 -> 1657
    //   1555: aload_2
    //   1556: iconst_0
    //   1557: aaload
    //   1558: iconst_0
    //   1559: invokevirtual 174	java/lang/String:charAt	(I)C
    //   1562: istore 13
    //   1564: aload 31
    //   1566: arraylength
    //   1567: istore 4
    //   1569: aload_2
    //   1570: arraylength
    //   1571: istore 6
    //   1573: iload 13
    //   1575: bipush 33
    //   1577: if_icmpne +6 -> 1583
    //   1580: goto +6 -> 1586
    //   1583: iinc 6 1
    //   1586: iload 4
    //   1588: iload 6
    //   1590: isub
    //   1591: istore 6
    //   1593: new 330	java/lang/StringBuilder
    //   1596: dup
    //   1597: invokespecial 331	java/lang/StringBuilder:<init>	()V
    //   1600: astore_2
    //   1601: aload 34
    //   1603: ldc -1
    //   1605: invokevirtual 259	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   1608: astore 22
    //   1610: iload 6
    //   1612: aload 22
    //   1614: arraylength
    //   1615: if_icmpge +26 -> 1641
    //   1618: aload_2
    //   1619: aload 22
    //   1621: iload 6
    //   1623: aaload
    //   1624: invokevirtual 337	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1627: pop
    //   1628: aload_2
    //   1629: bipush 46
    //   1631: invokevirtual 348	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   1634: pop
    //   1635: iinc 6 1
    //   1638: goto -28 -> 1610
    //   1641: aload_2
    //   1642: aload_2
    //   1643: invokevirtual 349	java/lang/StringBuilder:length	()I
    //   1646: iconst_1
    //   1647: isub
    //   1648: invokevirtual 353	java/lang/StringBuilder:deleteCharAt	(I)Ljava/lang/StringBuilder;
    //   1651: pop
    //   1652: aload_2
    //   1653: invokevirtual 341	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1656: astore_2
    //   1657: aload_2
    //   1658: ifnonnull +28 -> 1686
    //   1661: iconst_0
    //   1662: istore 6
    //   1664: goto +112 -> 1776
    //   1667: new 355	java/lang/IllegalStateException
    //   1670: astore_0
    //   1671: aload_0
    //   1672: ldc_w 357
    //   1675: invokespecial 360	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   1678: aload_0
    //   1679: athrow
    //   1680: astore_0
    //   1681: aload 38
    //   1683: monitorexit
    //   1684: aload_0
    //   1685: athrow
    //   1686: aload 7
    //   1688: ifnull +23 -> 1711
    //   1691: aload 7
    //   1693: ldc_w 362
    //   1696: invokevirtual 197	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   1699: ifne +6 -> 1705
    //   1702: goto +9 -> 1711
    //   1705: aload 7
    //   1707: astore_2
    //   1708: goto +36 -> 1744
    //   1711: aload_1
    //   1712: invokevirtual 364	okhttp3/HttpUrl:e	()Ljava/lang/String;
    //   1715: astore_2
    //   1716: aload_2
    //   1717: bipush 47
    //   1719: invokevirtual 368	java/lang/String:lastIndexOf	(I)I
    //   1722: istore 6
    //   1724: iload 6
    //   1726: ifeq +14 -> 1740
    //   1729: aload_2
    //   1730: iconst_0
    //   1731: iload 6
    //   1733: invokevirtual 371	java/lang/String:substring	(II)Ljava/lang/String;
    //   1736: astore_2
    //   1737: goto +7 -> 1744
    //   1740: ldc_w 362
    //   1743: astore_2
    //   1744: iconst_0
    //   1745: istore 6
    //   1747: new 105	okhttp3/Cookie
    //   1750: dup
    //   1751: aload 16
    //   1753: aload 19
    //   1755: lload 20
    //   1757: aload 34
    //   1759: aload_2
    //   1760: iload 23
    //   1762: iload 24
    //   1764: iload 25
    //   1766: iload 26
    //   1768: invokespecial 374	okhttp3/Cookie:<init>	(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V
    //   1771: astore 7
    //   1773: goto +6 -> 1779
    //   1776: aconst_null
    //   1777: astore 7
    //   1779: aload 7
    //   1781: ifnonnull +8 -> 1789
    //   1784: aload_3
    //   1785: astore_2
    //   1786: goto +26 -> 1812
    //   1789: aload_3
    //   1790: astore_2
    //   1791: aload_3
    //   1792: ifnonnull +11 -> 1803
    //   1795: new 119	java/util/ArrayList
    //   1798: dup
    //   1799: invokespecial 375	java/util/ArrayList:<init>	()V
    //   1802: astore_2
    //   1803: aload_2
    //   1804: aload 7
    //   1806: invokeinterface 129 2 0
    //   1811: pop
    //   1812: iinc 5 1
    //   1815: aload_2
    //   1816: astore_3
    //   1817: goto -1684 -> 133
    //   1820: aload_3
    //   1821: ifnull +11 -> 1832
    //   1824: aload_3
    //   1825: invokestatic 135	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   1828: astore_1
    //   1829: goto +7 -> 1836
    //   1832: invokestatic 139	java/util/Collections:emptyList	()Ljava/util/List;
    //   1835: astore_1
    //   1836: aload_1
    //   1837: invokeinterface 376 1 0
    //   1842: ifeq +4 -> 1846
    //   1845: return
    //   1846: aload_0
    //   1847: invokeinterface 377 1 0
    //   1852: return
    //   1853: astore_2
    //   1854: aload 22
    //   1856: astore_2
    //   1857: lload 20
    //   1859: lstore 32
    //   1861: iload 23
    //   1863: istore 36
    //   1865: iload 25
    //   1867: istore 37
    //   1869: iload 26
    //   1871: istore 35
    //   1873: lload 27
    //   1875: lstore 29
    //   1877: aload 7
    //   1879: astore 34
    //   1881: goto -1039 -> 842
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1884	0	paramCookieJar	okhttp3.CookieJar
    //   0	1884	1	paramHttpUrl	okhttp3.HttpUrl
    //   0	1884	2	paramHeaders	Headers
    //   11	1814	3	localObject1	Object
    //   19	1572	4	i	int
    //   22	1791	5	j	int
    //   25	1721	6	k	int
    //   37	1841	7	localObject2	Object
    //   115	23	8	m	int
    //   131	10	9	localHeaders	Headers
    //   152	1290	10	localObject3	Object
    //   157	778	11	l1	long
    //   164	1414	13	n	int
    //   177	286	14	i1	int
    //   190	125	15	i2	int
    //   211	1541	16	str1	String
    //   226	116	17	i3	int
    //   242	18	18	i4	int
    //   298	1456	19	str2	String
    //   378	1480	20	l2	long
    //   381	1474	22	localObject4	Object
    //   384	1478	23	bool1	boolean
    //   387	1376	24	bool2	boolean
    //   390	1476	25	bool3	boolean
    //   393	1477	26	bool4	boolean
    //   398	1476	27	l3	long
    //   406	1470	29	l4	long
    //   450	1115	31	localObject5	Object
    //   514	1346	32	l5	long
    //   534	1	34	localNumberFormatException	NumberFormatException
    //   595	1285	34	localObject6	Object
    //   576	1296	35	bool5	boolean
    //   587	1277	36	bool6	boolean
    //   591	1277	37	bool7	boolean
    //   1074	608	38	localPublicSuffixDatabase	okhttp3.internal.publicsuffix.PublicSuffixDatabase
    //   1230	164	39	arrayOfByte	byte[][]
    // Exception table:
    //   from	to	target	type
    //   510	516	534	java/lang/NumberFormatException
    //   1121	1126	1134	finally
    //   1139	1150	1134	finally
    //   1165	1169	1134	finally
    //   1121	1126	1138	java/io/IOException
    //   1121	1126	1164	java/io/InterruptedIOException
    //   1188	1196	1199	java/lang/InterruptedException
    //   1209	1220	1680	finally
    //   1667	1680	1680	finally
    //   1681	1684	1680	finally
    //   487	497	1853	java/lang/IllegalArgumentException
    //   536	554	1853	java/lang/NumberFormatException
    //   600	603	1853	java/lang/NumberFormatException
    //   613	622	1853	java/lang/IllegalArgumentException
    //   625	641	1853	java/lang/IllegalArgumentException
    //   641	647	1853	java/lang/IllegalArgumentException
    //   677	687	1853	java/lang/IllegalArgumentException
    //   687	697	1853	java/lang/IllegalArgumentException
  }
  
  public static int e(int paramInt, String paramString1, String paramString2)
  {
    while ((paramInt < paramString1.length()) && (paramString2.indexOf(paramString1.charAt(paramInt)) == -1)) {
      paramInt++;
    }
    return paramInt;
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http.HttpHeaders
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */