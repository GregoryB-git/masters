package androidx.concurrent.futures;

import androidx.annotation.NonNull;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import z2;

public final class CallbackToFutureAdapter$Completer<T>
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

/* Location:
 * Qualified Name:     androidx.concurrent.futures.CallbackToFutureAdapter.Completer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */