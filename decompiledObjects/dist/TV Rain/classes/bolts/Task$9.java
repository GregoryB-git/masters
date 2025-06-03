package bolts;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

class Task$9
  implements Continuation<Void, Task<Void>>
{
  public Task$9(Task paramTask, CancellationToken paramCancellationToken, Callable paramCallable, Continuation paramContinuation, Executor paramExecutor, Capture paramCapture) {}
  
  public Task<Void> then(Task<Void> paramTask)
    throws Exception
  {
    paramTask = val$ct;
    if ((paramTask != null) && (paramTask.isCancellationRequested())) {
      return Task.cancelled();
    }
    if (((Boolean)val$predicate.call()).booleanValue()) {
      return Task.forResult(null).onSuccessTask(val$continuation, val$executor).onSuccessTask((Continuation)val$predicateContinuation.get(), val$executor);
    }
    return Task.forResult(null);
  }
}

/* Location:
 * Qualified Name:     bolts.Task.9
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */