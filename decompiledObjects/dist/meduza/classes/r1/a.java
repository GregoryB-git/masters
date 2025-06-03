package r1;

import a0.j;
import ec.i;
import f;
import g;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import lc.h;
import lc.k;

public final class a
{
  public final String a;
  public final Map<String, a> b;
  public final Set<b> c;
  public final Set<d> d;
  
  public a(String paramString, Map paramMap, AbstractSet paramAbstractSet1, AbstractSet paramAbstractSet2)
  {
    a = paramString;
    b = paramMap;
    c = paramAbstractSet1;
    d = paramAbstractSet2;
  }
  
  /* Error */
  public static final a a(u1.c paramc, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: astore_2
    //   2: new 49	java/lang/StringBuilder
    //   5: dup
    //   6: invokespecial 50	java/lang/StringBuilder:<init>	()V
    //   9: astore_3
    //   10: aload_3
    //   11: ldc 52
    //   13: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   16: pop
    //   17: aload_3
    //   18: aload_1
    //   19: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   22: pop
    //   23: ldc 58
    //   25: astore 4
    //   27: aload_3
    //   28: ldc 58
    //   30: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: pop
    //   34: aload_2
    //   35: aload_3
    //   36: invokevirtual 62	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   39: invokevirtual 68	u1/c:C	(Ljava/lang/String;)Landroid/database/Cursor;
    //   42: astore 5
    //   44: aload 5
    //   46: invokeinterface 74 1 0
    //   51: istore 6
    //   53: ldc 76
    //   55: astore_3
    //   56: iload 6
    //   58: ifgt +11 -> 69
    //   61: getstatic 81	sb/t:a	Lsb/t;
    //   64: astore 7
    //   66: goto +225 -> 291
    //   69: aload 5
    //   71: ldc 76
    //   73: invokeinterface 85 2 0
    //   78: istore 6
    //   80: aload 5
    //   82: ldc 87
    //   84: invokeinterface 85 2 0
    //   89: istore 8
    //   91: aload 5
    //   93: ldc 89
    //   95: invokeinterface 85 2 0
    //   100: istore 9
    //   102: aload 5
    //   104: ldc 91
    //   106: invokeinterface 85 2 0
    //   111: istore 10
    //   113: aload 5
    //   115: ldc 93
    //   117: invokeinterface 85 2 0
    //   122: istore 11
    //   124: new 95	tb/c
    //   127: astore 7
    //   129: aload 7
    //   131: invokespecial 96	tb/c:<init>	()V
    //   134: aload 5
    //   136: invokeinterface 100 1 0
    //   141: ifeq +116 -> 257
    //   144: aload 5
    //   146: iload 6
    //   148: invokeinterface 104 2 0
    //   153: astore 12
    //   155: aload 5
    //   157: iload 8
    //   159: invokeinterface 104 2 0
    //   164: astore 13
    //   166: aload 5
    //   168: iload 9
    //   170: invokeinterface 108 2 0
    //   175: ifeq +9 -> 184
    //   178: iconst_1
    //   179: istore 14
    //   181: goto +6 -> 187
    //   184: iconst_0
    //   185: istore 14
    //   187: aload 5
    //   189: iload 10
    //   191: invokeinterface 108 2 0
    //   196: istore 15
    //   198: aload 5
    //   200: iload 11
    //   202: invokeinterface 104 2 0
    //   207: astore 16
    //   209: aload 12
    //   211: ldc 76
    //   213: invokestatic 110	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   216: new 6	r1/a$a
    //   219: astore 17
    //   221: aload 13
    //   223: ldc 87
    //   225: invokestatic 110	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   228: aload 17
    //   230: iload 15
    //   232: iconst_2
    //   233: aload 12
    //   235: aload 13
    //   237: aload 16
    //   239: iload 14
    //   241: invokespecial 113	r1/a$a:<init>	(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    //   244: aload 7
    //   246: aload 12
    //   248: aload 17
    //   250: invokevirtual 117	tb/c:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   253: pop
    //   254: goto -120 -> 134
    //   257: aload 7
    //   259: invokevirtual 119	tb/c:c	()V
    //   262: aload 7
    //   264: iconst_1
    //   265: putfield 123	tb/c:u	Z
    //   268: aload 7
    //   270: getfield 127	tb/c:q	I
    //   273: ifle +6 -> 279
    //   276: goto +15 -> 291
    //   279: getstatic 131	tb/c:v	Ltb/c;
    //   282: astore 7
    //   284: aload 7
    //   286: ldc -123
    //   288: invokestatic 135	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
    //   291: aload 5
    //   293: aconst_null
    //   294: invokestatic 141	x6/b:L	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   297: new 49	java/lang/StringBuilder
    //   300: dup
    //   301: invokespecial 50	java/lang/StringBuilder:<init>	()V
    //   304: astore 5
    //   306: aload 5
    //   308: ldc -113
    //   310: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   313: pop
    //   314: aload 5
    //   316: aload_1
    //   317: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   320: pop
    //   321: aload 5
    //   323: ldc 58
    //   325: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   328: pop
    //   329: aload_2
    //   330: aload 5
    //   332: invokevirtual 62	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   335: invokevirtual 68	u1/c:C	(Ljava/lang/String;)Landroid/database/Cursor;
    //   338: astore 16
    //   340: aload 16
    //   342: ldc -111
    //   344: invokeinterface 85 2 0
    //   349: istore 11
    //   351: aload 16
    //   353: ldc -109
    //   355: invokeinterface 85 2 0
    //   360: istore 18
    //   362: aload 16
    //   364: ldc -107
    //   366: invokeinterface 85 2 0
    //   371: istore 19
    //   373: aload 16
    //   375: ldc -105
    //   377: invokeinterface 85 2 0
    //   382: istore 15
    //   384: aload 16
    //   386: ldc -103
    //   388: invokeinterface 85 2 0
    //   393: istore 20
    //   395: aload 16
    //   397: ldc -111
    //   399: invokeinterface 85 2 0
    //   404: istore 9
    //   406: aload 16
    //   408: ldc -109
    //   410: invokeinterface 85 2 0
    //   415: istore 8
    //   417: aload 16
    //   419: ldc -101
    //   421: invokeinterface 85 2 0
    //   426: istore 10
    //   428: aload 16
    //   430: ldc -99
    //   432: invokeinterface 85 2 0
    //   437: istore 6
    //   439: new 159	tb/b
    //   442: astore 5
    //   444: aload 5
    //   446: aconst_null
    //   447: invokespecial 162	tb/b:<init>	(Ljava/lang/Object;)V
    //   450: aload 16
    //   452: invokeinterface 100 1 0
    //   457: ifeq +90 -> 547
    //   460: new 14	r1/a$c
    //   463: astore 12
    //   465: aload 16
    //   467: iload 9
    //   469: invokeinterface 108 2 0
    //   474: istore 21
    //   476: aload 16
    //   478: iload 8
    //   480: invokeinterface 108 2 0
    //   485: istore 22
    //   487: aload 16
    //   489: iload 10
    //   491: invokeinterface 104 2 0
    //   496: astore 13
    //   498: aload 13
    //   500: ldc -92
    //   502: invokestatic 110	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   505: aload 16
    //   507: iload 6
    //   509: invokeinterface 104 2 0
    //   514: astore 17
    //   516: aload 17
    //   518: ldc -90
    //   520: invokestatic 110	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   523: aload 12
    //   525: aload 13
    //   527: iload 21
    //   529: iload 22
    //   531: aload 17
    //   533: invokespecial 169	r1/a$c:<init>	(Ljava/lang/String;IILjava/lang/String;)V
    //   536: aload 5
    //   538: aload 12
    //   540: invokevirtual 173	tb/b:add	(Ljava/lang/Object;)Z
    //   543: pop
    //   544: goto -94 -> 450
    //   547: aload 5
    //   549: invokevirtual 176	tb/b:m	()V
    //   552: aload 5
    //   554: iconst_1
    //   555: putfield 178	tb/b:c	Z
    //   558: aload 5
    //   560: getfield 180	tb/b:b	I
    //   563: ifle +6 -> 569
    //   566: goto +8 -> 574
    //   569: getstatic 183	tb/b:d	Ltb/b;
    //   572: astore 5
    //   574: aload 5
    //   576: ldc -71
    //   578: invokestatic 34	ec/i:e	(Ljava/lang/Object;Ljava/lang/String;)V
    //   581: aload 5
    //   583: invokevirtual 187	tb/b:a	()I
    //   586: iconst_1
    //   587: if_icmpgt +13 -> 600
    //   590: aload 5
    //   592: invokestatic 192	sb/q:u	(Ljava/lang/Iterable;)Ljava/util/List;
    //   595: astore 5
    //   597: goto +40 -> 637
    //   600: aload 5
    //   602: iconst_0
    //   603: anewarray 194	java/lang/Comparable
    //   606: invokevirtual 198	tb/b:toArray	([Ljava/lang/Object;)[Ljava/lang/Object;
    //   609: astore 17
    //   611: aload 17
    //   613: checkcast 200	[Ljava/lang/Comparable;
    //   616: astore 5
    //   618: aload 5
    //   620: arraylength
    //   621: iconst_1
    //   622: if_icmple +8 -> 630
    //   625: aload 5
    //   627: invokestatic 206	java/util/Arrays:sort	([Ljava/lang/Object;)V
    //   630: aload 17
    //   632: invokestatic 212	sb/j:j	([Ljava/lang/Object;)Ljava/util/List;
    //   635: astore 5
    //   637: aload 16
    //   639: iconst_m1
    //   640: invokeinterface 216 2 0
    //   645: pop
    //   646: new 218	tb/g
    //   649: astore 17
    //   651: aload 17
    //   653: invokespecial 219	tb/g:<init>	()V
    //   656: iload 11
    //   658: istore 6
    //   660: aload 16
    //   662: invokeinterface 100 1 0
    //   667: ifeq +264 -> 931
    //   670: aload 16
    //   672: iload 18
    //   674: invokeinterface 108 2 0
    //   679: ifeq +6 -> 685
    //   682: goto -22 -> 660
    //   685: aload 16
    //   687: iload 6
    //   689: invokeinterface 108 2 0
    //   694: istore 8
    //   696: new 221	java/util/ArrayList
    //   699: astore 12
    //   701: aload 12
    //   703: invokespecial 222	java/util/ArrayList:<init>	()V
    //   706: new 221	java/util/ArrayList
    //   709: astore 13
    //   711: aload 13
    //   713: invokespecial 222	java/util/ArrayList:<init>	()V
    //   716: new 221	java/util/ArrayList
    //   719: astore 23
    //   721: aload 23
    //   723: invokespecial 222	java/util/ArrayList:<init>	()V
    //   726: aload 5
    //   728: invokeinterface 228 1 0
    //   733: astore 24
    //   735: aload 24
    //   737: invokeinterface 233 1 0
    //   742: ifeq +50 -> 792
    //   745: aload 24
    //   747: invokeinterface 237 1 0
    //   752: astore 25
    //   754: aload 25
    //   756: checkcast 14	r1/a$c
    //   759: getfield 239	r1/a$c:a	I
    //   762: iload 8
    //   764: if_icmpne +9 -> 773
    //   767: iconst_1
    //   768: istore 10
    //   770: goto +6 -> 776
    //   773: iconst_0
    //   774: istore 10
    //   776: iload 10
    //   778: ifeq +11 -> 789
    //   781: aload 23
    //   783: aload 25
    //   785: invokevirtual 240	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   788: pop
    //   789: goto -54 -> 735
    //   792: aload 23
    //   794: invokevirtual 241	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   797: astore 23
    //   799: aload 23
    //   801: invokeinterface 233 1 0
    //   806: ifeq +40 -> 846
    //   809: aload 23
    //   811: invokeinterface 237 1 0
    //   816: checkcast 14	r1/a$c
    //   819: astore 24
    //   821: aload 12
    //   823: aload 24
    //   825: getfield 243	r1/a$c:c	Ljava/lang/String;
    //   828: invokevirtual 240	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   831: pop
    //   832: aload 13
    //   834: aload 24
    //   836: getfield 245	r1/a$c:d	Ljava/lang/String;
    //   839: invokevirtual 240	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   842: pop
    //   843: goto -44 -> 799
    //   846: new 11	r1/a$b
    //   849: astore 24
    //   851: aload 16
    //   853: iload 19
    //   855: invokeinterface 104 2 0
    //   860: astore 23
    //   862: aload 23
    //   864: ldc -9
    //   866: invokestatic 110	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   869: aload 16
    //   871: iload 15
    //   873: invokeinterface 104 2 0
    //   878: astore 26
    //   880: aload 26
    //   882: ldc -7
    //   884: invokestatic 110	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   887: aload 16
    //   889: iload 20
    //   891: invokeinterface 104 2 0
    //   896: astore 25
    //   898: aload 25
    //   900: ldc -5
    //   902: invokestatic 110	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   905: aload 24
    //   907: aload 23
    //   909: aload 26
    //   911: aload 25
    //   913: aload 12
    //   915: aload 13
    //   917: invokespecial 254	r1/a$b:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V
    //   920: aload 17
    //   922: aload 24
    //   924: invokevirtual 255	tb/g:add	(Ljava/lang/Object;)Z
    //   927: pop
    //   928: goto -268 -> 660
    //   931: aload 17
    //   933: invokestatic 260	va/a:a	(Ltb/g;)Ltb/g;
    //   936: astore 17
    //   938: aload 16
    //   940: aconst_null
    //   941: invokestatic 141	x6/b:L	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   944: new 49	java/lang/StringBuilder
    //   947: dup
    //   948: invokespecial 50	java/lang/StringBuilder:<init>	()V
    //   951: astore 5
    //   953: aload 5
    //   955: ldc_w 262
    //   958: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   961: pop
    //   962: aload 5
    //   964: aload_1
    //   965: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   968: pop
    //   969: aload 5
    //   971: ldc 58
    //   973: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   976: pop
    //   977: aload_2
    //   978: aload 5
    //   980: invokevirtual 62	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   983: invokevirtual 68	u1/c:C	(Ljava/lang/String;)Landroid/database/Cursor;
    //   986: astore_2
    //   987: aload_3
    //   988: astore 5
    //   990: aload_2
    //   991: aload 5
    //   993: invokeinterface 85 2 0
    //   998: istore 8
    //   1000: aload_2
    //   1001: ldc_w 264
    //   1004: invokeinterface 85 2 0
    //   1009: istore 10
    //   1011: aload_2
    //   1012: ldc_w 266
    //   1015: invokeinterface 85 2 0
    //   1020: istore 6
    //   1022: iload 8
    //   1024: iconst_m1
    //   1025: if_icmpeq +473 -> 1498
    //   1028: iload 10
    //   1030: iconst_m1
    //   1031: if_icmpeq +467 -> 1498
    //   1034: iload 6
    //   1036: iconst_m1
    //   1037: if_icmpne +6 -> 1043
    //   1040: goto +458 -> 1498
    //   1043: new 218	tb/g
    //   1046: astore 16
    //   1048: aload 16
    //   1050: invokespecial 219	tb/g:<init>	()V
    //   1053: aload 4
    //   1055: astore_3
    //   1056: aload_2
    //   1057: invokeinterface 100 1 0
    //   1062: ifeq +422 -> 1484
    //   1065: ldc_w 267
    //   1068: aload_2
    //   1069: iload 10
    //   1071: invokeinterface 104 2 0
    //   1076: invokestatic 270	ec/i:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1079: ifne +6 -> 1085
    //   1082: goto -26 -> 1056
    //   1085: aload_2
    //   1086: iload 8
    //   1088: invokeinterface 104 2 0
    //   1093: astore 12
    //   1095: aload_2
    //   1096: iload 6
    //   1098: invokeinterface 108 2 0
    //   1103: iconst_1
    //   1104: if_icmpne +9 -> 1113
    //   1107: iconst_1
    //   1108: istore 14
    //   1110: goto +6 -> 1116
    //   1113: iconst_0
    //   1114: istore 14
    //   1116: aload 12
    //   1118: aload 5
    //   1120: invokestatic 110	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   1123: new 49	java/lang/StringBuilder
    //   1126: astore 4
    //   1128: aload 4
    //   1130: invokespecial 50	java/lang/StringBuilder:<init>	()V
    //   1133: aload 4
    //   1135: ldc_w 272
    //   1138: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1141: pop
    //   1142: aload 4
    //   1144: aload 12
    //   1146: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1149: pop
    //   1150: aload 4
    //   1152: aload_3
    //   1153: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1156: pop
    //   1157: aload_0
    //   1158: aload 4
    //   1160: invokevirtual 62	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1163: invokevirtual 68	u1/c:C	(Ljava/lang/String;)Landroid/database/Cursor;
    //   1166: astore 13
    //   1168: aload 13
    //   1170: ldc_w 274
    //   1173: invokeinterface 85 2 0
    //   1178: istore 20
    //   1180: aload 13
    //   1182: ldc_w 276
    //   1185: invokeinterface 85 2 0
    //   1190: istore 11
    //   1192: aload 13
    //   1194: aload 5
    //   1196: invokeinterface 85 2 0
    //   1201: istore 15
    //   1203: aload 13
    //   1205: ldc_w 278
    //   1208: invokeinterface 85 2 0
    //   1213: istore 9
    //   1215: iload 20
    //   1217: iconst_m1
    //   1218: if_icmpeq +219 -> 1437
    //   1221: iload 11
    //   1223: iconst_m1
    //   1224: if_icmpeq +213 -> 1437
    //   1227: iload 15
    //   1229: iconst_m1
    //   1230: if_icmpeq +207 -> 1437
    //   1233: iload 9
    //   1235: iconst_m1
    //   1236: if_icmpne +6 -> 1242
    //   1239: goto +198 -> 1437
    //   1242: new 280	java/util/TreeMap
    //   1245: astore 24
    //   1247: aload 24
    //   1249: invokespecial 281	java/util/TreeMap:<init>	()V
    //   1252: new 280	java/util/TreeMap
    //   1255: astore 23
    //   1257: aload 23
    //   1259: invokespecial 281	java/util/TreeMap:<init>	()V
    //   1262: aload 13
    //   1264: invokeinterface 100 1 0
    //   1269: ifeq +102 -> 1371
    //   1272: aload 13
    //   1274: iload 11
    //   1276: invokeinterface 108 2 0
    //   1281: ifge +6 -> 1287
    //   1284: goto -22 -> 1262
    //   1287: aload 13
    //   1289: iload 20
    //   1291: invokeinterface 108 2 0
    //   1296: istore 18
    //   1298: aload 13
    //   1300: iload 15
    //   1302: invokeinterface 104 2 0
    //   1307: astore 25
    //   1309: aload 13
    //   1311: iload 9
    //   1313: invokeinterface 108 2 0
    //   1318: ifle +11 -> 1329
    //   1321: ldc_w 283
    //   1324: astore 4
    //   1326: goto +8 -> 1334
    //   1329: ldc_w 285
    //   1332: astore 4
    //   1334: aload 25
    //   1336: ldc_w 287
    //   1339: invokestatic 110	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   1342: aload 24
    //   1344: iload 18
    //   1346: invokestatic 293	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1349: aload 25
    //   1351: invokevirtual 294	java/util/TreeMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1354: pop
    //   1355: aload 23
    //   1357: iload 18
    //   1359: invokestatic 293	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1362: aload 4
    //   1364: invokevirtual 294	java/util/TreeMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1367: pop
    //   1368: goto -106 -> 1262
    //   1371: aload 24
    //   1373: invokevirtual 298	java/util/TreeMap:values	()Ljava/util/Collection;
    //   1376: astore 4
    //   1378: aload 4
    //   1380: ldc_w 300
    //   1383: invokestatic 110	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   1386: aload 4
    //   1388: invokestatic 192	sb/q:u	(Ljava/lang/Iterable;)Ljava/util/List;
    //   1391: astore 4
    //   1393: aload 23
    //   1395: invokevirtual 298	java/util/TreeMap:values	()Ljava/util/Collection;
    //   1398: astore 23
    //   1400: aload 23
    //   1402: ldc_w 302
    //   1405: invokestatic 110	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   1408: new 17	r1/a$d
    //   1411: dup
    //   1412: aload 12
    //   1414: iload 14
    //   1416: aload 4
    //   1418: aload 23
    //   1420: invokestatic 192	sb/q:u	(Ljava/lang/Iterable;)Ljava/util/List;
    //   1423: invokespecial 305	r1/a$d:<init>	(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V
    //   1426: astore 4
    //   1428: aload 13
    //   1430: aconst_null
    //   1431: invokestatic 141	x6/b:L	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   1434: goto +12 -> 1446
    //   1437: aload 13
    //   1439: aconst_null
    //   1440: invokestatic 141	x6/b:L	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   1443: aconst_null
    //   1444: astore 4
    //   1446: aload 4
    //   1448: ifnonnull +13 -> 1461
    //   1451: aload_2
    //   1452: aconst_null
    //   1453: invokestatic 141	x6/b:L	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   1456: aconst_null
    //   1457: astore_0
    //   1458: goto +47 -> 1505
    //   1461: aload 16
    //   1463: aload 4
    //   1465: invokevirtual 255	tb/g:add	(Ljava/lang/Object;)Z
    //   1468: pop
    //   1469: goto -413 -> 1056
    //   1472: astore_1
    //   1473: aload_1
    //   1474: athrow
    //   1475: astore_0
    //   1476: aload 13
    //   1478: aload_1
    //   1479: invokestatic 141	x6/b:L	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   1482: aload_0
    //   1483: athrow
    //   1484: aload 16
    //   1486: invokestatic 260	va/a:a	(Ltb/g;)Ltb/g;
    //   1489: astore_0
    //   1490: aload_2
    //   1491: aconst_null
    //   1492: invokestatic 141	x6/b:L	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   1495: goto +10 -> 1505
    //   1498: aconst_null
    //   1499: astore_0
    //   1500: aload_2
    //   1501: aconst_null
    //   1502: invokestatic 141	x6/b:L	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   1505: new 2	r1/a
    //   1508: dup
    //   1509: aload_1
    //   1510: aload 7
    //   1512: aload 17
    //   1514: aload_0
    //   1515: invokespecial 307	r1/a:<init>	(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V
    //   1518: areturn
    //   1519: astore_0
    //   1520: aload_0
    //   1521: athrow
    //   1522: astore_1
    //   1523: aload_2
    //   1524: aload_0
    //   1525: invokestatic 141	x6/b:L	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   1528: aload_1
    //   1529: athrow
    //   1530: astore_1
    //   1531: aload_1
    //   1532: athrow
    //   1533: astore_0
    //   1534: aload 16
    //   1536: aload_1
    //   1537: invokestatic 141	x6/b:L	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   1540: aload_0
    //   1541: athrow
    //   1542: astore_0
    //   1543: aload_0
    //   1544: athrow
    //   1545: astore_1
    //   1546: aload 5
    //   1548: aload_0
    //   1549: invokestatic 141	x6/b:L	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   1552: aload_1
    //   1553: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1554	0	paramc	u1.c
    //   0	1554	1	paramString	String
    //   1	1523	2	localObject1	Object
    //   9	1144	3	localObject2	Object
    //   25	1439	4	localObject3	Object
    //   42	1505	5	localObject4	Object
    //   51	1046	6	i	int
    //   64	1447	7	localObject5	Object
    //   89	998	8	j	int
    //   100	1212	9	k	int
    //   111	959	10	m	int
    //   122	1153	11	n	int
    //   153	1260	12	localObject6	Object
    //   164	1313	13	localObject7	Object
    //   179	1236	14	bool	boolean
    //   196	1105	15	i1	int
    //   207	1328	16	localObject8	Object
    //   219	1294	17	localObject9	Object
    //   360	998	18	i2	int
    //   371	483	19	i3	int
    //   393	897	20	i4	int
    //   474	54	21	i5	int
    //   485	45	22	i6	int
    //   719	700	23	localObject10	Object
    //   733	639	24	localObject11	Object
    //   752	598	25	localObject12	Object
    //   878	32	26	str	String
    // Exception table:
    //   from	to	target	type
    //   1168	1215	1472	finally
    //   1242	1262	1472	finally
    //   1262	1284	1472	finally
    //   1287	1321	1472	finally
    //   1334	1368	1472	finally
    //   1371	1428	1472	finally
    //   1473	1475	1475	finally
    //   990	1022	1519	finally
    //   1043	1053	1519	finally
    //   1056	1082	1519	finally
    //   1085	1107	1519	finally
    //   1116	1168	1519	finally
    //   1428	1434	1519	finally
    //   1437	1443	1519	finally
    //   1461	1469	1519	finally
    //   1476	1484	1519	finally
    //   1484	1490	1519	finally
    //   1520	1522	1522	finally
    //   340	450	1530	finally
    //   450	544	1530	finally
    //   547	566	1530	finally
    //   569	574	1530	finally
    //   574	597	1530	finally
    //   600	630	1530	finally
    //   630	637	1530	finally
    //   637	656	1530	finally
    //   660	682	1530	finally
    //   685	735	1530	finally
    //   735	767	1530	finally
    //   781	789	1530	finally
    //   792	799	1530	finally
    //   799	843	1530	finally
    //   846	928	1530	finally
    //   931	938	1530	finally
    //   1531	1533	1533	finally
    //   44	53	1542	finally
    //   61	66	1542	finally
    //   69	134	1542	finally
    //   134	178	1542	finally
    //   187	254	1542	finally
    //   257	276	1542	finally
    //   279	291	1542	finally
    //   1543	1545	1545	finally
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof a)) {
      return false;
    }
    Object localObject = a;
    a locala = (a)paramObject;
    if (!i.a(localObject, a)) {
      return false;
    }
    if (!i.a(b, b)) {
      return false;
    }
    if (!i.a(c, c)) {
      return false;
    }
    paramObject = d;
    boolean bool2 = bool1;
    if (paramObject != null)
    {
      localObject = d;
      if (localObject == null) {
        bool2 = bool1;
      } else {
        bool2 = i.a(paramObject, localObject);
      }
    }
    return bool2;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    int j = b.hashCode();
    return c.hashCode() + (j + i * 31) * 31;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("TableInfo{name='");
    localStringBuilder.append(a);
    localStringBuilder.append("', columns=");
    localStringBuilder.append(b);
    localStringBuilder.append(", foreignKeys=");
    localStringBuilder.append(c);
    localStringBuilder.append(", indices=");
    localStringBuilder.append(d);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;
    
    public a(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, boolean paramBoolean)
    {
      a = paramString1;
      b = paramString2;
      c = paramBoolean;
      d = paramInt1;
      e = paramString3;
      f = paramInt2;
      paramString1 = Locale.US;
      i.d(paramString1, "US");
      paramString1 = paramString2.toUpperCase(paramString1);
      i.d(paramString1, "this as java.lang.String).toUpperCase(locale)");
      if (k.o0(paramString1, "INT")) {
        paramInt1 = 3;
      } else if ((!k.o0(paramString1, "CHAR")) && (!k.o0(paramString1, "CLOB")) && (!k.o0(paramString1, "TEXT")))
      {
        if (k.o0(paramString1, "BLOB")) {
          paramInt1 = 5;
        } else if ((!k.o0(paramString1, "REAL")) && (!k.o0(paramString1, "FLOA")) && (!k.o0(paramString1, "DOUB"))) {
          paramInt1 = 1;
        } else {
          paramInt1 = 4;
        }
      }
      else {
        paramInt1 = 2;
      }
      g = paramInt1;
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof a)) {
        return false;
      }
      int i = d;
      paramObject = (a)paramObject;
      if (i != d) {
        return false;
      }
      if (!i.a(a, a)) {
        return false;
      }
      if (c != c) {
        return false;
      }
      String str;
      if ((f == 1) && (f == 2))
      {
        str = e;
        if ((str != null) && (!a.a(str, e))) {
          return false;
        }
      }
      if ((f == 2) && (f == 1))
      {
        str = e;
        if ((str != null) && (!a.a(str, e))) {
          return false;
        }
      }
      i = f;
      if ((i != 0) && (i == f))
      {
        str = e;
        if (str != null ? !a.a(str, e) : e != null) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0) {
          return false;
        }
      }
      if (g != g) {
        bool = false;
      }
      return bool;
    }
    
    public final int hashCode()
    {
      int i = a.hashCode();
      int j = g;
      int k;
      if (c) {
        k = 1231;
      } else {
        k = 1237;
      }
      return ((i * 31 + j) * 31 + k) * 31 + d;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = f.l("Column{name='");
      localStringBuilder.append(a);
      localStringBuilder.append("', type='");
      localStringBuilder.append(b);
      localStringBuilder.append("', affinity='");
      localStringBuilder.append(g);
      localStringBuilder.append("', notNull=");
      localStringBuilder.append(c);
      localStringBuilder.append(", primaryKeyPosition=");
      localStringBuilder.append(d);
      localStringBuilder.append(", defaultValue='");
      String str1 = e;
      String str2 = str1;
      if (str1 == null) {
        str2 = "undefined";
      }
      return g.f(localStringBuilder, str2, "'}");
    }
    
    public static final class a
    {
      public static boolean a(String paramString1, String paramString2)
      {
        i.e(paramString1, "current");
        if (i.a(paramString1, paramString2)) {
          return true;
        }
        if (paramString1.length() == 0) {
          i = 1;
        } else {
          i = 0;
        }
        if (i == 0)
        {
          int j = 0;
          i = j;
          int k = i;
          for (int m = i; j < paramString1.length(); m = i)
          {
            int n = paramString1.charAt(j);
            if ((k == 0) && (n != 40)) {
              break label152;
            }
            if (n == 40)
            {
              i = m + 1;
            }
            else
            {
              i = m;
              if (n == 41)
              {
                m--;
                i = m;
                if (m == 0)
                {
                  i = m;
                  if (k != paramString1.length() - 1) {
                    break label152;
                  }
                }
              }
            }
            j++;
            k++;
          }
          if (m == 0)
          {
            i = 1;
            break label154;
          }
        }
        label152:
        int i = 0;
        label154:
        if (i != 0)
        {
          paramString1 = paramString1.substring(1, paramString1.length() - 1);
          i.d(paramString1, "this as java.lang.String…ing(startIndex, endIndex)");
          return i.a(k.C0(paramString1).toString(), paramString2);
        }
        return false;
      }
    }
  }
  
  public static final class b
  {
    public final String a;
    public final String b;
    public final String c;
    public final List<String> d;
    public final List<String> e;
    
    public b(String paramString1, String paramString2, String paramString3, List<String> paramList1, List<String> paramList2)
    {
      a = paramString1;
      b = paramString2;
      c = paramString3;
      d = paramList1;
      e = paramList2;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      boolean bool1 = paramObject instanceof b;
      boolean bool2 = false;
      if (!bool1) {
        return false;
      }
      String str = a;
      paramObject = (b)paramObject;
      if (!i.a(str, a)) {
        return false;
      }
      if (!i.a(b, b)) {
        return false;
      }
      if (!i.a(c, c)) {
        return false;
      }
      if (i.a(d, d)) {
        bool2 = i.a(e, e);
      }
      return bool2;
    }
    
    public final int hashCode()
    {
      int i = a.hashCode();
      i = j.e(b, i * 31, 31);
      i = j.e(c, i, 31);
      int j = d.hashCode();
      return e.hashCode() + (j + i) * 31;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = f.l("ForeignKey{referenceTable='");
      localStringBuilder.append(a);
      localStringBuilder.append("', onDelete='");
      localStringBuilder.append(b);
      localStringBuilder.append(" +', onUpdate='");
      localStringBuilder.append(c);
      localStringBuilder.append("', columnNames=");
      localStringBuilder.append(d);
      localStringBuilder.append(", referenceColumnNames=");
      localStringBuilder.append(e);
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
  }
  
  public static final class c
    implements Comparable<c>
  {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    
    public c(String paramString1, int paramInt1, int paramInt2, String paramString2)
    {
      a = paramInt1;
      b = paramInt2;
      c = paramString1;
      d = paramString2;
    }
    
    public final int compareTo(Object paramObject)
    {
      paramObject = (c)paramObject;
      i.e(paramObject, "other");
      int i = a - a;
      int j = i;
      if (i == 0) {
        j = b - b;
      }
      return j;
    }
  }
  
  public static final class d
  {
    public final String a;
    public final boolean b;
    public final List<String> c;
    public List<String> d;
    
    public d(String paramString, boolean paramBoolean, List<String> paramList1, List<String> paramList2)
    {
      a = paramString;
      b = paramBoolean;
      c = paramList1;
      d = paramList2;
      paramString = paramList2;
      if (paramList2.isEmpty())
      {
        int i = paramList1.size();
        paramList1 = new ArrayList(i);
        for (int j = 0;; j++)
        {
          paramString = paramList1;
          if (j >= i) {
            break;
          }
          paramList1.add("ASC");
        }
      }
      d = paramString;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof d)) {
        return false;
      }
      boolean bool = b;
      paramObject = (d)paramObject;
      if (bool != b) {
        return false;
      }
      if (!i.a(c, c)) {
        return false;
      }
      if (!i.a(d, d)) {
        return false;
      }
      if (h.n0(a, "index_")) {
        bool = h.n0(a, "index_");
      } else {
        bool = i.a(a, a);
      }
      return bool;
    }
    
    public final int hashCode()
    {
      int i;
      if (h.n0(a, "index_")) {
        i = -1184239155;
      } else {
        i = a.hashCode();
      }
      int j = b;
      int k = c.hashCode();
      return d.hashCode() + (k + (i * 31 + j) * 31) * 31;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = f.l("Index{name='");
      localStringBuilder.append(a);
      localStringBuilder.append("', unique=");
      localStringBuilder.append(b);
      localStringBuilder.append(", columns=");
      localStringBuilder.append(c);
      localStringBuilder.append(", orders=");
      localStringBuilder.append(d);
      localStringBuilder.append("'}");
      return localStringBuilder.toString();
    }
  }
}

/* Location:
 * Qualified Name:     r1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */