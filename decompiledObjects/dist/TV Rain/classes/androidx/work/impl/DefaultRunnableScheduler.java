package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.HandlerCompat;
import androidx.work.RunnableScheduler;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class DefaultRunnableScheduler
  implements RunnableScheduler
{
  private final Handler mHandler;
  
  public DefaultRunnableScheduler()
  {
    mHandler = HandlerCompat.createAsync(Looper.getMainLooper());
  }
  
  @VisibleForTesting
  public DefaultRunnableScheduler(@NonNull Handler paramHandler)
  {
    mHandler = paramHandler;
  }
  
  public void cancel(@NonNull Runnable paramRunnable)
  {
    mHandler.removeCallbacks(paramRunnable);
  }
  
  @NonNull
  public Handler getHandler()
  {
    return mHandler;
  }
  
  public void scheduleWithDelay(long paramLong, @NonNull Runnable paramRunnable)
  {
    mHandler.postDelayed(paramRunnable, paramLong);
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.DefaultRunnableScheduler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */