package androidx.lifecycle;

import androidx.annotation.NonNull;

class FullLifecycleObserverAdapter
  implements LifecycleEventObserver
{
  private final FullLifecycleObserver mFullLifecycleObserver;
  private final LifecycleEventObserver mLifecycleEventObserver;
  
  public FullLifecycleObserverAdapter(FullLifecycleObserver paramFullLifecycleObserver, LifecycleEventObserver paramLifecycleEventObserver)
  {
    mFullLifecycleObserver = paramFullLifecycleObserver;
    mLifecycleEventObserver = paramLifecycleEventObserver;
  }
  
  public void onStateChanged(@NonNull LifecycleOwner paramLifecycleOwner, @NonNull Lifecycle.Event paramEvent)
  {
    switch (1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[paramEvent.ordinal()])
    {
    default: 
      break;
    case 7: 
      throw new IllegalArgumentException("ON_ANY must not been send by anybody");
    case 6: 
      mFullLifecycleObserver.onDestroy(paramLifecycleOwner);
      break;
    case 5: 
      mFullLifecycleObserver.onStop(paramLifecycleOwner);
      break;
    case 4: 
      mFullLifecycleObserver.onPause(paramLifecycleOwner);
      break;
    case 3: 
      mFullLifecycleObserver.onResume(paramLifecycleOwner);
      break;
    case 2: 
      mFullLifecycleObserver.onStart(paramLifecycleOwner);
      break;
    case 1: 
      mFullLifecycleObserver.onCreate(paramLifecycleOwner);
    }
    LifecycleEventObserver localLifecycleEventObserver = mLifecycleEventObserver;
    if (localLifecycleEventObserver != null) {
      localLifecycleEventObserver.onStateChanged(paramLifecycleOwner, paramEvent);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.FullLifecycleObserverAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */