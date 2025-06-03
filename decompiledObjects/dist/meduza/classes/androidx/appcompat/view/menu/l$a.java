package androidx.appcompat.view.menu;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import l.n0;

public final class l$a
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  public l$a(l paraml) {}
  
  public final void onGlobalLayout()
  {
    if (a.a())
    {
      Object localObject = a;
      if (!q.F)
      {
        localObject = v;
        if ((localObject != null) && (((View)localObject).isShown())) {
          a.q.show();
        } else {
          a.dismiss();
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.l.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */