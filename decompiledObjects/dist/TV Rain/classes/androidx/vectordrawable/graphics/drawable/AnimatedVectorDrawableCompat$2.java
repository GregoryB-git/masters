package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

class AnimatedVectorDrawableCompat$2
  extends AnimatorListenerAdapter
{
  public AnimatedVectorDrawableCompat$2(AnimatedVectorDrawableCompat paramAnimatedVectorDrawableCompat) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    paramAnimator = new ArrayList(this$0.mAnimationCallbacks);
    int i = paramAnimator.size();
    for (int j = 0; j < i; j++) {
      ((Animatable2Compat.AnimationCallback)paramAnimator.get(j)).onAnimationEnd(this$0);
    }
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    paramAnimator = new ArrayList(this$0.mAnimationCallbacks);
    int i = paramAnimator.size();
    for (int j = 0; j < i; j++) {
      ((Animatable2Compat.AnimationCallback)paramAnimator.get(j)).onAnimationStart(this$0);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */