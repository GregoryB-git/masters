package androidx.work.impl.utils;

import androidx.annotation.WorkerThread;
import androidx.room.RoomDatabase;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpecDao;
import java.util.Iterator;
import java.util.List;

class CancelWorkRunnable$4
  extends CancelWorkRunnable
{
  public CancelWorkRunnable$4(WorkManagerImpl paramWorkManagerImpl) {}
  
  @WorkerThread
  public void runInternal()
  {
    WorkDatabase localWorkDatabase = val$workManagerImpl.getWorkDatabase();
    localWorkDatabase.beginTransaction();
    try
    {
      Iterator localIterator = localWorkDatabase.workSpecDao().getAllUnfinishedWork().iterator();
      while (localIterator.hasNext())
      {
        localObject1 = (String)localIterator.next();
        cancel(val$workManagerImpl, (String)localObject1);
      }
      Object localObject1 = new androidx/work/impl/utils/PreferenceUtils;
      ((PreferenceUtils)localObject1).<init>(val$workManagerImpl.getWorkDatabase());
      ((PreferenceUtils)localObject1).setLastCancelAllTimeMillis(System.currentTimeMillis());
      localWorkDatabase.setTransactionSuccessful();
      return;
    }
    finally
    {
      localWorkDatabase.endTransaction();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.CancelWorkRunnable.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */