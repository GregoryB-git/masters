package bolts;

import java.util.concurrent.atomic.AtomicBoolean;

final class Task$5
  implements Continuation<TResult, Void>
{
  public Task$5(AtomicBoolean paramAtomicBoolean, TaskCompletionSource paramTaskCompletionSource) {}
  
  public Void then(Task<TResult> paramTask)
  {
    if (val$isAnyTaskComplete.compareAndSet(false, true)) {
      val$firstCompleted.setResult(paramTask);
    } else {
      paramTask.getError();
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     bolts.Task.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */