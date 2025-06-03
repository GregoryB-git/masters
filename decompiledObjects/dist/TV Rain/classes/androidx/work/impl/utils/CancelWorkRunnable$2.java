package androidx.work.impl.utils;

import androidx.annotation.WorkerThread;
import androidx.room.RoomDatabase;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpecDao;
import java.util.Iterator;
import java.util.List;

class CancelWorkRunnable$2
  extends CancelWorkRunnable
{
  public CancelWorkRunnable$2(WorkManagerImpl paramWorkManagerImpl, String paramString) {}
  
  @WorkerThread
  public void runInternal()
  {
    WorkDatabase localWorkDatabase = val$workManagerImpl.getWorkDatabase();
    localWorkDatabase.beginTransaction();
    try
    {
      Iterator localIterator = localWorkDatabase.workSpecDao().getUnfinishedWorkWithTag(val$tag).iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        cancel(val$workManagerImpl, str);
      }
      localWorkDatabase.setTransactionSuccessful();
      localWorkDatabase.endTransaction();
      reschedulePendingWorkers(val$workManagerImpl);
      return;
    }
    finally
    {
      localWorkDatabase.endTransaction();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.CancelWorkRunnable.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */