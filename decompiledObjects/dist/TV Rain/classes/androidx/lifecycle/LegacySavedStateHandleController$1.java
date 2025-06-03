package androidx.lifecycle;

import androidx.annotation.NonNull;
import androidx.savedstate.SavedStateRegistry;

class LegacySavedStateHandleController$1
  implements LifecycleEventObserver
{
  public LegacySavedStateHandleController$1(Lifecycle paramLifecycle, SavedStateRegistry paramSavedStateRegistry) {}
  
  public void onStateChanged(@NonNull LifecycleOwner paramLifecycleOwner, @NonNull Lifecycle.Event paramEvent)
  {
    if (paramEvent == Lifecycle.Event.ON_START)
    {
      val$lifecycle.removeObserver(this);
      val$registry.runOnNextRecreation(LegacySavedStateHandleController.OnRecreation.class);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.LegacySavedStateHandleController.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */