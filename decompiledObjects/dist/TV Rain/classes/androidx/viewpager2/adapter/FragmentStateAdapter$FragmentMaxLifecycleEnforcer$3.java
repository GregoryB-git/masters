package androidx.viewpager2.adapter;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

class FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3
  implements LifecycleEventObserver
{
  public FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3(FragmentStateAdapter.FragmentMaxLifecycleEnforcer paramFragmentMaxLifecycleEnforcer) {}
  
  public void onStateChanged(@NonNull LifecycleOwner paramLifecycleOwner, @NonNull Lifecycle.Event paramEvent)
  {
    this$1.updateFragmentMaxLifecycle(false);
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */