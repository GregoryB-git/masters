package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;

public final class SystemIdInfoDao_Impl
  implements SystemIdInfoDao
{
  private final RoomDatabase __db;
  private final EntityInsertionAdapter<SystemIdInfo> __insertionAdapterOfSystemIdInfo;
  private final SharedSQLiteStatement __preparedStmtOfRemoveSystemIdInfo;
  
  public SystemIdInfoDao_Impl(RoomDatabase paramRoomDatabase)
  {
    __db = paramRoomDatabase;
    __insertionAdapterOfSystemIdInfo = new EntityInsertionAdapter(paramRoomDatabase)
    {
      public void bind(SupportSQLiteStatement paramAnonymousSupportSQLiteStatement, SystemIdInfo paramAnonymousSystemIdInfo)
      {
        String str = workSpecId;
        if (str == null) {
          paramAnonymousSupportSQLiteStatement.bindNull(1);
        } else {
          paramAnonymousSupportSQLiteStatement.bindString(1, str);
        }
        paramAnonymousSupportSQLiteStatement.bindLong(2, systemId);
      }
      
      public String createQuery()
      {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
      }
    };
    __preparedStmtOfRemoveSystemIdInfo = new SharedSQLiteStatement(paramRoomDatabase)
    {
      public String createQuery()
      {
        return "DELETE FROM SystemIdInfo where work_spec_id=?";
      }
    };
  }
  
  public SystemIdInfo getSystemIdInfo(String paramString)
  {
    RoomSQLiteQuery localRoomSQLiteQuery = RoomSQLiteQuery.acquire("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
    if (paramString == null) {
      localRoomSQLiteQuery.bindNull(1);
    } else {
      localRoomSQLiteQuery.bindString(1, paramString);
    }
    __db.assertNotSuspendingTransaction();
    Object localObject = __db;
    paramString = null;
    localObject = DBUtil.query((RoomDatabase)localObject, localRoomSQLiteQuery, false, null);
    try
    {
      int i = CursorUtil.getColumnIndexOrThrow((Cursor)localObject, "work_spec_id");
      int j = CursorUtil.getColumnIndexOrThrow((Cursor)localObject, "system_id");
      if (((Cursor)localObject).moveToFirst()) {
        paramString = new SystemIdInfo(((Cursor)localObject).getString(i), ((Cursor)localObject).getInt(j));
      }
      return paramString;
    }
    finally
    {
      ((Cursor)localObject).close();
      localRoomSQLiteQuery.release();
    }
  }
  
  public List<String> getWorkSpecIds()
  {
    RoomSQLiteQuery localRoomSQLiteQuery = RoomSQLiteQuery.acquire("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
    __db.assertNotSuspendingTransaction();
    Cursor localCursor = DBUtil.query(__db, localRoomSQLiteQuery, false, null);
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(localCursor.getCount());
      while (localCursor.moveToNext()) {
        localArrayList.add(localCursor.getString(0));
      }
      return localArrayList;
    }
    finally
    {
      localCursor.close();
      localRoomSQLiteQuery.release();
    }
  }
  
  public void insertSystemIdInfo(SystemIdInfo paramSystemIdInfo)
  {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try
    {
      __insertionAdapterOfSystemIdInfo.insert(paramSystemIdInfo);
      __db.setTransactionSuccessful();
      return;
    }
    finally
    {
      __db.endTransaction();
    }
  }
  
  public void removeSystemIdInfo(String paramString)
  {
    __db.assertNotSuspendingTransaction();
    SupportSQLiteStatement localSupportSQLiteStatement = __preparedStmtOfRemoveSystemIdInfo.acquire();
    if (paramString == null) {
      localSupportSQLiteStatement.bindNull(1);
    } else {
      localSupportSQLiteStatement.bindString(1, paramString);
    }
    __db.beginTransaction();
    try
    {
      localSupportSQLiteStatement.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return;
    }
    finally
    {
      __db.endTransaction();
      __preparedStmtOfRemoveSystemIdInfo.release(localSupportSQLiteStatement);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.SystemIdInfoDao_Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */