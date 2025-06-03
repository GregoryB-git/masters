package androidx.work.impl.utils.taskexecutor;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.SerialExecutor;
import java.util.concurrent.Executor;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class WorkManagerTaskExecutor
  implements TaskExecutor
{
  private final SerialExecutor mBackgroundExecutor;
  private final Executor mMainThreadExecutor = new Executor()
  {
    public void execute(@NonNull Runnable paramAnonymousRunnable)
    {
      postToMainThread(paramAnonymousRunnable);
    }
  };
  private final Handler mMainThreadHandler = new Handler(Looper.getMainLooper());
  
  public WorkManagerTaskExecutor(@NonNull Executor paramExecutor)
  {
    mBackgroundExecutor = new SerialExecutor(paramExecutor);
  }
  
  public void executeOnBackgroundThread(Runnable paramRunnable)
  {
    mBackgroundExecutor.execute(paramRunnable);
  }
  
  @NonNull
  public SerialExecutor getBackgroundExecutor()
  {
    return mBackgroundExecutor;
  }
  
  public Executor getMainThreadExecutor()
  {
    return mMainThreadExecutor;
  }
  
  public void postToMainThread(Runnable paramRunnable)
  {
    mMainThreadHandler.post(paramRunnable);
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */