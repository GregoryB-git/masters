package l;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.PopupWindow;

public class I$f
  implements View.OnTouchListener
{
  public I$f(I paramI) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    int j = (int)paramMotionEvent.getX();
    int k = (int)paramMotionEvent.getY();
    if (i == 0)
    {
      paramView = o.T;
      if ((paramView != null) && (paramView.isShowing()) && (j >= 0) && (j < o.T.getWidth()) && (k >= 0) && (k < o.T.getHeight()))
      {
        paramView = o;
        P.postDelayed(K, 250L);
        break label126;
      }
    }
    if (i == 1)
    {
      paramView = o;
      P.removeCallbacks(K);
    }
    label126:
    return false;
  }
}

/* Location:
 * Qualified Name:     l.I.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */