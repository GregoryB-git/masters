package x0;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;

public final class u$a
  implements View.OnAttachStateChangeListener
{
  public final void onViewAttachedToWindow(View paramView)
  {
    e0 locale0 = a;
    paramView = c;
    locale0.k();
    r0.m((ViewGroup)mView.getParent(), b.a).l();
  }
  
  public final void onViewDetachedFromWindow(View paramView) {}
}

/* Location:
 * Qualified Name:     x0.u.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */