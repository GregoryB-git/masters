package androidx.room;

import android.database.Cursor;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.HashSet;
import java.util.Set;

class InvalidationTracker$1
  implements Runnable
{
  public InvalidationTracker$1(InvalidationTracker paramInvalidationTracker) {}
  
  private Set<Integer> checkUpdatedTable()
  {
    HashSet localHashSet = new HashSet();
    Cursor localCursor = this$0.mDatabase.query(new SimpleSQLiteQuery("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
    try
    {
      while (localCursor.moveToNext()) {
        localHashSet.add(Integer.valueOf(localCursor.getInt(0)));
      }
      localCursor.close();
      if (!localHashSet.isEmpty()) {
        this$0.mCleanupStatement.executeUpdateDelete();
      }
      return localHashSet;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 14	androidx/room/InvalidationTracker$1:this$0	Landroidx/room/InvalidationTracker;
    //   4: getfield 27	androidx/room/InvalidationTracker:mDatabase	Landroidx/room/RoomDatabase;
    //   7: invokevirtual 87	androidx/room/RoomDatabase:getCloseLock	()Ljava/util/concurrent/locks/Lock;
    //   10: astore_1
    //   11: aconst_null
    //   12: astore_2
    //   13: aconst_null
    //   14: astore_3
    //   15: aconst_null
    //   16: astore 4
    //   18: aload_2
    //   19: astore 5
    //   21: aload_3
    //   22: astore 6
    //   24: aload_1
    //   25: invokeinterface 92 1 0
    //   30: aload_2
    //   31: astore 5
    //   33: aload_3
    //   34: astore 6
    //   36: aload_0
    //   37: getfield 14	androidx/room/InvalidationTracker$1:this$0	Landroidx/room/InvalidationTracker;
    //   40: invokevirtual 95	androidx/room/InvalidationTracker:ensureInitialization	()Z
    //   43: istore 7
    //   45: iload 7
    //   47: ifne +10 -> 57
    //   50: aload_1
    //   51: invokeinterface 98 1 0
    //   56: return
    //   57: aload_2
    //   58: astore 5
    //   60: aload_3
    //   61: astore 6
    //   63: aload_0
    //   64: getfield 14	androidx/room/InvalidationTracker$1:this$0	Landroidx/room/InvalidationTracker;
    //   67: getfield 102	androidx/room/InvalidationTracker:mPendingRefresh	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   70: iconst_1
    //   71: iconst_0
    //   72: invokevirtual 108	java/util/concurrent/atomic/AtomicBoolean:compareAndSet	(ZZ)Z
    //   75: istore 7
    //   77: iload 7
    //   79: ifne +10 -> 89
    //   82: aload_1
    //   83: invokeinterface 98 1 0
    //   88: return
    //   89: aload_2
    //   90: astore 5
    //   92: aload_3
    //   93: astore 6
    //   95: aload_0
    //   96: getfield 14	androidx/room/InvalidationTracker$1:this$0	Landroidx/room/InvalidationTracker;
    //   99: getfield 27	androidx/room/InvalidationTracker:mDatabase	Landroidx/room/RoomDatabase;
    //   102: invokevirtual 111	androidx/room/RoomDatabase:inTransaction	()Z
    //   105: istore 7
    //   107: iload 7
    //   109: ifeq +10 -> 119
    //   112: aload_1
    //   113: invokeinterface 98 1 0
    //   118: return
    //   119: aload_2
    //   120: astore 5
    //   122: aload_3
    //   123: astore 6
    //   125: aload_0
    //   126: getfield 14	androidx/room/InvalidationTracker$1:this$0	Landroidx/room/InvalidationTracker;
    //   129: getfield 27	androidx/room/InvalidationTracker:mDatabase	Landroidx/room/RoomDatabase;
    //   132: astore 8
    //   134: aload_2
    //   135: astore 5
    //   137: aload_3
    //   138: astore 6
    //   140: aload 8
    //   142: getfield 115	androidx/room/RoomDatabase:mWriteAheadLoggingEnabled	Z
    //   145: ifeq +91 -> 236
    //   148: aload_2
    //   149: astore 5
    //   151: aload_3
    //   152: astore 6
    //   154: aload 8
    //   156: invokevirtual 119	androidx/room/RoomDatabase:getOpenHelper	()Landroidx/sqlite/db/SupportSQLiteOpenHelper;
    //   159: invokeinterface 125 1 0
    //   164: astore 8
    //   166: aload_2
    //   167: astore 5
    //   169: aload_3
    //   170: astore 6
    //   172: aload 8
    //   174: invokeinterface 130 1 0
    //   179: aload_0
    //   180: invokespecial 132	androidx/room/InvalidationTracker$1:checkUpdatedTable	()Ljava/util/Set;
    //   183: astore_2
    //   184: aload_2
    //   185: astore 4
    //   187: aload 8
    //   189: invokeinterface 135 1 0
    //   194: aload_2
    //   195: astore 5
    //   197: aload_2
    //   198: astore 6
    //   200: aload 8
    //   202: invokeinterface 138 1 0
    //   207: goto +72 -> 279
    //   210: astore_2
    //   211: aload 4
    //   213: astore 5
    //   215: aload 4
    //   217: astore 6
    //   219: aload 8
    //   221: invokeinterface 138 1 0
    //   226: aload 4
    //   228: astore 5
    //   230: aload 4
    //   232: astore 6
    //   234: aload_2
    //   235: athrow
    //   236: aload_2
    //   237: astore 5
    //   239: aload_3
    //   240: astore 6
    //   242: aload_0
    //   243: invokespecial 132	androidx/room/InvalidationTracker$1:checkUpdatedTable	()Ljava/util/Set;
    //   246: astore_2
    //   247: goto +32 -> 279
    //   250: astore 6
    //   252: goto +120 -> 372
    //   255: astore 4
    //   257: aload 5
    //   259: astore 6
    //   261: goto +5 -> 266
    //   264: astore 4
    //   266: ldc -116
    //   268: ldc -114
    //   270: aload 4
    //   272: invokestatic 148	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   275: pop
    //   276: aload 6
    //   278: astore_2
    //   279: aload_1
    //   280: invokeinterface 98 1 0
    //   285: aload_2
    //   286: ifnull +85 -> 371
    //   289: aload_2
    //   290: invokeinterface 151 1 0
    //   295: ifne +76 -> 371
    //   298: aload_0
    //   299: getfield 14	androidx/room/InvalidationTracker$1:this$0	Landroidx/room/InvalidationTracker;
    //   302: getfield 155	androidx/room/InvalidationTracker:mObserverMap	Landroidx/arch/core/internal/SafeIterableMap;
    //   305: astore 6
    //   307: aload 6
    //   309: monitorenter
    //   310: aload_0
    //   311: getfield 14	androidx/room/InvalidationTracker$1:this$0	Landroidx/room/InvalidationTracker;
    //   314: getfield 155	androidx/room/InvalidationTracker:mObserverMap	Landroidx/arch/core/internal/SafeIterableMap;
    //   317: invokevirtual 161	androidx/arch/core/internal/SafeIterableMap:iterator	()Ljava/util/Iterator;
    //   320: astore 5
    //   322: aload 5
    //   324: invokeinterface 166 1 0
    //   329: ifeq +28 -> 357
    //   332: aload 5
    //   334: invokeinterface 170 1 0
    //   339: checkcast 172	java/util/Map$Entry
    //   342: invokeinterface 175 1 0
    //   347: checkcast 177	androidx/room/InvalidationTracker$ObserverWrapper
    //   350: aload_2
    //   351: invokevirtual 181	androidx/room/InvalidationTracker$ObserverWrapper:notifyByTableInvalidStatus	(Ljava/util/Set;)V
    //   354: goto -32 -> 322
    //   357: aload 6
    //   359: monitorexit
    //   360: goto +11 -> 371
    //   363: astore 5
    //   365: aload 6
    //   367: monitorexit
    //   368: aload 5
    //   370: athrow
    //   371: return
    //   372: aload_1
    //   373: invokeinterface 98 1 0
    //   378: aload 6
    //   380: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	381	0	this	1
    //   10	363	1	localLock	java.util.concurrent.locks.Lock
    //   12	186	2	localSet1	Set
    //   210	27	2	localObject1	Object
    //   246	105	2	localObject2	Object
    //   14	226	3	localObject3	Object
    //   16	215	4	localSet2	Set
    //   255	1	4	localSQLiteException	android.database.sqlite.SQLiteException
    //   264	7	4	localIllegalStateException	IllegalStateException
    //   19	314	5	localObject4	Object
    //   363	6	5	localObject5	Object
    //   22	219	6	localObject6	Object
    //   250	1	6	localObject7	Object
    //   259	120	6	localObject8	Object
    //   43	65	7	bool	boolean
    //   132	88	8	localObject9	Object
    // Exception table:
    //   from	to	target	type
    //   179	184	210	finally
    //   187	194	210	finally
    //   24	30	250	finally
    //   36	45	250	finally
    //   63	77	250	finally
    //   95	107	250	finally
    //   125	134	250	finally
    //   140	148	250	finally
    //   154	166	250	finally
    //   172	179	250	finally
    //   200	207	250	finally
    //   219	226	250	finally
    //   234	236	250	finally
    //   242	247	250	finally
    //   266	276	250	finally
    //   24	30	255	android/database/sqlite/SQLiteException
    //   36	45	255	android/database/sqlite/SQLiteException
    //   63	77	255	android/database/sqlite/SQLiteException
    //   95	107	255	android/database/sqlite/SQLiteException
    //   125	134	255	android/database/sqlite/SQLiteException
    //   140	148	255	android/database/sqlite/SQLiteException
    //   154	166	255	android/database/sqlite/SQLiteException
    //   172	179	255	android/database/sqlite/SQLiteException
    //   200	207	255	android/database/sqlite/SQLiteException
    //   219	226	255	android/database/sqlite/SQLiteException
    //   234	236	255	android/database/sqlite/SQLiteException
    //   242	247	255	android/database/sqlite/SQLiteException
    //   24	30	264	java/lang/IllegalStateException
    //   36	45	264	java/lang/IllegalStateException
    //   63	77	264	java/lang/IllegalStateException
    //   95	107	264	java/lang/IllegalStateException
    //   125	134	264	java/lang/IllegalStateException
    //   140	148	264	java/lang/IllegalStateException
    //   154	166	264	java/lang/IllegalStateException
    //   172	179	264	java/lang/IllegalStateException
    //   200	207	264	java/lang/IllegalStateException
    //   219	226	264	java/lang/IllegalStateException
    //   234	236	264	java/lang/IllegalStateException
    //   242	247	264	java/lang/IllegalStateException
    //   310	322	363	finally
    //   322	354	363	finally
    //   357	360	363	finally
    //   365	368	363	finally
  }
}

/* Location:
 * Qualified Name:     androidx.room.InvalidationTracker.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */