package androidx.appcompat.view.menu;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;

public final class l$b
  implements View.OnAttachStateChangeListener
{
  public l$b(l paraml) {}
  
  public final void onViewAttachedToWindow(View paramView) {}
  
  public final void onViewDetachedFromWindow(View paramView)
  {
    Object localObject = a.x;
    if (localObject != null)
    {
      if (!((ViewTreeObserver)localObject).isAlive()) {
        a.x = paramView.getViewTreeObserver();
      }
      localObject = a;
      x.removeGlobalOnLayoutListener(r);
    }
    paramView.removeOnAttachStateChangeListener(this);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.l.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */