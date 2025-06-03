package y1;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.drawable.Drawable;

public final class b
  implements ValueAnimator.AnimatorUpdateListener
{
  public b(d paramd, d.a parama) {}
  
  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    d locald = b;
    paramValueAnimator = a;
    locald.getClass();
    d.c(f, paramValueAnimator);
    b.a(f, a, false);
    b.invalidateSelf();
  }
}

/* Location:
 * Qualified Name:     y1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */