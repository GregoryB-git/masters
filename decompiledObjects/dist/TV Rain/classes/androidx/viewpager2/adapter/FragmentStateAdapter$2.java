package androidx.viewpager2.adapter;

import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

class FragmentStateAdapter$2
  implements LifecycleEventObserver
{
  public FragmentStateAdapter$2(FragmentStateAdapter paramFragmentStateAdapter, FragmentViewHolder paramFragmentViewHolder) {}
  
  public void onStateChanged(@NonNull LifecycleOwner paramLifecycleOwner, @NonNull Lifecycle.Event paramEvent)
  {
    if (this$0.shouldDelayFragmentTransactions()) {
      return;
    }
    paramLifecycleOwner.getLifecycle().removeObserver(this);
    if (ViewCompat.isAttachedToWindow(val$holder.getContainer())) {
      this$0.placeFragmentInViewHolder(val$holder);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager2.adapter.FragmentStateAdapter.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */