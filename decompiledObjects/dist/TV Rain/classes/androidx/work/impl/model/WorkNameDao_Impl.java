package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;

public final class WorkNameDao_Impl
  implements WorkNameDao
{
  private final RoomDatabase __db;
  private final EntityInsertionAdapter<WorkName> __insertionAdapterOfWorkName;
  
  public WorkNameDao_Impl(RoomDatabase paramRoomDatabase)
  {
    __db = paramRoomDatabase;
    __insertionAdapterOfWorkName = new EntityInsertionAdapter(paramRoomDatabase)
    {
      public void bind(SupportSQLiteStatement paramAnonymousSupportSQLiteStatement, WorkName paramAnonymousWorkName)
      {
        String str = name;
        if (str == null) {
          paramAnonymousSupportSQLiteStatement.bindNull(1);
        } else {
          paramAnonymousSupportSQLiteStatement.bindString(1, str);
        }
        paramAnonymousWorkName = workSpecId;
        if (paramAnonymousWorkName == null) {
          paramAnonymousSupportSQLiteStatement.bindNull(2);
        } else {
          paramAnonymousSupportSQLiteStatement.bindString(2, paramAnonymousWorkName);
        }
      }
      
      public String createQuery()
      {
        return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
      }
    };
  }
  
  public List<String> getNamesForWorkSpecId(String paramString)
  {
    RoomSQLiteQuery localRoomSQLiteQuery = RoomSQLiteQuery.acquire("SELECT name FROM workname WHERE work_spec_id=?", 1);
    if (paramString == null) {
      localRoomSQLiteQuery.bindNull(1);
    } else {
      localRoomSQLiteQuery.bindString(1, paramString);
    }
    __db.assertNotSuspendingTransaction();
    paramString = DBUtil.query(__db, localRoomSQLiteQuery, false, null);
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(paramString.getCount());
      while (paramString.moveToNext()) {
        localArrayList.add(paramString.getString(0));
      }
      return localArrayList;
    }
    finally
    {
      paramString.close();
      localRoomSQLiteQuery.release();
    }
  }
  
  public List<String> getWorkSpecIdsWithName(String paramString)
  {
    RoomSQLiteQuery localRoomSQLiteQuery = RoomSQLiteQuery.acquire("SELECT work_spec_id FROM workname WHERE name=?", 1);
    if (paramString == null) {
      localRoomSQLiteQuery.bindNull(1);
    } else {
      localRoomSQLiteQuery.bindString(1, paramString);
    }
    __db.assertNotSuspendingTransaction();
    paramString = DBUtil.query(__db, localRoomSQLiteQuery, false, null);
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(paramString.getCount());
      while (paramString.moveToNext()) {
        localArrayList.add(paramString.getString(0));
      }
      return localArrayList;
    }
    finally
    {
      paramString.close();
      localRoomSQLiteQuery.release();
    }
  }
  
  public void insert(WorkName paramWorkName)
  {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try
    {
      __insertionAdapterOfWorkName.insert(paramWorkName);
      __db.setTransactionSuccessful();
      return;
    }
    finally
    {
      __db.endTransaction();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.WorkNameDao_Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */