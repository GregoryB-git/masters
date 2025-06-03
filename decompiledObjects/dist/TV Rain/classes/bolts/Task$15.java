package bolts;

import java.util.concurrent.CancellationException;

final class Task$15
  implements Runnable
{
  public Task$15(CancellationToken paramCancellationToken, TaskCompletionSource paramTaskCompletionSource, Continuation paramContinuation, Task paramTask) {}
  
  public void run()
  {
    Object localObject = val$ct;
    if ((localObject != null) && (((CancellationToken)localObject).isCancellationRequested()))
    {
      val$tcs.setCancelled();
      return;
    }
    try
    {
      Task localTask = (Task)val$continuation.then(val$task);
      if (localTask == null)
      {
        val$tcs.setResult(null);
      }
      else
      {
        localObject = new bolts/Task$15$1;
        ((1)localObject).<init>(this);
        localTask.continueWith((Continuation)localObject);
      }
    }
    catch (Exception localException)
    {
      val$tcs.setError(localException);
    }
    catch (CancellationException localCancellationException)
    {
      val$tcs.setCancelled();
    }
  }
}

/* Location:
 * Qualified Name:     bolts.Task.15
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */