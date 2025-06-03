package i9;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import f;
import g;
import java.util.ArrayList;
import p2.m0;

public final class h1
{
  public final SQLiteDatabase a;
  public final i b;
  
  public h1(SQLiteDatabase paramSQLiteDatabase, i parami)
  {
    a = paramSQLiteDatabase;
    b = parami;
  }
  
  /* Error */
  public final void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 15	i9/h1:a	Landroid/database/sqlite/SQLiteDatabase;
    //   4: astore_1
    //   5: new 20	i9/d1
    //   8: dup
    //   9: aload_0
    //   10: iconst_1
    //   11: invokespecial 23	i9/d1:<init>	(Li9/h1;I)V
    //   14: astore_2
    //   15: aload_1
    //   16: ldc 25
    //   18: aconst_null
    //   19: invokevirtual 31	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   22: astore_1
    //   23: aload_1
    //   24: invokeinterface 37 1 0
    //   29: ifeq +13 -> 42
    //   32: aload_2
    //   33: aload_1
    //   34: invokeinterface 43 2 0
    //   39: goto -16 -> 23
    //   42: aload_1
    //   43: invokeinterface 46 1 0
    //   48: return
    //   49: astore_2
    //   50: aload_1
    //   51: ifnull +18 -> 69
    //   54: aload_1
    //   55: invokeinterface 46 1 0
    //   60: goto +9 -> 69
    //   63: astore_1
    //   64: aload_2
    //   65: aload_1
    //   66: invokevirtual 52	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   69: aload_2
    //   70: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	71	0	this	h1
    //   4	51	1	localObject1	Object
    //   63	3	1	localThrowable	Throwable
    //   14	19	2	locald1	d1
    //   49	21	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   23	39	49	finally
    //   54	60	63	finally
  }
  
  public final void b(String[] paramArrayOfString, Runnable paramRunnable)
  {
    String str1 = g.f(f.l("["), TextUtils.join(", ", paramArrayOfString), "]");
    int i = 0;
    int m;
    for (int j = i; i < paramArrayOfString.length; j = m)
    {
      String str2 = paramArrayOfString[i];
      int k = e(str2);
      if (i == 0)
      {
        m = k;
      }
      else
      {
        m = j;
        if (k != j)
        {
          paramRunnable = f.l(g.e("Expected all of ", str1, " to either exist or not, but "));
          if (j != 0)
          {
            paramRunnable.append(paramArrayOfString[0]);
            paramRunnable.append(" exists and ");
            paramRunnable.append(str2);
            paramArrayOfString = " does not";
          }
          else
          {
            paramRunnable.append(paramArrayOfString[0]);
            paramRunnable.append(" does not exist and ");
            paramRunnable.append(str2);
            paramArrayOfString = " does";
          }
          paramRunnable.append(paramArrayOfString);
          throw new IllegalStateException(paramRunnable.toString());
        }
      }
      i++;
    }
    if (j == 0) {
      paramRunnable.run();
    } else {
      m0.y(1, "SQLiteSchema", g.e("Skipping migration because all of ", str1, " already exist"), new Object[0]);
    }
  }
  
  /* Error */
  public final void c(int paramInt)
  {
    // Byte code:
    //   0: invokestatic 134	java/lang/System:currentTimeMillis	()J
    //   3: lstore_2
    //   4: iload_1
    //   5: iconst_1
    //   6: if_icmpge +101 -> 107
    //   9: new 136	i9/c1
    //   12: dup
    //   13: aload_0
    //   14: iconst_3
    //   15: invokespecial 137	i9/c1:<init>	(Li9/h1;I)V
    //   18: astore 4
    //   20: aload_0
    //   21: iconst_3
    //   22: anewarray 139	java/lang/String
    //   25: dup
    //   26: iconst_0
    //   27: ldc -115
    //   29: aastore
    //   30: dup
    //   31: iconst_1
    //   32: ldc -113
    //   34: aastore
    //   35: dup
    //   36: iconst_2
    //   37: ldc -111
    //   39: aastore
    //   40: aload 4
    //   42: invokevirtual 147	i9/h1:b	([Ljava/lang/String;Ljava/lang/Runnable;)V
    //   45: new 136	i9/c1
    //   48: dup
    //   49: aload_0
    //   50: iconst_0
    //   51: invokespecial 137	i9/c1:<init>	(Li9/h1;I)V
    //   54: astore 4
    //   56: aload_0
    //   57: iconst_3
    //   58: anewarray 139	java/lang/String
    //   61: dup
    //   62: iconst_0
    //   63: ldc -107
    //   65: aastore
    //   66: dup
    //   67: iconst_1
    //   68: ldc -105
    //   70: aastore
    //   71: dup
    //   72: iconst_2
    //   73: ldc -103
    //   75: aastore
    //   76: aload 4
    //   78: invokevirtual 147	i9/h1:b	([Ljava/lang/String;Ljava/lang/Runnable;)V
    //   81: new 155	i9/f1
    //   84: dup
    //   85: aload_0
    //   86: iconst_0
    //   87: invokespecial 156	i9/f1:<init>	(Li9/h1;I)V
    //   90: astore 4
    //   92: aload_0
    //   93: iconst_1
    //   94: anewarray 139	java/lang/String
    //   97: dup
    //   98: iconst_0
    //   99: ldc -98
    //   101: aastore
    //   102: aload 4
    //   104: invokevirtual 147	i9/h1:b	([Ljava/lang/String;Ljava/lang/Runnable;)V
    //   107: iload_1
    //   108: iconst_3
    //   109: if_icmpge +97 -> 206
    //   112: iload_1
    //   113: ifeq +93 -> 206
    //   116: aload_0
    //   117: ldc -107
    //   119: invokevirtual 80	i9/h1:e	(Ljava/lang/String;)Z
    //   122: ifeq +12 -> 134
    //   125: aload_0
    //   126: getfield 15	i9/h1:a	Landroid/database/sqlite/SQLiteDatabase;
    //   129: ldc -96
    //   131: invokevirtual 163	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   134: aload_0
    //   135: ldc -105
    //   137: invokevirtual 80	i9/h1:e	(Ljava/lang/String;)Z
    //   140: ifeq +12 -> 152
    //   143: aload_0
    //   144: getfield 15	i9/h1:a	Landroid/database/sqlite/SQLiteDatabase;
    //   147: ldc -91
    //   149: invokevirtual 163	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   152: aload_0
    //   153: ldc -103
    //   155: invokevirtual 80	i9/h1:e	(Ljava/lang/String;)Z
    //   158: ifeq +12 -> 170
    //   161: aload_0
    //   162: getfield 15	i9/h1:a	Landroid/database/sqlite/SQLiteDatabase;
    //   165: ldc -89
    //   167: invokevirtual 163	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   170: new 136	i9/c1
    //   173: dup
    //   174: aload_0
    //   175: iconst_0
    //   176: invokespecial 137	i9/c1:<init>	(Li9/h1;I)V
    //   179: astore 4
    //   181: aload_0
    //   182: iconst_3
    //   183: anewarray 139	java/lang/String
    //   186: dup
    //   187: iconst_0
    //   188: ldc -107
    //   190: aastore
    //   191: dup
    //   192: iconst_1
    //   193: ldc -105
    //   195: aastore
    //   196: dup
    //   197: iconst_2
    //   198: ldc -103
    //   200: aastore
    //   201: aload 4
    //   203: invokevirtual 147	i9/h1:b	([Ljava/lang/String;Ljava/lang/Runnable;)V
    //   206: iload_1
    //   207: iconst_4
    //   208: if_icmpge +130 -> 338
    //   211: aload_0
    //   212: getfield 15	i9/h1:a	Landroid/database/sqlite/SQLiteDatabase;
    //   215: ldc -105
    //   217: invokestatic 173	android/database/DatabaseUtils:queryNumEntries	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)J
    //   220: lconst_1
    //   221: lcmp
    //   222: ifne +9 -> 231
    //   225: iconst_1
    //   226: istore 5
    //   228: goto +6 -> 234
    //   231: iconst_0
    //   232: istore 5
    //   234: iload 5
    //   236: ifne +36 -> 272
    //   239: aload_0
    //   240: getfield 15	i9/h1:a	Landroid/database/sqlite/SQLiteDatabase;
    //   243: ldc -81
    //   245: iconst_4
    //   246: anewarray 139	java/lang/String
    //   249: dup
    //   250: iconst_0
    //   251: ldc -79
    //   253: aastore
    //   254: dup
    //   255: iconst_1
    //   256: ldc -79
    //   258: aastore
    //   259: dup
    //   260: iconst_2
    //   261: ldc -79
    //   263: aastore
    //   264: dup
    //   265: iconst_3
    //   266: ldc -79
    //   268: aastore
    //   269: invokevirtual 180	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   272: aload_0
    //   273: ldc -105
    //   275: ldc -74
    //   277: invokevirtual 186	i9/h1:d	(Ljava/lang/String;Ljava/lang/String;)Z
    //   280: ifne +12 -> 292
    //   283: aload_0
    //   284: getfield 15	i9/h1:a	Landroid/database/sqlite/SQLiteDatabase;
    //   287: ldc -68
    //   289: invokevirtual 163	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   292: aload_0
    //   293: getfield 15	i9/h1:a	Landroid/database/sqlite/SQLiteDatabase;
    //   296: ldc -107
    //   298: invokestatic 173	android/database/DatabaseUtils:queryNumEntries	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)J
    //   301: lstore 6
    //   303: new 190	android/content/ContentValues
    //   306: dup
    //   307: invokespecial 191	android/content/ContentValues:<init>	()V
    //   310: astore 4
    //   312: aload 4
    //   314: ldc -74
    //   316: lload 6
    //   318: invokestatic 197	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   321: invokevirtual 201	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   324: aload_0
    //   325: getfield 15	i9/h1:a	Landroid/database/sqlite/SQLiteDatabase;
    //   328: ldc -105
    //   330: aload 4
    //   332: aconst_null
    //   333: aconst_null
    //   334: invokevirtual 205	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   337: pop
    //   338: iload_1
    //   339: iconst_5
    //   340: if_icmpge +23 -> 363
    //   343: aload_0
    //   344: ldc -103
    //   346: ldc -49
    //   348: invokevirtual 186	i9/h1:d	(Ljava/lang/String;Ljava/lang/String;)Z
    //   351: ifne +12 -> 363
    //   354: aload_0
    //   355: getfield 15	i9/h1:a	Landroid/database/sqlite/SQLiteDatabase;
    //   358: ldc -47
    //   360: invokevirtual 163	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   363: iload_1
    //   364: bipush 6
    //   366: if_icmpge +89 -> 455
    //   369: aload_0
    //   370: getfield 15	i9/h1:a	Landroid/database/sqlite/SQLiteDatabase;
    //   373: astore 8
    //   375: new 211	i9/m
    //   378: dup
    //   379: aload_0
    //   380: iconst_3
    //   381: invokespecial 214	i9/m:<init>	(Ljava/lang/Object;I)V
    //   384: astore 4
    //   386: aload 8
    //   388: ldc -40
    //   390: aconst_null
    //   391: invokevirtual 31	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   394: astore 8
    //   396: aload 8
    //   398: invokeinterface 37 1 0
    //   403: ifeq +13 -> 416
    //   406: aload 4
    //   408: aload 8
    //   410: invokevirtual 217	i9/m:accept	(Ljava/lang/Object;)V
    //   413: goto -17 -> 396
    //   416: aload 8
    //   418: invokeinterface 46 1 0
    //   423: goto +32 -> 455
    //   426: astore 4
    //   428: aload 8
    //   430: ifnull +22 -> 452
    //   433: aload 8
    //   435: invokeinterface 46 1 0
    //   440: goto +12 -> 452
    //   443: astore 8
    //   445: aload 4
    //   447: aload 8
    //   449: invokevirtual 52	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   452: aload 4
    //   454: athrow
    //   455: iload_1
    //   456: bipush 7
    //   458: if_icmpge +308 -> 766
    //   461: aload_0
    //   462: getfield 15	i9/h1:a	Landroid/database/sqlite/SQLiteDatabase;
    //   465: ldc -37
    //   467: aconst_null
    //   468: invokevirtual 31	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   471: astore 8
    //   473: aload 8
    //   475: invokeinterface 222 1 0
    //   480: ifeq +26 -> 506
    //   483: aload 8
    //   485: iconst_0
    //   486: invokeinterface 226 2 0
    //   491: invokestatic 197	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   494: astore 4
    //   496: aload 8
    //   498: invokeinterface 46 1 0
    //   503: goto +13 -> 516
    //   506: aload 8
    //   508: invokeinterface 46 1 0
    //   513: aconst_null
    //   514: astore 4
    //   516: aload 4
    //   518: ifnull +9 -> 527
    //   521: iconst_1
    //   522: istore 9
    //   524: goto +6 -> 530
    //   527: iconst_0
    //   528: istore 9
    //   530: ldc -28
    //   532: iload 9
    //   534: iconst_0
    //   535: anewarray 4	java/lang/Object
    //   538: invokestatic 234	x6/b:Z	(Ljava/lang/String;Z[Ljava/lang/Object;)V
    //   541: aload 4
    //   543: invokevirtual 237	java/lang/Long:longValue	()J
    //   546: lstore 6
    //   548: aload_0
    //   549: getfield 15	i9/h1:a	Landroid/database/sqlite/SQLiteDatabase;
    //   552: ldc -17
    //   554: invokevirtual 243	android/database/sqlite/SQLiteDatabase:compileStatement	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;
    //   557: astore 10
    //   559: aload_0
    //   560: getfield 15	i9/h1:a	Landroid/database/sqlite/SQLiteDatabase;
    //   563: astore 8
    //   565: new 245	u1/b
    //   568: dup
    //   569: iconst_1
    //   570: anewarray 4	java/lang/Object
    //   573: dup
    //   574: iconst_0
    //   575: bipush 100
    //   577: invokestatic 250	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   580: aastore
    //   581: iconst_1
    //   582: invokespecial 251	u1/b:<init>	(Ljava/lang/Object;I)V
    //   585: astore 11
    //   587: iconst_1
    //   588: newarray <illegal type>
    //   590: astore 12
    //   592: aload 12
    //   594: iconst_0
    //   595: iconst_0
    //   596: bastore
    //   597: aload 8
    //   599: aload 11
    //   601: ldc -3
    //   603: aconst_null
    //   604: aconst_null
    //   605: invokevirtual 257	android/database/sqlite/SQLiteDatabase:rawQueryWithFactory	(Landroid/database/sqlite/SQLiteDatabase$CursorFactory;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   608: astore 4
    //   610: aload 4
    //   612: invokeinterface 37 1 0
    //   617: ifeq +71 -> 688
    //   620: aload 12
    //   622: iconst_0
    //   623: iconst_1
    //   624: bastore
    //   625: aload 10
    //   627: invokevirtual 262	android/database/sqlite/SQLiteProgram:clearBindings	()V
    //   630: aload 10
    //   632: iconst_1
    //   633: aload 4
    //   635: iconst_0
    //   636: invokeinterface 266 2 0
    //   641: invokevirtual 270	android/database/sqlite/SQLiteProgram:bindString	(ILjava/lang/String;)V
    //   644: aload 10
    //   646: iconst_2
    //   647: lload 6
    //   649: invokevirtual 274	android/database/sqlite/SQLiteProgram:bindLong	(IJ)V
    //   652: aload 10
    //   654: invokevirtual 279	android/database/sqlite/SQLiteStatement:executeInsert	()J
    //   657: ldc2_w 280
    //   660: lcmp
    //   661: ifeq +9 -> 670
    //   664: iconst_1
    //   665: istore 9
    //   667: goto +6 -> 673
    //   670: iconst_0
    //   671: istore 9
    //   673: ldc_w 283
    //   676: iload 9
    //   678: iconst_0
    //   679: anewarray 4	java/lang/Object
    //   682: invokestatic 234	x6/b:Z	(Ljava/lang/String;Z[Ljava/lang/Object;)V
    //   685: goto -75 -> 610
    //   688: aload 4
    //   690: invokeinterface 46 1 0
    //   695: aload 12
    //   697: iconst_0
    //   698: baload
    //   699: ifne +6 -> 705
    //   702: goto +64 -> 766
    //   705: goto -113 -> 592
    //   708: astore 8
    //   710: aload 4
    //   712: ifnull +22 -> 734
    //   715: aload 4
    //   717: invokeinterface 46 1 0
    //   722: goto +12 -> 734
    //   725: astore 4
    //   727: aload 8
    //   729: aload 4
    //   731: invokevirtual 52	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   734: aload 8
    //   736: athrow
    //   737: astore 4
    //   739: aload 8
    //   741: ifnull +22 -> 763
    //   744: aload 8
    //   746: invokeinterface 46 1 0
    //   751: goto +12 -> 763
    //   754: astore 8
    //   756: aload 4
    //   758: aload 8
    //   760: invokevirtual 52	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   763: aload 4
    //   765: athrow
    //   766: iload_1
    //   767: bipush 8
    //   769: if_icmpge +229 -> 998
    //   772: new 155	i9/f1
    //   775: dup
    //   776: aload_0
    //   777: iconst_1
    //   778: invokespecial 156	i9/f1:<init>	(Li9/h1;I)V
    //   781: astore 4
    //   783: aload_0
    //   784: iconst_1
    //   785: anewarray 139	java/lang/String
    //   788: dup
    //   789: iconst_0
    //   790: ldc_w 285
    //   793: aastore
    //   794: aload 4
    //   796: invokevirtual 147	i9/h1:b	([Ljava/lang/String;Ljava/lang/Runnable;)V
    //   799: new 287	i9/g1
    //   802: dup
    //   803: iconst_0
    //   804: new 289	i9/s$a
    //   807: dup
    //   808: invokespecial 290	i9/s$a:<init>	()V
    //   811: aload_0
    //   812: getfield 15	i9/h1:a	Landroid/database/sqlite/SQLiteDatabase;
    //   815: ldc_w 292
    //   818: invokevirtual 243	android/database/sqlite/SQLiteDatabase:compileStatement	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;
    //   821: invokespecial 295	i9/g1:<init>	(ILjava/lang/Object;Ljava/lang/Object;)V
    //   824: astore 4
    //   826: aload_0
    //   827: getfield 15	i9/h1:a	Landroid/database/sqlite/SQLiteDatabase;
    //   830: ldc_w 297
    //   833: aconst_null
    //   834: invokevirtual 31	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   837: astore 8
    //   839: aload 8
    //   841: invokeinterface 37 1 0
    //   846: ifeq +28 -> 874
    //   849: aload 4
    //   851: aload 8
    //   853: iconst_0
    //   854: invokeinterface 266 2 0
    //   859: invokestatic 301	p2/m0:x	(Ljava/lang/String;)Lj9/o;
    //   862: invokevirtual 307	j9/e:s	()Lj9/e;
    //   865: checkcast 309	j9/o
    //   868: invokevirtual 310	i9/g1:accept	(Ljava/lang/Object;)V
    //   871: goto -32 -> 839
    //   874: aload 8
    //   876: invokeinterface 46 1 0
    //   881: aload_0
    //   882: getfield 15	i9/h1:a	Landroid/database/sqlite/SQLiteDatabase;
    //   885: astore 8
    //   887: new 312	i9/t
    //   890: dup
    //   891: aload 4
    //   893: iconst_2
    //   894: invokespecial 313	i9/t:<init>	(Ljava/lang/Object;I)V
    //   897: astore 10
    //   899: aload 8
    //   901: ldc_w 315
    //   904: aconst_null
    //   905: invokevirtual 31	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   908: astore 4
    //   910: aload 4
    //   912: invokeinterface 37 1 0
    //   917: ifeq +13 -> 930
    //   920: aload 10
    //   922: aload 4
    //   924: invokevirtual 316	i9/t:accept	(Ljava/lang/Object;)V
    //   927: goto -17 -> 910
    //   930: aload 4
    //   932: invokeinterface 46 1 0
    //   937: goto +61 -> 998
    //   940: astore 8
    //   942: aload 4
    //   944: ifnull +22 -> 966
    //   947: aload 4
    //   949: invokeinterface 46 1 0
    //   954: goto +12 -> 966
    //   957: astore 4
    //   959: aload 8
    //   961: aload 4
    //   963: invokevirtual 52	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   966: aload 8
    //   968: athrow
    //   969: astore 4
    //   971: aload 8
    //   973: ifnull +22 -> 995
    //   976: aload 8
    //   978: invokeinterface 46 1 0
    //   983: goto +12 -> 995
    //   986: astore 8
    //   988: aload 4
    //   990: aload 8
    //   992: invokevirtual 52	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   995: aload 4
    //   997: athrow
    //   998: iload_1
    //   999: bipush 9
    //   1001: if_icmpge +104 -> 1105
    //   1004: aload_0
    //   1005: ldc -98
    //   1007: ldc_w 318
    //   1010: invokevirtual 186	i9/h1:d	(Ljava/lang/String;Ljava/lang/String;)Z
    //   1013: istore 13
    //   1015: aload_0
    //   1016: ldc -98
    //   1018: ldc_w 320
    //   1021: invokevirtual 186	i9/h1:d	(Ljava/lang/String;Ljava/lang/String;)Z
    //   1024: istore 14
    //   1026: iload 13
    //   1028: iload 14
    //   1030: if_icmpne +9 -> 1039
    //   1033: iconst_1
    //   1034: istore 9
    //   1036: goto +6 -> 1042
    //   1039: iconst_0
    //   1040: istore 9
    //   1042: ldc_w 322
    //   1045: iload 9
    //   1047: iconst_0
    //   1048: anewarray 4	java/lang/Object
    //   1051: invokestatic 234	x6/b:Z	(Ljava/lang/String;Z[Ljava/lang/Object;)V
    //   1054: iload 13
    //   1056: ifeq +14 -> 1070
    //   1059: iload 14
    //   1061: ifeq +9 -> 1070
    //   1064: iconst_1
    //   1065: istore 5
    //   1067: goto +6 -> 1073
    //   1070: iconst_0
    //   1071: istore 5
    //   1073: iload 5
    //   1075: ifne +26 -> 1101
    //   1078: aload_0
    //   1079: getfield 15	i9/h1:a	Landroid/database/sqlite/SQLiteDatabase;
    //   1082: ldc_w 324
    //   1085: invokevirtual 163	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   1088: aload_0
    //   1089: getfield 15	i9/h1:a	Landroid/database/sqlite/SQLiteDatabase;
    //   1092: ldc_w 326
    //   1095: invokevirtual 163	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   1098: goto +7 -> 1105
    //   1101: aload_0
    //   1102: invokevirtual 328	i9/h1:a	()V
    //   1105: iload_1
    //   1106: bipush 9
    //   1108: if_icmpne +7 -> 1115
    //   1111: aload_0
    //   1112: invokevirtual 328	i9/h1:a	()V
    //   1115: iload_1
    //   1116: bipush 11
    //   1118: if_icmpge +89 -> 1207
    //   1121: aload_0
    //   1122: getfield 15	i9/h1:a	Landroid/database/sqlite/SQLiteDatabase;
    //   1125: astore 8
    //   1127: new 20	i9/d1
    //   1130: dup
    //   1131: aload_0
    //   1132: iconst_0
    //   1133: invokespecial 23	i9/d1:<init>	(Li9/h1;I)V
    //   1136: astore 4
    //   1138: aload 8
    //   1140: ldc 25
    //   1142: aconst_null
    //   1143: invokevirtual 31	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   1146: astore 8
    //   1148: aload 8
    //   1150: invokeinterface 37 1 0
    //   1155: ifeq +13 -> 1168
    //   1158: aload 4
    //   1160: aload 8
    //   1162: invokevirtual 329	i9/d1:accept	(Ljava/lang/Object;)V
    //   1165: goto -17 -> 1148
    //   1168: aload 8
    //   1170: invokeinterface 46 1 0
    //   1175: goto +32 -> 1207
    //   1178: astore 4
    //   1180: aload 8
    //   1182: ifnull +22 -> 1204
    //   1185: aload 8
    //   1187: invokeinterface 46 1 0
    //   1192: goto +12 -> 1204
    //   1195: astore 8
    //   1197: aload 4
    //   1199: aload 8
    //   1201: invokevirtual 52	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   1204: aload 4
    //   1206: athrow
    //   1207: iload_1
    //   1208: bipush 12
    //   1210: if_icmpge +36 -> 1246
    //   1213: new 136	i9/c1
    //   1216: dup
    //   1217: aload_0
    //   1218: iconst_2
    //   1219: invokespecial 137	i9/c1:<init>	(Li9/h1;I)V
    //   1222: astore 4
    //   1224: aload_0
    //   1225: iconst_2
    //   1226: anewarray 139	java/lang/String
    //   1229: dup
    //   1230: iconst_0
    //   1231: ldc_w 331
    //   1234: aastore
    //   1235: dup
    //   1236: iconst_1
    //   1237: ldc_w 333
    //   1240: aastore
    //   1241: aload 4
    //   1243: invokevirtual 147	i9/h1:b	([Ljava/lang/String;Ljava/lang/Runnable;)V
    //   1246: iload_1
    //   1247: bipush 13
    //   1249: if_icmpge +172 -> 1421
    //   1252: aload_0
    //   1253: ldc -98
    //   1255: ldc_w 335
    //   1258: invokevirtual 186	i9/h1:d	(Ljava/lang/String;Ljava/lang/String;)Z
    //   1261: ifne +13 -> 1274
    //   1264: aload_0
    //   1265: getfield 15	i9/h1:a	Landroid/database/sqlite/SQLiteDatabase;
    //   1268: ldc_w 337
    //   1271: invokevirtual 163	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   1274: aload_0
    //   1275: getfield 15	i9/h1:a	Landroid/database/sqlite/SQLiteDatabase;
    //   1278: astore 15
    //   1280: new 245	u1/b
    //   1283: dup
    //   1284: iconst_1
    //   1285: anewarray 4	java/lang/Object
    //   1288: dup
    //   1289: iconst_0
    //   1290: bipush 100
    //   1292: invokestatic 250	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1295: aastore
    //   1296: iconst_1
    //   1297: invokespecial 251	u1/b:<init>	(Ljava/lang/Object;I)V
    //   1300: astore 12
    //   1302: aload_0
    //   1303: getfield 15	i9/h1:a	Landroid/database/sqlite/SQLiteDatabase;
    //   1306: ldc_w 339
    //   1309: invokevirtual 243	android/database/sqlite/SQLiteDatabase:compileStatement	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;
    //   1312: astore 10
    //   1314: iconst_1
    //   1315: newarray <illegal type>
    //   1317: astore 11
    //   1319: aload 11
    //   1321: iconst_0
    //   1322: iconst_0
    //   1323: bastore
    //   1324: new 341	i9/r0
    //   1327: dup
    //   1328: iconst_1
    //   1329: aload 11
    //   1331: aload 10
    //   1333: invokespecial 342	i9/r0:<init>	(ILjava/lang/Object;Ljava/lang/Object;)V
    //   1336: astore 8
    //   1338: aload 15
    //   1340: aload 12
    //   1342: ldc_w 344
    //   1345: aconst_null
    //   1346: aconst_null
    //   1347: invokevirtual 257	android/database/sqlite/SQLiteDatabase:rawQueryWithFactory	(Landroid/database/sqlite/SQLiteDatabase$CursorFactory;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   1350: astore 4
    //   1352: aload 4
    //   1354: invokeinterface 37 1 0
    //   1359: ifeq +13 -> 1372
    //   1362: aload 8
    //   1364: aload 4
    //   1366: invokevirtual 345	i9/r0:accept	(Ljava/lang/Object;)V
    //   1369: goto -17 -> 1352
    //   1372: aload 4
    //   1374: invokeinterface 46 1 0
    //   1379: aload 11
    //   1381: iconst_0
    //   1382: baload
    //   1383: ifne +6 -> 1389
    //   1386: goto +35 -> 1421
    //   1389: goto -70 -> 1319
    //   1392: astore 8
    //   1394: aload 4
    //   1396: ifnull +22 -> 1418
    //   1399: aload 4
    //   1401: invokeinterface 46 1 0
    //   1406: goto +12 -> 1418
    //   1409: astore 4
    //   1411: aload 8
    //   1413: aload 4
    //   1415: invokevirtual 52	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   1418: aload 8
    //   1420: athrow
    //   1421: iload_1
    //   1422: bipush 14
    //   1424: if_icmpge +83 -> 1507
    //   1427: new 347	i9/e1
    //   1430: dup
    //   1431: aload_0
    //   1432: iconst_0
    //   1433: invokespecial 348	i9/e1:<init>	(Li9/h1;I)V
    //   1436: astore 4
    //   1438: aload_0
    //   1439: iconst_1
    //   1440: anewarray 139	java/lang/String
    //   1443: dup
    //   1444: iconst_0
    //   1445: ldc_w 350
    //   1448: aastore
    //   1449: aload 4
    //   1451: invokevirtual 147	i9/h1:b	([Ljava/lang/String;Ljava/lang/Runnable;)V
    //   1454: new 352	b/k
    //   1457: dup
    //   1458: aload_0
    //   1459: bipush 15
    //   1461: invokespecial 353	b/k:<init>	(Ljava/lang/Object;I)V
    //   1464: astore 4
    //   1466: aload_0
    //   1467: iconst_1
    //   1468: anewarray 139	java/lang/String
    //   1471: dup
    //   1472: iconst_0
    //   1473: ldc_w 355
    //   1476: aastore
    //   1477: aload 4
    //   1479: invokevirtual 147	i9/h1:b	([Ljava/lang/String;Ljava/lang/Runnable;)V
    //   1482: getstatic 360	e9/a:a	I
    //   1485: istore 5
    //   1487: aload_0
    //   1488: getfield 15	i9/h1:a	Landroid/database/sqlite/SQLiteDatabase;
    //   1491: ldc_w 362
    //   1494: iconst_1
    //   1495: anewarray 139	java/lang/String
    //   1498: dup
    //   1499: iconst_0
    //   1500: ldc_w 364
    //   1503: aastore
    //   1504: invokevirtual 180	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1507: iload_1
    //   1508: bipush 15
    //   1510: if_icmpge +13 -> 1523
    //   1513: aload_0
    //   1514: getfield 15	i9/h1:a	Landroid/database/sqlite/SQLiteDatabase;
    //   1517: ldc_w 366
    //   1520: invokevirtual 163	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   1523: iload_1
    //   1524: bipush 16
    //   1526: if_icmpge +45 -> 1571
    //   1529: new 136	i9/c1
    //   1532: dup
    //   1533: aload_0
    //   1534: iconst_1
    //   1535: invokespecial 137	i9/c1:<init>	(Li9/h1;I)V
    //   1538: astore 4
    //   1540: aload_0
    //   1541: iconst_3
    //   1542: anewarray 139	java/lang/String
    //   1545: dup
    //   1546: iconst_0
    //   1547: ldc_w 368
    //   1550: aastore
    //   1551: dup
    //   1552: iconst_1
    //   1553: ldc_w 370
    //   1556: aastore
    //   1557: dup
    //   1558: iconst_2
    //   1559: ldc_w 372
    //   1562: aastore
    //   1563: aload 4
    //   1565: invokevirtual 147	i9/h1:b	([Ljava/lang/String;Ljava/lang/Runnable;)V
    //   1568: goto +3 -> 1571
    //   1571: iload_1
    //   1572: bipush 17
    //   1574: if_icmpge +30 -> 1604
    //   1577: new 347	i9/e1
    //   1580: dup
    //   1581: aload_0
    //   1582: iconst_1
    //   1583: invokespecial 348	i9/e1:<init>	(Li9/h1;I)V
    //   1586: astore 4
    //   1588: aload_0
    //   1589: iconst_1
    //   1590: anewarray 139	java/lang/String
    //   1593: dup
    //   1594: iconst_0
    //   1595: ldc_w 374
    //   1598: aastore
    //   1599: aload 4
    //   1601: invokevirtual 147	i9/h1:b	([Ljava/lang/String;Ljava/lang/Runnable;)V
    //   1604: iconst_1
    //   1605: ldc 116
    //   1607: ldc_w 376
    //   1610: iconst_3
    //   1611: anewarray 4	java/lang/Object
    //   1614: dup
    //   1615: iconst_0
    //   1616: iload_1
    //   1617: invokestatic 250	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1620: aastore
    //   1621: dup
    //   1622: iconst_1
    //   1623: bipush 17
    //   1625: invokestatic 250	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1628: aastore
    //   1629: dup
    //   1630: iconst_2
    //   1631: invokestatic 134	java/lang/System:currentTimeMillis	()J
    //   1634: lload_2
    //   1635: lsub
    //   1636: invokestatic 197	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1639: aastore
    //   1640: invokestatic 126	p2/m0:y	(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1643: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1644	0	this	h1
    //   0	1644	1	paramInt	int
    //   3	1632	2	l1	long
    //   18	389	4	localObject1	Object
    //   426	27	4	localObject2	Object
    //   494	222	4	localObject3	Object
    //   725	5	4	localThrowable1	Throwable
    //   737	27	4	localObject4	Object
    //   781	167	4	localObject5	Object
    //   957	5	4	localThrowable2	Throwable
    //   969	27	4	localObject6	Object
    //   1136	23	4	locald1	d1
    //   1178	27	4	localObject7	Object
    //   1222	178	4	localObject8	Object
    //   1409	5	4	localThrowable3	Throwable
    //   1436	164	4	localObject9	Object
    //   226	1260	5	i	int
    //   301	347	6	l2	long
    //   373	61	8	localObject10	Object
    //   443	5	8	localThrowable4	Throwable
    //   471	127	8	localObject11	Object
    //   708	37	8	localObject12	Object
    //   754	5	8	localThrowable5	Throwable
    //   837	63	8	localObject13	Object
    //   940	37	8	localObject14	Object
    //   986	5	8	localThrowable6	Throwable
    //   1125	61	8	localObject15	Object
    //   1195	5	8	localThrowable7	Throwable
    //   1336	27	8	localr0	r0
    //   1392	27	8	localObject16	Object
    //   522	524	9	bool1	boolean
    //   557	775	10	localObject17	Object
    //   585	795	11	localObject18	Object
    //   590	751	12	localObject19	Object
    //   1013	42	13	bool2	boolean
    //   1024	36	14	bool3	boolean
    //   1278	61	15	localSQLiteDatabase	SQLiteDatabase
    // Exception table:
    //   from	to	target	type
    //   396	413	426	finally
    //   433	440	443	finally
    //   610	620	708	finally
    //   625	664	708	finally
    //   673	685	708	finally
    //   715	722	725	finally
    //   473	496	737	finally
    //   744	751	754	finally
    //   910	927	940	finally
    //   947	954	957	finally
    //   839	871	969	finally
    //   976	983	986	finally
    //   1148	1165	1178	finally
    //   1185	1192	1195	finally
    //   1352	1369	1392	finally
    //   1399	1406	1409	finally
  }
  
  public final boolean d(String paramString1, String paramString2)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = null;
    Object localObject2 = localObject1;
    try
    {
      SQLiteDatabase localSQLiteDatabase = a;
      localObject2 = localObject1;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localObject2 = localObject1;
      localStringBuilder.<init>();
      localObject2 = localObject1;
      localStringBuilder.append("PRAGMA table_info(");
      localObject2 = localObject1;
      localStringBuilder.append(paramString1);
      localObject2 = localObject1;
      localStringBuilder.append(")");
      localObject2 = localObject1;
      paramString1 = localSQLiteDatabase.rawQuery(localStringBuilder.toString(), null);
      localObject2 = paramString1;
      int i = paramString1.getColumnIndex("name");
      for (;;)
      {
        localObject2 = paramString1;
        if (!paramString1.moveToNext()) {
          break;
        }
        localObject2 = paramString1;
        localArrayList.add(paramString1.getString(i));
      }
      paramString1.close();
      boolean bool;
      if (localArrayList.indexOf(paramString2) != -1) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    finally
    {
      if (localObject2 != null) {
        ((Cursor)localObject2).close();
      }
    }
  }
  
  /* Error */
  public final boolean e(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 15	i9/h1:a	Landroid/database/sqlite/SQLiteDatabase;
    //   4: new 245	u1/b
    //   7: dup
    //   8: iconst_1
    //   9: anewarray 4	java/lang/Object
    //   12: dup
    //   13: iconst_0
    //   14: aload_1
    //   15: aastore
    //   16: iconst_1
    //   17: invokespecial 251	u1/b:<init>	(Ljava/lang/Object;I)V
    //   20: ldc_w 400
    //   23: aconst_null
    //   24: aconst_null
    //   25: invokevirtual 257	android/database/sqlite/SQLiteDatabase:rawQueryWithFactory	(Landroid/database/sqlite/SQLiteDatabase$CursorFactory;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   28: astore_2
    //   29: aload_2
    //   30: invokeinterface 222 1 0
    //   35: istore_3
    //   36: aload_2
    //   37: invokeinterface 46 1 0
    //   42: iload_3
    //   43: iconst_1
    //   44: ixor
    //   45: iconst_1
    //   46: ixor
    //   47: ireturn
    //   48: astore_1
    //   49: aload_2
    //   50: ifnull +18 -> 68
    //   53: aload_2
    //   54: invokeinterface 46 1 0
    //   59: goto +9 -> 68
    //   62: astore_2
    //   63: aload_1
    //   64: aload_2
    //   65: invokevirtual 52	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   68: aload_1
    //   69: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	70	0	this	h1
    //   0	70	1	paramString	String
    //   28	26	2	localCursor	Cursor
    //   62	3	2	localThrowable	Throwable
    //   35	10	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   29	36	48	finally
    //   53	59	62	finally
  }
}

/* Location:
 * Qualified Name:     i9.h1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */