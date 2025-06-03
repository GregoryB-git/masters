package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

public final class l0$b
  implements Runnable
{
  public l0$b(l0 paraml0) {}
  
  public final void run()
  {
    l0 locall0 = a;
    locall0.a();
    View localView = d;
    if ((localView.isEnabled()) && (!localView.isLongClickable()) && (locall0.c()))
    {
      localView.getParent().requestDisallowInterceptTouchEvent(true);
      long l = SystemClock.uptimeMillis();
      MotionEvent localMotionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
      localView.onTouchEvent(localMotionEvent);
      localMotionEvent.recycle();
      o = true;
    }
  }
}

/* Location:
 * Qualified Name:     l.l0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */