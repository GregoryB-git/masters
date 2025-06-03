package androidx.work.impl.utils.futures;

import com.google.common.util.concurrent.ListenableFuture;

final class AbstractFuture$SetFuture<V>
  implements Runnable
{
  public final ListenableFuture<? extends V> future;
  public final AbstractFuture<V> owner;
  
  public AbstractFuture$SetFuture(AbstractFuture<V> paramAbstractFuture, ListenableFuture<? extends V> paramListenableFuture)
  {
    owner = paramAbstractFuture;
    future = paramListenableFuture;
  }
  
  public void run()
  {
    if (owner.value != this) {
      return;
    }
    Object localObject = AbstractFuture.getFutureValue(future);
    if (AbstractFuture.ATOMIC_HELPER.casValue(owner, this, localObject)) {
      AbstractFuture.complete(owner);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.futures.AbstractFuture.SetFuture
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */