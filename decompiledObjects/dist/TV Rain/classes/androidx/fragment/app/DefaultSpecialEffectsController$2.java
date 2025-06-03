package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

class DefaultSpecialEffectsController$2
  extends AnimatorListenerAdapter
{
  public DefaultSpecialEffectsController$2(DefaultSpecialEffectsController paramDefaultSpecialEffectsController, ViewGroup paramViewGroup, View paramView, boolean paramBoolean, SpecialEffectsController.Operation paramOperation, DefaultSpecialEffectsController.AnimationInfo paramAnimationInfo) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    val$container.endViewTransition(val$viewToAnimate);
    if (val$isHideOperation) {
      val$operation.getFinalState().applyState(val$viewToAnimate);
    }
    val$animationInfo.completeSpecialEffect();
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.DefaultSpecialEffectsController.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */