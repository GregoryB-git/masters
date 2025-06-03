package androidx.viewpager2.widget;

class ViewPager2$1
  extends ViewPager2.DataSetChangeObserver
{
  public ViewPager2$1(ViewPager2 paramViewPager2)
  {
    super(null);
  }
  
  public void onChanged()
  {
    ViewPager2 localViewPager2 = this$0;
    mCurrentItemDirty = true;
    mScrollEventAdapter.notifyDataSetChangeHappened();
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager2.widget.ViewPager2.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */