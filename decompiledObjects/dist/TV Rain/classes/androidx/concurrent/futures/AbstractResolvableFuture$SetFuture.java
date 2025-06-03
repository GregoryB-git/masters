package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;

final class AbstractResolvableFuture$SetFuture<V>
  implements Runnable
{
  public final ListenableFuture<? extends V> future;
  public final AbstractResolvableFuture<V> owner;
  
  public AbstractResolvableFuture$SetFuture(AbstractResolvableFuture<V> paramAbstractResolvableFuture, ListenableFuture<? extends V> paramListenableFuture)
  {
    owner = paramAbstractResolvableFuture;
    future = paramListenableFuture;
  }
  
  public void run()
  {
    if (owner.value != this) {
      return;
    }
    Object localObject = AbstractResolvableFuture.getFutureValue(future);
    if (AbstractResolvableFuture.ATOMIC_HELPER.casValue(owner, this, localObject)) {
      AbstractResolvableFuture.complete(owner);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */