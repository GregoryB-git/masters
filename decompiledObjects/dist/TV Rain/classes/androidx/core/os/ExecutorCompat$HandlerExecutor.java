package androidx.core.os;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

class ExecutorCompat$HandlerExecutor
  implements Executor
{
  private final Handler mHandler;
  
  public ExecutorCompat$HandlerExecutor(@NonNull Handler paramHandler)
  {
    mHandler = ((Handler)Preconditions.checkNotNull(paramHandler));
  }
  
  public void execute(@NonNull Runnable paramRunnable)
  {
    if (mHandler.post((Runnable)Preconditions.checkNotNull(paramRunnable))) {
      return;
    }
    paramRunnable = new StringBuilder();
    paramRunnable.append(mHandler);
    paramRunnable.append(" is shutting down");
    throw new RejectedExecutionException(paramRunnable.toString());
  }
}

/* Location:
 * Qualified Name:     androidx.core.os.ExecutorCompat.HandlerExecutor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */