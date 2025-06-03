package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.os.BuildCompat;
import androidx.work.ForegroundInfo;
import androidx.work.ForegroundUpdater;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.futures.AbstractFuture;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class WorkForegroundRunnable
  implements Runnable
{
  public static final String TAG = Logger.tagWithPrefix("WorkForegroundRunnable");
  public final Context mContext;
  public final ForegroundUpdater mForegroundUpdater;
  public final SettableFuture<Void> mFuture = SettableFuture.create();
  public final TaskExecutor mTaskExecutor;
  public final WorkSpec mWorkSpec;
  public final ListenableWorker mWorker;
  
  @SuppressLint({"LambdaLast"})
  public WorkForegroundRunnable(@NonNull Context paramContext, @NonNull WorkSpec paramWorkSpec, @NonNull ListenableWorker paramListenableWorker, @NonNull ForegroundUpdater paramForegroundUpdater, @NonNull TaskExecutor paramTaskExecutor)
  {
    mContext = paramContext;
    mWorkSpec = paramWorkSpec;
    mWorker = paramListenableWorker;
    mForegroundUpdater = paramForegroundUpdater;
    mTaskExecutor = paramTaskExecutor;
  }
  
  @NonNull
  public ListenableFuture<Void> getFuture()
  {
    return mFuture;
  }
  
  @SuppressLint({"UnsafeExperimentalUsageError"})
  public void run()
  {
    if ((mWorkSpec.expedited) && (!BuildCompat.isAtLeastS()))
    {
      final SettableFuture localSettableFuture = SettableFuture.create();
      mTaskExecutor.getMainThreadExecutor().execute(new Runnable()
      {
        public void run()
        {
          localSettableFuture.setFuture(mWorker.getForegroundInfoAsync());
        }
      });
      localSettableFuture.addListener(new Runnable()
      {
        public void run()
        {
          try
          {
            Object localObject1 = (ForegroundInfo)localSettableFuture.get();
            Object localObject2;
            if (localObject1 != null)
            {
              Logger.get().debug(WorkForegroundRunnable.TAG, String.format("Updating notification for %s", new Object[] { mWorkSpec.workerClassName }), new Throwable[0]);
              mWorker.setRunInForeground(true);
              localObject2 = WorkForegroundRunnable.this;
              mFuture.setFuture(mForegroundUpdater.setForegroundAsync(mContext, mWorker.getId(), (ForegroundInfo)localObject1));
            }
            else
            {
              localObject1 = String.format("Worker was marked important (%s) but did not provide ForegroundInfo", new Object[] { mWorkSpec.workerClassName });
              localObject2 = new java/lang/IllegalStateException;
              ((IllegalStateException)localObject2).<init>((String)localObject1);
              throw ((Throwable)localObject2);
            }
          }
          finally
          {
            mFuture.setException(localThrowable);
          }
        }
      }, mTaskExecutor.getMainThreadExecutor());
      return;
    }
    mFuture.set(null);
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.WorkForegroundRunnable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */