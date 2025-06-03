package androidx.fragment.app;

import android.view.ViewGroup;

class DefaultSpecialEffectsController$4$1
  implements Runnable
{
  public DefaultSpecialEffectsController$4$1(DefaultSpecialEffectsController.4 param4) {}
  
  public void run()
  {
    DefaultSpecialEffectsController.4 local4 = this$1;
    val$container.endViewTransition(val$viewToAnimate);
    this$1.val$animationInfo.completeSpecialEffect();
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.DefaultSpecialEffectsController.4.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */