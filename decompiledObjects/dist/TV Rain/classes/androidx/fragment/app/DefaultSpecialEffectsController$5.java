package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.CancellationSignal.OnCancelListener;

class DefaultSpecialEffectsController$5
  implements CancellationSignal.OnCancelListener
{
  public DefaultSpecialEffectsController$5(DefaultSpecialEffectsController paramDefaultSpecialEffectsController, View paramView, ViewGroup paramViewGroup, DefaultSpecialEffectsController.AnimationInfo paramAnimationInfo) {}
  
  public void onCancel()
  {
    val$viewToAnimate.clearAnimation();
    val$container.endViewTransition(val$viewToAnimate);
    val$animationInfo.completeSpecialEffect();
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.DefaultSpecialEffectsController.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */