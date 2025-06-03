package androidx.fragment.app;

import android.animation.Animator;
import android.view.animation.Animation;

class FragmentAnim$AnimationOrAnimator
{
  public final Animation animation;
  public final Animator animator;
  
  public FragmentAnim$AnimationOrAnimator(Animator paramAnimator)
  {
    animation = null;
    animator = paramAnimator;
    if (paramAnimator != null) {
      return;
    }
    throw new IllegalStateException("Animator cannot be null");
  }
  
  public FragmentAnim$AnimationOrAnimator(Animation paramAnimation)
  {
    animation = paramAnimation;
    animator = null;
    if (paramAnimation != null) {
      return;
    }
    throw new IllegalStateException("Animation cannot be null");
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentAnim.AnimationOrAnimator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */