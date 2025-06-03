package androidx.concurrent.futures;

import androidx.annotation.Nullable;
import java.util.concurrent.locks.LockSupport;

final class AbstractResolvableFuture$Waiter
{
  public static final Waiter TOMBSTONE = new Waiter(false);
  @Nullable
  public volatile Waiter next;
  @Nullable
  public volatile Thread thread;
  
  public AbstractResolvableFuture$Waiter()
  {
    AbstractResolvableFuture.ATOMIC_HELPER.putThread(this, Thread.currentThread());
  }
  
  public AbstractResolvableFuture$Waiter(boolean paramBoolean) {}
  
  public void setNext(Waiter paramWaiter)
  {
    AbstractResolvableFuture.ATOMIC_HELPER.putNext(this, paramWaiter);
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
 * Qualified Name:     androidx.concurrent.futures.AbstractResolvableFuture.Waiter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */