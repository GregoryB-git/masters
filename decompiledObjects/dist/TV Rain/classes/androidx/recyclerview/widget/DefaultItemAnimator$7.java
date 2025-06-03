package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

class DefaultItemAnimator$7
  extends AnimatorListenerAdapter
{
  public DefaultItemAnimator$7(DefaultItemAnimator paramDefaultItemAnimator, DefaultItemAnimator.ChangeInfo paramChangeInfo, ViewPropertyAnimator paramViewPropertyAnimator, View paramView) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    val$oldViewAnim.setListener(null);
    val$view.setAlpha(1.0F);
    val$view.setTranslationX(0.0F);
    val$view.setTranslationY(0.0F);
    this$0.dispatchChangeFinished(val$changeInfo.oldHolder, true);
    this$0.mChangeAnimations.remove(val$changeInfo.oldHolder);
    this$0.dispatchFinishedWhenDone();
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    this$0.dispatchChangeStarting(val$changeInfo.oldHolder, true);
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.DefaultItemAnimator.7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */