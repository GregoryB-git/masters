package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.core.view.ViewCompat;

class Fade$FadeAnimatorListener
  extends AnimatorListenerAdapter
{
  private boolean mLayerTypeChanged = false;
  private final View mView;
  
  public Fade$FadeAnimatorListener(View paramView)
  {
    mView = paramView;
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    ViewUtils.setTransitionAlpha(mView, 1.0F);
    if (mLayerTypeChanged) {
      mView.setLayerType(0, null);
    }
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    if ((ViewCompat.hasOverlappingRendering(mView)) && (mView.getLayerType() == 0))
    {
      mLayerTypeChanged = true;
      mView.setLayerType(2, null);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.transition.Fade.FadeAnimatorListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */