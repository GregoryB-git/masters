package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class DefaultSpecialEffectsController$4
  implements Animation.AnimationListener
{
  public DefaultSpecialEffectsController$4(DefaultSpecialEffectsController paramDefaultSpecialEffectsController, ViewGroup paramViewGroup, View paramView, DefaultSpecialEffectsController.AnimationInfo paramAnimationInfo) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    val$container.post(new Runnable()
    {
      public void run()
      {
        DefaultSpecialEffectsController.4 local4 = DefaultSpecialEffectsController.4.this;
        val$container.endViewTransition(val$viewToAnimate);
        val$animationInfo.completeSpecialEffect();
      }
    });
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
}

/* Location:
 * Qualified Name:     androidx.fragment.app.DefaultSpecialEffectsController.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */