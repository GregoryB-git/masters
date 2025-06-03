package androidx.work.impl.utils.futures;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

final class AbstractFuture$SafeAtomicHelper
  extends AbstractFuture.AtomicHelper
{
  public final AtomicReferenceFieldUpdater<AbstractFuture, AbstractFuture.Listener> listenersUpdater;
  public final AtomicReferenceFieldUpdater<AbstractFuture, Object> valueUpdater;
  public final AtomicReferenceFieldUpdater<AbstractFuture.Waiter, AbstractFuture.Waiter> waiterNextUpdater;
  public final AtomicReferenceFieldUpdater<AbstractFuture.Waiter, Thread> waiterThreadUpdater;
  public final AtomicReferenceFieldUpdater<AbstractFuture, AbstractFuture.Waiter> waitersUpdater;
  
  public AbstractFuture$SafeAtomicHelper(AtomicReferenceFieldUpdater<AbstractFuture.Waiter, Thread> paramAtomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<AbstractFuture.Waiter, AbstractFuture.Waiter> paramAtomicReferenceFieldUpdater1, AtomicReferenceFieldUpdater<AbstractFuture, AbstractFuture.Waiter> paramAtomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractFuture, AbstractFuture.Listener> paramAtomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractFuture, Object> paramAtomicReferenceFieldUpdater4)
  {
    super(null);
    waiterThreadUpdater = paramAtomicReferenceFieldUpdater;
    waiterNextUpdater = paramAtomicReferenceFieldUpdater1;
    waitersUpdater = paramAtomicReferenceFieldUpdater2;
    listenersUpdater = paramAtomicReferenceFieldUpdater3;
    valueUpdater = paramAtomicReferenceFieldUpdater4;
  }
  
  public boolean casListeners(AbstractFuture<?> paramAbstractFuture, AbstractFuture.Listener paramListener1, AbstractFuture.Listener paramListener2)
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = listenersUpdater;
    do
    {
      if (localAtomicReferenceFieldUpdater.compareAndSet(paramAbstractFuture, paramListener1, paramListener2))
      {
        bool = true;
        break;
      }
    } while (localAtomicReferenceFieldUpdater.get(paramAbstractFuture) == paramListener1);
    boolean bool = false;
    return bool;
  }
  
  public boolean casValue(AbstractFuture<?> paramAbstractFuture, Object paramObject1, Object paramObject2)
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = valueUpdater;
    do
    {
      if (localAtomicReferenceFieldUpdater.compareAndSet(paramAbstractFuture, paramObject1, paramObject2))
      {
        bool = true;
        break;
      }
    } while (localAtomicReferenceFieldUpdater.get(paramAbstractFuture) == paramObject1);
    boolean bool = false;
    return bool;
  }
  
  public boolean casWaiters(AbstractFuture<?> paramAbstractFuture, AbstractFuture.Waiter paramWaiter1, AbstractFuture.Waiter paramWaiter2)
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = waitersUpdater;
    do
    {
      if (localAtomicReferenceFieldUpdater.compareAndSet(paramAbstractFuture, paramWaiter1, paramWaiter2))
      {
        bool = true;
        break;
      }
    } while (localAtomicReferenceFieldUpdater.get(paramAbstractFuture) == paramWaiter1);
    boolean bool = false;
    return bool;
  }
  
  public void putNext(AbstractFuture.Waiter paramWaiter1, AbstractFuture.Waiter paramWaiter2)
  {
    waiterNextUpdater.lazySet(paramWaiter1, paramWaiter2);
  }
  
  public void putThread(AbstractFuture.Waiter paramWaiter, Thread paramThread)
  {
    waiterThreadUpdater.lazySet(paramWaiter, paramThread);
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.futures.AbstractFuture.SafeAtomicHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */