package androidx.work.impl.background.greedy;

import androidx.work.Logger;
import androidx.work.impl.model.WorkSpec;

class DelayedWorkTracker$1
  implements Runnable
{
  public DelayedWorkTracker$1(DelayedWorkTracker paramDelayedWorkTracker, WorkSpec paramWorkSpec) {}
  
  public void run()
  {
    Logger.get().debug(DelayedWorkTracker.TAG, String.format("Scheduling work %s", new Object[] { val$workSpec.id }), new Throwable[0]);
    this$0.mGreedyScheduler.schedule(new WorkSpec[] { val$workSpec });
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.background.greedy.DelayedWorkTracker.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */