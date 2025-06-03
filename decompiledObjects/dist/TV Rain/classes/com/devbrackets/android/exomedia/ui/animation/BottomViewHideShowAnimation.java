package com.devbrackets.android.exomedia.ui.animation;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;

public class BottomViewHideShowAnimation
  extends AnimationSet
{
  private View animationView;
  private boolean toVisible;
  
  public BottomViewHideShowAnimation(View paramView, boolean paramBoolean, long paramLong)
  {
    super(false);
    toVisible = paramBoolean;
    animationView = paramView;
    float f1 = 1.0F;
    float f2;
    if (paramBoolean) {
      f2 = 0.0F;
    } else {
      f2 = 1.0F;
    }
    if (!paramBoolean) {
      f1 = 0.0F;
    }
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(f2, f1);
    localAlphaAnimation.setDuration(paramLong);
    int j;
    if (paramBoolean) {
      j = getHideShowDelta(paramView);
    } else {
      j = 0;
    }
    if (!paramBoolean) {
      i = getHideShowDelta(paramView);
    }
    TranslateAnimation localTranslateAnimation = new TranslateAnimation(0.0F, 0.0F, j, i);
    if (paramBoolean) {
      paramView = new LinearOutSlowInInterpolator();
    } else {
      paramView = new FastOutLinearInInterpolator();
    }
    localTranslateAnimation.setInterpolator(paramView);
    localTranslateAnimation.setDuration(paramLong);
    addAnimation(localAlphaAnimation);
    addAnimation(localTranslateAnimation);
    setAnimationListener(new Listener(null));
  }
  
  private int getHideShowDelta(View paramView)
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    ((WindowManager)paramView.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
    return heightPixels - paramView.getTop();
  }
  
  public class Listener
    implements Animation.AnimationListener
  {
    private Listener() {}
    
    public void onAnimationEnd(Animation paramAnimation)
    {
      paramAnimation = BottomViewHideShowAnimation.access$100(BottomViewHideShowAnimation.this);
      int i;
      if (BottomViewHideShowAnimation.access$200(BottomViewHideShowAnimation.this)) {
        i = 0;
      } else {
        i = 8;
      }
      paramAnimation.setVisibility(i);
    }
    
    public void onAnimationRepeat(Animation paramAnimation) {}
    
    public void onAnimationStart(Animation paramAnimation)
    {
      BottomViewHideShowAnimation.access$100(BottomViewHideShowAnimation.this).setVisibility(0);
    }
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.ui.animation.BottomViewHideShowAnimation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */