package androidx.lifecycle;

class LifecycleRegistry$ObserverWithState
{
  public LifecycleEventObserver mLifecycleObserver;
  public Lifecycle.State mState;
  
  public LifecycleRegistry$ObserverWithState(LifecycleObserver paramLifecycleObserver, Lifecycle.State paramState)
  {
    mLifecycleObserver = Lifecycling.lifecycleEventObserver(paramLifecycleObserver);
    mState = paramState;
  }
  
  public void dispatchEvent(LifecycleOwner paramLifecycleOwner, Lifecycle.Event paramEvent)
  {
    Lifecycle.State localState = paramEvent.getTargetState();
    mState = LifecycleRegistry.min(mState, localState);
    mLifecycleObserver.onStateChanged(paramLifecycleOwner, paramEvent);
    mState = localState;
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.LifecycleRegistry.ObserverWithState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */