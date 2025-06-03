package androidx.core.provider;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

class RequestExecutor$HandlerExecutor
  implements Executor
{
  private final Handler mHandler;
  
  public RequestExecutor$HandlerExecutor(@NonNull Handler paramHandler)
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
 * Qualified Name:     androidx.core.provider.RequestExecutor.HandlerExecutor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */