package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

class DefaultItemAnimator$6
  extends AnimatorListenerAdapter
{
  public DefaultItemAnimator$6(DefaultItemAnimator paramDefaultItemAnimator, RecyclerView.ViewHolder paramViewHolder, int paramInt1, View paramView, int paramInt2, ViewPropertyAnimator paramViewPropertyAnimator) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    if (val$deltaX != 0) {
      val$view.setTranslationX(0.0F);
    }
    if (val$deltaY != 0) {
      val$view.setTranslationY(0.0F);
    }
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    val$animation.setListener(null);
    this$0.dispatchMoveFinished(val$holder);
    this$0.mMoveAnimations.remove(val$holder);
    this$0.dispatchFinishedWhenDone();
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    this$0.dispatchMoveStarting(val$holder);
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.DefaultItemAnimator.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */