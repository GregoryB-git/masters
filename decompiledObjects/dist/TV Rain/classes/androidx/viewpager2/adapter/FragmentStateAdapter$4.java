package androidx.viewpager2.adapter;

class FragmentStateAdapter$4
  implements Runnable
{
  public FragmentStateAdapter$4(FragmentStateAdapter paramFragmentStateAdapter) {}
  
  public void run()
  {
    FragmentStateAdapter localFragmentStateAdapter = this$0;
    mIsInGracePeriod = false;
    localFragmentStateAdapter.gcFragments();
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager2.adapter.FragmentStateAdapter.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */