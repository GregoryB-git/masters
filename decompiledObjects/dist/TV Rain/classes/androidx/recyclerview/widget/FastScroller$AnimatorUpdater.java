package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.drawable.Drawable;

class FastScroller$AnimatorUpdater
  implements ValueAnimator.AnimatorUpdateListener
{
  public FastScroller$AnimatorUpdater(FastScroller paramFastScroller) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    int i = (int)(((Float)paramValueAnimator.getAnimatedValue()).floatValue() * 255.0F);
    this$0.mVerticalThumbDrawable.setAlpha(i);
    this$0.mVerticalTrackDrawable.setAlpha(i);
    this$0.requestRedraw();
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.FastScroller.AnimatorUpdater
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */