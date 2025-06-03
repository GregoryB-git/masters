package androidx.work.impl.model;

import android.database.Cursor;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import androidx.lifecycle.LiveData;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.work.Data;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

public final class RawWorkInfoDao_Impl
  implements RawWorkInfoDao
{
  private final RoomDatabase __db;
  
  public RawWorkInfoDao_Impl(RoomDatabase paramRoomDatabase)
  {
    __db = paramRoomDatabase;
  }
  
  private void __fetchRelationshipWorkProgressAsandroidxWorkData(ArrayMap<String, ArrayList<Data>> paramArrayMap)
  {
    Object localObject1 = paramArrayMap.keySet();
    if (((Set)localObject1).isEmpty()) {
      return;
    }
    if (paramArrayMap.size() > 999)
    {
      localObject2 = new ArrayMap(999);
      int i = paramArrayMap.size();
      int j = 0;
      k = j;
      while (j < i)
      {
        ((SimpleArrayMap)localObject2).put((String)paramArrayMap.keyAt(j), (ArrayList)paramArrayMap.valueAt(j));
        int m = j + 1;
        int n = k + 1;
        j = m;
        k = n;
        if (n == 999)
        {
          __fetchRelationshipWorkProgressAsandroidxWorkData((ArrayMap)localObject2);
          localObject2 = new ArrayMap(999);
          k = 0;
          j = m;
        }
      }
      if (k > 0) {
        __fetchRelationshipWorkProgressAsandroidxWorkData((ArrayMap)localObject2);
      }
      return;
    }
    Object localObject2 = StringUtil.newStringBuilder();
    ((StringBuilder)localObject2).append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
    int k = ((Set)localObject1).size();
    StringUtil.appendPlaceholders((StringBuilder)localObject2, k);
    ((StringBuilder)localObject2).append(")");
    localObject2 = RoomSQLiteQuery.acquire(((StringBuilder)localObject2).toString(), k + 0);
    localObject1 = ((Set)localObject1).iterator();
    for (k = 1; ((Iterator)localObject1).hasNext(); k++)
    {
      String str = (String)((Iterator)localObject1).next();
      if (str == null) {
        ((RoomSQLiteQuery)localObject2).bindNull(k);
      } else {
        ((RoomSQLiteQuery)localObject2).bindString(k, str);
      }
    }
    localObject2 = DBUtil.query(__db, (SupportSQLiteQuery)localObject2, false, null);
    try
    {
      k = CursorUtil.getColumnIndex((Cursor)localObject2, "work_spec_id");
      if (k == -1) {
        return;
      }
      while (((Cursor)localObject2).moveToNext()) {
        if (!((Cursor)localObject2).isNull(k))
        {
          localObject1 = (ArrayList)paramArrayMap.get(((Cursor)localObject2).getString(k));
          if (localObject1 != null) {
            ((ArrayList)localObject1).add(Data.fromByteArray(((Cursor)localObject2).getBlob(0)));
          }
        }
      }
      return;
    }
    finally
    {
      ((Cursor)localObject2).close();
    }
  }
  
  private void __fetchRelationshipWorkTagAsjavaLangString(ArrayMap<String, ArrayList<String>> paramArrayMap)
  {
    Object localObject1 = paramArrayMap.keySet();
    if (((Set)localObject1).isEmpty()) {
      return;
    }
    if (paramArrayMap.size() > 999)
    {
      localObject2 = new ArrayMap(999);
      int i = paramArrayMap.size();
      int j = 0;
      k = j;
      while (j < i)
      {
        ((SimpleArrayMap)localObject2).put((String)paramArrayMap.keyAt(j), (ArrayList)paramArrayMap.valueAt(j));
        int m = j + 1;
        int n = k + 1;
        j = m;
        k = n;
        if (n == 999)
        {
          __fetchRelationshipWorkTagAsjavaLangString((ArrayMap)localObject2);
          localObject2 = new ArrayMap(999);
          k = 0;
          j = m;
        }
      }
      if (k > 0) {
        __fetchRelationshipWorkTagAsjavaLangString((ArrayMap)localObject2);
      }
      return;
    }
    Object localObject2 = StringUtil.newStringBuilder();
    ((StringBuilder)localObject2).append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
    int k = ((Set)localObject1).size();
    StringUtil.appendPlaceholders((StringBuilder)localObject2, k);
    ((StringBuilder)localObject2).append(")");
    localObject2 = RoomSQLiteQuery.acquire(((StringBuilder)localObject2).toString(), k + 0);
    localObject1 = ((Set)localObject1).iterator();
    for (k = 1; ((Iterator)localObject1).hasNext(); k++)
    {
      String str = (String)((Iterator)localObject1).next();
      if (str == null) {
        ((RoomSQLiteQuery)localObject2).bindNull(k);
      } else {
        ((RoomSQLiteQuery)localObject2).bindString(k, str);
      }
    }
    localObject2 = DBUtil.query(__db, (SupportSQLiteQuery)localObject2, false, null);
    try
    {
      k = CursorUtil.getColumnIndex((Cursor)localObject2, "work_spec_id");
      if (k == -1) {
        return;
      }
      while (((Cursor)localObject2).moveToNext()) {
        if (!((Cursor)localObject2).isNull(k))
        {
          localObject1 = (ArrayList)paramArrayMap.get(((Cursor)localObject2).getString(k));
          if (localObject1 != null) {
            ((ArrayList)localObject1).add(((Cursor)localObject2).getString(0));
          }
        }
      }
      return;
    }
    finally
    {
      ((Cursor)localObject2).close();
    }
  }
  
  public List<WorkSpec.WorkInfoPojo> getWorkInfoPojos(SupportSQLiteQuery paramSupportSQLiteQuery)
  {
    __db.assertNotSuspendingTransaction();
    Cursor localCursor = DBUtil.query(__db, paramSupportSQLiteQuery, true, null);
    try
    {
      int i = CursorUtil.getColumnIndex(localCursor, "id");
      int j = CursorUtil.getColumnIndex(localCursor, "state");
      int k = CursorUtil.getColumnIndex(localCursor, "output");
      int m = CursorUtil.getColumnIndex(localCursor, "run_attempt_count");
      ArrayMap localArrayMap1 = new androidx/collection/ArrayMap;
      localArrayMap1.<init>();
      ArrayMap localArrayMap2 = new androidx/collection/ArrayMap;
      localArrayMap2.<init>();
      Object localObject1;
      while (localCursor.moveToNext())
      {
        if (!localCursor.isNull(i))
        {
          localObject1 = localCursor.getString(i);
          if ((ArrayList)localArrayMap1.get(localObject1) == null)
          {
            paramSupportSQLiteQuery = new java/util/ArrayList;
            paramSupportSQLiteQuery.<init>();
            localArrayMap1.put(localObject1, paramSupportSQLiteQuery);
          }
        }
        if (!localCursor.isNull(i))
        {
          paramSupportSQLiteQuery = localCursor.getString(i);
          if ((ArrayList)localArrayMap2.get(paramSupportSQLiteQuery) == null)
          {
            localObject1 = new java/util/ArrayList;
            ((ArrayList)localObject1).<init>();
            localArrayMap2.put(paramSupportSQLiteQuery, localObject1);
          }
        }
      }
      localCursor.moveToPosition(-1);
      __fetchRelationshipWorkTagAsjavaLangString(localArrayMap1);
      __fetchRelationshipWorkProgressAsandroidxWorkData(localArrayMap2);
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(localCursor.getCount());
      while (localCursor.moveToNext())
      {
        if (!localCursor.isNull(i)) {
          paramSupportSQLiteQuery = (ArrayList)localArrayMap1.get(localCursor.getString(i));
        } else {
          paramSupportSQLiteQuery = null;
        }
        localObject1 = paramSupportSQLiteQuery;
        if (paramSupportSQLiteQuery == null)
        {
          localObject1 = new java/util/ArrayList;
          ((ArrayList)localObject1).<init>();
        }
        if (!localCursor.isNull(i)) {
          paramSupportSQLiteQuery = (ArrayList)localArrayMap2.get(localCursor.getString(i));
        } else {
          paramSupportSQLiteQuery = null;
        }
        Object localObject2 = paramSupportSQLiteQuery;
        if (paramSupportSQLiteQuery == null)
        {
          localObject2 = new java/util/ArrayList;
          ((ArrayList)localObject2).<init>();
        }
        paramSupportSQLiteQuery = new androidx/work/impl/model/WorkSpec$WorkInfoPojo;
        paramSupportSQLiteQuery.<init>();
        if (i != -1) {
          id = localCursor.getString(i);
        }
        if (j != -1) {
          state = WorkTypeConverters.intToState(localCursor.getInt(j));
        }
        if (k != -1) {
          output = Data.fromByteArray(localCursor.getBlob(k));
        }
        if (m != -1) {
          runAttemptCount = localCursor.getInt(m);
        }
        tags = ((List)localObject1);
        progress = ((List)localObject2);
        localArrayList.add(paramSupportSQLiteQuery);
      }
      return localArrayList;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkInfoPojosLiveData(final SupportSQLiteQuery paramSupportSQLiteQuery)
  {
    InvalidationTracker localInvalidationTracker = __db.getInvalidationTracker();
    paramSupportSQLiteQuery = new Callable()
    {
      public List<WorkSpec.WorkInfoPojo> call()
        throws Exception
      {
        Cursor localCursor = DBUtil.query(RawWorkInfoDao_Impl.access$000(RawWorkInfoDao_Impl.this), paramSupportSQLiteQuery, true, null);
        try
        {
          int i = CursorUtil.getColumnIndex(localCursor, "id");
          int j = CursorUtil.getColumnIndex(localCursor, "state");
          int k = CursorUtil.getColumnIndex(localCursor, "output");
          int m = CursorUtil.getColumnIndex(localCursor, "run_attempt_count");
          ArrayMap localArrayMap1 = new androidx/collection/ArrayMap;
          localArrayMap1.<init>();
          ArrayMap localArrayMap2 = new androidx/collection/ArrayMap;
          localArrayMap2.<init>();
          Object localObject1;
          Object localObject3;
          while (localCursor.moveToNext())
          {
            if (!localCursor.isNull(i))
            {
              localObject1 = localCursor.getString(i);
              if ((ArrayList)localArrayMap1.get(localObject1) == null)
              {
                localObject3 = new java/util/ArrayList;
                ((ArrayList)localObject3).<init>();
                localArrayMap1.put(localObject1, localObject3);
              }
            }
            if (!localCursor.isNull(i))
            {
              localObject1 = localCursor.getString(i);
              if ((ArrayList)localArrayMap2.get(localObject1) == null)
              {
                localObject3 = new java/util/ArrayList;
                ((ArrayList)localObject3).<init>();
                localArrayMap2.put(localObject1, localObject3);
              }
            }
          }
          localCursor.moveToPosition(-1);
          RawWorkInfoDao_Impl.access$100(RawWorkInfoDao_Impl.this, localArrayMap1);
          RawWorkInfoDao_Impl.access$200(RawWorkInfoDao_Impl.this, localArrayMap2);
          ArrayList localArrayList = new java/util/ArrayList;
          localArrayList.<init>(localCursor.getCount());
          while (localCursor.moveToNext())
          {
            if (!localCursor.isNull(i)) {
              localObject1 = (ArrayList)localArrayMap1.get(localCursor.getString(i));
            } else {
              localObject1 = null;
            }
            localObject3 = localObject1;
            if (localObject1 == null)
            {
              localObject3 = new java/util/ArrayList;
              ((ArrayList)localObject3).<init>();
            }
            if (!localCursor.isNull(i)) {
              localObject1 = (ArrayList)localArrayMap2.get(localCursor.getString(i));
            } else {
              localObject1 = null;
            }
            Object localObject4 = localObject1;
            if (localObject1 == null)
            {
              localObject4 = new java/util/ArrayList;
              ((ArrayList)localObject4).<init>();
            }
            localObject1 = new androidx/work/impl/model/WorkSpec$WorkInfoPojo;
            ((WorkSpec.WorkInfoPojo)localObject1).<init>();
            if (i != -1) {
              id = localCursor.getString(i);
            }
            if (j != -1) {
              state = WorkTypeConverters.intToState(localCursor.getInt(j));
            }
            if (k != -1) {
              output = Data.fromByteArray(localCursor.getBlob(k));
            }
            if (m != -1) {
              runAttemptCount = localCursor.getInt(m);
            }
            tags = ((List)localObject3);
            progress = ((List)localObject4);
            localArrayList.add(localObject1);
          }
          return localArrayList;
        }
        finally
        {
          localCursor.close();
        }
      }
    };
    return localInvalidationTracker.createLiveData(new String[] { "WorkTag", "WorkProgress", "WorkSpec" }, false, paramSupportSQLiteQuery);
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.RawWorkInfoDao_Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */