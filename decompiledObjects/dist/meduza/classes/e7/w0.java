package e7;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import d2.q;

public final class w0
  extends j0
{
  public final v0 d = new v0(this, zza());
  public boolean e;
  
  public w0(j2 paramj2)
  {
    super(paramj2);
  }
  
  public static long v(SQLiteDatabase paramSQLiteDatabase)
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
      paramSQLiteDatabase.close();
      return -1L;
    }
    finally
    {
      if (localSQLiteDatabase != null) {
        localSQLiteDatabase.close();
      }
    }
  }
  
  public final boolean s()
  {
    return false;
  }
  
  /* Error */
  public final boolean w(byte[] paramArrayOfByte, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 78	e7/o0:l	()V
    //   4: aload_0
    //   5: getfield 80	e7/w0:e	Z
    //   8: ifeq +5 -> 13
    //   11: iconst_0
    //   12: ireturn
    //   13: new 82	android/content/ContentValues
    //   16: dup
    //   17: invokespecial 84	android/content/ContentValues:<init>	()V
    //   20: astore_3
    //   21: aload_3
    //   22: ldc 86
    //   24: iload_2
    //   25: invokestatic 92	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   28: invokevirtual 96	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   31: aload_3
    //   32: ldc 98
    //   34: aload_1
    //   35: invokevirtual 101	android/content/ContentValues:put	(Ljava/lang/String;[B)V
    //   38: iconst_0
    //   39: istore 4
    //   41: iconst_5
    //   42: istore 5
    //   44: iload 4
    //   46: iconst_5
    //   47: if_icmpge +565 -> 612
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
    //   65: aconst_null
    //   66: astore 11
    //   68: aload_0
    //   69: invokevirtual 105	e7/w0:z	()Landroid/database/sqlite/SQLiteDatabase;
    //   72: astore_1
    //   73: aload_1
    //   74: ifnonnull +25 -> 99
    //   77: aload 11
    //   79: astore 10
    //   81: aload_1
    //   82: astore 7
    //   84: aload_0
    //   85: iconst_1
    //   86: putfield 80	e7/w0:e	Z
    //   89: aload_1
    //   90: ifnull +7 -> 97
    //   93: aload_1
    //   94: invokevirtual 108	android/database/sqlite/SQLiteClosable:close	()V
    //   97: iconst_0
    //   98: ireturn
    //   99: aload 11
    //   101: astore 10
    //   103: aload_1
    //   104: astore 7
    //   106: aload_1
    //   107: invokevirtual 111	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   110: lconst_0
    //   111: lstore 12
    //   113: aload 11
    //   115: astore 10
    //   117: aload_1
    //   118: astore 7
    //   120: aload_1
    //   121: ldc 113
    //   123: aconst_null
    //   124: invokevirtual 117	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   127: astore 11
    //   129: lload 12
    //   131: lstore 14
    //   133: aload 11
    //   135: ifnull +45 -> 180
    //   138: lload 12
    //   140: lstore 14
    //   142: aload 11
    //   144: invokeinterface 54 1 0
    //   149: ifeq +31 -> 180
    //   152: aload 11
    //   154: iconst_0
    //   155: invokeinterface 58 2 0
    //   160: lstore 14
    //   162: goto +18 -> 180
    //   165: astore 7
    //   167: goto +140 -> 307
    //   170: astore 7
    //   172: goto +146 -> 318
    //   175: astore 7
    //   177: goto +153 -> 330
    //   180: lload 14
    //   182: ldc2_w 118
    //   185: lcmp
    //   186: iflt +86 -> 272
    //   189: aload_0
    //   190: invokevirtual 123	d2/q:zzj	()Le7/a1;
    //   193: getfield 129	e7/a1:o	Le7/b1;
    //   196: ldc -125
    //   198: invokevirtual 137	e7/b1:b	(Ljava/lang/String;)V
    //   201: ldc2_w 118
    //   204: lload 14
    //   206: lsub
    //   207: lconst_1
    //   208: ladd
    //   209: lstore 12
    //   211: aload_1
    //   212: ldc 30
    //   214: ldc -117
    //   216: iconst_1
    //   217: anewarray 32	java/lang/String
    //   220: dup
    //   221: iconst_0
    //   222: lload 12
    //   224: invokestatic 145	java/lang/Long:toString	(J)Ljava/lang/String;
    //   227: aastore
    //   228: invokevirtual 149	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   231: i2l
    //   232: lstore 14
    //   234: lload 14
    //   236: lload 12
    //   238: lcmp
    //   239: ifeq +33 -> 272
    //   242: aload_0
    //   243: invokevirtual 123	d2/q:zzj	()Le7/a1;
    //   246: getfield 129	e7/a1:o	Le7/b1;
    //   249: lload 12
    //   251: invokestatic 152	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   254: lload 14
    //   256: invokestatic 152	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   259: lload 12
    //   261: lload 14
    //   263: lsub
    //   264: invokestatic 152	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   267: ldc -102
    //   269: invokevirtual 158	e7/b1:a	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    //   272: aload_1
    //   273: ldc 30
    //   275: aconst_null
    //   276: aload_3
    //   277: invokevirtual 162	android/database/sqlite/SQLiteDatabase:insertOrThrow	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   280: pop2
    //   281: aload_1
    //   282: invokevirtual 165	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   285: aload_1
    //   286: invokevirtual 168	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   289: aload 11
    //   291: ifnull +10 -> 301
    //   294: aload 11
    //   296: invokeinterface 62 1 0
    //   301: aload_1
    //   302: invokevirtual 108	android/database/sqlite/SQLiteClosable:close	()V
    //   305: iconst_1
    //   306: ireturn
    //   307: aload 11
    //   309: astore 10
    //   311: aload 7
    //   313: astore 11
    //   315: goto +274 -> 589
    //   318: aload 11
    //   320: astore 10
    //   322: goto +33 -> 355
    //   325: astore 7
    //   327: goto +145 -> 472
    //   330: aload 11
    //   332: astore 9
    //   334: aload 7
    //   336: astore 11
    //   338: goto +183 -> 521
    //   341: astore 11
    //   343: aload 7
    //   345: astore_1
    //   346: goto +243 -> 589
    //   349: astore 7
    //   351: aload 6
    //   353: astore 10
    //   355: aload_1
    //   356: astore 11
    //   358: aload 7
    //   360: astore 9
    //   362: aload 10
    //   364: astore_1
    //   365: aload 11
    //   367: astore 7
    //   369: goto +19 -> 388
    //   372: astore 11
    //   374: goto +147 -> 521
    //   377: astore 11
    //   379: aconst_null
    //   380: astore_1
    //   381: goto +208 -> 589
    //   384: astore 9
    //   386: aconst_null
    //   387: astore_1
    //   388: aload 7
    //   390: ifnull +16 -> 406
    //   393: aload 7
    //   395: invokevirtual 171	android/database/sqlite/SQLiteDatabase:inTransaction	()Z
    //   398: ifeq +8 -> 406
    //   401: aload 7
    //   403: invokevirtual 168	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   406: aload_0
    //   407: invokevirtual 123	d2/q:zzj	()Le7/a1;
    //   410: getfield 129	e7/a1:o	Le7/b1;
    //   413: ldc -83
    //   415: aload 9
    //   417: invokevirtual 177	e7/b1:c	(Ljava/lang/String;Ljava/lang/Object;)V
    //   420: aload_0
    //   421: iconst_1
    //   422: putfield 80	e7/w0:e	Z
    //   425: aload_1
    //   426: ifnull +9 -> 435
    //   429: aload_1
    //   430: invokeinterface 62 1 0
    //   435: iload 5
    //   437: istore_2
    //   438: aload 7
    //   440: ifnull +140 -> 580
    //   443: aload 7
    //   445: invokevirtual 108	android/database/sqlite/SQLiteClosable:close	()V
    //   448: iload 5
    //   450: istore_2
    //   451: goto +129 -> 580
    //   454: astore 11
    //   456: aload_1
    //   457: astore 10
    //   459: aload 7
    //   461: astore_1
    //   462: goto +127 -> 589
    //   465: astore_1
    //   466: aconst_null
    //   467: astore_1
    //   468: aload 8
    //   470: astore 11
    //   472: iload 5
    //   474: i2l
    //   475: lstore 14
    //   477: aload 11
    //   479: astore 10
    //   481: aload_1
    //   482: astore 7
    //   484: lload 14
    //   486: invokestatic 183	android/os/SystemClock:sleep	(J)V
    //   489: iinc 5 20
    //   492: aload 11
    //   494: ifnull +10 -> 504
    //   497: aload 11
    //   499: invokeinterface 62 1 0
    //   504: iload 5
    //   506: istore_2
    //   507: aload_1
    //   508: ifnull +72 -> 580
    //   511: iload 5
    //   513: istore_2
    //   514: goto +62 -> 576
    //   517: astore 11
    //   519: aconst_null
    //   520: astore_1
    //   521: aload 9
    //   523: astore 10
    //   525: aload_1
    //   526: astore 7
    //   528: aload_0
    //   529: invokevirtual 123	d2/q:zzj	()Le7/a1;
    //   532: getfield 129	e7/a1:o	Le7/b1;
    //   535: ldc -71
    //   537: aload 11
    //   539: invokevirtual 177	e7/b1:c	(Ljava/lang/String;Ljava/lang/Object;)V
    //   542: aload 9
    //   544: astore 10
    //   546: aload_1
    //   547: astore 7
    //   549: aload_0
    //   550: iconst_1
    //   551: putfield 80	e7/w0:e	Z
    //   554: aload 9
    //   556: ifnull +10 -> 566
    //   559: aload 9
    //   561: invokeinterface 62 1 0
    //   566: iload 5
    //   568: istore_2
    //   569: aload_1
    //   570: ifnull +10 -> 580
    //   573: iload 5
    //   575: istore_2
    //   576: aload_1
    //   577: invokevirtual 108	android/database/sqlite/SQLiteClosable:close	()V
    //   580: iinc 4 1
    //   583: iload_2
    //   584: istore 5
    //   586: goto -542 -> 44
    //   589: aload 10
    //   591: ifnull +10 -> 601
    //   594: aload 10
    //   596: invokeinterface 62 1 0
    //   601: aload_1
    //   602: ifnull +7 -> 609
    //   605: aload_1
    //   606: invokevirtual 108	android/database/sqlite/SQLiteClosable:close	()V
    //   609: aload 11
    //   611: athrow
    //   612: aload_0
    //   613: invokevirtual 123	d2/q:zzj	()Le7/a1;
    //   616: getfield 187	e7/a1:w	Le7/b1;
    //   619: ldc -67
    //   621: invokevirtual 137	e7/b1:b	(Ljava/lang/String;)V
    //   624: iconst_0
    //   625: ireturn
    //   626: astore 7
    //   628: aload 8
    //   630: astore 11
    //   632: goto -160 -> 472
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	635	0	this	w0
    //   0	635	1	paramArrayOfByte	byte[]
    //   0	635	2	paramInt	int
    //   20	257	3	localContentValues	android.content.ContentValues
    //   39	542	4	i	int
    //   42	543	5	j	int
    //   51	301	6	localObject1	Object
    //   54	65	7	arrayOfByte1	byte[]
    //   165	1	7	localObject2	Object
    //   170	1	7	localSQLiteException1	SQLiteException
    //   175	137	7	localSQLiteFullException1	android.database.sqlite.SQLiteFullException
    //   325	19	7	localSQLiteDatabaseLockedException1	android.database.sqlite.SQLiteDatabaseLockedException
    //   349	10	7	localSQLiteException2	SQLiteException
    //   367	181	7	localObject3	Object
    //   626	1	7	localSQLiteDatabaseLockedException2	android.database.sqlite.SQLiteDatabaseLockedException
    //   57	572	8	localObject4	Object
    //   60	301	9	localObject5	Object
    //   384	176	9	localSQLiteException3	SQLiteException
    //   63	532	10	localObject6	Object
    //   66	271	11	localObject7	Object
    //   341	1	11	localObject8	Object
    //   356	10	11	arrayOfByte2	byte[]
    //   372	1	11	localSQLiteFullException2	android.database.sqlite.SQLiteFullException
    //   377	1	11	localObject9	Object
    //   454	1	11	localObject10	Object
    //   470	28	11	localObject11	Object
    //   517	93	11	localSQLiteFullException3	android.database.sqlite.SQLiteFullException
    //   630	1	11	localObject12	Object
    //   111	149	12	l1	long
    //   131	354	14	l2	long
    // Exception table:
    //   from	to	target	type
    //   142	162	165	finally
    //   189	201	165	finally
    //   211	234	165	finally
    //   242	272	165	finally
    //   272	289	165	finally
    //   142	162	170	android/database/sqlite/SQLiteException
    //   189	201	170	android/database/sqlite/SQLiteException
    //   211	234	170	android/database/sqlite/SQLiteException
    //   242	272	170	android/database/sqlite/SQLiteException
    //   272	289	170	android/database/sqlite/SQLiteException
    //   142	162	175	android/database/sqlite/SQLiteFullException
    //   189	201	175	android/database/sqlite/SQLiteFullException
    //   211	234	175	android/database/sqlite/SQLiteFullException
    //   242	272	175	android/database/sqlite/SQLiteFullException
    //   272	289	175	android/database/sqlite/SQLiteFullException
    //   142	162	325	android/database/sqlite/SQLiteDatabaseLockedException
    //   189	201	325	android/database/sqlite/SQLiteDatabaseLockedException
    //   211	234	325	android/database/sqlite/SQLiteDatabaseLockedException
    //   242	272	325	android/database/sqlite/SQLiteDatabaseLockedException
    //   272	289	325	android/database/sqlite/SQLiteDatabaseLockedException
    //   84	89	341	finally
    //   106	110	341	finally
    //   120	129	341	finally
    //   484	489	341	finally
    //   528	542	341	finally
    //   549	554	341	finally
    //   84	89	349	android/database/sqlite/SQLiteException
    //   106	110	349	android/database/sqlite/SQLiteException
    //   120	129	349	android/database/sqlite/SQLiteException
    //   84	89	372	android/database/sqlite/SQLiteFullException
    //   106	110	372	android/database/sqlite/SQLiteFullException
    //   120	129	372	android/database/sqlite/SQLiteFullException
    //   68	73	377	finally
    //   68	73	384	android/database/sqlite/SQLiteException
    //   393	406	454	finally
    //   406	425	454	finally
    //   68	73	465	android/database/sqlite/SQLiteDatabaseLockedException
    //   68	73	517	android/database/sqlite/SQLiteFullException
    //   84	89	626	android/database/sqlite/SQLiteDatabaseLockedException
    //   106	110	626	android/database/sqlite/SQLiteDatabaseLockedException
    //   120	129	626	android/database/sqlite/SQLiteDatabaseLockedException
  }
  
  public final void x()
  {
    l();
    try
    {
      SQLiteDatabase localSQLiteDatabase = z();
      if (localSQLiteDatabase != null)
      {
        int i = localSQLiteDatabase.delete("messages", null, null) + 0;
        if (i > 0) {
          zzjw.c("Reset local analytics data. records", Integer.valueOf(i));
        }
      }
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      zzjo.c("Error resetting local analytics data. error", localSQLiteException);
    }
  }
  
  /* Error */
  public final boolean y()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 78	e7/o0:l	()V
    //   4: aload_0
    //   5: getfield 80	e7/w0:e	Z
    //   8: ifeq +5 -> 13
    //   11: iconst_0
    //   12: ireturn
    //   13: aload_0
    //   14: invokevirtual 20	d2/q:zza	()Landroid/content/Context;
    //   17: ldc -59
    //   19: invokevirtual 203	android/content/Context:getDatabasePath	(Ljava/lang/String;)Ljava/io/File;
    //   22: invokevirtual 208	java/io/File:exists	()Z
    //   25: ifne +5 -> 30
    //   28: iconst_0
    //   29: ireturn
    //   30: iconst_5
    //   31: istore_1
    //   32: iconst_0
    //   33: istore_2
    //   34: iload_2
    //   35: iconst_5
    //   36: if_icmpge +322 -> 358
    //   39: aconst_null
    //   40: astore_3
    //   41: aconst_null
    //   42: astore 4
    //   44: aconst_null
    //   45: astore 5
    //   47: aconst_null
    //   48: astore 6
    //   50: aload_0
    //   51: invokevirtual 105	e7/w0:z	()Landroid/database/sqlite/SQLiteDatabase;
    //   54: astore 7
    //   56: aload 7
    //   58: ifnonnull +35 -> 93
    //   61: aload 7
    //   63: astore 6
    //   65: aload 7
    //   67: astore_3
    //   68: aload 7
    //   70: astore 4
    //   72: aload 7
    //   74: astore 5
    //   76: aload_0
    //   77: iconst_1
    //   78: putfield 80	e7/w0:e	Z
    //   81: aload 7
    //   83: ifnull +8 -> 91
    //   86: aload 7
    //   88: invokevirtual 108	android/database/sqlite/SQLiteClosable:close	()V
    //   91: iconst_0
    //   92: ireturn
    //   93: aload 7
    //   95: astore 6
    //   97: aload 7
    //   99: astore_3
    //   100: aload 7
    //   102: astore 4
    //   104: aload 7
    //   106: astore 5
    //   108: aload 7
    //   110: invokevirtual 111	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   113: aload 7
    //   115: astore 6
    //   117: aload 7
    //   119: astore_3
    //   120: aload 7
    //   122: astore 4
    //   124: aload 7
    //   126: astore 5
    //   128: aload 7
    //   130: ldc 30
    //   132: ldc -46
    //   134: iconst_1
    //   135: anewarray 32	java/lang/String
    //   138: dup
    //   139: iconst_0
    //   140: iconst_3
    //   141: invokestatic 213	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   144: aastore
    //   145: invokevirtual 149	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   148: pop
    //   149: aload 7
    //   151: astore 6
    //   153: aload 7
    //   155: astore_3
    //   156: aload 7
    //   158: astore 4
    //   160: aload 7
    //   162: astore 5
    //   164: aload 7
    //   166: invokevirtual 165	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   169: aload 7
    //   171: astore 6
    //   173: aload 7
    //   175: astore_3
    //   176: aload 7
    //   178: astore 4
    //   180: aload 7
    //   182: astore 5
    //   184: aload 7
    //   186: invokevirtual 168	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   189: aload 7
    //   191: invokevirtual 108	android/database/sqlite/SQLiteClosable:close	()V
    //   194: iconst_1
    //   195: ireturn
    //   196: astore_3
    //   197: goto +149 -> 346
    //   200: astore 4
    //   202: aload_3
    //   203: ifnull +20 -> 223
    //   206: aload_3
    //   207: astore 6
    //   209: aload_3
    //   210: invokevirtual 171	android/database/sqlite/SQLiteDatabase:inTransaction	()Z
    //   213: ifeq +10 -> 223
    //   216: aload_3
    //   217: astore 6
    //   219: aload_3
    //   220: invokevirtual 168	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   223: aload_3
    //   224: astore 6
    //   226: aload_0
    //   227: invokevirtual 123	d2/q:zzj	()Le7/a1;
    //   230: getfield 129	e7/a1:o	Le7/b1;
    //   233: ldc -41
    //   235: aload 4
    //   237: invokevirtual 177	e7/b1:c	(Ljava/lang/String;Ljava/lang/Object;)V
    //   240: aload_3
    //   241: astore 6
    //   243: aload_0
    //   244: iconst_1
    //   245: putfield 80	e7/w0:e	Z
    //   248: iload_1
    //   249: istore 8
    //   251: aload_3
    //   252: ifnull +85 -> 337
    //   255: iload_1
    //   256: istore 8
    //   258: goto +75 -> 333
    //   261: astore 6
    //   263: aload 4
    //   265: astore 6
    //   267: iload_1
    //   268: i2l
    //   269: invokestatic 183	android/os/SystemClock:sleep	(J)V
    //   272: iinc 1 20
    //   275: iload_1
    //   276: istore 8
    //   278: aload 4
    //   280: ifnull +57 -> 337
    //   283: iload_1
    //   284: istore 8
    //   286: aload 4
    //   288: astore_3
    //   289: goto +44 -> 333
    //   292: astore_3
    //   293: aload 5
    //   295: astore 6
    //   297: aload_0
    //   298: invokevirtual 123	d2/q:zzj	()Le7/a1;
    //   301: getfield 129	e7/a1:o	Le7/b1;
    //   304: ldc -41
    //   306: aload_3
    //   307: invokevirtual 177	e7/b1:c	(Ljava/lang/String;Ljava/lang/Object;)V
    //   310: aload 5
    //   312: astore 6
    //   314: aload_0
    //   315: iconst_1
    //   316: putfield 80	e7/w0:e	Z
    //   319: iload_1
    //   320: istore 8
    //   322: aload 5
    //   324: ifnull +13 -> 337
    //   327: aload 5
    //   329: astore_3
    //   330: iload_1
    //   331: istore 8
    //   333: aload_3
    //   334: invokevirtual 108	android/database/sqlite/SQLiteClosable:close	()V
    //   337: iinc 2 1
    //   340: iload 8
    //   342: istore_1
    //   343: goto -309 -> 34
    //   346: aload 6
    //   348: ifnull +8 -> 356
    //   351: aload 6
    //   353: invokevirtual 108	android/database/sqlite/SQLiteClosable:close	()V
    //   356: aload_3
    //   357: athrow
    //   358: aload_0
    //   359: invokevirtual 123	d2/q:zzj	()Le7/a1;
    //   362: getfield 218	e7/a1:r	Le7/b1;
    //   365: ldc -36
    //   367: invokevirtual 137	e7/b1:b	(Ljava/lang/String;)V
    //   370: iconst_0
    //   371: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	372	0	this	w0
    //   31	312	1	i	int
    //   33	305	2	j	int
    //   40	136	3	localObject1	Object
    //   196	56	3	localObject2	Object
    //   288	1	3	localObject3	Object
    //   292	15	3	localSQLiteFullException	android.database.sqlite.SQLiteFullException
    //   329	28	3	localObject4	Object
    //   42	137	4	localObject5	Object
    //   200	87	4	localSQLiteException	SQLiteException
    //   45	283	5	localObject6	Object
    //   48	194	6	localObject7	Object
    //   261	1	6	localSQLiteDatabaseLockedException	android.database.sqlite.SQLiteDatabaseLockedException
    //   265	87	6	localObject8	Object
    //   54	136	7	localSQLiteDatabase	SQLiteDatabase
    //   249	92	8	k	int
    // Exception table:
    //   from	to	target	type
    //   50	56	196	finally
    //   76	81	196	finally
    //   108	113	196	finally
    //   128	149	196	finally
    //   164	169	196	finally
    //   184	189	196	finally
    //   209	216	196	finally
    //   219	223	196	finally
    //   226	240	196	finally
    //   243	248	196	finally
    //   267	272	196	finally
    //   297	310	196	finally
    //   314	319	196	finally
    //   50	56	200	android/database/sqlite/SQLiteException
    //   76	81	200	android/database/sqlite/SQLiteException
    //   108	113	200	android/database/sqlite/SQLiteException
    //   128	149	200	android/database/sqlite/SQLiteException
    //   164	169	200	android/database/sqlite/SQLiteException
    //   184	189	200	android/database/sqlite/SQLiteException
    //   50	56	261	android/database/sqlite/SQLiteDatabaseLockedException
    //   76	81	261	android/database/sqlite/SQLiteDatabaseLockedException
    //   108	113	261	android/database/sqlite/SQLiteDatabaseLockedException
    //   128	149	261	android/database/sqlite/SQLiteDatabaseLockedException
    //   164	169	261	android/database/sqlite/SQLiteDatabaseLockedException
    //   184	189	261	android/database/sqlite/SQLiteDatabaseLockedException
    //   50	56	292	android/database/sqlite/SQLiteFullException
    //   76	81	292	android/database/sqlite/SQLiteFullException
    //   108	113	292	android/database/sqlite/SQLiteFullException
    //   128	149	292	android/database/sqlite/SQLiteFullException
    //   164	169	292	android/database/sqlite/SQLiteFullException
    //   184	189	292	android/database/sqlite/SQLiteFullException
  }
  
  public final SQLiteDatabase z()
  {
    if (e) {
      return null;
    }
    SQLiteDatabase localSQLiteDatabase = d.getWritableDatabase();
    if (localSQLiteDatabase == null)
    {
      e = true;
      return null;
    }
    return localSQLiteDatabase;
  }
}

/* Location:
 * Qualified Name:     e7.w0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */