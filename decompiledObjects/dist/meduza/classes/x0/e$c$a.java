package x0;

import a0.j;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import ec.i;
import f;

public final class e$c$a
  extends AnimatorListenerAdapter
{
  public e$c$a(ViewGroup paramViewGroup, View paramView, boolean paramBoolean, r0.c paramc, e.c paramc1) {}
  
  public final void onAnimationEnd(Animator paramAnimator)
  {
    i.e(paramAnimator, "anim");
    a.endViewTransition(b);
    if (c)
    {
      int i = d.a;
      paramAnimator = b;
      i.d(paramAnimator, "viewToAnimate");
      j.a(i, paramAnimator, a);
    }
    paramAnimator = e;
    c.a.c(paramAnimator);
    if (y.L(2))
    {
      paramAnimator = f.l("Animator from operation ");
      paramAnimator.append(d);
      paramAnimator.append(" has ended.");
      Log.v("FragmentManager", paramAnimator.toString());
    }
  }
}

/* Location:
 * Qualified Name:     x0.e.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */