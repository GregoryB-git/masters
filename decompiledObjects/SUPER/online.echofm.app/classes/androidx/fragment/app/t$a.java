package androidx.fragment.app;

import I.s;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;

public class t$a
  implements View.OnAttachStateChangeListener
{
  public t$a(t paramt, View paramView) {}
  
  public void onViewAttachedToWindow(View paramView)
  {
    o.removeOnAttachStateChangeListener(this);
    s.A(o);
  }
  
  public void onViewDetachedFromWindow(View paramView) {}
}

/* Location:
 * Qualified Name:     androidx.fragment.app.t.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */