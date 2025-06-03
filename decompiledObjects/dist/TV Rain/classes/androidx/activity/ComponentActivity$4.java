package androidx.activity;

import android.app.Activity;
import androidx.activity.contextaware.ContextAwareHelper;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;

class ComponentActivity$4
  implements LifecycleEventObserver
{
  public ComponentActivity$4(ComponentActivity paramComponentActivity) {}
  
  public void onStateChanged(@NonNull LifecycleOwner paramLifecycleOwner, @NonNull Lifecycle.Event paramEvent)
  {
    if (paramEvent == Lifecycle.Event.ON_DESTROY)
    {
      this$0.mContextAwareHelper.clearAvailableContext();
      if (!this$0.isChangingConfigurations()) {
        this$0.getViewModelStore().clear();
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.activity.ComponentActivity.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */