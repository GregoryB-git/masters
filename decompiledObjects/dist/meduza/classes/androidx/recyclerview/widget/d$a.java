package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

public final class d$a
  implements Runnable
{
  public d$a(d paramd) {}
  
  public final void run()
  {
    d locald = a;
    int i = v;
    if (i != 1)
    {
      if (i != 2) {
        return;
      }
    }
    else {
      u.cancel();
    }
    v = 3;
    ValueAnimator localValueAnimator = u;
    localValueAnimator.setFloatValues(new float[] { ((Float)localValueAnimator.getAnimatedValue()).floatValue(), 0.0F });
    u.setDuration('Ǵ');
    u.start();
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */