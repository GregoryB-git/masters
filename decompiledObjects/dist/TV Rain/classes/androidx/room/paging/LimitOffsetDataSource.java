package androidx.room.paging;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.paging.PositionalDataSource;
import androidx.paging.PositionalDataSource.LoadInitialCallback;
import androidx.paging.PositionalDataSource.LoadInitialParams;
import androidx.paging.PositionalDataSource.LoadRangeCallback;
import androidx.paging.PositionalDataSource.LoadRangeParams;
import androidx.room.InvalidationTracker;
import androidx.room.InvalidationTracker.Observer;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import z2;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class LimitOffsetDataSource<T>
  extends PositionalDataSource<T>
{
  private final String mCountQuery;
  private final RoomDatabase mDb;
  private final boolean mInTransaction;
  private final String mLimitOffsetQuery;
  private final InvalidationTracker.Observer mObserver;
  private final RoomSQLiteQuery mSourceQuery;
  
  public LimitOffsetDataSource(RoomDatabase paramRoomDatabase, RoomSQLiteQuery paramRoomSQLiteQuery, boolean paramBoolean, String... paramVarArgs)
  {
    mDb = paramRoomDatabase;
    mSourceQuery = paramRoomSQLiteQuery;
    mInTransaction = paramBoolean;
    StringBuilder localStringBuilder = z2.t("SELECT COUNT(*) FROM ( ");
    localStringBuilder.append(paramRoomSQLiteQuery.getSql());
    localStringBuilder.append(" )");
    mCountQuery = localStringBuilder.toString();
    localStringBuilder = z2.t("SELECT * FROM ( ");
    localStringBuilder.append(paramRoomSQLiteQuery.getSql());
    localStringBuilder.append(" ) LIMIT ? OFFSET ?");
    mLimitOffsetQuery = localStringBuilder.toString();
    paramRoomSQLiteQuery = new InvalidationTracker.Observer(paramVarArgs)
    {
      public void onInvalidated(@NonNull Set<String> paramAnonymousSet)
      {
        invalidate();
      }
    };
    mObserver = paramRoomSQLiteQuery;
    paramRoomDatabase.getInvalidationTracker().addWeakObserver(paramRoomSQLiteQuery);
  }
  
  public LimitOffsetDataSource(RoomDatabase paramRoomDatabase, SupportSQLiteQuery paramSupportSQLiteQuery, boolean paramBoolean, String... paramVarArgs)
  {
    this(paramRoomDatabase, RoomSQLiteQuery.copyFrom(paramSupportSQLiteQuery), paramBoolean, paramVarArgs);
  }
  
  private RoomSQLiteQuery getSQLiteQuery(int paramInt1, int paramInt2)
  {
    RoomSQLiteQuery localRoomSQLiteQuery = RoomSQLiteQuery.acquire(mLimitOffsetQuery, mSourceQuery.getArgCount() + 2);
    localRoomSQLiteQuery.copyArgumentsFrom(mSourceQuery);
    localRoomSQLiteQuery.bindLong(localRoomSQLiteQuery.getArgCount() - 1, paramInt2);
    localRoomSQLiteQuery.bindLong(localRoomSQLiteQuery.getArgCount(), paramInt1);
    return localRoomSQLiteQuery;
  }
  
  public abstract List<T> convertRows(Cursor paramCursor);
  
  public int countItems()
  {
    RoomSQLiteQuery localRoomSQLiteQuery = RoomSQLiteQuery.acquire(mCountQuery, mSourceQuery.getArgCount());
    localRoomSQLiteQuery.copyArgumentsFrom(mSourceQuery);
    Cursor localCursor = mDb.query(localRoomSQLiteQuery);
    try
    {
      if (localCursor.moveToFirst())
      {
        int i = localCursor.getInt(0);
        return i;
      }
      return 0;
    }
    finally
    {
      localCursor.close();
      localRoomSQLiteQuery.release();
    }
  }
  
  public boolean isInvalid()
  {
    mDb.getInvalidationTracker().refreshVersionsSync();
    return super.isInvalid();
  }
  
  public void loadInitial(@NonNull PositionalDataSource.LoadInitialParams paramLoadInitialParams, @NonNull PositionalDataSource.LoadInitialCallback<T> paramLoadInitialCallback)
  {
    List localList = Collections.emptyList();
    mDb.beginTransaction();
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    try
    {
      int i = countItems();
      int j;
      if (i != 0)
      {
        j = computeInitialLoadPosition(paramLoadInitialParams, i);
        localRoomSQLiteQuery = getSQLiteQuery(j, computeInitialLoadSize(paramLoadInitialParams, j, i));
        paramLoadInitialParams = (PositionalDataSource.LoadInitialParams)localObject3;
        try
        {
          localObject2 = mDb.query(localRoomSQLiteQuery);
          paramLoadInitialParams = (PositionalDataSource.LoadInitialParams)localObject2;
          localList = convertRows((Cursor)localObject2);
          paramLoadInitialParams = (PositionalDataSource.LoadInitialParams)localObject2;
          mDb.setTransactionSuccessful();
          paramLoadInitialParams = localList;
        }
        finally
        {
          break label156;
        }
      }
      else
      {
        j = 0;
        localRoomSQLiteQuery = null;
        localObject2 = localObject1;
        paramLoadInitialParams = localList;
      }
      if (localObject2 != null) {
        ((Cursor)localObject2).close();
      }
      mDb.endTransaction();
      if (localRoomSQLiteQuery != null) {
        localRoomSQLiteQuery.release();
      }
      paramLoadInitialCallback.onResult(paramLoadInitialParams, j, i);
      return;
    }
    finally
    {
      RoomSQLiteQuery localRoomSQLiteQuery = null;
      paramLoadInitialParams = (PositionalDataSource.LoadInitialParams)localObject2;
      label156:
      if (paramLoadInitialParams != null) {
        paramLoadInitialParams.close();
      }
      mDb.endTransaction();
      if (localRoomSQLiteQuery != null) {
        localRoomSQLiteQuery.release();
      }
    }
  }
  
  @NonNull
  public List<T> loadRange(int paramInt1, int paramInt2)
  {
    RoomSQLiteQuery localRoomSQLiteQuery = getSQLiteQuery(paramInt1, paramInt2);
    if (mInTransaction)
    {
      mDb.beginTransaction();
      localObject1 = null;
      try
      {
        Cursor localCursor = mDb.query(localRoomSQLiteQuery);
        localObject1 = localCursor;
        List localList2 = convertRows(localCursor);
        localObject1 = localCursor;
        mDb.setTransactionSuccessful();
        if (localCursor != null) {
          localCursor.close();
        }
        mDb.endTransaction();
        localRoomSQLiteQuery.release();
        return localList2;
      }
      finally
      {
        if (localObject1 != null) {
          ((Cursor)localObject1).close();
        }
        mDb.endTransaction();
        localRoomSQLiteQuery.release();
      }
    }
    Object localObject1 = mDb.query(localRoomSQLiteQuery);
    try
    {
      List localList1 = convertRows((Cursor)localObject1);
      return localList1;
    }
    finally
    {
      ((Cursor)localObject1).close();
      localRoomSQLiteQuery.release();
    }
  }
  
  public void loadRange(@NonNull PositionalDataSource.LoadRangeParams paramLoadRangeParams, @NonNull PositionalDataSource.LoadRangeCallback<T> paramLoadRangeCallback)
  {
    paramLoadRangeCallback.onResult(loadRange(startPosition, loadSize));
  }
}

/* Location:
 * Qualified Name:     androidx.room.paging.LimitOffsetDataSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */