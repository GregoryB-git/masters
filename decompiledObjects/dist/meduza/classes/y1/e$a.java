package y1;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

public final class e$a
  implements Animation.AnimationListener
{
  public e$a(e parame) {}
  
  public final void onAnimationEnd(Animation paramAnimation)
  {
    paramAnimation = a;
    if (mRefreshing)
    {
      mProgress.setAlpha(255);
      a.mProgress.start();
      paramAnimation = a;
      if (mNotify)
      {
        paramAnimation = mListener;
        if (paramAnimation != null) {
          paramAnimation.onRefresh();
        }
      }
      paramAnimation = a;
      mCurrentTargetOffsetTop = mCircleView.getTop();
    }
    else
    {
      paramAnimation.reset();
    }
  }
  
  public final void onAnimationRepeat(Animation paramAnimation) {}
  
  public final void onAnimationStart(Animation paramAnimation) {}
}

/* Location:
 * Qualified Name:     y1.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */