package androidx.viewpager2.adapter;

import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback;

class FragmentStateAdapter$FragmentMaxLifecycleEnforcer$1
  extends ViewPager2.OnPageChangeCallback
{
  public FragmentStateAdapter$FragmentMaxLifecycleEnforcer$1(FragmentStateAdapter.FragmentMaxLifecycleEnforcer paramFragmentMaxLifecycleEnforcer) {}
  
  public void onPageScrollStateChanged(int paramInt)
  {
    this$1.updateFragmentMaxLifecycle(false);
  }
  
  public void onPageSelected(int paramInt)
  {
    this$1.updateFragmentMaxLifecycle(false);
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */