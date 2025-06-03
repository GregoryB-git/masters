package com.devbrackets.android.exomedia.ui.widget;

import android.view.View;
import android.view.View.OnFocusChangeListener;

public class VideoControlsLeanback$ButtonFocusChangeListener
  implements View.OnFocusChangeListener
{
  public VideoControlsLeanback$ButtonFocusChangeListener(VideoControlsLeanback paramVideoControlsLeanback) {}
  
  public int getHorizontalDelta(View paramView)
  {
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    int i = arrayOfInt[0];
    this$0.rippleIndicator.getLocationOnScreen(arrayOfInt);
    return i - (this$0.rippleIndicator.getWidth() - paramView.getWidth()) / 2 - arrayOfInt[0];
  }
  
  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    if (!paramBoolean) {
      return;
    }
    int i = getHorizontalDelta(paramView);
    this$0.rippleIndicator.startAnimation(new VideoControlsLeanback.RippleTranslateAnimation(this$0, i));
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.ui.widget.VideoControlsLeanback.ButtonFocusChangeListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */