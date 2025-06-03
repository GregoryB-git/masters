package androidx.appcompat.widget;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.PopupWindow;

class ListPopupWindow$PopupTouchInterceptor
  implements View.OnTouchListener
{
  public ListPopupWindow$PopupTouchInterceptor(ListPopupWindow paramListPopupWindow) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    int j = (int)paramMotionEvent.getX();
    int k = (int)paramMotionEvent.getY();
    if (i == 0)
    {
      paramView = this$0.mPopup;
      if ((paramView != null) && (paramView.isShowing()) && (j >= 0) && (j < this$0.mPopup.getWidth()) && (k >= 0) && (k < this$0.mPopup.getHeight()))
      {
        paramView = this$0;
        mHandler.postDelayed(mResizePopupRunnable, 250L);
        break label126;
      }
    }
    if (i == 1)
    {
      paramView = this$0;
      mHandler.removeCallbacks(mResizePopupRunnable);
    }
    label126:
    return false;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ListPopupWindow.PopupTouchInterceptor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */