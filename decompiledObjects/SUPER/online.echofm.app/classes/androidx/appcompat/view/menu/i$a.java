package androidx.appcompat.view.menu;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import l.I;

public class i$a
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  public i$a(i parami) {}
  
  public void onGlobalLayout()
  {
    if ((o.i()) && (!o.w.n()))
    {
      View localView = o.B;
      if ((localView != null) && (localView.isShown())) {
        o.w.a();
      } else {
        o.dismiss();
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.i.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */