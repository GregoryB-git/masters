package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.drawable.Drawable;
import android.view.View;

public final class d$d
  implements ValueAnimator.AnimatorUpdateListener
{
  public d$d(d paramd) {}
  
  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    int i = (int)(((Float)paramValueAnimator.getAnimatedValue()).floatValue() * 255.0F);
    a.b.setAlpha(i);
    a.c.setAlpha(i);
    a.n.invalidate();
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.d.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */