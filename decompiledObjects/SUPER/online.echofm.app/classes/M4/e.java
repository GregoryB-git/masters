package M4;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnDrawListener;
import java.util.concurrent.atomic.AtomicReference;

public class e
  implements ViewTreeObserver.OnDrawListener
{
  public final Handler a = new Handler(Looper.getMainLooper());
  public final AtomicReference b;
  public final Runnable c;
  
  public e(View paramView, Runnable paramRunnable)
  {
    b = new AtomicReference(paramView);
    c = paramRunnable;
  }
  
  public static boolean b(View paramView)
  {
    boolean bool;
    if ((paramView.getViewTreeObserver().isAlive()) && (c(paramView))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean c(View paramView)
  {
    return paramView.isAttachedToWindow();
  }
  
  public static void e(View paramView, Runnable paramRunnable)
  {
    paramRunnable = new e(paramView, paramRunnable);
    if ((Build.VERSION.SDK_INT < 26) && (!b(paramView))) {
      paramView.addOnAttachStateChangeListener(new a(paramRunnable));
    } else {
      paramView.getViewTreeObserver().addOnDrawListener(paramRunnable);
    }
  }
  
  public void onDraw()
  {
    View localView = (View)b.getAndSet(null);
    if (localView == null) {
      return;
    }
    localView.getViewTreeObserver().addOnGlobalLayoutListener(new d(this, localView));
    a.postAtFrontOfQueue(c);
  }
  
  public class a
    implements View.OnAttachStateChangeListener
  {
    public a() {}
    
    public void onViewAttachedToWindow(View paramView)
    {
      paramView.getViewTreeObserver().addOnDrawListener(e.this);
      paramView.removeOnAttachStateChangeListener(this);
    }
    
    public void onViewDetachedFromWindow(View paramView)
    {
      paramView.removeOnAttachStateChangeListener(this);
    }
  }
}

/* Location:
 * Qualified Name:     M4.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */