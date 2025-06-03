package androidx.appcompat.widget;

import android.view.View;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;

class ToolbarWidgetWrapper$2
  extends ViewPropertyAnimatorListenerAdapter
{
  private boolean mCanceled = false;
  
  public ToolbarWidgetWrapper$2(ToolbarWidgetWrapper paramToolbarWidgetWrapper, int paramInt) {}
  
  public void onAnimationCancel(View paramView)
  {
    mCanceled = true;
  }
  
  public void onAnimationEnd(View paramView)
  {
    if (!mCanceled) {
      this$0.mToolbar.setVisibility(val$visibility);
    }
  }
  
  public void onAnimationStart(View paramView)
  {
    this$0.mToolbar.setVisibility(0);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ToolbarWidgetWrapper.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */