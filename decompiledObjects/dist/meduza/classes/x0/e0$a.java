package x0;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import e0.d0;
import e0.d0.c;

public final class e0$a
  implements View.OnAttachStateChangeListener
{
  public e0$a(View paramView) {}
  
  public final void onViewAttachedToWindow(View paramView)
  {
    a.removeOnAttachStateChangeListener(this);
    View localView = a;
    paramView = d0.a;
    d0.c.c(localView);
  }
  
  public final void onViewDetachedFromWindow(View paramView) {}
}

/* Location:
 * Qualified Name:     x0.e0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */