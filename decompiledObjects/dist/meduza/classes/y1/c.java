package y1;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

public final class c
  implements Animator.AnimatorListener
{
  public c(d paramd, d.a parama) {}
  
  public final void onAnimationCancel(Animator paramAnimator) {}
  
  public final void onAnimationEnd(Animator paramAnimator) {}
  
  public final void onAnimationRepeat(Animator paramAnimator)
  {
    b.a(1.0F, a, true);
    Object localObject = a;
    k = e;
    l = f;
    m = g;
    ((d.a)localObject).a((j + 1) % i.length);
    localObject = b;
    if (f)
    {
      f = false;
      paramAnimator.cancel();
      paramAnimator.setDuration(1332L);
      paramAnimator.start();
      paramAnimator = a;
      if (n) {
        n = false;
      }
    }
    else
    {
      e += 1.0F;
    }
  }
  
  public final void onAnimationStart(Animator paramAnimator)
  {
    b.e = 0.0F;
  }
}

/* Location:
 * Qualified Name:     y1.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */