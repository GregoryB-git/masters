package s0;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public final class l1
{
  public static final Logger a = Logger.getLogger(l1.class.getName());
  public static final Unsafe b;
  public static final Class<?> c;
  public static final e d;
  public static final boolean e;
  public static final boolean f;
  public static final long g;
  public static final boolean h;
  
  /* Error */
  static
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokevirtual 37	java/lang/Class:getName	()Ljava/lang/String;
    //   5: invokestatic 43	java/util/logging/Logger:getLogger	(Ljava/lang/String;)Ljava/util/logging/Logger;
    //   8: putstatic 45	s0/l1:a	Ljava/util/logging/Logger;
    //   11: invokestatic 49	s0/l1:o	()Lsun/misc/Unsafe;
    //   14: astore_0
    //   15: aload_0
    //   16: putstatic 51	s0/l1:b	Lsun/misc/Unsafe;
    //   19: getstatic 55	s0/d:a	Ljava/lang/Class;
    //   22: putstatic 57	s0/l1:c	Ljava/lang/Class;
    //   25: getstatic 62	java/lang/Long:TYPE	Ljava/lang/Class;
    //   28: astore_1
    //   29: aload_1
    //   30: invokestatic 65	s0/l1:e	(Ljava/lang/Class;)Z
    //   33: istore_2
    //   34: getstatic 68	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   37: astore_3
    //   38: aload_3
    //   39: invokestatic 65	s0/l1:e	(Ljava/lang/Class;)Z
    //   42: istore 4
    //   44: aload_0
    //   45: ifnonnull +6 -> 51
    //   48: goto +44 -> 92
    //   51: invokestatic 71	s0/d:a	()Z
    //   54: ifeq +44 -> 98
    //   57: iload_2
    //   58: ifeq +16 -> 74
    //   61: new 11	s0/l1$c
    //   64: dup
    //   65: aload_0
    //   66: invokespecial 75	s0/l1$c:<init>	(Lsun/misc/Unsafe;)V
    //   69: astore 5
    //   71: goto +37 -> 108
    //   74: iload 4
    //   76: ifeq +16 -> 92
    //   79: new 8	s0/l1$b
    //   82: dup
    //   83: aload_0
    //   84: invokespecial 76	s0/l1$b:<init>	(Lsun/misc/Unsafe;)V
    //   87: astore 5
    //   89: goto +19 -> 108
    //   92: aconst_null
    //   93: astore 5
    //   95: goto +13 -> 108
    //   98: new 14	s0/l1$d
    //   101: dup
    //   102: aload_0
    //   103: invokespecial 77	s0/l1$d:<init>	(Lsun/misc/Unsafe;)V
    //   106: astore 5
    //   108: aload 5
    //   110: putstatic 79	s0/l1:d	Ls0/l1$e;
    //   113: iconst_0
    //   114: istore 6
    //   116: aload_0
    //   117: ifnonnull +6 -> 123
    //   120: goto +53 -> 173
    //   123: aload_0
    //   124: invokevirtual 83	java/lang/Object:getClass	()Ljava/lang/Class;
    //   127: astore 5
    //   129: aload 5
    //   131: ldc 85
    //   133: iconst_1
    //   134: anewarray 33	java/lang/Class
    //   137: dup
    //   138: iconst_0
    //   139: ldc 87
    //   141: aastore
    //   142: invokevirtual 91	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   145: pop
    //   146: aload 5
    //   148: ldc 93
    //   150: iconst_2
    //   151: anewarray 33	java/lang/Class
    //   154: dup
    //   155: iconst_0
    //   156: ldc 4
    //   158: aastore
    //   159: dup
    //   160: iconst_1
    //   161: aload_1
    //   162: aastore
    //   163: invokevirtual 91	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   166: pop
    //   167: invokestatic 96	s0/l1:d	()Ljava/lang/reflect/Field;
    //   170: ifnonnull +6 -> 176
    //   173: goto +241 -> 414
    //   176: invokestatic 71	s0/d:a	()Z
    //   179: ifeq +6 -> 185
    //   182: goto +173 -> 355
    //   185: aload 5
    //   187: ldc 98
    //   189: iconst_1
    //   190: anewarray 33	java/lang/Class
    //   193: dup
    //   194: iconst_0
    //   195: aload_1
    //   196: aastore
    //   197: invokevirtual 91	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   200: pop
    //   201: getstatic 101	java/lang/Byte:TYPE	Ljava/lang/Class;
    //   204: astore_0
    //   205: aload 5
    //   207: ldc 103
    //   209: iconst_2
    //   210: anewarray 33	java/lang/Class
    //   213: dup
    //   214: iconst_0
    //   215: aload_1
    //   216: aastore
    //   217: dup
    //   218: iconst_1
    //   219: aload_0
    //   220: aastore
    //   221: invokevirtual 91	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   224: pop
    //   225: aload 5
    //   227: ldc 105
    //   229: iconst_1
    //   230: anewarray 33	java/lang/Class
    //   233: dup
    //   234: iconst_0
    //   235: aload_1
    //   236: aastore
    //   237: invokevirtual 91	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   240: pop
    //   241: aload 5
    //   243: ldc 107
    //   245: iconst_2
    //   246: anewarray 33	java/lang/Class
    //   249: dup
    //   250: iconst_0
    //   251: aload_1
    //   252: aastore
    //   253: dup
    //   254: iconst_1
    //   255: aload_3
    //   256: aastore
    //   257: invokevirtual 91	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   260: pop
    //   261: aload 5
    //   263: ldc 93
    //   265: iconst_1
    //   266: anewarray 33	java/lang/Class
    //   269: dup
    //   270: iconst_0
    //   271: aload_1
    //   272: aastore
    //   273: invokevirtual 91	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   276: pop
    //   277: aload 5
    //   279: ldc 109
    //   281: iconst_2
    //   282: anewarray 33	java/lang/Class
    //   285: dup
    //   286: iconst_0
    //   287: aload_1
    //   288: aastore
    //   289: dup
    //   290: iconst_1
    //   291: aload_1
    //   292: aastore
    //   293: invokevirtual 91	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   296: pop
    //   297: aload 5
    //   299: ldc 111
    //   301: iconst_3
    //   302: anewarray 33	java/lang/Class
    //   305: dup
    //   306: iconst_0
    //   307: aload_1
    //   308: aastore
    //   309: dup
    //   310: iconst_1
    //   311: aload_1
    //   312: aastore
    //   313: dup
    //   314: iconst_2
    //   315: aload_1
    //   316: aastore
    //   317: invokevirtual 91	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   320: pop
    //   321: aload 5
    //   323: ldc 111
    //   325: iconst_5
    //   326: anewarray 33	java/lang/Class
    //   329: dup
    //   330: iconst_0
    //   331: ldc 4
    //   333: aastore
    //   334: dup
    //   335: iconst_1
    //   336: aload_1
    //   337: aastore
    //   338: dup
    //   339: iconst_2
    //   340: ldc 4
    //   342: aastore
    //   343: dup
    //   344: iconst_3
    //   345: aload_1
    //   346: aastore
    //   347: dup
    //   348: iconst_4
    //   349: aload_1
    //   350: aastore
    //   351: invokevirtual 91	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   354: pop
    //   355: iconst_1
    //   356: istore_2
    //   357: goto +59 -> 416
    //   360: astore 5
    //   362: goto +13 -> 375
    //   365: astore 5
    //   367: goto +8 -> 375
    //   370: astore 5
    //   372: goto -5 -> 367
    //   375: getstatic 45	s0/l1:a	Ljava/util/logging/Logger;
    //   378: astore_0
    //   379: getstatic 117	java/util/logging/Level:WARNING	Ljava/util/logging/Level;
    //   382: astore_1
    //   383: new 119	java/lang/StringBuilder
    //   386: dup
    //   387: invokespecial 121	java/lang/StringBuilder:<init>	()V
    //   390: astore_3
    //   391: aload_3
    //   392: ldc 123
    //   394: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   397: pop
    //   398: aload_3
    //   399: aload 5
    //   401: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   404: pop
    //   405: aload_0
    //   406: aload_1
    //   407: aload_3
    //   408: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   411: invokevirtual 137	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;)V
    //   414: iconst_0
    //   415: istore_2
    //   416: iload_2
    //   417: putstatic 139	s0/l1:e	Z
    //   420: getstatic 51	s0/l1:b	Lsun/misc/Unsafe;
    //   423: astore 5
    //   425: aload 5
    //   427: ifnonnull +11 -> 438
    //   430: iconst_0
    //   431: istore 4
    //   433: iconst_1
    //   434: istore_2
    //   435: goto +487 -> 922
    //   438: aload 5
    //   440: invokevirtual 83	java/lang/Object:getClass	()Ljava/lang/Class;
    //   443: astore 5
    //   445: aload 5
    //   447: ldc 85
    //   449: iconst_1
    //   450: anewarray 33	java/lang/Class
    //   453: dup
    //   454: iconst_0
    //   455: ldc 87
    //   457: aastore
    //   458: invokevirtual 91	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   461: pop
    //   462: aload 5
    //   464: ldc -115
    //   466: iconst_1
    //   467: anewarray 33	java/lang/Class
    //   470: dup
    //   471: iconst_0
    //   472: ldc 33
    //   474: aastore
    //   475: invokevirtual 91	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   478: pop
    //   479: aload 5
    //   481: ldc -113
    //   483: iconst_1
    //   484: anewarray 33	java/lang/Class
    //   487: dup
    //   488: iconst_0
    //   489: ldc 33
    //   491: aastore
    //   492: invokevirtual 91	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   495: pop
    //   496: getstatic 62	java/lang/Long:TYPE	Ljava/lang/Class;
    //   499: astore_3
    //   500: aload 5
    //   502: ldc 105
    //   504: iconst_2
    //   505: anewarray 33	java/lang/Class
    //   508: dup
    //   509: iconst_0
    //   510: ldc 4
    //   512: aastore
    //   513: dup
    //   514: iconst_1
    //   515: aload_3
    //   516: aastore
    //   517: invokevirtual 91	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   520: pop
    //   521: aload 5
    //   523: ldc 107
    //   525: iconst_3
    //   526: anewarray 33	java/lang/Class
    //   529: dup
    //   530: iconst_0
    //   531: ldc 4
    //   533: aastore
    //   534: dup
    //   535: iconst_1
    //   536: aload_3
    //   537: aastore
    //   538: dup
    //   539: iconst_2
    //   540: getstatic 68	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   543: aastore
    //   544: invokevirtual 91	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   547: pop
    //   548: aload 5
    //   550: ldc 93
    //   552: iconst_2
    //   553: anewarray 33	java/lang/Class
    //   556: dup
    //   557: iconst_0
    //   558: ldc 4
    //   560: aastore
    //   561: dup
    //   562: iconst_1
    //   563: aload_3
    //   564: aastore
    //   565: invokevirtual 91	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   568: pop
    //   569: aload 5
    //   571: ldc 109
    //   573: iconst_3
    //   574: anewarray 33	java/lang/Class
    //   577: dup
    //   578: iconst_0
    //   579: ldc 4
    //   581: aastore
    //   582: dup
    //   583: iconst_1
    //   584: aload_3
    //   585: aastore
    //   586: dup
    //   587: iconst_2
    //   588: aload_3
    //   589: aastore
    //   590: invokevirtual 91	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   593: pop
    //   594: aload 5
    //   596: ldc -111
    //   598: iconst_2
    //   599: anewarray 33	java/lang/Class
    //   602: dup
    //   603: iconst_0
    //   604: ldc 4
    //   606: aastore
    //   607: dup
    //   608: iconst_1
    //   609: aload_3
    //   610: aastore
    //   611: invokevirtual 91	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   614: pop
    //   615: aload 5
    //   617: ldc -109
    //   619: iconst_3
    //   620: anewarray 33	java/lang/Class
    //   623: dup
    //   624: iconst_0
    //   625: ldc 4
    //   627: aastore
    //   628: dup
    //   629: iconst_1
    //   630: aload_3
    //   631: aastore
    //   632: dup
    //   633: iconst_2
    //   634: ldc 4
    //   636: aastore
    //   637: invokevirtual 91	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   640: pop
    //   641: invokestatic 71	s0/d:a	()Z
    //   644: ifeq +11 -> 655
    //   647: iconst_1
    //   648: istore_2
    //   649: iconst_1
    //   650: istore 4
    //   652: goto +270 -> 922
    //   655: aload 5
    //   657: ldc 98
    //   659: iconst_2
    //   660: anewarray 33	java/lang/Class
    //   663: dup
    //   664: iconst_0
    //   665: ldc 4
    //   667: aastore
    //   668: dup
    //   669: iconst_1
    //   670: aload_3
    //   671: aastore
    //   672: invokevirtual 91	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   675: pop
    //   676: aload 5
    //   678: ldc 103
    //   680: iconst_3
    //   681: anewarray 33	java/lang/Class
    //   684: dup
    //   685: iconst_0
    //   686: ldc 4
    //   688: aastore
    //   689: dup
    //   690: iconst_1
    //   691: aload_3
    //   692: aastore
    //   693: dup
    //   694: iconst_2
    //   695: getstatic 101	java/lang/Byte:TYPE	Ljava/lang/Class;
    //   698: aastore
    //   699: invokevirtual 91	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   702: pop
    //   703: aload 5
    //   705: ldc -107
    //   707: iconst_2
    //   708: anewarray 33	java/lang/Class
    //   711: dup
    //   712: iconst_0
    //   713: ldc 4
    //   715: aastore
    //   716: dup
    //   717: iconst_1
    //   718: aload_3
    //   719: aastore
    //   720: invokevirtual 91	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   723: pop
    //   724: aload 5
    //   726: ldc -105
    //   728: iconst_3
    //   729: anewarray 33	java/lang/Class
    //   732: dup
    //   733: iconst_0
    //   734: ldc 4
    //   736: aastore
    //   737: dup
    //   738: iconst_1
    //   739: aload_3
    //   740: aastore
    //   741: dup
    //   742: iconst_2
    //   743: getstatic 154	java/lang/Boolean:TYPE	Ljava/lang/Class;
    //   746: aastore
    //   747: invokevirtual 91	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   750: pop
    //   751: aload 5
    //   753: ldc -100
    //   755: iconst_2
    //   756: anewarray 33	java/lang/Class
    //   759: dup
    //   760: iconst_0
    //   761: ldc 4
    //   763: aastore
    //   764: dup
    //   765: iconst_1
    //   766: aload_3
    //   767: aastore
    //   768: invokevirtual 91	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   771: pop
    //   772: aload 5
    //   774: ldc -98
    //   776: iconst_3
    //   777: anewarray 33	java/lang/Class
    //   780: dup
    //   781: iconst_0
    //   782: ldc 4
    //   784: aastore
    //   785: dup
    //   786: iconst_1
    //   787: aload_3
    //   788: aastore
    //   789: dup
    //   790: iconst_2
    //   791: getstatic 161	java/lang/Float:TYPE	Ljava/lang/Class;
    //   794: aastore
    //   795: invokevirtual 91	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   798: pop
    //   799: iconst_1
    //   800: istore_2
    //   801: aload 5
    //   803: ldc -93
    //   805: iconst_2
    //   806: anewarray 33	java/lang/Class
    //   809: dup
    //   810: iconst_0
    //   811: ldc 4
    //   813: aastore
    //   814: dup
    //   815: iconst_1
    //   816: aload_3
    //   817: aastore
    //   818: invokevirtual 91	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   821: pop
    //   822: aload 5
    //   824: ldc -91
    //   826: iconst_3
    //   827: anewarray 33	java/lang/Class
    //   830: dup
    //   831: iconst_0
    //   832: ldc 4
    //   834: aastore
    //   835: dup
    //   836: iconst_1
    //   837: aload_3
    //   838: aastore
    //   839: dup
    //   840: iconst_2
    //   841: getstatic 168	java/lang/Double:TYPE	Ljava/lang/Class;
    //   844: aastore
    //   845: invokevirtual 91	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   848: pop
    //   849: iconst_1
    //   850: istore 4
    //   852: goto +70 -> 922
    //   855: astore 5
    //   857: iconst_1
    //   858: istore_2
    //   859: goto +21 -> 880
    //   862: iconst_1
    //   863: istore_2
    //   864: astore 5
    //   866: goto +14 -> 880
    //   869: astore 5
    //   871: iconst_1
    //   872: istore_2
    //   873: goto +7 -> 880
    //   876: astore 5
    //   878: iconst_1
    //   879: istore_2
    //   880: getstatic 45	s0/l1:a	Ljava/util/logging/Logger;
    //   883: astore_0
    //   884: getstatic 117	java/util/logging/Level:WARNING	Ljava/util/logging/Level;
    //   887: astore_1
    //   888: new 119	java/lang/StringBuilder
    //   891: dup
    //   892: invokespecial 121	java/lang/StringBuilder:<init>	()V
    //   895: astore_3
    //   896: aload_3
    //   897: ldc 123
    //   899: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   902: pop
    //   903: aload_3
    //   904: aload 5
    //   906: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   909: pop
    //   910: aload_0
    //   911: aload_1
    //   912: aload_3
    //   913: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   916: invokevirtual 137	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;)V
    //   919: iconst_0
    //   920: istore 4
    //   922: iload 4
    //   924: putstatic 170	s0/l1:f	Z
    //   927: ldc -84
    //   929: invokestatic 175	s0/l1:b	(Ljava/lang/Class;)I
    //   932: i2l
    //   933: putstatic 177	s0/l1:g	J
    //   936: ldc -77
    //   938: invokestatic 175	s0/l1:b	(Ljava/lang/Class;)I
    //   941: pop
    //   942: ldc -77
    //   944: invokestatic 182	s0/l1:c	(Ljava/lang/Class;)V
    //   947: ldc -72
    //   949: invokestatic 175	s0/l1:b	(Ljava/lang/Class;)I
    //   952: pop
    //   953: ldc -72
    //   955: invokestatic 182	s0/l1:c	(Ljava/lang/Class;)V
    //   958: ldc -70
    //   960: invokestatic 175	s0/l1:b	(Ljava/lang/Class;)I
    //   963: pop
    //   964: ldc -70
    //   966: invokestatic 182	s0/l1:c	(Ljava/lang/Class;)V
    //   969: ldc -68
    //   971: invokestatic 175	s0/l1:b	(Ljava/lang/Class;)I
    //   974: pop
    //   975: ldc -68
    //   977: invokestatic 182	s0/l1:c	(Ljava/lang/Class;)V
    //   980: ldc -66
    //   982: invokestatic 175	s0/l1:b	(Ljava/lang/Class;)I
    //   985: pop
    //   986: ldc -66
    //   988: invokestatic 182	s0/l1:c	(Ljava/lang/Class;)V
    //   991: ldc -64
    //   993: invokestatic 175	s0/l1:b	(Ljava/lang/Class;)I
    //   996: pop
    //   997: ldc -64
    //   999: invokestatic 182	s0/l1:c	(Ljava/lang/Class;)V
    //   1002: invokestatic 96	s0/l1:d	()Ljava/lang/reflect/Field;
    //   1005: astore_3
    //   1006: aload_3
    //   1007: ifnull +23 -> 1030
    //   1010: getstatic 79	s0/l1:d	Ls0/l1$e;
    //   1013: astore 5
    //   1015: aload 5
    //   1017: ifnonnull +6 -> 1023
    //   1020: goto +10 -> 1030
    //   1023: aload 5
    //   1025: aload_3
    //   1026: invokevirtual 196	s0/l1$e:j	(Ljava/lang/reflect/Field;)J
    //   1029: pop2
    //   1030: iload 6
    //   1032: istore 4
    //   1034: invokestatic 202	java/nio/ByteOrder:nativeOrder	()Ljava/nio/ByteOrder;
    //   1037: getstatic 206	java/nio/ByteOrder:BIG_ENDIAN	Ljava/nio/ByteOrder;
    //   1040: if_acmpne +6 -> 1046
    //   1043: iload_2
    //   1044: istore 4
    //   1046: iload 4
    //   1048: putstatic 208	s0/l1:h	Z
    //   1051: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   14	897	0	localObject1	Object
    //   28	884	1	localObject2	Object
    //   33	1011	2	bool1	boolean
    //   37	989	3	localObject3	Object
    //   42	1005	4	bool2	boolean
    //   69	253	5	localObject4	Object
    //   360	1	5	localObject5	Object
    //   365	1	5	localObject6	Object
    //   370	30	5	localObject7	Object
    //   423	400	5	localObject8	Object
    //   855	1	5	localObject9	Object
    //   864	1	5	localObject10	Object
    //   869	1	5	localObject11	Object
    //   876	29	5	localObject12	Object
    //   1013	11	5	locale	e
    //   114	917	6	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   205	355	360	finally
    //   129	173	365	finally
    //   176	182	365	finally
    //   185	205	365	finally
    //   123	129	370	finally
    //   594	615	855	finally
    //   655	676	855	finally
    //   500	521	862	finally
    //   548	569	862	finally
    //   751	772	862	finally
    //   801	849	862	finally
    //   445	479	869	finally
    //   703	724	869	finally
    //   438	445	876	finally
    //   479	500	876	finally
    //   521	548	876	finally
    //   569	594	876	finally
    //   615	647	876	finally
    //   676	703	876	finally
    //   724	751	876	finally
    //   772	799	876	finally
  }
  
  public static <T> T a(Class<T> paramClass)
  {
    try
    {
      paramClass = b.allocateInstance(paramClass);
      return paramClass;
    }
    catch (InstantiationException paramClass)
    {
      throw new IllegalStateException(paramClass);
    }
  }
  
  public static int b(Class<?> paramClass)
  {
    int i;
    if (f) {
      i = d.a(paramClass);
    } else {
      i = -1;
    }
    return i;
  }
  
  public static void c(Class paramClass)
  {
    if (f) {
      d.b(paramClass);
    }
  }
  
  /* Error */
  public static Field d()
  {
    // Byte code:
    //   0: invokestatic 71	s0/d:a	()Z
    //   3: istore_0
    //   4: aconst_null
    //   5: astore_1
    //   6: iload_0
    //   7: ifeq +23 -> 30
    //   10: ldc -25
    //   12: ldc -23
    //   14: invokevirtual 237	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   17: astore_2
    //   18: goto +6 -> 24
    //   21: astore_2
    //   22: aconst_null
    //   23: astore_2
    //   24: aload_2
    //   25: ifnull +5 -> 30
    //   28: aload_2
    //   29: areturn
    //   30: ldc -25
    //   32: ldc -17
    //   34: invokevirtual 237	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   37: astore_2
    //   38: goto +6 -> 44
    //   41: astore_2
    //   42: aconst_null
    //   43: astore_2
    //   44: aload_1
    //   45: astore_3
    //   46: aload_2
    //   47: ifnull +17 -> 64
    //   50: aload_1
    //   51: astore_3
    //   52: aload_2
    //   53: invokevirtual 242	java/lang/reflect/Field:getType	()Ljava/lang/Class;
    //   56: getstatic 62	java/lang/Long:TYPE	Ljava/lang/Class;
    //   59: if_acmpne +5 -> 64
    //   62: aload_2
    //   63: astore_3
    //   64: aload_3
    //   65: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   3	4	0	bool	boolean
    //   5	46	1	localObject1	Object
    //   17	1	2	localField1	Field
    //   21	1	2	localObject2	Object
    //   23	15	2	localField2	Field
    //   41	1	2	localObject3	Object
    //   43	20	2	localObject4	Object
    //   45	20	3	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   10	18	21	finally
    //   30	38	41	finally
  }
  
  public static boolean e(Class<?> paramClass)
  {
    if (!d.a()) {
      return false;
    }
    try
    {
      Class localClass1 = c;
      Class localClass2 = Boolean.TYPE;
      localClass1.getMethod("peekLong", new Class[] { paramClass, localClass2 });
      localClass1.getMethod("pokeLong", new Class[] { paramClass, Long.TYPE, localClass2 });
      Class localClass3 = Integer.TYPE;
      localClass1.getMethod("pokeInt", new Class[] { paramClass, localClass3, localClass2 });
      localClass1.getMethod("peekInt", new Class[] { paramClass, localClass2 });
      localClass1.getMethod("pokeByte", new Class[] { paramClass, Byte.TYPE });
      localClass1.getMethod("peekByte", new Class[] { paramClass });
      localClass1.getMethod("pokeByteArray", new Class[] { paramClass, byte[].class, localClass3, localClass3 });
      localClass1.getMethod("peekByteArray", new Class[] { paramClass, byte[].class, localClass3, localClass3 });
      return true;
    }
    finally {}
    return false;
  }
  
  public static boolean f(Object paramObject, long paramLong)
  {
    return d.c(paramObject, paramLong);
  }
  
  public static byte g(byte[] paramArrayOfByte, long paramLong)
  {
    return d.d(paramArrayOfByte, g + paramLong);
  }
  
  public static byte h(Object paramObject, long paramLong)
  {
    return (byte)(l(paramObject, 0xFFFFFFFFFFFFFFFC & paramLong) >>> (int)((paramLong & 0x3) << 3) & 0xFF);
  }
  
  public static byte i(Object paramObject, long paramLong)
  {
    return (byte)(l(paramObject, 0xFFFFFFFFFFFFFFFC & paramLong) >>> (int)((paramLong & 0x3) << 3) & 0xFF);
  }
  
  public static double j(Object paramObject, long paramLong)
  {
    return d.e(paramObject, paramLong);
  }
  
  public static float k(Object paramObject, long paramLong)
  {
    return d.f(paramObject, paramLong);
  }
  
  public static int l(Object paramObject, long paramLong)
  {
    return d.g(paramObject, paramLong);
  }
  
  public static long m(Object paramObject, long paramLong)
  {
    return d.h(paramObject, paramLong);
  }
  
  public static Object n(Object paramObject, long paramLong)
  {
    return d.i(paramObject, paramLong);
  }
  
  /* Error */
  public static Unsafe o()
  {
    // Byte code:
    //   0: new 6	s0/l1$a
    //   3: astore_0
    //   4: aload_0
    //   5: invokespecial 293	s0/l1$a:<init>	()V
    //   8: aload_0
    //   9: invokestatic 299	java/security/AccessController:doPrivileged	(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;
    //   12: checkcast 215	sun/misc/Unsafe
    //   15: astore_0
    //   16: goto +6 -> 22
    //   19: astore_0
    //   20: aconst_null
    //   21: astore_0
    //   22: aload_0
    //   23: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   3	13	0	localObject1	Object
    //   19	1	0	localObject2	Object
    //   21	2	0	localUnsafe	Unsafe
    // Exception table:
    //   from	to	target	type
    //   0	16	19	finally
  }
  
  public static void p(byte[] paramArrayOfByte, long paramLong, byte paramByte)
  {
    d.l(paramArrayOfByte, g + paramLong, paramByte);
  }
  
  public static void q(Object paramObject, long paramLong, byte paramByte)
  {
    long l = 0xFFFFFFFFFFFFFFFC & paramLong;
    int i = l(paramObject, l);
    int j = ((int)paramLong & 0x3) << 3;
    s(paramObject, (0xFF & paramByte) << j | i & 255 << j, l);
  }
  
  public static void r(Object paramObject, long paramLong, byte paramByte)
  {
    long l = 0xFFFFFFFFFFFFFFFC & paramLong;
    int i = l(paramObject, l);
    int j = ((int)paramLong & 0x3) << 3;
    s(paramObject, (0xFF & paramByte) << j | i & 255 << j, l);
  }
  
  public static void s(Object paramObject, int paramInt, long paramLong)
  {
    d.o(paramObject, paramInt, paramLong);
  }
  
  public static void t(Object paramObject, long paramLong1, long paramLong2)
  {
    d.p(paramObject, paramLong1, paramLong2);
  }
  
  public static void u(Object paramObject1, long paramLong, Object paramObject2)
  {
    d.q(paramObject1, paramLong, paramObject2);
  }
  
  public static final class a
    implements PrivilegedExceptionAction<Unsafe>
  {
    public static Unsafe a()
    {
      for (Object localObject : Unsafe.class.getDeclaredFields())
      {
        ((AccessibleObject)localObject).setAccessible(true);
        localObject = ((Field)localObject).get(null);
        if (Unsafe.class.isInstance(localObject)) {
          return (Unsafe)Unsafe.class.cast(localObject);
        }
      }
      return null;
    }
  }
  
  public static final class b
    extends l1.e
  {
    public b(Unsafe paramUnsafe)
    {
      super();
    }
    
    public final boolean c(Object paramObject, long paramLong)
    {
      boolean bool1 = l1.h;
      boolean bool2 = true;
      boolean bool3 = true;
      if (bool1)
      {
        if (l1.h(paramObject, paramLong) == 0) {
          bool3 = false;
        }
        return bool3;
      }
      if (l1.i(paramObject, paramLong) != 0) {
        bool3 = bool2;
      } else {
        bool3 = false;
      }
      return bool3;
    }
    
    public final byte d(Object paramObject, long paramLong)
    {
      if (l1.h) {
        return l1.h(paramObject, paramLong);
      }
      return l1.i(paramObject, paramLong);
    }
    
    public final double e(Object paramObject, long paramLong)
    {
      return Double.longBitsToDouble(h(paramObject, paramLong));
    }
    
    public final float f(Object paramObject, long paramLong)
    {
      return Float.intBitsToFloat(g(paramObject, paramLong));
    }
    
    public final void k(Object paramObject, long paramLong, boolean paramBoolean)
    {
      if (l1.h) {
        l1.q(paramObject, paramLong, (byte)paramBoolean);
      } else {
        l1.r(paramObject, paramLong, (byte)paramBoolean);
      }
    }
    
    public final void l(Object paramObject, long paramLong, byte paramByte)
    {
      if (l1.h) {
        l1.q(paramObject, paramLong, paramByte);
      } else {
        l1.r(paramObject, paramLong, paramByte);
      }
    }
    
    public final void m(Object paramObject, long paramLong, double paramDouble)
    {
      p(paramObject, paramLong, Double.doubleToLongBits(paramDouble));
    }
    
    public final void n(Object paramObject, long paramLong, float paramFloat)
    {
      o(paramObject, Float.floatToIntBits(paramFloat), paramLong);
    }
  }
  
  public static final class c
    extends l1.e
  {
    public c(Unsafe paramUnsafe)
    {
      super();
    }
    
    public final boolean c(Object paramObject, long paramLong)
    {
      boolean bool1 = l1.h;
      boolean bool2 = true;
      boolean bool3 = true;
      if (bool1)
      {
        if (l1.h(paramObject, paramLong) == 0) {
          bool3 = false;
        }
        return bool3;
      }
      if (l1.i(paramObject, paramLong) != 0) {
        bool3 = bool2;
      } else {
        bool3 = false;
      }
      return bool3;
    }
    
    public final byte d(Object paramObject, long paramLong)
    {
      if (l1.h) {
        return l1.h(paramObject, paramLong);
      }
      return l1.i(paramObject, paramLong);
    }
    
    public final double e(Object paramObject, long paramLong)
    {
      return Double.longBitsToDouble(h(paramObject, paramLong));
    }
    
    public final float f(Object paramObject, long paramLong)
    {
      return Float.intBitsToFloat(g(paramObject, paramLong));
    }
    
    public final void k(Object paramObject, long paramLong, boolean paramBoolean)
    {
      if (l1.h) {
        l1.q(paramObject, paramLong, (byte)paramBoolean);
      } else {
        l1.r(paramObject, paramLong, (byte)paramBoolean);
      }
    }
    
    public final void l(Object paramObject, long paramLong, byte paramByte)
    {
      if (l1.h) {
        l1.q(paramObject, paramLong, paramByte);
      } else {
        l1.r(paramObject, paramLong, paramByte);
      }
    }
    
    public final void m(Object paramObject, long paramLong, double paramDouble)
    {
      p(paramObject, paramLong, Double.doubleToLongBits(paramDouble));
    }
    
    public final void n(Object paramObject, long paramLong, float paramFloat)
    {
      o(paramObject, Float.floatToIntBits(paramFloat), paramLong);
    }
  }
  
  public static final class d
    extends l1.e
  {
    public d(Unsafe paramUnsafe)
    {
      super();
    }
    
    public final boolean c(Object paramObject, long paramLong)
    {
      return a.getBoolean(paramObject, paramLong);
    }
    
    public final byte d(Object paramObject, long paramLong)
    {
      return a.getByte(paramObject, paramLong);
    }
    
    public final double e(Object paramObject, long paramLong)
    {
      return a.getDouble(paramObject, paramLong);
    }
    
    public final float f(Object paramObject, long paramLong)
    {
      return a.getFloat(paramObject, paramLong);
    }
    
    public final void k(Object paramObject, long paramLong, boolean paramBoolean)
    {
      a.putBoolean(paramObject, paramLong, paramBoolean);
    }
    
    public final void l(Object paramObject, long paramLong, byte paramByte)
    {
      a.putByte(paramObject, paramLong, paramByte);
    }
    
    public final void m(Object paramObject, long paramLong, double paramDouble)
    {
      a.putDouble(paramObject, paramLong, paramDouble);
    }
    
    public final void n(Object paramObject, long paramLong, float paramFloat)
    {
      a.putFloat(paramObject, paramLong, paramFloat);
    }
  }
  
  public static abstract class e
  {
    public Unsafe a;
    
    public e(Unsafe paramUnsafe)
    {
      a = paramUnsafe;
    }
    
    public final int a(Class<?> paramClass)
    {
      return a.arrayBaseOffset(paramClass);
    }
    
    public final int b(Class<?> paramClass)
    {
      return a.arrayIndexScale(paramClass);
    }
    
    public abstract boolean c(Object paramObject, long paramLong);
    
    public abstract byte d(Object paramObject, long paramLong);
    
    public abstract double e(Object paramObject, long paramLong);
    
    public abstract float f(Object paramObject, long paramLong);
    
    public final int g(Object paramObject, long paramLong)
    {
      return a.getInt(paramObject, paramLong);
    }
    
    public final long h(Object paramObject, long paramLong)
    {
      return a.getLong(paramObject, paramLong);
    }
    
    public final Object i(Object paramObject, long paramLong)
    {
      return a.getObject(paramObject, paramLong);
    }
    
    public final long j(Field paramField)
    {
      return a.objectFieldOffset(paramField);
    }
    
    public abstract void k(Object paramObject, long paramLong, boolean paramBoolean);
    
    public abstract void l(Object paramObject, long paramLong, byte paramByte);
    
    public abstract void m(Object paramObject, long paramLong, double paramDouble);
    
    public abstract void n(Object paramObject, long paramLong, float paramFloat);
    
    public final void o(Object paramObject, int paramInt, long paramLong)
    {
      a.putInt(paramObject, paramLong, paramInt);
    }
    
    public final void p(Object paramObject, long paramLong1, long paramLong2)
    {
      a.putLong(paramObject, paramLong1, paramLong2);
    }
    
    public final void q(Object paramObject1, long paramLong, Object paramObject2)
    {
      a.putObject(paramObject1, paramLong, paramObject2);
    }
  }
}

/* Location:
 * Qualified Name:     s0.l1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */