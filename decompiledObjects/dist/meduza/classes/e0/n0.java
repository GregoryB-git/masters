package e0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class n0
  extends AnimatorListenerAdapter
{
  public n0(p0 paramp0, View paramView) {}
  
  public final void onAnimationCancel(Animator paramAnimator)
  {
    a.a();
  }
  
  public final void onAnimationEnd(Animator paramAnimator)
  {
    a.c();
  }
  
  public final void onAnimationStart(Animator paramAnimator)
  {
    a.b();
  }
}

/* Location:
 * Qualified Name:     e0.n0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */