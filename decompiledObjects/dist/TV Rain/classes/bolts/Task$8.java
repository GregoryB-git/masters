package bolts;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

final class Task$8
  implements Continuation<Object, Void>
{
  public Task$8(Object paramObject, ArrayList paramArrayList, AtomicBoolean paramAtomicBoolean, AtomicInteger paramAtomicInteger, TaskCompletionSource paramTaskCompletionSource) {}
  
  public Void then(Task<Object> paramTask)
  {
    if (paramTask.isFaulted()) {
      synchronized (val$errorLock)
      {
        val$causes.add(paramTask.getError());
      }
    }
    if (paramTask.isCancelled()) {
      val$isCancelled.set(true);
    }
    if (val$count.decrementAndGet() == 0) {
      if (val$causes.size() != 0)
      {
        if (val$causes.size() == 1)
        {
          val$allFinished.setError((Exception)val$causes.get(0));
        }
        else
        {
          paramTask = new AggregateException(String.format("There were %d exceptions.", new Object[] { Integer.valueOf(val$causes.size()) }), val$causes);
          val$allFinished.setError(paramTask);
        }
      }
      else if (val$isCancelled.get()) {
        val$allFinished.setCancelled();
      } else {
        val$allFinished.setResult(null);
      }
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     bolts.Task.8
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */