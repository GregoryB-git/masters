package x0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import ec.i;
import f;

public final class e$a$a
  implements Animation.AnimationListener
{
  public e$a$a(r0.c paramc, ViewGroup paramViewGroup, View paramView, e.a parama) {}
  
  public final void onAnimationEnd(Animation paramAnimation)
  {
    i.e(paramAnimation, "animation");
    paramAnimation = b;
    paramAnimation.post(new d(paramAnimation, c, d, 0));
    if (y.L(2))
    {
      paramAnimation = f.l("Animation from operation ");
      paramAnimation.append(a);
      paramAnimation.append(" has ended.");
      Log.v("FragmentManager", paramAnimation.toString());
    }
  }
  
  public final void onAnimationRepeat(Animation paramAnimation)
  {
    i.e(paramAnimation, "animation");
  }
  
  public final void onAnimationStart(Animation paramAnimation)
  {
    i.e(paramAnimation, "animation");
    if (y.L(2))
    {
      paramAnimation = f.l("Animation from operation ");
      paramAnimation.append(a);
      paramAnimation.append(" has reached onAnimationStart.");
      Log.v("FragmentManager", paramAnimation.toString());
    }
  }
}

/* Location:
 * Qualified Name:     x0.e.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */