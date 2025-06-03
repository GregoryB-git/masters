package androidx.concurrent.futures;

import androidx.annotation.NonNull;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import z2;

final class CallbackToFutureAdapter$SafeFuture<T>
  implements ListenableFuture<T>
{
  public final WeakReference<CallbackToFutureAdapter.Completer<T>> completerWeakReference;
  private final AbstractResolvableFuture<T> delegate = new AbstractResolvableFuture()
  {
    public String pendingToString()
    {
      CallbackToFutureAdapter.Completer localCompleter = (CallbackToFutureAdapter.Completer)completerWeakReference.get();
      if (localCompleter == null) {
        return "Completer object has been garbage collected, future will fail soon";
      }
      StringBuilder localStringBuilder = z2.t("tag=[");
      localStringBuilder.append(tag);
      localStringBuilder.append("]");
      return localStringBuilder.toString();
    }
  };
  
  public CallbackToFutureAdapter$SafeFuture(CallbackToFutureAdapter.Completer<T> paramCompleter)
  {
    completerWeakReference = new WeakReference(paramCompleter);
  }
  
  public void addListener(@NonNull Runnable paramRunnable, @NonNull Executor paramExecutor)
  {
    delegate.addListener(paramRunnable, paramExecutor);
  }
  
  public boolean cancel(boolean paramBoolean)
  {
    CallbackToFutureAdapter.Completer localCompleter = (CallbackToFutureAdapter.Completer)completerWeakReference.get();
    paramBoolean = delegate.cancel(paramBoolean);
    if ((paramBoolean) && (localCompleter != null)) {
      localCompleter.fireCancellationListeners();
    }
    return paramBoolean;
  }
  
  public boolean cancelWithoutNotifyingCompleter(boolean paramBoolean)
  {
    return delegate.cancel(paramBoolean);
  }
  
  public T get()
    throws InterruptedException, ExecutionException
  {
    return (T)delegate.get();
  }
  
  public T get(long paramLong, @NonNull TimeUnit paramTimeUnit)
    throws InterruptedException, ExecutionException, TimeoutException
  {
    return (T)delegate.get(paramLong, paramTimeUnit);
  }
  
  public boolean isCancelled()
  {
    return delegate.isCancelled();
  }
  
  public boolean isDone()
  {
    return delegate.isDone();
  }
  
  public boolean set(T paramT)
  {
    return delegate.set(paramT);
  }
  
  public boolean setException(Throwable paramThrowable)
  {
    return delegate.setException(paramThrowable);
  }
  
  public String toString()
  {
    return delegate.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.concurrent.futures.CallbackToFutureAdapter.SafeFuture
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */