package androidx.appcompat.view.menu;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;

public final class b$b
  implements View.OnAttachStateChangeListener
{
  public b$b(b paramb) {}
  
  public final void onViewAttachedToWindow(View paramView) {}
  
  public final void onViewDetachedFromWindow(View paramView)
  {
    Object localObject = a.G;
    if (localObject != null)
    {
      if (!((ViewTreeObserver)localObject).isAlive()) {
        a.G = paramView.getViewTreeObserver();
      }
      localObject = a;
      G.removeGlobalOnLayoutListener(r);
    }
    paramView.removeOnAttachStateChangeListener(this);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */