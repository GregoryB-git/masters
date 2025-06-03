package h;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.drawable.AnimationDrawable;
import i.a;

public final class a$d
  extends a.f
{
  public final ObjectAnimator a;
  public final boolean b;
  
  public a$d(AnimationDrawable paramAnimationDrawable, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = paramAnimationDrawable.getNumberOfFrames();
    int j;
    if (paramBoolean1) {
      j = i - 1;
    } else {
      j = 0;
    }
    if (paramBoolean1) {
      i = 0;
    } else {
      i--;
    }
    a.e locale = new a.e(paramAnimationDrawable, paramBoolean1);
    paramAnimationDrawable = ObjectAnimator.ofInt(paramAnimationDrawable, "currentIndex", new int[] { j, i });
    a.a(paramAnimationDrawable, true);
    paramAnimationDrawable.setDuration(c);
    paramAnimationDrawable.setInterpolator(locale);
    b = paramBoolean2;
    a = paramAnimationDrawable;
  }
  
  public final boolean a()
  {
    return b;
  }
  
  public final void b()
  {
    a.reverse();
  }
  
  public final void c()
  {
    a.start();
  }
  
  public final void d()
  {
    a.cancel();
  }
}

/* Location:
 * Qualified Name:     h.a.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */