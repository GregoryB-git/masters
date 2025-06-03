package bolts;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;

final class Task$4
  implements Runnable
{
  public Task$4(CancellationToken paramCancellationToken, TaskCompletionSource paramTaskCompletionSource, Callable paramCallable) {}
  
  public void run()
  {
    CancellationToken localCancellationToken = val$ct;
    if ((localCancellationToken != null) && (localCancellationToken.isCancellationRequested()))
    {
      val$tcs.setCancelled();
      return;
    }
    try
    {
      val$tcs.setResult(val$callable.call());
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
 * Qualified Name:     bolts.Task.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */