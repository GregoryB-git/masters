package l;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.PopupWindow;

public final class n0$f
  implements View.OnTouchListener
{
  public n0$f(n0 paramn0) {}
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    int j = (int)paramMotionEvent.getX();
    int k = (int)paramMotionEvent.getY();
    if (i == 0)
    {
      paramView = a.G;
      if ((paramView != null) && (paramView.isShowing()) && (j >= 0) && (j < a.G.getWidth()) && (k >= 0) && (k < a.G.getHeight()))
      {
        paramView = a;
        C.postDelayed(y, 250L);
        break label126;
      }
    }
    if (i == 1)
    {
      paramView = a;
      C.removeCallbacks(y);
    }
    label126:
    return false;
  }
}

/* Location:
 * Qualified Name:     l.n0.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */