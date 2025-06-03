package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

public class ScrollingTabContainerView$VisibilityAnimListener
  extends AnimatorListenerAdapter
{
  private boolean mCanceled = false;
  private int mFinalVisibility;
  
  public ScrollingTabContainerView$VisibilityAnimListener(ScrollingTabContainerView paramScrollingTabContainerView) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    mCanceled = true;
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    if (mCanceled) {
      return;
    }
    paramAnimator = this$0;
    mVisibilityAnim = null;
    paramAnimator.setVisibility(mFinalVisibility);
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    this$0.setVisibility(0);
    mCanceled = false;
  }
  
  public VisibilityAnimListener withFinalVisibility(ViewPropertyAnimator paramViewPropertyAnimator, int paramInt)
  {
    mFinalVisibility = paramInt;
    this$0.mVisibilityAnim = paramViewPropertyAnimator;
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ScrollingTabContainerView.VisibilityAnimListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */