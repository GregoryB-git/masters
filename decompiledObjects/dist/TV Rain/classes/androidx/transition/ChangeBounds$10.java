package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;

class ChangeBounds$10
  extends AnimatorListenerAdapter
{
  public ChangeBounds$10(ChangeBounds paramChangeBounds, ViewGroup paramViewGroup, BitmapDrawable paramBitmapDrawable, View paramView, float paramFloat) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    ViewUtils.getOverlay(val$sceneRoot).remove(val$drawable);
    ViewUtils.setTransitionAlpha(val$view, val$transitionAlpha);
  }
}

/* Location:
 * Qualified Name:     androidx.transition.ChangeBounds.10
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */