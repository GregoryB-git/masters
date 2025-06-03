package androidx.activity;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

class ComponentActivity$5
  implements LifecycleEventObserver
{
  public ComponentActivity$5(ComponentActivity paramComponentActivity) {}
  
  public void onStateChanged(@NonNull LifecycleOwner paramLifecycleOwner, @NonNull Lifecycle.Event paramEvent)
  {
    this$0.ensureViewModelStore();
    this$0.getLifecycle().removeObserver(this);
  }
}

/* Location:
 * Qualified Name:     androidx.activity.ComponentActivity.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */