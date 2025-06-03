package androidx.concurrent.futures;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import z2;

public final class CallbackToFutureAdapter
{
  @NonNull
  public static <T> ListenableFuture<T> getFuture(@NonNull Resolver<T> paramResolver)
  {
    Completer localCompleter = new Completer();
    SafeFuture localSafeFuture = new SafeFuture(localCompleter);
    future = localSafeFuture;
    tag = paramResolver.getClass();
    try
    {
      paramResolver = paramResolver.attachCompleter(localCompleter);
      if (paramResolver != null) {
        tag = paramResolver;
      }
    }
    catch (Exception paramResolver)
    {
      localSafeFuture.setException(paramResolver);
    }
    return localSafeFuture;
  }
  
  public static final class Completer<T>
  {
    private boolean attemptedSetting;
    private ResolvableFuture<Void> cancellationFuture = ResolvableFuture.create();
    public CallbackToFutureAdapter.SafeFuture<T> future;
    public Object tag;
    
    private void setCompletedNormally()
    {
      tag = null;
      future = null;
      cancellationFuture = null;
    }
    
    public void addCancellationListener(@NonNull Runnable paramRunnable, @NonNull Executor paramExecutor)
    {
      ResolvableFuture localResolvableFuture = cancellationFuture;
      if (localResolvableFuture != null) {
        localResolvableFuture.addListener(paramRunnable, paramExecutor);
      }
    }
    
    public void finalize()
    {
      Object localObject = future;
      if ((localObject != null) && (!((CallbackToFutureAdapter.SafeFuture)localObject).isDone()))
      {
        StringBuilder localStringBuilder = z2.t("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
        localStringBuilder.append(tag);
        ((CallbackToFutureAdapter.SafeFuture)localObject).setException(new CallbackToFutureAdapter.FutureGarbageCollectedException(localStringBuilder.toString()));
      }
      if (!attemptedSetting)
      {
        localObject = cancellationFuture;
        if (localObject != null) {
          ((ResolvableFuture)localObject).set(null);
        }
      }
    }
    
    public void fireCancellationListeners()
    {
      tag = null;
      future = null;
      cancellationFuture.set(null);
    }
    
    public boolean set(T paramT)
    {
      boolean bool = true;
      attemptedSetting = true;
      CallbackToFutureAdapter.SafeFuture localSafeFuture = future;
      if ((localSafeFuture == null) || (!localSafeFuture.set(paramT))) {
        bool = false;
      }
      if (bool) {
        setCompletedNormally();
      }
      return bool;
    }
    
    public boolean setCancelled()
    {
      boolean bool = true;
      attemptedSetting = true;
      CallbackToFutureAdapter.SafeFuture localSafeFuture = future;
      if ((localSafeFuture == null) || (!localSafeFuture.cancelWithoutNotifyingCompleter(true))) {
        bool = false;
      }
      if (bool) {
        setCompletedNormally();
      }
      return bool;
    }
    
    public boolean setException(@NonNull Throwable paramThrowable)
    {
      boolean bool = true;
      attemptedSetting = true;
      CallbackToFutureAdapter.SafeFuture localSafeFuture = future;
      if ((localSafeFuture == null) || (!localSafeFuture.setException(paramThrowable))) {
        bool = false;
      }
      if (bool) {
        setCompletedNormally();
      }
      return bool;
    }
  }
  
  public static final class FutureGarbageCollectedException
    extends Throwable
  {
    public FutureGarbageCollectedException(String paramString)
    {
      super();
    }
    
    public Throwable fillInStackTrace()
    {
      return this;
    }
  }
  
  public static abstract interface Resolver<T>
  {
    @Nullable
    public abstract Object attachCompleter(@NonNull CallbackToFutureAdapter.Completer<T> paramCompleter)
      throws Exception;
  }
  
  public static final class SafeFuture<T>
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
    
    public SafeFuture(CallbackToFutureAdapter.Completer<T> paramCompleter)
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
}

/* Location:
 * Qualified Name:     androidx.concurrent.futures.CallbackToFutureAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */