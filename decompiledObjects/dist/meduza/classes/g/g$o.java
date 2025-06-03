package g;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ContentFrameLayout;
import j.c;
import x6.b;

public final class g$o
  extends ContentFrameLayout
{
  public g$o(g paramg, c paramc)
  {
    super(paramc, null);
  }
  
  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    boolean bool;
    if ((!q.L(paramKeyEvent)) && (!super.dispatchKeyEvent(paramKeyEvent))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0)
    {
      int i = (int)paramMotionEvent.getX();
      int j = (int)paramMotionEvent.getY();
      if ((i >= -5) && (j >= -5) && (i <= getWidth() + 5) && (j <= getHeight() + 5)) {
        j = 0;
      } else {
        j = 1;
      }
      if (j != 0)
      {
        paramMotionEvent = q;
        paramMotionEvent.J(paramMotionEvent.R(0), true);
        return true;
      }
    }
    return super.onInterceptTouchEvent(paramMotionEvent);
  }
  
  public final void setBackgroundResource(int paramInt)
  {
    setBackgroundDrawable(b.X(getContext(), paramInt));
  }
}

/* Location:
 * Qualified Name:     g.g.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */