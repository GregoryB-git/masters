package androidx.core.location;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

final class LocationManagerCompat$InlineHandlerExecutor
  implements Executor
{
  private final Handler mHandler;
  
  public LocationManagerCompat$InlineHandlerExecutor(@NonNull Handler paramHandler)
  {
    mHandler = ((Handler)Preconditions.checkNotNull(paramHandler));
  }
  
  public void execute(@NonNull Runnable paramRunnable)
  {
    if (Looper.myLooper() == mHandler.getLooper()) {
      paramRunnable.run();
    } else {
      if (!mHandler.post((Runnable)Preconditions.checkNotNull(paramRunnable))) {
        break label40;
      }
    }
    return;
    label40:
    paramRunnable = new StringBuilder();
    paramRunnable.append(mHandler);
    paramRunnable.append(" is shutting down");
    throw new RejectedExecutionException(paramRunnable.toString());
  }
}

/* Location:
 * Qualified Name:     androidx.core.location.LocationManagerCompat.InlineHandlerExecutor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */