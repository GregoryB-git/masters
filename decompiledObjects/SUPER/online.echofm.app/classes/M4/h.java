package M4;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.concurrent.atomic.AtomicReference;

public class h
  implements ViewTreeObserver.OnPreDrawListener
{
  public final Handler o = new Handler(Looper.getMainLooper());
  public final AtomicReference p;
  public final Runnable q;
  public final Runnable r;
  
  public h(View paramView, Runnable paramRunnable1, Runnable paramRunnable2)
  {
    p = new AtomicReference(paramView);
    q = paramRunnable1;
    r = paramRunnable2;
  }
  
  public static void a(View paramView, Runnable paramRunnable1, Runnable paramRunnable2)
  {
    paramRunnable1 = new h(paramView, paramRunnable1, paramRunnable2);
    paramView.getViewTreeObserver().addOnPreDrawListener(paramRunnable1);
  }
  
  public boolean onPreDraw()
  {
    View localView = (View)p.getAndSet(null);
    if (localView == null) {
      return true;
    }
    localView.getViewTreeObserver().removeOnPreDrawListener(this);
    o.post(q);
    o.postAtFrontOfQueue(r);
    return true;
  }
}

/* Location:
 * Qualified Name:     M4.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */