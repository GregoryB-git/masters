package bolts;

import java.util.concurrent.atomic.AtomicBoolean;

final class Task$6
  implements Continuation<Object, Void>
{
  public Task$6(AtomicBoolean paramAtomicBoolean, TaskCompletionSource paramTaskCompletionSource) {}
  
  public Void then(Task<Object> paramTask)
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
 * Qualified Name:     bolts.Task.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */