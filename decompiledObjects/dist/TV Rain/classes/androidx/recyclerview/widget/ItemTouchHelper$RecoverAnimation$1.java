package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

class ItemTouchHelper$RecoverAnimation$1
  implements ValueAnimator.AnimatorUpdateListener
{
  public ItemTouchHelper$RecoverAnimation$1(ItemTouchHelper.RecoverAnimation paramRecoverAnimation) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    this$0.setFraction(paramValueAnimator.getAnimatedFraction());
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */