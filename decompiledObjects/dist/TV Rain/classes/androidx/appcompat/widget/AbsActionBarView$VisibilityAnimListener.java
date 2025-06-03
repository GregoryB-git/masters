package androidx.appcompat.widget;

import android.view.View;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;

public class AbsActionBarView$VisibilityAnimListener
  implements ViewPropertyAnimatorListener
{
  private boolean mCanceled = false;
  public int mFinalVisibility;
  
  public AbsActionBarView$VisibilityAnimListener(AbsActionBarView paramAbsActionBarView) {}
  
  public void onAnimationCancel(View paramView)
  {
    mCanceled = true;
  }
  
  public void onAnimationEnd(View paramView)
  {
    if (mCanceled) {
      return;
    }
    paramView = this$0;
    mVisibilityAnim = null;
    AbsActionBarView.access$101(paramView, mFinalVisibility);
  }
  
  public void onAnimationStart(View paramView)
  {
    AbsActionBarView.access$001(this$0, 0);
    mCanceled = false;
  }
  
  public VisibilityAnimListener withFinalVisibility(ViewPropertyAnimatorCompat paramViewPropertyAnimatorCompat, int paramInt)
  {
    this$0.mVisibilityAnim = paramViewPropertyAnimatorCompat;
    mFinalVisibility = paramInt;
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AbsActionBarView.VisibilityAnimListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */