package y1;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

public final class e$e
  implements Animation.AnimationListener
{
  public e$e(e parame) {}
  
  public final void onAnimationEnd(Animation paramAnimation)
  {
    paramAnimation = a;
    if (!mScale) {
      paramAnimation.startScaleDownAnimation(null);
    }
  }
  
  public final void onAnimationRepeat(Animation paramAnimation) {}
  
  public final void onAnimationStart(Animation paramAnimation) {}
}

/* Location:
 * Qualified Name:     y1.e.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */