package bolts;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

final class Task$2
  implements Runnable
{
  public Task$2(ScheduledFuture paramScheduledFuture, TaskCompletionSource paramTaskCompletionSource) {}
  
  public void run()
  {
    val$scheduled.cancel(true);
    val$tcs.trySetCancelled();
  }
}

/* Location:
 * Qualified Name:     bolts.Task.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */