package com.devbrackets.android.exomedia.ui.widget;

import android.content.Context;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class VideoView$TouchListener
  extends GestureDetector.SimpleOnGestureListener
  implements View.OnTouchListener
{
  public GestureDetector gestureDetector = new GestureDetector(paramContext, this);
  
  public VideoView$TouchListener(VideoView paramVideoView, Context paramContext) {}
  
  public boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
  {
    paramMotionEvent = this$0.videoControls;
    if ((paramMotionEvent != null) && (paramMotionEvent.isVisible())) {
      this$0.videoControls.hide(false);
    } else {
      this$0.showControls();
    }
    return true;
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    gestureDetector.onTouchEvent(paramMotionEvent);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.ui.widget.VideoView.TouchListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */