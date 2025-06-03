package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

class FragmentStateAdapter$5
  implements LifecycleEventObserver
{
  public FragmentStateAdapter$5(FragmentStateAdapter paramFragmentStateAdapter, Handler paramHandler, Runnable paramRunnable) {}
  
  public void onStateChanged(@NonNull LifecycleOwner paramLifecycleOwner, @NonNull Lifecycle.Event paramEvent)
  {
    if (paramEvent == Lifecycle.Event.ON_DESTROY)
    {
      val$handler.removeCallbacks(val$runnable);
      paramLifecycleOwner.getLifecycle().removeObserver(this);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager2.adapter.FragmentStateAdapter.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */