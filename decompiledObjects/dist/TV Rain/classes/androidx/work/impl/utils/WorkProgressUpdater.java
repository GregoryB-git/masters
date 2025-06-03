package androidx.work.impl.utils;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.ProgressUpdater;
import androidx.work.WorkInfo.State;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkProgress;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class WorkProgressUpdater
  implements ProgressUpdater
{
  public static final String TAG = Logger.tagWithPrefix("WorkProgressUpdater");
  public final TaskExecutor mTaskExecutor;
  public final WorkDatabase mWorkDatabase;
  
  public WorkProgressUpdater(@NonNull WorkDatabase paramWorkDatabase, @NonNull TaskExecutor paramTaskExecutor)
  {
    mWorkDatabase = paramWorkDatabase;
    mTaskExecutor = paramTaskExecutor;
  }
  
  @NonNull
  public ListenableFuture<Void> updateProgress(@NonNull final Context paramContext, @NonNull final UUID paramUUID, @NonNull final Data paramData)
  {
    paramContext = SettableFuture.create();
    mTaskExecutor.executeOnBackgroundThread(new Runnable()
    {
      public void run()
      {
        Object localObject1 = paramUUID.toString();
        Object localObject3 = Logger.get();
        Object localObject4 = WorkProgressUpdater.TAG;
        ((Logger)localObject3).debug((String)localObject4, String.format("Updating progress for %s (%s)", new Object[] { paramUUID, paramData }), new Throwable[0]);
        mWorkDatabase.beginTransaction();
        try
        {
          localObject3 = mWorkDatabase.workSpecDao().getWorkSpec((String)localObject1);
          if (localObject3 != null)
          {
            if (state == WorkInfo.State.RUNNING)
            {
              localObject4 = new androidx/work/impl/model/WorkProgress;
              ((WorkProgress)localObject4).<init>((String)localObject1, paramData);
              mWorkDatabase.workProgressDao().insert((WorkProgress)localObject4);
            }
            else
            {
              Logger.get().warning((String)localObject4, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", new Object[] { localObject1 }), new Throwable[0]);
            }
            paramContext.set(null);
            mWorkDatabase.setTransactionSuccessful();
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
            paramContext.setException(localThrowable);
            return;
          }
          finally
          {
            mWorkDatabase.endTransaction();
          }
        }
      }
    });
    return paramContext;
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.WorkProgressUpdater
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */