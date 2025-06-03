package androidx.activity;

import android.app.Activity;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

class ComponentActivity$3
  implements LifecycleEventObserver
{
  public ComponentActivity$3(ComponentActivity paramComponentActivity) {}
  
  public void onStateChanged(@NonNull LifecycleOwner paramLifecycleOwner, @NonNull Lifecycle.Event paramEvent)
  {
    if (paramEvent == Lifecycle.Event.ON_STOP)
    {
      paramLifecycleOwner = this$0.getWindow();
      if (paramLifecycleOwner != null) {
        paramLifecycleOwner = paramLifecycleOwner.peekDecorView();
      } else {
        paramLifecycleOwner = null;
      }
      if (paramLifecycleOwner != null) {
        ComponentActivity.Api19Impl.cancelPendingInputEvents(paramLifecycleOwner);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.activity.ComponentActivity.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */