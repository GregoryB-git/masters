package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

class InAppWebView$5
  implements View.OnTouchListener
{
  public float m_downX;
  public float m_downY;
  
  public InAppWebView$5(InAppWebView paramInAppWebView) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    this$0.gestureDetector.onTouchEvent(paramMotionEvent);
    int i = paramMotionEvent.getAction();
    boolean bool = true;
    if (i == 1) {
      this$0.checkScrollStoppedTask.run();
    }
    if ((this$0.customSettings.disableHorizontalScroll.booleanValue()) && (this$0.customSettings.disableVerticalScroll.booleanValue()))
    {
      if (paramMotionEvent.getAction() != 2) {
        bool = false;
      }
      return bool;
    }
    if ((this$0.customSettings.disableHorizontalScroll.booleanValue()) || (this$0.customSettings.disableVerticalScroll.booleanValue()))
    {
      i = paramMotionEvent.getAction();
      if (i != 0)
      {
        if ((i == 1) || (i == 2) || (i == 3))
        {
          float f1;
          float f2;
          if (this$0.customSettings.disableHorizontalScroll.booleanValue())
          {
            f1 = m_downX;
            f2 = paramMotionEvent.getY();
          }
          else
          {
            f1 = paramMotionEvent.getX();
            f2 = m_downY;
          }
          paramMotionEvent.setLocation(f1, f2);
        }
      }
      else
      {
        m_downX = paramMotionEvent.getX();
        m_downY = paramMotionEvent.getY();
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */