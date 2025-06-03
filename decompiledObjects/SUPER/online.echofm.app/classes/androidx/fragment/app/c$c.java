package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

public class c$c
  extends AnimatorListenerAdapter
{
  public c$c(c paramc, ViewGroup paramViewGroup, View paramView, boolean paramBoolean, B.e parame, c.k paramk) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    a.endViewTransition(b);
    if (c) {
      d.e().c(b);
    }
    e.a();
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.c.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */