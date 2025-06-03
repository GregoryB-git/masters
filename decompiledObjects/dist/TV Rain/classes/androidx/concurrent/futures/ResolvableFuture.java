package androidx.concurrent.futures;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.ListenableFuture;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class ResolvableFuture<V>
  extends AbstractResolvableFuture<V>
{
  public static <V> ResolvableFuture<V> create()
  {
    return new ResolvableFuture();
  }
  
  public boolean set(@Nullable V paramV)
  {
    return super.set(paramV);
  }
  
  public boolean setException(Throwable paramThrowable)
  {
    return super.setException(paramThrowable);
  }
  
  public boolean setFuture(ListenableFuture<? extends V> paramListenableFuture)
  {
    return super.setFuture(paramListenableFuture);
  }
}

/* Location:
 * Qualified Name:     androidx.concurrent.futures.ResolvableFuture
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */