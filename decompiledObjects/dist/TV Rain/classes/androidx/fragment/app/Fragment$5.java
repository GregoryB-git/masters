package androidx.fragment.app;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

class Fragment$5
  implements LifecycleEventObserver
{
  public Fragment$5(Fragment paramFragment) {}
  
  public void onStateChanged(@NonNull LifecycleOwner paramLifecycleOwner, @NonNull Lifecycle.Event paramEvent)
  {
    if (paramEvent == Lifecycle.Event.ON_STOP)
    {
      paramLifecycleOwner = this$0.mView;
      if (paramLifecycleOwner != null) {
        paramLifecycleOwner.cancelPendingInputEvents();
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.Fragment.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */