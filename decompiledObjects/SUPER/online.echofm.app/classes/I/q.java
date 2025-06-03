package I;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

public final class q
  implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener
{
  public final View o;
  public ViewTreeObserver p;
  public final Runnable q;
  
  public q(View paramView, Runnable paramRunnable)
  {
    o = paramView;
    p = paramView.getViewTreeObserver();
    q = paramRunnable;
  }
  
  public static q a(View paramView, Runnable paramRunnable)
  {
    if (paramView != null)
    {
      if (paramRunnable != null)
      {
        paramRunnable = new q(paramView, paramRunnable);
        paramView.getViewTreeObserver().addOnPreDrawListener(paramRunnable);
        paramView.addOnAttachStateChangeListener(paramRunnable);
        return paramRunnable;
      }
      throw new NullPointerException("runnable == null");
    }
    throw new NullPointerException("view == null");
  }
  
  public void b()
  {
    if (p.isAlive()) {}
    for (ViewTreeObserver localViewTreeObserver = p;; localViewTreeObserver = o.getViewTreeObserver())
    {
      localViewTreeObserver.removeOnPreDrawListener(this);
      break;
    }
    o.removeOnAttachStateChangeListener(this);
  }
  
  public boolean onPreDraw()
  {
    b();
    q.run();
    return true;
  }
  
  public void onViewAttachedToWindow(View paramView)
  {
    p = paramView.getViewTreeObserver();
  }
  
  public void onViewDetachedFromWindow(View paramView)
  {
    b();
  }
}

/* Location:
 * Qualified Name:     I.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */