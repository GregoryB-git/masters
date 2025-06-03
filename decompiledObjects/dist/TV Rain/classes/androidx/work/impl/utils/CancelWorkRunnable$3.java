package androidx.work.impl.utils;

import androidx.annotation.WorkerThread;
import androidx.room.RoomDatabase;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpecDao;
import java.util.Iterator;
import java.util.List;

class CancelWorkRunnable$3
  extends CancelWorkRunnable
{
  public CancelWorkRunnable$3(WorkManagerImpl paramWorkManagerImpl, String paramString, boolean paramBoolean) {}
  
  @WorkerThread
  public void runInternal()
  {
    WorkDatabase localWorkDatabase = val$workManagerImpl.getWorkDatabase();
    localWorkDatabase.beginTransaction();
    try
    {
      Iterator localIterator = localWorkDatabase.workSpecDao().getUnfinishedWorkWithName(val$name).iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        cancel(val$workManagerImpl, str);
      }
      localWorkDatabase.setTransactionSuccessful();
      localWorkDatabase.endTransaction();
      if (val$allowReschedule) {
        reschedulePendingWorkers(val$workManagerImpl);
      }
      return;
    }
    finally
    {
      localWorkDatabase.endTransaction();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.CancelWorkRunnable.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */