package androidx.concurrent.futures;

final class AbstractResolvableFuture$SynchronizedHelper
  extends AbstractResolvableFuture.AtomicHelper
{
  public AbstractResolvableFuture$SynchronizedHelper()
  {
    super(null);
  }
  
  public boolean casListeners(AbstractResolvableFuture<?> paramAbstractResolvableFuture, AbstractResolvableFuture.Listener paramListener1, AbstractResolvableFuture.Listener paramListener2)
  {
    try
    {
      if (listeners == paramListener1)
      {
        listeners = paramListener2;
        return true;
      }
      return false;
    }
    finally {}
  }
  
  public boolean casValue(AbstractResolvableFuture<?> paramAbstractResolvableFuture, Object paramObject1, Object paramObject2)
  {
    try
    {
      if (value == paramObject1)
      {
        value = paramObject2;
        return true;
      }
      return false;
    }
    finally {}
  }
  
  public boolean casWaiters(AbstractResolvableFuture<?> paramAbstractResolvableFuture, AbstractResolvableFuture.Waiter paramWaiter1, AbstractResolvableFuture.Waiter paramWaiter2)
  {
    try
    {
      if (waiters == paramWaiter1)
      {
        waiters = paramWaiter2;
        return true;
      }
      return false;
    }
    finally {}
  }
  
  public void putNext(AbstractResolvableFuture.Waiter paramWaiter1, AbstractResolvableFuture.Waiter paramWaiter2)
  {
    next = paramWaiter2;
  }
  
  public void putThread(AbstractResolvableFuture.Waiter paramWaiter, Thread paramThread)
  {
    thread = paramThread;
  }
}

/* Location:
 * Qualified Name:     androidx.concurrent.futures.AbstractResolvableFuture.SynchronizedHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */