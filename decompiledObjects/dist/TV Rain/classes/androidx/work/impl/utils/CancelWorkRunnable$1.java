package androidx.work.impl.utils;

import androidx.annotation.WorkerThread;
import androidx.room.RoomDatabase;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import java.util.UUID;

class CancelWorkRunnable$1
  extends CancelWorkRunnable
{
  public CancelWorkRunnable$1(WorkManagerImpl paramWorkManagerImpl, UUID paramUUID) {}
  
  @WorkerThread
  public void runInternal()
  {
    WorkDatabase localWorkDatabase = val$workManagerImpl.getWorkDatabase();
    localWorkDatabase.beginTransaction();
    try
    {
      cancel(val$workManagerImpl, val$id.toString());
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
 * Qualified Name:     androidx.work.impl.utils.CancelWorkRunnable.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */