package e0;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

public final class w
  implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener
{
  public final View a;
  public ViewTreeObserver b;
  public final Runnable c;
  
  public w(View paramView, Runnable paramRunnable)
  {
    a = paramView;
    b = paramView.getViewTreeObserver();
    c = paramRunnable;
  }
  
  public static void a(View paramView, Runnable paramRunnable)
  {
    if (paramView != null)
    {
      if (paramRunnable != null)
      {
        paramRunnable = new w(paramView, paramRunnable);
        paramView.getViewTreeObserver().addOnPreDrawListener(paramRunnable);
        paramView.addOnAttachStateChangeListener(paramRunnable);
        return;
      }
      throw new NullPointerException("runnable == null");
    }
    throw new NullPointerException("view == null");
  }
  
  public final boolean onPreDraw()
  {
    ViewTreeObserver localViewTreeObserver;
    if (b.isAlive()) {
      localViewTreeObserver = b;
    } else {
      localViewTreeObserver = a.getViewTreeObserver();
    }
    localViewTreeObserver.removeOnPreDrawListener(this);
    a.removeOnAttachStateChangeListener(this);
    c.run();
    return true;
  }
  
  public final void onViewAttachedToWindow(View paramView)
  {
    b = paramView.getViewTreeObserver();
  }
  
  public final void onViewDetachedFromWindow(View paramView)
  {
    if (b.isAlive()) {
      paramView = b;
    } else {
      paramView = a.getViewTreeObserver();
    }
    paramView.removeOnPreDrawListener(this);
    a.removeOnAttachStateChangeListener(this);
  }
}

/* Location:
 * Qualified Name:     e0.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */