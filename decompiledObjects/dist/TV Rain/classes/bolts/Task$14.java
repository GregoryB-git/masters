package bolts;

import java.util.concurrent.CancellationException;

final class Task$14
  implements Runnable
{
  public Task$14(CancellationToken paramCancellationToken, TaskCompletionSource paramTaskCompletionSource, Continuation paramContinuation, Task paramTask) {}
  
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
      localObject = val$continuation.then(val$task);
      val$tcs.setResult(localObject);
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
 * Qualified Name:     bolts.Task.14
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */