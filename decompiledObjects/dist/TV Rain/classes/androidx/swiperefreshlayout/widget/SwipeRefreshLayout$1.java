package androidx.swiperefreshlayout.widget;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class SwipeRefreshLayout$1
  implements Animation.AnimationListener
{
  public SwipeRefreshLayout$1(SwipeRefreshLayout paramSwipeRefreshLayout) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    paramAnimation = this$0;
    if (mRefreshing)
    {
      mProgress.setAlpha(255);
      this$0.mProgress.start();
      paramAnimation = this$0;
      if (mNotify)
      {
        paramAnimation = mListener;
        if (paramAnimation != null) {
          paramAnimation.onRefresh();
        }
      }
      paramAnimation = this$0;
      mCurrentTargetOffsetTop = mCircleView.getTop();
    }
    else
    {
      paramAnimation.reset();
    }
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
}

/* Location:
 * Qualified Name:     androidx.swiperefreshlayout.widget.SwipeRefreshLayout.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */