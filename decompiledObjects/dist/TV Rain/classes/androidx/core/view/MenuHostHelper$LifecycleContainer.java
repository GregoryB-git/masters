package androidx.core.view;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;

class MenuHostHelper$LifecycleContainer
{
  public final Lifecycle mLifecycle;
  private LifecycleEventObserver mObserver;
  
  public MenuHostHelper$LifecycleContainer(@NonNull Lifecycle paramLifecycle, @NonNull LifecycleEventObserver paramLifecycleEventObserver)
  {
    mLifecycle = paramLifecycle;
    mObserver = paramLifecycleEventObserver;
    paramLifecycle.addObserver(paramLifecycleEventObserver);
  }
  
  public void clearObservers()
  {
    mLifecycle.removeObserver(mObserver);
    mObserver = null;
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.MenuHostHelper.LifecycleContainer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */