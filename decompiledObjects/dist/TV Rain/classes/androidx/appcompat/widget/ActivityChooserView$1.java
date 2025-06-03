package androidx.appcompat.widget;

import android.database.DataSetObserver;
import android.widget.BaseAdapter;

class ActivityChooserView$1
  extends DataSetObserver
{
  public ActivityChooserView$1(ActivityChooserView paramActivityChooserView) {}
  
  public void onChanged()
  {
    super.onChanged();
    this$0.mAdapter.notifyDataSetChanged();
  }
  
  public void onInvalidated()
  {
    super.onInvalidated();
    this$0.mAdapter.notifyDataSetInvalidated();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActivityChooserView.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */