package androidx.fragment.app;

import android.animation.Animator;
import androidx.core.os.CancellationSignal.OnCancelListener;

class DefaultSpecialEffectsController$3
  implements CancellationSignal.OnCancelListener
{
  public DefaultSpecialEffectsController$3(DefaultSpecialEffectsController paramDefaultSpecialEffectsController, Animator paramAnimator) {}
  
  public void onCancel()
  {
    val$animator.end();
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.DefaultSpecialEffectsController.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */