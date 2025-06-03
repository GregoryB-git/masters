package androidx.work.impl.model;

import androidx.room.RoomSQLiteQuery;
import java.util.List;
import java.util.concurrent.Callable;

class WorkSpecDao_Impl$11
  implements Callable<List<WorkSpec.WorkInfoPojo>>
{
  public WorkSpecDao_Impl$11(WorkSpecDao_Impl paramWorkSpecDao_Impl, RoomSQLiteQuery paramRoomSQLiteQuery) {}
  
  /* Error */
  public List<WorkSpec.WorkInfoPojo> call()
    throws java.lang.Exception
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$11:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
    //   4: invokestatic 38	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
    //   7: invokevirtual 43	androidx/room/RoomDatabase:beginTransaction	()V
    //   10: aload_0
    //   11: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$11:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
    //   14: invokestatic 38	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
    //   17: aload_0
    //   18: getfield 22	androidx/work/impl/model/WorkSpecDao_Impl$11:val$_statement	Landroidx/room/RoomSQLiteQuery;
    //   21: iconst_1
    //   22: aconst_null
    //   23: invokestatic 49	androidx/room/util/DBUtil:query	(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;
    //   26: astore_1
    //   27: aload_1
    //   28: ldc 51
    //   30: invokestatic 57	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   33: istore_2
    //   34: aload_1
    //   35: ldc 59
    //   37: invokestatic 57	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   40: istore_3
    //   41: aload_1
    //   42: ldc 61
    //   44: invokestatic 57	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   47: istore 4
    //   49: aload_1
    //   50: ldc 63
    //   52: invokestatic 57	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   55: istore 5
    //   57: new 65	androidx/collection/ArrayMap
    //   60: astore 6
    //   62: aload 6
    //   64: invokespecial 66	androidx/collection/ArrayMap:<init>	()V
    //   67: new 65	androidx/collection/ArrayMap
    //   70: astore 7
    //   72: aload 7
    //   74: invokespecial 66	androidx/collection/ArrayMap:<init>	()V
    //   77: aload_1
    //   78: invokeinterface 72 1 0
    //   83: ifeq +110 -> 193
    //   86: aload_1
    //   87: iload_2
    //   88: invokeinterface 76 2 0
    //   93: ifne +45 -> 138
    //   96: aload_1
    //   97: iload_2
    //   98: invokeinterface 80 2 0
    //   103: astore 8
    //   105: aload 6
    //   107: aload 8
    //   109: invokevirtual 86	androidx/collection/SimpleArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   112: checkcast 88	java/util/ArrayList
    //   115: ifnonnull +23 -> 138
    //   118: new 88	java/util/ArrayList
    //   121: astore 9
    //   123: aload 9
    //   125: invokespecial 89	java/util/ArrayList:<init>	()V
    //   128: aload 6
    //   130: aload 8
    //   132: aload 9
    //   134: invokevirtual 93	androidx/collection/SimpleArrayMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   137: pop
    //   138: aload_1
    //   139: iload_2
    //   140: invokeinterface 76 2 0
    //   145: ifne -68 -> 77
    //   148: aload_1
    //   149: iload_2
    //   150: invokeinterface 80 2 0
    //   155: astore 8
    //   157: aload 7
    //   159: aload 8
    //   161: invokevirtual 86	androidx/collection/SimpleArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   164: checkcast 88	java/util/ArrayList
    //   167: ifnonnull -90 -> 77
    //   170: new 88	java/util/ArrayList
    //   173: astore 9
    //   175: aload 9
    //   177: invokespecial 89	java/util/ArrayList:<init>	()V
    //   180: aload 7
    //   182: aload 8
    //   184: aload 9
    //   186: invokevirtual 93	androidx/collection/SimpleArrayMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   189: pop
    //   190: goto -113 -> 77
    //   193: aload_1
    //   194: iconst_m1
    //   195: invokeinterface 96 2 0
    //   200: pop
    //   201: aload_0
    //   202: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$11:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
    //   205: aload 6
    //   207: invokestatic 100	androidx/work/impl/model/WorkSpecDao_Impl:access$100	(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/collection/ArrayMap;)V
    //   210: aload_0
    //   211: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$11:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
    //   214: aload 7
    //   216: invokestatic 103	androidx/work/impl/model/WorkSpecDao_Impl:access$200	(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/collection/ArrayMap;)V
    //   219: new 88	java/util/ArrayList
    //   222: astore 10
    //   224: aload 10
    //   226: aload_1
    //   227: invokeinterface 107 1 0
    //   232: invokespecial 110	java/util/ArrayList:<init>	(I)V
    //   235: aload_1
    //   236: invokeinterface 72 1 0
    //   241: ifeq +198 -> 439
    //   244: aload_1
    //   245: iload_2
    //   246: invokeinterface 76 2 0
    //   251: ifne +23 -> 274
    //   254: aload 6
    //   256: aload_1
    //   257: iload_2
    //   258: invokeinterface 80 2 0
    //   263: invokevirtual 86	androidx/collection/SimpleArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   266: checkcast 88	java/util/ArrayList
    //   269: astore 9
    //   271: goto +6 -> 277
    //   274: aconst_null
    //   275: astore 9
    //   277: aload 9
    //   279: astore 8
    //   281: aload 9
    //   283: ifnonnull +13 -> 296
    //   286: new 88	java/util/ArrayList
    //   289: astore 8
    //   291: aload 8
    //   293: invokespecial 89	java/util/ArrayList:<init>	()V
    //   296: aload_1
    //   297: iload_2
    //   298: invokeinterface 76 2 0
    //   303: ifne +23 -> 326
    //   306: aload 7
    //   308: aload_1
    //   309: iload_2
    //   310: invokeinterface 80 2 0
    //   315: invokevirtual 86	androidx/collection/SimpleArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   318: checkcast 88	java/util/ArrayList
    //   321: astore 9
    //   323: goto +6 -> 329
    //   326: aconst_null
    //   327: astore 9
    //   329: aload 9
    //   331: astore 11
    //   333: aload 9
    //   335: ifnonnull +13 -> 348
    //   338: new 88	java/util/ArrayList
    //   341: astore 11
    //   343: aload 11
    //   345: invokespecial 89	java/util/ArrayList:<init>	()V
    //   348: new 112	androidx/work/impl/model/WorkSpec$WorkInfoPojo
    //   351: astore 9
    //   353: aload 9
    //   355: invokespecial 113	androidx/work/impl/model/WorkSpec$WorkInfoPojo:<init>	()V
    //   358: aload 9
    //   360: aload_1
    //   361: iload_2
    //   362: invokeinterface 80 2 0
    //   367: putfield 116	androidx/work/impl/model/WorkSpec$WorkInfoPojo:id	Ljava/lang/String;
    //   370: aload 9
    //   372: aload_1
    //   373: iload_3
    //   374: invokeinterface 120 2 0
    //   379: invokestatic 126	androidx/work/impl/model/WorkTypeConverters:intToState	(I)Landroidx/work/WorkInfo$State;
    //   382: putfield 129	androidx/work/impl/model/WorkSpec$WorkInfoPojo:state	Landroidx/work/WorkInfo$State;
    //   385: aload 9
    //   387: aload_1
    //   388: iload 4
    //   390: invokeinterface 133 2 0
    //   395: invokestatic 139	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   398: putfield 142	androidx/work/impl/model/WorkSpec$WorkInfoPojo:output	Landroidx/work/Data;
    //   401: aload 9
    //   403: aload_1
    //   404: iload 5
    //   406: invokeinterface 120 2 0
    //   411: putfield 146	androidx/work/impl/model/WorkSpec$WorkInfoPojo:runAttemptCount	I
    //   414: aload 9
    //   416: aload 8
    //   418: putfield 150	androidx/work/impl/model/WorkSpec$WorkInfoPojo:tags	Ljava/util/List;
    //   421: aload 9
    //   423: aload 11
    //   425: putfield 153	androidx/work/impl/model/WorkSpec$WorkInfoPojo:progress	Ljava/util/List;
    //   428: aload 10
    //   430: aload 9
    //   432: invokevirtual 157	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   435: pop
    //   436: goto -201 -> 235
    //   439: aload_0
    //   440: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$11:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
    //   443: invokestatic 38	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
    //   446: invokevirtual 160	androidx/room/RoomDatabase:setTransactionSuccessful	()V
    //   449: aload_1
    //   450: invokeinterface 163 1 0
    //   455: aload_0
    //   456: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$11:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
    //   459: invokestatic 38	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
    //   462: invokevirtual 166	androidx/room/RoomDatabase:endTransaction	()V
    //   465: aload 10
    //   467: areturn
    //   468: astore 9
    //   470: aload_1
    //   471: invokeinterface 163 1 0
    //   476: aload 9
    //   478: athrow
    //   479: astore 9
    //   481: aload_0
    //   482: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$11:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
    //   485: invokestatic 38	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
    //   488: invokevirtual 166	androidx/room/RoomDatabase:endTransaction	()V
    //   491: aload 9
    //   493: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	494	0	this	11
    //   26	445	1	localCursor	android.database.Cursor
    //   33	329	2	i	int
    //   40	334	3	j	int
    //   47	342	4	k	int
    //   55	350	5	m	int
    //   60	195	6	localArrayMap1	androidx.collection.ArrayMap
    //   70	237	7	localArrayMap2	androidx.collection.ArrayMap
    //   103	314	8	localObject1	Object
    //   121	310	9	localObject2	Object
    //   468	9	9	localObject3	Object
    //   479	13	9	localObject4	Object
    //   222	244	10	localArrayList	java.util.ArrayList
    //   331	93	11	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   27	77	468	finally
    //   77	138	468	finally
    //   138	190	468	finally
    //   193	235	468	finally
    //   235	271	468	finally
    //   286	296	468	finally
    //   296	323	468	finally
    //   338	348	468	finally
    //   348	436	468	finally
    //   439	449	468	finally
    //   10	27	479	finally
    //   449	455	479	finally
    //   470	479	479	finally
  }
  
  public void finalize()
  {
    val$_statement.release();
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.WorkSpecDao_Impl.11
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */