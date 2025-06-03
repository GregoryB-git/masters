package R2;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcel;
import java.io.File;

public final class V1
  extends f1
{
  public final U1 c = new U1(this, a(), "google_app_measurement_local.db");
  public boolean d;
  
  public V1(N2 paramN2)
  {
    super(paramN2);
  }
  
  public static long B(SQLiteDatabase paramSQLiteDatabase)
  {
    SQLiteDatabase localSQLiteDatabase = null;
    try
    {
      paramSQLiteDatabase = paramSQLiteDatabase.query("messages", new String[] { "rowid" }, "type=?", new String[] { "3" }, null, null, "rowid desc", "1");
      localSQLiteDatabase = paramSQLiteDatabase;
      if (paramSQLiteDatabase.moveToFirst())
      {
        localSQLiteDatabase = paramSQLiteDatabase;
        long l = paramSQLiteDatabase.getLong(0);
        paramSQLiteDatabase.close();
        return l;
      }
    }
    finally
    {
      break label78;
      paramSQLiteDatabase.close();
      return -1L;
      label78:
      if (localSQLiteDatabase != null) {
        localSQLiteDatabase.close();
      }
    }
  }
  
  private final boolean L()
  {
    return a().getDatabasePath("google_app_measurement_local.db").exists();
  }
  
  public final boolean A()
  {
    return false;
  }
  
  /* Error */
  public final java.util.List C(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 92	R2/m3:n	()V
    //   4: aload_0
    //   5: getfield 94	R2/V1:d	Z
    //   8: ifeq +5 -> 13
    //   11: aconst_null
    //   12: areturn
    //   13: new 96	java/util/ArrayList
    //   16: dup
    //   17: invokespecial 98	java/util/ArrayList:<init>	()V
    //   20: astore_2
    //   21: aload_0
    //   22: invokespecial 100	R2/V1:L	()Z
    //   25: ifne +5 -> 30
    //   28: aload_2
    //   29: areturn
    //   30: iconst_5
    //   31: istore_3
    //   32: iconst_0
    //   33: istore 4
    //   35: aconst_null
    //   36: astore 5
    //   38: iload 4
    //   40: iconst_5
    //   41: if_icmpge +1027 -> 1068
    //   44: aload_0
    //   45: invokevirtual 104	R2/V1:K	()Landroid/database/sqlite/SQLiteDatabase;
    //   48: astore 6
    //   50: aload 6
    //   52: astore 7
    //   54: aload 7
    //   56: ifnonnull +58 -> 114
    //   59: aload_0
    //   60: iconst_1
    //   61: putfield 94	R2/V1:d	Z
    //   64: aload 7
    //   66: ifnull +8 -> 74
    //   69: aload 7
    //   71: invokevirtual 107	android/database/sqlite/SQLiteClosable:close	()V
    //   74: aconst_null
    //   75: areturn
    //   76: astore 8
    //   78: aload 5
    //   80: astore 6
    //   82: goto +961 -> 1043
    //   85: astore 9
    //   87: aconst_null
    //   88: astore 6
    //   90: aload 7
    //   92: astore 8
    //   94: goto +708 -> 802
    //   97: astore 8
    //   99: goto +674 -> 773
    //   102: astore 9
    //   104: aconst_null
    //   105: astore 6
    //   107: aload 7
    //   109: astore 8
    //   111: goto +865 -> 976
    //   114: aload 7
    //   116: invokevirtual 110	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   119: aload 7
    //   121: invokestatic 112	R2/V1:B	(Landroid/database/sqlite/SQLiteDatabase;)J
    //   124: lstore 10
    //   126: ldc2_w 65
    //   129: lstore 12
    //   131: lload 10
    //   133: ldc2_w 65
    //   136: lcmp
    //   137: ifeq +24 -> 161
    //   140: ldc 114
    //   142: astore 9
    //   144: iconst_1
    //   145: anewarray 34	java/lang/String
    //   148: dup
    //   149: iconst_0
    //   150: lload 10
    //   152: invokestatic 118	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   155: aastore
    //   156: astore 5
    //   158: goto +10 -> 168
    //   161: aconst_null
    //   162: astore 9
    //   164: aload 9
    //   166: astore 5
    //   168: bipush 100
    //   170: invokestatic 124	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   173: astore 14
    //   175: aload 7
    //   177: astore 8
    //   179: aload 7
    //   181: ldc 32
    //   183: iconst_3
    //   184: anewarray 34	java/lang/String
    //   187: dup
    //   188: iconst_0
    //   189: ldc 36
    //   191: aastore
    //   192: dup
    //   193: iconst_1
    //   194: ldc 126
    //   196: aastore
    //   197: dup
    //   198: iconst_2
    //   199: ldc -128
    //   201: aastore
    //   202: aload 9
    //   204: aload 5
    //   206: aconst_null
    //   207: aconst_null
    //   208: ldc -126
    //   210: aload 14
    //   212: invokevirtual 50	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   215: astore 7
    //   217: aload 7
    //   219: invokeinterface 133 1 0
    //   224: ifeq +423 -> 647
    //   227: aload 7
    //   229: iconst_0
    //   230: invokeinterface 60 2 0
    //   235: lstore 10
    //   237: aload 7
    //   239: iconst_1
    //   240: invokeinterface 137 2 0
    //   245: istore_1
    //   246: aload 7
    //   248: iconst_2
    //   249: invokeinterface 141 2 0
    //   254: astore 6
    //   256: iload_1
    //   257: ifne +148 -> 405
    //   260: invokestatic 147	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   263: astore 5
    //   265: aload 5
    //   267: aload 6
    //   269: iconst_0
    //   270: aload 6
    //   272: arraylength
    //   273: invokevirtual 151	android/os/Parcel:unmarshall	([BII)V
    //   276: aload 5
    //   278: iconst_0
    //   279: invokevirtual 155	android/os/Parcel:setDataPosition	(I)V
    //   282: getstatic 161	R2/I:CREATOR	Landroid/os/Parcelable$Creator;
    //   285: aload 5
    //   287: invokeinterface 167 2 0
    //   292: checkcast 157	R2/I
    //   295: astore 6
    //   297: aload 5
    //   299: invokevirtual 170	android/os/Parcel:recycle	()V
    //   302: lload 10
    //   304: lstore 12
    //   306: aload 6
    //   308: ifnull -91 -> 217
    //   311: aload_2
    //   312: aload 6
    //   314: invokeinterface 176 2 0
    //   319: pop
    //   320: lload 10
    //   322: lstore 12
    //   324: goto -107 -> 217
    //   327: astore 9
    //   329: aload 8
    //   331: astore 5
    //   333: aload 7
    //   335: astore 6
    //   337: aload 9
    //   339: astore 8
    //   341: aload 5
    //   343: astore 7
    //   345: goto +698 -> 1043
    //   348: astore 9
    //   350: aload 7
    //   352: astore 6
    //   354: goto +448 -> 802
    //   357: astore 9
    //   359: aload 7
    //   361: astore 6
    //   363: goto +613 -> 976
    //   366: astore 6
    //   368: goto +29 -> 397
    //   371: astore 6
    //   373: aload_0
    //   374: invokevirtual 180	R2/m3:j	()LR2/Y1;
    //   377: invokevirtual 186	R2/Y1:G	()LR2/a2;
    //   380: ldc -68
    //   382: invokevirtual 193	R2/a2:a	(Ljava/lang/String;)V
    //   385: aload 5
    //   387: invokevirtual 170	android/os/Parcel:recycle	()V
    //   390: lload 10
    //   392: lstore 12
    //   394: goto -177 -> 217
    //   397: aload 5
    //   399: invokevirtual 170	android/os/Parcel:recycle	()V
    //   402: aload 6
    //   404: athrow
    //   405: iload_1
    //   406: iconst_1
    //   407: if_icmpne +95 -> 502
    //   410: invokestatic 147	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   413: astore 5
    //   415: aload 5
    //   417: aload 6
    //   419: iconst_0
    //   420: aload 6
    //   422: arraylength
    //   423: invokevirtual 151	android/os/Parcel:unmarshall	([BII)V
    //   426: aload 5
    //   428: iconst_0
    //   429: invokevirtual 155	android/os/Parcel:setDataPosition	(I)V
    //   432: getstatic 196	R2/R5:CREATOR	Landroid/os/Parcelable$Creator;
    //   435: aload 5
    //   437: invokeinterface 167 2 0
    //   442: checkcast 195	R2/R5
    //   445: astore 6
    //   447: aload 5
    //   449: invokevirtual 170	android/os/Parcel:recycle	()V
    //   452: goto +30 -> 482
    //   455: astore 6
    //   457: goto +37 -> 494
    //   460: astore 6
    //   462: aload_0
    //   463: invokevirtual 180	R2/m3:j	()LR2/Y1;
    //   466: invokevirtual 186	R2/Y1:G	()LR2/a2;
    //   469: ldc -58
    //   471: invokevirtual 193	R2/a2:a	(Ljava/lang/String;)V
    //   474: aload 5
    //   476: invokevirtual 170	android/os/Parcel:recycle	()V
    //   479: aconst_null
    //   480: astore 6
    //   482: lload 10
    //   484: lstore 12
    //   486: aload 6
    //   488: ifnull -271 -> 217
    //   491: goto -180 -> 311
    //   494: aload 5
    //   496: invokevirtual 170	android/os/Parcel:recycle	()V
    //   499: aload 6
    //   501: athrow
    //   502: iload_1
    //   503: iconst_2
    //   504: if_icmpne +95 -> 599
    //   507: invokestatic 147	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   510: astore 5
    //   512: aload 5
    //   514: aload 6
    //   516: iconst_0
    //   517: aload 6
    //   519: arraylength
    //   520: invokevirtual 151	android/os/Parcel:unmarshall	([BII)V
    //   523: aload 5
    //   525: iconst_0
    //   526: invokevirtual 155	android/os/Parcel:setDataPosition	(I)V
    //   529: getstatic 201	R2/e:CREATOR	Landroid/os/Parcelable$Creator;
    //   532: aload 5
    //   534: invokeinterface 167 2 0
    //   539: checkcast 200	R2/e
    //   542: astore 6
    //   544: aload 5
    //   546: invokevirtual 170	android/os/Parcel:recycle	()V
    //   549: goto +30 -> 579
    //   552: astore 6
    //   554: goto +37 -> 591
    //   557: astore 6
    //   559: aload_0
    //   560: invokevirtual 180	R2/m3:j	()LR2/Y1;
    //   563: invokevirtual 186	R2/Y1:G	()LR2/a2;
    //   566: ldc -53
    //   568: invokevirtual 193	R2/a2:a	(Ljava/lang/String;)V
    //   571: aload 5
    //   573: invokevirtual 170	android/os/Parcel:recycle	()V
    //   576: aconst_null
    //   577: astore 6
    //   579: lload 10
    //   581: lstore 12
    //   583: aload 6
    //   585: ifnull -368 -> 217
    //   588: goto -277 -> 311
    //   591: aload 5
    //   593: invokevirtual 170	android/os/Parcel:recycle	()V
    //   596: aload 6
    //   598: athrow
    //   599: iload_1
    //   600: iconst_3
    //   601: if_icmpne +30 -> 631
    //   604: aload_0
    //   605: invokevirtual 180	R2/m3:j	()LR2/Y1;
    //   608: invokevirtual 205	R2/Y1:L	()LR2/a2;
    //   611: astore 5
    //   613: ldc -49
    //   615: astore 6
    //   617: aload 5
    //   619: aload 6
    //   621: invokevirtual 193	R2/a2:a	(Ljava/lang/String;)V
    //   624: lload 10
    //   626: lstore 12
    //   628: goto -411 -> 217
    //   631: aload_0
    //   632: invokevirtual 180	R2/m3:j	()LR2/Y1;
    //   635: invokevirtual 186	R2/Y1:G	()LR2/a2;
    //   638: astore 5
    //   640: ldc -47
    //   642: astore 6
    //   644: goto -27 -> 617
    //   647: aload 8
    //   649: ldc 32
    //   651: ldc -45
    //   653: iconst_1
    //   654: anewarray 34	java/lang/String
    //   657: dup
    //   658: iconst_0
    //   659: lload 12
    //   661: invokestatic 215	java/lang/Long:toString	(J)Ljava/lang/String;
    //   664: aastore
    //   665: invokevirtual 219	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   668: aload_2
    //   669: invokeinterface 223 1 0
    //   674: if_icmpge +15 -> 689
    //   677: aload_0
    //   678: invokevirtual 180	R2/m3:j	()LR2/Y1;
    //   681: invokevirtual 186	R2/Y1:G	()LR2/a2;
    //   684: ldc -31
    //   686: invokevirtual 193	R2/a2:a	(Ljava/lang/String;)V
    //   689: aload 8
    //   691: invokevirtual 228	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   694: aload 8
    //   696: invokevirtual 231	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   699: aload 7
    //   701: invokeinterface 64 1 0
    //   706: aload 8
    //   708: invokevirtual 107	android/database/sqlite/SQLiteClosable:close	()V
    //   711: aload_2
    //   712: areturn
    //   713: astore 6
    //   715: aload 7
    //   717: astore 6
    //   719: goto +200 -> 919
    //   722: astore 8
    //   724: aload 6
    //   726: astore 7
    //   728: aconst_null
    //   729: astore 6
    //   731: goto +312 -> 1043
    //   734: astore 9
    //   736: aload 6
    //   738: astore 8
    //   740: aconst_null
    //   741: astore 6
    //   743: goto +59 -> 802
    //   746: astore 9
    //   748: aload 6
    //   750: astore 8
    //   752: aconst_null
    //   753: astore 6
    //   755: goto +221 -> 976
    //   758: astore 8
    //   760: goto -36 -> 724
    //   763: astore 9
    //   765: goto -29 -> 736
    //   768: astore 9
    //   770: goto -22 -> 748
    //   773: aload 6
    //   775: astore 8
    //   777: aconst_null
    //   778: astore 6
    //   780: goto +139 -> 919
    //   783: astore 8
    //   785: aconst_null
    //   786: astore 6
    //   788: aconst_null
    //   789: astore 7
    //   791: goto +252 -> 1043
    //   794: astore 9
    //   796: aconst_null
    //   797: astore 6
    //   799: aconst_null
    //   800: astore 8
    //   802: aload 8
    //   804: ifnull +48 -> 852
    //   807: aload 6
    //   809: astore 5
    //   811: aload 8
    //   813: astore 7
    //   815: aload 8
    //   817: invokevirtual 234	android/database/sqlite/SQLiteDatabase:inTransaction	()Z
    //   820: ifeq +32 -> 852
    //   823: aload 6
    //   825: astore 5
    //   827: aload 8
    //   829: astore 7
    //   831: aload 8
    //   833: invokevirtual 231	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   836: goto +16 -> 852
    //   839: astore 8
    //   841: aload 5
    //   843: astore 6
    //   845: aload 7
    //   847: astore 5
    //   849: goto -508 -> 341
    //   852: aload 6
    //   854: astore 5
    //   856: aload 8
    //   858: astore 7
    //   860: aload_0
    //   861: invokevirtual 180	R2/m3:j	()LR2/Y1;
    //   864: invokevirtual 186	R2/Y1:G	()LR2/a2;
    //   867: ldc -20
    //   869: aload 9
    //   871: invokevirtual 240	R2/a2:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   874: aload 6
    //   876: astore 5
    //   878: aload 8
    //   880: astore 7
    //   882: aload_0
    //   883: iconst_1
    //   884: putfield 94	R2/V1:d	Z
    //   887: aload 6
    //   889: ifnull +10 -> 899
    //   892: aload 6
    //   894: invokeinterface 64 1 0
    //   899: iload_3
    //   900: istore_1
    //   901: aload 8
    //   903: ifnull +132 -> 1035
    //   906: iload_3
    //   907: istore_1
    //   908: goto +52 -> 960
    //   911: astore 8
    //   913: aconst_null
    //   914: astore 6
    //   916: aconst_null
    //   917: astore 8
    //   919: iload_3
    //   920: i2l
    //   921: lstore 12
    //   923: aload 6
    //   925: astore 5
    //   927: aload 8
    //   929: astore 7
    //   931: lload 12
    //   933: invokestatic 246	android/os/SystemClock:sleep	(J)V
    //   936: iinc 3 20
    //   939: aload 6
    //   941: ifnull +10 -> 951
    //   944: aload 6
    //   946: invokeinterface 64 1 0
    //   951: iload_3
    //   952: istore_1
    //   953: aload 8
    //   955: ifnull +80 -> 1035
    //   958: iload_3
    //   959: istore_1
    //   960: aload 8
    //   962: invokevirtual 107	android/database/sqlite/SQLiteClosable:close	()V
    //   965: goto +70 -> 1035
    //   968: astore 9
    //   970: aconst_null
    //   971: astore 6
    //   973: aconst_null
    //   974: astore 8
    //   976: aload 6
    //   978: astore 5
    //   980: aload 8
    //   982: astore 7
    //   984: aload_0
    //   985: invokevirtual 180	R2/m3:j	()LR2/Y1;
    //   988: invokevirtual 186	R2/Y1:G	()LR2/a2;
    //   991: ldc -20
    //   993: aload 9
    //   995: invokevirtual 240	R2/a2:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   998: aload 6
    //   1000: astore 5
    //   1002: aload 8
    //   1004: astore 7
    //   1006: aload_0
    //   1007: iconst_1
    //   1008: putfield 94	R2/V1:d	Z
    //   1011: aload 6
    //   1013: ifnull +10 -> 1023
    //   1016: aload 6
    //   1018: invokeinterface 64 1 0
    //   1023: iload_3
    //   1024: istore_1
    //   1025: aload 8
    //   1027: ifnull +8 -> 1035
    //   1030: iload_3
    //   1031: istore_1
    //   1032: goto -72 -> 960
    //   1035: iinc 4 1
    //   1038: iload_1
    //   1039: istore_3
    //   1040: goto -1005 -> 35
    //   1043: aload 6
    //   1045: ifnull +10 -> 1055
    //   1048: aload 6
    //   1050: invokeinterface 64 1 0
    //   1055: aload 7
    //   1057: ifnull +8 -> 1065
    //   1060: aload 7
    //   1062: invokevirtual 107	android/database/sqlite/SQLiteClosable:close	()V
    //   1065: aload 8
    //   1067: athrow
    //   1068: aload_0
    //   1069: invokevirtual 180	R2/m3:j	()LR2/Y1;
    //   1072: invokevirtual 205	R2/Y1:L	()LR2/a2;
    //   1075: ldc -8
    //   1077: invokevirtual 193	R2/a2:a	(Ljava/lang/String;)V
    //   1080: aconst_null
    //   1081: areturn
    //   1082: astore 8
    //   1084: goto -311 -> 773
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1087	0	this	V1
    //   0	1087	1	paramInt	int
    //   20	692	2	localArrayList	java.util.ArrayList
    //   31	1009	3	i	int
    //   33	1003	4	j	int
    //   36	965	5	localObject1	Object
    //   48	314	6	localObject2	Object
    //   366	1	6	localObject3	Object
    //   371	50	6	locala1	B2.b.a
    //   445	1	6	localR5	R5
    //   455	1	6	localObject4	Object
    //   460	1	6	locala2	B2.b.a
    //   480	63	6	localObject5	Object
    //   552	1	6	localObject6	Object
    //   557	1	6	locala3	B2.b.a
    //   577	66	6	str1	String
    //   713	1	6	localSQLiteDatabaseLockedException1	android.database.sqlite.SQLiteDatabaseLockedException
    //   717	332	6	localObject7	Object
    //   52	1009	7	localObject8	Object
    //   76	1	8	localObject9	Object
    //   92	1	8	localObject10	Object
    //   97	1	8	localSQLiteDatabaseLockedException2	android.database.sqlite.SQLiteDatabaseLockedException
    //   109	598	8	localObject11	Object
    //   722	1	8	localObject12	Object
    //   738	13	8	localObject13	Object
    //   758	1	8	localObject14	Object
    //   775	1	8	localObject15	Object
    //   783	1	8	localObject16	Object
    //   800	32	8	localObject17	Object
    //   839	63	8	localObject18	Object
    //   911	1	8	localSQLiteDatabaseLockedException3	android.database.sqlite.SQLiteDatabaseLockedException
    //   917	149	8	localObject19	Object
    //   1082	1	8	localSQLiteDatabaseLockedException4	android.database.sqlite.SQLiteDatabaseLockedException
    //   85	1	9	localSQLiteException1	SQLiteException
    //   102	1	9	localSQLiteFullException1	android.database.sqlite.SQLiteFullException
    //   142	61	9	str2	String
    //   327	11	9	localObject20	Object
    //   348	1	9	localSQLiteException2	SQLiteException
    //   357	1	9	localSQLiteFullException2	android.database.sqlite.SQLiteFullException
    //   734	1	9	localSQLiteException3	SQLiteException
    //   746	1	9	localSQLiteFullException3	android.database.sqlite.SQLiteFullException
    //   763	1	9	localSQLiteException4	SQLiteException
    //   768	1	9	localSQLiteFullException4	android.database.sqlite.SQLiteFullException
    //   794	76	9	localSQLiteException5	SQLiteException
    //   968	26	9	localSQLiteFullException5	android.database.sqlite.SQLiteFullException
    //   124	501	10	l1	long
    //   129	803	12	l2	long
    //   173	38	14	str3	String
    // Exception table:
    //   from	to	target	type
    //   59	64	76	finally
    //   59	64	85	android/database/sqlite/SQLiteException
    //   59	64	97	android/database/sqlite/SQLiteDatabaseLockedException
    //   114	126	97	android/database/sqlite/SQLiteDatabaseLockedException
    //   168	175	97	android/database/sqlite/SQLiteDatabaseLockedException
    //   59	64	102	android/database/sqlite/SQLiteFullException
    //   217	256	327	finally
    //   260	265	327	finally
    //   297	302	327	finally
    //   311	320	327	finally
    //   385	390	327	finally
    //   397	405	327	finally
    //   410	415	327	finally
    //   447	452	327	finally
    //   474	479	327	finally
    //   494	502	327	finally
    //   507	512	327	finally
    //   544	549	327	finally
    //   571	576	327	finally
    //   591	599	327	finally
    //   604	613	327	finally
    //   617	624	327	finally
    //   631	640	327	finally
    //   647	689	327	finally
    //   689	699	327	finally
    //   217	256	348	android/database/sqlite/SQLiteException
    //   260	265	348	android/database/sqlite/SQLiteException
    //   297	302	348	android/database/sqlite/SQLiteException
    //   311	320	348	android/database/sqlite/SQLiteException
    //   385	390	348	android/database/sqlite/SQLiteException
    //   397	405	348	android/database/sqlite/SQLiteException
    //   410	415	348	android/database/sqlite/SQLiteException
    //   447	452	348	android/database/sqlite/SQLiteException
    //   474	479	348	android/database/sqlite/SQLiteException
    //   494	502	348	android/database/sqlite/SQLiteException
    //   507	512	348	android/database/sqlite/SQLiteException
    //   544	549	348	android/database/sqlite/SQLiteException
    //   571	576	348	android/database/sqlite/SQLiteException
    //   591	599	348	android/database/sqlite/SQLiteException
    //   604	613	348	android/database/sqlite/SQLiteException
    //   617	624	348	android/database/sqlite/SQLiteException
    //   631	640	348	android/database/sqlite/SQLiteException
    //   647	689	348	android/database/sqlite/SQLiteException
    //   689	699	348	android/database/sqlite/SQLiteException
    //   217	256	357	android/database/sqlite/SQLiteFullException
    //   260	265	357	android/database/sqlite/SQLiteFullException
    //   297	302	357	android/database/sqlite/SQLiteFullException
    //   311	320	357	android/database/sqlite/SQLiteFullException
    //   385	390	357	android/database/sqlite/SQLiteFullException
    //   397	405	357	android/database/sqlite/SQLiteFullException
    //   410	415	357	android/database/sqlite/SQLiteFullException
    //   447	452	357	android/database/sqlite/SQLiteFullException
    //   474	479	357	android/database/sqlite/SQLiteFullException
    //   494	502	357	android/database/sqlite/SQLiteFullException
    //   507	512	357	android/database/sqlite/SQLiteFullException
    //   544	549	357	android/database/sqlite/SQLiteFullException
    //   571	576	357	android/database/sqlite/SQLiteFullException
    //   591	599	357	android/database/sqlite/SQLiteFullException
    //   604	613	357	android/database/sqlite/SQLiteFullException
    //   617	624	357	android/database/sqlite/SQLiteFullException
    //   631	640	357	android/database/sqlite/SQLiteFullException
    //   647	689	357	android/database/sqlite/SQLiteFullException
    //   689	699	357	android/database/sqlite/SQLiteFullException
    //   265	297	366	finally
    //   373	385	366	finally
    //   265	297	371	B2/b$a
    //   415	447	455	finally
    //   462	474	455	finally
    //   415	447	460	B2/b$a
    //   512	544	552	finally
    //   559	571	552	finally
    //   512	544	557	B2/b$a
    //   217	256	713	android/database/sqlite/SQLiteDatabaseLockedException
    //   260	265	713	android/database/sqlite/SQLiteDatabaseLockedException
    //   297	302	713	android/database/sqlite/SQLiteDatabaseLockedException
    //   311	320	713	android/database/sqlite/SQLiteDatabaseLockedException
    //   385	390	713	android/database/sqlite/SQLiteDatabaseLockedException
    //   397	405	713	android/database/sqlite/SQLiteDatabaseLockedException
    //   410	415	713	android/database/sqlite/SQLiteDatabaseLockedException
    //   447	452	713	android/database/sqlite/SQLiteDatabaseLockedException
    //   474	479	713	android/database/sqlite/SQLiteDatabaseLockedException
    //   494	502	713	android/database/sqlite/SQLiteDatabaseLockedException
    //   507	512	713	android/database/sqlite/SQLiteDatabaseLockedException
    //   544	549	713	android/database/sqlite/SQLiteDatabaseLockedException
    //   571	576	713	android/database/sqlite/SQLiteDatabaseLockedException
    //   591	599	713	android/database/sqlite/SQLiteDatabaseLockedException
    //   604	613	713	android/database/sqlite/SQLiteDatabaseLockedException
    //   617	624	713	android/database/sqlite/SQLiteDatabaseLockedException
    //   631	640	713	android/database/sqlite/SQLiteDatabaseLockedException
    //   647	689	713	android/database/sqlite/SQLiteDatabaseLockedException
    //   689	699	713	android/database/sqlite/SQLiteDatabaseLockedException
    //   179	217	722	finally
    //   179	217	734	android/database/sqlite/SQLiteException
    //   179	217	746	android/database/sqlite/SQLiteFullException
    //   114	126	758	finally
    //   168	175	758	finally
    //   114	126	763	android/database/sqlite/SQLiteException
    //   168	175	763	android/database/sqlite/SQLiteException
    //   114	126	768	android/database/sqlite/SQLiteFullException
    //   168	175	768	android/database/sqlite/SQLiteFullException
    //   44	50	783	finally
    //   44	50	794	android/database/sqlite/SQLiteException
    //   815	823	839	finally
    //   831	836	839	finally
    //   860	874	839	finally
    //   882	887	839	finally
    //   931	936	839	finally
    //   984	998	839	finally
    //   1006	1011	839	finally
    //   44	50	911	android/database/sqlite/SQLiteDatabaseLockedException
    //   44	50	968	android/database/sqlite/SQLiteFullException
    //   179	217	1082	android/database/sqlite/SQLiteDatabaseLockedException
  }
  
  /* Error */
  public final boolean D(int paramInt, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 92	R2/m3:n	()V
    //   4: aload_0
    //   5: getfield 94	R2/V1:d	Z
    //   8: ifeq +5 -> 13
    //   11: iconst_0
    //   12: ireturn
    //   13: new 252	android/content/ContentValues
    //   16: dup
    //   17: invokespecial 253	android/content/ContentValues:<init>	()V
    //   20: astore_3
    //   21: aload_3
    //   22: ldc 126
    //   24: iload_1
    //   25: invokestatic 256	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   28: invokevirtual 260	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   31: aload_3
    //   32: ldc -128
    //   34: aload_2
    //   35: invokevirtual 263	android/content/ContentValues:put	(Ljava/lang/String;[B)V
    //   38: iconst_0
    //   39: istore 4
    //   41: iconst_5
    //   42: istore 5
    //   44: iload 4
    //   46: iconst_5
    //   47: if_icmpge +542 -> 589
    //   50: aconst_null
    //   51: astore 6
    //   53: aconst_null
    //   54: astore 7
    //   56: aconst_null
    //   57: astore 8
    //   59: aconst_null
    //   60: astore 9
    //   62: aconst_null
    //   63: astore 10
    //   65: aload_0
    //   66: invokevirtual 104	R2/V1:K	()Landroid/database/sqlite/SQLiteDatabase;
    //   69: astore_2
    //   70: aload_2
    //   71: ifnonnull +52 -> 123
    //   74: aload 10
    //   76: astore 9
    //   78: aload_2
    //   79: astore 6
    //   81: aload_0
    //   82: iconst_1
    //   83: putfield 94	R2/V1:d	Z
    //   86: aload_2
    //   87: ifnull +7 -> 94
    //   90: aload_2
    //   91: invokevirtual 107	android/database/sqlite/SQLiteClosable:close	()V
    //   94: iconst_0
    //   95: ireturn
    //   96: astore_2
    //   97: goto +468 -> 565
    //   100: astore 6
    //   102: aconst_null
    //   103: astore 10
    //   105: aload 6
    //   107: astore 9
    //   109: aload_2
    //   110: astore 6
    //   112: aload 10
    //   114: astore_2
    //   115: goto +244 -> 359
    //   118: astore 10
    //   120: goto +377 -> 497
    //   123: aload 10
    //   125: astore 9
    //   127: aload_2
    //   128: astore 6
    //   130: aload_2
    //   131: invokevirtual 110	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   134: aload 10
    //   136: astore 9
    //   138: aload_2
    //   139: astore 6
    //   141: aload_2
    //   142: ldc_w 265
    //   145: aconst_null
    //   146: invokevirtual 269	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   149: astore 10
    //   151: aload 10
    //   153: ifnull +59 -> 212
    //   156: aload 10
    //   158: invokeinterface 56 1 0
    //   163: ifeq +49 -> 212
    //   166: aload 10
    //   168: iconst_0
    //   169: invokeinterface 60 2 0
    //   174: lstore 11
    //   176: goto +39 -> 215
    //   179: astore 9
    //   181: aload_2
    //   182: astore 6
    //   184: aload 9
    //   186: astore_2
    //   187: aload 10
    //   189: astore 9
    //   191: goto +374 -> 565
    //   194: astore 6
    //   196: goto -91 -> 105
    //   199: astore 6
    //   201: aload 10
    //   203: astore 8
    //   205: aload 6
    //   207: astore 10
    //   209: goto +288 -> 497
    //   212: lconst_0
    //   213: lstore 11
    //   215: lload 11
    //   217: ldc2_w 270
    //   220: lcmp
    //   221: iflt +87 -> 308
    //   224: aload_0
    //   225: invokevirtual 180	R2/m3:j	()LR2/Y1;
    //   228: invokevirtual 186	R2/Y1:G	()LR2/a2;
    //   231: ldc_w 273
    //   234: invokevirtual 193	R2/a2:a	(Ljava/lang/String;)V
    //   237: ldc2_w 274
    //   240: lload 11
    //   242: lsub
    //   243: lstore 13
    //   245: aload_2
    //   246: ldc 32
    //   248: ldc_w 277
    //   251: iconst_1
    //   252: anewarray 34	java/lang/String
    //   255: dup
    //   256: iconst_0
    //   257: lload 13
    //   259: invokestatic 215	java/lang/Long:toString	(J)Ljava/lang/String;
    //   262: aastore
    //   263: invokevirtual 219	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   266: i2l
    //   267: lstore 11
    //   269: lload 11
    //   271: lload 13
    //   273: lcmp
    //   274: ifeq +34 -> 308
    //   277: aload_0
    //   278: invokevirtual 180	R2/m3:j	()LR2/Y1;
    //   281: invokevirtual 186	R2/Y1:G	()LR2/a2;
    //   284: ldc_w 279
    //   287: lload 13
    //   289: invokestatic 282	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   292: lload 11
    //   294: invokestatic 282	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   297: lload 13
    //   299: lload 11
    //   301: lsub
    //   302: invokestatic 282	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   305: invokevirtual 285	R2/a2:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   308: aload_2
    //   309: ldc 32
    //   311: aconst_null
    //   312: aload_3
    //   313: invokevirtual 289	android/database/sqlite/SQLiteDatabase:insertOrThrow	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   316: pop2
    //   317: aload_2
    //   318: invokevirtual 228	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   321: aload_2
    //   322: invokevirtual 231	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   325: aload 10
    //   327: ifnull +10 -> 337
    //   330: aload 10
    //   332: invokeinterface 64 1 0
    //   337: aload_2
    //   338: invokevirtual 107	android/database/sqlite/SQLiteClosable:close	()V
    //   341: iconst_1
    //   342: ireturn
    //   343: astore 6
    //   345: goto +99 -> 444
    //   348: astore_2
    //   349: aconst_null
    //   350: astore 6
    //   352: goto +213 -> 565
    //   355: astore 9
    //   357: aconst_null
    //   358: astore_2
    //   359: aload 6
    //   361: ifnull +27 -> 388
    //   364: aload 6
    //   366: invokevirtual 234	android/database/sqlite/SQLiteDatabase:inTransaction	()Z
    //   369: ifeq +19 -> 388
    //   372: aload 6
    //   374: invokevirtual 231	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   377: goto +11 -> 388
    //   380: astore 9
    //   382: aload_2
    //   383: astore 10
    //   385: goto -201 -> 184
    //   388: aload_0
    //   389: invokevirtual 180	R2/m3:j	()LR2/Y1;
    //   392: invokevirtual 186	R2/Y1:G	()LR2/a2;
    //   395: ldc_w 291
    //   398: aload 9
    //   400: invokevirtual 240	R2/a2:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   403: aload_0
    //   404: iconst_1
    //   405: putfield 94	R2/V1:d	Z
    //   408: aload_2
    //   409: ifnull +9 -> 418
    //   412: aload_2
    //   413: invokeinterface 64 1 0
    //   418: iload 5
    //   420: istore_1
    //   421: aload 6
    //   423: ifnull +133 -> 556
    //   426: aload 6
    //   428: invokevirtual 107	android/database/sqlite/SQLiteClosable:close	()V
    //   431: iload 5
    //   433: istore_1
    //   434: goto +122 -> 556
    //   437: astore_2
    //   438: aconst_null
    //   439: astore_2
    //   440: aload 7
    //   442: astore 10
    //   444: iload 5
    //   446: i2l
    //   447: lstore 11
    //   449: aload 10
    //   451: astore 9
    //   453: aload_2
    //   454: astore 6
    //   456: lload 11
    //   458: invokestatic 246	android/os/SystemClock:sleep	(J)V
    //   461: iinc 5 20
    //   464: aload 10
    //   466: ifnull +10 -> 476
    //   469: aload 10
    //   471: invokeinterface 64 1 0
    //   476: iload 5
    //   478: istore_1
    //   479: aload_2
    //   480: ifnull +76 -> 556
    //   483: iload 5
    //   485: istore_1
    //   486: aload_2
    //   487: invokevirtual 107	android/database/sqlite/SQLiteClosable:close	()V
    //   490: goto +66 -> 556
    //   493: astore 10
    //   495: aconst_null
    //   496: astore_2
    //   497: aload 8
    //   499: astore 9
    //   501: aload_2
    //   502: astore 6
    //   504: aload_0
    //   505: invokevirtual 180	R2/m3:j	()LR2/Y1;
    //   508: invokevirtual 186	R2/Y1:G	()LR2/a2;
    //   511: ldc_w 293
    //   514: aload 10
    //   516: invokevirtual 240	R2/a2:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   519: aload 8
    //   521: astore 9
    //   523: aload_2
    //   524: astore 6
    //   526: aload_0
    //   527: iconst_1
    //   528: putfield 94	R2/V1:d	Z
    //   531: aload 8
    //   533: ifnull +10 -> 543
    //   536: aload 8
    //   538: invokeinterface 64 1 0
    //   543: iload 5
    //   545: istore_1
    //   546: aload_2
    //   547: ifnull +9 -> 556
    //   550: iload 5
    //   552: istore_1
    //   553: goto -67 -> 486
    //   556: iinc 4 1
    //   559: iload_1
    //   560: istore 5
    //   562: goto -518 -> 44
    //   565: aload 9
    //   567: ifnull +10 -> 577
    //   570: aload 9
    //   572: invokeinterface 64 1 0
    //   577: aload 6
    //   579: ifnull +8 -> 587
    //   582: aload 6
    //   584: invokevirtual 107	android/database/sqlite/SQLiteClosable:close	()V
    //   587: aload_2
    //   588: athrow
    //   589: aload_0
    //   590: invokevirtual 180	R2/m3:j	()LR2/Y1;
    //   593: invokevirtual 295	R2/Y1:K	()LR2/a2;
    //   596: ldc_w 297
    //   599: invokevirtual 193	R2/a2:a	(Ljava/lang/String;)V
    //   602: iconst_0
    //   603: ireturn
    //   604: astore 6
    //   606: aload 7
    //   608: astore 10
    //   610: goto -166 -> 444
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	613	0	this	V1
    //   0	613	1	paramInt	int
    //   0	613	2	paramArrayOfByte	byte[]
    //   20	293	3	localContentValues	android.content.ContentValues
    //   39	518	4	i	int
    //   42	519	5	j	int
    //   51	29	6	arrayOfByte1	byte[]
    //   100	6	6	localSQLiteException1	SQLiteException
    //   110	73	6	arrayOfByte2	byte[]
    //   194	1	6	localSQLiteException2	SQLiteException
    //   199	7	6	localSQLiteFullException1	android.database.sqlite.SQLiteFullException
    //   343	1	6	localSQLiteDatabaseLockedException1	android.database.sqlite.SQLiteDatabaseLockedException
    //   350	233	6	arrayOfByte3	byte[]
    //   604	1	6	localSQLiteDatabaseLockedException2	android.database.sqlite.SQLiteDatabaseLockedException
    //   54	553	7	localObject1	Object
    //   57	480	8	localObject2	Object
    //   60	77	9	localObject3	Object
    //   179	6	9	localObject4	Object
    //   189	1	9	localObject5	Object
    //   355	1	9	localSQLiteException3	SQLiteException
    //   380	19	9	localObject6	Object
    //   451	120	9	localObject7	Object
    //   63	50	10	localObject8	Object
    //   118	17	10	localSQLiteFullException2	android.database.sqlite.SQLiteFullException
    //   149	321	10	localObject9	Object
    //   493	22	10	localSQLiteFullException3	android.database.sqlite.SQLiteFullException
    //   608	1	10	localObject10	Object
    //   174	283	11	l1	long
    //   243	55	13	l2	long
    // Exception table:
    //   from	to	target	type
    //   81	86	96	finally
    //   130	134	96	finally
    //   141	151	96	finally
    //   456	461	96	finally
    //   504	519	96	finally
    //   526	531	96	finally
    //   81	86	100	android/database/sqlite/SQLiteException
    //   130	134	100	android/database/sqlite/SQLiteException
    //   141	151	100	android/database/sqlite/SQLiteException
    //   81	86	118	android/database/sqlite/SQLiteFullException
    //   130	134	118	android/database/sqlite/SQLiteFullException
    //   141	151	118	android/database/sqlite/SQLiteFullException
    //   156	176	179	finally
    //   224	237	179	finally
    //   245	269	179	finally
    //   277	308	179	finally
    //   308	325	179	finally
    //   156	176	194	android/database/sqlite/SQLiteException
    //   224	237	194	android/database/sqlite/SQLiteException
    //   245	269	194	android/database/sqlite/SQLiteException
    //   277	308	194	android/database/sqlite/SQLiteException
    //   308	325	194	android/database/sqlite/SQLiteException
    //   156	176	199	android/database/sqlite/SQLiteFullException
    //   224	237	199	android/database/sqlite/SQLiteFullException
    //   245	269	199	android/database/sqlite/SQLiteFullException
    //   277	308	199	android/database/sqlite/SQLiteFullException
    //   308	325	199	android/database/sqlite/SQLiteFullException
    //   156	176	343	android/database/sqlite/SQLiteDatabaseLockedException
    //   224	237	343	android/database/sqlite/SQLiteDatabaseLockedException
    //   245	269	343	android/database/sqlite/SQLiteDatabaseLockedException
    //   277	308	343	android/database/sqlite/SQLiteDatabaseLockedException
    //   308	325	343	android/database/sqlite/SQLiteDatabaseLockedException
    //   65	70	348	finally
    //   65	70	355	android/database/sqlite/SQLiteException
    //   364	377	380	finally
    //   388	408	380	finally
    //   65	70	437	android/database/sqlite/SQLiteDatabaseLockedException
    //   65	70	493	android/database/sqlite/SQLiteFullException
    //   81	86	604	android/database/sqlite/SQLiteDatabaseLockedException
    //   130	134	604	android/database/sqlite/SQLiteDatabaseLockedException
    //   141	151	604	android/database/sqlite/SQLiteDatabaseLockedException
  }
  
  public final boolean E(e parame)
  {
    k();
    parame = S5.p0(parame);
    if (parame.length > 131072)
    {
      j().I().a("Conditional user property too long for local database. Sending directly to service");
      return false;
    }
    return D(2, parame);
  }
  
  public final boolean F(I paramI)
  {
    Parcel localParcel = Parcel.obtain();
    paramI.writeToParcel(localParcel, 0);
    paramI = localParcel.marshall();
    localParcel.recycle();
    if (paramI.length > 131072)
    {
      j().I().a("Event is too long for local database. Sending event directly to service");
      return false;
    }
    return D(0, paramI);
  }
  
  public final boolean G(R5 paramR5)
  {
    Parcel localParcel = Parcel.obtain();
    paramR5.writeToParcel(localParcel, 0);
    paramR5 = localParcel.marshall();
    localParcel.recycle();
    if (paramR5.length > 131072)
    {
      j().I().a("User property too long for local database. Sending directly to service");
      return false;
    }
    return D(1, paramR5);
  }
  
  public final void H()
  {
    n();
    try
    {
      SQLiteDatabase localSQLiteDatabase = K();
      if (localSQLiteDatabase != null)
      {
        int i = localSQLiteDatabase.delete("messages", null, null);
        if (i > 0) {
          j().K().b("Reset local analytics data. records", Integer.valueOf(i));
        }
      }
    }
    catch (SQLiteException localSQLiteException)
    {
      break label51;
    }
    return;
    label51:
    j().G().b("Error resetting local analytics data. error", localSQLiteException);
  }
  
  public final boolean I()
  {
    return D(3, new byte[0]);
  }
  
  /* Error */
  public final boolean J()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 92	R2/m3:n	()V
    //   4: aload_0
    //   5: getfield 94	R2/V1:d	Z
    //   8: ifeq +5 -> 13
    //   11: iconst_0
    //   12: ireturn
    //   13: aload_0
    //   14: invokespecial 100	R2/V1:L	()Z
    //   17: ifne +5 -> 22
    //   20: iconst_0
    //   21: ireturn
    //   22: iconst_5
    //   23: istore_1
    //   24: iconst_0
    //   25: istore_2
    //   26: iload_2
    //   27: iconst_5
    //   28: if_icmpge +334 -> 362
    //   31: aconst_null
    //   32: astore_3
    //   33: aconst_null
    //   34: astore 4
    //   36: aconst_null
    //   37: astore 5
    //   39: aconst_null
    //   40: astore 6
    //   42: aload_0
    //   43: invokevirtual 104	R2/V1:K	()Landroid/database/sqlite/SQLiteDatabase;
    //   46: astore 7
    //   48: aload 7
    //   50: ifnonnull +48 -> 98
    //   53: aload 7
    //   55: astore 6
    //   57: aload 7
    //   59: astore_3
    //   60: aload 7
    //   62: astore 4
    //   64: aload 7
    //   66: astore 5
    //   68: aload_0
    //   69: iconst_1
    //   70: putfield 94	R2/V1:d	Z
    //   73: aload 7
    //   75: ifnull +8 -> 83
    //   78: aload 7
    //   80: invokevirtual 107	android/database/sqlite/SQLiteClosable:close	()V
    //   83: iconst_0
    //   84: ireturn
    //   85: astore_3
    //   86: goto +264 -> 350
    //   89: astore 4
    //   91: goto +111 -> 202
    //   94: astore_3
    //   95: goto +202 -> 297
    //   98: aload 7
    //   100: astore 6
    //   102: aload 7
    //   104: astore_3
    //   105: aload 7
    //   107: astore 4
    //   109: aload 7
    //   111: astore 5
    //   113: aload 7
    //   115: invokevirtual 110	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   118: aload 7
    //   120: astore 6
    //   122: aload 7
    //   124: astore_3
    //   125: aload 7
    //   127: astore 4
    //   129: aload 7
    //   131: astore 5
    //   133: aload 7
    //   135: ldc 32
    //   137: ldc_w 341
    //   140: iconst_1
    //   141: anewarray 34	java/lang/String
    //   144: dup
    //   145: iconst_0
    //   146: iconst_3
    //   147: invokestatic 124	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   150: aastore
    //   151: invokevirtual 219	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   154: pop
    //   155: aload 7
    //   157: astore 6
    //   159: aload 7
    //   161: astore_3
    //   162: aload 7
    //   164: astore 4
    //   166: aload 7
    //   168: astore 5
    //   170: aload 7
    //   172: invokevirtual 228	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   175: aload 7
    //   177: astore 6
    //   179: aload 7
    //   181: astore_3
    //   182: aload 7
    //   184: astore 4
    //   186: aload 7
    //   188: astore 5
    //   190: aload 7
    //   192: invokevirtual 231	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   195: aload 7
    //   197: invokevirtual 107	android/database/sqlite/SQLiteClosable:close	()V
    //   200: iconst_1
    //   201: ireturn
    //   202: aload_3
    //   203: ifnull +20 -> 223
    //   206: aload_3
    //   207: astore 6
    //   209: aload_3
    //   210: invokevirtual 234	android/database/sqlite/SQLiteDatabase:inTransaction	()Z
    //   213: ifeq +10 -> 223
    //   216: aload_3
    //   217: astore 6
    //   219: aload_3
    //   220: invokevirtual 231	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   223: aload_3
    //   224: astore 6
    //   226: aload_0
    //   227: invokevirtual 180	R2/m3:j	()LR2/Y1;
    //   230: invokevirtual 186	R2/Y1:G	()LR2/a2;
    //   233: ldc_w 343
    //   236: aload 4
    //   238: invokevirtual 240	R2/a2:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   241: aload_3
    //   242: astore 6
    //   244: aload_0
    //   245: iconst_1
    //   246: putfield 94	R2/V1:d	Z
    //   249: iload_1
    //   250: istore 8
    //   252: aload_3
    //   253: ifnull +88 -> 341
    //   256: iload_1
    //   257: istore 8
    //   259: goto +31 -> 290
    //   262: astore 6
    //   264: aload 5
    //   266: astore 6
    //   268: iload_1
    //   269: i2l
    //   270: invokestatic 246	android/os/SystemClock:sleep	(J)V
    //   273: iinc 1 20
    //   276: iload_1
    //   277: istore 8
    //   279: aload 5
    //   281: ifnull +60 -> 341
    //   284: aload 5
    //   286: astore_3
    //   287: iload_1
    //   288: istore 8
    //   290: aload_3
    //   291: invokevirtual 107	android/database/sqlite/SQLiteClosable:close	()V
    //   294: goto +47 -> 341
    //   297: aload 4
    //   299: astore 6
    //   301: aload_0
    //   302: invokevirtual 180	R2/m3:j	()LR2/Y1;
    //   305: invokevirtual 186	R2/Y1:G	()LR2/a2;
    //   308: ldc_w 343
    //   311: aload_3
    //   312: invokevirtual 240	R2/a2:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   315: aload 4
    //   317: astore 6
    //   319: aload_0
    //   320: iconst_1
    //   321: putfield 94	R2/V1:d	Z
    //   324: iload_1
    //   325: istore 8
    //   327: aload 4
    //   329: ifnull +12 -> 341
    //   332: iload_1
    //   333: istore 8
    //   335: aload 4
    //   337: astore_3
    //   338: goto -48 -> 290
    //   341: iinc 2 1
    //   344: iload 8
    //   346: istore_1
    //   347: goto -321 -> 26
    //   350: aload 6
    //   352: ifnull +8 -> 360
    //   355: aload 6
    //   357: invokevirtual 107	android/database/sqlite/SQLiteClosable:close	()V
    //   360: aload_3
    //   361: athrow
    //   362: aload_0
    //   363: invokevirtual 180	R2/m3:j	()LR2/Y1;
    //   366: invokevirtual 205	R2/Y1:L	()LR2/a2;
    //   369: ldc_w 345
    //   372: invokevirtual 193	R2/a2:a	(Ljava/lang/String;)V
    //   375: iconst_0
    //   376: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	377	0	this	V1
    //   23	324	1	i	int
    //   25	317	2	j	int
    //   32	28	3	localObject1	Object
    //   85	1	3	localObject2	Object
    //   94	1	3	localSQLiteFullException	android.database.sqlite.SQLiteFullException
    //   104	257	3	localObject3	Object
    //   34	29	4	localObject4	Object
    //   89	1	4	localSQLiteException	SQLiteException
    //   107	229	4	localObject5	Object
    //   37	248	5	localObject6	Object
    //   40	203	6	localObject7	Object
    //   262	1	6	localSQLiteDatabaseLockedException	android.database.sqlite.SQLiteDatabaseLockedException
    //   266	90	6	localObject8	Object
    //   46	150	7	localSQLiteDatabase	SQLiteDatabase
    //   250	95	8	k	int
    // Exception table:
    //   from	to	target	type
    //   42	48	85	finally
    //   68	73	85	finally
    //   113	118	85	finally
    //   133	155	85	finally
    //   170	175	85	finally
    //   190	195	85	finally
    //   209	216	85	finally
    //   219	223	85	finally
    //   226	241	85	finally
    //   244	249	85	finally
    //   268	273	85	finally
    //   301	315	85	finally
    //   319	324	85	finally
    //   42	48	89	android/database/sqlite/SQLiteException
    //   68	73	89	android/database/sqlite/SQLiteException
    //   113	118	89	android/database/sqlite/SQLiteException
    //   133	155	89	android/database/sqlite/SQLiteException
    //   170	175	89	android/database/sqlite/SQLiteException
    //   190	195	89	android/database/sqlite/SQLiteException
    //   42	48	94	android/database/sqlite/SQLiteFullException
    //   68	73	94	android/database/sqlite/SQLiteFullException
    //   113	118	94	android/database/sqlite/SQLiteFullException
    //   133	155	94	android/database/sqlite/SQLiteFullException
    //   170	175	94	android/database/sqlite/SQLiteFullException
    //   190	195	94	android/database/sqlite/SQLiteFullException
    //   42	48	262	android/database/sqlite/SQLiteDatabaseLockedException
    //   68	73	262	android/database/sqlite/SQLiteDatabaseLockedException
    //   113	118	262	android/database/sqlite/SQLiteDatabaseLockedException
    //   133	155	262	android/database/sqlite/SQLiteDatabaseLockedException
    //   170	175	262	android/database/sqlite/SQLiteDatabaseLockedException
    //   190	195	262	android/database/sqlite/SQLiteDatabaseLockedException
  }
  
  public final SQLiteDatabase K()
  {
    if (d) {
      return null;
    }
    SQLiteDatabase localSQLiteDatabase = c.getWritableDatabase();
    if (localSQLiteDatabase == null)
    {
      d = true;
      return null;
    }
    return localSQLiteDatabase;
  }
}

/* Location:
 * Qualified Name:     R2.V1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */