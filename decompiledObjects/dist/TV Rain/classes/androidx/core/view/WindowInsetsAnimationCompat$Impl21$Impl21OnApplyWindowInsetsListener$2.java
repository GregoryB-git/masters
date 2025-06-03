package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

class WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$2
  extends AnimatorListenerAdapter
{
  public WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$2(WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener paramImpl21OnApplyWindowInsetsListener, WindowInsetsAnimationCompat paramWindowInsetsAnimationCompat, View paramView) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    val$anim.setFraction(1.0F);
    WindowInsetsAnimationCompat.Impl21.dispatchOnEnd(val$v, val$anim);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */