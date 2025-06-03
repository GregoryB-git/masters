package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.util.concurrent.Callable;

class WorkSpecDao_Impl$14
  implements Callable<Long>
{
  public WorkSpecDao_Impl$14(WorkSpecDao_Impl paramWorkSpecDao_Impl, RoomSQLiteQuery paramRoomSQLiteQuery) {}
  
  public Long call()
    throws Exception
  {
    Object localObject1 = WorkSpecDao_Impl.access$000(this$0);
    Object localObject3 = val$_statement;
    Object localObject4 = null;
    localObject3 = DBUtil.query((RoomDatabase)localObject1, (SupportSQLiteQuery)localObject3, false, null);
    localObject1 = localObject4;
    try
    {
      if (((Cursor)localObject3).moveToFirst()) {
        if (((Cursor)localObject3).isNull(0)) {
          localObject1 = localObject4;
        } else {
          localObject1 = Long.valueOf(((Cursor)localObject3).getLong(0));
        }
      }
      return (Long)localObject1;
    }
    finally
    {
      ((Cursor)localObject3).close();
    }
  }
  
  public void finalize()
  {
    val$_statement.release();
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.WorkSpecDao_Impl.14
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */