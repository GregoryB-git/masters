package androidx.work.impl.model;

import androidx.room.RoomSQLiteQuery;
import java.util.List;
import java.util.concurrent.Callable;

class WorkSpecDao_Impl$10
  implements Callable<List<String>>
{
  public WorkSpecDao_Impl$10(WorkSpecDao_Impl paramWorkSpecDao_Impl, RoomSQLiteQuery paramRoomSQLiteQuery) {}
  
  /* Error */
  public List<String> call()
    throws java.lang.Exception
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$10:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
    //   4: invokestatic 38	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
    //   7: invokevirtual 43	androidx/room/RoomDatabase:beginTransaction	()V
    //   10: aload_0
    //   11: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$10:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
    //   14: invokestatic 38	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
    //   17: aload_0
    //   18: getfield 22	androidx/work/impl/model/WorkSpecDao_Impl$10:val$_statement	Landroidx/room/RoomSQLiteQuery;
    //   21: iconst_0
    //   22: aconst_null
    //   23: invokestatic 49	androidx/room/util/DBUtil:query	(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;
    //   26: astore_1
    //   27: new 51	java/util/ArrayList
    //   30: astore_2
    //   31: aload_2
    //   32: aload_1
    //   33: invokeinterface 57 1 0
    //   38: invokespecial 60	java/util/ArrayList:<init>	(I)V
    //   41: aload_1
    //   42: invokeinterface 64 1 0
    //   47: ifeq +18 -> 65
    //   50: aload_2
    //   51: aload_1
    //   52: iconst_0
    //   53: invokeinterface 68 2 0
    //   58: invokevirtual 72	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   61: pop
    //   62: goto -21 -> 41
    //   65: aload_0
    //   66: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$10:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
    //   69: invokestatic 38	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
    //   72: invokevirtual 75	androidx/room/RoomDatabase:setTransactionSuccessful	()V
    //   75: aload_1
    //   76: invokeinterface 78 1 0
    //   81: aload_0
    //   82: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$10:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
    //   85: invokestatic 38	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
    //   88: invokevirtual 81	androidx/room/RoomDatabase:endTransaction	()V
    //   91: aload_2
    //   92: areturn
    //   93: astore_2
    //   94: aload_1
    //   95: invokeinterface 78 1 0
    //   100: aload_2
    //   101: athrow
    //   102: astore_1
    //   103: aload_0
    //   104: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$10:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
    //   107: invokestatic 38	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
    //   110: invokevirtual 81	androidx/room/RoomDatabase:endTransaction	()V
    //   113: aload_1
    //   114: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	115	0	this	10
    //   26	69	1	localCursor	android.database.Cursor
    //   102	12	1	localObject1	Object
    //   30	62	2	localArrayList	java.util.ArrayList
    //   93	8	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   27	41	93	finally
    //   41	62	93	finally
    //   65	75	93	finally
    //   10	27	102	finally
    //   75	81	102	finally
    //   94	102	102	finally
  }
  
  public void finalize()
  {
    val$_statement.release();
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.WorkSpecDao_Impl.10
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */