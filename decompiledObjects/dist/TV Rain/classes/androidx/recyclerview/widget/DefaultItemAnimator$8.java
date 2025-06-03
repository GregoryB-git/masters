package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

class DefaultItemAnimator$8
  extends AnimatorListenerAdapter
{
  public DefaultItemAnimator$8(DefaultItemAnimator paramDefaultItemAnimator, DefaultItemAnimator.ChangeInfo paramChangeInfo, ViewPropertyAnimator paramViewPropertyAnimator, View paramView) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    val$newViewAnimation.setListener(null);
    val$newView.setAlpha(1.0F);
    val$newView.setTranslationX(0.0F);
    val$newView.setTranslationY(0.0F);
    this$0.dispatchChangeFinished(val$changeInfo.newHolder, false);
    this$0.mChangeAnimations.remove(val$changeInfo.newHolder);
    this$0.dispatchFinishedWhenDone();
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    this$0.dispatchChangeStarting(val$changeInfo.newHolder, false);
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.DefaultItemAnimator.8
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */