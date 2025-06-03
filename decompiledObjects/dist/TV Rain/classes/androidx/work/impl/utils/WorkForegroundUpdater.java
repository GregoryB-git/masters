package androidx.work.impl.utils;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.ForegroundInfo;
import androidx.work.ForegroundUpdater;
import androidx.work.Logger;
import androidx.work.WorkInfo.State;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.futures.AbstractFuture;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class WorkForegroundUpdater
  implements ForegroundUpdater
{
  private static final String TAG = Logger.tagWithPrefix("WMFgUpdater");
  public final ForegroundProcessor mForegroundProcessor;
  private final TaskExecutor mTaskExecutor;
  public final WorkSpecDao mWorkSpecDao;
  
  public WorkForegroundUpdater(@NonNull WorkDatabase paramWorkDatabase, @NonNull ForegroundProcessor paramForegroundProcessor, @NonNull TaskExecutor paramTaskExecutor)
  {
    mForegroundProcessor = paramForegroundProcessor;
    mTaskExecutor = paramTaskExecutor;
    mWorkSpecDao = paramWorkDatabase.workSpecDao();
  }
  
  @NonNull
  public ListenableFuture<Void> setForegroundAsync(@NonNull final Context paramContext, @NonNull final UUID paramUUID, @NonNull final ForegroundInfo paramForegroundInfo)
  {
    final SettableFuture localSettableFuture = SettableFuture.create();
    mTaskExecutor.executeOnBackgroundThread(new Runnable()
    {
      public void run()
      {
        try
        {
          if (!localSettableFuture.isCancelled())
          {
            String str = paramUUID.toString();
            Object localObject = mWorkSpecDao.getState(str);
            if ((localObject != null) && (!((WorkInfo.State)localObject).isFinished()))
            {
              mForegroundProcessor.startForeground(str, paramForegroundInfo);
              localObject = SystemForegroundDispatcher.createNotifyIntent(paramContext, str, paramForegroundInfo);
              paramContext.startService((Intent)localObject);
            }
            else
            {
              localObject = new java/lang/IllegalStateException;
              ((IllegalStateException)localObject).<init>("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
              throw ((Throwable)localObject);
            }
          }
        }
        finally
        {
          localSettableFuture.setException(localThrowable);
        }
      }
    });
    return localSettableFuture;
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.WorkForegroundUpdater
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */