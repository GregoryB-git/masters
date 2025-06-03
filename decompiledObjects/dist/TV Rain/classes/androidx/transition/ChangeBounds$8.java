package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.view.View;
import androidx.core.view.ViewCompat;

class ChangeBounds$8
  extends AnimatorListenerAdapter
{
  private boolean mIsCanceled;
  
  public ChangeBounds$8(ChangeBounds paramChangeBounds, View paramView, Rect paramRect, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    mIsCanceled = true;
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    if (!mIsCanceled)
    {
      ViewCompat.setClipBounds(val$view, val$finalClip);
      ViewUtils.setLeftTopRightBottom(val$view, val$endLeft, val$endTop, val$endRight, val$endBottom);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.transition.ChangeBounds.8
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */