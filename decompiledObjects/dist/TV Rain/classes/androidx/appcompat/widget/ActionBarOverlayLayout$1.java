package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class ActionBarOverlayLayout$1
  extends AnimatorListenerAdapter
{
  public ActionBarOverlayLayout$1(ActionBarOverlayLayout paramActionBarOverlayLayout) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    paramAnimator = this$0;
    mCurrentActionBarTopAnimator = null;
    mAnimatingForFling = false;
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    paramAnimator = this$0;
    mCurrentActionBarTopAnimator = null;
    mAnimatingForFling = false;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActionBarOverlayLayout.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */