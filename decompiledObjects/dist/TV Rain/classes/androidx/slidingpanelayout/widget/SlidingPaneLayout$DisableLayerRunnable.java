package androidx.slidingpanelayout.widget;

import android.view.View;
import java.util.ArrayList;

class SlidingPaneLayout$DisableLayerRunnable
  implements Runnable
{
  public final View mChildView;
  
  public SlidingPaneLayout$DisableLayerRunnable(SlidingPaneLayout paramSlidingPaneLayout, View paramView)
  {
    mChildView = paramView;
  }
  
  public void run()
  {
    if (mChildView.getParent() == this$0)
    {
      mChildView.setLayerType(0, null);
      this$0.invalidateChildRegion(mChildView);
    }
    this$0.mPostedRunnables.remove(this);
  }
}

/* Location:
 * Qualified Name:     androidx.slidingpanelayout.widget.SlidingPaneLayout.DisableLayerRunnable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */