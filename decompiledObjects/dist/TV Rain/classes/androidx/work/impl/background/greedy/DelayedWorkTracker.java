package androidx.work.impl.background.greedy;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.RunnableScheduler;
import androidx.work.impl.model.WorkSpec;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class DelayedWorkTracker
{
  public static final String TAG = Logger.tagWithPrefix("DelayedWorkTracker");
  public final GreedyScheduler mGreedyScheduler;
  private final RunnableScheduler mRunnableScheduler;
  private final Map<String, Runnable> mRunnables;
  
  public DelayedWorkTracker(@NonNull GreedyScheduler paramGreedyScheduler, @NonNull RunnableScheduler paramRunnableScheduler)
  {
    mGreedyScheduler = paramGreedyScheduler;
    mRunnableScheduler = paramRunnableScheduler;
    mRunnables = new HashMap();
  }
  
  public void schedule(@NonNull final WorkSpec paramWorkSpec)
  {
    Object localObject = (Runnable)mRunnables.remove(id);
    if (localObject != null) {
      mRunnableScheduler.cancel((Runnable)localObject);
    }
    localObject = new Runnable()
    {
      public void run()
      {
        Logger.get().debug(DelayedWorkTracker.TAG, String.format("Scheduling work %s", new Object[] { paramWorkSpecid }), new Throwable[0]);
        mGreedyScheduler.schedule(new WorkSpec[] { paramWorkSpec });
      }
    };
    mRunnables.put(id, localObject);
    long l1 = System.currentTimeMillis();
    long l2 = paramWorkSpec.calculateNextRunTime();
    mRunnableScheduler.scheduleWithDelay(l2 - l1, (Runnable)localObject);
  }
  
  public void unschedule(@NonNull String paramString)
  {
    paramString = (Runnable)mRunnables.remove(paramString);
    if (paramString != null) {
      mRunnableScheduler.cancel(paramString);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.background.greedy.DelayedWorkTracker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */