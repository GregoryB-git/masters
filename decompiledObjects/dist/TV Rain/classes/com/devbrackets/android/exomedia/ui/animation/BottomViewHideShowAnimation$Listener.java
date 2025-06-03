package com.devbrackets.android.exomedia.ui.animation;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class BottomViewHideShowAnimation$Listener
  implements Animation.AnimationListener
{
  private BottomViewHideShowAnimation$Listener(BottomViewHideShowAnimation paramBottomViewHideShowAnimation) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    paramAnimation = BottomViewHideShowAnimation.access$100(this$0);
    int i;
    if (BottomViewHideShowAnimation.access$200(this$0)) {
      i = 0;
    } else {
      i = 8;
    }
    paramAnimation.setVisibility(i);
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation)
  {
    BottomViewHideShowAnimation.access$100(this$0).setVisibility(0);
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.ui.animation.BottomViewHideShowAnimation.Listener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */