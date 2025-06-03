package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.CancellationSignal;

class FragmentAnim$3
  extends AnimatorListenerAdapter
{
  public FragmentAnim$3(ViewGroup paramViewGroup, View paramView, Fragment paramFragment, FragmentTransition.Callback paramCallback, CancellationSignal paramCancellationSignal) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    val$container.endViewTransition(val$viewToAnimate);
    paramAnimator = val$fragment.getAnimator();
    val$fragment.setAnimator(null);
    if ((paramAnimator != null) && (val$container.indexOfChild(val$viewToAnimate) < 0)) {
      val$callback.onComplete(val$fragment, val$signal);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentAnim.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */