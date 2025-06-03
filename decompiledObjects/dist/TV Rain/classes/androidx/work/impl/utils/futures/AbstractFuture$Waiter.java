package androidx.work.impl.utils.futures;

import androidx.annotation.Nullable;
import java.util.concurrent.locks.LockSupport;

final class AbstractFuture$Waiter
{
  public static final Waiter TOMBSTONE = new Waiter(false);
  @Nullable
  public volatile Waiter next;
  @Nullable
  public volatile Thread thread;
  
  public AbstractFuture$Waiter()
  {
    AbstractFuture.ATOMIC_HELPER.putThread(this, Thread.currentThread());
  }
  
  public AbstractFuture$Waiter(boolean paramBoolean) {}
  
  public void setNext(Waiter paramWaiter)
  {
    AbstractFuture.ATOMIC_HELPER.putNext(this, paramWaiter);
  }
  
  public void unpark()
  {
    Thread localThread = thread;
    if (localThread != null)
    {
      thread = null;
      LockSupport.unpark(localThread);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.futures.AbstractFuture.Waiter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */