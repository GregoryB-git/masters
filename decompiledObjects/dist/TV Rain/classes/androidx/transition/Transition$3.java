package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class Transition$3
  extends AnimatorListenerAdapter
{
  public Transition$3(Transition paramTransition) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    this$0.end();
    paramAnimator.removeListener(this);
  }
}

/* Location:
 * Qualified Name:     androidx.transition.Transition.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */