package com.facebook.drawee.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.facebook.drawee.drawable.ScalingUtils.InterpolatingScaleType;

class DraweeTransition$1
  implements ValueAnimator.AnimatorUpdateListener
{
  public DraweeTransition$1(DraweeTransition paramDraweeTransition, ScalingUtils.InterpolatingScaleType paramInterpolatingScaleType) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    val$scaleType.setValue(f);
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.view.DraweeTransition.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */