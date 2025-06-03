package androidx.work;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;

public abstract interface RunnableScheduler
{
  public abstract void cancel(@NonNull Runnable paramRunnable);
  
  public abstract void scheduleWithDelay(@IntRange(from=0L) long paramLong, @NonNull Runnable paramRunnable);
}

/* Location:
 * Qualified Name:     androidx.work.RunnableScheduler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */