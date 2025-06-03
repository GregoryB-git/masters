package androidx.concurrent.futures;

abstract class AbstractResolvableFuture$AtomicHelper
{
  public abstract boolean casListeners(AbstractResolvableFuture<?> paramAbstractResolvableFuture, AbstractResolvableFuture.Listener paramListener1, AbstractResolvableFuture.Listener paramListener2);
  
  public abstract boolean casValue(AbstractResolvableFuture<?> paramAbstractResolvableFuture, Object paramObject1, Object paramObject2);
  
  public abstract boolean casWaiters(AbstractResolvableFuture<?> paramAbstractResolvableFuture, AbstractResolvableFuture.Waiter paramWaiter1, AbstractResolvableFuture.Waiter paramWaiter2);
  
  public abstract void putNext(AbstractResolvableFuture.Waiter paramWaiter1, AbstractResolvableFuture.Waiter paramWaiter2);
  
  public abstract void putThread(AbstractResolvableFuture.Waiter paramWaiter, Thread paramThread);
}

/* Location:
 * Qualified Name:     androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */