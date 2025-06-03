package x0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.animation.Animation;

public final class n
{
  public final Animation a;
  public final AnimatorSet b;
  
  public n(Animator paramAnimator)
  {
    a = null;
    AnimatorSet localAnimatorSet = new AnimatorSet();
    b = localAnimatorSet;
    localAnimatorSet.play(paramAnimator);
  }
  
  public n(Animation paramAnimation)
  {
    a = paramAnimation;
    b = null;
  }
}

/* Location:
 * Qualified Name:     x0.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */