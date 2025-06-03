package androidx.fragment.app;

import E.c;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

public class f$c
  extends AnimatorListenerAdapter
{
  public f$c(ViewGroup paramViewGroup, View paramView, Fragment paramFragment, w.g paramg, c paramc) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    a.endViewTransition(b);
    paramAnimator = c.r();
    c.v1(null);
    if ((paramAnimator != null) && (a.indexOfChild(b) < 0)) {
      d.a(c, e);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.f.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */