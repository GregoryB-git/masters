package androidx.core.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import java.util.Collections;
import java.util.List;

class WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$1
  implements ValueAnimator.AnimatorUpdateListener
{
  public WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$1(WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener paramImpl21OnApplyWindowInsetsListener, WindowInsetsAnimationCompat paramWindowInsetsAnimationCompat, WindowInsetsCompat paramWindowInsetsCompat1, WindowInsetsCompat paramWindowInsetsCompat2, int paramInt, View paramView) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    val$anim.setFraction(paramValueAnimator.getAnimatedFraction());
    paramValueAnimator = WindowInsetsAnimationCompat.Impl21.interpolateInsets(val$targetInsets, val$startingInsets, val$anim.getInterpolatedFraction(), val$animationMask);
    List localList = Collections.singletonList(val$anim);
    WindowInsetsAnimationCompat.Impl21.dispatchOnProgress(val$v, paramValueAnimator, localList);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */