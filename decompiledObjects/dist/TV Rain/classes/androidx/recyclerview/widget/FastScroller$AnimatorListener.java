package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

class FastScroller$AnimatorListener
  extends AnimatorListenerAdapter
{
  private boolean mCanceled = false;
  
  public FastScroller$AnimatorListener(FastScroller paramFastScroller) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    mCanceled = true;
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    if (mCanceled)
    {
      mCanceled = false;
      return;
    }
    if (((Float)this$0.mShowHideAnimator.getAnimatedValue()).floatValue() == 0.0F)
    {
      paramAnimator = this$0;
      mAnimationState = 0;
      paramAnimator.setState(0);
    }
    else
    {
      paramAnimator = this$0;
      mAnimationState = 2;
      paramAnimator.requestRedraw();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.FastScroller.AnimatorListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */