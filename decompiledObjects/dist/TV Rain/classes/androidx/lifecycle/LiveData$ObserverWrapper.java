package androidx.lifecycle;

abstract class LiveData$ObserverWrapper
{
  public boolean mActive;
  public int mLastVersion = -1;
  public final Observer<? super T> mObserver;
  
  public LiveData$ObserverWrapper(Observer<? super T> paramObserver)
  {
    Observer localObserver;
    mObserver = localObserver;
  }
  
  public void activeStateChanged(boolean paramBoolean)
  {
    if (paramBoolean == mActive) {
      return;
    }
    mActive = paramBoolean;
    LiveData localLiveData = this$0;
    int i;
    if (paramBoolean) {
      i = 1;
    } else {
      i = -1;
    }
    localLiveData.changeActiveCounter(i);
    if (mActive) {
      this$0.dispatchingValue(this);
    }
  }
  
  public void detachObserver() {}
  
  public boolean isAttachedTo(LifecycleOwner paramLifecycleOwner)
  {
    return false;
  }
  
  public abstract boolean shouldBeActive();
}

/* Location:
 * Qualified Name:     androidx.lifecycle.LiveData.ObserverWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */