package l;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow.OnDismissListener;

public final class z$g$c
  implements PopupWindow.OnDismissListener
{
  public z$g$c(z.g paramg, z.g.b paramb) {}
  
  public final void onDismiss()
  {
    ViewTreeObserver localViewTreeObserver = b.O.getViewTreeObserver();
    if (localViewTreeObserver != null) {
      localViewTreeObserver.removeGlobalOnLayoutListener(a);
    }
  }
}

/* Location:
 * Qualified Name:     l.z.g.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */