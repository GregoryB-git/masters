package androidx.appcompat.view.menu;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;

public class b$b
  implements View.OnAttachStateChangeListener
{
  public b$b(b paramb) {}
  
  public void onViewAttachedToWindow(View paramView) {}
  
  public void onViewDetachedFromWindow(View paramView)
  {
    Object localObject = o.M;
    if (localObject != null)
    {
      if (!((ViewTreeObserver)localObject).isAlive()) {
        o.M = paramView.getViewTreeObserver();
      }
      localObject = o;
      M.removeGlobalOnLayoutListener(x);
    }
    paramView.removeOnAttachStateChangeListener(this);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */