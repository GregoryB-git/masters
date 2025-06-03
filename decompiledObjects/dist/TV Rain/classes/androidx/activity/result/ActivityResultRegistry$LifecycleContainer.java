package androidx.activity.result;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import java.util.ArrayList;
import java.util.Iterator;

class ActivityResultRegistry$LifecycleContainer
{
  public final Lifecycle mLifecycle;
  private final ArrayList<LifecycleEventObserver> mObservers;
  
  public ActivityResultRegistry$LifecycleContainer(@NonNull Lifecycle paramLifecycle)
  {
    mLifecycle = paramLifecycle;
    mObservers = new ArrayList();
  }
  
  public void addObserver(@NonNull LifecycleEventObserver paramLifecycleEventObserver)
  {
    mLifecycle.addObserver(paramLifecycleEventObserver);
    mObservers.add(paramLifecycleEventObserver);
  }
  
  public void clearObservers()
  {
    Iterator localIterator = mObservers.iterator();
    while (localIterator.hasNext())
    {
      LifecycleEventObserver localLifecycleEventObserver = (LifecycleEventObserver)localIterator.next();
      mLifecycle.removeObserver(localLifecycleEventObserver);
    }
    mObservers.clear();
  }
}

/* Location:
 * Qualified Name:     androidx.activity.result.ActivityResultRegistry.LifecycleContainer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */