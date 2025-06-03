package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.core.view.ViewCompat;

class ChangeClipBounds$1
  extends AnimatorListenerAdapter
{
  public ChangeClipBounds$1(ChangeClipBounds paramChangeClipBounds, View paramView) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    ViewCompat.setClipBounds(val$endView, null);
  }
}

/* Location:
 * Qualified Name:     androidx.transition.ChangeClipBounds.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */