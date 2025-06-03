package androidx.work.impl.utils.taskexecutor;

import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.SerialExecutor;
import java.util.concurrent.Executor;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public abstract interface TaskExecutor
{
  public abstract void executeOnBackgroundThread(Runnable paramRunnable);
  
  public abstract SerialExecutor getBackgroundExecutor();
  
  public abstract Executor getMainThreadExecutor();
  
  public abstract void postToMainThread(Runnable paramRunnable);
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.taskexecutor.TaskExecutor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */