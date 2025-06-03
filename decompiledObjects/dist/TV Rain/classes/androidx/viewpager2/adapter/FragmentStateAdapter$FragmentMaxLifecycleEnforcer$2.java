package androidx.viewpager2.adapter;

class FragmentStateAdapter$FragmentMaxLifecycleEnforcer$2
  extends FragmentStateAdapter.DataSetChangeObserver
{
  public FragmentStateAdapter$FragmentMaxLifecycleEnforcer$2(FragmentStateAdapter.FragmentMaxLifecycleEnforcer paramFragmentMaxLifecycleEnforcer)
  {
    super(null);
  }
  
  public void onChanged()
  {
    this$1.updateFragmentMaxLifecycle(true);
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */