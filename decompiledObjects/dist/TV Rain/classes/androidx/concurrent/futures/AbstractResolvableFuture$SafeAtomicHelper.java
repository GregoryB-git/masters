package androidx.concurrent.futures;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

final class AbstractResolvableFuture$SafeAtomicHelper
  extends AbstractResolvableFuture.AtomicHelper
{
  public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, AbstractResolvableFuture.Listener> listenersUpdater;
  public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> valueUpdater;
  public final AtomicReferenceFieldUpdater<AbstractResolvableFuture.Waiter, AbstractResolvableFuture.Waiter> waiterNextUpdater;
  public final AtomicReferenceFieldUpdater<AbstractResolvableFuture.Waiter, Thread> waiterThreadUpdater;
  public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, AbstractResolvableFuture.Waiter> waitersUpdater;
  
  public AbstractResolvableFuture$SafeAtomicHelper(AtomicReferenceFieldUpdater<AbstractResolvableFuture.Waiter, Thread> paramAtomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<AbstractResolvableFuture.Waiter, AbstractResolvableFuture.Waiter> paramAtomicReferenceFieldUpdater1, AtomicReferenceFieldUpdater<AbstractResolvableFuture, AbstractResolvableFuture.Waiter> paramAtomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractResolvableFuture, AbstractResolvableFuture.Listener> paramAtomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> paramAtomicReferenceFieldUpdater4)
  {
    super(null);
    waiterThreadUpdater = paramAtomicReferenceFieldUpdater;
    waiterNextUpdater = paramAtomicReferenceFieldUpdater1;
    waitersUpdater = paramAtomicReferenceFieldUpdater2;
    listenersUpdater = paramAtomicReferenceFieldUpdater3;
    valueUpdater = paramAtomicReferenceFieldUpdater4;
  }
  
  public boolean casListeners(AbstractResolvableFuture<?> paramAbstractResolvableFuture, AbstractResolvableFuture.Listener paramListener1, AbstractResolvableFuture.Listener paramListener2)
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = listenersUpdater;
    do
    {
      if (localAtomicReferenceFieldUpdater.compareAndSet(paramAbstractResolvableFuture, paramListener1, paramListener2))
      {
        bool = true;
        break;
      }
    } while (localAtomicReferenceFieldUpdater.get(paramAbstractResolvableFuture) == paramListener1);
    boolean bool = false;
    return bool;
  }
  
  public boolean casValue(AbstractResolvableFuture<?> paramAbstractResolvableFuture, Object paramObject1, Object paramObject2)
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = valueUpdater;
    do
    {
      if (localAtomicReferenceFieldUpdater.compareAndSet(paramAbstractResolvableFuture, paramObject1, paramObject2))
      {
        bool = true;
        break;
      }
    } while (localAtomicReferenceFieldUpdater.get(paramAbstractResolvableFuture) == paramObject1);
    boolean bool = false;
    return bool;
  }
  
  public boolean casWaiters(AbstractResolvableFuture<?> paramAbstractResolvableFuture, AbstractResolvableFuture.Waiter paramWaiter1, AbstractResolvableFuture.Waiter paramWaiter2)
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = waitersUpdater;
    do
    {
      if (localAtomicReferenceFieldUpdater.compareAndSet(paramAbstractResolvableFuture, paramWaiter1, paramWaiter2))
      {
        bool = true;
        break;
      }
    } while (localAtomicReferenceFieldUpdater.get(paramAbstractResolvableFuture) == paramWaiter1);
    boolean bool = false;
    return bool;
  }
  
  public void putNext(AbstractResolvableFuture.Waiter paramWaiter1, AbstractResolvableFuture.Waiter paramWaiter2)
  {
    waiterNextUpdater.lazySet(paramWaiter1, paramWaiter2);
  }
  
  public void putThread(AbstractResolvableFuture.Waiter paramWaiter, Thread paramThread)
  {
    waiterThreadUpdater.lazySet(paramWaiter, paramThread);
  }
}

/* Location:
 * Qualified Name:     androidx.concurrent.futures.AbstractResolvableFuture.SafeAtomicHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */