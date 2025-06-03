package androidx.viewpager.widget;

import android.database.DataSetObserver;

class ViewPager$PagerObserver
  extends DataSetObserver
{
  public ViewPager$PagerObserver(ViewPager paramViewPager) {}
  
  public void onChanged()
  {
    this$0.dataSetChanged();
  }
  
  public void onInvalidated()
  {
    this$0.dataSetChanged();
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager.widget.ViewPager.PagerObserver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */