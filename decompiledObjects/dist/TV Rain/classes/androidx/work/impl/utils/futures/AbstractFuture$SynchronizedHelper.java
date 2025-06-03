package androidx.work.impl.utils.futures;

final class AbstractFuture$SynchronizedHelper
  extends AbstractFuture.AtomicHelper
{
  public AbstractFuture$SynchronizedHelper()
  {
    super(null);
  }
  
  public boolean casListeners(AbstractFuture<?> paramAbstractFuture, AbstractFuture.Listener paramListener1, AbstractFuture.Listener paramListener2)
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
  
  public boolean casValue(AbstractFuture<?> paramAbstractFuture, Object paramObject1, Object paramObject2)
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
  
  public boolean casWaiters(AbstractFuture<?> paramAbstractFuture, AbstractFuture.Waiter paramWaiter1, AbstractFuture.Waiter paramWaiter2)
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
  
  public void putNext(AbstractFuture.Waiter paramWaiter1, AbstractFuture.Waiter paramWaiter2)
  {
    next = paramWaiter2;
  }
  
  public void putThread(AbstractFuture.Waiter paramWaiter, Thread paramThread)
  {
    thread = paramThread;
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.futures.AbstractFuture.SynchronizedHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */