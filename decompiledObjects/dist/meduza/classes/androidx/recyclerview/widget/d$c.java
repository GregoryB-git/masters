package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;

public final class d$c
  extends AnimatorListenerAdapter
{
  public boolean a = false;
  
  public d$c(d paramd) {}
  
  public final void onAnimationCancel(Animator paramAnimator)
  {
    a = true;
  }
  
  public final void onAnimationEnd(Animator paramAnimator)
  {
    if (a)
    {
      a = false;
      return;
    }
    if (((Float)b.u.getAnimatedValue()).floatValue() == 0.0F)
    {
      paramAnimator = b;
      v = 0;
      paramAnimator.h(0);
    }
    else
    {
      paramAnimator = b;
      v = 2;
      n.invalidate();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.d.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */