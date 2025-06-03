package com.devbrackets.android.exomedia.ui.widget;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.TranslateAnimation;

public class VideoControlsLeanback$RippleTranslateAnimation
  extends TranslateAnimation
  implements Animation.AnimationListener
{
  public static final long DURATION = 250L;
  public int xDelta;
  
  public VideoControlsLeanback$RippleTranslateAnimation(VideoControlsLeanback paramVideoControlsLeanback, int paramInt)
  {
    super(0.0F, paramInt, 0.0F, 0.0F);
    xDelta = paramInt;
    setDuration(250L);
    setAnimationListener(this);
  }
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    paramAnimation = this$0.rippleIndicator;
    paramAnimation.setX(paramAnimation.getX() + xDelta);
    this$0.rippleIndicator.clearAnimation();
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.ui.widget.VideoControlsLeanback.RippleTranslateAnimation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */