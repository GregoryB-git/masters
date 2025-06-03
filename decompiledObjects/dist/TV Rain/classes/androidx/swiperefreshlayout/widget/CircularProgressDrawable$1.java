package androidx.swiperefreshlayout.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.drawable.Drawable;

class CircularProgressDrawable$1
  implements ValueAnimator.AnimatorUpdateListener
{
  public CircularProgressDrawable$1(CircularProgressDrawable paramCircularProgressDrawable, CircularProgressDrawable.Ring paramRing) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    this$0.updateRingColor(f, val$ring);
    this$0.applyTransformation(f, val$ring, false);
    this$0.invalidateSelf();
  }
}

/* Location:
 * Qualified Name:     androidx.swiperefreshlayout.widget.CircularProgressDrawable.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */