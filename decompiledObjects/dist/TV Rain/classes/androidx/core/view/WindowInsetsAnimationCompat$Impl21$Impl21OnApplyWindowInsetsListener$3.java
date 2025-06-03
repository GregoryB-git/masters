package androidx.core.view;

import android.animation.ValueAnimator;
import android.view.View;

class WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$3
  implements Runnable
{
  public WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$3(WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener paramImpl21OnApplyWindowInsetsListener, View paramView, WindowInsetsAnimationCompat paramWindowInsetsAnimationCompat, WindowInsetsAnimationCompat.BoundsCompat paramBoundsCompat, ValueAnimator paramValueAnimator) {}
  
  public void run()
  {
    WindowInsetsAnimationCompat.Impl21.dispatchOnStart(val$v, val$anim, val$animationBounds);
    val$animator.start();
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */