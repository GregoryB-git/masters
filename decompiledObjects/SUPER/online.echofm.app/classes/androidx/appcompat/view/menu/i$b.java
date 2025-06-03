package androidx.appcompat.view.menu;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;

public class i$b
  implements View.OnAttachStateChangeListener
{
  public i$b(i parami) {}
  
  public void onViewAttachedToWindow(View paramView) {}
  
  public void onViewDetachedFromWindow(View paramView)
  {
    Object localObject = o.D;
    if (localObject != null)
    {
      if (!((ViewTreeObserver)localObject).isAlive()) {
        o.D = paramView.getViewTreeObserver();
      }
      localObject = o;
      D.removeGlobalOnLayoutListener(x);
    }
    paramView.removeOnAttachStateChangeListener(this);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.i.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */