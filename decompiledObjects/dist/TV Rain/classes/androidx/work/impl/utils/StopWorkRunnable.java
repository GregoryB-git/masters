package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.work.Logger;
import androidx.work.WorkInfo.State;
import androidx.work.impl.Processor;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpecDao;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class StopWorkRunnable
  implements Runnable
{
  private static final String TAG = Logger.tagWithPrefix("StopWorkRunnable");
  private final boolean mStopInForeground;
  private final WorkManagerImpl mWorkManagerImpl;
  private final String mWorkSpecId;
  
  public StopWorkRunnable(@NonNull WorkManagerImpl paramWorkManagerImpl, @NonNull String paramString, boolean paramBoolean)
  {
    mWorkManagerImpl = paramWorkManagerImpl;
    mWorkSpecId = paramString;
    mStopInForeground = paramBoolean;
  }
  
  public void run()
  {
    WorkDatabase localWorkDatabase = mWorkManagerImpl.getWorkDatabase();
    Processor localProcessor = mWorkManagerImpl.getProcessor();
    WorkSpecDao localWorkSpecDao = localWorkDatabase.workSpecDao();
    localWorkDatabase.beginTransaction();
    try
    {
      boolean bool = localProcessor.isEnqueuedInForeground(mWorkSpecId);
      if (mStopInForeground)
      {
        bool = mWorkManagerImpl.getProcessor().stopForegroundWork(mWorkSpecId);
      }
      else
      {
        if ((!bool) && (localWorkSpecDao.getState(mWorkSpecId) == WorkInfo.State.RUNNING)) {
          localWorkSpecDao.setState(WorkInfo.State.ENQUEUED, new String[] { mWorkSpecId });
        }
        bool = mWorkManagerImpl.getProcessor().stopWork(mWorkSpecId);
      }
      Logger.get().debug(TAG, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", new Object[] { mWorkSpecId, Boolean.valueOf(bool) }), new Throwable[0]);
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
 * Qualified Name:     androidx.work.impl.utils.StopWorkRunnable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */