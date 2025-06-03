package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

public class n$h
  extends AnimatorListenerAdapter
{
  public n$h(n paramn, ViewGroup paramViewGroup, View paramView, Fragment paramFragment) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    a.endViewTransition(b);
    paramAnimator.removeListener(this);
    Fragment localFragment = c;
    paramAnimator = V;
    if ((paramAnimator != null) && (N)) {
      paramAnimator.setVisibility(8);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.n.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */