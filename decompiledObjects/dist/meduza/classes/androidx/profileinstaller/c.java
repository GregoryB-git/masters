package androidx.profileinstaller;

import android.util.Log;

public final class c
{
  public static final a a = new a();
  public static final b b = new b();
  
  /* Error */
  public static void a(android.content.pm.PackageInfo paramPackageInfo, java.io.File paramFile)
  {
    // Byte code:
    //   0: new 31	java/io/File
    //   3: dup
    //   4: aload_1
    //   5: ldc 33
    //   7: invokespecial 36	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   10: astore_2
    //   11: new 38	java/io/DataOutputStream
    //   14: astore_1
    //   15: new 40	java/io/FileOutputStream
    //   18: astore_3
    //   19: aload_3
    //   20: aload_2
    //   21: invokespecial 43	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   24: aload_1
    //   25: aload_3
    //   26: invokespecial 46	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   29: aload_1
    //   30: aload_0
    //   31: getfield 52	android/content/pm/PackageInfo:lastUpdateTime	J
    //   34: invokevirtual 56	java/io/DataOutputStream:writeLong	(J)V
    //   37: aload_1
    //   38: invokevirtual 61	java/io/OutputStream:close	()V
    //   41: goto +19 -> 60
    //   44: astore_0
    //   45: aload_1
    //   46: invokevirtual 61	java/io/OutputStream:close	()V
    //   49: goto +9 -> 58
    //   52: astore_1
    //   53: aload_0
    //   54: aload_1
    //   55: invokevirtual 67	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   58: aload_0
    //   59: athrow
    //   60: return
    //   61: astore_0
    //   62: goto -2 -> 60
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	65	0	paramPackageInfo	android.content.pm.PackageInfo
    //   0	65	1	paramFile	java.io.File
    //   10	11	2	localFile	java.io.File
    //   18	8	3	localFileOutputStream	java.io.FileOutputStream
    // Exception table:
    //   from	to	target	type
    //   29	37	44	finally
    //   45	49	52	finally
    //   11	29	61	java/io/IOException
    //   37	41	61	java/io/IOException
    //   53	58	61	java/io/IOException
    //   58	60	61	java/io/IOException
  }
  
  /* Error */
  public static void b(android.content.Context paramContext, m1.b paramb, c paramc, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 80	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   4: astore 4
    //   6: aload 4
    //   8: invokevirtual 84	android/content/Context:getPackageName	()Ljava/lang/String;
    //   11: astore 5
    //   13: aload 4
    //   15: invokevirtual 88	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   18: astore 6
    //   20: aload 4
    //   22: invokevirtual 92	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   25: astore 7
    //   27: new 31	java/io/File
    //   30: dup
    //   31: aload 6
    //   33: getfield 98	android/content/pm/ApplicationInfo:sourceDir	Ljava/lang/String;
    //   36: invokespecial 101	java/io/File:<init>	(Ljava/lang/String;)V
    //   39: invokevirtual 104	java/io/File:getName	()Ljava/lang/String;
    //   42: astore 8
    //   44: aload_0
    //   45: invokevirtual 108	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   48: astore 6
    //   50: iconst_0
    //   51: istore 9
    //   53: aload 6
    //   55: aload 5
    //   57: iconst_0
    //   58: invokevirtual 114	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   61: astore 6
    //   63: aload_0
    //   64: invokevirtual 118	android/content/Context:getFilesDir	()Ljava/io/File;
    //   67: astore 4
    //   69: iconst_1
    //   70: istore 10
    //   72: iload_3
    //   73: ifne +175 -> 248
    //   76: new 31	java/io/File
    //   79: dup
    //   80: aload 4
    //   82: ldc 33
    //   84: invokespecial 36	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   87: astore 11
    //   89: aload 11
    //   91: invokevirtual 122	java/io/File:exists	()Z
    //   94: ifne +6 -> 100
    //   97: goto +110 -> 207
    //   100: new 124	java/io/DataInputStream
    //   103: astore 12
    //   105: new 126	java/io/FileInputStream
    //   108: astore 13
    //   110: aload 13
    //   112: aload 11
    //   114: invokespecial 127	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   117: aload 12
    //   119: aload 13
    //   121: invokespecial 130	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   124: aload 12
    //   126: invokevirtual 134	java/io/DataInputStream:readLong	()J
    //   129: lstore 14
    //   131: aload 12
    //   133: invokevirtual 137	java/io/InputStream:close	()V
    //   136: lload 14
    //   138: aload 6
    //   140: getfield 52	android/content/pm/PackageInfo:lastUpdateTime	J
    //   143: lcmp
    //   144: ifne +9 -> 153
    //   147: iconst_1
    //   148: istore 16
    //   150: goto +6 -> 156
    //   153: iconst_0
    //   154: istore 16
    //   156: iload 16
    //   158: istore 9
    //   160: iload 16
    //   162: ifeq +45 -> 207
    //   165: aload_2
    //   166: iconst_2
    //   167: aconst_null
    //   168: invokeinterface 140 3 0
    //   173: iload 16
    //   175: istore 9
    //   177: goto +30 -> 207
    //   180: astore 11
    //   182: aload 12
    //   184: invokevirtual 137	java/io/InputStream:close	()V
    //   187: goto +12 -> 199
    //   190: astore 12
    //   192: aload 11
    //   194: aload 12
    //   196: invokevirtual 67	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   199: aload 11
    //   201: athrow
    //   202: astore 12
    //   204: iconst_0
    //   205: istore 9
    //   207: iload 9
    //   209: ifne +6 -> 215
    //   212: goto +36 -> 248
    //   215: ldc -114
    //   217: invokestatic 148	f:l	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   220: astore_1
    //   221: aload_1
    //   222: aload_0
    //   223: invokevirtual 84	android/content/Context:getPackageName	()Ljava/lang/String;
    //   226: invokevirtual 153	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   229: pop
    //   230: ldc -101
    //   232: aload_1
    //   233: invokevirtual 158	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   236: invokestatic 164	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   239: pop
    //   240: aload_0
    //   241: iconst_0
    //   242: invokestatic 169	androidx/profileinstaller/d:b	(Landroid/content/Context;Z)V
    //   245: goto +1074 -> 1319
    //   248: ldc -85
    //   250: invokestatic 148	f:l	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   253: astore 12
    //   255: aload 12
    //   257: aload_0
    //   258: invokevirtual 84	android/content/Context:getPackageName	()Ljava/lang/String;
    //   261: invokevirtual 153	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   264: pop
    //   265: ldc -101
    //   267: aload 12
    //   269: invokevirtual 158	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   272: invokestatic 164	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   275: pop
    //   276: getstatic 177	android/os/Build$VERSION:SDK_INT	I
    //   279: istore 16
    //   281: new 31	java/io/File
    //   284: dup
    //   285: new 31	java/io/File
    //   288: dup
    //   289: ldc -77
    //   291: aload 5
    //   293: invokespecial 182	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   296: ldc -72
    //   298: invokespecial 36	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   301: astore 12
    //   303: new 186	androidx/profileinstaller/b
    //   306: dup
    //   307: aload 7
    //   309: aload_1
    //   310: aload_2
    //   311: aload 8
    //   313: aload 12
    //   315: invokespecial 189	androidx/profileinstaller/b:<init>	(Landroid/content/res/AssetManager;Lm1/b;Landroidx/profileinstaller/c$c;Ljava/lang/String;Ljava/io/File;)V
    //   318: astore 5
    //   320: aload 5
    //   322: getfield 192	androidx/profileinstaller/b:d	[B
    //   325: ifnonnull +17 -> 342
    //   328: aload 5
    //   330: iconst_3
    //   331: iload 16
    //   333: invokestatic 198	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   336: invokevirtual 201	androidx/profileinstaller/b:b	(ILjava/io/Serializable;)V
    //   339: goto +47 -> 386
    //   342: aload 12
    //   344: invokevirtual 122	java/io/File:exists	()Z
    //   347: ifeq +14 -> 361
    //   350: aload 12
    //   352: invokevirtual 204	java/io/File:canWrite	()Z
    //   355: ifne +12 -> 367
    //   358: goto +21 -> 379
    //   361: aload 12
    //   363: invokevirtual 207	java/io/File:createNewFile	()Z
    //   366: pop
    //   367: aload 5
    //   369: iconst_1
    //   370: putfield 211	androidx/profileinstaller/b:g	Z
    //   373: iconst_1
    //   374: istore 16
    //   376: goto +13 -> 389
    //   379: aload 5
    //   381: iconst_4
    //   382: aconst_null
    //   383: invokevirtual 201	androidx/profileinstaller/b:b	(ILjava/io/Serializable;)V
    //   386: iconst_0
    //   387: istore 16
    //   389: iload 16
    //   391: ifne +9 -> 400
    //   394: iconst_0
    //   395: istore 9
    //   397: goto +900 -> 1297
    //   400: aload 5
    //   402: getfield 211	androidx/profileinstaller/b:g	Z
    //   405: ifeq +938 -> 1343
    //   408: aload 5
    //   410: getfield 192	androidx/profileinstaller/b:d	[B
    //   413: astore_1
    //   414: bipush 8
    //   416: istore 9
    //   418: aload_1
    //   419: ifnonnull +9 -> 428
    //   422: aload 5
    //   424: astore_2
    //   425: goto +491 -> 916
    //   428: aload 5
    //   430: getfield 214	androidx/profileinstaller/b:a	Landroid/content/res/AssetManager;
    //   433: astore_1
    //   434: aload 5
    //   436: aload_1
    //   437: ldc -40
    //   439: invokevirtual 219	androidx/profileinstaller/b:a	(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/FileInputStream;
    //   442: astore_1
    //   443: goto +39 -> 482
    //   446: astore_1
    //   447: aload 5
    //   449: getfield 222	androidx/profileinstaller/b:c	Landroidx/profileinstaller/c$c;
    //   452: astore_2
    //   453: bipush 7
    //   455: istore 16
    //   457: goto +14 -> 471
    //   460: astore_1
    //   461: aload 5
    //   463: getfield 222	androidx/profileinstaller/b:c	Landroidx/profileinstaller/c$c;
    //   466: astore_2
    //   467: bipush 6
    //   469: istore 16
    //   471: aload_2
    //   472: iload 16
    //   474: aload_1
    //   475: invokeinterface 140 3 0
    //   480: aconst_null
    //   481: astore_1
    //   482: aload_1
    //   483: ifnull +162 -> 645
    //   486: getstatic 226	n1/d:a	[B
    //   489: aload_1
    //   490: iconst_4
    //   491: invokestatic 232	x6/b:j0	(Ljava/io/InputStream;I)[B
    //   494: invokestatic 238	java/util/Arrays:equals	([B[B)Z
    //   497: ifeq +46 -> 543
    //   500: aload_1
    //   501: aload_1
    //   502: iconst_4
    //   503: invokestatic 232	x6/b:j0	(Ljava/io/InputStream;I)[B
    //   506: aload 5
    //   508: getfield 240	androidx/profileinstaller/b:f	Ljava/lang/String;
    //   511: invokestatic 244	n1/d:h	(Ljava/io/FileInputStream;[BLjava/lang/String;)[Ln1/b;
    //   514: astore_2
    //   515: aload_1
    //   516: invokevirtual 137	java/io/InputStream:close	()V
    //   519: aload_2
    //   520: astore_1
    //   521: goto +92 -> 613
    //   524: astore_1
    //   525: aload 5
    //   527: getfield 222	androidx/profileinstaller/b:c	Landroidx/profileinstaller/c$c;
    //   530: bipush 7
    //   532: aload_1
    //   533: invokeinterface 140 3 0
    //   538: aload_2
    //   539: astore_1
    //   540: goto +73 -> 613
    //   543: new 74	java/lang/IllegalStateException
    //   546: astore_2
    //   547: aload_2
    //   548: ldc -10
    //   550: invokespecial 247	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   553: aload_2
    //   554: athrow
    //   555: astore_0
    //   556: goto +66 -> 622
    //   559: astore_2
    //   560: aload 5
    //   562: getfield 222	androidx/profileinstaller/b:c	Landroidx/profileinstaller/c$c;
    //   565: bipush 8
    //   567: aload_2
    //   568: invokeinterface 140 3 0
    //   573: goto +17 -> 590
    //   576: astore_2
    //   577: aload 5
    //   579: getfield 222	androidx/profileinstaller/b:c	Landroidx/profileinstaller/c$c;
    //   582: bipush 7
    //   584: aload_2
    //   585: invokeinterface 140 3 0
    //   590: aload_1
    //   591: invokevirtual 137	java/io/InputStream:close	()V
    //   594: goto +17 -> 611
    //   597: astore_1
    //   598: aload 5
    //   600: getfield 222	androidx/profileinstaller/b:c	Landroidx/profileinstaller/c$c;
    //   603: bipush 7
    //   605: aload_1
    //   606: invokeinterface 140 3 0
    //   611: aconst_null
    //   612: astore_1
    //   613: aload 5
    //   615: aload_1
    //   616: putfield 250	androidx/profileinstaller/b:h	[Ln1/b;
    //   619: goto +26 -> 645
    //   622: aload_1
    //   623: invokevirtual 137	java/io/InputStream:close	()V
    //   626: goto +17 -> 643
    //   629: astore_1
    //   630: aload 5
    //   632: getfield 222	androidx/profileinstaller/b:c	Landroidx/profileinstaller/c$c;
    //   635: bipush 7
    //   637: aload_1
    //   638: invokeinterface 140 3 0
    //   643: aload_0
    //   644: athrow
    //   645: aload 5
    //   647: getfield 250	androidx/profileinstaller/b:h	[Ln1/b;
    //   650: astore 7
    //   652: aload 5
    //   654: astore_2
    //   655: aload 7
    //   657: ifnull +259 -> 916
    //   660: getstatic 177	android/os/Build$VERSION:SDK_INT	I
    //   663: istore 16
    //   665: iload 16
    //   667: bipush 24
    //   669: if_icmplt +68 -> 737
    //   672: iload 16
    //   674: bipush 34
    //   676: if_icmple +6 -> 682
    //   679: goto +58 -> 737
    //   682: iload 16
    //   684: bipush 24
    //   686: if_icmpeq +45 -> 731
    //   689: iload 16
    //   691: bipush 25
    //   693: if_icmpeq +38 -> 731
    //   696: iload 16
    //   698: tableswitch	default:+30->728, 31:+33->731, 32:+33->731, 33:+33->731, 34:+33->731
    //   728: goto +9 -> 737
    //   731: iconst_1
    //   732: istore 16
    //   734: goto +6 -> 740
    //   737: iconst_0
    //   738: istore 16
    //   740: aload 5
    //   742: astore_2
    //   743: iload 16
    //   745: ifeq +171 -> 916
    //   748: aload 5
    //   750: getfield 192	androidx/profileinstaller/b:d	[B
    //   753: astore_2
    //   754: aload 5
    //   756: aload 5
    //   758: getfield 214	androidx/profileinstaller/b:a	Landroid/content/res/AssetManager;
    //   761: ldc -4
    //   763: invokevirtual 219	androidx/profileinstaller/b:a	(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/FileInputStream;
    //   766: astore_1
    //   767: aload_1
    //   768: ifnull +72 -> 840
    //   771: getstatic 254	n1/d:b	[B
    //   774: aload_1
    //   775: iconst_4
    //   776: invokestatic 232	x6/b:j0	(Ljava/io/InputStream;I)[B
    //   779: invokestatic 238	java/util/Arrays:equals	([B[B)Z
    //   782: ifeq +30 -> 812
    //   785: aload 5
    //   787: aload_1
    //   788: aload_1
    //   789: iconst_4
    //   790: invokestatic 232	x6/b:j0	(Ljava/io/InputStream;I)[B
    //   793: aload_2
    //   794: aload 7
    //   796: invokestatic 258	n1/d:e	(Ljava/io/FileInputStream;[B[B[Ln1/b;)[Ln1/b;
    //   799: putfield 250	androidx/profileinstaller/b:h	[Ln1/b;
    //   802: aload_1
    //   803: invokevirtual 137	java/io/InputStream:close	()V
    //   806: aload 5
    //   808: astore_1
    //   809: goto +98 -> 907
    //   812: new 74	java/lang/IllegalStateException
    //   815: astore_2
    //   816: aload_2
    //   817: ldc -10
    //   819: invokespecial 247	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   822: aload_2
    //   823: athrow
    //   824: astore_2
    //   825: aload_1
    //   826: invokevirtual 137	java/io/InputStream:close	()V
    //   829: goto +9 -> 838
    //   832: astore_1
    //   833: aload_2
    //   834: aload_1
    //   835: invokevirtual 67	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   838: aload_2
    //   839: athrow
    //   840: aload_1
    //   841: ifnull +64 -> 905
    //   844: aload_1
    //   845: invokevirtual 137	java/io/InputStream:close	()V
    //   848: goto +57 -> 905
    //   851: astore_1
    //   852: aload 5
    //   854: aconst_null
    //   855: putfield 250	androidx/profileinstaller/b:h	[Ln1/b;
    //   858: aload 5
    //   860: getfield 222	androidx/profileinstaller/b:c	Landroidx/profileinstaller/c$c;
    //   863: astore_2
    //   864: bipush 8
    //   866: istore 16
    //   868: goto +28 -> 896
    //   871: astore_1
    //   872: aload 5
    //   874: getfield 222	androidx/profileinstaller/b:c	Landroidx/profileinstaller/c$c;
    //   877: astore_2
    //   878: bipush 7
    //   880: istore 16
    //   882: goto +14 -> 896
    //   885: astore_1
    //   886: aload 5
    //   888: getfield 222	androidx/profileinstaller/b:c	Landroidx/profileinstaller/c$c;
    //   891: astore_2
    //   892: bipush 9
    //   894: istore 16
    //   896: aload_2
    //   897: iload 16
    //   899: aload_1
    //   900: invokeinterface 140 3 0
    //   905: aconst_null
    //   906: astore_1
    //   907: aload 5
    //   909: astore_2
    //   910: aload_1
    //   911: ifnull +5 -> 916
    //   914: aload_1
    //   915: astore_2
    //   916: aload_2
    //   917: getfield 250	androidx/profileinstaller/b:h	[Ln1/b;
    //   920: astore 5
    //   922: aload_2
    //   923: getfield 192	androidx/profileinstaller/b:d	[B
    //   926: astore 7
    //   928: aload 5
    //   930: ifnull +161 -> 1091
    //   933: aload 7
    //   935: ifnonnull +6 -> 941
    //   938: goto +153 -> 1091
    //   941: aload_2
    //   942: getfield 211	androidx/profileinstaller/b:g	Z
    //   945: ifeq +135 -> 1080
    //   948: new 260	java/io/ByteArrayOutputStream
    //   951: astore_1
    //   952: aload_1
    //   953: invokespecial 261	java/io/ByteArrayOutputStream:<init>	()V
    //   956: aload_1
    //   957: getstatic 226	n1/d:a	[B
    //   960: invokevirtual 265	java/io/OutputStream:write	([B)V
    //   963: aload_1
    //   964: aload 7
    //   966: invokevirtual 265	java/io/OutputStream:write	([B)V
    //   969: aload_1
    //   970: aload 7
    //   972: aload 5
    //   974: invokestatic 269	n1/d:j	(Ljava/io/ByteArrayOutputStream;[B[Ln1/b;)Z
    //   977: ifne +26 -> 1003
    //   980: aload_2
    //   981: getfield 222	androidx/profileinstaller/b:c	Landroidx/profileinstaller/c$c;
    //   984: iconst_5
    //   985: aconst_null
    //   986: invokeinterface 140 3 0
    //   991: aload_2
    //   992: aconst_null
    //   993: putfield 250	androidx/profileinstaller/b:h	[Ln1/b;
    //   996: aload_1
    //   997: invokevirtual 270	java/io/ByteArrayOutputStream:close	()V
    //   1000: goto +91 -> 1091
    //   1003: aload_2
    //   1004: aload_1
    //   1005: invokevirtual 274	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   1008: putfield 277	androidx/profileinstaller/b:i	[B
    //   1011: aload_1
    //   1012: invokevirtual 270	java/io/ByteArrayOutputStream:close	()V
    //   1015: goto +57 -> 1072
    //   1018: astore 5
    //   1020: aload_1
    //   1021: invokevirtual 270	java/io/ByteArrayOutputStream:close	()V
    //   1024: goto +10 -> 1034
    //   1027: astore_1
    //   1028: aload 5
    //   1030: aload_1
    //   1031: invokevirtual 67	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   1034: aload 5
    //   1036: athrow
    //   1037: astore_1
    //   1038: aload_2
    //   1039: getfield 222	androidx/profileinstaller/b:c	Landroidx/profileinstaller/c$c;
    //   1042: astore 5
    //   1044: iload 9
    //   1046: istore 16
    //   1048: goto +14 -> 1062
    //   1051: astore_1
    //   1052: aload_2
    //   1053: getfield 222	androidx/profileinstaller/b:c	Landroidx/profileinstaller/c$c;
    //   1056: astore 5
    //   1058: bipush 7
    //   1060: istore 16
    //   1062: aload 5
    //   1064: iload 16
    //   1066: aload_1
    //   1067: invokeinterface 140 3 0
    //   1072: aload_2
    //   1073: aconst_null
    //   1074: putfield 250	androidx/profileinstaller/b:h	[Ln1/b;
    //   1077: goto +14 -> 1091
    //   1080: new 74	java/lang/IllegalStateException
    //   1083: dup
    //   1084: ldc_w 279
    //   1087: invokespecial 247	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   1090: athrow
    //   1091: aload_2
    //   1092: getfield 277	androidx/profileinstaller/b:i	[B
    //   1095: astore 5
    //   1097: aload 5
    //   1099: ifnonnull +6 -> 1105
    //   1102: goto +172 -> 1274
    //   1105: aload_2
    //   1106: getfield 211	androidx/profileinstaller/b:g	Z
    //   1109: ifeq +223 -> 1332
    //   1112: new 281	java/io/ByteArrayInputStream
    //   1115: astore_1
    //   1116: aload_1
    //   1117: aload 5
    //   1119: invokespecial 283	java/io/ByteArrayInputStream:<init>	([B)V
    //   1122: new 40	java/io/FileOutputStream
    //   1125: astore 5
    //   1127: aload 5
    //   1129: aload_2
    //   1130: getfield 286	androidx/profileinstaller/b:e	Ljava/io/File;
    //   1133: invokespecial 43	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   1136: sipush 512
    //   1139: newarray <illegal type>
    //   1141: astore 7
    //   1143: aload_1
    //   1144: aload 7
    //   1146: invokevirtual 290	java/io/InputStream:read	([B)I
    //   1149: istore 16
    //   1151: iload 16
    //   1153: ifle +16 -> 1169
    //   1156: aload 5
    //   1158: aload 7
    //   1160: iconst_0
    //   1161: iload 16
    //   1163: invokevirtual 293	java/io/OutputStream:write	([BII)V
    //   1166: goto -23 -> 1143
    //   1169: aload_2
    //   1170: iconst_1
    //   1171: aconst_null
    //   1172: invokevirtual 201	androidx/profileinstaller/b:b	(ILjava/io/Serializable;)V
    //   1175: aload 5
    //   1177: invokevirtual 61	java/io/OutputStream:close	()V
    //   1180: aload_1
    //   1181: invokevirtual 137	java/io/InputStream:close	()V
    //   1184: aload_2
    //   1185: aconst_null
    //   1186: putfield 277	androidx/profileinstaller/b:i	[B
    //   1189: aload_2
    //   1190: aconst_null
    //   1191: putfield 250	androidx/profileinstaller/b:h	[Ln1/b;
    //   1194: iconst_1
    //   1195: istore 16
    //   1197: goto +80 -> 1277
    //   1200: astore 7
    //   1202: aload 5
    //   1204: invokevirtual 61	java/io/OutputStream:close	()V
    //   1207: goto +12 -> 1219
    //   1210: astore 5
    //   1212: aload 7
    //   1214: aload 5
    //   1216: invokevirtual 67	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   1219: aload 7
    //   1221: athrow
    //   1222: astore 5
    //   1224: aload_1
    //   1225: invokevirtual 137	java/io/InputStream:close	()V
    //   1228: goto +10 -> 1238
    //   1231: astore_1
    //   1232: aload 5
    //   1234: aload_1
    //   1235: invokevirtual 67	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   1238: aload 5
    //   1240: athrow
    //   1241: astore_0
    //   1242: goto +78 -> 1320
    //   1245: astore_1
    //   1246: aload_2
    //   1247: bipush 7
    //   1249: aload_1
    //   1250: invokevirtual 201	androidx/profileinstaller/b:b	(ILjava/io/Serializable;)V
    //   1253: goto +11 -> 1264
    //   1256: astore_1
    //   1257: aload_2
    //   1258: bipush 6
    //   1260: aload_1
    //   1261: invokevirtual 201	androidx/profileinstaller/b:b	(ILjava/io/Serializable;)V
    //   1264: aload_2
    //   1265: aconst_null
    //   1266: putfield 277	androidx/profileinstaller/b:i	[B
    //   1269: aload_2
    //   1270: aconst_null
    //   1271: putfield 250	androidx/profileinstaller/b:h	[Ln1/b;
    //   1274: iconst_0
    //   1275: istore 16
    //   1277: iload 16
    //   1279: istore 9
    //   1281: iload 16
    //   1283: ifeq +14 -> 1297
    //   1286: aload 6
    //   1288: aload 4
    //   1290: invokestatic 295	androidx/profileinstaller/c:a	(Landroid/content/pm/PackageInfo;Ljava/io/File;)V
    //   1293: iload 16
    //   1295: istore 9
    //   1297: iload 9
    //   1299: ifeq +13 -> 1312
    //   1302: iload_3
    //   1303: ifeq +9 -> 1312
    //   1306: iload 10
    //   1308: istore_3
    //   1309: goto +5 -> 1314
    //   1312: iconst_0
    //   1313: istore_3
    //   1314: aload_0
    //   1315: iload_3
    //   1316: invokestatic 169	androidx/profileinstaller/d:b	(Landroid/content/Context;Z)V
    //   1319: return
    //   1320: aload_2
    //   1321: aconst_null
    //   1322: putfield 277	androidx/profileinstaller/b:i	[B
    //   1325: aload_2
    //   1326: aconst_null
    //   1327: putfield 250	androidx/profileinstaller/b:h	[Ln1/b;
    //   1330: aload_0
    //   1331: athrow
    //   1332: new 74	java/lang/IllegalStateException
    //   1335: dup
    //   1336: ldc_w 279
    //   1339: invokespecial 247	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   1342: athrow
    //   1343: new 74	java/lang/IllegalStateException
    //   1346: dup
    //   1347: ldc_w 279
    //   1350: invokespecial 247	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   1353: athrow
    //   1354: astore_1
    //   1355: aload_2
    //   1356: bipush 7
    //   1358: aload_1
    //   1359: invokeinterface 140 3 0
    //   1364: aload_0
    //   1365: iconst_0
    //   1366: invokestatic 169	androidx/profileinstaller/d:b	(Landroid/content/Context;Z)V
    //   1369: return
    //   1370: astore_1
    //   1371: goto -992 -> 379
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1374	0	paramContext	android.content.Context
    //   0	1374	1	paramb	m1.b
    //   0	1374	2	paramc	c
    //   0	1374	3	paramBoolean	boolean
    //   4	1285	4	localObject1	Object
    //   11	962	5	localObject2	Object
    //   1018	17	5	localObject3	Object
    //   1042	161	5	localObject4	Object
    //   1210	5	5	localThrowable1	Throwable
    //   1222	17	5	localObject5	Object
    //   18	1269	6	localObject6	Object
    //   25	1134	7	localObject7	Object
    //   1200	20	7	localObject8	Object
    //   42	270	8	str	String
    //   51	1247	9	i	int
    //   70	1237	10	bool	boolean
    //   87	26	11	localFile	java.io.File
    //   180	20	11	localObject9	Object
    //   103	80	12	localDataInputStream	java.io.DataInputStream
    //   190	5	12	localThrowable2	Throwable
    //   202	1	12	localIOException	java.io.IOException
    //   253	109	12	localObject10	Object
    //   108	12	13	localFileInputStream	java.io.FileInputStream
    //   129	8	14	l	long
    //   148	1146	16	j	int
    // Exception table:
    //   from	to	target	type
    //   124	131	180	finally
    //   182	187	190	finally
    //   100	124	202	java/io/IOException
    //   131	136	202	java/io/IOException
    //   192	199	202	java/io/IOException
    //   199	202	202	java/io/IOException
    //   434	443	446	java/io/IOException
    //   434	443	460	java/io/FileNotFoundException
    //   515	519	524	java/io/IOException
    //   486	515	555	finally
    //   543	555	555	finally
    //   560	573	555	finally
    //   577	590	555	finally
    //   486	515	559	java/lang/IllegalStateException
    //   543	555	559	java/lang/IllegalStateException
    //   486	515	576	java/io/IOException
    //   543	555	576	java/io/IOException
    //   590	594	597	java/io/IOException
    //   622	626	629	java/io/IOException
    //   771	802	824	finally
    //   812	824	824	finally
    //   825	829	832	finally
    //   754	767	851	java/lang/IllegalStateException
    //   802	806	851	java/lang/IllegalStateException
    //   833	838	851	java/lang/IllegalStateException
    //   838	840	851	java/lang/IllegalStateException
    //   844	848	851	java/lang/IllegalStateException
    //   754	767	871	java/io/IOException
    //   802	806	871	java/io/IOException
    //   833	838	871	java/io/IOException
    //   838	840	871	java/io/IOException
    //   844	848	871	java/io/IOException
    //   754	767	885	java/io/FileNotFoundException
    //   802	806	885	java/io/FileNotFoundException
    //   833	838	885	java/io/FileNotFoundException
    //   838	840	885	java/io/FileNotFoundException
    //   844	848	885	java/io/FileNotFoundException
    //   956	996	1018	finally
    //   1003	1011	1018	finally
    //   1020	1024	1027	finally
    //   948	956	1037	java/lang/IllegalStateException
    //   996	1000	1037	java/lang/IllegalStateException
    //   1011	1015	1037	java/lang/IllegalStateException
    //   1028	1034	1037	java/lang/IllegalStateException
    //   1034	1037	1037	java/lang/IllegalStateException
    //   948	956	1051	java/io/IOException
    //   996	1000	1051	java/io/IOException
    //   1011	1015	1051	java/io/IOException
    //   1028	1034	1051	java/io/IOException
    //   1034	1037	1051	java/io/IOException
    //   1136	1143	1200	finally
    //   1143	1151	1200	finally
    //   1156	1166	1200	finally
    //   1169	1175	1200	finally
    //   1202	1207	1210	finally
    //   1122	1136	1222	finally
    //   1175	1180	1222	finally
    //   1212	1219	1222	finally
    //   1219	1222	1222	finally
    //   1224	1228	1231	finally
    //   1112	1122	1241	finally
    //   1180	1184	1241	finally
    //   1232	1238	1241	finally
    //   1238	1241	1241	finally
    //   1246	1253	1241	finally
    //   1257	1264	1241	finally
    //   1112	1122	1245	java/io/IOException
    //   1180	1184	1245	java/io/IOException
    //   1232	1238	1245	java/io/IOException
    //   1238	1241	1245	java/io/IOException
    //   1112	1122	1256	java/io/FileNotFoundException
    //   1180	1184	1256	java/io/FileNotFoundException
    //   1232	1238	1256	java/io/FileNotFoundException
    //   1238	1241	1256	java/io/FileNotFoundException
    //   53	63	1354	android/content/pm/PackageManager$NameNotFoundException
    //   361	367	1370	java/io/IOException
  }
  
  public final class a
    implements c.c
  {
    public final void a() {}
    
    public final void b(int paramInt, Object paramObject) {}
  }
  
  public final class b
    implements c.c
  {
    public final void a()
    {
      Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }
    
    public final void b(int paramInt, Object paramObject)
    {
      String str;
      switch (paramInt)
      {
      case 9: 
      default: 
        str = "";
        break;
      case 11: 
        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
        break;
      case 10: 
        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
        break;
      case 8: 
        str = "RESULT_PARSE_EXCEPTION";
        break;
      case 7: 
        str = "RESULT_IO_EXCEPTION";
        break;
      case 6: 
        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
        break;
      case 5: 
        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
        break;
      case 4: 
        str = "RESULT_NOT_WRITABLE";
        break;
      case 3: 
        str = "RESULT_UNSUPPORTED_ART_VERSION";
        break;
      case 2: 
        str = "RESULT_ALREADY_INSTALLED";
        break;
      case 1: 
        str = "RESULT_INSTALL_SUCCESS";
      }
      if ((paramInt != 6) && (paramInt != 7) && (paramInt != 8)) {
        Log.d("ProfileInstaller", str);
      } else {
        Log.e("ProfileInstaller", str, (Throwable)paramObject);
      }
    }
  }
  
  public static abstract interface c
  {
    public abstract void a();
    
    public abstract void b(int paramInt, Object paramObject);
  }
}

/* Location:
 * Qualified Name:     androidx.profileinstaller.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */