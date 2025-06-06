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

public final class DependencyDao_Impl
  implements DependencyDao
{
  private final RoomDatabase __db;
  private final EntityInsertionAdapter<Dependency> __insertionAdapterOfDependency;
  
  public DependencyDao_Impl(RoomDatabase paramRoomDatabase)
  {
    __db = paramRoomDatabase;
    __insertionAdapterOfDependency = new EntityInsertionAdapter(paramRoomDatabase)
    {
      public void bind(SupportSQLiteStatement paramAnonymousSupportSQLiteStatement, Dependency paramAnonymousDependency)
      {
        String str = workSpecId;
        if (str == null) {
          paramAnonymousSupportSQLiteStatement.bindNull(1);
        } else {
          paramAnonymousSupportSQLiteStatement.bindString(1, str);
        }
        paramAnonymousDependency = prerequisiteId;
        if (paramAnonymousDependency == null) {
          paramAnonymousSupportSQLiteStatement.bindNull(2);
        } else {
          paramAnonymousSupportSQLiteStatement.bindString(2, paramAnonymousDependency);
        }
      }
      
      public String createQuery()
      {
        return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
      }
    };
  }
  
  public List<String> getDependentWorkIds(String paramString)
  {
    RoomSQLiteQuery localRoomSQLiteQuery = RoomSQLiteQuery.acquire("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
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
  
  public List<String> getPrerequisites(String paramString)
  {
    RoomSQLiteQuery localRoomSQLiteQuery = RoomSQLiteQuery.acquire("SELECT prerequisite_id FROM dependency WHERE work_spec_id=?", 1);
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
  
  public boolean hasCompletedAllPrerequisites(String paramString)
  {
    boolean bool1 = true;
    RoomSQLiteQuery localRoomSQLiteQuery = RoomSQLiteQuery.acquire("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
    if (paramString == null) {
      localRoomSQLiteQuery.bindNull(1);
    } else {
      localRoomSQLiteQuery.bindString(1, paramString);
    }
    __db.assertNotSuspendingTransaction();
    paramString = __db;
    boolean bool2 = false;
    Cursor localCursor = DBUtil.query(paramString, localRoomSQLiteQuery, false, null);
    try
    {
      if (localCursor.moveToFirst())
      {
        int i = localCursor.getInt(0);
        if (i != 0) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }
      }
      return bool2;
    }
    finally
    {
      localCursor.close();
      localRoomSQLiteQuery.release();
    }
  }
  
  public boolean hasDependents(String paramString)
  {
    boolean bool1 = true;
    RoomSQLiteQuery localRoomSQLiteQuery = RoomSQLiteQuery.acquire("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
    if (paramString == null) {
      localRoomSQLiteQuery.bindNull(1);
    } else {
      localRoomSQLiteQuery.bindString(1, paramString);
    }
    __db.assertNotSuspendingTransaction();
    paramString = __db;
    boolean bool2 = false;
    Cursor localCursor = DBUtil.query(paramString, localRoomSQLiteQuery, false, null);
    try
    {
      if (localCursor.moveToFirst())
      {
        int i = localCursor.getInt(0);
        if (i != 0) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }
      }
      return bool2;
    }
    finally
    {
      localCursor.close();
      localRoomSQLiteQuery.release();
    }
  }
  
  public void insertDependency(Dependency paramDependency)
  {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try
    {
      __insertionAdapterOfDependency.insert(paramDependency);
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
 * Qualified Name:     androidx.work.impl.model.DependencyDao_Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */