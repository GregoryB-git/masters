package androidx.work.impl.model;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.concurrent.Callable;

public final class PreferenceDao_Impl
  implements PreferenceDao
{
  private final RoomDatabase __db;
  private final EntityInsertionAdapter<Preference> __insertionAdapterOfPreference;
  
  public PreferenceDao_Impl(RoomDatabase paramRoomDatabase)
  {
    __db = paramRoomDatabase;
    __insertionAdapterOfPreference = new EntityInsertionAdapter(paramRoomDatabase)
    {
      public void bind(SupportSQLiteStatement paramAnonymousSupportSQLiteStatement, Preference paramAnonymousPreference)
      {
        String str = mKey;
        if (str == null) {
          paramAnonymousSupportSQLiteStatement.bindNull(1);
        } else {
          paramAnonymousSupportSQLiteStatement.bindString(1, str);
        }
        paramAnonymousPreference = mValue;
        if (paramAnonymousPreference == null) {
          paramAnonymousSupportSQLiteStatement.bindNull(2);
        } else {
          paramAnonymousSupportSQLiteStatement.bindLong(2, paramAnonymousPreference.longValue());
        }
      }
      
      public String createQuery()
      {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
      }
    };
  }
  
  public Long getLongValue(String paramString)
  {
    RoomSQLiteQuery localRoomSQLiteQuery = RoomSQLiteQuery.acquire("SELECT long_value FROM Preference where `key`=?", 1);
    if (paramString == null) {
      localRoomSQLiteQuery.bindNull(1);
    } else {
      localRoomSQLiteQuery.bindString(1, paramString);
    }
    __db.assertNotSuspendingTransaction();
    paramString = __db;
    Object localObject = null;
    Cursor localCursor = DBUtil.query(paramString, localRoomSQLiteQuery, false, null);
    paramString = (String)localObject;
    try
    {
      if (localCursor.moveToFirst()) {
        if (localCursor.isNull(0)) {
          paramString = (String)localObject;
        } else {
          paramString = Long.valueOf(localCursor.getLong(0));
        }
      }
      return paramString;
    }
    finally
    {
      localCursor.close();
      localRoomSQLiteQuery.release();
    }
  }
  
  public LiveData<Long> getObservableLongValue(String paramString)
  {
    final Object localObject = RoomSQLiteQuery.acquire("SELECT long_value FROM Preference where `key`=?", 1);
    if (paramString == null) {
      ((RoomSQLiteQuery)localObject).bindNull(1);
    } else {
      ((RoomSQLiteQuery)localObject).bindString(1, paramString);
    }
    paramString = __db.getInvalidationTracker();
    localObject = new Callable()
    {
      public Long call()
        throws Exception
      {
        Object localObject1 = PreferenceDao_Impl.access$000(PreferenceDao_Impl.this);
        Object localObject3 = localObject;
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
        localObject.release();
      }
    };
    return paramString.createLiveData(new String[] { "Preference" }, false, (Callable)localObject);
  }
  
  public void insertPreference(Preference paramPreference)
  {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try
    {
      __insertionAdapterOfPreference.insert(paramPreference);
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
 * Qualified Name:     androidx.work.impl.model.PreferenceDao_Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */