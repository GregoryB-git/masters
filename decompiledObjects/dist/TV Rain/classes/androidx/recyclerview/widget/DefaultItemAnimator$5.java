package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

class DefaultItemAnimator$5
  extends AnimatorListenerAdapter
{
  public DefaultItemAnimator$5(DefaultItemAnimator paramDefaultItemAnimator, RecyclerView.ViewHolder paramViewHolder, View paramView, ViewPropertyAnimator paramViewPropertyAnimator) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    val$view.setAlpha(1.0F);
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    val$animation.setListener(null);
    this$0.dispatchAddFinished(val$holder);
    this$0.mAddAnimations.remove(val$holder);
    this$0.dispatchFinishedWhenDone();
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    this$0.dispatchAddStarting(val$holder);
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.DefaultItemAnimator.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */