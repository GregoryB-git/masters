package androidx.work.impl.utils;

import androidx.room.RoomDatabase;
import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.WorkInfo.State;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkProgress;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.futures.SettableFuture;
import java.util.UUID;

class WorkProgressUpdater$1
  implements Runnable
{
  public WorkProgressUpdater$1(WorkProgressUpdater paramWorkProgressUpdater, UUID paramUUID, Data paramData, SettableFuture paramSettableFuture) {}
  
  public void run()
  {
    Object localObject1 = val$id.toString();
    Object localObject3 = Logger.get();
    Object localObject4 = WorkProgressUpdater.TAG;
    ((Logger)localObject3).debug((String)localObject4, String.format("Updating progress for %s (%s)", new Object[] { val$id, val$data }), new Throwable[0]);
    this$0.mWorkDatabase.beginTransaction();
    try
    {
      localObject3 = this$0.mWorkDatabase.workSpecDao().getWorkSpec((String)localObject1);
      if (localObject3 != null)
      {
        if (state == WorkInfo.State.RUNNING)
        {
          localObject4 = new androidx/work/impl/model/WorkProgress;
          ((WorkProgress)localObject4).<init>((String)localObject1, val$data);
          this$0.mWorkDatabase.workProgressDao().insert((WorkProgress)localObject4);
        }
        else
        {
          Logger.get().warning((String)localObject4, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", new Object[] { localObject1 }), new Throwable[0]);
        }
        val$future.set(null);
        this$0.mWorkDatabase.setTransactionSuccessful();
      }
      else
      {
        localObject1 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject1).<init>("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        throw ((Throwable)localObject1);
      }
    }
    finally
    {
      try
      {
        Logger.get().error(WorkProgressUpdater.TAG, "Error updating Worker progress", new Throwable[] { localThrowable });
        val$future.setException(localThrowable);
        return;
      }
      finally
      {
        this$0.mWorkDatabase.endTransaction();
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.WorkProgressUpdater.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */