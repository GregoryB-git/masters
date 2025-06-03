package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks;

class FragmentStateAdapter$3
  extends FragmentManager.FragmentLifecycleCallbacks
{
  public FragmentStateAdapter$3(FragmentStateAdapter paramFragmentStateAdapter, Fragment paramFragment, FrameLayout paramFrameLayout) {}
  
  public void onFragmentViewCreated(@NonNull FragmentManager paramFragmentManager, @NonNull Fragment paramFragment, @NonNull View paramView, @Nullable Bundle paramBundle)
  {
    if (paramFragment == val$fragment)
    {
      paramFragmentManager.unregisterFragmentLifecycleCallbacks(this);
      this$0.addViewToContainer(paramView, val$container);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager2.adapter.FragmentStateAdapter.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */