package b;

import android.app.Activity;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnDrawListener;
import android.view.Window;

public final class j$j
  implements j.i, ViewTreeObserver.OnDrawListener, Runnable
{
  public final long a = SystemClock.uptimeMillis() + 10000L;
  public Runnable b;
  public boolean c = false;
  
  public j$j(j paramj) {}
  
  public final void c0(View paramView)
  {
    if (!c)
    {
      c = true;
      paramView.getViewTreeObserver().addOnDrawListener(this);
    }
  }
  
  public final void execute(Runnable paramRunnable)
  {
    b = paramRunnable;
    paramRunnable = d.getWindow().getDecorView();
    if (c)
    {
      if (Looper.myLooper() == Looper.getMainLooper()) {
        paramRunnable.invalidate();
      } else {
        paramRunnable.postInvalidate();
      }
    }
    else {
      paramRunnable.postOnAnimation(new d(this, 1));
    }
  }
  
  public final void onDraw()
  {
    ??? = b;
    n localn;
    if (??? != null)
    {
      ((Runnable)???).run();
      b = null;
      localn = d.mFullyDrawnReporter;
    }
    synchronized (b)
    {
      boolean bool = c;
      if (!bool) {
        return;
      }
    }
    c = false;
    d.getWindow().getDecorView().post(this);
  }
  
  public final void run()
  {
    d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
  }
}

/* Location:
 * Qualified Name:     b.j.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */