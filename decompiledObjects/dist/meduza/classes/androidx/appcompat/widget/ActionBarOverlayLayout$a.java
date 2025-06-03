package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class ActionBarOverlayLayout$a
  extends AnimatorListenerAdapter
{
  public ActionBarOverlayLayout$a(ActionBarOverlayLayout paramActionBarOverlayLayout) {}
  
  public final void onAnimationCancel(Animator paramAnimator)
  {
    paramAnimator = a;
    E = null;
    s = false;
  }
  
  public final void onAnimationEnd(Animator paramAnimator)
  {
    paramAnimator = a;
    E = null;
    s = false;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActionBarOverlayLayout.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */