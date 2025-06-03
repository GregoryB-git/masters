package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

class ViewPropertyAnimatorCompat$1
  extends AnimatorListenerAdapter
{
  public ViewPropertyAnimatorCompat$1(ViewPropertyAnimatorCompat paramViewPropertyAnimatorCompat, ViewPropertyAnimatorListener paramViewPropertyAnimatorListener, View paramView) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    val$listener.onAnimationCancel(val$view);
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    val$listener.onAnimationEnd(val$view);
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    val$listener.onAnimationStart(val$view);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewPropertyAnimatorCompat.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */