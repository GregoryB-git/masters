package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

class DefaultItemAnimator$4
  extends AnimatorListenerAdapter
{
  public DefaultItemAnimator$4(DefaultItemAnimator paramDefaultItemAnimator, RecyclerView.ViewHolder paramViewHolder, ViewPropertyAnimator paramViewPropertyAnimator, View paramView) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    val$animation.setListener(null);
    val$view.setAlpha(1.0F);
    this$0.dispatchRemoveFinished(val$holder);
    this$0.mRemoveAnimations.remove(val$holder);
    this$0.dispatchFinishedWhenDone();
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    this$0.dispatchRemoveStarting(val$holder);
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.DefaultItemAnimator.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */