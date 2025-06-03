package androidx.lifecycle;

import androidx.annotation.NonNull;

class LiveData$LifecycleBoundObserver
  extends LiveData<T>.ObserverWrapper
  implements LifecycleEventObserver
{
  @NonNull
  public final LifecycleOwner mOwner;
  
  public LiveData$LifecycleBoundObserver(@NonNull LifecycleOwner paramLifecycleOwner, Observer<? super T> paramObserver)
  {
    super(paramLifecycleOwner, localObserver);
    mOwner = paramObserver;
  }
  
  public void detachObserver()
  {
    mOwner.getLifecycle().removeObserver(this);
  }
  
  public boolean isAttachedTo(LifecycleOwner paramLifecycleOwner)
  {
    boolean bool;
    if (mOwner == paramLifecycleOwner) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void onStateChanged(@NonNull LifecycleOwner paramLifecycleOwner, @NonNull Lifecycle.Event paramEvent)
  {
    paramLifecycleOwner = mOwner.getLifecycle().getCurrentState();
    if (paramLifecycleOwner == Lifecycle.State.DESTROYED)
    {
      this$0.removeObserver(mObserver);
      return;
    }
    paramEvent = null;
    while (paramEvent != paramLifecycleOwner)
    {
      activeStateChanged(shouldBeActive());
      Lifecycle.State localState = mOwner.getLifecycle().getCurrentState();
      paramEvent = paramLifecycleOwner;
      paramLifecycleOwner = localState;
    }
  }
  
  public boolean shouldBeActive()
  {
    return mOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED);
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.LiveData.LifecycleBoundObserver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */