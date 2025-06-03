package androidx.work.impl.model;

import android.database.Cursor;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.work.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

class RawWorkInfoDao_Impl$1
  implements Callable<List<WorkSpec.WorkInfoPojo>>
{
  public RawWorkInfoDao_Impl$1(RawWorkInfoDao_Impl paramRawWorkInfoDao_Impl, SupportSQLiteQuery paramSupportSQLiteQuery) {}
  
  public List<WorkSpec.WorkInfoPojo> call()
    throws Exception
  {
    Cursor localCursor = DBUtil.query(RawWorkInfoDao_Impl.access$000(this$0), val$_internalQuery, true, null);
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
      RawWorkInfoDao_Impl.access$100(this$0, localArrayMap1);
      RawWorkInfoDao_Impl.access$200(this$0, localArrayMap2);
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
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.RawWorkInfoDao_Impl.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */