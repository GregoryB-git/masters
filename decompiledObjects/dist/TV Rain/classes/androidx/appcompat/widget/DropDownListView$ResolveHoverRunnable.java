package androidx.appcompat.widget;

import android.view.View;

class DropDownListView$ResolveHoverRunnable
  implements Runnable
{
  public DropDownListView$ResolveHoverRunnable(DropDownListView paramDropDownListView) {}
  
  public void cancel()
  {
    DropDownListView localDropDownListView = this$0;
    mResolveHoverRunnable = null;
    localDropDownListView.removeCallbacks(this);
  }
  
  public void post()
  {
    this$0.post(this);
  }
  
  public void run()
  {
    DropDownListView localDropDownListView = this$0;
    mResolveHoverRunnable = null;
    localDropDownListView.drawableStateChanged();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.DropDownListView.ResolveHoverRunnable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */