package androidx.activity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable
  implements LifecycleEventObserver, Cancellable
{
  @Nullable
  private Cancellable mCurrentCancellable;
  private final Lifecycle mLifecycle;
  private final OnBackPressedCallback mOnBackPressedCallback;
  
  public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(@NonNull OnBackPressedDispatcher paramOnBackPressedDispatcher, @NonNull Lifecycle paramLifecycle, OnBackPressedCallback paramOnBackPressedCallback)
  {
    mLifecycle = paramLifecycle;
    mOnBackPressedCallback = paramOnBackPressedCallback;
    paramLifecycle.addObserver(this);
  }
  
  public void cancel()
  {
    mLifecycle.removeObserver(this);
    mOnBackPressedCallback.removeCancellable(this);
    Cancellable localCancellable = mCurrentCancellable;
    if (localCancellable != null)
    {
      localCancellable.cancel();
      mCurrentCancellable = null;
    }
  }
  
  public void onStateChanged(@NonNull LifecycleOwner paramLifecycleOwner, @NonNull Lifecycle.Event paramEvent)
  {
    if (paramEvent == Lifecycle.Event.ON_START)
    {
      mCurrentCancellable = this$0.addCancellableCallback(mOnBackPressedCallback);
    }
    else if (paramEvent == Lifecycle.Event.ON_STOP)
    {
      paramLifecycleOwner = mCurrentCancellable;
      if (paramLifecycleOwner != null) {
        paramLifecycleOwner.cancel();
      }
    }
    else if (paramEvent == Lifecycle.Event.ON_DESTROY)
    {
      cancel();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.activity.OnBackPressedDispatcher.LifecycleOnBackPressedCancellable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */