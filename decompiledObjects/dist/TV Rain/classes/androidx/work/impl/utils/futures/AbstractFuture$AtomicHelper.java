package androidx.work.impl.utils.futures;

abstract class AbstractFuture$AtomicHelper
{
  public abstract boolean casListeners(AbstractFuture<?> paramAbstractFuture, AbstractFuture.Listener paramListener1, AbstractFuture.Listener paramListener2);
  
  public abstract boolean casValue(AbstractFuture<?> paramAbstractFuture, Object paramObject1, Object paramObject2);
  
  public abstract boolean casWaiters(AbstractFuture<?> paramAbstractFuture, AbstractFuture.Waiter paramWaiter1, AbstractFuture.Waiter paramWaiter2);
  
  public abstract void putNext(AbstractFuture.Waiter paramWaiter1, AbstractFuture.Waiter paramWaiter2);
  
  public abstract void putThread(AbstractFuture.Waiter paramWaiter, Thread paramThread);
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */